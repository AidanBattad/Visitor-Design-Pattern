package VisitorPattern;

public class Telco implements TelcoSubscription {
    private int dataAllowance;
    private double promoPrice;
    private String telcoName;
    private boolean unliCallText;

    public Telco(int dataAllowance, double promoPrice, String telcoName, boolean unliCallText)
  {
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo promo) 
  {
        return promo.showAllowance(this);
    }

    @Override
    public String accept(UnliCallOffer unli)
  {
        return unli.showUnliCallsTextOffer(this);
    }

    public int getDataAllowance() 
  {
        return dataAllowance;
    }

    public double getPromoPrice() 
  {
        return promoPrice;
    }

    public String getTelcoName() 
  {
        return telcoName;
    }

    public boolean isUnliCallText() 
  {
        return unliCallText;
    }
}
