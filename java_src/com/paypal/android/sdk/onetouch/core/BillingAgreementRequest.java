package com.paypal.android.sdk.onetouch.core;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes6.dex */
public class BillingAgreementRequest extends CheckoutRequest {
    public static final Parcelable.Creator<BillingAgreementRequest> CREATOR = new C18572a();

    /* renamed from: com.paypal.android.sdk.onetouch.core.BillingAgreementRequest$a */
    /* loaded from: classes6.dex */
    public static class C18572a implements Parcelable.Creator<BillingAgreementRequest> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public BillingAgreementRequest createFromParcel(Parcel parcel) {
            return new BillingAgreementRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public BillingAgreementRequest[] newArray(int i) {
            return new BillingAgreementRequest[i];
        }
    }

    public BillingAgreementRequest() {
    }

    @Override // com.paypal.android.sdk.onetouch.core.CheckoutRequest, com.paypal.android.sdk.onetouch.core.Request
    /* renamed from: l */
    public AbstractC45348ms4 mo45886l(Context context, C36044Sy3 c36044Sy3) {
        for (C5534NG c5534ng : c36044Sy3.m84531b()) {
            if (EnumC43236jJ4.wallet == c5534ng.m24832c()) {
                if (c5534ng.m24829g(context)) {
                    return c5534ng;
                }
            } else if (EnumC43236jJ4.browser == c5534ng.m24832c() && c5534ng.m24828h(context, mo45891g())) {
                return c5534ng;
            }
        }
        return null;
    }

    @Override // com.paypal.android.sdk.onetouch.core.CheckoutRequest
    /* renamed from: u */
    public BillingAgreementRequest mo45903s(String str) {
        super.mo45903s(str);
        this.f74980h = "ba_token";
        return this;
    }

    @Override // com.paypal.android.sdk.onetouch.core.CheckoutRequest
    /* renamed from: v */
    public BillingAgreementRequest mo45902t(Context context, String str) {
        super.mo45902t(context, str);
        return this;
    }

    public BillingAgreementRequest(Parcel parcel) {
        super(parcel);
    }
}
