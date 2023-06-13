package com.adyen.checkout.core.model;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u001c\u0010\f\u001a\u0004\u0018\u00010\u00072\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004H\u0007J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0007¨\u0006\u0011"}, m28432d2 = {"Lcom/adyen/checkout/core/model/JsonUtils;", "", "()V", "parseOptStringList", "", "", "jsonArray", "Lorg/json/JSONArray;", "readFromParcel", "Lorg/json/JSONObject;", "parcel", "Landroid/os/Parcel;", "serializeOptStringList", "stringList", "writeToParcel", "", "jsonObject", "checkout-core_release"}, m28431k = 1, m28430mv = {1, 5, 1}, m28428xi = 48)
/* loaded from: classes.dex */
public final class JsonUtils {
    public static final JsonUtils INSTANCE = new JsonUtils();

    private JsonUtils() {
    }

    @JvmStatic
    public static final List<String> parseOptStringList(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                String optString = jSONArray.optString(i, null);
                if (optString != null) {
                    arrayList.add(optString);
                }
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    @JvmStatic
    public static final JSONObject readFromParcel(Parcel parcel) throws JSONException {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt != 0) {
            if (readInt == 1) {
                String readString = parcel.readString();
                if (readString == null) {
                    readString = "";
                }
                return new JSONObject(readString);
            }
            throw new IllegalArgumentException("Invalid flag.");
        }
        return null;
    }

    @JvmStatic
    public static final JSONArray serializeOptStringList(List<String> list) {
        boolean z;
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : list) {
            String str = (String) obj;
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                arrayList.add(obj);
            }
        }
        for (String str2 : arrayList) {
            jSONArray.put(str2);
        }
        return jSONArray;
    }

    @JvmStatic
    public static final void writeToParcel(Parcel parcel, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (jSONObject == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(jSONObject.toString());
    }
}
