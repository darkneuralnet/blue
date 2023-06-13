package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.ShippingAddressRequirements;
import com.google.android.gms.wallet.TransactionInfo;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class GooglePaymentRequest implements Parcelable {
    public static final Parcelable.Creator<GooglePaymentRequest> CREATOR = new C16981a();

    /* renamed from: b */
    public TransactionInfo f68738b;

    /* renamed from: c */
    public Boolean f68739c;

    /* renamed from: d */
    public Boolean f68740d;

    /* renamed from: e */
    public Boolean f68741e;

    /* renamed from: f */
    public Integer f68742f;

    /* renamed from: g */
    public Boolean f68743g;

    /* renamed from: h */
    public ShippingAddressRequirements f68744h;

    /* renamed from: i */
    public Boolean f68745i;

    /* renamed from: j */
    public boolean f68746j;

    /* renamed from: k */
    public HashMap<String, JSONObject> f68747k;

    /* renamed from: l */
    public HashMap<String, JSONObject> f68748l;

    /* renamed from: m */
    public HashMap<String, JSONArray> f68749m;

    /* renamed from: n */
    public HashMap<String, JSONArray> f68750n;

    /* renamed from: o */
    public String f68751o;

    /* renamed from: p */
    public String f68752p;

    /* renamed from: q */
    public String f68753q;

    /* renamed from: com.braintreepayments.api.models.GooglePaymentRequest$a */
    /* loaded from: classes2.dex */
    public static class C16981a implements Parcelable.Creator<GooglePaymentRequest> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public GooglePaymentRequest createFromParcel(Parcel parcel) {
            return new GooglePaymentRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public GooglePaymentRequest[] newArray(int i) {
            return new GooglePaymentRequest[i];
        }
    }

    public GooglePaymentRequest() {
        this.f68739c = null;
        this.f68740d = null;
        this.f68741e = null;
        this.f68743g = null;
        this.f68745i = null;
        this.f68746j = true;
        this.f68747k = new HashMap<>();
        this.f68748l = new HashMap<>();
        this.f68749m = new HashMap<>();
        this.f68750n = new HashMap<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        parcel.writeParcelable(this.f68738b, i);
        Boolean bool = this.f68739c;
        int i6 = 2;
        if (bool == null) {
            i2 = 0;
        } else if (bool.booleanValue()) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        parcel.writeByte((byte) i2);
        Boolean bool2 = this.f68740d;
        if (bool2 == null) {
            i3 = 0;
        } else if (bool2.booleanValue()) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        parcel.writeByte((byte) i3);
        Boolean bool3 = this.f68741e;
        if (bool3 == null) {
            i4 = 0;
        } else if (bool3.booleanValue()) {
            i4 = 1;
        } else {
            i4 = 2;
        }
        parcel.writeByte((byte) i4);
        if (this.f68742f == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.f68742f.intValue());
        }
        Boolean bool4 = this.f68743g;
        if (bool4 == null) {
            i5 = 0;
        } else if (bool4.booleanValue()) {
            i5 = 1;
        } else {
            i5 = 2;
        }
        parcel.writeByte((byte) i5);
        parcel.writeParcelable(this.f68744h, i);
        Boolean bool5 = this.f68745i;
        if (bool5 == null) {
            i6 = 0;
        } else if (bool5.booleanValue()) {
            i6 = 1;
        }
        parcel.writeByte((byte) i6);
        parcel.writeString(this.f68751o);
        parcel.writeString(this.f68752p);
        parcel.writeString(this.f68753q);
    }

    public GooglePaymentRequest(Parcel parcel) {
        Boolean valueOf;
        Boolean valueOf2;
        Boolean valueOf3;
        Boolean valueOf4;
        Boolean bool = null;
        this.f68739c = null;
        this.f68740d = null;
        this.f68741e = null;
        this.f68743g = null;
        this.f68745i = null;
        this.f68746j = true;
        this.f68747k = new HashMap<>();
        this.f68748l = new HashMap<>();
        this.f68749m = new HashMap<>();
        this.f68750n = new HashMap<>();
        this.f68738b = (TransactionInfo) parcel.readParcelable(TransactionInfo.class.getClassLoader());
        byte readByte = parcel.readByte();
        if (readByte == 0) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(readByte == 1);
        }
        this.f68739c = valueOf;
        byte readByte2 = parcel.readByte();
        if (readByte2 == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Boolean.valueOf(readByte2 == 1);
        }
        this.f68740d = valueOf2;
        byte readByte3 = parcel.readByte();
        if (readByte3 == 0) {
            valueOf3 = null;
        } else {
            valueOf3 = Boolean.valueOf(readByte3 == 1);
        }
        this.f68741e = valueOf3;
        if (parcel.readByte() == 0) {
            this.f68742f = null;
        } else {
            this.f68742f = Integer.valueOf(parcel.readInt());
        }
        byte readByte4 = parcel.readByte();
        if (readByte4 == 0) {
            valueOf4 = null;
        } else {
            valueOf4 = Boolean.valueOf(readByte4 == 1);
        }
        this.f68743g = valueOf4;
        this.f68744h = (ShippingAddressRequirements) parcel.readParcelable(ShippingAddressRequirements.class.getClassLoader());
        byte readByte5 = parcel.readByte();
        if (readByte5 != 0) {
            bool = Boolean.valueOf(readByte5 == 1);
        }
        this.f68745i = bool;
        this.f68751o = parcel.readString();
        this.f68752p = parcel.readString();
        this.f68753q = parcel.readString();
    }
}
