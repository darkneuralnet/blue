package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
@SafeParcelable.Class(creator = "FullWalletCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class FullWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new AT8();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public String f71913b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public String f71914c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public zzaj f71915d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public String f71916e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public zza f71917f;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: g */
    public zza f71918g;
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: h */
    public String[] f71919h;
    @SafeParcelable.Field(m51606id = 9)

    /* renamed from: i */
    public UserAddress f71920i;
    @SafeParcelable.Field(m51606id = 10)

    /* renamed from: j */
    public UserAddress f71921j;
    @SafeParcelable.Field(m51606id = 11)

    /* renamed from: k */
    public InstrumentInfo[] f71922k;
    @SafeParcelable.Field(m51606id = 12)

    /* renamed from: l */
    public PaymentMethodToken f71923l;

    private FullWallet() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f71913b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f71914c, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f71915d, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.f71916e, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f71917f, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f71918g, i, false);
        SafeParcelWriter.writeStringArray(parcel, 8, this.f71919h, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f71920i, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f71921j, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 11, this.f71922k, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f71923l, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public FullWallet(@SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2, @SafeParcelable.Param(m51605id = 4) zzaj zzajVar, @SafeParcelable.Param(m51605id = 5) String str3, @SafeParcelable.Param(m51605id = 6) zza zzaVar, @SafeParcelable.Param(m51605id = 7) zza zzaVar2, @SafeParcelable.Param(m51605id = 8) String[] strArr, @SafeParcelable.Param(m51605id = 9) UserAddress userAddress, @SafeParcelable.Param(m51605id = 10) UserAddress userAddress2, @SafeParcelable.Param(m51605id = 11) InstrumentInfo[] instrumentInfoArr, @SafeParcelable.Param(m51605id = 12) PaymentMethodToken paymentMethodToken) {
        this.f71913b = str;
        this.f71914c = str2;
        this.f71915d = zzajVar;
        this.f71916e = str3;
        this.f71917f = zzaVar;
        this.f71918g = zzaVar2;
        this.f71919h = strArr;
        this.f71920i = userAddress;
        this.f71921j = userAddress2;
        this.f71922k = instrumentInfoArr;
        this.f71923l = paymentMethodToken;
    }
}
