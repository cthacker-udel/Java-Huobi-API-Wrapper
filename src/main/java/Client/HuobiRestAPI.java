package Client;

import Controller.MarketDataAPI.MarketDepth.MarketDepth;
import Controller.MarketDataAPI.SwapContractInfo.SwapContractInfo;
import Controller.MarketDataAPI.SwapIndexPrice.SwapIndexPrice;
import Controller.MarketDataAPI.SwapInterestInfo.SwapInterestInfo;
import Controller.MarketDataAPI.SwapPriceLimit.SwapPriceLimit;
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

    /*

    Swap Market API

     */

    public SwapContractInfo querySwapInfo(HuobiClient client) throws IOException {

        String url = baseUrl + "/swap-api/v1/swap_contract_info/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        marketInterface marketInterface = retrofit.create(InterfaceModel.marketInterface.class);

        Call<SwapContractInfo> call = marketInterface.querySwapInfo(client.getMarket().generateQueryParams());

        Response<SwapContractInfo> response = call.execute();

        return response.body();

    }

    public SwapIndexPrice querySwapIndexPrice(HuobiClient client) throws IOException {

        String url = baseUrl + "/swap-api/v1/swap_index/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        marketInterface marketInterface = retrofit.create(InterfaceModel.marketInterface.class);

        Call<SwapIndexPrice> call = marketInterface.querySwapIndexPrice(client.getMarket().generateQueryParams());

        Response<SwapIndexPrice> response = call.execute();

        return response.body();

    }

    public SwapPriceLimit querySwapPriceLimit(HuobiClient client) throws IOException {

        String url = baseUrl + "/swap-api/v1/swap_price_limit/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        marketInterface marketInterface = retrofit.create(InterfaceModel.marketInterface.class);

        Call<SwapPriceLimit> call = marketInterface.querySwapPriceLimit(client.getMarket().generateQueryParams());

        Response<SwapPriceLimit> response = call.execute();

        return response.body();
    }

    public SwapInterestInfo querySwapInterestInfo(HuobiClient client) throws IOException {

        String url = baseUrl + "/swap-api/v1/swap_open_interest/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        marketInterface marketInterface = retrofit.create(InterfaceModel.marketInterface.class);

        Call<SwapInterestInfo> call = marketInterface.querySwapInterestInfo(client.getMarket().generateQueryParams());

        Response<SwapInterestInfo> response = call.execute();

        return response.body();

    }


    public MarketDepth getMarketDepth(HuobiClient client) throws IOException {

        String url = baseUrl + "/swap-ex/market/depth/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        marketInterface marketInterface = retrofit.create(InterfaceModel.marketInterface.class);

        Call<MarketDepth> call = marketInterface.queryMarketDepth(client.getMarket().generateQueryParams());

        Response<MarketDepth> response = call.execute();

        return response.body();

    }







}
