package p000;

import java.io.IOException;
import java.io.InputStream;
/* renamed from: rP5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48035rP5 {

    /* renamed from: A */
    public byte[] f106967A;

    /* renamed from: B */
    public int f106968B;

    /* renamed from: C */
    public int f106969C;

    /* renamed from: D */
    public int f106970D;

    /* renamed from: E */
    public int f106971E;

    /* renamed from: F */
    public int f106972F;

    /* renamed from: G */
    public int f106973G;

    /* renamed from: H */
    public byte[] f106974H;

    /* renamed from: I */
    public int f106975I;

    /* renamed from: J */
    public int f106976J;

    /* renamed from: K */
    public int f106977K;

    /* renamed from: L */
    public int f106978L;

    /* renamed from: M */
    public int f106979M;

    /* renamed from: N */
    public int f106980N;

    /* renamed from: O */
    public int f106981O;

    /* renamed from: P */
    public int f106982P;

    /* renamed from: U */
    public int f106987U;

    /* renamed from: V */
    public int f106988V;

    /* renamed from: W */
    public int f106989W;

    /* renamed from: X */
    public int f106990X;

    /* renamed from: Y */
    public int f106991Y;

    /* renamed from: Z */
    public byte[] f106992Z;

    /* renamed from: b */
    public int f106994b;

    /* renamed from: d */
    public byte[] f106996d;

    /* renamed from: g */
    public int f106999g;

    /* renamed from: h */
    public boolean f107000h;

    /* renamed from: i */
    public boolean f107001i;

    /* renamed from: j */
    public boolean f107002j;

    /* renamed from: w */
    public int f107015w;

    /* renamed from: x */
    public int f107016x;

    /* renamed from: y */
    public int f107017y;

    /* renamed from: z */
    public byte[] f107018z;

    /* renamed from: a */
    public int f106993a = 0;

    /* renamed from: c */
    public final C3535IT f106995c = new C3535IT();

    /* renamed from: e */
    public final int[] f106997e = new int[3240];

    /* renamed from: f */
    public final int[] f106998f = new int[3240];

    /* renamed from: k */
    public final RN1 f107003k = new RN1();

    /* renamed from: l */
    public final RN1 f107004l = new RN1();

    /* renamed from: m */
    public final RN1 f107005m = new RN1();

    /* renamed from: n */
    public final int[] f107006n = new int[3];

    /* renamed from: o */
    public final int[] f107007o = new int[3];

    /* renamed from: p */
    public final int[] f107008p = new int[6];

    /* renamed from: q */
    public final int[] f107009q = {16, 15, 11, 4};

    /* renamed from: r */
    public int f107010r = 0;

    /* renamed from: s */
    public int f107011s = 0;

    /* renamed from: t */
    public int f107012t = 0;

    /* renamed from: u */
    public boolean f107013u = false;

    /* renamed from: v */
    public int f107014v = 0;

    /* renamed from: Q */
    public int f106983Q = 0;

    /* renamed from: R */
    public long f106984R = 0;

    /* renamed from: S */
    public byte[] f106985S = new byte[0];

    /* renamed from: T */
    public int f106986T = 0;

    /* renamed from: a */
    public static void m15992a(C48035rP5 c48035rP5) throws IOException {
        int i = c48035rP5.f106993a;
        if (i != 0) {
            if (i == 11) {
                return;
            }
            c48035rP5.f106993a = 11;
            C3535IT.m102399b(c48035rP5.f106995c);
            return;
        }
        throw new IllegalStateException("State MUST be initialized");
    }

    /* renamed from: b */
    public static int m15991b(C3535IT c3535it) {
        if (C3535IT.m102392i(c3535it, 1) == 0) {
            return 16;
        }
        int m102392i = C3535IT.m102392i(c3535it, 3);
        if (m102392i != 0) {
            return m102392i + 17;
        }
        int m102392i2 = C3535IT.m102392i(c3535it, 3);
        if (m102392i2 == 0) {
            return 17;
        }
        return m102392i2 + 8;
    }

    /* renamed from: c */
    public static void m15990c(C48035rP5 c48035rP5, InputStream inputStream) {
        if (c48035rP5.f106993a == 0) {
            C3535IT.m102396e(c48035rP5.f106995c, inputStream);
            int m15991b = m15991b(c48035rP5.f106995c);
            if (m15991b != 9) {
                int i = 1 << m15991b;
                c48035rP5.f106982P = i;
                c48035rP5.f106981O = i - 16;
                c48035rP5.f106993a = 1;
                return;
            }
            throw new P20("Invalid 'windowBits' code");
        }
        throw new IllegalStateException("State MUST be uninitialized");
    }
}
