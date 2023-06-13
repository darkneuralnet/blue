package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
@KeepForSdk
@SafeParcelable.Class(creator = "ConfigurationCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public class Configuration extends AbstractSafeParcelable implements Comparable<Configuration> {
    @KeepForSdk
    public static final Parcelable.Creator<Configuration> CREATOR = new VP7();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public final int f71747b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public final zzi[] f71748c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public final String[] f71749d;

    /* renamed from: e */
    public final Map<String, zzi> f71750e = new TreeMap();

    @SafeParcelable.Constructor
    public Configuration(@SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) zzi[] zziVarArr, @SafeParcelable.Param(m51605id = 4) String[] strArr) {
        this.f71747b = i;
        this.f71748c = zziVarArr;
        for (zzi zziVar : zziVarArr) {
            this.f71750e.put(zziVar.f71766b, zziVar);
        }
        this.f71749d = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Configuration configuration) {
        return this.f71747b - configuration.f71747b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Configuration) {
            Configuration configuration = (Configuration) obj;
            if (this.f71747b == configuration.f71747b && O49.m92951a(this.f71750e, configuration.f71750e) && Arrays.equals(this.f71749d, configuration.f71749d)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.f71747b);
        sb.append(", ");
        sb.append("(");
        for (zzi zziVar : this.f71750e.values()) {
            sb.append(zziVar);
            sb.append(", ");
        }
        sb.append(")");
        sb.append(", ");
        sb.append("(");
        String[] strArr = this.f71749d;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append(")");
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f71747b);
        SafeParcelWriter.writeTypedArray(parcel, 3, this.f71748c, i, false);
        SafeParcelWriter.writeStringArray(parcel, 4, this.f71749d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
