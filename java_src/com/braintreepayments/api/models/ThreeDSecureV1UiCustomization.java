package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes2.dex */
public class ThreeDSecureV1UiCustomization implements Parcelable {
    public static final Parcelable.Creator<ThreeDSecureV1UiCustomization> CREATOR = new C16997a();

    /* renamed from: b */
    public String f68916b;

    /* renamed from: c */
    public String f68917c;

    /* renamed from: com.braintreepayments.api.models.ThreeDSecureV1UiCustomization$a */
    /* loaded from: classes2.dex */
    public static class C16997a implements Parcelable.Creator<ThreeDSecureV1UiCustomization> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ThreeDSecureV1UiCustomization createFromParcel(Parcel parcel) {
            return new ThreeDSecureV1UiCustomization(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ThreeDSecureV1UiCustomization[] newArray(int i) {
            return new ThreeDSecureV1UiCustomization[i];
        }
    }

    public /* synthetic */ ThreeDSecureV1UiCustomization(Parcel parcel, C16997a c16997a) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68916b);
        parcel.writeString(this.f68917c);
    }

    public ThreeDSecureV1UiCustomization() {
    }

    public ThreeDSecureV1UiCustomization(Parcel parcel) {
        this.f68916b = parcel.readString();
        this.f68917c = parcel.readString();
    }
}
