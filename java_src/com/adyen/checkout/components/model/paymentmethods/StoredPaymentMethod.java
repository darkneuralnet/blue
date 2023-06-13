package com.adyen.checkout.components.model.paymentmethods;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.model.JsonUtils;
import com.adyen.checkout.core.model.ModelObject;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class StoredPaymentMethod extends ModelObject {
    private static final String BRAND = "brand";
    private static final String ECOMMERCE = "Ecommerce";
    private static final String EXPIRY_MONTH = "expiryMonth";
    private static final String EXPIRY_YEAR = "expiryYear";
    private static final String HOLDER_NAME = "holderName";

    /* renamed from: ID */
    private static final String f68413ID = "id";
    private static final String LAST_FOUR = "lastFour";
    private static final String NAME = "name";
    private static final String SHOPPER_EMAIL = "shopperEmail";
    private static final String SUPPORTED_SHOPPER_INTERACTIONS = "supportedShopperInteractions";
    private static final String TYPE = "type";
    private String brand;
    private String expiryMonth;
    private String expiryYear;
    private String holderName;

    /* renamed from: id */
    private String f68414id;
    private String lastFour;
    private String name;
    private String shopperEmail;
    private List<String> supportedShopperInteractions = Collections.emptyList();
    private String type;
    public static final ModelObject.Creator<StoredPaymentMethod> CREATOR = new ModelObject.Creator<>(StoredPaymentMethod.class);
    public static final ModelObject.Serializer<StoredPaymentMethod> SERIALIZER = new ModelObject.Serializer<StoredPaymentMethod>() { // from class: com.adyen.checkout.components.model.paymentmethods.StoredPaymentMethod.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public StoredPaymentMethod deserialize(JSONObject jSONObject) {
            StoredPaymentMethod storedPaymentMethod = new StoredPaymentMethod();
            storedPaymentMethod.setType(jSONObject.optString("type"));
            storedPaymentMethod.setName(jSONObject.optString("name"));
            storedPaymentMethod.setBrand(jSONObject.optString("brand"));
            storedPaymentMethod.setExpiryMonth(jSONObject.optString(StoredPaymentMethod.EXPIRY_MONTH));
            storedPaymentMethod.setExpiryYear(jSONObject.optString(StoredPaymentMethod.EXPIRY_YEAR));
            storedPaymentMethod.setHolderName(jSONObject.optString(StoredPaymentMethod.HOLDER_NAME));
            storedPaymentMethod.setId(jSONObject.optString("id"));
            storedPaymentMethod.setLastFour(jSONObject.optString(StoredPaymentMethod.LAST_FOUR));
            storedPaymentMethod.setShopperEmail(jSONObject.optString(StoredPaymentMethod.SHOPPER_EMAIL));
            List<String> parseOptStringList = JsonUtils.parseOptStringList(jSONObject.optJSONArray(StoredPaymentMethod.SUPPORTED_SHOPPER_INTERACTIONS));
            if (parseOptStringList != null) {
                storedPaymentMethod.setSupportedShopperInteractions(parseOptStringList);
            }
            return storedPaymentMethod;
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public JSONObject serialize(StoredPaymentMethod storedPaymentMethod) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", storedPaymentMethod.getType());
                jSONObject.putOpt("name", storedPaymentMethod.getName());
                jSONObject.putOpt("brand", storedPaymentMethod.getBrand());
                jSONObject.putOpt(StoredPaymentMethod.EXPIRY_MONTH, storedPaymentMethod.getExpiryMonth());
                jSONObject.putOpt(StoredPaymentMethod.EXPIRY_YEAR, storedPaymentMethod.getExpiryYear());
                jSONObject.putOpt(StoredPaymentMethod.HOLDER_NAME, storedPaymentMethod.getHolderName());
                jSONObject.putOpt("id", storedPaymentMethod.getId());
                jSONObject.putOpt(StoredPaymentMethod.LAST_FOUR, storedPaymentMethod.getLastFour());
                jSONObject.putOpt(StoredPaymentMethod.SHOPPER_EMAIL, storedPaymentMethod.getShopperEmail());
                jSONObject.putOpt(StoredPaymentMethod.SUPPORTED_SHOPPER_INTERACTIONS, new JSONArray((Collection) storedPaymentMethod.getSupportedShopperInteractions()));
                return jSONObject;
            } catch (JSONException e) {
                throw new ModelSerializationException(StoredPaymentMethod.class, e);
            }
        }
    };

    public String getBrand() {
        return this.brand;
    }

    public String getExpiryMonth() {
        return this.expiryMonth;
    }

    public String getExpiryYear() {
        return this.expiryYear;
    }

    public String getHolderName() {
        return this.holderName;
    }

    public String getId() {
        return this.f68414id;
    }

    public String getLastFour() {
        return this.lastFour;
    }

    public String getName() {
        return this.name;
    }

    public String getShopperEmail() {
        return this.shopperEmail;
    }

    public List<String> getSupportedShopperInteractions() {
        return this.supportedShopperInteractions;
    }

    public String getType() {
        return this.type;
    }

    public boolean isEcommerce() {
        return this.supportedShopperInteractions.contains(ECOMMERCE);
    }

    public void setBrand(String str) {
        this.brand = str;
    }

    public void setExpiryMonth(String str) {
        this.expiryMonth = str;
    }

    public void setExpiryYear(String str) {
        this.expiryYear = str;
    }

    public void setHolderName(String str) {
        this.holderName = str;
    }

    public void setId(String str) {
        this.f68414id = str;
    }

    public void setLastFour(String str) {
        this.lastFour = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setShopperEmail(String str) {
        this.shopperEmail = str;
    }

    public void setSupportedShopperInteractions(List<String> list) {
        this.supportedShopperInteractions = list;
    }

    public void setType(String str) {
        this.type = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JsonUtils.writeToParcel(parcel, SERIALIZER.serialize(this));
    }
}
