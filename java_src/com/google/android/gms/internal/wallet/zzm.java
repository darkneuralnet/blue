package com.google.android.gms.internal.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@ShowFirstParty
@SafeParcelable.Class(creator = "GetSaveInstrumentDetailsResponseCreator")
/* loaded from: classes6.dex */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new L49();
    @SafeParcelable.Field(m51606id = 1)

    /* renamed from: b */
    public String[] f71359b;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: c */
    public int[] f71360c;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: d */
    public RemoteViews f71361d;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: e */
    public byte[] f71362e;

    private zzm() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.f71359b, false);
        SafeParcelWriter.writeIntArray(parcel, 2, this.f71360c, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f71361d, i, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.f71362e, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzm(@SafeParcelable.Param(m51605id = 1) String[] strArr, @SafeParcelable.Param(m51605id = 2) int[] iArr, @SafeParcelable.Param(m51605id = 3) RemoteViews remoteViews, @SafeParcelable.Param(m51605id = 4) byte[] bArr) {
        this.f71359b = strArr;
        this.f71360c = iArr;
        this.f71361d = remoteViews;
        this.f71362e = bArr;
    }
}
