package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p000.WO1;
@SafeParcelable.Class(creator = "GroundOverlayOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new YX7();
    @SafeParcelable.Field(getter = "getWrappedImageDescriptorImplBinder", m51606id = 2, type = "android.os.IBinder")

    /* renamed from: b */
    public C6378PT f71418b;
    @SafeParcelable.Field(getter = "getLocation", m51606id = 3)

    /* renamed from: c */
    public LatLng f71419c;
    @SafeParcelable.Field(getter = "getWidth", m51606id = 4)

    /* renamed from: d */
    public float f71420d;
    @SafeParcelable.Field(getter = "getHeight", m51606id = 5)

    /* renamed from: e */
    public float f71421e;
    @SafeParcelable.Field(getter = "getBounds", m51606id = 6)

    /* renamed from: f */
    public LatLngBounds f71422f;
    @SafeParcelable.Field(getter = "getBearing", m51606id = 7)

    /* renamed from: g */
    public float f71423g;
    @SafeParcelable.Field(getter = "getZIndex", m51606id = 8)

    /* renamed from: h */
    public float f71424h;
    @SafeParcelable.Field(getter = "isVisible", m51606id = 9)

    /* renamed from: i */
    public boolean f71425i;
    @SafeParcelable.Field(getter = "getTransparency", m51606id = 10)

    /* renamed from: j */
    public float f71426j;
    @SafeParcelable.Field(getter = "getAnchorU", m51606id = 11)

    /* renamed from: k */
    public float f71427k;
    @SafeParcelable.Field(getter = "getAnchorV", m51606id = 12)

    /* renamed from: l */
    public float f71428l;
    @SafeParcelable.Field(getter = "isClickable", m51606id = 13)

    /* renamed from: m */
    public boolean f71429m;

    public GroundOverlayOptions() {
        this.f71425i = true;
        this.f71426j = 0.0f;
        this.f71427k = 0.5f;
        this.f71428l = 0.5f;
        this.f71429m = false;
    }

    /* renamed from: D0 */
    public GroundOverlayOptions m50690D0(C6378PT c6378pt) {
        Preconditions.checkNotNull(c6378pt, "imageDescriptor must not be null");
        this.f71418b = c6378pt;
        return this;
    }

    /* renamed from: E */
    public float m50689E() {
        return this.f71427k;
    }

    /* renamed from: E0 */
    public boolean m50688E0() {
        return this.f71429m;
    }

    /* renamed from: F */
    public float m50687F() {
        return this.f71428l;
    }

    /* renamed from: K */
    public float m50686K() {
        return this.f71423g;
    }

    /* renamed from: L */
    public LatLngBounds m50685L() {
        return this.f71422f;
    }

    /* renamed from: N0 */
    public boolean m50684N0() {
        return this.f71425i;
    }

    /* renamed from: R */
    public float m50683R() {
        return this.f71421e;
    }

    /* renamed from: T */
    public LatLng m50682T() {
        return this.f71419c;
    }

    /* renamed from: W0 */
    public GroundOverlayOptions m50681W0(LatLng latLng, float f) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (this.f71422f == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Position has already been set using positionFromBounds");
        if (latLng != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2, "Location must be specified");
        if (f < 0.0f) {
            z3 = false;
        }
        Preconditions.checkArgument(z3, "Width must be non-negative");
        m50677k1(latLng, f, -1.0f);
        return this;
    }

    /* renamed from: Y0 */
    public GroundOverlayOptions m50680Y0(boolean z) {
        this.f71425i = z;
        return this;
    }

    /* renamed from: j0 */
    public float m50679j0() {
        return this.f71426j;
    }

    /* renamed from: j1 */
    public GroundOverlayOptions m50678j1(float f) {
        this.f71424h = f;
        return this;
    }

    /* renamed from: k1 */
    public final GroundOverlayOptions m50677k1(LatLng latLng, float f, float f2) {
        this.f71419c = latLng;
        this.f71420d = f;
        this.f71421e = f2;
        return this;
    }

    /* renamed from: m0 */
    public float m50676m0() {
        return this.f71420d;
    }

    /* renamed from: p0 */
    public float m50675p0() {
        return this.f71424h;
    }

    /* renamed from: s */
    public GroundOverlayOptions m50674s(float f, float f2) {
        this.f71427k = f;
        this.f71428l = f2;
        return this;
    }

    /* renamed from: u */
    public GroundOverlayOptions m50673u(float f) {
        this.f71423g = ((f % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    /* renamed from: v */
    public GroundOverlayOptions m50672v(boolean z) {
        this.f71429m = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 2, this.f71418b.m90218a().asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, m50682T(), i, false);
        SafeParcelWriter.writeFloat(parcel, 4, m50676m0());
        SafeParcelWriter.writeFloat(parcel, 5, m50683R());
        SafeParcelWriter.writeParcelable(parcel, 6, m50685L(), i, false);
        SafeParcelWriter.writeFloat(parcel, 7, m50686K());
        SafeParcelWriter.writeFloat(parcel, 8, m50675p0());
        SafeParcelWriter.writeBoolean(parcel, 9, m50684N0());
        SafeParcelWriter.writeFloat(parcel, 10, m50679j0());
        SafeParcelWriter.writeFloat(parcel, 11, m50689E());
        SafeParcelWriter.writeFloat(parcel, 12, m50687F());
        SafeParcelWriter.writeBoolean(parcel, 13, m50688E0());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public GroundOverlayOptions(@SafeParcelable.Param(m51605id = 2) IBinder iBinder, @SafeParcelable.Param(m51605id = 3) LatLng latLng, @SafeParcelable.Param(m51605id = 4) float f, @SafeParcelable.Param(m51605id = 5) float f2, @SafeParcelable.Param(m51605id = 6) LatLngBounds latLngBounds, @SafeParcelable.Param(m51605id = 7) float f3, @SafeParcelable.Param(m51605id = 8) float f4, @SafeParcelable.Param(m51605id = 9) boolean z, @SafeParcelable.Param(m51605id = 10) float f5, @SafeParcelable.Param(m51605id = 11) float f6, @SafeParcelable.Param(m51605id = 12) float f7, @SafeParcelable.Param(m51605id = 13) boolean z2) {
        this.f71425i = true;
        this.f71426j = 0.0f;
        this.f71427k = 0.5f;
        this.f71428l = 0.5f;
        this.f71429m = false;
        this.f71418b = new C6378PT(WO1.AbstractBinderC9015a.m78501c5(iBinder));
        this.f71419c = latLng;
        this.f71420d = f;
        this.f71421e = f2;
        this.f71422f = latLngBounds;
        this.f71423g = f3;
        this.f71424h = f4;
        this.f71425i = z;
        this.f71426j = f5;
        this.f71427k = f6;
        this.f71428l = f7;
        this.f71429m = z2;
    }
}
