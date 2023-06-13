package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p000.WO1;
@SafeParcelable.Class(creator = "MarkerOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new C46717pA8();
    @SafeParcelable.Field(getter = "getPosition", m51606id = 2)

    /* renamed from: b */
    public LatLng f71439b;
    @SafeParcelable.Field(getter = "getTitle", m51606id = 3)

    /* renamed from: c */
    public String f71440c;
    @SafeParcelable.Field(getter = "getSnippet", m51606id = 4)

    /* renamed from: d */
    public String f71441d;
    @SafeParcelable.Field(getter = "getWrappedIconDescriptorImplBinder", m51606id = 5, type = "android.os.IBinder")

    /* renamed from: e */
    public C6378PT f71442e;
    @SafeParcelable.Field(getter = "getAnchorU", m51606id = 6)

    /* renamed from: f */
    public float f71443f;
    @SafeParcelable.Field(getter = "getAnchorV", m51606id = 7)

    /* renamed from: g */
    public float f71444g;
    @SafeParcelable.Field(getter = "isDraggable", m51606id = 8)

    /* renamed from: h */
    public boolean f71445h;
    @SafeParcelable.Field(getter = "isVisible", m51606id = 9)

    /* renamed from: i */
    public boolean f71446i;
    @SafeParcelable.Field(getter = "isFlat", m51606id = 10)

    /* renamed from: j */
    public boolean f71447j;
    @SafeParcelable.Field(getter = "getRotation", m51606id = 11)

    /* renamed from: k */
    public float f71448k;
    @SafeParcelable.Field(defaultValue = "0.5f", getter = "getInfoWindowAnchorU", m51606id = 12)

    /* renamed from: l */
    public float f71449l;
    @SafeParcelable.Field(getter = "getInfoWindowAnchorV", m51606id = 13)

    /* renamed from: m */
    public float f71450m;
    @SafeParcelable.Field(defaultValue = "1.0f", getter = "getAlpha", m51606id = 14)

    /* renamed from: n */
    public float f71451n;
    @SafeParcelable.Field(getter = "getZIndex", m51606id = 15)

    /* renamed from: o */
    public float f71452o;

    public MarkerOptions() {
        this.f71443f = 0.5f;
        this.f71444g = 1.0f;
        this.f71446i = true;
        this.f71447j = false;
        this.f71448k = 0.0f;
        this.f71449l = 0.5f;
        this.f71450m = 0.0f;
        this.f71451n = 1.0f;
    }

    /* renamed from: D0 */
    public String m50665D0() {
        return this.f71440c;
    }

    /* renamed from: E */
    public MarkerOptions m50664E(boolean z) {
        this.f71447j = z;
        return this;
    }

    /* renamed from: E0 */
    public float m50663E0() {
        return this.f71452o;
    }

    /* renamed from: F */
    public float m50662F() {
        return this.f71451n;
    }

    /* renamed from: J1 */
    public MarkerOptions m50661J1(String str) {
        this.f71441d = str;
        return this;
    }

    /* renamed from: K */
    public float m50660K() {
        return this.f71443f;
    }

    /* renamed from: L */
    public float m50659L() {
        return this.f71444g;
    }

    /* renamed from: L1 */
    public MarkerOptions m50658L1(String str) {
        this.f71440c = str;
        return this;
    }

    /* renamed from: N0 */
    public MarkerOptions m50657N0(C6378PT c6378pt) {
        this.f71442e = c6378pt;
        return this;
    }

    /* renamed from: R */
    public float m50656R() {
        return this.f71449l;
    }

    /* renamed from: R1 */
    public MarkerOptions m50655R1(boolean z) {
        this.f71446i = z;
        return this;
    }

    /* renamed from: T */
    public float m50654T() {
        return this.f71450m;
    }

    /* renamed from: W0 */
    public MarkerOptions m50653W0(float f, float f2) {
        this.f71449l = f;
        this.f71450m = f2;
        return this;
    }

    /* renamed from: Y0 */
    public boolean m50652Y0() {
        return this.f71445h;
    }

    /* renamed from: Y1 */
    public MarkerOptions m50651Y1(float f) {
        this.f71452o = f;
        return this;
    }

    /* renamed from: j0 */
    public LatLng m50650j0() {
        return this.f71439b;
    }

    /* renamed from: j1 */
    public boolean m50649j1() {
        return this.f71447j;
    }

    /* renamed from: k1 */
    public boolean m50648k1() {
        return this.f71446i;
    }

    /* renamed from: m0 */
    public float m50647m0() {
        return this.f71448k;
    }

    /* renamed from: p0 */
    public String m50646p0() {
        return this.f71441d;
    }

    /* renamed from: s */
    public MarkerOptions m50645s(float f) {
        this.f71451n = f;
        return this;
    }

    /* renamed from: u */
    public MarkerOptions m50644u(float f, float f2) {
        this.f71443f = f;
        this.f71444g = f2;
        return this;
    }

    /* renamed from: u1 */
    public MarkerOptions m50643u1(LatLng latLng) {
        if (latLng != null) {
            this.f71439b = latLng;
            return this;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    /* renamed from: v */
    public MarkerOptions m50642v(boolean z) {
        this.f71445h = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, m50650j0(), i, false);
        SafeParcelWriter.writeString(parcel, 3, m50665D0(), false);
        SafeParcelWriter.writeString(parcel, 4, m50646p0(), false);
        C6378PT c6378pt = this.f71442e;
        if (c6378pt == null) {
            asBinder = null;
        } else {
            asBinder = c6378pt.m90218a().asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 5, asBinder, false);
        SafeParcelWriter.writeFloat(parcel, 6, m50660K());
        SafeParcelWriter.writeFloat(parcel, 7, m50659L());
        SafeParcelWriter.writeBoolean(parcel, 8, m50652Y0());
        SafeParcelWriter.writeBoolean(parcel, 9, m50648k1());
        SafeParcelWriter.writeBoolean(parcel, 10, m50649j1());
        SafeParcelWriter.writeFloat(parcel, 11, m50647m0());
        SafeParcelWriter.writeFloat(parcel, 12, m50656R());
        SafeParcelWriter.writeFloat(parcel, 13, m50654T());
        SafeParcelWriter.writeFloat(parcel, 14, m50662F());
        SafeParcelWriter.writeFloat(parcel, 15, m50663E0());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* renamed from: y1 */
    public MarkerOptions m50641y1(float f) {
        this.f71448k = f;
        return this;
    }

    @SafeParcelable.Constructor
    public MarkerOptions(@SafeParcelable.Param(m51605id = 2) LatLng latLng, @SafeParcelable.Param(m51605id = 3) String str, @SafeParcelable.Param(m51605id = 4) String str2, @SafeParcelable.Param(m51605id = 5) IBinder iBinder, @SafeParcelable.Param(m51605id = 6) float f, @SafeParcelable.Param(m51605id = 7) float f2, @SafeParcelable.Param(m51605id = 8) boolean z, @SafeParcelable.Param(m51605id = 9) boolean z2, @SafeParcelable.Param(m51605id = 10) boolean z3, @SafeParcelable.Param(m51605id = 11) float f3, @SafeParcelable.Param(m51605id = 12) float f4, @SafeParcelable.Param(m51605id = 13) float f5, @SafeParcelable.Param(m51605id = 14) float f6, @SafeParcelable.Param(m51605id = 15) float f7) {
        this.f71443f = 0.5f;
        this.f71444g = 1.0f;
        this.f71446i = true;
        this.f71447j = false;
        this.f71448k = 0.0f;
        this.f71449l = 0.5f;
        this.f71450m = 0.0f;
        this.f71451n = 1.0f;
        this.f71439b = latLng;
        this.f71440c = str;
        this.f71441d = str2;
        if (iBinder == null) {
            this.f71442e = null;
        } else {
            this.f71442e = new C6378PT(WO1.AbstractBinderC9015a.m78501c5(iBinder));
        }
        this.f71443f = f;
        this.f71444g = f2;
        this.f71445h = z;
        this.f71446i = z2;
        this.f71447j = z3;
        this.f71448k = f3;
        this.f71449l = f4;
        this.f71450m = f5;
        this.f71451n = f6;
        this.f71452o = f7;
    }
}
