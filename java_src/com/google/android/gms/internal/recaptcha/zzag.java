package com.google.android.gms.internal.recaptcha;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "InitParamsCreator")
/* loaded from: classes6.dex */
public final class zzag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzag> CREATOR = new C38158am7();
    @SafeParcelable.Field(defaultValue = "", getter = "getSiteKey", m51606id = 1)

    /* renamed from: b */
    public final String f71206b;
    @SafeParcelable.Field(defaultValue = "16.0.0", getter = "getSdkVersion", m51606id = 2)

    /* renamed from: c */
    public final String f71207c;

    @SafeParcelable.Constructor
    public zzag(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) String str2) {
        this.f71206b = str;
        this.f71207c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f71206b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f71207c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
