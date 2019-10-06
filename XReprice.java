/* Copyright 2013 N. P. Maling

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

public class XReprice {
	XReprice(SDpojo sd) {	
		reprice(sd);
	}

	static void reprice(SDpojo sd) {
		double netgoal = 0.00;
		double costs = ((sd.getFee() + sd.getPurchaseprice() + sd.getShippingcost()) - sd.getReimbursement());
		double orprice = sd.getPurchaseprice();
		double sellcost = 0.00;

		do {
			orprice = (orprice + 0.01);
			sellcost = ((orprice * sd.getCommission()) + costs);
			netgoal  = (orprice - sellcost);
		} while (netgoal < sd.getPurchaseprice());

		System.out.printf("Asking Price: %8.2f\n", orprice);
		System.out.printf("Static Costs: %8.2f\n", costs);
		System.out.printf("Selling Cost: %8.2f\n", sellcost);
	}
}
