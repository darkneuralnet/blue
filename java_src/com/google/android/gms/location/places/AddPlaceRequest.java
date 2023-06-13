package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.stripe.android.model.PaymentMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@SafeParcelable.Class(creator = "AddPlaceRequestCreator")
@SafeParcelable.Reserved({1000})
@Deprecated
/* loaded from: classes6.dex */
public class AddPlaceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AddPlaceRequest> CREATOR = new zzc();
    @SafeParcelable.Field(getter = "getLatLng", m51606id = 2)
    private final LatLng latLng;
    @SafeParcelable.Field(getter = "getName", m51606id = 1)
    private final String name;
    @SafeParcelable.Field(getter = "getAddress", m51606id = 3)
    private final String zzf;
    @SafeParcelable.Field(getter = "getPlaceTypes", m51606id = 4)
    private final List<Integer> zzg;
    @SafeParcelable.Field(getter = "getPhoneNumber", m51606id = 5)
    private final String zzh;
    @SafeParcelable.Field(getter = "getWebsiteUri", m51606id = 6)
    private final Uri zzi;

    @SafeParcelable.Constructor
    public AddPlaceRequest(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) LatLng latLng, @SafeParcelable.Param(m51605id = 3) String str2, @SafeParcelable.Param(m51605id = 4) List<Integer> list, @SafeParcelable.Param(m51605id = 5) String str3, @SafeParcelable.Param(m51605id = 6) Uri uri) {
        this.name = Preconditions.checkNotEmpty(str);
        this.latLng = (LatLng) Preconditions.checkNotNull(latLng);
        this.zzf = Preconditions.checkNotEmpty(str2);
        ArrayList arrayList = new ArrayList((Collection) Preconditions.checkNotNull(list));
        this.zzg = arrayList;
        boolean z = true;
        Preconditions.checkArgument(!arrayList.isEmpty(), "At least one place type should be provided.");
        if (TextUtils.isEmpty(str3) && uri == null) {
            z = false;
        }
        Preconditions.checkArgument(z, "One of phone number or URI should be provided.");
        this.zzh = str3;
        this.zzi = uri;
    }

    public String getAddress() {
        return this.zzf;
    }

    public LatLng getLatLng() {
        return this.latLng;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.zzh;
    }

    public List<Integer> getPlaceTypes() {
        return this.zzg;
    }

    public Uri getWebsiteUri() {
        return this.zzi;
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", this.name).add("latLng", this.latLng).add(PaymentMethod.BillingDetails.PARAM_ADDRESS, this.zzf).add("placeTypes", this.zzg).add("phoneNumer", this.zzh).add("websiteUri", this.zzi).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getName(), false);
        SafeParcelWriter.writeParcelable(parcel, 2, getLatLng(), i, false);
        SafeParcelWriter.writeString(parcel, 3, getAddress(), false);
        SafeParcelWriter.writeIntegerList(parcel, 4, getPlaceTypes(), false);
        SafeParcelWriter.writeString(parcel, 5, getPhoneNumber(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, getWebsiteUri(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public AddPlaceRequest(String str, LatLng latLng, String str2, List<Integer> list, String str3) {
        this(str, latLng, str2, list, Preconditions.checkNotEmpty(str3), null);
    }

    public AddPlaceRequest(String str, LatLng latLng, String str2, List<Integer> list, Uri uri) {
        this(str, latLng, str2, list, null, (Uri) Preconditions.checkNotNull(uri));
    }
}
