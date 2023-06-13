package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.Place;
import java.util.ArrayList;
/* loaded from: classes6.dex */
final class zzaq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        Double d;
        Integer num2;
        Integer num3;
        String str5;
        Integer num4;
        if (parcel.readInt() == 0) {
            str = parcel.readString();
        } else {
            str = null;
        }
        AddressComponents addressComponents = (AddressComponents) parcel.readParcelable(Place.class.getClassLoader());
        Place.BusinessStatus businessStatus = (Place.BusinessStatus) parcel.readParcelable(Place.class.getClassLoader());
        ArrayList readArrayList = parcel.readArrayList(Place.class.getClassLoader());
        if (parcel.readInt() == 0) {
            str2 = parcel.readString();
        } else {
            str2 = null;
        }
        LatLng latLng = (LatLng) parcel.readParcelable(Place.class.getClassLoader());
        if (parcel.readInt() == 0) {
            str3 = parcel.readString();
        } else {
            str3 = null;
        }
        OpeningHours openingHours = (OpeningHours) parcel.readParcelable(Place.class.getClassLoader());
        if (parcel.readInt() == 0) {
            str4 = parcel.readString();
        } else {
            str4 = null;
        }
        ArrayList readArrayList2 = parcel.readArrayList(Place.class.getClassLoader());
        PlusCode plusCode = (PlusCode) parcel.readParcelable(Place.class.getClassLoader());
        if (parcel.readInt() == 0) {
            num = Integer.valueOf(parcel.readInt());
        } else {
            num = null;
        }
        if (parcel.readInt() == 0) {
            d = Double.valueOf(parcel.readDouble());
        } else {
            d = null;
        }
        ArrayList readArrayList3 = parcel.readArrayList(Place.class.getClassLoader());
        if (parcel.readInt() == 0) {
            num2 = Integer.valueOf(parcel.readInt());
        } else {
            num2 = null;
        }
        if (parcel.readInt() == 0) {
            num3 = Integer.valueOf(parcel.readInt());
        } else {
            num3 = null;
        }
        LatLngBounds latLngBounds = (LatLngBounds) parcel.readParcelable(Place.class.getClassLoader());
        Uri uri = (Uri) parcel.readParcelable(Place.class.getClassLoader());
        if (parcel.readInt() == 0) {
            str5 = parcel.readString();
        } else {
            str5 = null;
        }
        if (parcel.readInt() == 0) {
            num4 = Integer.valueOf(parcel.readInt());
        } else {
            num4 = null;
        }
        return new zzar(str, addressComponents, businessStatus, readArrayList, str2, latLng, str3, openingHours, str4, readArrayList2, plusCode, num, d, readArrayList3, num2, num3, latLngBounds, uri, str5, num4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzar[i];
    }
}
