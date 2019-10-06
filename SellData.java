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

public class SellData {
	static SDpojo pojo = new SDpojo();
	
	public static void main(String[] args) {
		pojo.setCommission(Double.parseDouble(args[0]));
		pojo.setFee(Double.parseDouble(args[1]));
		pojo.setReimbursement(Double.parseDouble(args[2]));
		pojo.setPurchaseprice(Double.parseDouble(args[3]));
		pojo.setShippingcost(Double.parseDouble(args[4]));
		
		XReprice.reprice(pojo);
	}
}
