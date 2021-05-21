package ClientModel;

import Client.HuobiClient;

import java.util.TreeMap;

public class Market extends HuobiClient {

    private String contractCode;

    public TreeMap<String,Object> generateQueryParams(){

        TreeMap<String,Object> params = new TreeMap<>();
        if(this.contractCode != null){
            params.put("contract_code",this.contractCode);
        }
        return params;
    }

    public void clearParams(){

        this.contractCode = null;

    }


}
