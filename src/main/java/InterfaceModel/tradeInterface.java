package InterfaceModel;

import Controller.TradeAPI.BatchOrder.BatchOrder;
import Controller.TradeAPI.CancelOrder.CancelOrder;
import Controller.TradeAPI.OrderDetailsAcquisition.OrderDetailsAcquisition;
import Controller.TradeAPI.OrderDetailsAcquisition.UnfilledOrder.UnfilledOrder;
import Controller.TradeAPI.OrderInfo.OrderInfo;
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

    @POST("https://api.hbdm.com/swap-api/v1/swap_cancel")
    Call<CancelOrder> cancelOrder(@Body TreeMap<String,Object> queries);

    @POST("https://api.hbdm.com/swap-api/v1/swap_cancelall")
    Call<CancelOrder> cancelAllOrders(@Body TreeMap<String,Object> queries);

    @POST("https://api.hbdm.com/swap-api/v1/swap_order_info")
    Call<OrderInfo> getOrderInfo(@Body TreeMap<String,Object> queries);

    @POST("https://api.hbdm.com/swap-api/v1/swap_order_detail")
    Call<OrderDetailsAcquisition> getOrderDetailsAcquisition(@Body TreeMap<String,Object> queries);

    @POST("https://api.hbdm.com/swap-api/v1/swap_openorders")
    Call<UnfilledOrder> getUnfilledOrderAcquisition(@Body TreeMap<String,Object> queries);

}
