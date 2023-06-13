package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "ConditionalUserPropertyParcelCreator")
/* loaded from: classes6.dex */
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new C49994ui7();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public String f71517b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public String f71518c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public zzlj f71519d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public long f71520e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public boolean f71521f;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: g */
    public String f71522g;
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: h */
    public final zzaw f71523h;
    @SafeParcelable.Field(m51606id = 9)

    /* renamed from: i */
    public long f71524i;
    @SafeParcelable.Field(m51606id = 10)

    /* renamed from: j */
    public zzaw f71525j;
    @SafeParcelable.Field(m51606id = 11)

    /* renamed from: k */
    public final long f71526k;
    @SafeParcelable.Field(m51606id = 12)

    /* renamed from: l */
    public final zzaw f71527l;

    public zzac(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        this.f71517b = zzacVar.f71517b;
        this.f71518c = zzacVar.f71518c;
        this.f71519d = zzacVar.f71519d;
        this.f71520e = zzacVar.f71520e;
        this.f71521f = zzacVar.f71521f;
        this.f71522g = zzacVar.f71522g;
        this.f71523h = zzacVar.f71523h;
        this.f71524i = zzacVar.f71524i;
        this.f71525j = zzacVar.f71525j;
        this.f71526k = zzacVar.f71526k;
        this.f71527l = zzacVar.f71527l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f71517b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f71518c, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f71519d, i, false);
        SafeParcelWriter.writeLong(parcel, 5, this.f71520e);
        SafeParcelWriter.writeBoolean(parcel, 6, this.f71521f);
        SafeParcelWriter.writeString(parcel, 7, this.f71522g, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f71523h, i, false);
        SafeParcelWriter.writeLong(parcel, 9, this.f71524i);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f71525j, i, false);
        SafeParcelWriter.writeLong(parcel, 11, this.f71526k);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f71527l, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzac(@SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2, @SafeParcelable.Param(m51605id = 4) zzlj zzljVar, @SafeParcelable.Param(m51605id = 5) long j, @SafeParcelable.Param(m51605id = 6) boolean z, @SafeParcelable.Param(m51605id = 7) String str3, @SafeParcelable.Param(m51605id = 8) zzaw zzawVar, @SafeParcelable.Param(m51605id = 9) long j2, @SafeParcelable.Param(m51605id = 10) zzaw zzawVar2, @SafeParcelable.Param(m51605id = 11) long j3, @SafeParcelable.Param(m51605id = 12) zzaw zzawVar3) {
        this.f71517b = str;
        this.f71518c = str2;
        this.f71519d = zzljVar;
        this.f71520e = j;
        this.f71521f = z;
        this.f71522g = str3;
        this.f71523h = zzawVar;
        this.f71524i = j2;
        this.f71525j = zzawVar2;
        this.f71526k = j3;
        this.f71527l = zzawVar3;
    }
}
