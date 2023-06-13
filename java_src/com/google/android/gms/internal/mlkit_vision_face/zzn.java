package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "LandmarkParcelCreator")
/* loaded from: classes5.dex */
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new C38982c99();
    @SafeParcelable.VersionField(m51603id = 1)

    /* renamed from: b */
    public final int f70846b;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: c */
    public final float f70847c;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: d */
    public final float f70848d;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: e */
    public final int f70849e;

    @SafeParcelable.Constructor
    public zzn(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) float f, @SafeParcelable.Param(m51605id = 3) float f2, @SafeParcelable.Param(m51605id = 4) int i2) {
        this.f70846b = i;
        this.f70847c = f;
        this.f70848d = f2;
        this.f70849e = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f70846b);
        SafeParcelWriter.writeFloat(parcel, 2, this.f70847c);
        SafeParcelWriter.writeFloat(parcel, 3, this.f70848d);
        SafeParcelWriter.writeInt(parcel, 4, this.f70849e);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
