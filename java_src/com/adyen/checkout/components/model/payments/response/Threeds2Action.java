package com.adyen.checkout.components.model.payments.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.model.JsonUtils;
import com.adyen.checkout.core.model.JsonUtilsKt;
import com.adyen.checkout.core.model.ModelObject;
import com.adyen.checkout.core.model.ModelUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0013"}, m28432d2 = {"Lcom/adyen/checkout/components/model/payments/response/Threeds2Action;", "Lcom/adyen/checkout/components/model/payments/response/Action;", Threeds2Action.TOKEN, "", Threeds2Action.SUBTYPE, Threeds2Action.AUTHORISATION_TOKEN, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthorisationToken", "()Ljava/lang/String;", "getSubtype", "getToken", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Companion", "SubType", "components-core_release"}, m28431k = 1, m28430mv = {1, 5, 1}, m28428xi = 48)
/* loaded from: classes.dex */
public final class Threeds2Action extends Action {
    public static final String ACTION_TYPE = "threeDS2";
    private static final String AUTHORISATION_TOKEN = "authorisationToken";
    private static final String SUBTYPE = "subtype";
    private static final String TOKEN = "token";
    private final String authorisationToken;
    private final String subtype;
    private final String token;
    public static final Companion Companion = new Companion(null);
    @JvmField
    public static final Parcelable.Creator<Threeds2Action> CREATOR = new ModelObject.Creator(Threeds2Action.class);
    @JvmField
    public static final ModelObject.Serializer<Threeds2Action> SERIALIZER = new ModelObject.Serializer<Threeds2Action>() { // from class: com.adyen.checkout.components.model.payments.response.Threeds2Action$Companion$SERIALIZER$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public Threeds2Action deserialize(JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            try {
                Threeds2Action threeds2Action = new Threeds2Action(JsonUtilsKt.getStringOrNull(jsonObject, "token"), JsonUtilsKt.getStringOrNull(jsonObject, "subtype"), JsonUtilsKt.getStringOrNull(jsonObject, "authorisationToken"));
                threeds2Action.setType(JsonUtilsKt.getStringOrNull(jsonObject, "type"));
                threeds2Action.setPaymentData(JsonUtilsKt.getStringOrNull(jsonObject, Action.PAYMENT_DATA));
                threeds2Action.setPaymentMethodType(JsonUtilsKt.getStringOrNull(jsonObject, Action.PAYMENT_METHOD_TYPE));
                return threeds2Action;
            } catch (JSONException e) {
                throw new ModelSerializationException(Threeds2Action.class, e);
            }
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public JSONObject serialize(Threeds2Action modelObject) {
            Intrinsics.checkNotNullParameter(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt(Action.PAYMENT_DATA, modelObject.getPaymentData());
                jSONObject.putOpt(Action.PAYMENT_METHOD_TYPE, modelObject.getPaymentMethodType());
                jSONObject.putOpt("token", modelObject.getToken());
                jSONObject.putOpt("subtype", modelObject.getSubtype());
                jSONObject.putOpt("authorisationToken", modelObject.getAuthorisationToken());
                return jSONObject;
            } catch (JSONException e) {
                throw new ModelSerializationException(Threeds2Action.class, e);
            }
        }
    };

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m28432d2 = {"Lcom/adyen/checkout/components/model/payments/response/Threeds2Action$Companion;", "", "()V", "ACTION_TYPE", "", "AUTHORISATION_TOKEN", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/adyen/checkout/components/model/payments/response/Threeds2Action;", ModelUtils.SERIALIZER_FIELD_NAME, "Lcom/adyen/checkout/core/model/ModelObject$Serializer;", "SUBTYPE", "TOKEN", "components-core_release"}, m28431k = 1, m28430mv = {1, 5, 1}, m28428xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m28432d2 = {"Lcom/adyen/checkout/components/model/payments/response/Threeds2Action$SubType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "FINGERPRINT", "CHALLENGE", "Companion", "components-core_release"}, m28431k = 1, m28430mv = {1, 5, 1}, m28428xi = 48)
    /* loaded from: classes.dex */
    public enum SubType {
        FINGERPRINT("fingerprint"),
        CHALLENGE("challenge");
        
        public static final Companion Companion = new Companion(null);
        private final String value;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m28432d2 = {"Lcom/adyen/checkout/components/model/payments/response/Threeds2Action$SubType$Companion;", "", "()V", "parse", "Lcom/adyen/checkout/components/model/payments/response/Threeds2Action$SubType;", "value", "", "components-core_release"}, m28431k = 1, m28430mv = {1, 5, 1}, m28428xi = 48)
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final SubType parse(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                SubType subType = SubType.FINGERPRINT;
                if (!Intrinsics.areEqual(value, subType.getValue())) {
                    subType = SubType.CHALLENGE;
                    if (!Intrinsics.areEqual(value, subType.getValue())) {
                        throw new IllegalArgumentException(Intrinsics.stringPlus("No Subtype matches the value of: ", value));
                    }
                }
                return subType;
            }

            private Companion() {
            }
        }

        SubType(String str) {
            this.value = str;
        }

        @JvmStatic
        public static final SubType parse(String str) {
            return Companion.parse(str);
        }

        public final String getValue() {
            return this.value;
        }
    }

    public Threeds2Action() {
        this(null, null, null, 7, null);
    }

    public final String getAuthorisationToken() {
        return this.authorisationToken;
    }

    public final String getSubtype() {
        return this.subtype;
    }

    public final String getToken() {
        return this.token;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        JsonUtils.writeToParcel(dest, SERIALIZER.serialize(this));
    }

    public /* synthetic */ Threeds2Action(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public Threeds2Action(String str, String str2, String str3) {
        this.token = str;
        this.subtype = str2;
        this.authorisationToken = str3;
    }
}
