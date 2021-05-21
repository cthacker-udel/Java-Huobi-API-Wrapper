package Client;

import Controller.ServerAPI.ServerStatus.ServerHeartbeat;
import Controller.ServerAPI.ServerStatus.ServerStatus;
import Controller.ServerAPI.ServerStatus.ServerTimestamp;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import InterfaceModel.*;

import java.io.IOException;

public class HuobiRestAPI {

    public static String baseUrl = "https://api.hbdm.com";


    /*

    Server Requests

     */


    public ServerStatus getSystemStatus() throws IOException {

        String url = "https://status-swap.huobigroup.com/api/v2/summary.json/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        serverInterface serverInterface = retrofit.create(InterfaceModel.serverInterface.class);

        Call<ServerStatus> call = serverInterface.getServerStatus();

        Response<ServerStatus> response = call.execute();

        return response.body();
    }

    public ServerHeartbeat getServerHeartbeat() throws IOException {

        String url = "https://api.hdbm.com/heartbeat/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        serverInterface serverInterface = retrofit.create(InterfaceModel.serverInterface.class);

        Call<ServerHeartbeat> call = serverInterface.getServerHeartbeat();

        Response<ServerHeartbeat> response = call.execute();

        return response.body();

    }

    public ServerTimestamp getServerTimestamp() throws IOException {

        String url = "https://api.hbdm.com/api/v1/timestamp/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        serverInterface serverInterface = retrofit.create(InterfaceModel.serverInterface.class);

        Call<ServerTimestamp> call = serverInterface.getServerTimestamp();

        Response<ServerTimestamp> response = call.execute();

        return response.body();

    }



}