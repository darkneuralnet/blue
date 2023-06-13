package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Locale;
@SafeParcelable.Class(creator = "ConnectionOptionsCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes6.dex */
public final class ConnectionOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionOptions> CREATOR = new C50983wN8();
    @SafeParcelable.Field(defaultValue = "false", getter = "getLowPower", m51606id = 1)

    /* renamed from: b */
    public boolean f71590b;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableBluetooth", m51606id = 2)

    /* renamed from: c */
    public boolean f71591c;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableBle", m51606id = 3)

    /* renamed from: d */
    public boolean f71592d;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiLan", m51606id = 4)

    /* renamed from: e */
    public boolean f71593e;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableNfc", m51606id = 5)

    /* renamed from: f */
    public boolean f71594f;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiAware", m51606id = 6)

    /* renamed from: g */
    public boolean f71595g;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiHotspot", m51606id = 7)

    /* renamed from: h */
    public boolean f71596h;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiDirect", m51606id = 8)

    /* renamed from: i */
    public boolean f71597i;
    @ShowFirstParty
    @SafeParcelable.Field(getter = "getRemoteBluetoothMacAddress", m51606id = 9)

    /* renamed from: j */
    public byte[] f71598j;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "false", getter = "getEnableWebRtc", m51606id = 10)

    /* renamed from: k */
    public boolean f71599k;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnforceTopologyConstraints", m51606id = 11)

    /* renamed from: l */
    public boolean f71600l;
    @SafeParcelable.Field(defaultValue = "true", getter = "getDisruptiveUpgrade", m51606id = 12)

    /* renamed from: m */
    public boolean f71601m;

    private ConnectionOptions() {
        this.f71590b = false;
        this.f71591c = true;
        this.f71592d = true;
        this.f71593e = true;
        this.f71594f = true;
        this.f71595g = true;
        this.f71596h = true;
        this.f71597i = true;
        this.f71599k = false;
        this.f71600l = true;
        this.f71601m = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConnectionOptions) {
            ConnectionOptions connectionOptions = (ConnectionOptions) obj;
            if (Objects.equal(Boolean.valueOf(this.f71590b), Boolean.valueOf(connectionOptions.f71590b)) && Objects.equal(Boolean.valueOf(this.f71591c), Boolean.valueOf(connectionOptions.f71591c)) && Objects.equal(Boolean.valueOf(this.f71592d), Boolean.valueOf(connectionOptions.f71592d)) && Objects.equal(Boolean.valueOf(this.f71593e), Boolean.valueOf(connectionOptions.f71593e)) && Objects.equal(Boolean.valueOf(this.f71594f), Boolean.valueOf(connectionOptions.f71594f)) && Objects.equal(Boolean.valueOf(this.f71595g), Boolean.valueOf(connectionOptions.f71595g)) && Objects.equal(Boolean.valueOf(this.f71596h), Boolean.valueOf(connectionOptions.f71596h)) && Objects.equal(Boolean.valueOf(this.f71597i), Boolean.valueOf(connectionOptions.f71597i)) && Arrays.equals(this.f71598j, connectionOptions.f71598j) && Objects.equal(Boolean.valueOf(this.f71599k), Boolean.valueOf(connectionOptions.f71599k)) && Objects.equal(Boolean.valueOf(this.f71600l), Boolean.valueOf(connectionOptions.f71600l)) && Objects.equal(Boolean.valueOf(this.f71601m), Boolean.valueOf(connectionOptions.f71601m))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f71590b), Boolean.valueOf(this.f71591c), Boolean.valueOf(this.f71592d), Boolean.valueOf(this.f71593e), Boolean.valueOf(this.f71594f), Boolean.valueOf(this.f71595g), Boolean.valueOf(this.f71596h), Boolean.valueOf(this.f71597i), Integer.valueOf(Arrays.hashCode(this.f71598j)), Boolean.valueOf(this.f71599k), Boolean.valueOf(this.f71600l), Boolean.valueOf(this.f71601m));
    }

    /* renamed from: s */
    public boolean m50575s() {
        return this.f71601m;
    }

    public String toString() {
        String m81551a;
        Locale locale = Locale.US;
        Object[] objArr = new Object[12];
        objArr[0] = Boolean.valueOf(this.f71590b);
        objArr[1] = Boolean.valueOf(this.f71591c);
        objArr[2] = Boolean.valueOf(this.f71592d);
        objArr[3] = Boolean.valueOf(this.f71593e);
        objArr[4] = Boolean.valueOf(this.f71594f);
        objArr[5] = Boolean.valueOf(this.f71595g);
        objArr[6] = Boolean.valueOf(this.f71596h);
        objArr[7] = Boolean.valueOf(this.f71597i);
        byte[] bArr = this.f71598j;
        if (bArr == null) {
            m81551a = null;
        } else {
            m81551a = UP7.m81551a(bArr);
        }
        objArr[8] = m81551a;
        objArr[9] = Boolean.valueOf(this.f71599k);
        objArr[10] = Boolean.valueOf(this.f71600l);
        objArr[11] = Boolean.valueOf(this.f71601m);
        return String.format(locale, "ConnectionOptions{lowPower: %s, enableBluetooth: %s, enableBle: %s, enableWifiLan: %s, enableNfc: %s, enableWifiAware: %s, enableWifiHotspot: %s, enableWifiDirect: %s, remoteBluetoothMacAddress: %s, enableWebRtc: %s, enforceTopologyConstraints: %s, disruptiveUpgrade: %s}", objArr);
    }

    /* renamed from: u */
    public boolean m50574u() {
        return this.f71590b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, m50574u());
        SafeParcelWriter.writeBoolean(parcel, 2, this.f71591c);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f71592d);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f71593e);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f71594f);
        SafeParcelWriter.writeBoolean(parcel, 6, this.f71595g);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f71596h);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f71597i);
        SafeParcelWriter.writeByteArray(parcel, 9, this.f71598j, false);
        SafeParcelWriter.writeBoolean(parcel, 10, this.f71599k);
        SafeParcelWriter.writeBoolean(parcel, 11, this.f71600l);
        SafeParcelWriter.writeBoolean(parcel, 12, m50575s());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public ConnectionOptions(@SafeParcelable.Param(m51605id = 1) boolean z, @SafeParcelable.Param(m51605id = 2) boolean z2, @SafeParcelable.Param(m51605id = 3) boolean z3, @SafeParcelable.Param(m51605id = 4) boolean z4, @SafeParcelable.Param(m51605id = 5) boolean z5, @SafeParcelable.Param(m51605id = 6) boolean z6, @SafeParcelable.Param(m51605id = 7) boolean z7, @SafeParcelable.Param(m51605id = 8) boolean z8, @SafeParcelable.Param(m51605id = 9) byte[] bArr, @SafeParcelable.Param(m51605id = 10) boolean z9, @SafeParcelable.Param(m51605id = 11) boolean z10, @SafeParcelable.Param(m51605id = 12) boolean z11) {
        this.f71590b = z;
        this.f71591c = z2;
        this.f71592d = z3;
        this.f71593e = z4;
        this.f71594f = z5;
        this.f71595g = z6;
        this.f71596h = z7;
        this.f71597i = z8;
        this.f71598j = bArr;
        this.f71599k = z9;
        this.f71600l = z10;
        this.f71601m = z11;
    }
}
