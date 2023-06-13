package com.google.android.gms.recaptcha;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "RecaptchaResultDataCreator")
/* loaded from: classes6.dex */
public class RecaptchaResultData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RecaptchaResultData> CREATOR = new C46478om8();
    @SafeParcelable.Field(defaultValue = "", getter = "getTokenResult", m51606id = 1)

    /* renamed from: b */
    public final String f71783b;

    @SafeParcelable.Constructor
    public RecaptchaResultData(@SafeParcelable.Param(m51605id = 1) String str) {
        this.f71783b = str;
    }

    /* renamed from: s */
    public String m50543s() {
        return this.f71783b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, m50543s(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
