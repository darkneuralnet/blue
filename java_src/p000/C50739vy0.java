package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.bluetooth.model.ScannedDevice;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import no.nordicsemi.android.ble.C26664n0;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BC\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b)\u0010*J\u0006\u0010\u0004\u001a\u00020\u0003JQ\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0013\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006+"}, m28432d2 = {"Lvy0;", "T", "LWX;", "Lno/nordicsemi/android/ble/n0;", "b", "Lbi3;", "opMode", "Lco/bird/android/bluetooth/model/ScannedDevice;", "scannedDevice", "LVy;", "manager", "", "retries", "retryDelayMs", "", "useAutoConnect", "c", "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", C17296a.f69688o, "Lbi3;", "()Lbi3;", "Lco/bird/android/bluetooth/model/ScannedDevice;", "getScannedDevice", "()Lco/bird/android/bluetooth/model/ScannedDevice;", "LVy;", DateTokenConverter.CONVERTER_KEY, "()LVy;", "I", "getRetries", "()I", "e", "getRetryDelayMs", "f", "Z", "getUseAutoConnect", "()Z", "<init>", "(Lbi3;Lco/bird/android/bluetooth/model/ScannedDevice;LVy;IIZ)V", "interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: vy0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C50739vy0<T> implements InterfaceC9077WX {

    /* renamed from: a */
    public final EnumC38707bi3 f115008a;

    /* renamed from: b */
    public final ScannedDevice f115009b;

    /* renamed from: c */
    public final AbstractC8883Vy<T> f115010c;

    /* renamed from: d */
    public final int f115011d;

    /* renamed from: e */
    public final int f115012e;

    /* renamed from: f */
    public final boolean f115013f;

    public C50739vy0(EnumC38707bi3 opMode, ScannedDevice scannedDevice, AbstractC8883Vy<T> manager, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(opMode, "opMode");
        Intrinsics.checkNotNullParameter(scannedDevice, "scannedDevice");
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.f115008a = opMode;
        this.f115009b = scannedDevice;
        this.f115010c = manager;
        this.f115011d = i;
        this.f115012e = i2;
        this.f115013f = z;
    }

    public static /* synthetic */ C50739vy0 copy$default(C50739vy0 c50739vy0, EnumC38707bi3 enumC38707bi3, ScannedDevice scannedDevice, AbstractC8883Vy abstractC8883Vy, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            enumC38707bi3 = c50739vy0.f115008a;
        }
        if ((i3 & 2) != 0) {
            scannedDevice = c50739vy0.f115009b;
        }
        ScannedDevice scannedDevice2 = scannedDevice;
        AbstractC8883Vy<T> abstractC8883Vy2 = abstractC8883Vy;
        if ((i3 & 4) != 0) {
            abstractC8883Vy2 = c50739vy0.f115010c;
        }
        AbstractC8883Vy abstractC8883Vy3 = abstractC8883Vy2;
        if ((i3 & 8) != 0) {
            i = c50739vy0.f115011d;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = c50739vy0.f115012e;
        }
        int i5 = i2;
        if ((i3 & 32) != 0) {
            z = c50739vy0.f115013f;
        }
        return c50739vy0.m7689c(enumC38707bi3, scannedDevice2, abstractC8883Vy3, i4, i5, z);
    }

    @Override // p000.InterfaceC9077WX
    /* renamed from: a */
    public EnumC38707bi3 mo7691a() {
        return this.f115008a;
    }

    /* renamed from: b */
    public final C26664n0 m7690b() {
        C26664n0 m22597U = this.f115010c.m5218w(this.f115009b.m59103e().m22434a()).m22593Y(this.f115013f).m22597U(this.f115011d, this.f115012e);
        Intrinsics.checkNotNullExpressionValue(m22597U, "manager.connect(scannedD…ry(retries, retryDelayMs)");
        return m22597U;
    }

    /* renamed from: c */
    public final C50739vy0<T> m7689c(EnumC38707bi3 opMode, ScannedDevice scannedDevice, AbstractC8883Vy<T> manager, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(opMode, "opMode");
        Intrinsics.checkNotNullParameter(scannedDevice, "scannedDevice");
        Intrinsics.checkNotNullParameter(manager, "manager");
        return new C50739vy0<>(opMode, scannedDevice, manager, i, i2, z);
    }

    /* renamed from: d */
    public final AbstractC8883Vy<T> m7688d() {
        return this.f115010c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C50739vy0) {
            C50739vy0 c50739vy0 = (C50739vy0) obj;
            return this.f115008a == c50739vy0.f115008a && Intrinsics.areEqual(this.f115009b, c50739vy0.f115009b) && Intrinsics.areEqual(this.f115010c, c50739vy0.f115010c) && this.f115011d == c50739vy0.f115011d && this.f115012e == c50739vy0.f115012e && this.f115013f == c50739vy0.f115013f;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.f115008a.hashCode() * 31) + this.f115009b.hashCode()) * 31) + this.f115010c.hashCode()) * 31) + Integer.hashCode(this.f115011d)) * 31) + Integer.hashCode(this.f115012e)) * 31;
        boolean z = this.f115013f;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        EnumC38707bi3 enumC38707bi3 = this.f115008a;
        ScannedDevice scannedDevice = this.f115009b;
        AbstractC8883Vy<T> abstractC8883Vy = this.f115010c;
        int i = this.f115011d;
        int i2 = this.f115012e;
        boolean z = this.f115013f;
        return "ConnectionSettings(opMode=" + enumC38707bi3 + ", scannedDevice=" + scannedDevice + ", manager=" + abstractC8883Vy + ", retries=" + i + ", retryDelayMs=" + i2 + ", useAutoConnect=" + z + ")";
    }

    public /* synthetic */ C50739vy0(EnumC38707bi3 enumC38707bi3, ScannedDevice scannedDevice, AbstractC8883Vy abstractC8883Vy, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC38707bi3, scannedDevice, abstractC8883Vy, (i3 & 8) != 0 ? 3 : i, (i3 & 16) != 0 ? 100 : i2, (i3 & 32) != 0 ? false : z);
    }
}
