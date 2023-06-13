package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
@SafeParcelable.Class(creator = "PaymentDataRequestCreator")
/* loaded from: classes6.dex */
public final class PaymentDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentDataRequest> CREATOR = new C31917Bh7();
    @SafeParcelable.Field(m51606id = 1)

    /* renamed from: b */
    public boolean f71991b;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: c */
    public boolean f71992c;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: d */
    public CardRequirements f71993d;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: e */
    public boolean f71994e;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: f */
    public ShippingAddressRequirements f71995f;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: g */
    public ArrayList f71996g;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: h */
    public PaymentMethodTokenizationParameters f71997h;
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: i */
    public TransactionInfo f71998i;
    @SafeParcelable.Field(defaultValue = "true", m51606id = 9)

    /* renamed from: j */
    public boolean f71999j;
    @SafeParcelable.Field(m51606id = 10)

    /* renamed from: k */
    public String f72000k;
    @ShowFirstParty
    @SafeParcelable.Field(m51606id = 12)

    /* renamed from: l */
    public byte[] f72001l;
    @SafeParcelable.Field(m51606id = 11)

    /* renamed from: m */
    public Bundle f72002m;

    @Deprecated
    /* renamed from: com.google.android.gms.wallet.PaymentDataRequest$a */
    /* loaded from: classes6.dex */
    public final class C17644a {
        public /* synthetic */ C17644a(C33312Hg7 c33312Hg7) {
        }

        /* renamed from: a */
        public PaymentDataRequest m50521a() {
            PaymentDataRequest paymentDataRequest = PaymentDataRequest.this;
            if (paymentDataRequest.f72000k == null && paymentDataRequest.f72001l == null) {
                Preconditions.checkNotNull(paymentDataRequest.f71996g, "Allowed payment methods must be set! You can set it through addAllowedPaymentMethod() or addAllowedPaymentMethods() in the PaymentDataRequest Builder.");
                Preconditions.checkNotNull(PaymentDataRequest.this.f71993d, "Card requirements must be set!");
                PaymentDataRequest paymentDataRequest2 = PaymentDataRequest.this;
                if (paymentDataRequest2.f71997h != null) {
                    Preconditions.checkNotNull(paymentDataRequest2.f71998i, "Transaction info must be set if paymentMethodTokenizationParameters is set!");
                }
            }
            return PaymentDataRequest.this;
        }
    }

    private PaymentDataRequest() {
        this.f71999j = true;
    }

    /* renamed from: s */
    public static PaymentDataRequest m50523s(String str) {
        C17644a m50522u = m50522u();
        PaymentDataRequest.this.f72000k = (String) Preconditions.checkNotNull(str, "paymentDataRequestJson cannot be null!");
        return m50522u.m50521a();
    }

    @Deprecated
    /* renamed from: u */
    public static C17644a m50522u() {
        return new C17644a(null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.f71991b);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f71992c);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f71993d, i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f71994e);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f71995f, i, false);
        SafeParcelWriter.writeIntegerList(parcel, 6, this.f71996g, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f71997h, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f71998i, i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.f71999j);
        SafeParcelWriter.writeString(parcel, 10, this.f72000k, false);
        SafeParcelWriter.writeBundle(parcel, 11, this.f72002m, false);
        SafeParcelWriter.writeByteArray(parcel, 12, this.f72001l, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public PaymentDataRequest(@SafeParcelable.Param(m51605id = 1) boolean z, @SafeParcelable.Param(m51605id = 2) boolean z2, @SafeParcelable.Param(m51605id = 3) CardRequirements cardRequirements, @SafeParcelable.Param(m51605id = 4) boolean z3, @SafeParcelable.Param(m51605id = 5) ShippingAddressRequirements shippingAddressRequirements, @SafeParcelable.Param(m51605id = 6) ArrayList arrayList, @SafeParcelable.Param(m51605id = 7) PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, @SafeParcelable.Param(m51605id = 8) TransactionInfo transactionInfo, @SafeParcelable.Param(m51605id = 9) boolean z4, @SafeParcelable.Param(m51605id = 10) String str, @SafeParcelable.Param(m51605id = 12) byte[] bArr, @SafeParcelable.Param(m51605id = 11) Bundle bundle) {
        this.f71991b = z;
        this.f71992c = z2;
        this.f71993d = cardRequirements;
        this.f71994e = z3;
        this.f71995f = shippingAddressRequirements;
        this.f71996g = arrayList;
        this.f71997h = paymentMethodTokenizationParameters;
        this.f71998i = transactionInfo;
        this.f71999j = z4;
        this.f72000k = str;
        this.f72001l = bArr;
        this.f72002m = bundle;
    }
}
