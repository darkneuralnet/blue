package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Locale;
@SafeParcelable.Class(creator = "DiscoveryOptionsCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes6.dex */
public final class DiscoveryOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DiscoveryOptions> CREATOR = new C45796nd9();
    @SafeParcelable.Field(getter = "getStrategy", m51606id = 1)

    /* renamed from: b */
    public Strategy f71602b;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "false", getter = "getForwardUnrecognizedBluetoothDevices", m51606id = 2)

    /* renamed from: c */
    public boolean f71603c;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableBluetooth", m51606id = 3)

    /* renamed from: d */
    public boolean f71604d;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableBle", m51606id = 4)

    /* renamed from: e */
    public boolean f71605e;
    @SafeParcelable.Field(defaultValue = "false", getter = "getLowPower", m51606id = 5)

    /* renamed from: f */
    public boolean f71606f;
    @ShowFirstParty
    @SafeParcelable.Field(getter = "getFastAdvertisementServiceUuid", m51606id = 6)

    /* renamed from: g */
    public ParcelUuid f71607g;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiLan", m51606id = 8)

    /* renamed from: h */
    public boolean f71608h;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableNfc", m51606id = 9)

    /* renamed from: i */
    public boolean f71609i;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiAware", m51606id = 10)

    /* renamed from: j */
    public boolean f71610j;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "false", getter = "getEnableUwbRanging", m51606id = 11)

    /* renamed from: k */
    public boolean f71611k;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "0", getter = "getUwbChannel", m51606id = 12)

    /* renamed from: l */
    public int f71612l;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "0", getter = "getUwbPreambleIndex", m51606id = 13)

    /* renamed from: m */
    public int f71613m;
    @ShowFirstParty
    @SafeParcelable.Field(getter = "getUwbAddress", m51606id = 14)

    /* renamed from: n */
    public byte[] f71614n;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "0", getter = "getFlowId", m51606id = 15)

    /* renamed from: o */
    public long f71615o;

    private DiscoveryOptions() {
        this.f71603c = false;
        this.f71604d = true;
        this.f71605e = true;
        this.f71606f = false;
        this.f71608h = true;
        this.f71609i = true;
        this.f71610j = true;
        this.f71611k = false;
        this.f71612l = 0;
        this.f71613m = 0;
        this.f71615o = 0L;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DiscoveryOptions) {
            DiscoveryOptions discoveryOptions = (DiscoveryOptions) obj;
            if (Objects.equal(this.f71602b, discoveryOptions.f71602b) && Objects.equal(Boolean.valueOf(this.f71603c), Boolean.valueOf(discoveryOptions.f71603c)) && Objects.equal(Boolean.valueOf(this.f71604d), Boolean.valueOf(discoveryOptions.f71604d)) && Objects.equal(Boolean.valueOf(this.f71605e), Boolean.valueOf(discoveryOptions.f71605e)) && Objects.equal(Boolean.valueOf(this.f71606f), Boolean.valueOf(discoveryOptions.f71606f)) && Objects.equal(this.f71607g, discoveryOptions.f71607g) && Objects.equal(Boolean.valueOf(this.f71608h), Boolean.valueOf(discoveryOptions.f71608h)) && Objects.equal(Boolean.valueOf(this.f71609i), Boolean.valueOf(discoveryOptions.f71609i)) && Objects.equal(Boolean.valueOf(this.f71610j), Boolean.valueOf(discoveryOptions.f71610j)) && Objects.equal(Boolean.valueOf(this.f71611k), Boolean.valueOf(discoveryOptions.f71611k)) && Objects.equal(Integer.valueOf(this.f71612l), Integer.valueOf(discoveryOptions.f71612l)) && Objects.equal(Integer.valueOf(this.f71613m), Integer.valueOf(discoveryOptions.f71613m)) && Arrays.equals(this.f71614n, discoveryOptions.f71614n) && Objects.equal(Long.valueOf(this.f71615o), Long.valueOf(discoveryOptions.f71615o))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f71602b, Boolean.valueOf(this.f71603c), Boolean.valueOf(this.f71604d), Boolean.valueOf(this.f71605e), Boolean.valueOf(this.f71606f), this.f71607g, Boolean.valueOf(this.f71608h), Boolean.valueOf(this.f71609i), Boolean.valueOf(this.f71610j), Boolean.valueOf(this.f71611k), Integer.valueOf(this.f71612l), Integer.valueOf(this.f71613m), Integer.valueOf(Arrays.hashCode(this.f71614n)), Long.valueOf(this.f71615o));
    }

    /* renamed from: s */
    public boolean m50573s() {
        return this.f71606f;
    }

    public String toString() {
        String m81551a;
        Locale locale = Locale.US;
        Object[] objArr = new Object[14];
        objArr[0] = this.f71602b;
        objArr[1] = Boolean.valueOf(this.f71603c);
        objArr[2] = Boolean.valueOf(this.f71604d);
        objArr[3] = Boolean.valueOf(this.f71605e);
        objArr[4] = Boolean.valueOf(this.f71606f);
        objArr[5] = this.f71607g;
        objArr[6] = Boolean.valueOf(this.f71608h);
        objArr[7] = Boolean.valueOf(this.f71609i);
        objArr[8] = Boolean.valueOf(this.f71610j);
        objArr[9] = Boolean.valueOf(this.f71611k);
        objArr[10] = Integer.valueOf(this.f71612l);
        objArr[11] = Integer.valueOf(this.f71613m);
        byte[] bArr = this.f71614n;
        if (bArr == null) {
            m81551a = "null";
        } else {
            m81551a = UP7.m81551a(bArr);
        }
        objArr[12] = m81551a;
        objArr[13] = Long.valueOf(this.f71615o);
        return String.format(locale, "DiscoveryOptions{strategy: %s, forwardUnrecognizedBluetoothDevices: %s, enableBluetooth: %s, enableBle: %s, lowPower: %s, fastAdvertisementServiceUuid: %s, enableWifiLan: %s, enableNfc: %s, enableWifiAware: %s, enableUwbRanging: %s, uwbChannel: %d, uwbPreambleIndex: %d, uwbAddress: %s, flowId: %d}", objArr);
    }

    /* renamed from: u */
    public Strategy m50572u() {
        return this.f71602b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, m50572u(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f71603c);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f71604d);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f71605e);
        SafeParcelWriter.writeBoolean(parcel, 5, m50573s());
        SafeParcelWriter.writeParcelable(parcel, 6, this.f71607g, i, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f71608h);
        SafeParcelWriter.writeBoolean(parcel, 9, this.f71609i);
        SafeParcelWriter.writeBoolean(parcel, 10, this.f71610j);
        SafeParcelWriter.writeBoolean(parcel, 11, this.f71611k);
        SafeParcelWriter.writeInt(parcel, 12, this.f71612l);
        SafeParcelWriter.writeInt(parcel, 13, this.f71613m);
        SafeParcelWriter.writeByteArray(parcel, 14, this.f71614n, false);
        SafeParcelWriter.writeLong(parcel, 15, this.f71615o);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public DiscoveryOptions(@SafeParcelable.Param(m51605id = 1) Strategy strategy, @SafeParcelable.Param(m51605id = 2) boolean z, @SafeParcelable.Param(m51605id = 3) boolean z2, @SafeParcelable.Param(m51605id = 4) boolean z3, @SafeParcelable.Param(m51605id = 5) boolean z4, @SafeParcelable.Param(m51605id = 6) ParcelUuid parcelUuid, @SafeParcelable.Param(m51605id = 8) boolean z5, @SafeParcelable.Param(m51605id = 9) boolean z6, @SafeParcelable.Param(m51605id = 10) boolean z7, @SafeParcelable.Param(m51605id = 11) boolean z8, @SafeParcelable.Param(m51605id = 12) int i, @SafeParcelable.Param(m51605id = 13) int i2, @SafeParcelable.Param(m51605id = 14) byte[] bArr, @SafeParcelable.Param(m51605id = 15) long j) {
        this.f71602b = strategy;
        this.f71603c = z;
        this.f71604d = z2;
        this.f71605e = z3;
        this.f71606f = z4;
        this.f71607g = parcelUuid;
        this.f71608h = z5;
        this.f71609i = z6;
        this.f71610j = z7;
        this.f71611k = z8;
        this.f71612l = i;
        this.f71613m = i2;
        this.f71614n = bArr;
        this.f71615o = j;
    }
}
