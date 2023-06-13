package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "UnpublishRequestCreator")
/* loaded from: classes6.dex */
public final class zzcd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcd> CREATOR = new PR7();
    @SafeParcelable.VersionField(m51603id = 1)

    /* renamed from: b */
    public final int f71721b;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: c */
    public final zzae f71722c;
    @SafeParcelable.Field(getter = "getCallbackAsBinder", m51606id = 3, type = "android.os.IBinder")

    /* renamed from: d */
    public final Bl9 f71723d;
    @SafeParcelable.Field(m51606id = 4)
    @Deprecated

    /* renamed from: e */
    public final String f71724e;
    @SafeParcelable.Field(m51606id = 5)
    @Deprecated

    /* renamed from: f */
    public final String f71725f;
    @SafeParcelable.Field(m51606id = 6)
    @Deprecated

    /* renamed from: g */
    public final boolean f71726g;
    @SafeParcelable.Field(m51606id = 7)
    @Deprecated

    /* renamed from: h */
    public final ClientAppContext f71727h;

    @SafeParcelable.Constructor
    public zzcd(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) zzae zzaeVar, @SafeParcelable.Param(m51605id = 3) IBinder iBinder, @SafeParcelable.Param(m51605id = 4) String str, @SafeParcelable.Param(m51605id = 5) String str2, @SafeParcelable.Param(m51605id = 6) boolean z, @SafeParcelable.Param(m51605id = 7) ClientAppContext clientAppContext) {
        Bl9 c46982pd9;
        this.f71721b = i;
        this.f71722c = zzaeVar;
        if (iBinder == null) {
            c46982pd9 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            if (queryLocalInterface instanceof Bl9) {
                c46982pd9 = (Bl9) queryLocalInterface;
            } else {
                c46982pd9 = new C46982pd9(iBinder);
            }
        }
        this.f71723d = c46982pd9;
        this.f71724e = str;
        this.f71725f = str2;
        this.f71726g = z;
        this.f71727h = ClientAppContext.m50561s(clientAppContext, str2, str, z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f71721b);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f71722c, i, false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.f71723d.asBinder(), false);
        SafeParcelWriter.writeString(parcel, 4, this.f71724e, false);
        SafeParcelWriter.writeString(parcel, 5, this.f71725f, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.f71726g);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f71727h, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
