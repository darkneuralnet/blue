package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "PlayLoggerContextCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new To9();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public final String f70518b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public final int f70519c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public final int f70520d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public final String f70521e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public final String f70522f;
    @SafeParcelable.Field(defaultValue = "true", m51606id = 7)

    /* renamed from: g */
    public final boolean f70523g;
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: h */
    public final String f70524h;
    @SafeParcelable.Field(m51606id = 9)

    /* renamed from: i */
    public final boolean f70525i;
    @SafeParcelable.Field(m51606id = 10)

    /* renamed from: j */
    public final int f70526j;

    public zzr(String str, int i, int i2, String str2, String str3, String str4, boolean z, EnumC34546Mn8 enumC34546Mn8) {
        this.f70518b = (String) Preconditions.checkNotNull(str);
        this.f70519c = i;
        this.f70520d = i2;
        this.f70524h = str2;
        this.f70521e = str3;
        this.f70522f = str4;
        this.f70523g = !z;
        this.f70525i = z;
        this.f70526j = enumC34546Mn8.zzc();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzr) {
            zzr zzrVar = (zzr) obj;
            if (Objects.equal(this.f70518b, zzrVar.f70518b) && this.f70519c == zzrVar.f70519c && this.f70520d == zzrVar.f70520d && Objects.equal(this.f70524h, zzrVar.f70524h) && Objects.equal(this.f70521e, zzrVar.f70521e) && Objects.equal(this.f70522f, zzrVar.f70522f) && this.f70523g == zzrVar.f70523g && this.f70525i == zzrVar.f70525i && this.f70526j == zzrVar.f70526j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f70518b, Integer.valueOf(this.f70519c), Integer.valueOf(this.f70520d), this.f70524h, this.f70521e, this.f70522f, Boolean.valueOf(this.f70523g), Boolean.valueOf(this.f70525i), Integer.valueOf(this.f70526j));
    }

    public final String toString() {
        return "PlayLoggerContext[package=" + this.f70518b + CoreConstants.COMMA_CHAR + "packageVersionCode=" + this.f70519c + CoreConstants.COMMA_CHAR + "logSource=" + this.f70520d + CoreConstants.COMMA_CHAR + "logSourceName=" + this.f70524h + CoreConstants.COMMA_CHAR + "uploadAccount=" + this.f70521e + CoreConstants.COMMA_CHAR + "loggingId=" + this.f70522f + CoreConstants.COMMA_CHAR + "logAndroidId=" + this.f70523g + CoreConstants.COMMA_CHAR + "isAnonymous=" + this.f70525i + CoreConstants.COMMA_CHAR + "qosTier=" + this.f70526j + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f70518b, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f70519c);
        SafeParcelWriter.writeInt(parcel, 4, this.f70520d);
        SafeParcelWriter.writeString(parcel, 5, this.f70521e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f70522f, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f70523g);
        SafeParcelWriter.writeString(parcel, 8, this.f70524h, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.f70525i);
        SafeParcelWriter.writeInt(parcel, 10, this.f70526j);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzr(@SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) int i, @SafeParcelable.Param(m51605id = 4) int i2, @SafeParcelable.Param(m51605id = 5) String str2, @SafeParcelable.Param(m51605id = 6) String str3, @SafeParcelable.Param(m51605id = 7) boolean z, @SafeParcelable.Param(m51605id = 8) String str4, @SafeParcelable.Param(m51605id = 9) boolean z2, @SafeParcelable.Param(m51605id = 10) int i3) {
        this.f70518b = str;
        this.f70519c = i;
        this.f70520d = i2;
        this.f70521e = str2;
        this.f70522f = str3;
        this.f70523g = z;
        this.f70524h = str4;
        this.f70525i = z2;
        this.f70526j = i3;
    }
}
