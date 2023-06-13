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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, m28432d2 = {"Lcom/adyen/checkout/components/model/payments/response/Threeds2ChallengeAction;", "Lcom/adyen/checkout/components/model/payments/response/Action;", Threeds2ChallengeAction.TOKEN, "", "(Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Companion", "components-core_release"}, m28431k = 1, m28430mv = {1, 5, 1}, m28428xi = 48)
/* loaded from: classes.dex */
public final class Threeds2ChallengeAction extends Action {
    public static final String ACTION_TYPE = "threeDS2Challenge";
    private static final String TOKEN = "token";
    private final String token;
    public static final Companion Companion = new Companion(null);
    @JvmField
    public static final Parcelable.Creator<Threeds2ChallengeAction> CREATOR = new ModelObject.Creator(Threeds2ChallengeAction.class);
    @JvmField
    public static final ModelObject.Serializer<Threeds2ChallengeAction> SERIALIZER = new ModelObject.Serializer<Threeds2ChallengeAction>() { // from class: com.adyen.checkout.components.model.payments.response.Threeds2ChallengeAction$Companion$SERIALIZER$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public Threeds2ChallengeAction deserialize(JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            try {
                Threeds2ChallengeAction threeds2ChallengeAction = new Threeds2ChallengeAction(JsonUtilsKt.getStringOrNull(jsonObject, "token"));
                threeds2ChallengeAction.setType(JsonUtilsKt.getStringOrNull(jsonObject, "type"));
                threeds2ChallengeAction.setPaymentData(JsonUtilsKt.getStringOrNull(jsonObject, Action.PAYMENT_DATA));
                threeds2ChallengeAction.setPaymentMethodType(JsonUtilsKt.getStringOrNull(jsonObject, Action.PAYMENT_METHOD_TYPE));
                return threeds2ChallengeAction;
            } catch (JSONException e) {
                throw new ModelSerializationException(Threeds2Action.class, e);
            }
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        public JSONObject serialize(Threeds2ChallengeAction modelObject) {
            Intrinsics.checkNotNullParameter(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt(Action.PAYMENT_DATA, modelObject.getPaymentData());
                jSONObject.putOpt(Action.PAYMENT_METHOD_TYPE, modelObject.getPaymentMethodType());
                jSONObject.putOpt("token", modelObject.getToken());
                return jSONObject;
            } catch (JSONException e) {
                throw new ModelSerializationException(Threeds2ChallengeAction.class, e);
            }
        }
    };

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m28432d2 = {"Lcom/adyen/checkout/components/model/payments/response/Threeds2ChallengeAction$Companion;", "", "()V", "ACTION_TYPE", "", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/adyen/checkout/components/model/payments/response/Threeds2ChallengeAction;", ModelUtils.SERIALIZER_FIELD_NAME, "Lcom/adyen/checkout/core/model/ModelObject$Serializer;", "TOKEN", "components-core_release"}, m28431k = 1, m28430mv = {1, 5, 1}, m28428xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public Threeds2ChallengeAction() {
        this(null, 1, null);
    }

    public final String getToken() {
        return this.token;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        JsonUtils.writeToParcel(dest, SERIALIZER.serialize(this));
    }

    public /* synthetic */ Threeds2ChallengeAction(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public Threeds2ChallengeAction(String str) {
        this.token = str;
    }
}
