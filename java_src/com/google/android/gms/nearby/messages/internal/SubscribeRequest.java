package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;
@SafeParcelable.Class(creator = "SubscribeRequestCreator")
/* loaded from: classes6.dex */
public final class SubscribeRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SubscribeRequest> CREATOR = new C44497lR7();
    @SafeParcelable.VersionField(m51603id = 1)

    /* renamed from: b */
    public final int f71672b;
    @SafeParcelable.Field(getter = "getMessageListenerAsBinder", m51606id = 2, type = "android.os.IBinder")

    /* renamed from: c */
    public final InterfaceC46115o99 f71673c;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: d */
    public final Strategy f71674d;
    @SafeParcelable.Field(getter = "getCallbackAsBinder", m51606id = 4, type = "android.os.IBinder")

    /* renamed from: e */
    public final Bl9 f71675e;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: f */
    public final MessageFilter f71676f;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: g */
    public final PendingIntent f71677g;
    @SafeParcelable.Field(m51606id = 7)
    @Deprecated

    /* renamed from: h */
    public final int f71678h;
    @SafeParcelable.Field(m51606id = 8)
    @Deprecated

    /* renamed from: i */
    public final String f71679i;
    @SafeParcelable.Field(m51606id = 9)
    @Deprecated

    /* renamed from: j */
    public final String f71680j;
    @SafeParcelable.Field(m51606id = 10)

    /* renamed from: k */
    public final byte[] f71681k;
    @SafeParcelable.Field(m51606id = 11)
    @Deprecated

    /* renamed from: l */
    public final boolean f71682l;
    @SafeParcelable.Field(getter = "getSubscribeCallbackAsBinder", m51606id = 12, type = "android.os.IBinder")

    /* renamed from: m */
    public final InterfaceC33078Gg7 f71683m;
    @SafeParcelable.Field(m51606id = 13)
    @Deprecated

    /* renamed from: n */
    public final boolean f71684n;
    @SafeParcelable.Field(m51606id = 14)
    @Deprecated

    /* renamed from: o */
    public final ClientAppContext f71685o;
    @SafeParcelable.Field(m51606id = 15)

    /* renamed from: p */
    public final boolean f71686p;
    @SafeParcelable.Field(m51606id = 16)

    /* renamed from: q */
    public final int f71687q;
    @SafeParcelable.Field(m51606id = 17)

    /* renamed from: r */
    public final int f71688r;

    @SafeParcelable.Constructor
    @VisibleForTesting
    public SubscribeRequest(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) IBinder iBinder, @SafeParcelable.Param(m51605id = 3) Strategy strategy, @SafeParcelable.Param(m51605id = 4) IBinder iBinder2, @SafeParcelable.Param(m51605id = 5) MessageFilter messageFilter, @SafeParcelable.Param(m51605id = 6) PendingIntent pendingIntent, @SafeParcelable.Param(m51605id = 7) int i2, @SafeParcelable.Param(m51605id = 8) String str, @SafeParcelable.Param(m51605id = 9) String str2, @SafeParcelable.Param(m51605id = 10) byte[] bArr, @SafeParcelable.Param(m51605id = 11) boolean z, @SafeParcelable.Param(m51605id = 12) IBinder iBinder3, @SafeParcelable.Param(m51605id = 13) boolean z2, @SafeParcelable.Param(m51605id = 14) ClientAppContext clientAppContext, @SafeParcelable.Param(m51605id = 15) boolean z3, @SafeParcelable.Param(m51605id = 16) int i3, @SafeParcelable.Param(m51605id = 17) int i4) {
        InterfaceC46115o99 c46349oZ8;
        Bl9 c46982pd9;
        this.f71672b = i;
        InterfaceC33078Gg7 interfaceC33078Gg7 = null;
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
        this.f71673c = c46349oZ8;
        this.f71674d = strategy;
        if (iBinder2 == null) {
            c46982pd9 = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            if (queryLocalInterface2 instanceof Bl9) {
                c46982pd9 = (Bl9) queryLocalInterface2;
            } else {
                c46982pd9 = new C46982pd9(iBinder2);
            }
        }
        this.f71675e = c46982pd9;
        this.f71676f = messageFilter;
        this.f71677g = pendingIntent;
        this.f71678h = i2;
        this.f71679i = str;
        this.f71680j = str2;
        this.f71681k = bArr;
        this.f71682l = z;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
            if (queryLocalInterface3 instanceof InterfaceC33078Gg7) {
                interfaceC33078Gg7 = (InterfaceC33078Gg7) queryLocalInterface3;
            } else {
                interfaceC33078Gg7 = new C53120zy9(iBinder3);
            }
        }
        this.f71683m = interfaceC33078Gg7;
        this.f71684n = z2;
        this.f71685o = ClientAppContext.m50561s(clientAppContext, str2, str, z2);
        this.f71686p = z3;
        this.f71687q = i3;
        this.f71688r = i4;
    }

    public final String toString() {
        String sb;
        String valueOf = String.valueOf(this.f71673c);
        String valueOf2 = String.valueOf(this.f71674d);
        String valueOf3 = String.valueOf(this.f71675e);
        String valueOf4 = String.valueOf(this.f71676f);
        String valueOf5 = String.valueOf(this.f71677g);
        byte[] bArr = this.f71681k;
        if (bArr == null) {
            sb = null;
        } else {
            int length = bArr.length;
            StringBuilder sb2 = new StringBuilder(19);
            sb2.append("<");
            sb2.append(length);
            sb2.append(" bytes>");
            sb = sb2.toString();
        }
        String valueOf6 = String.valueOf(this.f71683m);
        boolean z = this.f71684n;
        String valueOf7 = String.valueOf(this.f71685o);
        boolean z2 = this.f71686p;
        String str = this.f71679i;
        String str2 = this.f71680j;
        boolean z3 = this.f71682l;
        int i = this.f71688r;
        int length2 = valueOf.length();
        int length3 = valueOf2.length();
        int length4 = valueOf3.length();
        int length5 = valueOf4.length();
        int length6 = valueOf5.length();
        int length7 = String.valueOf(sb).length();
        int length8 = valueOf6.length();
        int length9 = valueOf7.length();
        StringBuilder sb3 = new StringBuilder(length2 + 291 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb3.append("SubscribeRequest{messageListener=");
        sb3.append(valueOf);
        sb3.append(", strategy=");
        sb3.append(valueOf2);
        sb3.append(", callback=");
        sb3.append(valueOf3);
        sb3.append(", filter=");
        sb3.append(valueOf4);
        sb3.append(", pendingIntent=");
        sb3.append(valueOf5);
        sb3.append(", hint=");
        sb3.append(sb);
        sb3.append(", subscribeCallback=");
        sb3.append(valueOf6);
        sb3.append(", useRealClientApiKey=");
        sb3.append(z);
        sb3.append(", clientAppContext=");
        sb3.append(valueOf7);
        sb3.append(", isDiscardPendingIntent=");
        sb3.append(z2);
        sb3.append(", zeroPartyPackageName=");
        sb3.append(str);
        sb3.append(", realClientPackageName=");
        sb3.append(str2);
        sb3.append(", isIgnoreNearbyPermission=");
        sb3.append(z3);
        sb3.append(", callingContext=");
        sb3.append(i);
        sb3.append("}");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        IBinder asBinder2;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f71672b);
        InterfaceC46115o99 interfaceC46115o99 = this.f71673c;
        IBinder iBinder = null;
        if (interfaceC46115o99 == null) {
            asBinder = null;
        } else {
            asBinder = interfaceC46115o99.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 2, asBinder, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f71674d, i, false);
        Bl9 bl9 = this.f71675e;
        if (bl9 == null) {
            asBinder2 = null;
        } else {
            asBinder2 = bl9.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 4, asBinder2, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f71676f, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f71677g, i, false);
        SafeParcelWriter.writeInt(parcel, 7, this.f71678h);
        SafeParcelWriter.writeString(parcel, 8, this.f71679i, false);
        SafeParcelWriter.writeString(parcel, 9, this.f71680j, false);
        SafeParcelWriter.writeByteArray(parcel, 10, this.f71681k, false);
        SafeParcelWriter.writeBoolean(parcel, 11, this.f71682l);
        InterfaceC33078Gg7 interfaceC33078Gg7 = this.f71683m;
        if (interfaceC33078Gg7 != null) {
            iBinder = interfaceC33078Gg7.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 12, iBinder, false);
        SafeParcelWriter.writeBoolean(parcel, 13, this.f71684n);
        SafeParcelWriter.writeParcelable(parcel, 14, this.f71685o, i, false);
        SafeParcelWriter.writeBoolean(parcel, 15, this.f71686p);
        SafeParcelWriter.writeInt(parcel, 16, this.f71687q);
        SafeParcelWriter.writeInt(parcel, 17, this.f71688r);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
