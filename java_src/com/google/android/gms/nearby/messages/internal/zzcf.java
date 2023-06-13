package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "UnsubscribeRequestCreator")
/* loaded from: classes6.dex */
public final class zzcf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcf> CREATOR = new C49249tS7();
    @SafeParcelable.VersionField(m51603id = 1)

    /* renamed from: b */
    public final int f71728b;
    @SafeParcelable.Field(getter = "getMessageListenerAsBinder", m51606id = 2, type = "android.os.IBinder")

    /* renamed from: c */
    public final InterfaceC46115o99 f71729c;
    @SafeParcelable.Field(getter = "getCallbackAsBinder", m51606id = 3, type = "android.os.IBinder")

    /* renamed from: d */
    public final Bl9 f71730d;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: e */
    public final PendingIntent f71731e;
    @SafeParcelable.Field(m51606id = 5)
    @Deprecated

    /* renamed from: f */
    public final int f71732f;
    @SafeParcelable.Field(m51606id = 6)
    @Deprecated

    /* renamed from: g */
    public final String f71733g;
    @SafeParcelable.Field(m51606id = 7)
    @Deprecated

    /* renamed from: h */
    public final String f71734h;
    @SafeParcelable.Field(m51606id = 8)
    @Deprecated

    /* renamed from: i */
    public final boolean f71735i;
    @SafeParcelable.Field(m51606id = 9)
    @Deprecated

    /* renamed from: j */
    public final ClientAppContext f71736j;

    @SafeParcelable.Constructor
    public zzcf(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) IBinder iBinder, @SafeParcelable.Param(m51605id = 3) IBinder iBinder2, @SafeParcelable.Param(m51605id = 4) PendingIntent pendingIntent, @SafeParcelable.Param(m51605id = 5) int i2, @SafeParcelable.Param(m51605id = 6) String str, @SafeParcelable.Param(m51605id = 7) String str2, @SafeParcelable.Param(m51605id = 8) boolean z, @SafeParcelable.Param(m51605id = 9) ClientAppContext clientAppContext) {
        InterfaceC46115o99 c46349oZ8;
        this.f71728b = i;
        Bl9 bl9 = null;
        if (iBinder == null) {
            c46349oZ8 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            if (queryLocalInterface instanceof InterfaceC46115o99) {
                c46349oZ8 = (InterfaceC46115o99) queryLocalInterface;
            } else {
                c46349oZ8 = new C46349oZ8(iBinder);
            }
        }
        this.f71729c = c46349oZ8;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            if (queryLocalInterface2 instanceof Bl9) {
                bl9 = (Bl9) queryLocalInterface2;
            } else {
                bl9 = new C46982pd9(iBinder2);
            }
        }
        this.f71730d = bl9;
        this.f71731e = pendingIntent;
        this.f71732f = i2;
        this.f71733g = str;
        this.f71734h = str2;
        this.f71735i = z;
        this.f71736j = ClientAppContext.m50561s(clientAppContext, str2, str, z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f71728b);
        InterfaceC46115o99 interfaceC46115o99 = this.f71729c;
        if (interfaceC46115o99 == null) {
            asBinder = null;
        } else {
            asBinder = interfaceC46115o99.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 2, asBinder, false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.f71730d.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f71731e, i, false);
        SafeParcelWriter.writeInt(parcel, 5, this.f71732f);
        SafeParcelWriter.writeString(parcel, 6, this.f71733g, false);
        SafeParcelWriter.writeString(parcel, 7, this.f71734h, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f71735i);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f71736j, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
