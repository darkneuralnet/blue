package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;
import java.util.ArrayList;
/* renamed from: com.google.firebase.dynamiclinks.internal.a */
/* loaded from: classes6.dex */
public class C18340a implements Parcelable.Creator<ShortDynamicLinkImpl> {
    /* renamed from: c */
    public static void m47292c(ShortDynamicLinkImpl shortDynamicLinkImpl, Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, shortDynamicLinkImpl.mo47298b(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, shortDynamicLinkImpl.m47297s(), i, false);
        SafeParcelWriter.writeTypedList(parcel, 3, shortDynamicLinkImpl.m47296u(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ShortDynamicLinkImpl createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Uri uri = null;
        Uri uri2 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader);
                    } else {
                        arrayList = SafeParcelReader.createTypedList(parcel, readHeader, ShortDynamicLinkImpl.WarningImpl.CREATOR);
                    }
                } else {
                    uri2 = (Uri) SafeParcelReader.createParcelable(parcel, readHeader, Uri.CREATOR);
                }
            } else {
                uri = (Uri) SafeParcelReader.createParcelable(parcel, readHeader, Uri.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new ShortDynamicLinkImpl(uri, uri2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b */
    public ShortDynamicLinkImpl[] newArray(int i) {
        return new ShortDynamicLinkImpl[i];
    }
}
