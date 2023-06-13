package com.adyen.checkout.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.checkout.core.exception.CheckoutException;
import java.lang.reflect.Array;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class ModelObject implements Parcelable {

    /* loaded from: classes.dex */
    public static class Creator<T extends ModelObject> implements Parcelable.Creator<T> {
        private final Class<T> mClass;

        public Creator(Class<T> cls) {
            this.mClass = cls;
        }

        @Override // android.os.Parcelable.Creator
        public final T createFromParcel(Parcel parcel) {
            try {
                JSONObject readFromParcel = JsonUtils.readFromParcel(parcel);
                if (readFromParcel != null) {
                    return (T) ModelUtils.deserializeModel(readFromParcel, this.mClass);
                }
                throw new CheckoutException("Failed to create ModelObject from parcel. JSONObject is null.");
            } catch (JSONException e) {
                throw new CheckoutException("Failed to create ModelObject from parcel.", e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public T[] newArray(int i) {
            return (T[]) ((ModelObject[]) Array.newInstance((Class<?>) this.mClass, i));
        }
    }

    /* loaded from: classes.dex */
    public interface Serializer<T extends ModelObject> {
        T deserialize(JSONObject jSONObject);

        JSONObject serialize(T t);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }
}
