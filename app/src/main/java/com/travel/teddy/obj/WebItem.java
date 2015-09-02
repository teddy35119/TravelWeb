package com.travel.teddy.obj;

import java.util.Date;
import java.util.UUID;

/**
 * Created by teddy on 2015/9/2.
 */
public class WebItem {

    private String Id;
    private String LocationId;
    private String CategoryId;
    private String Title;
    private String Url;
    private Date UpdateTime;


    public WebItem(){
        this.Id = UUID.randomUUID().toString();
        this.LocationId = "";
        this.CategoryId = "";
        this.Title = "";
        this.Url = "";
        this.UpdateTime = new Date();

    }
    public WebItem(String Id,String LocationId,String CategoryId,String Title,String Url,Date UpdateTime){
        this.Id = Id;
        this.LocationId = LocationId;
        this.CategoryId = CategoryId;
        this.Title = Title;
        this.Url = Url;
        this.UpdateTime = UpdateTime;
    }

}
