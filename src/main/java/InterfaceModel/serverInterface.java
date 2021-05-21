package InterfaceModel;

import Controller.ServerAPI.ServerStatus.ServerHeartbeat;
import Controller.ServerAPI.ServerStatus.ServerStatus;
import Controller.ServerAPI.ServerStatus.ServerTimestamp;
import retrofit2.Call;
import retrofit2.http.GET;

public interface serverInterface {

    @GET("https://status-swap.huobigroup.com/api/v2/summary.json")
    Call<ServerStatus> getServerStatus();

    @GET("https://api.hbdm.com/heartbeat/")
    Call<ServerHeartbeat> getServerHeartbeat();

    @GET("https://api.hbdm.com/api/v1/timestamp")
    Call<ServerTimestamp> getServerTimestamp();

}
