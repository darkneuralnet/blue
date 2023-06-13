package com.google.android.gms.recaptcha;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "RecaptchaActionTypeCreator")
/* loaded from: classes6.dex */
public final class RecaptchaActionType extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RecaptchaActionType> CREATOR = new C47270q68();
    @SafeParcelable.Field(getter = "getAction", m51606id = 1)

    /* renamed from: b */
    public String f71779b;

    @SafeParcelable.Constructor
    public RecaptchaActionType(@SafeParcelable.Param(m51605id = 1) String str) {
        this.f71779b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f71779b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
