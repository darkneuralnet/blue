package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "UserAttributeParcelCreator")
/* loaded from: classes6.dex */
public final class zzlj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlj> CREATOR = new C41578gW8();
    @SafeParcelable.Field(m51606id = 1)

    /* renamed from: b */
    public final int f71533b;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: c */
    public final String f71534c;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: d */
    public final long f71535d;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: e */
    public final Long f71536e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public final String f71537f;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: g */
    public final String f71538g;
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: h */
    public final Double f71539h;

    @SafeParcelable.Constructor
    public zzlj(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) long j, @SafeParcelable.Param(m51605id = 4) Long l, @SafeParcelable.Param(m51605id = 5) Float f, @SafeParcelable.Param(m51605id = 6) String str2, @SafeParcelable.Param(m51605id = 7) String str3, @SafeParcelable.Param(m51605id = 8) Double d) {
        this.f71533b = i;
        this.f71534c = str;
        this.f71535d = j;
        this.f71536e = l;
        if (i == 1) {
            this.f71539h = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f71539h = d;
        }
        this.f71537f = str2;
        this.f71538g = str3;
    }

    /* renamed from: s */
    public final Object m50581s() {
        Long l = this.f71536e;
        if (l != null) {
            return l;
        }
        Double d = this.f71539h;
        if (d != null) {
            return d;
        }
        String str = this.f71537f;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C41578gW8.m39199a(this, parcel, i);
    }

    public zzlj(C47508qW8 c47508qW8) {
        this(c47508qW8.f105373c, c47508qW8.f105374d, c47508qW8.f105375e, c47508qW8.f105372b);
    }

    public zzlj(String str, long j, Object obj, String str2) {
        Preconditions.checkNotEmpty(str);
        this.f71533b = 2;
        this.f71534c = str;
        this.f71535d = j;
        this.f71538g = str2;
        if (obj == null) {
            this.f71536e = null;
            this.f71539h = null;
            this.f71537f = null;
        } else if (obj instanceof Long) {
            this.f71536e = (Long) obj;
            this.f71539h = null;
            this.f71537f = null;
        } else if (obj instanceof String) {
            this.f71536e = null;
            this.f71539h = null;
            this.f71537f = (String) obj;
        } else if (obj instanceof Double) {
            this.f71536e = null;
            this.f71539h = (Double) obj;
            this.f71537f = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
