package p000;

import ch.qos.logback.core.net.SyslogConstants;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;
import kotlin.UByte;
/* renamed from: td6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C49350td6 extends C19649d {

    /* renamed from: k */
    public static final Pattern f110800k = Pattern.compile("^[0-9A-Fa-f]{32}$");
    private static final long serialVersionUID = 1;

    /* renamed from: f */
    public int f110801f;

    /* renamed from: g */
    public String f110802g;

    /* renamed from: h */
    public int f110803h;

    /* renamed from: i */
    public int f110804i;

    /* renamed from: j */
    public int f110805j;

    public C49350td6() {
        this(26, KotlinVersion.MAX_COMPONENT_VALUE, new byte[]{-102, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 410);
    }

    /* renamed from: j */
    public static C49350td6 m11993j(int i, int i2, byte[] bArr, int i3) {
        if (bArr != null && bArr.length >= 22) {
            return new C49350td6(i, i2, bArr, i3);
        }
        return null;
    }

    /* renamed from: e */
    public final int m11998e(byte[] bArr) {
        return bArr[21] & UByte.MAX_VALUE;
    }

    /* renamed from: f */
    public final int m11997f(byte[] bArr) {
        return bArr[20];
    }

    /* renamed from: g */
    public final int m11996g(byte[] bArr) {
        return bArr[19] & UByte.MAX_VALUE;
    }

    /* renamed from: h */
    public final String m11995h(byte[] bArr) {
        return String.format("%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X", Integer.valueOf(bArr[18] & UByte.MAX_VALUE), Integer.valueOf(bArr[17] & UByte.MAX_VALUE), Integer.valueOf(bArr[16] & UByte.MAX_VALUE), Integer.valueOf(bArr[15] & UByte.MAX_VALUE), Integer.valueOf(bArr[14] & UByte.MAX_VALUE), Integer.valueOf(bArr[13] & UByte.MAX_VALUE), Integer.valueOf(bArr[12] & UByte.MAX_VALUE), Integer.valueOf(bArr[11] & UByte.MAX_VALUE), Integer.valueOf(bArr[10] & UByte.MAX_VALUE), Integer.valueOf(bArr[9] & UByte.MAX_VALUE), Integer.valueOf(bArr[8] & UByte.MAX_VALUE), Integer.valueOf(bArr[7] & UByte.MAX_VALUE), Integer.valueOf(bArr[6] & UByte.MAX_VALUE), Integer.valueOf(bArr[5] & UByte.MAX_VALUE), Integer.valueOf(bArr[4] & UByte.MAX_VALUE), Integer.valueOf(bArr[3] & UByte.MAX_VALUE));
    }

    /* renamed from: i */
    public final int m11994i(byte[] bArr) {
        return bArr[2] & UByte.MAX_VALUE;
    }

    /* renamed from: k */
    public int m11992k() {
        switch (this.f110803h & 15) {
            case 0:
                return 10;
            case 1:
                return 20;
            case 2:
                return 40;
            case 3:
                return 80;
            case 4:
                return SyslogConstants.LOG_LOCAL4;
            case 5:
                return 320;
            case 6:
                return 640;
            case 7:
                return 1280;
            case 8:
                return 2560;
            case 9:
                return 5120;
            default:
                return 10240;
        }
    }

    /* renamed from: l */
    public boolean m11991l() {
        return (this.f110803h & 32) != 0;
    }

    /* renamed from: m */
    public final void m11990m(byte[] bArr) {
        if (bArr != null && bArr.length >= 22) {
            this.f110801f = m11994i(bArr);
            this.f110802g = m11995h(bArr);
            this.f110803h = m11996g(bArr);
            this.f110804i = m11997f(bArr);
            this.f110805j = m11998e(bArr);
            return;
        }
        throw new IllegalArgumentException("The byte sequence cannot be parsed as a ucode.");
    }

    @Override // p000.C19649d, p000.C20674g
    public String toString() {
        return String.format("ucode(Version=%d,Ucode=%s,Status=%d,BatteryLow=%s,Interval=%d,Power=%d,Count=%d)", Integer.valueOf(this.f110801f), this.f110802g, Integer.valueOf(this.f110803h), Boolean.valueOf(m11991l()), Integer.valueOf(m11992k()), Integer.valueOf(this.f110804i), Integer.valueOf(this.f110805j));
    }

    public C49350td6(int i, int i2, byte[] bArr, int i3) {
        super(i, i2, bArr, i3);
        m11990m(bArr);
    }
}
