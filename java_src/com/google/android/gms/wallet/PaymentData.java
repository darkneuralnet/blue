package com.google.android.gms.wallet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.identity.intents.model.UserAddress;
@SafeParcelable.Class(creator = "PaymentDataCreator")
/* loaded from: classes6.dex */
public final class PaymentData extends AbstractSafeParcelable implements InterfaceC10421Zs {
    public static final Parcelable.Creator<PaymentData> CREATOR = new C33303Hf7();
    @SafeParcelable.Field(m51606id = 1)

    /* renamed from: b */
    public String f71983b;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: c */
    public CardInfo f71984c;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: d */
    public UserAddress f71985d;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: e */
    public PaymentMethodToken f71986e;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: f */
    public String f71987f;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: g */
    public Bundle f71988g;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: h */
    public String f71989h;
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: i */
    public Bundle f71990i;

    private PaymentData() {
    }

    /* renamed from: s */
    public static PaymentData m50525s(Intent intent) {
        return (PaymentData) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.wallet.PaymentData", CREATOR);
    }

    @Override // p000.InterfaceC10421Zs
    /* renamed from: a */
    public void mo50526a(Intent intent) {
        SafeParcelableSerializer.serializeToIntentExtra(this, intent, "com.google.android.gms.wallet.PaymentData");
    }

    /* renamed from: u */
    public String m50524u() {
        return this.f71989h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f71983b, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f71984c, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f71985d, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f71986e, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.f71987f, false);
        SafeParcelWriter.writeBundle(parcel, 6, this.f71988g, false);
        SafeParcelWriter.writeString(parcel, 7, this.f71989h, false);
        SafeParcelWriter.writeBundle(parcel, 8, this.f71990i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public PaymentData(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) CardInfo cardInfo, @SafeParcelable.Param(m51605id = 3) UserAddress userAddress, @SafeParcelable.Param(m51605id = 4) PaymentMethodToken paymentMethodToken, @SafeParcelable.Param(m51605id = 5) String str2, @SafeParcelable.Param(m51605id = 6) Bundle bundle, @SafeParcelable.Param(m51605id = 7) String str3, @SafeParcelable.Param(m51605id = 8) Bundle bundle2) {
        this.f71983b = str;
        this.f71984c = cardInfo;
        this.f71985d = userAddress;
        this.f71986e = paymentMethodToken;
        this.f71987f = str2;
        this.f71988g = bundle;
        this.f71989h = str3;
        this.f71990i = bundle2;
    }
}
