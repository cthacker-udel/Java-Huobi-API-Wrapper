package InterfaceModel;

import Controller.MarketDataAPI.SwapContractInfo.SwapContractInfo;
import Controller.MarketDataAPI.SwapIndexPrice.SwapIndexPrice;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.TreeMap;

public interface marketInterface {

    @GET("https://api.hbdm.com/swap-api/v1/swap_contract_info")
    Call<SwapContractInfo> querySwapInfo(@QueryMap TreeMap<String,Object> queries);

    @GET("https://api.hbdm.com/swap-api/v1/swap_index")
    Call<SwapIndexPrice> querySwapIndexPrice(@QueryMap TreeMap<String,Object> queries);

}
