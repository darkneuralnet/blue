package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
@SafeParcelable.Class(creator = "PolygonOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class PolygonOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolygonOptions> CREATOR = new C51630xT8();
    @SafeParcelable.Field(getter = "getPoints", m51606id = 2)

    /* renamed from: b */
    public final List<LatLng> f71458b;
    @SafeParcelable.Field(getter = "getHolesForParcel", m51606id = 3, type = "java.util.List")

    /* renamed from: c */
    public final List<List<LatLng>> f71459c;
    @SafeParcelable.Field(getter = "getStrokeWidth", m51606id = 4)

    /* renamed from: d */
    public float f71460d;
    @SafeParcelable.Field(getter = "getStrokeColor", m51606id = 5)

    /* renamed from: e */
    public int f71461e;
    @SafeParcelable.Field(getter = "getFillColor", m51606id = 6)

    /* renamed from: f */
    public int f71462f;
    @SafeParcelable.Field(getter = "getZIndex", m51606id = 7)

    /* renamed from: g */
    public float f71463g;
    @SafeParcelable.Field(getter = "isVisible", m51606id = 8)

    /* renamed from: h */
    public boolean f71464h;
    @SafeParcelable.Field(getter = "isGeodesic", m51606id = 9)

    /* renamed from: i */
    public boolean f71465i;
    @SafeParcelable.Field(getter = "isClickable", m51606id = 10)

    /* renamed from: j */
    public boolean f71466j;
    @SafeParcelable.Field(getter = "getStrokeJointType", m51606id = 11)

    /* renamed from: k */
    public int f71467k;
    @SafeParcelable.Field(getter = "getStrokePattern", m51606id = 12)

    /* renamed from: l */
    public List<PatternItem> f71468l;

    public PolygonOptions() {
        this.f71460d = 10.0f;
        this.f71461e = -16777216;
        this.f71462f = 0;
        this.f71463g = 0.0f;
        this.f71464h = true;
        this.f71465i = false;
        this.f71466j = false;
        this.f71467k = 0;
        this.f71468l = null;
        this.f71458b = new ArrayList();
        this.f71459c = new ArrayList();
    }

    /* renamed from: D0 */
    public boolean m50640D0() {
        return this.f71465i;
    }

    /* renamed from: E */
    public PolygonOptions m50639E(int i) {
        this.f71462f = i;
        return this;
    }

    /* renamed from: E0 */
    public boolean m50638E0() {
        return this.f71464h;
    }

    /* renamed from: F */
    public int m50637F() {
        return this.f71462f;
    }

    /* renamed from: K */
    public List<LatLng> m50636K() {
        return this.f71458b;
    }

    /* renamed from: L */
    public int m50635L() {
        return this.f71461e;
    }

    /* renamed from: N0 */
    public PolygonOptions m50634N0(int i) {
        this.f71461e = i;
        return this;
    }

    /* renamed from: R */
    public int m50633R() {
        return this.f71467k;
    }

    /* renamed from: T */
    public List<PatternItem> m50632T() {
        return this.f71468l;
    }

    /* renamed from: W0 */
    public PolygonOptions m50631W0(float f) {
        this.f71460d = f;
        return this;
    }

    /* renamed from: Y0 */
    public PolygonOptions m50630Y0(float f) {
        this.f71463g = f;
        return this;
    }

    /* renamed from: j0 */
    public float m50629j0() {
        return this.f71460d;
    }

    /* renamed from: m0 */
    public float m50628m0() {
        return this.f71463g;
    }

    /* renamed from: p0 */
    public boolean m50627p0() {
        return this.f71466j;
    }

    /* renamed from: s */
    public PolygonOptions m50626s(Iterable<LatLng> iterable) {
        Preconditions.checkNotNull(iterable, "points must not be null.");
        for (LatLng latLng : iterable) {
            this.f71458b.add(latLng);
        }
        return this;
    }

    /* renamed from: u */
    public PolygonOptions m50625u(Iterable<LatLng> iterable) {
        Preconditions.checkNotNull(iterable, "points must not be null.");
        ArrayList arrayList = new ArrayList();
        for (LatLng latLng : iterable) {
            arrayList.add(latLng);
        }
        this.f71459c.add(arrayList);
        return this;
    }

    /* renamed from: v */
    public PolygonOptions m50624v(boolean z) {
        this.f71466j = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, m50636K(), false);
        SafeParcelWriter.writeList(parcel, 3, this.f71459c, false);
        SafeParcelWriter.writeFloat(parcel, 4, m50629j0());
        SafeParcelWriter.writeInt(parcel, 5, m50635L());
        SafeParcelWriter.writeInt(parcel, 6, m50637F());
        SafeParcelWriter.writeFloat(parcel, 7, m50628m0());
        SafeParcelWriter.writeBoolean(parcel, 8, m50638E0());
        SafeParcelWriter.writeBoolean(parcel, 9, m50640D0());
        SafeParcelWriter.writeBoolean(parcel, 10, m50627p0());
        SafeParcelWriter.writeInt(parcel, 11, m50633R());
        SafeParcelWriter.writeTypedList(parcel, 12, m50632T(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public PolygonOptions(@SafeParcelable.Param(m51605id = 2) List<LatLng> list, @SafeParcelable.Param(m51605id = 3) List list2, @SafeParcelable.Param(m51605id = 4) float f, @SafeParcelable.Param(m51605id = 5) int i, @SafeParcelable.Param(m51605id = 6) int i2, @SafeParcelable.Param(m51605id = 7) float f2, @SafeParcelable.Param(m51605id = 8) boolean z, @SafeParcelable.Param(m51605id = 9) boolean z2, @SafeParcelable.Param(m51605id = 10) boolean z3, @SafeParcelable.Param(m51605id = 11) int i3, @SafeParcelable.Param(m51605id = 12) List<PatternItem> list3) {
        this.f71458b = list;
        this.f71459c = list2;
        this.f71460d = f;
        this.f71461e = i;
        this.f71462f = i2;
        this.f71463g = f2;
        this.f71464h = z;
        this.f71465i = z2;
        this.f71466j = z3;
        this.f71467k = i3;
        this.f71468l = list3;
    }
}
