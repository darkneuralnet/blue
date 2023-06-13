package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.classic.spi.CallerData;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.Geofence;
import java.util.Locale;
@VisibleForTesting
@SafeParcelable.Class(creator = "ParcelableGeofenceCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class zzbe extends AbstractSafeParcelable implements Geofence {
    public static final Parcelable.Creator<zzbe> CREATOR = new YG7();
    @SafeParcelable.Field(getter = "getRequestId", m51606id = 1)

    /* renamed from: b */
    public final String f70548b;
    @SafeParcelable.Field(getter = "getExpirationTime", m51606id = 2)

    /* renamed from: c */
    public final long f70549c;
    @SafeParcelable.Field(getter = "getType", m51606id = 3)

    /* renamed from: d */
    public final short f70550d;
    @SafeParcelable.Field(getter = "getLatitude", m51606id = 4)

    /* renamed from: e */
    public final double f70551e;
    @SafeParcelable.Field(getter = "getLongitude", m51606id = 5)

    /* renamed from: f */
    public final double f70552f;
    @SafeParcelable.Field(getter = "getRadius", m51606id = 6)

    /* renamed from: g */
    public final float f70553g;
    @SafeParcelable.Field(getter = "getTransitionTypes", m51606id = 7)

    /* renamed from: h */
    public final int f70554h;
    @SafeParcelable.Field(defaultValue = "0", getter = "getNotificationResponsiveness", m51606id = 8)

    /* renamed from: i */
    public final int f70555i;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getLoiteringDelay", m51606id = 9)

    /* renamed from: j */
    public final int f70556j;

    @SafeParcelable.Constructor
    public zzbe(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 7) int i, @SafeParcelable.Param(m51605id = 3) short s, @SafeParcelable.Param(m51605id = 4) double d, @SafeParcelable.Param(m51605id = 5) double d2, @SafeParcelable.Param(m51605id = 6) float f, @SafeParcelable.Param(m51605id = 2) long j, @SafeParcelable.Param(m51605id = 8) int i2, @SafeParcelable.Param(m51605id = 9) int i3) {
        String str2;
        if (str != null && str.length() <= 100) {
            if (f > 0.0f) {
                if (d <= 90.0d && d >= -90.0d) {
                    if (d2 <= 180.0d && d2 >= -180.0d) {
                        int i4 = i & 7;
                        if (i4 != 0) {
                            this.f70550d = s;
                            this.f70548b = str;
                            this.f70551e = d;
                            this.f70552f = d2;
                            this.f70553g = f;
                            this.f70549c = j;
                            this.f70554h = i4;
                            this.f70555i = i2;
                            this.f70556j = i3;
                            return;
                        }
                        StringBuilder sb = new StringBuilder(46);
                        sb.append("No supported transition specified: ");
                        sb.append(i);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    StringBuilder sb2 = new StringBuilder(43);
                    sb2.append("invalid longitude: ");
                    sb2.append(d2);
                    throw new IllegalArgumentException(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder(42);
                sb3.append("invalid latitude: ");
                sb3.append(d);
                throw new IllegalArgumentException(sb3.toString());
            }
            StringBuilder sb4 = new StringBuilder(31);
            sb4.append("invalid radius: ");
            sb4.append(f);
            throw new IllegalArgumentException(sb4.toString());
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "requestId is null or too long: ".concat(valueOf);
        } else {
            str2 = new String("requestId is null or too long: ");
        }
        throw new IllegalArgumentException(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbe) {
            zzbe zzbeVar = (zzbe) obj;
            if (this.f70553g == zzbeVar.f70553g && this.f70551e == zzbeVar.f70551e && this.f70552f == zzbeVar.f70552f && this.f70550d == zzbeVar.f70550d) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.location.Geofence
    public final String getRequestId() {
        return this.f70548b;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f70551e);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f70552f);
        return ((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f70553g)) * 31) + this.f70550d) * 31) + this.f70554h;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        short s = this.f70550d;
        if (s != -1) {
            if (s != 1) {
                str = "UNKNOWN";
            } else {
                str = "CIRCLE";
            }
        } else {
            str = "INVALID";
        }
        objArr[0] = str;
        objArr[1] = this.f70548b.replaceAll("\\p{C}", CallerData.f61059NA);
        objArr[2] = Integer.valueOf(this.f70554h);
        objArr[3] = Double.valueOf(this.f70551e);
        objArr[4] = Double.valueOf(this.f70552f);
        objArr[5] = Float.valueOf(this.f70553g);
        objArr[6] = Integer.valueOf(this.f70555i / 1000);
        objArr[7] = Integer.valueOf(this.f70556j);
        objArr[8] = Long.valueOf(this.f70549c);
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f70548b, false);
        SafeParcelWriter.writeLong(parcel, 2, this.f70549c);
        SafeParcelWriter.writeShort(parcel, 3, this.f70550d);
        SafeParcelWriter.writeDouble(parcel, 4, this.f70551e);
        SafeParcelWriter.writeDouble(parcel, 5, this.f70552f);
        SafeParcelWriter.writeFloat(parcel, 6, this.f70553g);
        SafeParcelWriter.writeInt(parcel, 7, this.f70554h);
        SafeParcelWriter.writeInt(parcel, 8, this.f70555i);
        SafeParcelWriter.writeInt(parcel, 9, this.f70556j);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
