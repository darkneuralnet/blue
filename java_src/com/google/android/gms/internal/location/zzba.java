package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;
@SafeParcelable.Class(creator = "LocationRequestInternalCreator")
@SafeParcelable.Reserved({1000, 2, 3, 4})
/* loaded from: classes5.dex */
public final class zzba extends AbstractSafeParcelable {
    @SafeParcelable.Field(defaultValueUnchecked = "null", m51606id = 1)

    /* renamed from: b */
    public final LocationRequest f70531b;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_CLIENTS", m51606id = 5)

    /* renamed from: c */
    public final List<ClientIdentity> f70532c;
    @SafeParcelable.Field(defaultValueUnchecked = "null", m51606id = 6)

    /* renamed from: d */
    public final String f70533d;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_HIDE_FROM_APP_OPS", m51606id = 7)

    /* renamed from: e */
    public final boolean f70534e;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_FORCE_COARSE_LOCATION", m51606id = 8)

    /* renamed from: f */
    public final boolean f70535f;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_EXEMPT_FROM_THROTTLE", m51606id = 9)

    /* renamed from: g */
    public final boolean f70536g;
    @SafeParcelable.Field(defaultValueUnchecked = "null", m51606id = 10)

    /* renamed from: h */
    public final String f70537h;
    @SafeParcelable.Field(defaultValueUnchecked = "false", m51606id = 11)

    /* renamed from: i */
    public final boolean f70538i;
    @SafeParcelable.Field(defaultValueUnchecked = "false", m51606id = 12)

    /* renamed from: j */
    public boolean f70539j;
    @SafeParcelable.Field(defaultValueUnchecked = "null", m51606id = 13)

    /* renamed from: k */
    public String f70540k;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_MAX_LOCATION_AGE_MILLIS", m51606id = 14)

    /* renamed from: l */
    public long f70541l;

    /* renamed from: m */
    public static final List<ClientIdentity> f70530m = Collections.emptyList();
    public static final Parcelable.Creator<zzba> CREATOR = new KD7();

    @SafeParcelable.Constructor
    public zzba(@SafeParcelable.Param(m51605id = 1) LocationRequest locationRequest, @SafeParcelable.Param(m51605id = 5) List<ClientIdentity> list, @SafeParcelable.Param(m51605id = 6) String str, @SafeParcelable.Param(m51605id = 7) boolean z, @SafeParcelable.Param(m51605id = 8) boolean z2, @SafeParcelable.Param(m51605id = 9) boolean z3, @SafeParcelable.Param(m51605id = 10) String str2, @SafeParcelable.Param(m51605id = 11) boolean z4, @SafeParcelable.Param(m51605id = 12) boolean z5, @SafeParcelable.Param(m51605id = 13) String str3, @SafeParcelable.Param(m51605id = 14) long j) {
        this.f70531b = locationRequest;
        this.f70532c = list;
        this.f70533d = str;
        this.f70534e = z;
        this.f70535f = z2;
        this.f70536g = z3;
        this.f70537h = str2;
        this.f70538i = z4;
        this.f70539j = z5;
        this.f70540k = str3;
        this.f70541l = j;
    }

    /* renamed from: s */
    public static zzba m51350s(String str, LocationRequest locationRequest) {
        return new zzba(locationRequest, f70530m, null, false, false, false, null, false, false, null, LongCompanionObject.MAX_VALUE);
    }

    /* renamed from: E */
    public final zzba m51351E(boolean z) {
        this.f70539j = true;
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzba) {
            zzba zzbaVar = (zzba) obj;
            if (Objects.equal(this.f70531b, zzbaVar.f70531b) && Objects.equal(this.f70532c, zzbaVar.f70532c) && Objects.equal(this.f70533d, zzbaVar.f70533d) && this.f70534e == zzbaVar.f70534e && this.f70535f == zzbaVar.f70535f && this.f70536g == zzbaVar.f70536g && Objects.equal(this.f70537h, zzbaVar.f70537h) && this.f70538i == zzbaVar.f70538i && this.f70539j == zzbaVar.f70539j && Objects.equal(this.f70540k, zzbaVar.f70540k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f70531b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f70531b);
        if (this.f70533d != null) {
            sb.append(" tag=");
            sb.append(this.f70533d);
        }
        if (this.f70537h != null) {
            sb.append(" moduleId=");
            sb.append(this.f70537h);
        }
        if (this.f70540k != null) {
            sb.append(" contextAttributionTag=");
            sb.append(this.f70540k);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f70534e);
        sb.append(" clients=");
        sb.append(this.f70532c);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f70535f);
        if (this.f70536g) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        if (this.f70538i) {
            sb.append(" locationSettingsIgnored");
        }
        if (this.f70539j) {
            sb.append(" inaccurateLocationsDelayed");
        }
        return sb.toString();
    }

    /* renamed from: u */
    public final zzba m51349u(long j) {
        if (this.f70531b.getMaxWaitTime() <= this.f70531b.getInterval()) {
            this.f70541l = AbstractComponentTracker.LINGERING_TIMEOUT;
            return this;
        }
        long interval = this.f70531b.getInterval();
        long maxWaitTime = this.f70531b.getMaxWaitTime();
        StringBuilder sb = new StringBuilder(120);
        sb.append("could not set max age when location batching is requested, interval=");
        sb.append(interval);
        sb.append("maxWaitTime=");
        sb.append(maxWaitTime);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: v */
    public final zzba m51348v(String str) {
        this.f70540k = str;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f70531b, i, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.f70532c, false);
        SafeParcelWriter.writeString(parcel, 6, this.f70533d, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f70534e);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f70535f);
        SafeParcelWriter.writeBoolean(parcel, 9, this.f70536g);
        SafeParcelWriter.writeString(parcel, 10, this.f70537h, false);
        SafeParcelWriter.writeBoolean(parcel, 11, this.f70538i);
        SafeParcelWriter.writeBoolean(parcel, 12, this.f70539j);
        SafeParcelWriter.writeString(parcel, 13, this.f70540k, false);
        SafeParcelWriter.writeLong(parcel, 14, this.f70541l);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
