package xyz.aungpyaephyo.padc.myanmarattractions.data.agents.retrofit;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import xyz.aungpyaephyo.padc.myanmarattractions.data.responses.AttractionListResponse;
import xyz.aungpyaephyo.padc.myanmarattractions.utils.MyanmarAttractionsConstants;

/**
 * Created by aung on 7/9/16.
 */
public interface AttractionApi {

    @FormUrlEncoded
    @POST(MyanmarAttractionsConstants.API_GET_ATTRACTION_LIST)  //@POST type of call method
        // parameter name of api
    Call<AttractionListResponse> loadAttractions(  //if parsed json will return AttratinListResponse coz of api
            @Field(MyanmarAttractionsConstants.PARAM_ACCESS_TOKEN) String param);  //request parameter

    //if u need another request @Field(MyanmarAttractionsConstants.PARAM_ACCESS_TOKEN) String param); like this and change some function
    //retrofit dataagent in some function
}
