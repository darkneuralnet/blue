package p000;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: lB8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC44354lB8 {

    /* renamed from: g */
    public static volatile AbstractC39602dA8 f95698g;

    /* renamed from: a */
    public final C35824Rz8 f95702a;

    /* renamed from: b */
    public final String f95703b;

    /* renamed from: c */
    public final Object f95704c;

    /* renamed from: d */
    public volatile int f95705d = -1;

    /* renamed from: e */
    public volatile Object f95706e;

    /* renamed from: f */
    public static final Object f95697f = new Object();

    /* renamed from: h */
    public static final AtomicReference f95699h = new AtomicReference();

    /* renamed from: i */
    public static final JB8 f95700i = new JB8(C34177Ky8.f20503a);

    /* renamed from: j */
    public static final AtomicInteger f95701j = new AtomicInteger();

    public /* synthetic */ AbstractC44354lB8(C35824Rz8 c35824Rz8, String str, Object obj, boolean z, ZA8 za8) {
        if (c35824Rz8.f32988a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f95702a = c35824Rz8;
        this.f95703b = str;
        this.f95704c = obj;
    }

    /* renamed from: c */
    public static void m27684c() {
        f95701j.incrementAndGet();
    }

    /* renamed from: d */
    public static void m27683d(final Context context) {
        if (f95698g == null && context != null) {
            Object obj = f95697f;
            synchronized (obj) {
                if (f95698g == null) {
                    synchronized (obj) {
                        AbstractC39602dA8 abstractC39602dA8 = f95698g;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (abstractC39602dA8 == null || abstractC39602dA8.mo13401a() != context) {
                            C41824gv8.m37316d();
                            C51468xB8.m5720b();
                            C48366rx8.m14980d();
                            f95698g = new C48929su8(context, RE8.m87007a(new LD8() { // from class: yy8
                                @Override // p000.LD8
                                public final Object zza() {
                                    Context context2 = context;
                                    Object obj2 = AbstractC44354lB8.f95697f;
                                    return C32530Dx8.m109584a(context2);
                                }
                            }));
                            f95701j.incrementAndGet();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public abstract Object mo11116a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040 A[Catch: all -> 0x00c5, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:15:0x0040, B:17:0x0046, B:19:0x0050, B:23:0x0071, B:25:0x0079, B:28:0x0081, B:30:0x0087, B:34:0x0099, B:36:0x009f, B:33:0x0097, B:38:0x00a5, B:40:0x00a9, B:43:0x00b1, B:44:0x00b4, B:45:0x00b8, B:21:0x0065, B:46:0x00bd, B:47:0x00c2, B:48:0x00c3), top: B:55:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd A[Catch: all -> 0x00c5, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:15:0x0040, B:17:0x0046, B:19:0x0050, B:23:0x0071, B:25:0x0079, B:28:0x0081, B:30:0x0087, B:34:0x0099, B:36:0x009f, B:33:0x0097, B:38:0x00a5, B:40:0x00a9, B:43:0x00b1, B:44:0x00b4, B:45:0x00b8, B:21:0x0065, B:46:0x00bd, B:47:0x00c2, B:48:0x00c3), top: B:55:0x000b }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m27685b() {
        String str;
        InterfaceC51320ww8 m5721a;
        Object obj;
        String str2;
        Object zzb;
        int i = f95701j.get();
        if (this.f95705d < i) {
            synchronized (this) {
                if (this.f95705d < i) {
                    AbstractC39602dA8 abstractC39602dA8 = f95698g;
                    QC8 m88749c = QC8.m88749c();
                    Object obj2 = null;
                    if (abstractC39602dA8 != null) {
                        m88749c = (QC8) abstractC39602dA8.mo13400b().zza();
                        if (m88749c.mo24137b()) {
                            C35824Rz8 c35824Rz8 = this.f95702a;
                            str = ((C33448Hv8) m88749c.mo24138a()).m103222a(c35824Rz8.f32988a, null, c35824Rz8.f32990c, this.f95703b);
                            if (abstractC39602dA8 == null) {
                                Uri uri = this.f95702a.f32988a;
                                if (uri != null) {
                                    if (C35338Px8.m89230a(abstractC39602dA8.mo13401a(), uri)) {
                                        m5721a = C41824gv8.m37319a(abstractC39602dA8.mo13401a().getContentResolver(), this.f95702a.f32988a, RunnableC45412my8.f99188b);
                                    } else {
                                        m5721a = null;
                                    }
                                } else {
                                    m5721a = C51468xB8.m5721a(abstractC39602dA8.mo13401a(), null, RunnableC45412my8.f99188b);
                                }
                                if (m5721a != null && (zzb = m5721a.zzb(this.f95703b)) != null) {
                                    obj = mo11116a(zzb);
                                } else {
                                    obj = null;
                                }
                                if (obj == null) {
                                    if (!this.f95702a.f32991d) {
                                        C48366rx8 m14983a = C48366rx8.m14983a(abstractC39602dA8.mo13401a());
                                        if (this.f95702a.f32991d) {
                                            str2 = null;
                                        } else {
                                            str2 = this.f95703b;
                                        }
                                        String zzb2 = m14983a.zzb(str2);
                                        if (zzb2 != null) {
                                            obj2 = mo11116a(zzb2);
                                        }
                                    }
                                    if (obj2 == null) {
                                        obj = this.f95704c;
                                    } else {
                                        obj = obj2;
                                    }
                                }
                                if (m88749c.mo24137b()) {
                                    if (str == null) {
                                        obj = this.f95704c;
                                    } else {
                                        obj = mo11116a(str);
                                    }
                                }
                                this.f95706e = obj;
                                this.f95705d = i;
                            } else {
                                throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                            }
                        }
                    }
                    str = null;
                    if (abstractC39602dA8 == null) {
                    }
                }
            }
        }
        return this.f95706e;
    }
}
