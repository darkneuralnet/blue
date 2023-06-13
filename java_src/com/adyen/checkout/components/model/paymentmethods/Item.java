package com.adyen.checkout.components.model.paymentmethods;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.model.JsonUtils;
import com.adyen.checkout.core.model.ModelObject;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class Item extends ModelObject {

    /* renamed from: ID */
    private static final String f68411ID = "id";
    private static final String NAME = "name";

    /* renamed from: id */
    private String f68412id;
    private String name;
    public static final ModelObject.Creator<Item> CREATOR = new ModelObject.Creator<>(Item.class);
    public static final ModelObject.Serializer<Item> SERIALIZER = new ModelObject.Serializer<Item>() { // from class: com.adyen.checkout.components.model.paymentmethods.Item.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public Item deserialize(JSONObject jSONObject) {
            Item item = new Item();
            item.setId(jSONObject.optString("id", null));
            item.setName(jSONObject.optString("name", null));
            return item;
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public JSONObject serialize(Item item) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("id", item.getId());
                jSONObject.putOpt("name", item.getName());
                return jSONObject;
            } catch (JSONException e) {
                throw new ModelSerializationException(Item.class, e);
            }
        }
    };

    public String getId() {
        return this.f68412id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(String str) {
        this.f68412id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JsonUtils.writeToParcel(parcel, SERIALIZER.serialize(this));
    }
}
