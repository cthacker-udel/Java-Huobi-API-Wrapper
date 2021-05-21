package Client;

public class HuobiClient extends HuobiRestAPI{

    HuobiAuth auth;

    public HuobiClient(){
        super();
    }

    public HuobiClient(String apiKey, String secretKey){
        auth = new HuobiAuth(apiKey,secretKey);
    }

}
