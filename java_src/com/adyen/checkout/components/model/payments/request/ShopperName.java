package com.adyen.checkout.components.model.payments.request;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.model.JsonUtils;
import com.adyen.checkout.core.model.ModelObject;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ShopperName extends ModelObject {
    private static final String FIRST_NAME = "firstName";
    private static final String GENDER = "gender";
    private static final String INFIX = "infix";
    private static final String LAST_NAME = "lastName";
    private String firstName;
    private String gender;
    private String infix;
    private String lastName;
    public static final ModelObject.Creator<ShopperName> CREATOR = new ModelObject.Creator<>(ShopperName.class);
    public static final ModelObject.Serializer<ShopperName> SERIALIZER = new ModelObject.Serializer<ShopperName>() { // from class: com.adyen.checkout.components.model.payments.request.ShopperName.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public ShopperName deserialize(JSONObject jSONObject) {
            ShopperName shopperName = new ShopperName();
            shopperName.setFirstName(jSONObject.optString(ShopperName.FIRST_NAME, null));
            shopperName.setInfix(jSONObject.optString(ShopperName.INFIX, null));
            shopperName.setLastName(jSONObject.optString(ShopperName.LAST_NAME, null));
            shopperName.setGender(jSONObject.optString(ShopperName.GENDER, null));
            return shopperName;
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public JSONObject serialize(ShopperName shopperName) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(ShopperName.FIRST_NAME, shopperName.getFirstName());
                jSONObject.putOpt(ShopperName.INFIX, shopperName.getInfix());
                jSONObject.putOpt(ShopperName.LAST_NAME, shopperName.getLastName());
                jSONObject.putOpt(ShopperName.GENDER, shopperName.getGender());
                return jSONObject;
            } catch (JSONException e) {
                throw new ModelSerializationException(ShopperName.class, e);
            }
        }
    };

    public String getFirstName() {
        return this.firstName;
    }

    public String getGender() {
        return this.gender;
    }

    public String getInfix() {
        return this.infix;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setFirstName(String str) {
        this.firstName = str;
    }

    public void setGender(String str) {
        this.gender = str;
    }

    public void setInfix(String str) {
        this.infix = str;
    }

    public void setLastName(String str) {
        this.lastName = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JsonUtils.writeToParcel(parcel, SERIALIZER.serialize(this));
    }
}
