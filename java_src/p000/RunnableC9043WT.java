package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.NetworkInfo;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import p000.C42732iT3;
import p000.K73;
import p000.PI4;
/* renamed from: WT */
/* loaded from: classes6.dex */
public class RunnableC9043WT implements Runnable {

    /* renamed from: u */
    public static final Object f41083u = new Object();

    /* renamed from: v */
    public static final ThreadLocal<StringBuilder> f41084v = new C9044a();

    /* renamed from: w */
    public static final AtomicInteger f41085w = new AtomicInteger();

    /* renamed from: x */
    public static final PI4 f41086x = new C9045b();

    /* renamed from: b */
    public final int f41087b = f41085w.incrementAndGet();

    /* renamed from: c */
    public final C42732iT3 f41088c;

    /* renamed from: d */
    public final Q41 f41089d;

    /* renamed from: e */
    public final InterfaceC37777a80 f41090e;

    /* renamed from: f */
    public final C44486lQ5 f41091f;

    /* renamed from: g */
    public final String f41092g;

    /* renamed from: h */
    public final C47378qI4 f41093h;

    /* renamed from: i */
    public final int f41094i;

    /* renamed from: j */
    public int f41095j;

    /* renamed from: k */
    public final PI4 f41096k;

    /* renamed from: l */
    public AbstractC30874z2 f41097l;

    /* renamed from: m */
    public List<AbstractC30874z2> f41098m;

    /* renamed from: n */
    public Bitmap f41099n;

    /* renamed from: o */
    public Future<?> f41100o;

    /* renamed from: p */
    public C42732iT3.EnumC23266e f41101p;

    /* renamed from: q */
    public Exception f41102q;

    /* renamed from: r */
    public int f41103r;

    /* renamed from: s */
    public int f41104s;

    /* renamed from: t */
    public C42732iT3.EnumC23267f f41105t;

    /* renamed from: WT$a */
    /* loaded from: classes6.dex */
    public static class C9044a extends ThreadLocal<StringBuilder> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* renamed from: WT$b */
    /* loaded from: classes6.dex */
    public static class C9045b extends PI4 {
        @Override // p000.PI4
        /* renamed from: c */
        public boolean mo11130c(C47378qI4 c47378qI4) {
            return true;
        }

        @Override // p000.PI4
        /* renamed from: f */
        public PI4.C6313a mo11129f(C47378qI4 c47378qI4, int i) throws IOException {
            throw new IllegalStateException("Unrecognized type of request: " + c47378qI4);
        }
    }

    /* renamed from: WT$c */
    /* loaded from: classes6.dex */
    public static class RunnableC9046c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC47298q96 f41106b;

        /* renamed from: c */
        public final /* synthetic */ RuntimeException f41107c;

        public RunnableC9046c(InterfaceC47298q96 interfaceC47298q96, RuntimeException runtimeException) {
            this.f41106b = interfaceC47298q96;
            this.f41107c = runtimeException;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException("Transformation " + this.f41106b.key() + " crashed with exception.", this.f41107c);
        }
    }

    /* renamed from: WT$d */
    /* loaded from: classes6.dex */
    public static class RunnableC9047d implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ StringBuilder f41108b;

        public RunnableC9047d(StringBuilder sb) {
            this.f41108b = sb;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new NullPointerException(this.f41108b.toString());
        }
    }

    /* renamed from: WT$e */
    /* loaded from: classes6.dex */
    public static class RunnableC9048e implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC47298q96 f41109b;

        public RunnableC9048e(InterfaceC47298q96 interfaceC47298q96) {
            this.f41109b = interfaceC47298q96;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.f41109b.key() + " returned input Bitmap but recycled it.");
        }
    }

    /* renamed from: WT$f */
    /* loaded from: classes6.dex */
    public static class RunnableC9049f implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC47298q96 f41110b;

        public RunnableC9049f(InterfaceC47298q96 interfaceC47298q96) {
            this.f41110b = interfaceC47298q96;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.f41110b.key() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    public RunnableC9043WT(C42732iT3 c42732iT3, Q41 q41, InterfaceC37777a80 interfaceC37777a80, C44486lQ5 c44486lQ5, AbstractC30874z2 abstractC30874z2, PI4 pi4) {
        this.f41088c = c42732iT3;
        this.f41089d = q41;
        this.f41090e = interfaceC37777a80;
        this.f41091f = c44486lQ5;
        this.f41097l = abstractC30874z2;
        this.f41092g = abstractC30874z2.m1987d();
        this.f41093h = abstractC30874z2.m1982i();
        this.f41105t = abstractC30874z2.m1983h();
        this.f41094i = abstractC30874z2.m1986e();
        this.f41095j = abstractC30874z2.m1985f();
        this.f41096k = pi4;
        this.f41104s = pi4.mo90495e();
    }

    /* renamed from: a */
    public static Bitmap m78370a(List<InterfaceC47298q96> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            InterfaceC47298q96 interfaceC47298q96 = list.get(i);
            try {
                Bitmap transform = interfaceC47298q96.transform(bitmap);
                if (transform == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Transformation ");
                    sb.append(interfaceC47298q96.key());
                    sb.append(" returned null after ");
                    sb.append(i);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (InterfaceC47298q96 interfaceC47298q962 : list) {
                        sb.append(interfaceC47298q962.key());
                        sb.append('\n');
                    }
                    C42732iT3.f87356o.post(new RunnableC9047d(sb));
                    return null;
                } else if (transform == bitmap && bitmap.isRecycled()) {
                    C42732iT3.f87356o.post(new RunnableC9048e(interfaceC47298q96));
                    return null;
                } else if (transform != bitmap && !bitmap.isRecycled()) {
                    C42732iT3.f87356o.post(new RunnableC9049f(interfaceC47298q96));
                    return null;
                } else {
                    i++;
                    bitmap = transform;
                }
            } catch (RuntimeException e) {
                C42732iT3.f87356o.post(new RunnableC9046c(interfaceC47298q96, e));
                return null;
            }
        }
        return bitmap;
    }

    /* renamed from: e */
    public static Bitmap m78366e(AN5 an5, C47378qI4 c47378qI4) throws IOException {
        InterfaceC46046o30 m91759d = C34928Oe3.m91759d(an5);
        boolean m106694r = C32861Fi6.m106694r(m91759d);
        boolean z = c47378qI4.f105073r;
        BitmapFactory.Options m90496d = PI4.m90496d(c47378qI4);
        boolean m90494g = PI4.m90494g(m90496d);
        if (!m106694r) {
            InputStream mo21930w3 = m91759d.mo21930w3();
            if (m90494g) {
                C40296eM2 c40296eM2 = new C40296eM2(mo21930w3);
                c40296eM2.m43003a(false);
                long m43001c = c40296eM2.m43001c(1024);
                BitmapFactory.decodeStream(c40296eM2, null, m90496d);
                PI4.m90497b(c47378qI4.f105063h, c47378qI4.f105064i, m90496d, c47378qI4);
                c40296eM2.m43002b(m43001c);
                c40296eM2.m43003a(true);
                mo21930w3 = c40296eM2;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(mo21930w3, null, m90496d);
            if (decodeStream != null) {
                return decodeStream;
            }
            throw new IOException("Failed to decode stream.");
        }
        byte[] mo21946L0 = m91759d.mo21946L0();
        if (m90494g) {
            BitmapFactory.decodeByteArray(mo21946L0, 0, mo21946L0.length, m90496d);
            PI4.m90497b(c47378qI4.f105063h, c47378qI4.f105064i, m90496d, c47378qI4);
        }
        return BitmapFactory.decodeByteArray(mo21946L0, 0, mo21946L0.length, m90496d);
    }

    /* renamed from: g */
    public static RunnableC9043WT m78364g(C42732iT3 c42732iT3, Q41 q41, InterfaceC37777a80 interfaceC37777a80, C44486lQ5 c44486lQ5, AbstractC30874z2 abstractC30874z2) {
        C47378qI4 m1982i = abstractC30874z2.m1982i();
        List<PI4> m33880i = c42732iT3.m33880i();
        int size = m33880i.size();
        for (int i = 0; i < size; i++) {
            PI4 pi4 = m33880i.get(i);
            if (pi4.mo11130c(m1982i)) {
                return new RunnableC9043WT(c42732iT3, q41, interfaceC37777a80, c44486lQ5, abstractC30874z2, pi4);
            }
        }
        return new RunnableC9043WT(c42732iT3, q41, interfaceC37777a80, c44486lQ5, abstractC30874z2, f41086x);
    }

    /* renamed from: l */
    public static int m78359l(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: m */
    public static int m78358m(int i) {
        return (i == 2 || i == 7 || i == 4 || i == 5) ? -1 : 1;
    }

    /* renamed from: v */
    public static boolean m78349v(boolean z, int i, int i2, int i3, int i4) {
        return !z || (i3 != 0 && i > i3) || (i4 != 0 && i2 > i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x024f  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap m78346y(C47378qI4 c47378qI4, Bitmap bitmap, int i) {
        int i2;
        int i3;
        boolean z;
        Matrix matrix;
        int i4;
        int i5;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        int i6;
        int i7;
        float f9;
        float f10;
        float f11;
        int i8;
        int i9;
        float f12;
        boolean z2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Bitmap createBitmap;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z3 = c47378qI4.f105068m;
        Matrix matrix2 = new Matrix();
        if (!c47378qI4.m17646e() && i == 0) {
            i5 = width;
            i4 = height;
            matrix = matrix2;
        } else {
            int i18 = c47378qI4.f105063h;
            int i19 = c47378qI4.f105064i;
            float f13 = c47378qI4.f105069n;
            if (f13 != 0.0f) {
                double d = f13;
                double cos = Math.cos(Math.toRadians(d));
                double sin = Math.sin(Math.toRadians(d));
                if (c47378qI4.f105072q) {
                    matrix2.setRotate(f13, c47378qI4.f105070o, c47378qI4.f105071p);
                    float f14 = c47378qI4.f105070o;
                    double d2 = 1.0d - cos;
                    float f15 = c47378qI4.f105071p;
                    i3 = height;
                    z = z3;
                    double d3 = (f14 * d2) + (f15 * sin);
                    double d4 = (f15 * d2) - (f14 * sin);
                    int i20 = c47378qI4.f105063h;
                    double d5 = (i20 * cos) + d3;
                    double d6 = (i20 * sin) + d4;
                    int i21 = c47378qI4.f105064i;
                    i2 = width;
                    double d7 = (d3 + (i20 * cos)) - (i21 * sin);
                    double d8 = (i20 * sin) + d4 + (i21 * cos);
                    double d9 = d3 - (i21 * sin);
                    double d10 = (i21 * cos) + d4;
                    double max = Math.max(d9, Math.max(d7, Math.max(d3, d5)));
                    double min = Math.min(d9, Math.min(d7, Math.min(d3, d5)));
                    double max2 = Math.max(d10, Math.max(d8, Math.max(d4, d6)));
                    double min2 = Math.min(d10, Math.min(d8, Math.min(d4, d6)));
                    i18 = (int) Math.floor(max - min);
                    i19 = (int) Math.floor(max2 - min2);
                    matrix = matrix2;
                } else {
                    i2 = width;
                    i3 = height;
                    z = z3;
                    matrix = matrix2;
                    matrix.setRotate(f13);
                    int i22 = c47378qI4.f105063h;
                    double d11 = i22 * cos;
                    double d12 = i22 * sin;
                    int i23 = c47378qI4.f105064i;
                    double d13 = (i22 * cos) - (i23 * sin);
                    double d14 = (i22 * sin) + (i23 * cos);
                    double d15 = -(i23 * sin);
                    double d16 = i23 * cos;
                    double max3 = Math.max(d15, Math.max(d13, Math.max(0.0d, d11)));
                    double min3 = Math.min(d15, Math.min(d13, Math.min(0.0d, d11)));
                    i19 = (int) Math.floor(Math.max(d16, Math.max(d14, Math.max(0.0d, d12))) - Math.min(d16, Math.min(d14, Math.min(0.0d, d12))));
                    i18 = (int) Math.floor(max3 - min3);
                }
            } else {
                i2 = width;
                i3 = height;
                z = z3;
                matrix = matrix2;
            }
            if (i != 0) {
                int m78359l = m78359l(i);
                int m78358m = m78358m(i);
                if (m78359l != 0) {
                    matrix.preRotate(m78359l);
                    if (m78359l == 90 || m78359l == 270) {
                        int i24 = i19;
                        i19 = i18;
                        i18 = i24;
                    }
                }
                if (m78358m != 1) {
                    matrix.postScale(m78358m, 1.0f);
                }
            }
            if (c47378qI4.f105065j) {
                if (i18 != 0) {
                    i6 = i2;
                    f9 = i18 / i6;
                    i7 = i3;
                } else {
                    i6 = i2;
                    i7 = i3;
                    f9 = i19 / i7;
                }
                if (i19 != 0) {
                    f10 = i19;
                    f11 = i7;
                } else {
                    f10 = i18;
                    f11 = i6;
                }
                float f16 = f10 / f11;
                if (f9 > f16) {
                    int ceil = (int) Math.ceil(i7 * (f16 / f9));
                    int i25 = c47378qI4.f105066k;
                    if ((i25 & 48) == 48) {
                        i17 = 0;
                    } else if ((i25 & 80) == 80) {
                        i17 = i7 - ceil;
                    } else {
                        i17 = (i7 - ceil) / 2;
                    }
                    f12 = i19 / ceil;
                    i9 = ceil;
                    z2 = z;
                    i11 = 0;
                    i10 = i17;
                    i8 = i6;
                } else if (f9 < f16) {
                    int ceil2 = (int) Math.ceil(i6 * (f9 / f16));
                    int i26 = c47378qI4.f105066k;
                    if ((i26 & 3) == 3) {
                        i12 = 0;
                    } else if ((i26 & 5) == 5) {
                        i12 = i6 - ceil2;
                    } else {
                        i12 = (i6 - ceil2) / 2;
                    }
                    i11 = i12;
                    i8 = ceil2;
                    i9 = i7;
                    f9 = i18 / ceil2;
                    z2 = z;
                    f12 = f16;
                    i10 = 0;
                } else {
                    i8 = i6;
                    i9 = i7;
                    f9 = f16;
                    f12 = f9;
                    z2 = z;
                    i10 = 0;
                    i11 = 0;
                }
                if (m78349v(z2, i6, i7, i18, i19)) {
                    matrix.preScale(f9, f12);
                }
                i13 = i10;
                i14 = i9;
                i15 = i11;
                i16 = i8;
                createBitmap = Bitmap.createBitmap(bitmap, i15, i13, i16, i14, matrix, true);
                if (createBitmap == bitmap) {
                    bitmap.recycle();
                    return createBitmap;
                }
                return bitmap;
            }
            i4 = i3;
            boolean z4 = z;
            i5 = i2;
            if (c47378qI4.f105067l) {
                if (i18 != 0) {
                    f5 = i18;
                    f6 = i5;
                } else {
                    f5 = i19;
                    f6 = i4;
                }
                float f17 = f5 / f6;
                if (i19 != 0) {
                    f7 = i19;
                    f8 = i4;
                } else {
                    f7 = i18;
                    f8 = i5;
                }
                float f18 = f7 / f8;
                if (f17 >= f18) {
                    f17 = f18;
                }
                if (m78349v(z4, i5, i4, i18, i19)) {
                    matrix.preScale(f17, f17);
                }
            } else if ((i18 != 0 || i19 != 0) && (i18 != i5 || i19 != i4)) {
                if (i18 != 0) {
                    f = i18;
                    f2 = i5;
                } else {
                    f = i19;
                    f2 = i4;
                }
                float f19 = f / f2;
                if (i19 != 0) {
                    f3 = i19;
                    f4 = i4;
                } else {
                    f3 = i18;
                    f4 = i5;
                }
                float f20 = f3 / f4;
                if (m78349v(z4, i5, i4, i18, i19)) {
                    matrix.preScale(f19, f20);
                }
            }
        }
        i16 = i5;
        i14 = i4;
        i15 = 0;
        i13 = 0;
        createBitmap = Bitmap.createBitmap(bitmap, i15, i13, i16, i14, matrix, true);
        if (createBitmap == bitmap) {
        }
    }

    /* renamed from: z */
    public static void m78345z(C47378qI4 c47378qI4) {
        String m17650a = c47378qI4.m17650a();
        StringBuilder sb = f41084v.get();
        sb.ensureCapacity(m17650a.length() + 8);
        sb.replace(8, sb.length(), m17650a);
        Thread.currentThread().setName(sb.toString());
    }

    /* renamed from: b */
    public void m78369b(AbstractC30874z2 abstractC30874z2) {
        boolean z = this.f41088c.f87370m;
        C47378qI4 c47378qI4 = abstractC30874z2.f120629b;
        if (this.f41097l == null) {
            this.f41097l = abstractC30874z2;
            if (z) {
                List<AbstractC30874z2> list = this.f41098m;
                if (list != null && !list.isEmpty()) {
                    C32861Fi6.m106692t("Hunter", "joined", c47378qI4.m17647d(), C32861Fi6.m106701k(this, "to "));
                    return;
                } else {
                    C32861Fi6.m106692t("Hunter", "joined", c47378qI4.m17647d(), "to empty hunter");
                    return;
                }
            }
            return;
        }
        if (this.f41098m == null) {
            this.f41098m = new ArrayList(3);
        }
        this.f41098m.add(abstractC30874z2);
        if (z) {
            C32861Fi6.m106692t("Hunter", "joined", c47378qI4.m17647d(), C32861Fi6.m106701k(this, "to "));
        }
        C42732iT3.EnumC23267f m1983h = abstractC30874z2.m1983h();
        if (m1983h.ordinal() > this.f41105t.ordinal()) {
            this.f41105t = m1983h;
        }
    }

    /* renamed from: c */
    public boolean m78368c() {
        Future<?> future;
        if (this.f41097l != null) {
            return false;
        }
        List<AbstractC30874z2> list = this.f41098m;
        if ((list != null && !list.isEmpty()) || (future = this.f41100o) == null || !future.cancel(false)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final C42732iT3.EnumC23267f m78367d() {
        boolean z;
        C42732iT3.EnumC23267f enumC23267f = C42732iT3.EnumC23267f.LOW;
        List<AbstractC30874z2> list = this.f41098m;
        boolean z2 = true;
        if (list != null && !list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        AbstractC30874z2 abstractC30874z2 = this.f41097l;
        if (abstractC30874z2 == null && !z) {
            z2 = false;
        }
        if (!z2) {
            return enumC23267f;
        }
        if (abstractC30874z2 != null) {
            enumC23267f = abstractC30874z2.m1983h();
        }
        if (z) {
            int size = this.f41098m.size();
            for (int i = 0; i < size; i++) {
                C42732iT3.EnumC23267f m1983h = this.f41098m.get(i).m1983h();
                if (m1983h.ordinal() > enumC23267f.ordinal()) {
                    enumC23267f = m1983h;
                }
            }
        }
        return enumC23267f;
    }

    /* renamed from: f */
    public void m78365f(AbstractC30874z2 abstractC30874z2) {
        boolean z;
        if (this.f41097l == abstractC30874z2) {
            this.f41097l = null;
            z = true;
        } else {
            List<AbstractC30874z2> list = this.f41098m;
            if (list != null) {
                z = list.remove(abstractC30874z2);
            } else {
                z = false;
            }
        }
        if (z && abstractC30874z2.m1983h() == this.f41105t) {
            this.f41105t = m78367d();
        }
        if (this.f41088c.f87370m) {
            C32861Fi6.m106692t("Hunter", "removed", abstractC30874z2.f120629b.m17647d(), C32861Fi6.m106701k(this, "from "));
        }
    }

    /* renamed from: h */
    public AbstractC30874z2 m78363h() {
        return this.f41097l;
    }

    /* renamed from: i */
    public List<AbstractC30874z2> m78362i() {
        return this.f41098m;
    }

    /* renamed from: j */
    public C47378qI4 m78361j() {
        return this.f41093h;
    }

    /* renamed from: k */
    public Exception m78360k() {
        return this.f41102q;
    }

    /* renamed from: n */
    public String m78357n() {
        return this.f41092g;
    }

    /* renamed from: o */
    public C42732iT3.EnumC23266e m78356o() {
        return this.f41101p;
    }

    /* renamed from: p */
    public int m78355p() {
        return this.f41094i;
    }

    /* renamed from: q */
    public C42732iT3 m78354q() {
        return this.f41088c;
    }

    /* renamed from: r */
    public C42732iT3.EnumC23267f m78353r() {
        return this.f41105t;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    m78345z(this.f41093h);
                    if (this.f41088c.f87370m) {
                        C32861Fi6.m106693s("Hunter", "executing", C32861Fi6.m106702j(this));
                    }
                    Bitmap m78351t = m78351t();
                    this.f41099n = m78351t;
                    if (m78351t == null) {
                        this.f41089d.m88974e(this);
                    } else {
                        this.f41089d.m88975d(this);
                    }
                } catch (K73.C4347b e) {
                    if (!J73.m101118a(e.f19112c) || e.f19111b != 504) {
                        this.f41102q = e;
                    }
                    this.f41089d.m88974e(this);
                } catch (Exception e2) {
                    this.f41102q = e2;
                    this.f41089d.m88974e(this);
                }
            } catch (IOException e3) {
                this.f41102q = e3;
                this.f41089d.m88972g(this);
            } catch (OutOfMemoryError e4) {
                StringWriter stringWriter = new StringWriter();
                this.f41091f.m27311a().m25651a(new PrintWriter(stringWriter));
                this.f41102q = new RuntimeException(stringWriter.toString(), e4);
                this.f41089d.m88974e(this);
            }
        } finally {
            Thread.currentThread().setName("Picasso-Idle");
        }
    }

    /* renamed from: s */
    public Bitmap m78352s() {
        return this.f41099n;
    }

    /* renamed from: t */
    public Bitmap m78351t() throws IOException {
        Bitmap bitmap;
        int i;
        if (TP2.m83671a(this.f41094i)) {
            bitmap = this.f41090e.get(this.f41092g);
            if (bitmap != null) {
                this.f41091f.m27308d();
                this.f41101p = C42732iT3.EnumC23266e.MEMORY;
                if (this.f41088c.f87370m) {
                    C32861Fi6.m106692t("Hunter", "decoded", this.f41093h.m17647d(), "from cache");
                }
                return bitmap;
            }
        } else {
            bitmap = null;
        }
        if (this.f41104s == 0) {
            i = J73.OFFLINE.f16870b;
        } else {
            i = this.f41095j;
        }
        this.f41095j = i;
        PI4.C6313a mo11129f = this.f41096k.mo11129f(this.f41093h, i);
        if (mo11129f != null) {
            this.f41101p = mo11129f.m90489c();
            this.f41103r = mo11129f.m90490b();
            bitmap = mo11129f.m90491a();
            if (bitmap == null) {
                AN5 m90488d = mo11129f.m90488d();
                try {
                    bitmap = m78366e(m90488d, this.f41093h);
                } finally {
                    try {
                        m90488d.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
        if (bitmap != null) {
            if (this.f41088c.f87370m) {
                C32861Fi6.m106693s("Hunter", "decoded", this.f41093h.m17647d());
            }
            this.f41091f.m27310b(bitmap);
            if (this.f41093h.m17645f() || this.f41103r != 0) {
                synchronized (f41083u) {
                    if (this.f41093h.m17646e() || this.f41103r != 0) {
                        bitmap = m78346y(this.f41093h, bitmap, this.f41103r);
                        if (this.f41088c.f87370m) {
                            C32861Fi6.m106693s("Hunter", "transformed", this.f41093h.m17647d());
                        }
                    }
                    if (this.f41093h.m17649b()) {
                        bitmap = m78370a(this.f41093h.f105062g, bitmap);
                        if (this.f41088c.f87370m) {
                            C32861Fi6.m106692t("Hunter", "transformed", this.f41093h.m17647d(), "from custom transformations");
                        }
                    }
                }
                if (bitmap != null) {
                    this.f41091f.m27309c(bitmap);
                }
            }
        }
        return bitmap;
    }

    /* renamed from: u */
    public boolean m78350u() {
        Future<?> future = this.f41100o;
        return future != null && future.isCancelled();
    }

    /* renamed from: w */
    public boolean m78348w(boolean z, NetworkInfo networkInfo) {
        boolean z2;
        int i = this.f41104s;
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        this.f41104s = i - 1;
        return this.f41096k.mo90493h(z, networkInfo);
    }

    /* renamed from: x */
    public boolean m78347x() {
        return this.f41096k.mo90492i();
    }
}
