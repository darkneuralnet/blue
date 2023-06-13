package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;
@SafeParcelable.Class(creator = "StreetViewPanoramaOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new C35760Rs7();
    @SafeParcelable.Field(getter = "getStreetViewPanoramaCamera", m51606id = 2)

    /* renamed from: b */
    public StreetViewPanoramaCamera f71383b;
    @SafeParcelable.Field(getter = "getPanoramaId", m51606id = 3)

    /* renamed from: c */
    public String f71384c;
    @SafeParcelable.Field(getter = "getPosition", m51606id = 4)

    /* renamed from: d */
    public LatLng f71385d;
    @SafeParcelable.Field(getter = "getRadius", m51606id = 5)

    /* renamed from: e */
    public Integer f71386e;
    @SafeParcelable.Field(getter = "getUserNavigationEnabledForParcel", m51606id = 6, type = "byte")

    /* renamed from: f */
    public Boolean f71387f;
    @SafeParcelable.Field(getter = "getZoomGesturesEnabledForParcel", m51606id = 7, type = "byte")

    /* renamed from: g */
    public Boolean f71388g;
    @SafeParcelable.Field(getter = "getPanningGesturesEnabledForParcel", m51606id = 8, type = "byte")

    /* renamed from: h */
    public Boolean f71389h;
    @SafeParcelable.Field(getter = "getStreetNamesEnabledForParcel", m51606id = 9, type = "byte")

    /* renamed from: i */
    public Boolean f71390i;
    @SafeParcelable.Field(getter = "getUseViewLifecycleInFragmentForParcel", m51606id = 10, type = "byte")

    /* renamed from: j */
    public Boolean f71391j;
    @SafeParcelable.Field(getter = "getSource", m51606id = 11)

    /* renamed from: k */
    public StreetViewSource f71392k;

    public StreetViewPanoramaOptions() {
        Boolean bool = Boolean.TRUE;
        this.f71387f = bool;
        this.f71388g = bool;
        this.f71389h = bool;
        this.f71390i = bool;
        this.f71392k = StreetViewSource.f71493c;
    }

    /* renamed from: E */
    public StreetViewSource m50717E() {
        return this.f71392k;
    }

    /* renamed from: F */
    public StreetViewPanoramaCamera m50716F() {
        return this.f71383b;
    }

    /* renamed from: s */
    public String m50715s() {
        return this.f71384c;
    }

    public String toString() {
        return Objects.toStringHelper(this).add("PanoramaId", this.f71384c).add("Position", this.f71385d).add("Radius", this.f71386e).add("Source", this.f71392k).add("StreetViewPanoramaCamera", this.f71383b).add("UserNavigationEnabled", this.f71387f).add("ZoomGesturesEnabled", this.f71388g).add("PanningGesturesEnabled", this.f71389h).add("StreetNamesEnabled", this.f71390i).add("UseViewLifecycleInFragment", this.f71391j).toString();
    }

    /* renamed from: u */
    public LatLng m50714u() {
        return this.f71385d;
    }

    /* renamed from: v */
    public Integer m50713v() {
        return this.f71386e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, m50716F(), i, false);
        SafeParcelWriter.writeString(parcel, 3, m50715s(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, m50714u(), i, false);
        SafeParcelWriter.writeIntegerObject(parcel, 5, m50713v(), false);
        SafeParcelWriter.writeByte(parcel, 6, C33294He7.m103579a(this.f71387f));
        SafeParcelWriter.writeByte(parcel, 7, C33294He7.m103579a(this.f71388g));
        SafeParcelWriter.writeByte(parcel, 8, C33294He7.m103579a(this.f71389h));
        SafeParcelWriter.writeByte(parcel, 9, C33294He7.m103579a(this.f71390i));
        SafeParcelWriter.writeByte(parcel, 10, C33294He7.m103579a(this.f71391j));
        SafeParcelWriter.writeParcelable(parcel, 11, m50717E(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public StreetViewPanoramaOptions(@SafeParcelable.Param(m51605id = 2) StreetViewPanoramaCamera streetViewPanoramaCamera, @SafeParcelable.Param(m51605id = 3) String str, @SafeParcelable.Param(m51605id = 4) LatLng latLng, @SafeParcelable.Param(m51605id = 5) Integer num, @SafeParcelable.Param(m51605id = 6) byte b, @SafeParcelable.Param(m51605id = 7) byte b2, @SafeParcelable.Param(m51605id = 8) byte b3, @SafeParcelable.Param(m51605id = 9) byte b4, @SafeParcelable.Param(m51605id = 10) byte b5, @SafeParcelable.Param(m51605id = 11) StreetViewSource streetViewSource) {
        Boolean bool = Boolean.TRUE;
        this.f71387f = bool;
        this.f71388g = bool;
        this.f71389h = bool;
        this.f71390i = bool;
        this.f71392k = StreetViewSource.f71493c;
        this.f71383b = streetViewPanoramaCamera;
        this.f71385d = latLng;
        this.f71386e = num;
        this.f71384c = str;
        this.f71387f = C33294He7.m103578b(b);
        this.f71388g = C33294He7.m103578b(b2);
        this.f71389h = C33294He7.m103578b(b3);
        this.f71390i = C33294He7.m103578b(b4);
        this.f71391j = C33294He7.m103578b(b5);
        this.f71392k = streetViewSource;
    }
}
