// {
//     "advertiser_name": 'iHeartMedia',
//     "contact_name": "Stephanie Pugh",
//     "credit_limit": 200.00
// }

package advertisers;

public class Advertiser {

    private final String advertiser_name;
    private final String contact_name;
    private final BigDecimal credit_limit_in_cents;

    public Advertiser(String advertiser_name, String contact_name, BigDecimal credit_limit) {
        this.advertiser_name = advertiser_name;
        this.contact_name = contact_name;
        this.credit_limit_in_cents = credit_limit * 100;
    }

    public String getAdvertiserName() {
        return advertuser_name;
    }

    public String getContactName() {
        return contact_name;
    }

    public String getCreditLimit() {
        return credit_limit_in_cents / 100.0;
    }
}
