package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "GetPermissionStatusRequestCreator")
@Deprecated
/* loaded from: classes6.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new C47903rA8();
    @SafeParcelable.VersionField(m51603id = 1)

    /* renamed from: b */
    public final int f71740b;
    @SafeParcelable.Field(getter = "getCallbackAsBinder", m51606id = 2, type = "android.os.IBinder")

    /* renamed from: c */
    public final Bl9 f71741c;
    @SafeParcelable.Field(m51606id = 3)
    @Deprecated

    /* renamed from: d */
    public final String f71742d;
    @SafeParcelable.Field(m51606id = 4)
    @Deprecated

    /* renamed from: e */
    public final ClientAppContext f71743e;

    @SafeParcelable.Constructor
    public zzh(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) IBinder iBinder, @SafeParcelable.Param(m51605id = 3) String str, @SafeParcelable.Param(m51605id = 4) ClientAppContext clientAppContext) {
        Bl9 c46982pd9;
        this.f71740b = i;
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
        this.f71741c = c46982pd9;
        this.f71742d = str;
        this.f71743e = ClientAppContext.m50561s(clientAppContext, null, str, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f71740b);
        SafeParcelWriter.writeIBinder(parcel, 2, this.f71741c.asBinder(), false);
        SafeParcelWriter.writeString(parcel, 3, this.f71742d, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f71743e, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
