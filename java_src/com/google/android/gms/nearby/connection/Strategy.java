package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;
@SafeParcelable.Class(creator = "StrategyCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes6.dex */
public final class Strategy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Strategy> CREATOR = new Jo9();

    /* renamed from: d */
    public static final Strategy f71620d = new Strategy(1, 3);

    /* renamed from: e */
    public static final Strategy f71621e = new Strategy(1, 2);

    /* renamed from: f */
    public static final Strategy f71622f = new Strategy(1, 1);
    @SafeParcelable.Field(getter = "getConnectionType", m51606id = 3)

    /* renamed from: b */
    public final int f71623b;
    @SafeParcelable.Field(getter = "getTopology", m51606id = 4)

    /* renamed from: c */
    public final int f71624c;

    @SafeParcelable.Constructor
    public Strategy(@SafeParcelable.Param(m51605id = 3) int i, @SafeParcelable.Param(m51605id = 4) int i2) {
        this.f71623b = i;
        this.f71624c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        Strategy strategy = (Strategy) obj;
        if (this.f71623b == strategy.f71623b && this.f71624c == strategy.f71624c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f71623b), Integer.valueOf(this.f71624c));
    }

    public String toString() {
        String str;
        Locale locale = Locale.US;
        Object[] objArr = new Object[3];
        if (f71620d.equals(this)) {
            str = "P2P_CLUSTER";
        } else if (f71621e.equals(this)) {
            str = "P2P_STAR";
        } else if (f71622f.equals(this)) {
            str = "P2P_POINT_TO_POINT";
        } else {
            str = "UNKNOWN";
        }
        objArr[0] = str;
        objArr[1] = Integer.valueOf(this.f71623b);
        objArr[2] = Integer.valueOf(this.f71624c);
        return String.format(locale, "Strategy(%s){connectionType=%d, topology=%d}", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 3, this.f71623b);
        SafeParcelWriter.writeInt(parcel, 4, this.f71624c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
