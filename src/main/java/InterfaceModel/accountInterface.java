package InterfaceModel;

import Controller.AccountAPI.AccountInformation.AccountInformation;
import Controller.AccountAPI.AssetValuation.AssetValuation;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

import java.util.TreeMap;

public interface accountInterface {

    @POST("https://api.hbdm.com/swap-api/v1/swap_balance_valuation")
    Call<AssetValuation> queryAssetValuation(@Body TreeMap<String,Object> body);

    @POST("https://api.hbdm.com/swap-api/v1/swap_account_info")
    Call<AccountInformation> queryAccountInformation(@Body TreeMap<String,Object> body);

}
