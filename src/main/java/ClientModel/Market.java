package ClientModel;

import Client.HuobiClient;

import java.util.TreeMap;

public class Market extends HuobiClient {

    private String contractCode;

    private String type;

    public TreeMap<String,Object> generateQueryParams(){

        TreeMap<String,Object> params = new TreeMap<>();
        if(this.contractCode != null){
            params.put("contract_code",this.contractCode);
        }
        if(this.type != null){
            params.put("type",this.type);
        }
        return params;
    }

    public void clearParams(){

        this.contractCode = null;
        this.type = null;

    }


}
