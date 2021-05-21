package InterfaceModel;

import Controller.MarketDataAPI.MarketDepth.MarketDepth;
import Controller.MarketDataAPI.SwapContractInfo.SwapContractInfo;
import Controller.MarketDataAPI.SwapIndexPrice.SwapIndexPrice;
import Controller.MarketDataAPI.SwapInterestInfo.SwapInterestInfo;
import Controller.MarketDataAPI.SwapPriceLimit.SwapPriceLimit;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.TreeMap;

public interface marketInterface {

    @GET("https://api.hbdm.com/swap-api/v1/swap_contract_info")
    Call<SwapContractInfo> querySwapInfo(@QueryMap TreeMap<String,Object> queries);

    @GET("https://api.hbdm.com/swap-api/v1/swap_index")
    Call<SwapIndexPrice> querySwapIndexPrice(@QueryMap TreeMap<String,Object> queries);

    @GET("https://api.hbdm.com/swap-api/v1/swap_price_limit")
    Call<SwapPriceLimit> querySwapPriceLimit(@QueryMap TreeMap<String,Object> queries);

    @GET("https://api.hbdm.com/swap-api/v1/swap_open_interest")
    Call<SwapInterestInfo> querySwapInterestInfo(@QueryMap TreeMap<String,Object> queries);

    @GET("https://api.hbdm.com/swap-ex/market/depth")
    Call<MarketDepth> queryMarketDepth(@QueryMap TreeMap<String,Object> queries);

}
