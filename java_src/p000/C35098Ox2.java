package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import ch.qos.logback.core.CoreConstants;
import java.util.UUID;
import kotlin.UByte;
import okhttp3.HttpUrl;
/* renamed from: Ox2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C35098Ox2 {

    /* renamed from: a */
    public static final char[] f27598a = "0123456789ABCDEF".toCharArray();

    /* renamed from: Ox2$a */
    /* loaded from: classes6.dex */
    public static class C6209a {

        /* renamed from: a */
        public final UUID f27599a;

        /* renamed from: b */
        public final byte[] f27600b;

        /* renamed from: c */
        public final boolean f27601c;

        public C6209a(UUID uuid, byte[] bArr, boolean z) {
            this.f27599a = uuid;
            this.f27600b = bArr;
            this.f27601c = z;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[uuid='");
            sb.append(C35098Ox2.m91169g(this.f27599a));
            if (this.f27601c) {
                str = "', hexValue=" + C35098Ox2.m91175a(this.f27600b);
            } else {
                str = "'";
            }
            sb.append(str);
            sb.append(']');
            return sb.toString();
        }
    }

    private C35098Ox2() {
    }

    /* renamed from: a */
    public static String m91175a(byte[] bArr) {
        if (bArr == null) {
            return "null";
        }
        if (!C52323ye5.m3121h()) {
            return "[...]";
        }
        int length = bArr.length;
        if (length == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        int i = length - 1;
        int i2 = (length * 2) + (i * 2) + 2;
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = bArr[i3] & UByte.MAX_VALUE;
            int i5 = i3 * 2;
            int i6 = i5 + 1 + i5;
            char[] cArr2 = f27598a;
            cArr[i6] = cArr2[i4 >>> 4];
            cArr[i6 + 1] = cArr2[i4 & 15];
        }
        for (int i7 = 0; i7 < i; i7++) {
            int i8 = i7 * 2;
            int i9 = i8 + 1 + i8 + 2;
            cArr[i9] = CoreConstants.COMMA_CHAR;
            cArr[i9 + 1] = ' ';
        }
        cArr[0] = '[';
        cArr[i2 - 1] = ']';
        return new String(cArr);
    }

    /* renamed from: b */
    public static String m91174b() {
        return " %24s()";
    }

    /* renamed from: c */
    public static String m91173c(BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt == null) {
            return "MAC=null";
        }
        return m91172d(bluetoothGatt.getDevice().getAddress());
    }

    /* renamed from: d */
    public static String m91172d(String str) {
        if (str == null) {
            return "MAC=null";
        }
        int m3122g = C52323ye5.m3122g();
        if (m3122g != 3) {
            if (m3122g == Integer.MAX_VALUE) {
                str = "XX:XX:XX:XX:XX:XX";
            }
        } else {
            str = str.substring(0, 15) + "XX";
        }
        return String.format("MAC='%s'", str);
    }

    /* renamed from: e */
    public static String m91171e() {
        return ", status=%d";
    }

    /* renamed from: f */
    public static String m91170f() {
        return ", value=%s";
    }

    /* renamed from: g */
    public static String m91169g(UUID uuid) {
        if (C52323ye5.m3119j() == 2) {
            return uuid.toString();
        }
        return "...";
    }

    /* renamed from: h */
    public static void m91168h(String str, BluetoothGatt bluetoothGatt, int i) {
        if (!C52323ye5.m3117l(4)) {
            return;
        }
        C52323ye5.m3118k(m91173c(bluetoothGatt) + m91174b() + m91171e(), str, Integer.valueOf(i));
    }

    /* renamed from: i */
    public static void m91167i(String str, BluetoothGatt bluetoothGatt, int i, int i2) {
        if (!C52323ye5.m3117l(4)) {
            return;
        }
        C52323ye5.m3118k(m91173c(bluetoothGatt) + m91174b() + m91171e() + m91170f(), str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: j */
    public static void m91166j(String str, BluetoothGatt bluetoothGatt, int i, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        if (!C52323ye5.m3117l(4)) {
            return;
        }
        C6209a c6209a = new C6209a(bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getValue(), z);
        C52323ye5.m3118k(m91173c(bluetoothGatt) + m91174b() + m91171e() + m91170f(), str, Integer.valueOf(i), c6209a);
    }

    /* renamed from: k */
    public static void m91165k(String str, BluetoothGatt bluetoothGatt, int i, BluetoothGattDescriptor bluetoothGattDescriptor, boolean z) {
        if (!C52323ye5.m3117l(4)) {
            return;
        }
        C6209a c6209a = new C6209a(bluetoothGattDescriptor.getUuid(), bluetoothGattDescriptor.getValue(), z);
        C52323ye5.m3118k(m91173c(bluetoothGatt) + m91174b() + m91171e() + m91170f(), str, Integer.valueOf(i), c6209a);
    }

    /* renamed from: l */
    public static void m91164l(String str, BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        if (!C52323ye5.m3117l(4)) {
            return;
        }
        C6209a c6209a = new C6209a(bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getValue(), z);
        C52323ye5.m3118k(m91173c(bluetoothGatt) + m91174b() + m91170f(), str, c6209a);
    }

    /* renamed from: m */
    public static void m91163m(String str, BluetoothGatt bluetoothGatt, int i, int i2, int i3, int i4) {
        if (!C52323ye5.m3117l(4)) {
            return;
        }
        C52323ye5.m3118k(m91173c(bluetoothGatt) + m91174b() + m91171e() + ", interval=%d (%.2f ms), latency=%d, timeout=%d (%.0f ms)", str, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(i2 * 1.25f), Integer.valueOf(i3), Integer.valueOf(i4), Float.valueOf(i4 * 10.0f));
    }

    /* renamed from: n */
    public static void m91162n(InterfaceC37295Yh3 interfaceC37295Yh3, long j, long j2) {
        if (C52323ye5.m3117l(3)) {
            C52323ye5.m3127b("FINISHED %s(%d) in %d ms", interfaceC37295Yh3.getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(interfaceC37295Yh3)), Long.valueOf(j2 - j));
        }
    }

    /* renamed from: o */
    public static void m91161o(InterfaceC37295Yh3 interfaceC37295Yh3) {
        if (C52323ye5.m3117l(3)) {
            C52323ye5.m3127b("QUEUED   %s(%d)", interfaceC37295Yh3.getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(interfaceC37295Yh3)));
        }
    }

    /* renamed from: p */
    public static void m91160p(InterfaceC37295Yh3 interfaceC37295Yh3) {
        if (C52323ye5.m3117l(3)) {
            C52323ye5.m3127b("REMOVED  %s(%d)", interfaceC37295Yh3.getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(interfaceC37295Yh3)));
        }
    }

    /* renamed from: q */
    public static void m91159q(InterfaceC37295Yh3 interfaceC37295Yh3) {
        C52323ye5.m3118k("RUNNING  %s", interfaceC37295Yh3);
    }

    /* renamed from: r */
    public static void m91158r(InterfaceC37295Yh3 interfaceC37295Yh3) {
        if (C52323ye5.m3117l(2)) {
            C52323ye5.m3112q("SKIPPED  %s(%d) just before running — is disposed", interfaceC37295Yh3.getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(interfaceC37295Yh3)));
        }
    }

    /* renamed from: s */
    public static void m91157s(InterfaceC37295Yh3 interfaceC37295Yh3) {
        if (C52323ye5.m3117l(3)) {
            C52323ye5.m3127b("STARTED  %s(%d)", interfaceC37295Yh3.getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(interfaceC37295Yh3)));
        }
    }
}
