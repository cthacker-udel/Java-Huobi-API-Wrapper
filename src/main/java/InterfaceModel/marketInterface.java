package InterfaceModel;

import Controller.MarketDataAPI.SwapContractInfo.SwapContractInfo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.TreeMap;

public interface marketInterface {

    @GET("https://api.hdbm.com/swap-api/v1/swap_contract_info")
    Call<SwapContractInfo> querySwapInfo(@QueryMap TreeMap<String,Object> queries);

}
