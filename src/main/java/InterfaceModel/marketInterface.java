package InterfaceModel;

import Controller.MarketDataAPI.KlineData.KlineData;
import Controller.MarketDataAPI.KlineData.MarkPrice.MarkPrice;
import Controller.MarketDataAPI.MarketBBO.MarketBBO;
import Controller.MarketDataAPI.MarketDepth.MarketDepth;
import Controller.MarketDataAPI.MarketOverview.MarketOverview;
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

    @GET("https://api.hbdm.com/swap-ex/market/bbo")
    Call<MarketBBO> queryMarketBBO(@QueryMap TreeMap<String,Object> queries);

    @GET("https://api.hbdm.com/swap-ex/market/history/kline")
    Call<KlineData> queryKlineData(@QueryMap TreeMap<String,Object> queries);

    @GET("https://api.hbdm.com/index/market/history/swap_mark_price_kline")
    Call<MarkPrice> queryKlineMarkPrice(@QueryMap TreeMap<String,Object> queries);

    @GET("https://api.hbdm.com/swap-ex/market/detail/merged")
    Call<MarketOverview> queryMarketOverview(@QueryMap TreeMap<String,Object> queries);

}
