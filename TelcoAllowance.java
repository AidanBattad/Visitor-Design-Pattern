package VisitorPattern;

public class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(TelcoSubscription telco) 
  {
        return telco.getTelcoName() + " offers a data allowance of " + telco.getDataAllowance() + " GB for ₱" + telco.getPromoPrice() + " per month.";
    }
}
