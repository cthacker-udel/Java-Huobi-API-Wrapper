package ClientModel;

import Client.HuobiClient;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class Trade extends HuobiClient {

    private String contractCode;
    private Long clientOrderId;
    private Double price;
    private Long volume;
    private String direction;
    private String offset;
    private Integer leverRate;
    private String orderPriceType;
    private Double tpTriggerPrice;
    private Double tpOrderPrice;
    private String tpOrderPriceType;
    private Double slTriggerPrice;
    private Double slOrderPrice;
    private String slOrderPriceType;
    private List<Object> orders_data = new LinkedList<>();
    private String orderId;


    public TreeMap<String,Object> generateQueries(){

        TreeMap<String,Object> queries = new TreeMap<>();
        if(this.contractCode != null){
            queries.put("contract_code",this.contractCode);
        }
        if(this.clientOrderId != null){
            queries.put("client_order_id",this.clientOrderId);
        }
        if(this.price != null){
            queries.put("price",this.price);
        }
        if(this.volume != null){
            queries.put("volume",this.volume);
        }
        if(this.direction != null){
            queries.put("direction",this.direction);
        }
        if(this.offset != null){
            queries.put("offset",this.offset);
        }
        if(this.leverRate != null){
            queries.put("lever_rate",this.leverRate);
        }
        if(this.orderPriceType != null){
            queries.put("order_price_type",this.orderPriceType);
        }
        if(this.tpTriggerPrice != null){
            queries.put("tp_trigger_price",this.tpTriggerPrice);
        }
        if(this.tpOrderPrice != null){
            queries.put("tp_order_price",this.tpOrderPrice);
        }
        if(this.tpOrderPriceType != null){
            queries.put("tp_order_price_type",this.tpOrderPriceType);
        }
        if(this.slTriggerPrice != null){
            queries.put("sl_trigger_price",this.slTriggerPrice);
        }
        if(this.slOrderPrice != null){
            queries.put("sl_order_price",this.slOrderPrice);
        }
        if(this.slOrderPriceType != null){
            queries.put("sl_order_price_type",this.slOrderPriceType);
        }
        if(this.orders_data.size() > 0){
            queries.put("orders_data",this.orders_data);
        }
        if(this.orderId != null){
            queries.put("order_id", this.orderId);
        }
        return queries;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public Long getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(Long clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public Integer getLeverRate() {
        return leverRate;
    }

    public void setLeverRate(Integer leverRate) {
        this.leverRate = leverRate;
    }

    public String getOrderPriceType() {
        return orderPriceType;
    }

    public void setOrderPriceType(String orderPriceType) {
        this.orderPriceType = orderPriceType;
    }

    public Double getTpTriggerPrice() {
        return tpTriggerPrice;
    }

    public void setTpTriggerPrice(Double tpTriggerPrice) {
        this.tpTriggerPrice = tpTriggerPrice;
    }

    public Double getTpOrderPrice() {
        return tpOrderPrice;
    }

    public void setTpOrderPrice(Double tpOrderPrice) {
        this.tpOrderPrice = tpOrderPrice;
    }

    public String getTpOrderPriceType() {
        return tpOrderPriceType;
    }

    public void setTpOrderPriceType(String tpOrderPriceType) {
        this.tpOrderPriceType = tpOrderPriceType;
    }

    public Double getSlTriggerPrice() {
        return slTriggerPrice;
    }

    public void setSlTriggerPrice(Double slTriggerPrice) {
        this.slTriggerPrice = slTriggerPrice;
    }

    public Double getSlOrderPrice() {
        return slOrderPrice;
    }

    public void setSlOrderPrice(Double slOrderPrice) {
        this.slOrderPrice = slOrderPrice;
    }

    public String getSlOrderPriceType() {
        return slOrderPriceType;
    }

    public void setSlOrderPriceType(String slOrderPriceType) {
        this.slOrderPriceType = slOrderPriceType;
    }
}
