package InterfaceModel;

import Controller.TradeAPI.BatchOrder.BatchOrder;
import Controller.TradeAPI.PlaceOrder.PlaceOrder;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

import java.util.TreeMap;

public interface tradeInterface {

    @POST("https://api.hbdm.com/swap-api/v1/swap_order")
    Call<PlaceOrder> placeOrder(@QueryMap TreeMap<String,Object> queries);

    @POST("https://api.hbdm.com/swap-api/v1/swap_batchorder")
    Call<BatchOrder> placeBatchOrder(@Body TreeMap<String,Object> queries);

}
