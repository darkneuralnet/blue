package p000;

import android.content.Context;
import android.os.Parcel;
import com.braintreepayments.api.exceptions.BraintreeException;
import com.braintreepayments.api.models.Authorization;
import com.braintreepayments.api.models.ClientToken;
import com.braintreepayments.api.models.TokenizationKey;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: rN3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC48015rN3<T> {

    /* renamed from: b */
    public String f106910b;

    /* renamed from: c */
    public String f106911c;

    /* renamed from: d */
    public boolean f106912d;

    /* renamed from: e */
    public boolean f106913e;

    /* renamed from: f */
    public String f106914f;

    public AbstractC48015rN3() {
        this.f106910b = m16030g();
        this.f106911c = m16029h();
    }

    /* renamed from: a */
    public String m16032a() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject.put("_meta", new HT2().m103828c(this.f106914f).m103827d(this.f106911c).m103829b(this.f106910b).m103830a());
            if (this.f106913e) {
                jSONObject2.put("validate", this.f106912d);
                jSONObject3.put("options", jSONObject2);
            }
            mo2563b(jSONObject, jSONObject3);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    public abstract void mo2563b(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException;

    /* renamed from: c */
    public String m16031c(Context context, Authorization authorization) throws BraintreeException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject.put("clientSdkMetadata", new HT2().m103828c(this.f106914f).m103827d(this.f106911c).m103829b(this.f106910b).m103830a());
            JSONObject jSONObject4 = new JSONObject();
            if (this.f106913e) {
                jSONObject4.put("validate", this.f106912d);
            } else if (authorization instanceof ClientToken) {
                jSONObject4.put("validate", true);
            } else if (authorization instanceof TokenizationKey) {
                jSONObject4.put("validate", false);
            }
            jSONObject2.put("options", jSONObject4);
            jSONObject3.put("input", jSONObject2);
            mo2562d(context, jSONObject, jSONObject3);
            jSONObject.put("variables", jSONObject3);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: d */
    public abstract void mo2562d(Context context, JSONObject jSONObject, JSONObject jSONObject2) throws BraintreeException, JSONException;

    /* renamed from: e */
    public abstract String mo2561e();

    /* renamed from: g */
    public String m16030g() {
        return "custom";
    }

    /* renamed from: h */
    public String m16029h() {
        return "form";
    }

    /* renamed from: i */
    public abstract String mo2560i();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public T m16028j(String str) {
        this.f106914f = str;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public T m16027k(String str) {
        this.f106911c = str;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f106910b);
        parcel.writeString(this.f106911c);
        parcel.writeByte(this.f106912d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f106913e ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f106914f);
    }

    public AbstractC48015rN3(Parcel parcel) {
        this.f106910b = m16030g();
        this.f106911c = m16029h();
        this.f106910b = parcel.readString();
        this.f106911c = parcel.readString();
        this.f106912d = parcel.readByte() > 0;
        this.f106913e = parcel.readByte() > 0;
        this.f106914f = parcel.readString();
    }
}
