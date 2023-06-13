package p000;

import android.content.Context;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import java.io.File;
/* renamed from: Dl2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C32416Dl2 {

    /* renamed from: a */
    public static boolean f6279a = false;

    /* renamed from: b */
    public static boolean f6280b = false;

    /* renamed from: c */
    public static boolean f6281c = true;

    /* renamed from: d */
    public static boolean f6282d = true;

    /* renamed from: e */
    public static String[] f6283e;

    /* renamed from: f */
    public static long[] f6284f;

    /* renamed from: g */
    public static int f6285g;

    /* renamed from: h */
    public static int f6286h;

    /* renamed from: i */
    public static YD2 f6287i;

    /* renamed from: j */
    public static XD2 f6288j;

    /* renamed from: k */
    public static volatile F73 f6289k;

    /* renamed from: l */
    public static volatile C52017y73 f6290l;

    /* renamed from: Dl2$a */
    /* loaded from: classes2.dex */
    public class C1595a implements XD2 {

        /* renamed from: a */
        public final /* synthetic */ Context f6291a;

        public C1595a(Context context) {
            this.f6291a = context;
        }

        @Override // p000.XD2
        /* renamed from: a */
        public File mo77176a() {
            return new File(this.f6291a.getCacheDir(), "lottie_network_cache");
        }
    }

    private C32416Dl2() {
    }

    /* renamed from: a */
    public static void m109978a(String str) {
        if (!f6280b) {
            return;
        }
        int i = f6285g;
        if (i == 20) {
            f6286h++;
            return;
        }
        f6283e[i] = str;
        f6284f[i] = System.nanoTime();
        C40152e66.m43277a(str);
        f6285g++;
    }

    /* renamed from: b */
    public static float m109977b(String str) {
        int i = f6286h;
        if (i > 0) {
            f6286h = i - 1;
            return 0.0f;
        } else if (!f6280b) {
            return 0.0f;
        } else {
            int i2 = f6285g - 1;
            f6285g = i2;
            if (i2 != -1) {
                if (str.equals(f6283e[i2])) {
                    C40152e66.m43276b();
                    return ((float) (System.nanoTime() - f6284f[f6285g])) / 1000000.0f;
                }
                throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f6283e[f6285g] + InstructionFileId.DOT);
            }
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
    }

    /* renamed from: c */
    public static boolean m109976c() {
        return f6282d;
    }

    /* renamed from: d */
    public static C52017y73 m109975d(Context context) {
        if (!f6281c) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        C52017y73 c52017y73 = f6290l;
        if (c52017y73 == null) {
            synchronized (C52017y73.class) {
                c52017y73 = f6290l;
                if (c52017y73 == null) {
                    XD2 xd2 = f6288j;
                    if (xd2 == null) {
                        xd2 = new C1595a(applicationContext);
                    }
                    c52017y73 = new C52017y73(xd2);
                    f6290l = c52017y73;
                }
            }
        }
        return c52017y73;
    }

    /* renamed from: e */
    public static F73 m109974e(Context context) {
        F73 f73 = f6289k;
        if (f73 == null) {
            synchronized (F73.class) {
                f73 = f6289k;
                if (f73 == null) {
                    C52017y73 m109975d = m109975d(context);
                    YD2 yd2 = f6287i;
                    if (yd2 == null) {
                        yd2 = new YX0();
                    }
                    f73 = new F73(m109975d, yd2);
                    f6289k = f73;
                }
            }
        }
        return f73;
    }
}
