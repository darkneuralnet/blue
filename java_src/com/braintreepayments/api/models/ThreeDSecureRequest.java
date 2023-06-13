package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.cardinalcommerce.shared.userinterfaces.UiCustomization;
/* loaded from: classes2.dex */
public class ThreeDSecureRequest implements Parcelable {
    public static final Parcelable.Creator<ThreeDSecureRequest> CREATOR = new C16996a();

    /* renamed from: b */
    public String f68902b;

    /* renamed from: c */
    public String f68903c;

    /* renamed from: d */
    public String f68904d;

    /* renamed from: e */
    public String f68905e;

    /* renamed from: f */
    public String f68906f;

    /* renamed from: g */
    public ThreeDSecurePostalAddress f68907g;

    /* renamed from: h */
    public String f68908h;

    /* renamed from: i */
    public String f68909i;

    /* renamed from: j */
    public ThreeDSecureAdditionalInformation f68910j;

    /* renamed from: k */
    public boolean f68911k;

    /* renamed from: l */
    public boolean f68912l;

    /* renamed from: m */
    public boolean f68913m;

    /* renamed from: n */
    public UiCustomization f68914n;

    /* renamed from: o */
    public ThreeDSecureV1UiCustomization f68915o;

    /* renamed from: com.braintreepayments.api.models.ThreeDSecureRequest$a */
    /* loaded from: classes2.dex */
    public static class C16996a implements Parcelable.Creator<ThreeDSecureRequest> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ThreeDSecureRequest createFromParcel(Parcel parcel) {
            return new ThreeDSecureRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ThreeDSecureRequest[] newArray(int i) {
            return new ThreeDSecureRequest[i];
        }
    }

    public ThreeDSecureRequest() {
        this.f68908h = "1";
        this.f68911k = false;
        this.f68912l = false;
        this.f68913m = false;
        this.f68914n = new UiCustomization();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68902b);
        parcel.writeString(this.f68903c);
        parcel.writeString(this.f68904d);
        parcel.writeString(this.f68905e);
        parcel.writeString(this.f68906f);
        parcel.writeParcelable(this.f68907g, i);
        parcel.writeString(this.f68908h);
        parcel.writeParcelable(this.f68910j, i);
        parcel.writeByte(this.f68911k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f68912l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f68913m ? (byte) 1 : (byte) 0);
        parcel.writeSerializable(this.f68914n);
        parcel.writeParcelable(this.f68915o, i);
        parcel.writeString(this.f68909i);
    }

    public ThreeDSecureRequest(Parcel parcel) {
        this.f68908h = "1";
        this.f68911k = false;
        this.f68912l = false;
        this.f68913m = false;
        this.f68902b = parcel.readString();
        this.f68903c = parcel.readString();
        this.f68904d = parcel.readString();
        this.f68905e = parcel.readString();
        this.f68906f = parcel.readString();
        this.f68907g = (ThreeDSecurePostalAddress) parcel.readParcelable(ThreeDSecurePostalAddress.class.getClassLoader());
        this.f68908h = parcel.readString();
        this.f68910j = (ThreeDSecureAdditionalInformation) parcel.readParcelable(ThreeDSecureAdditionalInformation.class.getClassLoader());
        this.f68911k = parcel.readByte() > 0;
        this.f68912l = parcel.readByte() > 0;
        this.f68913m = parcel.readByte() > 0;
        this.f68914n = parcel.readSerializable();
        this.f68915o = (ThreeDSecureV1UiCustomization) parcel.readParcelable(ThreeDSecureV1UiCustomization.class.getClassLoader());
        this.f68909i = parcel.readString();
    }
}
