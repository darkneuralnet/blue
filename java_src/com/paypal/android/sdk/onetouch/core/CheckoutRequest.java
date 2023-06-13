package com.paypal.android.sdk.onetouch.core;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.paypal.android.sdk.onetouch.core.exception.BrowserSwitchException;
import com.paypal.android.sdk.onetouch.core.exception.ResponseParsingException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class CheckoutRequest extends Request<CheckoutRequest> {
    public static final Parcelable.Creator<CheckoutRequest> CREATOR = new C18573a();

    /* renamed from: g */
    public String f74979g;

    /* renamed from: h */
    public String f74980h;

    /* renamed from: i */
    public String f74981i;

    /* renamed from: com.paypal.android.sdk.onetouch.core.CheckoutRequest$a */
    /* loaded from: classes6.dex */
    public static class C18573a implements Parcelable.Creator<CheckoutRequest> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public CheckoutRequest createFromParcel(Parcel parcel) {
            return new CheckoutRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public CheckoutRequest[] newArray(int i) {
            return new CheckoutRequest[i];
        }
    }

    public CheckoutRequest() {
        this.f74980h = "token";
    }

    @Override // com.paypal.android.sdk.onetouch.core.Request
    /* renamed from: e */
    public AbstractC45348ms4 mo45892e(C36044Sy3 c36044Sy3) {
        return c36044Sy3.m84530c();
    }

    @Override // com.paypal.android.sdk.onetouch.core.Request
    /* renamed from: g */
    public String mo45891g() {
        return this.f74979g;
    }

    @Override // com.paypal.android.sdk.onetouch.core.Request
    /* renamed from: l */
    public AbstractC45348ms4 mo45886l(Context context, C36044Sy3 c36044Sy3) {
        for (C32855Fi0 c32855Fi0 : c36044Sy3.m84529d()) {
            if (EnumC43236jJ4.wallet == c32855Fi0.m24832c()) {
                if (c32855Fi0.m24829g(context)) {
                    return c32855Fi0;
                }
            } else if (EnumC43236jJ4.browser == c32855Fi0.m24832c() && c32855Fi0.m24828h(context, mo45891g())) {
                return c32855Fi0;
            }
        }
        return null;
    }

    @Override // com.paypal.android.sdk.onetouch.core.Request
    /* renamed from: n */
    public Result mo45884n(Uri uri) {
        if (!Uri.parse(m45885m()).getLastPathSegment().equals(uri.getLastPathSegment())) {
            return new Result();
        }
        String queryParameter = Uri.parse(this.f74979g).getQueryParameter(this.f74980h);
        String queryParameter2 = uri.getQueryParameter(this.f74980h);
        if (queryParameter2 != null && TextUtils.equals(queryParameter, queryParameter2)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("webURL", uri.toString());
                return new Result(null, LM4.web, jSONObject, null);
            } catch (JSONException e) {
                return new Result(new ResponseParsingException(e));
            }
        }
        return new Result(new BrowserSwitchException("The response contained inconsistent data."));
    }

    @Override // com.paypal.android.sdk.onetouch.core.Request
    /* renamed from: q */
    public void mo45881q(Context context, EnumC45489n66 enumC45489n66, S94 s94) {
        String queryParameter = Uri.parse(this.f74979g).getQueryParameter(this.f74980h);
        HashMap hashMap = new HashMap();
        hashMap.put("fltk", queryParameter);
        hashMap.put("clid", m45889i());
        C46811pL3.m19463c(context).m84575f(enumC45489n66, m45887k(), hashMap, s94);
    }

    @Override // com.paypal.android.sdk.onetouch.core.Request
    /* renamed from: r */
    public boolean mo45880r(Bundle bundle) {
        String queryParameter;
        String queryParameter2 = Uri.parse(this.f74979g).getQueryParameter(this.f74980h);
        String string = bundle.getString("webURL");
        if (string == null || (queryParameter = Uri.parse(string).getQueryParameter(this.f74980h)) == null || !TextUtils.equals(queryParameter2, queryParameter)) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public CheckoutRequest mo45903s(String str) {
        this.f74979g = str;
        this.f74980h = "token";
        return this;
    }

    /* renamed from: t */
    public CheckoutRequest mo45902t(Context context, String str) {
        this.f74981i = str;
        m45894c(C46811pL3.m19465a(context, str));
        return this;
    }

    @Override // com.paypal.android.sdk.onetouch.core.Request, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f74979g);
        parcel.writeString(this.f74980h);
        parcel.writeString(this.f74981i);
    }

    public CheckoutRequest(Parcel parcel) {
        super(parcel);
        this.f74979g = parcel.readString();
        this.f74980h = parcel.readString();
        this.f74981i = parcel.readString();
    }
}
