package Client;

import ClientModel.Market;

public class HuobiClient extends HuobiRestAPI{

    HuobiAuth auth;
    Market market;

    public HuobiClient(){
        super();
    }

    public HuobiClient(String apiKey, String secretKey){
        auth = new HuobiAuth(apiKey,secretKey);
        market = new Market();
    }

    public HuobiAuth getAuth() {
        return auth;
    }

    public void setAuth(HuobiAuth auth) {
        this.auth = auth;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }
}
