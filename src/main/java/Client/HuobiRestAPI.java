package Client;

import Controller.AccountAPI.AccountAssetInformation.AccountAssetInformation;
import Controller.AccountAPI.AccountInformation.AccountInformation;
import Controller.AccountAPI.AssetValuation.AssetValuation;
import Controller.AccountAPI.PositionInformation.AccountPositionInformation;
import Controller.MarketDataAPI.ContractTradeRecordBatch.ContractTradeRecordBatch;
import Controller.MarketDataAPI.KlineData.KlineData;
import Controller.MarketDataAPI.KlineData.MarkPrice.MarkPrice;
import Controller.MarketDataAPI.LastContractTrade.LastContractTrade;
import Controller.MarketDataAPI.MarketBBO.MarketBBO;
import Controller.MarketDataAPI.MarketDepth.MarketDepth;
import Controller.MarketDataAPI.MarketOverview.Batch.MarketDataOverviewBatch;
import Controller.MarketDataAPI.MarketOverview.MarketOverview;
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
import java.util.TreeMap;

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

    public MarketBBO getMarketBBOData(HuobiClient client) throws IOException {

        String url = baseUrl + "/swap-ex/market/bbo/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        marketInterface marketInterface = retrofit.create(InterfaceModel.marketInterface.class);

        Call<MarketBBO> call = marketInterface.queryMarketBBO(client.getMarket().generateQueryParams());

        Response<MarketBBO> response = call.execute();

        return response.body();

    }

    public KlineData queryMarketKlineData(HuobiClient client) throws IOException {

        String url = baseUrl + "/swap-ex/market/history/kline/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        marketInterface marketInterface = retrofit.create(InterfaceModel.marketInterface.class);

        Call<KlineData> call = marketInterface.queryKlineData(client.getMarket().generateQueryParams());

        Response<KlineData> response = call.execute();

        return response.body();

    }

    public MarkPrice queryMarketKlineMarkPrice(HuobiClient client) throws IOException {

        String url = baseUrl + "/index/market/history/swap_mark_price_kline/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        marketInterface marketInterface = retrofit.create(InterfaceModel.marketInterface.class);

        Call<MarkPrice> call = marketInterface.queryKlineMarkPrice(client.getMarket().generateQueryParams());

        Response<MarkPrice> response = call.execute();

        return response.body();

    }

    public MarketOverview queryMarketDataOverview(HuobiClient client) throws IOException {

        String url = baseUrl + "/swap-ex/market/detail/merged/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        marketInterface marketInterface = retrofit.create(InterfaceModel.marketInterface.class);

        Call<MarketOverview> call = marketInterface.queryMarketOverview(client.getMarket().generateQueryParams());

        Response<MarketOverview> response = call.execute();

        return response.body();

    }

    public MarketDataOverviewBatch queryMarketDataOverviewBatch(HuobiClient client) throws IOException {

        String url = baseUrl + "/swap-ex/market/detail/batch_merged/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        marketInterface marketInterface = retrofit.create(InterfaceModel.marketInterface.class);

        Call<MarketDataOverviewBatch> call = marketInterface.queryMarketOverviewBatch(client.getMarket().generateQueryParams());

        Response<MarketDataOverviewBatch> response = call.execute();

        return response.body();

    }

    public LastContractTrade queryLastContractTrade(HuobiClient client) throws IOException {

        String url = baseUrl + "/swap-ex/market/trade/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        marketInterface marketInterface = retrofit.create(InterfaceModel.marketInterface.class);

        Call<LastContractTrade> call = marketInterface.queryLastContractTrade(client.getMarket().generateQueryParams());

        Response<LastContractTrade> response = call.execute();

        return response.body();

    }


    public ContractTradeRecordBatch queryContractTradeRecordHistory(HuobiClient client) throws IOException {

        String url = baseUrl + "/swap-ex/market/history/trade/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        marketInterface marketInterface = retrofit.create(InterfaceModel.marketInterface.class);

        Call<ContractTradeRecordBatch> call = marketInterface.queryContractTradeRecordBatch(client.getMarket().generateQueryParams());

        Response<ContractTradeRecordBatch> response = call.execute();

        return response.body();
    }

    /*

    Account API

     */
    
    public AssetValuation queryAssetValuation(HuobiClient client) throws IOException {
        
        String url = baseUrl + "/swap-api/v1/swap_balance_valuation/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        accountInterface accountInterface = retrofit.create(InterfaceModel.accountInterface.class);

        TreeMap<String,Object> queries = client.getAccount().generate_queries();

        queries.put("signature",client.getAuth().createSignature("POST","https://api.hbdm.com/swap-api/v1/swap_balance_valuation",queries));

        Call<AssetValuation> call = accountInterface.queryAssetValuation(queries);


        Response<AssetValuation> response = call.execute();

        return response.body();

    }


    public AccountInformation queryAccountInformation(HuobiClient client) throws IOException {

        String url = baseUrl + "/swap-api/v1/swap_account_info/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        accountInterface accountInterface = retrofit.create(InterfaceModel.accountInterface.class);

        TreeMap<String,Object> queries = client.getAccount().generate_queries();

        queries.put("signature",client.getAuth().createSignature("POST","https://api.hbdm.com/swap-api/v1/swap_account_info",queries));

        Call<AccountInformation> call = accountInterface.queryAccountInformation(queries);

        Response<AccountInformation> response = call.execute();

        return response.body();

    }

    public AccountPositionInformation queryUserPositionInformation(HuobiClient client) throws IOException {

        String url = baseUrl + "/swap-api/v1/swap_position_info/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        accountInterface accountInterface = retrofit.create(InterfaceModel.accountInterface.class);

        TreeMap<String,Object> queries = client.getAccount().generate_queries();

        queries.put("signature",client.getAuth().createSignature("POST","https://api.hbdm.com/swap-api/v1/swap_position_info",queries));

        Call<AccountPositionInformation> call = accountInterface.queryAccountPositionInformation(queries);

        Response<AccountPositionInformation> response = call.execute();

        return response.body();

    }

    public AccountAssetInformation queryUserAssets(HuobiClient client) throws IOException {

        String url = baseUrl + "/swap-api/v1/swap_account_position_info/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        accountInterface accountInterface = retrofit.create(InterfaceModel.accountInterface.class);

        TreeMap<String,Object> queries = client.getAccount().generate_queries();

        queries.put("signature",client.getAuth().createSignature("POST","https://api.hbdm.com/swap-api/v1/swap_account_position_info",queries));

        Call<AccountAssetInformation> call = accountInterface.queryAccountAssetInformation(queries);

        Response<AccountAssetInformation> response = call.execute();

        return response.body();

    }












}
