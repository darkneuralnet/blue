package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.Strategy;
@SafeParcelable.Class(creator = "PublishRequestCreator")
/* loaded from: classes6.dex */
public final class zzby extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzby> CREATOR = new C42107hP7();
    @SafeParcelable.VersionField(m51603id = 1)

    /* renamed from: b */
    public final int f71704b;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: c */
    public final zzae f71705c;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: d */
    public final Strategy f71706d;
    @SafeParcelable.Field(getter = "getCallbackAsBinder", m51606id = 4, type = "android.os.IBinder")

    /* renamed from: e */
    public final Bl9 f71707e;
    @SafeParcelable.Field(m51606id = 5)
    @Deprecated

    /* renamed from: f */
    public final String f71708f;
    @SafeParcelable.Field(m51606id = 6)
    @Deprecated

    /* renamed from: g */
    public final String f71709g;
    @SafeParcelable.Field(m51606id = 7)
    @Deprecated

    /* renamed from: h */
    public final boolean f71710h;
    @SafeParcelable.Field(getter = "getPublishCallbackAsBinder", m51606id = 8, type = "android.os.IBinder")

    /* renamed from: i */
    public final St9 f71711i;
    @SafeParcelable.Field(m51606id = 9)
    @Deprecated

    /* renamed from: j */
    public final boolean f71712j;
    @SafeParcelable.Field(m51606id = 10)
    @Deprecated

    /* renamed from: k */
    public final ClientAppContext f71713k;
    @SafeParcelable.Field(m51606id = 11)

    /* renamed from: l */
    public final int f71714l;

    @SafeParcelable.Constructor
    public zzby(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) zzae zzaeVar, @SafeParcelable.Param(m51605id = 3) Strategy strategy, @SafeParcelable.Param(m51605id = 4) IBinder iBinder, @SafeParcelable.Param(m51605id = 5) String str, @SafeParcelable.Param(m51605id = 6) String str2, @SafeParcelable.Param(m51605id = 7) boolean z, @SafeParcelable.Param(m51605id = 8) IBinder iBinder2, @SafeParcelable.Param(m51605id = 9) boolean z2, @SafeParcelable.Param(m51605id = 10) ClientAppContext clientAppContext, @SafeParcelable.Param(m51605id = 11) int i2) {
        Bl9 c46982pd9;
        this.f71704b = i;
        this.f71705c = zzaeVar;
        this.f71706d = strategy;
        St9 st9 = null;
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
        this.f71707e = c46982pd9;
        this.f71708f = str;
        this.f71709g = str2;
        this.f71710h = z;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IPublishCallback");
            if (queryLocalInterface2 instanceof St9) {
                st9 = (St9) queryLocalInterface2;
            } else {
                st9 = new Kq9(iBinder2);
            }
        }
        this.f71711i = st9;
        this.f71712j = z2;
        this.f71713k = ClientAppContext.m50561s(clientAppContext, str2, str, z2);
        this.f71714l = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f71704b);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f71705c, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f71706d, i, false);
        SafeParcelWriter.writeIBinder(parcel, 4, this.f71707e.asBinder(), false);
        SafeParcelWriter.writeString(parcel, 5, this.f71708f, false);
        SafeParcelWriter.writeString(parcel, 6, this.f71709g, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f71710h);
        St9 st9 = this.f71711i;
        if (st9 == null) {
            asBinder = null;
        } else {
            asBinder = st9.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 8, asBinder, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.f71712j);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f71713k, i, false);
        SafeParcelWriter.writeInt(parcel, 11, this.f71714l);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
