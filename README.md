# XReprice
Simple repricing algorithm for calculating online retail prices

Originally part of a rather complex Perl system used for maintaining Amazon, eBay and other site inventory.

Usage:
	SellData commission fee reimbursement purchaseprice shippingcost

If there is no reimbursement or other cost to enter, enter 0.00 for the value.

commission is the cut taken by the platform sold on, as is any fee

reimbursement is any amount you get back from the platform sold on

purchaseprice is what you paid for the item

shippingcost is what it actually costs you to ship in terms of postage and packaging fees/costs
