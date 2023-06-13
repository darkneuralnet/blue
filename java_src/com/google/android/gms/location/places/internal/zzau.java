package com.google.android.gms.location.places.internal;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;
@SafeParcelable.Class(creator = "PlacesParamsCreator")
@SafeParcelable.Reserved({1000, 5})
/* loaded from: classes6.dex */
public final class zzau extends AbstractSafeParcelable {
    @SafeParcelable.Field(m51606id = 4)
    private final String zzat;
    @SafeParcelable.Field(m51606id = 7)
    private final int zzau;
    @SafeParcelable.Field(m51606id = 3)
    private final String zzav;
    @SafeParcelable.Field(m51606id = 1)
    private final String zzcx;
    @SafeParcelable.Field(m51606id = 2)
    private final String zzcy;
    @SafeParcelable.Field(m51606id = 6)
    private final int zzcz;
    private static final zzau zzcw = new zzau("com.google.android.gms", Locale.getDefault(), null);
    public static final Parcelable.Creator<zzau> CREATOR = new zzat();

    @SafeParcelable.Constructor
    public zzau(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) String str2, @SafeParcelable.Param(m51605id = 3) String str3, @SafeParcelable.Param(m51605id = 4) String str4, @SafeParcelable.Param(m51605id = 6) int i, @SafeParcelable.Param(m51605id = 7) int i2) {
        this.zzcx = str;
        this.zzcy = str2;
        this.zzav = str3;
        this.zzat = str4;
        this.zzcz = i;
        this.zzau = i2;
    }

    private static String zzb(Locale locale) {
        return locale.toLanguageTag();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzau)) {
            zzau zzauVar = (zzau) obj;
            if (this.zzcz == zzauVar.zzcz && this.zzau == zzauVar.zzau && this.zzcy.equals(zzauVar.zzcy) && this.zzcx.equals(zzauVar.zzcx) && Objects.equal(this.zzav, zzauVar.zzav) && Objects.equal(this.zzat, zzauVar.zzat)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzcx, this.zzcy, this.zzav, this.zzat, Integer.valueOf(this.zzcz), Integer.valueOf(this.zzau));
    }

    @SuppressLint({"DefaultLocale"})
    public final String toString() {
        return Objects.toStringHelper(this).add("clientPackageName", this.zzcx).add("locale", this.zzcy).add("accountName", this.zzav).add("gCoreClientName", this.zzat).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzcx, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzcy, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzav, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzat, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzcz);
        SafeParcelWriter.writeInt(parcel, 7, this.zzau);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private zzau(String str, Locale locale, String str2) {
        this(str, zzb(locale), null, null, GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE, 0);
    }

    public zzau(String str, Locale locale, String str2, String str3, int i) {
        this(str, zzb(locale), str2, str3, GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE, i);
    }
}
