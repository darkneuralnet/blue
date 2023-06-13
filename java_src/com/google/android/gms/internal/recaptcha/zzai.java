package com.google.android.gms.internal.recaptcha;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.recaptcha.RecaptchaHandle;
@SafeParcelable.Class(creator = "InitResultsCreator")
/* loaded from: classes6.dex */
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new C35013On7();
    @SafeParcelable.Field(getter = "getRecaptchaHandle", m51606id = 1)

    /* renamed from: b */
    public final RecaptchaHandle f71208b;

    @SafeParcelable.Constructor
    public zzai(@SafeParcelable.Param(m51605id = 1) RecaptchaHandle recaptchaHandle) {
        this.f71208b = recaptchaHandle;
    }

    /* renamed from: s */
    public final RecaptchaHandle m51031s() {
        return this.f71208b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f71208b, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
