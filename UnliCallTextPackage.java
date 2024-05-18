package VisitorPattern;

public class UnliCallTextPackage implements UnliCallOffer {
    @Override
    public String showUnliCallsTextOffer(TelcoSubscription telco)
  {
        if (telco.isUnliCallText())
        {
            return telco.getTelcoName() + " offers unlimited calls and texts to all networks within the country.";
        } else
        {
            return telco.getTelcoName() + " doesn't offer unlimited calls and texts.";
        }
    }}
