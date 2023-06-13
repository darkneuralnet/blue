package com.google.android.gms.recaptcha;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
@SafeParcelable.Class(creator = "RecaptchaHandleCreator")
/* loaded from: classes6.dex */
public class RecaptchaHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RecaptchaHandle> CREATOR = new C52919ze8();
    @SafeParcelable.Field(defaultValue = "", getter = "getSiteKey", m51606id = 1)

    /* renamed from: b */
    public final String f71780b;
    @SafeParcelable.Field(defaultValue = "", getter = "getClientPackageName", m51606id = 2)

    /* renamed from: c */
    public final String f71781c;
    @SafeParcelable.Field(defaultValueUnchecked = "new java.util.ArrayList<>()", getter = "getAcceptableAdditionalArgs", m51606id = 3)

    /* renamed from: d */
    public final List<String> f71782d;

    @SafeParcelable.Constructor
    public RecaptchaHandle(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) String str2, @SafeParcelable.Param(m51605id = 3) List<String> list) {
        this.f71780b = str;
        this.f71781c = str2;
        this.f71782d = list;
    }

    /* renamed from: s */
    public List<String> m50546s() {
        return this.f71782d;
    }

    /* renamed from: u */
    public String m50545u() {
        return this.f71781c;
    }

    /* renamed from: v */
    public String m50544v() {
        return this.f71780b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, m50544v(), false);
        SafeParcelWriter.writeString(parcel, 2, m50545u(), false);
        SafeParcelWriter.writeStringList(parcel, 3, m50546s(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
