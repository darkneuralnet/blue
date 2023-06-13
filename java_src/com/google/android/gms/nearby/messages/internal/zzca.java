package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "RegisterStatusCallbackRequestCreator")
/* loaded from: classes6.dex */
public final class zzca extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzca> CREATOR = new VQ7();
    @SafeParcelable.VersionField(m51603id = 1)

    /* renamed from: b */
    public final int f71715b;
    @SafeParcelable.Field(getter = "getCallbackAsBinder", m51606id = 2, type = "android.os.IBinder")

    /* renamed from: c */
    public final Bl9 f71716c;
    @SafeParcelable.Field(getter = "getStatusCallbackAsBinder", m51606id = 3, type = "android.os.IBinder")

    /* renamed from: d */
    public final InterfaceC53110zx9 f71717d;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: e */
    public boolean f71718e;
    @SafeParcelable.Field(m51606id = 5)
    @Deprecated

    /* renamed from: f */
    public String f71719f;
    @SafeParcelable.Field(m51606id = 6)
    @Deprecated

    /* renamed from: g */
    public final ClientAppContext f71720g;

    @SafeParcelable.Constructor
    public zzca(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) IBinder iBinder, @SafeParcelable.Param(m51605id = 3) IBinder iBinder2, @SafeParcelable.Param(m51605id = 4) boolean z, @SafeParcelable.Param(m51605id = 5) String str, @SafeParcelable.Param(m51605id = 6) ClientAppContext clientAppContext) {
        Bl9 c46982pd9;
        InterfaceC53110zx9 c47755qv9;
        this.f71715b = i;
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
        this.f71716c = c46982pd9;
        if (iBinder2 == null) {
            c47755qv9 = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IStatusCallback");
            if (queryLocalInterface2 instanceof InterfaceC53110zx9) {
                c47755qv9 = (InterfaceC53110zx9) queryLocalInterface2;
            } else {
                c47755qv9 = new C47755qv9(iBinder2);
            }
        }
        this.f71717d = c47755qv9;
        this.f71718e = z;
        this.f71719f = str;
        this.f71720g = ClientAppContext.m50561s(clientAppContext, null, str, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f71715b);
        SafeParcelWriter.writeIBinder(parcel, 2, this.f71716c.asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.f71717d.asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f71718e);
        SafeParcelWriter.writeString(parcel, 5, this.f71719f, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f71720g, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
