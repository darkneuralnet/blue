package com.adyen.checkout.redirect;

import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.checkout.components.base.Configuration;
/* loaded from: classes.dex */
public class RedirectConfiguration extends Configuration {
    public static final Parcelable.Creator<RedirectConfiguration> CREATOR = new C16846a();

    /* renamed from: com.adyen.checkout.redirect.RedirectConfiguration$a */
    /* loaded from: classes.dex */
    public static class C16846a implements Parcelable.Creator<RedirectConfiguration> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RedirectConfiguration createFromParcel(Parcel parcel) {
            return new RedirectConfiguration(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public RedirectConfiguration[] newArray(int i) {
            return new RedirectConfiguration[i];
        }
    }

    public RedirectConfiguration(Parcel parcel) {
        super(parcel);
    }
}
