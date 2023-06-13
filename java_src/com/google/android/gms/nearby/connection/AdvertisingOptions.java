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
@SafeParcelable.Class(creator = "AdvertisingOptionsCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes6.dex */
public final class AdvertisingOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AdvertisingOptions> CREATOR = new C41397gC7();
    @SafeParcelable.Field(getter = "getStrategy", m51606id = 1)

    /* renamed from: b */
    public Strategy f71566b;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getAutoUpgradeBandwidth", m51606id = 2)

    /* renamed from: c */
    public boolean f71567c;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnforceTopologyConstraints", m51606id = 3)

    /* renamed from: d */
    public boolean f71568d;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableBluetooth", m51606id = 4)

    /* renamed from: e */
    public boolean f71569e;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableBle", m51606id = 5)

    /* renamed from: f */
    public boolean f71570f;
    @SafeParcelable.Field(getter = "getNearbyNotificationsBeaconData", m51606id = 6)

    /* renamed from: g */
    public byte[] f71571g;
    @SafeParcelable.Field(defaultValue = "false", getter = "getLowPower", m51606id = 7)

    /* renamed from: h */
    public boolean f71572h;
    @ShowFirstParty
    @SafeParcelable.Field(getter = "getFastAdvertisementServiceUuid", m51606id = 8)

    /* renamed from: i */
    public ParcelUuid f71573i;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiLan", m51606id = 9)

    /* renamed from: j */
    public boolean f71574j;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableNfc", m51606id = 10)

    /* renamed from: k */
    public boolean f71575k;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiAware", m51606id = 11)

    /* renamed from: l */
    public boolean f71576l;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "false", getter = "getEnableBluetoothListening", m51606id = 12)

    /* renamed from: m */
    public boolean f71577m;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "false", getter = "getEnableWebRtcListening", m51606id = 13)

    /* renamed from: n */
    public boolean f71578n;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "false", getter = "getEnableUwbRanging", m51606id = 14)

    /* renamed from: o */
    public boolean f71579o;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "0", getter = "getUwbChannel", m51606id = 15)

    /* renamed from: p */
    public int f71580p;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "0", getter = "getUwbPreambleIndex", m51606id = 16)

    /* renamed from: q */
    public int f71581q;
    @ShowFirstParty
    @SafeParcelable.Field(getter = "getRemoteUwbAddress", m51606id = 17)

    /* renamed from: r */
    public byte[] f71582r;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "0", getter = "getFlowId", m51606id = 18)

    /* renamed from: s */
    public long f71583s;
    @ShowFirstParty
    @SafeParcelable.Field(getter = "getUwbSenderInfo", m51606id = 19)

    /* renamed from: t */
    public zzv[] f71584t;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "false", getter = "getEnableOutOfBandConnection", m51606id = 20)

    /* renamed from: u */
    public boolean f71585u;
    @SafeParcelable.Field(defaultValue = "true", getter = "getDisruptiveUpgrade", m51606id = 21)

    /* renamed from: v */
    public boolean f71586v;
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "false", getter = "getEnableWebRtcUpgrade", m51606id = 22)

    /* renamed from: w */
    public boolean f71587w;

    private AdvertisingOptions() {
        this.f71567c = true;
        this.f71568d = true;
        this.f71569e = true;
        this.f71570f = true;
        this.f71572h = false;
        this.f71574j = true;
        this.f71575k = true;
        this.f71576l = true;
        this.f71577m = false;
        this.f71578n = false;
        this.f71579o = false;
        this.f71580p = 0;
        this.f71581q = 0;
        this.f71583s = 0L;
        this.f71585u = false;
        this.f71586v = true;
        this.f71587w = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdvertisingOptions) {
            AdvertisingOptions advertisingOptions = (AdvertisingOptions) obj;
            if (Objects.equal(this.f71566b, advertisingOptions.f71566b) && Objects.equal(Boolean.valueOf(this.f71567c), Boolean.valueOf(advertisingOptions.f71567c)) && Objects.equal(Boolean.valueOf(this.f71568d), Boolean.valueOf(advertisingOptions.f71568d)) && Objects.equal(Boolean.valueOf(this.f71569e), Boolean.valueOf(advertisingOptions.f71569e)) && Objects.equal(Boolean.valueOf(this.f71570f), Boolean.valueOf(advertisingOptions.f71570f)) && Arrays.equals(this.f71571g, advertisingOptions.f71571g) && Objects.equal(Boolean.valueOf(this.f71572h), Boolean.valueOf(advertisingOptions.f71572h)) && Objects.equal(this.f71573i, advertisingOptions.f71573i) && Objects.equal(Boolean.valueOf(this.f71574j), Boolean.valueOf(advertisingOptions.f71574j)) && Objects.equal(Boolean.valueOf(this.f71575k), Boolean.valueOf(advertisingOptions.f71575k)) && Objects.equal(Boolean.valueOf(this.f71576l), Boolean.valueOf(advertisingOptions.f71576l)) && Objects.equal(Boolean.valueOf(this.f71577m), Boolean.valueOf(advertisingOptions.f71577m)) && Objects.equal(Boolean.valueOf(this.f71578n), Boolean.valueOf(advertisingOptions.f71578n)) && Objects.equal(Boolean.valueOf(this.f71579o), Boolean.valueOf(advertisingOptions.f71579o)) && Objects.equal(Integer.valueOf(this.f71580p), Integer.valueOf(advertisingOptions.f71580p)) && Objects.equal(Integer.valueOf(this.f71581q), Integer.valueOf(advertisingOptions.f71581q)) && Arrays.equals(this.f71582r, advertisingOptions.f71582r) && Objects.equal(Long.valueOf(this.f71583s), Long.valueOf(advertisingOptions.f71583s)) && Arrays.equals(this.f71584t, advertisingOptions.f71584t) && Objects.equal(Boolean.valueOf(this.f71585u), Boolean.valueOf(advertisingOptions.f71585u)) && Objects.equal(Boolean.valueOf(this.f71586v), Boolean.valueOf(advertisingOptions.f71586v)) && Objects.equal(Boolean.valueOf(this.f71587w), Boolean.valueOf(advertisingOptions.f71587w))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f71566b, Boolean.valueOf(this.f71567c), Boolean.valueOf(this.f71568d), Boolean.valueOf(this.f71569e), Boolean.valueOf(this.f71570f), Integer.valueOf(Arrays.hashCode(this.f71571g)), Boolean.valueOf(this.f71572h), this.f71573i, Boolean.valueOf(this.f71574j), Boolean.valueOf(this.f71575k), Boolean.valueOf(this.f71576l), Boolean.valueOf(this.f71577m), Boolean.valueOf(this.f71578n), Boolean.valueOf(this.f71579o), Integer.valueOf(this.f71580p), Integer.valueOf(this.f71581q), Integer.valueOf(Arrays.hashCode(this.f71582r)), Long.valueOf(this.f71583s), Integer.valueOf(Arrays.hashCode(this.f71584t)), Boolean.valueOf(this.f71585u), Boolean.valueOf(this.f71586v), Boolean.valueOf(this.f71587w));
    }

    /* renamed from: s */
    public boolean m50580s() {
        return this.f71586v;
    }

    public String toString() {
        String m81551a;
        String m81551a2;
        Locale locale = Locale.US;
        Object[] objArr = new Object[21];
        objArr[0] = this.f71566b;
        objArr[1] = Boolean.valueOf(this.f71567c);
        objArr[2] = Boolean.valueOf(this.f71568d);
        objArr[3] = Boolean.valueOf(this.f71569e);
        objArr[4] = Boolean.valueOf(this.f71570f);
        byte[] bArr = this.f71571g;
        if (bArr == null) {
            m81551a = null;
        } else {
            m81551a = UP7.m81551a(bArr);
        }
        objArr[5] = m81551a;
        objArr[6] = Boolean.valueOf(this.f71572h);
        objArr[7] = this.f71573i;
        objArr[8] = Boolean.valueOf(this.f71574j);
        objArr[9] = Boolean.valueOf(this.f71575k);
        objArr[10] = Boolean.valueOf(this.f71576l);
        objArr[11] = Boolean.valueOf(this.f71577m);
        objArr[12] = Boolean.valueOf(this.f71578n);
        objArr[13] = Boolean.valueOf(this.f71579o);
        objArr[14] = Integer.valueOf(this.f71580p);
        objArr[15] = Integer.valueOf(this.f71581q);
        byte[] bArr2 = this.f71582r;
        if (bArr2 == null) {
            m81551a2 = "null";
        } else {
            m81551a2 = UP7.m81551a(bArr2);
        }
        objArr[16] = m81551a2;
        objArr[17] = Long.valueOf(this.f71583s);
        objArr[18] = Arrays.toString(this.f71584t);
        objArr[19] = Boolean.valueOf(this.f71585u);
        objArr[20] = Boolean.valueOf(this.f71586v);
        return String.format(locale, "AdvertisingOptions{strategy: %s, autoUpgradeBandwidth: %s, enforceTopologyConstraints: %s, enableBluetooth: %s, enableBle: %s, nearbyNotificationsBeaconData: %s, lowPower: %s, fastAdvertisementServiceUuid: %s, enableWifiLan: %s, enableNfc: %s, enableWifiAware: %s, enableBluetoothListening: %s, enableWebRtcListening: %s, enableUwbRanging: %s, uwbChannel: %d, uwbPreambleIndex: %d, remoteUwbAddress: %s, flowId: %d, uwbSenderInfo: %s, enableOutOfBandConnection: %s, disruptiveUpgrade: %s}", objArr);
    }

    /* renamed from: u */
    public boolean m50579u() {
        return this.f71572h;
    }

    /* renamed from: v */
    public Strategy m50578v() {
        return this.f71566b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, m50578v(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f71567c);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f71568d);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f71569e);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f71570f);
        SafeParcelWriter.writeByteArray(parcel, 6, this.f71571g, false);
        SafeParcelWriter.writeBoolean(parcel, 7, m50579u());
        SafeParcelWriter.writeParcelable(parcel, 8, this.f71573i, i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.f71574j);
        SafeParcelWriter.writeBoolean(parcel, 10, this.f71575k);
        SafeParcelWriter.writeBoolean(parcel, 11, this.f71576l);
        SafeParcelWriter.writeBoolean(parcel, 12, this.f71577m);
        SafeParcelWriter.writeBoolean(parcel, 13, this.f71578n);
        SafeParcelWriter.writeBoolean(parcel, 14, this.f71579o);
        SafeParcelWriter.writeInt(parcel, 15, this.f71580p);
        SafeParcelWriter.writeInt(parcel, 16, this.f71581q);
        SafeParcelWriter.writeByteArray(parcel, 17, this.f71582r, false);
        SafeParcelWriter.writeLong(parcel, 18, this.f71583s);
        SafeParcelWriter.writeTypedArray(parcel, 19, this.f71584t, i, false);
        SafeParcelWriter.writeBoolean(parcel, 20, this.f71585u);
        SafeParcelWriter.writeBoolean(parcel, 21, m50580s());
        SafeParcelWriter.writeBoolean(parcel, 22, this.f71587w);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public AdvertisingOptions(@SafeParcelable.Param(m51605id = 1) Strategy strategy, @SafeParcelable.Param(m51605id = 2) boolean z, @SafeParcelable.Param(m51605id = 3) boolean z2, @SafeParcelable.Param(m51605id = 4) boolean z3, @SafeParcelable.Param(m51605id = 5) boolean z4, @SafeParcelable.Param(m51605id = 6) byte[] bArr, @SafeParcelable.Param(m51605id = 7) boolean z5, @SafeParcelable.Param(m51605id = 8) ParcelUuid parcelUuid, @SafeParcelable.Param(m51605id = 9) boolean z6, @SafeParcelable.Param(m51605id = 10) boolean z7, @SafeParcelable.Param(m51605id = 11) boolean z8, @SafeParcelable.Param(m51605id = 12) boolean z9, @SafeParcelable.Param(m51605id = 13) boolean z10, @SafeParcelable.Param(m51605id = 14) boolean z11, @SafeParcelable.Param(m51605id = 15) int i, @SafeParcelable.Param(m51605id = 16) int i2, @SafeParcelable.Param(m51605id = 17) byte[] bArr2, @SafeParcelable.Param(m51605id = 18) long j, @SafeParcelable.Param(m51605id = 19) zzv[] zzvVarArr, @SafeParcelable.Param(m51605id = 20) boolean z12, @SafeParcelable.Param(m51605id = 21) boolean z13, @SafeParcelable.Param(m51605id = 22) boolean z14) {
        this.f71566b = strategy;
        this.f71567c = z;
        this.f71568d = z2;
        this.f71569e = z3;
        this.f71570f = z4;
        this.f71571g = bArr;
        this.f71572h = z5;
        this.f71573i = parcelUuid;
        this.f71574j = z6;
        this.f71575k = z7;
        this.f71576l = z8;
        this.f71577m = z9;
        this.f71578n = z10;
        this.f71579o = z11;
        this.f71580p = i;
        this.f71581q = i2;
        this.f71582r = bArr2;
        this.f71583s = j;
        this.f71584t = zzvVarArr;
        this.f71585u = z12;
        this.f71586v = z13;
        this.f71587w = z14;
    }
}
