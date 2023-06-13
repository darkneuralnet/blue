package p000;

import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: At8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31792At8 extends LE2 {

    /* renamed from: j */
    public static final AtomicBoolean f1314j = new AtomicBoolean(true);

    /* renamed from: k */
    public static final C48704sY1 f1315k = C48704sY1.m14056b();

    /* renamed from: d */
    public final C42290hj1 f1316d;

    /* renamed from: e */
    public final C51993y49 f1317e;

    /* renamed from: f */
    public final C47854r59 f1318f;

    /* renamed from: g */
    public final GC7 f1319g;

    /* renamed from: h */
    public boolean f1320h;

    /* renamed from: i */
    public final C12397bU f1321i = new C12397bU();

    public C31792At8(C51993y49 c51993y49, C42290hj1 c42290hj1, GC7 gc7) {
        Preconditions.checkNotNull(c42290hj1, "FaceDetectorOptions can not be null");
        this.f1316d = c42290hj1;
        this.f1317e = c51993y49;
        this.f1319g = gc7;
        this.f1318f = C47854r59.m16493a(C52226yU2.m3451c().m3452b());
    }

    /* renamed from: k */
    public static void m114980k(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C39919dj1) it.next()).m43847f(-1);
        }
    }

    @Override // p000.AbstractC39174cV2
    /* renamed from: b */
    public final synchronized void mo1910b() throws MlKitException {
        this.f1320h = this.f1319g.zzd();
    }

    @Override // p000.AbstractC39174cV2
    /* renamed from: d */
    public final synchronized void mo1909d() {
        this.f1319g.zzb();
        f1314j.set(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
        r2 = (java.util.List) com.google.android.gms.common.internal.Preconditions.checkNotNull(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010a A[Catch: MlKitException -> 0x0129, all -> 0x0148, TryCatch #1 {, blocks: (B:4:0x0005, B:5:0x000e, B:9:0x0021, B:10:0x002a, B:12:0x002d, B:40:0x0104, B:47:0x0118, B:46:0x0113, B:43:0x010a, B:15:0x003a, B:16:0x0041, B:17:0x004a, B:19:0x0050, B:20:0x005b, B:22:0x0061, B:24:0x006d, B:26:0x0073, B:28:0x0081, B:30:0x00ab, B:32:0x00cf, B:34:0x00de, B:54:0x012e, B:56:0x0136, B:58:0x013b, B:59:0x0147, B:57:0x0139, B:37:0x00f1, B:39:0x00fc), top: B:64:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0113 A[Catch: MlKitException -> 0x0129, all -> 0x0148, TryCatch #1 {, blocks: (B:4:0x0005, B:5:0x000e, B:9:0x0021, B:10:0x002a, B:12:0x002d, B:40:0x0104, B:47:0x0118, B:46:0x0113, B:43:0x010a, B:15:0x003a, B:16:0x0041, B:17:0x004a, B:19:0x0050, B:20:0x005b, B:22:0x0061, B:24:0x006d, B:26:0x0073, B:28:0x0081, B:30:0x00ab, B:32:0x00cf, B:34:0x00de, B:54:0x012e, B:56:0x0136, B:58:0x013b, B:59:0x0147, B:57:0x0139, B:37:0x00f1, B:39:0x00fc), top: B:64:0x0005 }] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    @Override // p000.LE2
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized List mo1908i(C41304g32 c41304g32) throws MlKitException {
        long j;
        ZN8 zn8;
        ArrayList arrayList;
        Iterator it;
        Iterator it2;
        int size;
        int size2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f1321i.m64510a(c41304g32);
        try {
            Pair mo1092a = this.f1319g.mo1092a(c41304g32);
            List list = (List) mo1092a.first;
            List list2 = (List) mo1092a.second;
            if (list == null && list2 == null) {
                throw new MlKitException("No detector is enabled", 13);
            }
            if (list2 == null) {
                ArrayList arrayList2 = (List) Preconditions.checkNotNull(list);
                arrayList = arrayList2;
                j = elapsedRealtime;
                ZN8 zn82 = ZN8.NO_ERROR;
                if (list2 != null) {
                    size = 0;
                } else {
                    size = list2.size();
                }
                if (list != null) {
                    size2 = 0;
                } else {
                    size2 = list.size();
                }
                m114977n(zn82, j, c41304g32, size, size2);
                f1314j.set(false);
            } else {
                HashSet hashSet = new HashSet();
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    C39919dj1 c39919dj1 = (C39919dj1) it3.next();
                    Iterator it4 = list.iterator();
                    boolean z = false;
                    while (it4.hasNext()) {
                        C39919dj1 c39919dj12 = (C39919dj1) it4.next();
                        if (c39919dj1.m43852a() != null && c39919dj12.m43852a() != null) {
                            Rect m43852a = c39919dj1.m43852a();
                            Rect m43852a2 = c39919dj12.m43852a();
                            if (m43852a.intersect(m43852a2)) {
                                it = it3;
                                it2 = it4;
                                j = elapsedRealtime;
                                double min = (Math.min(m43852a.right, m43852a2.right) - Math.max(m43852a.left, m43852a2.left)) * (Math.min(m43852a.bottom, m43852a2.bottom) - Math.max(m43852a.top, m43852a2.top));
                                try {
                                    if (min / ((((m43852a.right - m43852a.left) * (m43852a.bottom - m43852a.top)) + ((m43852a2.right - m43852a2.left) * (m43852a2.bottom - m43852a2.top))) - min) > 0.6d) {
                                        c39919dj12.m43848e(c39919dj1.m43849d());
                                        z = true;
                                    }
                                    hashSet.add(c39919dj12);
                                    it3 = it;
                                    it4 = it2;
                                    elapsedRealtime = j;
                                } catch (MlKitException e) {
                                    e = e;
                                    if (e.m46765a() == 14) {
                                        zn8 = ZN8.MODEL_NOT_DOWNLOADED;
                                    } else {
                                        zn8 = ZN8.UNKNOWN_ERROR;
                                    }
                                    m114977n(zn8, j, c41304g32, 0, 0);
                                    throw e;
                                }
                            }
                        }
                        it = it3;
                        it2 = it4;
                        j = elapsedRealtime;
                        hashSet.add(c39919dj12);
                        it3 = it;
                        it4 = it2;
                        elapsedRealtime = j;
                    }
                    Iterator it5 = it3;
                    long j2 = elapsedRealtime;
                    if (!z) {
                        hashSet.add(c39919dj1);
                    }
                    it3 = it5;
                    elapsedRealtime = j2;
                }
                j = elapsedRealtime;
                arrayList = new ArrayList(hashSet);
                ZN8 zn822 = ZN8.NO_ERROR;
                if (list2 != null) {
                }
                if (list != null) {
                }
                m114977n(zn822, j, c41304g32, size, size2);
                f1314j.set(false);
            }
        } catch (MlKitException e2) {
            e = e2;
            j = elapsedRealtime;
        }
        return arrayList;
    }

    /* renamed from: l */
    public final /* synthetic */ C52596z59 m114979l(long j, ZN8 zn8, int i, int i2, C41304g32 c41304g32) {
        EnumC49178tK8 enumC49178tK8;
        EnumC41497gN8 enumC41497gN8;
        WQ8 wq8 = new WQ8();
        C46816pL8 c46816pL8 = new C46816pL8();
        c46816pL8.m19436c(Long.valueOf(j));
        c46816pL8.m19435d(zn8);
        c46816pL8.m19434e(Boolean.valueOf(f1314j.get()));
        Boolean bool = Boolean.TRUE;
        c46816pL8.m19438a(bool);
        c46816pL8.m19437b(bool);
        wq8.m78468g(c46816pL8.m19433f());
        wq8.m78470e(C42036hH8.m36560a(this.f1316d));
        wq8.m78471d(Integer.valueOf(i));
        wq8.m78467h(Integer.valueOf(i2));
        C48704sY1 c48704sY1 = f1315k;
        int m14055c = c48704sY1.m14055c(c41304g32);
        int m14054d = c48704sY1.m14054d(c41304g32);
        C42656iK8 c42656iK8 = new C42656iK8();
        if (m14055c != -1) {
            if (m14055c != 35) {
                if (m14055c != 842094169) {
                    if (m14055c != 16) {
                        if (m14055c != 17) {
                            enumC49178tK8 = EnumC49178tK8.UNKNOWN_FORMAT;
                        } else {
                            enumC49178tK8 = EnumC49178tK8.NV21;
                        }
                    } else {
                        enumC49178tK8 = EnumC49178tK8.NV16;
                    }
                } else {
                    enumC49178tK8 = EnumC49178tK8.YV12;
                }
            } else {
                enumC49178tK8 = EnumC49178tK8.YUV_420_888;
            }
        } else {
            enumC49178tK8 = EnumC49178tK8.BITMAP;
        }
        c42656iK8.m34141a(enumC49178tK8);
        c42656iK8.m34140b(Integer.valueOf(m14054d));
        wq8.m78469f(c42656iK8.m34138d());
        C47463qR8 m78466i = wq8.m78466i();
        C51585xO8 c51585xO8 = new C51585xO8();
        if (this.f1320h) {
            enumC41497gN8 = EnumC41497gN8.TYPE_THICK;
        } else {
            enumC41497gN8 = EnumC41497gN8.TYPE_THIN;
        }
        c51585xO8.m5304e(enumC41497gN8);
        c51585xO8.m5302g(m78466i);
        return C52596z59.m1827d(c51585xO8);
    }

    /* renamed from: m */
    public final /* synthetic */ C52596z59 m114978m(U18 u18, int i, C40859fI8 c40859fI8) {
        EnumC41497gN8 enumC41497gN8;
        C51585xO8 c51585xO8 = new C51585xO8();
        if (this.f1320h) {
            enumC41497gN8 = EnumC41497gN8.TYPE_THICK;
        } else {
            enumC41497gN8 = EnumC41497gN8.TYPE_THIN;
        }
        c51585xO8.m5304e(enumC41497gN8);
        C40104e18 c40104e18 = new C40104e18();
        c40104e18.m43399a(Integer.valueOf(i));
        c40104e18.m43397c(u18);
        c40104e18.m43398b(c40859fI8);
        c51585xO8.m5305d(c40104e18.m43395e());
        return C52596z59.m1827d(c51585xO8);
    }

    /* renamed from: n */
    public final synchronized void m114977n(final ZN8 zn8, long j, final C41304g32 c41304g32, final int i, final int i2) {
        int i3;
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.f1317e.m4172c(new InterfaceC42507i49() { // from class: Bm8
            @Override // p000.InterfaceC42507i49
            public final C52596z59 zza() {
                return C31792At8.this.m114979l(elapsedRealtime, zn8, i, i2, c41304g32);
            }
        }, EnumC44471lO8.ON_DEVICE_FACE_DETECT);
        C48998t18 c48998t18 = new C48998t18();
        c48998t18.m13223c(zn8);
        c48998t18.m13222d(Boolean.valueOf(f1314j.get()));
        c48998t18.m13225a(Integer.valueOf(i));
        c48998t18.m13221e(Integer.valueOf(i2));
        c48998t18.m13224b(C42036hH8.m36560a(this.f1316d));
        final U18 m13220f = c48998t18.m13220f();
        final C34933Oe8 c34933Oe8 = new C34933Oe8(this);
        final C51993y49 c51993y49 = this.f1317e;
        final EnumC44471lO8 enumC44471lO8 = EnumC44471lO8.AGGREGATED_ON_DEVICE_FACE_DETECTION;
        ME2.m95477d().execute(new Runnable(enumC44471lO8, m13220f, elapsedRealtime, c34933Oe8, null) { // from class: z39

            /* renamed from: c */
            public final /* synthetic */ EnumC44471lO8 f120713c;

            /* renamed from: d */
            public final /* synthetic */ Object f120714d;

            /* renamed from: e */
            public final /* synthetic */ long f120715e;

            /* renamed from: f */
            public final /* synthetic */ C34933Oe8 f120716f;

            @Override // java.lang.Runnable
            public final void run() {
                C51993y49.this.m4169f(this.f120713c, this.f120714d, this.f120715e, this.f120716f);
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = this.f1320h;
        long j2 = currentTimeMillis - elapsedRealtime;
        C47854r59 c47854r59 = this.f1318f;
        if (true != z) {
            i3 = 24303;
        } else {
            i3 = 24304;
        }
        c47854r59.m16491c(i3, zn8.zza(), j2, currentTimeMillis);
    }
}
