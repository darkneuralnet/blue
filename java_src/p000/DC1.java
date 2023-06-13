package p000;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.UByte;
/* renamed from: DC1 */
/* loaded from: classes5.dex */
public class DC1 {

    /* renamed from: b */
    public ByteBuffer f5376b;

    /* renamed from: c */
    public CC1 f5377c;

    /* renamed from: a */
    public final byte[] f5375a = new byte[256];

    /* renamed from: d */
    public int f5378d = 0;

    /* renamed from: a */
    public void m110711a() {
        this.f5376b = null;
        this.f5377c = null;
    }

    /* renamed from: b */
    public final boolean m110710b() {
        return this.f5377c.f3585b != 0;
    }

    /* renamed from: c */
    public CC1 m110709c() {
        if (this.f5376b != null) {
            if (m110710b()) {
                return this.f5377c;
            }
            m110701k();
            if (!m110710b()) {
                m110704h();
                CC1 cc1 = this.f5377c;
                if (cc1.f3586c < 0) {
                    cc1.f3585b = 1;
                }
            }
            return this.f5377c;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    /* renamed from: d */
    public final int m110708d() {
        try {
            return this.f5376b.get() & UByte.MAX_VALUE;
        } catch (Exception unused) {
            this.f5377c.f3585b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    public final void m110707e() {
        boolean z;
        this.f5377c.f3587d.f120941a = m110698n();
        this.f5377c.f3587d.f120942b = m110698n();
        this.f5377c.f3587d.f120943c = m110698n();
        this.f5377c.f3587d.f120944d = m110698n();
        int m110708d = m110708d();
        boolean z2 = false;
        if ((m110708d & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        int pow = (int) Math.pow(2.0d, (m110708d & 7) + 1);
        C52656zC1 c52656zC1 = this.f5377c.f3587d;
        if ((m110708d & 64) != 0) {
            z2 = true;
        }
        c52656zC1.f120945e = z2;
        if (z) {
            c52656zC1.f120951k = m110705g(pow);
        } else {
            c52656zC1.f120951k = null;
        }
        this.f5377c.f3587d.f120950j = this.f5376b.position();
        m110694r();
        if (m110710b()) {
            return;
        }
        CC1 cc1 = this.f5377c;
        cc1.f3586c++;
        cc1.f3588e.add(cc1.f3587d);
    }

    /* renamed from: f */
    public final void m110706f() {
        int m110708d = m110708d();
        this.f5378d = m110708d;
        if (m110708d > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    i2 = this.f5378d;
                    if (i < i2) {
                        i2 -= i;
                        this.f5376b.get(this.f5375a, i, i2);
                        i += i2;
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.f5378d, e);
                    }
                    this.f5377c.f3585b = 1;
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    public final int[] m110705g(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f5376b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & UByte.MAX_VALUE) << 16) | (-16777216) | ((bArr[i4] & UByte.MAX_VALUE) << 8) | (bArr[i5] & UByte.MAX_VALUE);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f5377c.f3585b = 1;
        }
        return iArr;
    }

    /* renamed from: h */
    public final void m110704h() {
        m110703i(Integer.MAX_VALUE);
    }

    /* renamed from: i */
    public final void m110703i(int i) {
        boolean z = false;
        while (!z && !m110710b() && this.f5377c.f3586c <= i) {
            int m110708d = m110708d();
            if (m110708d != 33) {
                if (m110708d != 44) {
                    if (m110708d != 59) {
                        this.f5377c.f3585b = 1;
                    } else {
                        z = true;
                    }
                } else {
                    CC1 cc1 = this.f5377c;
                    if (cc1.f3587d == null) {
                        cc1.f3587d = new C52656zC1();
                    }
                    m110707e();
                }
            } else {
                int m110708d2 = m110708d();
                if (m110708d2 != 1) {
                    if (m110708d2 != 249) {
                        if (m110708d2 != 254) {
                            if (m110708d2 != 255) {
                                m110695q();
                            } else {
                                m110706f();
                                StringBuilder sb = new StringBuilder();
                                for (int i2 = 0; i2 < 11; i2++) {
                                    sb.append((char) this.f5375a[i2]);
                                }
                                if (sb.toString().equals("NETSCAPE2.0")) {
                                    m110699m();
                                } else {
                                    m110695q();
                                }
                            }
                        } else {
                            m110695q();
                        }
                    } else {
                        this.f5377c.f3587d = new C52656zC1();
                        m110702j();
                    }
                } else {
                    m110695q();
                }
            }
        }
    }

    /* renamed from: j */
    public final void m110702j() {
        m110708d();
        int m110708d = m110708d();
        C52656zC1 c52656zC1 = this.f5377c.f3587d;
        int i = (m110708d & 28) >> 2;
        c52656zC1.f120947g = i;
        boolean z = true;
        if (i == 0) {
            c52656zC1.f120947g = 1;
        }
        if ((m110708d & 1) == 0) {
            z = false;
        }
        c52656zC1.f120946f = z;
        int m110698n = m110698n();
        if (m110698n < 2) {
            m110698n = 10;
        }
        C52656zC1 c52656zC12 = this.f5377c.f3587d;
        c52656zC12.f120949i = m110698n * 10;
        c52656zC12.f120948h = m110708d();
        m110708d();
    }

    /* renamed from: k */
    public final void m110701k() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m110708d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f5377c.f3585b = 1;
            return;
        }
        m110700l();
        if (this.f5377c.f3591h && !m110710b()) {
            CC1 cc1 = this.f5377c;
            cc1.f3584a = m110705g(cc1.f3592i);
            CC1 cc12 = this.f5377c;
            cc12.f3595l = cc12.f3584a[cc12.f3593j];
        }
    }

    /* renamed from: l */
    public final void m110700l() {
        boolean z;
        this.f5377c.f3589f = m110698n();
        this.f5377c.f3590g = m110698n();
        int m110708d = m110708d();
        CC1 cc1 = this.f5377c;
        if ((m110708d & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        cc1.f3591h = z;
        cc1.f3592i = (int) Math.pow(2.0d, (m110708d & 7) + 1);
        this.f5377c.f3593j = m110708d();
        this.f5377c.f3594k = m110708d();
    }

    /* renamed from: m */
    public final void m110699m() {
        do {
            m110706f();
            byte[] bArr = this.f5375a;
            if (bArr[0] == 1) {
                this.f5377c.f3596m = ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE);
            }
            if (this.f5378d <= 0) {
                return;
            }
        } while (!m110710b());
    }

    /* renamed from: n */
    public final int m110698n() {
        return this.f5376b.getShort();
    }

    /* renamed from: o */
    public final void m110697o() {
        this.f5376b = null;
        Arrays.fill(this.f5375a, (byte) 0);
        this.f5377c = new CC1();
        this.f5378d = 0;
    }

    /* renamed from: p */
    public DC1 m110696p(ByteBuffer byteBuffer) {
        m110697o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f5376b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f5376b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    /* renamed from: q */
    public final void m110695q() {
        int m110708d;
        do {
            m110708d = m110708d();
            this.f5376b.position(Math.min(this.f5376b.position() + m110708d, this.f5376b.limit()));
        } while (m110708d > 0);
    }

    /* renamed from: r */
    public final void m110694r() {
        m110708d();
        m110695q();
    }
}
