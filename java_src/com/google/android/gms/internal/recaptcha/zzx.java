package com.google.android.gms.internal.recaptcha;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.recaptcha.RecaptchaResultData;
@SafeParcelable.Class(creator = "ExecuteResultsCreator")
/* loaded from: classes6.dex */
public final class zzx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzx> CREATOR = new C49553tx9();
    @SafeParcelable.Field(getter = "getRecaptchaResultData", m51606id = 1)

    /* renamed from: b */
    public final RecaptchaResultData f71214b;

    @SafeParcelable.Constructor
    public zzx(@SafeParcelable.Param(m51605id = 1) RecaptchaResultData recaptchaResultData) {
        this.f71214b = recaptchaResultData;
    }

    /* renamed from: s */
    public final RecaptchaResultData m51018s() {
        return this.f71214b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f71214b, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
