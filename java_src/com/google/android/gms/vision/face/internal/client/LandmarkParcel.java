package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@UsedByNative("wrapper.cc")
@SafeParcelable.Class(creator = "LandmarkParcelCreator")
/* loaded from: classes6.dex */
public final class LandmarkParcel extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<LandmarkParcel> CREATOR = new C47535qZ8();
    @SafeParcelable.VersionField(m51603id = 1)

    /* renamed from: b */
    public final int f71886b;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: c */
    public final float f71887c;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: d */
    public final float f71888d;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: e */
    public final int f71889e;

    @SafeParcelable.Constructor
    @UsedByNative("wrapper.cc")
    public LandmarkParcel(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) float f, @SafeParcelable.Param(m51605id = 3) float f2, @SafeParcelable.Param(m51605id = 4) int i2) {
        this.f71886b = i;
        this.f71887c = f;
        this.f71888d = f2;
        this.f71889e = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f71886b);
        SafeParcelWriter.writeFloat(parcel, 2, this.f71887c);
        SafeParcelWriter.writeFloat(parcel, 3, this.f71888d);
        SafeParcelWriter.writeInt(parcel, 4, this.f71889e);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
