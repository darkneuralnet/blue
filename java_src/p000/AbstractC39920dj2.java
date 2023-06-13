package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
/* renamed from: dj2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC39920dj2 implements Closeable {

    /* renamed from: h */
    public static final String[] f77113h = new String[128];

    /* renamed from: b */
    public int f77114b;

    /* renamed from: c */
    public int[] f77115c = new int[32];

    /* renamed from: d */
    public String[] f77116d = new String[32];

    /* renamed from: e */
    public int[] f77117e = new int[32];

    /* renamed from: f */
    public boolean f77118f;

    /* renamed from: g */
    public boolean f77119g;

    /* renamed from: dj2$a */
    /* loaded from: classes2.dex */
    public static final class C19847a {

        /* renamed from: a */
        public final String[] f77120a;

        /* renamed from: b */
        public final C48371ry3 f77121b;

        public C19847a(String[] strArr, C48371ry3 c48371ry3) {
            this.f77120a = strArr;
            this.f77121b = c48371ry3;
        }

        /* renamed from: a */
        public static C19847a m43839a(String... strArr) {
            try {
                M70[] m70Arr = new M70[strArr.length];
                C42488i30 c42488i30 = new C42488i30();
                for (int i = 0; i < strArr.length; i++) {
                    AbstractC39920dj2.m43841v(c42488i30, strArr[i]);
                    c42488i30.readByte();
                    m70Arr[i] = c42488i30.mo21936h1();
                }
                return new C19847a((String[]) strArr.clone(), C48371ry3.m14968j(m70Arr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: dj2$b */
    /* loaded from: classes2.dex */
    public enum EnumC19848b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f77113h[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f77113h;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* renamed from: p */
    public static AbstractC39920dj2 m43843p(InterfaceC46046o30 interfaceC46046o30) {
        return new C52370yj2(interfaceC46046o30);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m43841v(InterfaceC45453n30 interfaceC45453n30, String str) throws IOException {
        String str2;
        String[] strArr = f77113h;
        interfaceC45453n30.mo24534M0(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
                if (i < i2) {
                    interfaceC45453n30.mo24526g0(str, i, i2);
                }
                interfaceC45453n30.mo24530a2(str2);
                i = i2 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                }
                interfaceC45453n30.mo24530a2(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            interfaceC45453n30.mo24526g0(str, i, length);
        }
        interfaceC45453n30.mo24534M0(34);
    }

    /* renamed from: b */
    public abstract void mo2771b() throws IOException;

    /* renamed from: c */
    public abstract void mo2770c() throws IOException;

    /* renamed from: d */
    public abstract void mo2769d() throws IOException;

    /* renamed from: f */
    public abstract void mo2768f() throws IOException;

    /* renamed from: g */
    public abstract boolean mo2767g() throws IOException;

    public final String getPath() {
        return C43477jj2.m30025a(this.f77114b, this.f77115c, this.f77116d, this.f77117e);
    }

    /* renamed from: i */
    public abstract boolean mo2766i() throws IOException;

    /* renamed from: k */
    public abstract double mo2765k() throws IOException;

    /* renamed from: l */
    public abstract int mo2764l() throws IOException;

    /* renamed from: m */
    public abstract String mo2763m() throws IOException;

    /* renamed from: n */
    public abstract String mo2762n() throws IOException;

    /* renamed from: q */
    public abstract EnumC19848b mo2761q() throws IOException;

    /* renamed from: r */
    public final void m43842r(int i) {
        int i2 = this.f77114b;
        int[] iArr = this.f77115c;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.f77115c = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f77116d;
                this.f77116d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f77117e;
                this.f77117e = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new C48211ri2("Nesting too deep at " + getPath());
            }
        }
        int[] iArr3 = this.f77115c;
        int i3 = this.f77114b;
        this.f77114b = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: s */
    public abstract int mo2760s(C19847a c19847a) throws IOException;

    /* renamed from: t */
    public abstract void mo2759t() throws IOException;

    /* renamed from: u */
    public abstract void mo2758u() throws IOException;

    /* renamed from: x */
    public final C32623Ei2 m43840x(String str) throws C32623Ei2 {
        throw new C32623Ei2(str + " at path " + getPath());
    }
}
