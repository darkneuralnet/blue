package com.google.android.gms.internal.recaptcha;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.recaptcha.RecaptchaAction;
import com.google.android.gms.recaptcha.RecaptchaHandle;
@SafeParcelable.Class(creator = "ExecuteParamsCreator")
/* loaded from: classes6.dex */
public final class zzv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new C44197kv9();
    @SafeParcelable.Field(getter = "getRecaptchaHandle", m51606id = 1)

    /* renamed from: b */
    public final RecaptchaHandle f71211b;
    @SafeParcelable.Field(getter = "getRecaptchaAction", m51606id = 2)

    /* renamed from: c */
    public final RecaptchaAction f71212c;
    @SafeParcelable.Field(defaultValue = "16.0.0", getter = "getSdkVersion", m51606id = 3)

    /* renamed from: d */
    public final String f71213d;

    @SafeParcelable.Constructor
    public zzv(@SafeParcelable.Param(m51605id = 1) RecaptchaHandle recaptchaHandle, @SafeParcelable.Param(m51605id = 2) RecaptchaAction recaptchaAction, @SafeParcelable.Param(m51605id = 3) String str) {
        this.f71211b = recaptchaHandle;
        this.f71212c = recaptchaAction;
        this.f71213d = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f71211b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f71212c, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.f71213d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
