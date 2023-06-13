package com.adyen.checkout.components.model.paymentmethods;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.model.JsonUtils;
import com.adyen.checkout.core.model.ModelObject;
import com.adyen.checkout.core.model.ModelUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class PaymentMethod extends ModelObject {
    private static final String BRAND = "brand";
    private static final String BRANDS = "brands";
    private static final String CONFIGURATION = "configuration";
    private static final String DETAILS = "details";
    private static final String FUNDING_SOURCE = "fundingSource";
    private static final String ISSUERS = "issuers";
    private static final String NAME = "name";
    private static final String TYPE = "type";
    private String brand;
    private List<String> brands;
    private Configuration configuration;
    private List<InputDetail> details;
    private String fundingSource;
    private List<Issuer> issuers;
    private String name;
    private String type;
    public static final ModelObject.Creator<PaymentMethod> CREATOR = new ModelObject.Creator<>(PaymentMethod.class);
    public static final ModelObject.Serializer<PaymentMethod> SERIALIZER = new ModelObject.Serializer<PaymentMethod>() { // from class: com.adyen.checkout.components.model.paymentmethods.PaymentMethod.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public PaymentMethod deserialize(JSONObject jSONObject) {
            PaymentMethod paymentMethod = new PaymentMethod();
            paymentMethod.setType(jSONObject.optString("type", null));
            paymentMethod.setName(jSONObject.optString("name", null));
            paymentMethod.setBrands(JsonUtils.parseOptStringList(jSONObject.optJSONArray(PaymentMethod.BRANDS)));
            paymentMethod.setBrand(jSONObject.optString("brand", null));
            paymentMethod.setFundingSource(jSONObject.optString(PaymentMethod.FUNDING_SOURCE, null));
            paymentMethod.setIssuers(ModelUtils.deserializeOptList(jSONObject.optJSONArray(PaymentMethod.ISSUERS), Issuer.SERIALIZER));
            paymentMethod.setConfiguration((Configuration) ModelUtils.deserializeOpt(jSONObject.optJSONObject(PaymentMethod.CONFIGURATION), Configuration.SERIALIZER));
            paymentMethod.setDetails(ModelUtils.deserializeOptList(jSONObject.optJSONArray(PaymentMethod.DETAILS), InputDetail.SERIALIZER));
            return paymentMethod;
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public JSONObject serialize(PaymentMethod paymentMethod) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", paymentMethod.getType());
                jSONObject.putOpt("name", paymentMethod.getName());
                jSONObject.putOpt(PaymentMethod.BRANDS, JsonUtils.serializeOptStringList(paymentMethod.getBrands()));
                jSONObject.putOpt("brand", paymentMethod.getBrand());
                jSONObject.putOpt(PaymentMethod.FUNDING_SOURCE, paymentMethod.getFundingSource());
                jSONObject.putOpt(PaymentMethod.ISSUERS, ModelUtils.serializeOptList(paymentMethod.getIssuers(), Issuer.SERIALIZER));
                jSONObject.putOpt(PaymentMethod.CONFIGURATION, ModelUtils.serializeOpt(paymentMethod.getConfiguration(), Configuration.SERIALIZER));
                jSONObject.putOpt(PaymentMethod.DETAILS, ModelUtils.serializeOptList(paymentMethod.getDetails(), InputDetail.SERIALIZER));
                return jSONObject;
            } catch (JSONException e) {
                throw new ModelSerializationException(PaymentMethod.class, e);
            }
        }
    };

    public String getBrand() {
        return this.brand;
    }

    public List<String> getBrands() {
        return this.brands;
    }

    public Configuration getConfiguration() {
        return this.configuration;
    }

    public List<InputDetail> getDetails() {
        return this.details;
    }

    public String getFundingSource() {
        return this.fundingSource;
    }

    public List<Issuer> getIssuers() {
        return this.issuers;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public void setBrand(String str) {
        this.brand = str;
    }

    public void setBrands(List<String> list) {
        this.brands = list;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    public void setDetails(List<InputDetail> list) {
        this.details = list;
    }

    public void setFundingSource(String str) {
        this.fundingSource = str;
    }

    public void setIssuers(List<Issuer> list) {
        this.issuers = list;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JsonUtils.writeToParcel(parcel, SERIALIZER.serialize(this));
    }
}
