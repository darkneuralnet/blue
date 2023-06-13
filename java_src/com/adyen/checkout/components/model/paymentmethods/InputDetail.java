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
public final class InputDetail extends ModelObject {
    private static final String ITEMS = "items";
    private List<Item> items;
    public static final ModelObject.Creator<InputDetail> CREATOR = new ModelObject.Creator<>(InputDetail.class);
    public static final ModelObject.Serializer<InputDetail> SERIALIZER = new ModelObject.Serializer<InputDetail>() { // from class: com.adyen.checkout.components.model.paymentmethods.InputDetail.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public InputDetail deserialize(JSONObject jSONObject) {
            InputDetail inputDetail = new InputDetail();
            inputDetail.setItems(ModelUtils.deserializeOptList(jSONObject.optJSONArray(InputDetail.ITEMS), Item.SERIALIZER));
            return inputDetail;
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public JSONObject serialize(InputDetail inputDetail) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(InputDetail.ITEMS, ModelUtils.serializeOptList(inputDetail.getItems(), Item.SERIALIZER));
                return jSONObject;
            } catch (JSONException e) {
                throw new ModelSerializationException(InputDetail.class, e);
            }
        }
    };

    public List<Item> getItems() {
        return this.items;
    }

    public void setItems(List<Item> list) {
        this.items = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JsonUtils.writeToParcel(parcel, SERIALIZER.serialize(this));
    }
}
