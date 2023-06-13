package p000;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothDevice;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\u0018\u0000 \u00162\u00020\u0001:\u0001\tB\t\b\u0014¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002R.\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0015\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\t\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u0017\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0016\u0010\u0014R*\u0010\u001a\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0014R*\u0010\u001e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R.\u0010 \u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u001f\u0010\f\"\u0004\b\u001b\u0010\u000e¨\u0006#"}, m28432d2 = {"LZN1;", "", "", "hashCode", "that", "", "equals", "", "<set-?>", C17296a.f69688o, "Ljava/lang/String;", "c", "()Ljava/lang/String;", "h", "(Ljava/lang/String;)V", "proximityUuid", "b", "I", "()I", "f", "(I)V", "major", "g", "minor", DateTokenConverter.CONVERTER_KEY, "i", "rssi", "e", "getTxPower", "j", "txPower", "getBluetoothAddress", "bluetoothAddress", "<init>", "()V", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ZN1 */
/* loaded from: classes4.dex */
public final class ZN1 {

    /* renamed from: k */
    public static final int f48405k = 0;

    /* renamed from: a */
    public String f48407a;

    /* renamed from: b */
    public int f48408b;

    /* renamed from: c */
    public int f48409c;

    /* renamed from: d */
    public int f48410d;

    /* renamed from: e */
    public int f48411e;

    /* renamed from: f */
    public String f48412f;

    /* renamed from: g */
    public static final C10245a f48401g = new C10245a(null);

    /* renamed from: h */
    public static final int f48402h = 1;

    /* renamed from: i */
    public static final int f48403i = 2;

    /* renamed from: j */
    public static final int f48404j = 3;

    /* renamed from: l */
    public static final char[] f48406l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"LZN1$a;", "", "", "scanData", "", "rssi", "Landroid/bluetooth/BluetoothDevice;", "device", "LZN1;", "b", "bytes", "", C17296a.f69688o, "", "hexArray", "[C", "<init>", "()V", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ZN1$a */
    /* loaded from: classes4.dex */
    public static final class C10245a {
        public /* synthetic */ C10245a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m73225a(byte[] bArr) {
            char[] cArr = new char[bArr.length * 2];
            int length = bArr.length;
            for (int i = 0; i < length; i++) {
                int i2 = bArr[i] & UByte.MAX_VALUE;
                int i3 = i * 2;
                cArr[i3] = ZN1.f48406l[i2 >>> 4];
                cArr[i3 + 1] = ZN1.f48406l[i2 & 15];
            }
            return new String(cArr);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
            if (r0 != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
            r0 = new p000.ZN1();
            r0.m73230f(((r10[r1 + 20] & kotlin.UByte.MAX_VALUE) * 256) + (r10[r1 + 21] & kotlin.UByte.MAX_VALUE));
            r0.m73229g(((r10[r1 + 22] & kotlin.UByte.MAX_VALUE) * 256) + (r10[r1 + 23] & kotlin.UByte.MAX_VALUE));
            r0.m73226j(r10[r1 + 24]);
            r0.m73227i(r11);
            r2 = new byte[16];
            java.lang.System.arraycopy(r10, r1 + 4, r2, 0, 16);
            r10 = m73225a(r2);
            r1 = new java.lang.StringBuilder();
            r3 = r10.substring(0, 8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, "this as java.lang.String…ing(startIndex, endIndex)");
            r1.append(r3);
            r1.append(co.bird.android.model.Detail.EMPTY_CHAR);
            r2 = r10.substring(8, 12);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "this as java.lang.String…ing(startIndex, endIndex)");
            r1.append(r2);
            r1.append(co.bird.android.model.Detail.EMPTY_CHAR);
            r2 = r10.substring(12, 16);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "this as java.lang.String…ing(startIndex, endIndex)");
            r1.append(r2);
            r1.append(co.bird.android.model.Detail.EMPTY_CHAR);
            r11 = r10.substring(16, 20);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, "this as java.lang.String…ing(startIndex, endIndex)");
            r1.append(r11);
            r1.append(co.bird.android.model.Detail.EMPTY_CHAR);
            r10 = r10.substring(20, 32);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, "this as java.lang.String…ing(startIndex, endIndex)");
            r1.append(r10);
            r0.m73228h(r1.toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0135, code lost:
            if (r12 == null) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0137, code lost:
            r0.m73231e(r12.getAddress());
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x013e, code lost:
            return r0;
         */
        @TargetApi(5)
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ZN1 m73224b(byte[] scanData, int i, BluetoothDevice bluetoothDevice) {
            boolean z;
            Intrinsics.checkNotNullParameter(scanData, "scanData");
            int i2 = 2;
            while (true) {
                if (i2 > 5) {
                    z = false;
                    break;
                }
                byte b = scanData[i2 + 2];
                if ((b & UByte.MAX_VALUE) == 2 && (scanData[i2 + 3] & UByte.MAX_VALUE) == 21) {
                    z = true;
                    break;
                }
                byte b2 = scanData[i2];
                if ((b2 & UByte.MAX_VALUE) == 45 && (scanData[i2 + 1] & UByte.MAX_VALUE) == 36 && (b & UByte.MAX_VALUE) == 191 && (scanData[i2 + 3] & UByte.MAX_VALUE) == 22) {
                    C41318g46.m40163a("This is a proprietary Estimote beacon advertisement that does not meet the iBeacon standard.  Identifiers cannot be read.", new Object[0]);
                    ZN1 zn1 = new ZN1();
                    zn1.m73230f(0);
                    zn1.m73229g(0);
                    zn1.m73228h("00000000-0000-0000-0000-000000000000");
                    zn1.m73226j(-55);
                    return zn1;
                } else if ((b2 & UByte.MAX_VALUE) == 173 && (scanData[i2 + 1] & UByte.MAX_VALUE) == 119 && (b & UByte.MAX_VALUE) == 0 && (scanData[i2 + 3] & UByte.MAX_VALUE) == 198) {
                    C41318g46.m40163a("This is a proprietary Gimbal beacon advertisement that does not meet the iBeacon standard.  Identifiers cannot be read.", new Object[0]);
                    ZN1 zn12 = new ZN1();
                    zn12.m73230f(0);
                    zn12.m73229g(0);
                    zn12.m73228h("00000000-0000-0000-0000-000000000000");
                    zn12.m73226j(-55);
                    return zn12;
                } else {
                    i2++;
                }
            }
        }

        private C10245a() {
        }
    }

    /* renamed from: a */
    public final int m73235a() {
        return this.f48408b;
    }

    /* renamed from: b */
    public final int m73234b() {
        return this.f48409c;
    }

    /* renamed from: c */
    public final String m73233c() {
        return this.f48407a;
    }

    /* renamed from: d */
    public final int m73232d() {
        return this.f48410d;
    }

    /* renamed from: e */
    public final void m73231e(String str) {
        this.f48412f = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ZN1)) {
            return false;
        }
        ZN1 zn1 = (ZN1) obj;
        if (zn1.f48408b != this.f48408b || zn1.f48409c != this.f48409c || !Intrinsics.areEqual(zn1.f48407a, this.f48407a)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void m73230f(int i) {
        this.f48408b = i;
    }

    /* renamed from: g */
    public final void m73229g(int i) {
        this.f48409c = i;
    }

    /* renamed from: h */
    public final void m73228h(String str) {
        this.f48407a = str;
    }

    public int hashCode() {
        return this.f48409c;
    }

    /* renamed from: i */
    public final void m73227i(int i) {
        this.f48410d = i;
    }

    /* renamed from: j */
    public final void m73226j(int i) {
        this.f48411e = i;
    }
}
