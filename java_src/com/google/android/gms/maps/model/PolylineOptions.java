package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@SafeParcelable.Class(creator = "PolylineOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class PolylineOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new C44570lZ8();
    @SafeParcelable.Field(getter = "getPoints", m51606id = 2)

    /* renamed from: b */
    public final List<LatLng> f71469b;
    @SafeParcelable.Field(getter = "getWidth", m51606id = 3)

    /* renamed from: c */
    public float f71470c;
    @SafeParcelable.Field(getter = "getColor", m51606id = 4)

    /* renamed from: d */
    public int f71471d;
    @SafeParcelable.Field(getter = "getZIndex", m51606id = 5)

    /* renamed from: e */
    public float f71472e;
    @SafeParcelable.Field(getter = "isVisible", m51606id = 6)

    /* renamed from: f */
    public boolean f71473f;
    @SafeParcelable.Field(getter = "isGeodesic", m51606id = 7)

    /* renamed from: g */
    public boolean f71474g;
    @SafeParcelable.Field(getter = "isClickable", m51606id = 8)

    /* renamed from: h */
    public boolean f71475h;
    @SafeParcelable.Field(getter = "getStartCap", m51606id = 9)

    /* renamed from: i */
    public Cap f71476i;
    @SafeParcelable.Field(getter = "getEndCap", m51606id = 10)

    /* renamed from: j */
    public Cap f71477j;
    @SafeParcelable.Field(getter = "getJointType", m51606id = 11)

    /* renamed from: k */
    public int f71478k;
    @SafeParcelable.Field(getter = "getPattern", m51606id = 12)

    /* renamed from: l */
    public List<PatternItem> f71479l;

    public PolylineOptions() {
        this.f71470c = 10.0f;
        this.f71471d = -16777216;
        this.f71472e = 0.0f;
        this.f71473f = true;
        this.f71474g = false;
        this.f71475h = false;
        this.f71476i = new ButtCap();
        this.f71477j = new ButtCap();
        this.f71478k = 0;
        this.f71479l = null;
        this.f71469b = new ArrayList();
    }

    /* renamed from: D0 */
    public float m50623D0() {
        return this.f71470c;
    }

    /* renamed from: E */
    public PolylineOptions m50622E(int i) {
        this.f71471d = i;
        return this;
    }

    /* renamed from: E0 */
    public float m50621E0() {
        return this.f71472e;
    }

    /* renamed from: F */
    public PolylineOptions m50620F(Cap cap) {
        this.f71477j = (Cap) Preconditions.checkNotNull(cap, "endCap must not be null");
        return this;
    }

    /* renamed from: K */
    public PolylineOptions m50619K(boolean z) {
        this.f71474g = z;
        return this;
    }

    /* renamed from: L */
    public int m50618L() {
        return this.f71471d;
    }

    /* renamed from: N0 */
    public boolean m50617N0() {
        return this.f71475h;
    }

    /* renamed from: R */
    public Cap m50616R() {
        return this.f71477j;
    }

    /* renamed from: T */
    public int m50615T() {
        return this.f71478k;
    }

    /* renamed from: W0 */
    public boolean m50614W0() {
        return this.f71474g;
    }

    /* renamed from: Y0 */
    public boolean m50613Y0() {
        return this.f71473f;
    }

    /* renamed from: j0 */
    public List<PatternItem> m50612j0() {
        return this.f71479l;
    }

    /* renamed from: j1 */
    public PolylineOptions m50611j1(int i) {
        this.f71478k = i;
        return this;
    }

    /* renamed from: k1 */
    public PolylineOptions m50610k1(Cap cap) {
        this.f71476i = (Cap) Preconditions.checkNotNull(cap, "startCap must not be null");
        return this;
    }

    /* renamed from: m0 */
    public List<LatLng> m50609m0() {
        return this.f71469b;
    }

    /* renamed from: p0 */
    public Cap m50608p0() {
        return this.f71476i;
    }

    /* renamed from: s */
    public PolylineOptions m50607s(LatLng latLng) {
        Preconditions.checkNotNull(this.f71469b, "point must not be null.");
        this.f71469b.add(latLng);
        return this;
    }

    /* renamed from: u */
    public PolylineOptions m50606u(LatLng... latLngArr) {
        Preconditions.checkNotNull(latLngArr, "points must not be null.");
        this.f71469b.addAll(Arrays.asList(latLngArr));
        return this;
    }

    /* renamed from: u1 */
    public PolylineOptions m50605u1(float f) {
        this.f71470c = f;
        return this;
    }

    /* renamed from: v */
    public PolylineOptions m50604v(boolean z) {
        this.f71475h = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, m50609m0(), false);
        SafeParcelWriter.writeFloat(parcel, 3, m50623D0());
        SafeParcelWriter.writeInt(parcel, 4, m50618L());
        SafeParcelWriter.writeFloat(parcel, 5, m50621E0());
        SafeParcelWriter.writeBoolean(parcel, 6, m50613Y0());
        SafeParcelWriter.writeBoolean(parcel, 7, m50614W0());
        SafeParcelWriter.writeBoolean(parcel, 8, m50617N0());
        SafeParcelWriter.writeParcelable(parcel, 9, m50608p0(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, m50616R(), i, false);
        SafeParcelWriter.writeInt(parcel, 11, m50615T());
        SafeParcelWriter.writeTypedList(parcel, 12, m50612j0(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* renamed from: y1 */
    public PolylineOptions m50603y1(float f) {
        this.f71472e = f;
        return this;
    }

    @SafeParcelable.Constructor
    public PolylineOptions(@SafeParcelable.Param(m51605id = 2) List list, @SafeParcelable.Param(m51605id = 3) float f, @SafeParcelable.Param(m51605id = 4) int i, @SafeParcelable.Param(m51605id = 5) float f2, @SafeParcelable.Param(m51605id = 6) boolean z, @SafeParcelable.Param(m51605id = 7) boolean z2, @SafeParcelable.Param(m51605id = 8) boolean z3, @SafeParcelable.Param(m51605id = 9) Cap cap, @SafeParcelable.Param(m51605id = 10) Cap cap2, @SafeParcelable.Param(m51605id = 11) int i2, @SafeParcelable.Param(m51605id = 12) List<PatternItem> list2) {
        this.f71470c = 10.0f;
        this.f71471d = -16777216;
        this.f71472e = 0.0f;
        this.f71473f = true;
        this.f71474g = false;
        this.f71475h = false;
        this.f71476i = new ButtCap();
        this.f71477j = new ButtCap();
        this.f71469b = list;
        this.f71470c = f;
        this.f71471d = i;
        this.f71472e = f2;
        this.f71473f = z;
        this.f71474g = z2;
        this.f71475h = z3;
        if (cap != null) {
            this.f71476i = cap;
        }
        if (cap2 != null) {
            this.f71477j = cap2;
        }
        this.f71478k = i2;
        this.f71479l = list2;
    }
}
