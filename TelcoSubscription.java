package VisitorPattern;

public interface TelcoSubscription
  {
    String accept(UsagePromo promo);
    String accept(UnliCallOffer unli);
}
