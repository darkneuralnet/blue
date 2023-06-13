package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "CalendarDateTimeParcelCreator")
/* loaded from: classes5.dex */
public final class zzap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzap> CREATOR = new C43212jG7();
    @SafeParcelable.Field(getter = "getYear", m51606id = 1)

    /* renamed from: b */
    public final int f70742b;
    @SafeParcelable.Field(getter = "getMonth", m51606id = 2)

    /* renamed from: c */
    public final int f70743c;
    @SafeParcelable.Field(getter = "getDay", m51606id = 3)

    /* renamed from: d */
    public final int f70744d;
    @SafeParcelable.Field(getter = "getHours", m51606id = 4)

    /* renamed from: e */
    public final int f70745e;
    @SafeParcelable.Field(getter = "getMinutes", m51606id = 5)

    /* renamed from: f */
    public final int f70746f;
    @SafeParcelable.Field(getter = "getSeconds", m51606id = 6)

    /* renamed from: g */
    public final int f70747g;
    @SafeParcelable.Field(getter = "isUtc", m51606id = 7)

    /* renamed from: h */
    public final boolean f70748h;
    @SafeParcelable.Field(getter = "getRawValue", m51606id = 8)

    /* renamed from: i */
    public final String f70749i;

    @SafeParcelable.Constructor
    public zzap(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) int i2, @SafeParcelable.Param(m51605id = 3) int i3, @SafeParcelable.Param(m51605id = 4) int i4, @SafeParcelable.Param(m51605id = 5) int i5, @SafeParcelable.Param(m51605id = 6) int i6, @SafeParcelable.Param(m51605id = 7) boolean z, @SafeParcelable.Param(m51605id = 8) String str) {
        this.f70742b = i;
        this.f70743c = i2;
        this.f70744d = i3;
        this.f70745e = i4;
        this.f70746f = i5;
        this.f70747g = i6;
        this.f70748h = z;
        this.f70749i = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f70742b);
        SafeParcelWriter.writeInt(parcel, 2, this.f70743c);
        SafeParcelWriter.writeInt(parcel, 3, this.f70744d);
        SafeParcelWriter.writeInt(parcel, 4, this.f70745e);
        SafeParcelWriter.writeInt(parcel, 5, this.f70746f);
        SafeParcelWriter.writeInt(parcel, 6, this.f70747g);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f70748h);
        SafeParcelWriter.writeString(parcel, 8, this.f70749i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
