-- Copyright 2013 N. P. Maling
-- 
-- Licensed under the Apache License, Version 2.0 (the "License");
-- you may not use this file except in compliance with the License.
-- You may obtain a copy of the License at
--
-- http://www.apache.org/licenses/LICENSE-2.0
--
-- Unless required by applicable law or agreed to in writing, software
-- distributed under the License is distributed on an "AS IS" BASIS,
-- WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
-- See the License for the specific language governing permissions and
-- limitations under the License.

public class SDpojo {
	private double commission = 0.00;
	private double fee = 0.00;
	private double reimbursement = 0.00;
	private double purchaseprice = 0.00;
	private double shippingcost = 0.00;
	
	/**
	 * @return the commission
	 */
	public double getCommission() {
		return commission;
	}
	/**
	 * @param commission the commission to set
	 */
	public void setCommission(double commission) {
		this.commission = commission;
	}
	/**
	 * @return the fee
	 */
	public double getFee() {
		return fee;
	}
	/**
	 * @param fee the fee to set
	 */
	public void setFee(double fee) {
		this.fee = fee;
	}
	/**
	 * @return the reimbursement
	 */
	public double getReimbursement() {
		return reimbursement;
	}
	/**
	 * @param reimbursement the reimbursement to set
	 */
	public void setReimbursement(double reimbursement) {
		this.reimbursement = reimbursement;
	}
	/**
	 * @return the purchaseprice
	 */
	public double getPurchaseprice() {
		return purchaseprice;
	}
	/**
	 * @param purchaseprice the purchaseprice to set
	 */
	public void setPurchaseprice(double purchaseprice) {
		this.purchaseprice = purchaseprice;
	}
	/**
	 * @return the shippingcost
	 */
	public double getShippingcost() {
		return shippingcost;
	}
	/**
	 * @param shippingcost the shippingcost to set
	 */
	public void setShippingcost(double shippingcost) {
		this.shippingcost = shippingcost;
	}
}
