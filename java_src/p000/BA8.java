package p000;

import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.MlKitException;
import java.util.Iterator;
import java.util.List;
/* renamed from: BA8 */
/* loaded from: classes6.dex */
public final class BA8 extends LE2 {

    /* renamed from: j */
    public static final C48704sY1 f1948j = C48704sY1.m14056b();

    /* renamed from: k */
    public static boolean f1949k = true;

    /* renamed from: d */
    public final C9555Xx f1950d;

    /* renamed from: e */
    public final InterfaceC41443gH8 f1951e;

    /* renamed from: f */
    public final C40559en9 f1952f;

    /* renamed from: g */
    public final C47675qn9 f1953g;

    /* renamed from: h */
    public final C12397bU f1954h = new C12397bU();

    /* renamed from: i */
    public boolean f1955i;

    public BA8(C52226yU2 c52226yU2, C9555Xx c9555Xx, InterfaceC41443gH8 interfaceC41443gH8, C40559en9 c40559en9) {
        Preconditions.checkNotNull(c52226yU2, "MlKitContext can not be null");
        Preconditions.checkNotNull(c9555Xx, "BarcodeScannerOptions can not be null");
        this.f1950d = c9555Xx;
        this.f1951e = interfaceC41443gH8;
        this.f1952f = c40559en9;
        this.f1953g = C47675qn9.m16972a(c52226yU2.m3452b());
    }

    @Override // p000.AbstractC39174cV2
    /* renamed from: b */
    public final synchronized void mo1910b() throws MlKitException {
        this.f1955i = this.f1951e.zzc();
    }

    @Override // p000.AbstractC39174cV2
    /* renamed from: d */
    public final synchronized void mo1909d() {
        EnumC52003y59 enumC52003y59;
        this.f1951e.zzb();
        f1949k = true;
        C40559en9 c40559en9 = this.f1952f;
        W59 w59 = new W59();
        if (this.f1955i) {
            enumC52003y59 = EnumC52003y59.TYPE_THICK;
        } else {
            enumC52003y59 = EnumC52003y59.TYPE_THIN;
        }
        w59.m78840e(enumC52003y59);
        K79 k79 = new K79();
        k79.m99180i(CC7.m112616c(this.f1950d));
        w59.m78838g(k79.m99179j());
        c40559en9.m42550d(C51231wn9.m6314d(w59), O59.ON_DEVICE_BARCODE_CLOSE);
    }

    /* renamed from: j */
    public final /* synthetic */ Rl9 m114304j(long j, G59 g59, JQ7 jq7, JQ7 jq72, C41304g32 c41304g32) {
        EnumC46638p29 enumC46638p29;
        EnumC52003y59 enumC52003y59;
        K79 k79 = new K79();
        G39 g39 = new G39();
        g39.m105871c(Long.valueOf(j));
        g39.m105870d(g59);
        g39.m105869e(Boolean.valueOf(f1949k));
        Boolean bool = Boolean.TRUE;
        g39.m105873a(bool);
        g39.m105872b(bool);
        k79.m99181h(g39.m105868f());
        k79.m99180i(CC7.m112616c(this.f1950d));
        k79.m99184e(jq7.m100494g());
        k79.m99183f(jq72.m100494g());
        int m40242g = c41304g32.m40242g();
        int m14054d = f1948j.m14054d(c41304g32);
        C40708f29 c40708f29 = new C40708f29();
        if (m40242g != -1) {
            if (m40242g != 35) {
                if (m40242g != 842094169) {
                    if (m40242g != 16) {
                        if (m40242g != 17) {
                            enumC46638p29 = EnumC46638p29.UNKNOWN_FORMAT;
                        } else {
                            enumC46638p29 = EnumC46638p29.NV21;
                        }
                    } else {
                        enumC46638p29 = EnumC46638p29.NV16;
                    }
                } else {
                    enumC46638p29 = EnumC46638p29.YV12;
                }
            } else {
                enumC46638p29 = EnumC46638p29.YUV_420_888;
            }
        } else {
            enumC46638p29 = EnumC46638p29.BITMAP;
        }
        c40708f29.m42242a(enumC46638p29);
        c40708f29.m42241b(Integer.valueOf(m14054d));
        k79.m99182g(c40708f29.m42239d());
        W59 w59 = new W59();
        if (this.f1955i) {
            enumC52003y59 = EnumC52003y59.TYPE_THICK;
        } else {
            enumC52003y59 = EnumC52003y59.TYPE_THIN;
        }
        w59.m78840e(enumC52003y59);
        w59.m78838g(k79.m99179j());
        return C51231wn9.m6314d(w59);
    }

    /* renamed from: k */
    public final /* synthetic */ Rl9 m114303k(P58 p58, int i, C48406s19 c48406s19) {
        EnumC52003y59 enumC52003y59;
        W59 w59 = new W59();
        if (this.f1955i) {
            enumC52003y59 = EnumC52003y59.TYPE_THICK;
        } else {
            enumC52003y59 = EnumC52003y59.TYPE_THIN;
        }
        w59.m78840e(enumC52003y59);
        V48 v48 = new V48();
        v48.m80441a(Integer.valueOf(i));
        v48.m80439c(p58);
        v48.m80440b(c48406s19);
        w59.m78841d(v48.m80437e());
        return C51231wn9.m6314d(w59);
    }

    @Override // p000.LE2
    /* renamed from: l */
    public final synchronized List mo1908i(C41304g32 c41304g32) throws MlKitException {
        G59 g59;
        List mo39690a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f1954h.m64510a(c41304g32);
        try {
            mo39690a = this.f1951e.mo39690a(c41304g32);
            m114301m(G59.NO_ERROR, elapsedRealtime, c41304g32, mo39690a);
            f1949k = false;
        } catch (MlKitException e) {
            if (e.m46765a() == 14) {
                g59 = G59.MODEL_NOT_DOWNLOADED;
            } else {
                g59 = G59.UNKNOWN_ERROR;
            }
            m114301m(g59, elapsedRealtime, c41304g32, null);
            throw e;
        }
        return mo39690a;
    }

    /* renamed from: m */
    public final void m114301m(final G59 g59, long j, final C41304g32 c41304g32, List list) {
        int i;
        final JQ7 jq7 = new JQ7();
        final JQ7 jq72 = new JQ7();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C0774Bx c0774Bx = (C0774Bx) it.next();
                jq7.m100496e(CC7.m112618a(c0774Bx.m113297d()));
                jq72.m100496e(CC7.m112617b(c0774Bx.m113295f()));
            }
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.f1952f.m42548f(new Ym9() { // from class: zm8
            @Override // p000.Ym9
            public final Rl9 zza() {
                return BA8.this.m114304j(elapsedRealtime, g59, jq7, jq72, c41304g32);
            }
        }, O59.ON_DEVICE_BARCODE_DETECT);
        C43109j58 c43109j58 = new C43109j58();
        c43109j58.m31132e(g59);
        c43109j58.m31131f(Boolean.valueOf(f1949k));
        c43109j58.m31130g(CC7.m112616c(this.f1950d));
        c43109j58.m31134c(jq7.m100494g());
        c43109j58.m31133d(jq72.m100494g());
        final P58 m31129h = c43109j58.m31129h();
        final C53069zt8 c53069zt8 = new C53069zt8(this);
        final C40559en9 c40559en9 = this.f1952f;
        final O59 o59 = O59.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
        ME2.m95477d().execute(new Runnable() { // from class: Mm9
            @Override // java.lang.Runnable
            public final void run() {
                C40559en9.this.m42546h(o59, m31129h, elapsedRealtime, c53069zt8);
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = this.f1955i;
        long j2 = currentTimeMillis - elapsedRealtime;
        C47675qn9 c47675qn9 = this.f1953g;
        if (true != z) {
            i = 24301;
        } else {
            i = 24302;
        }
        c47675qn9.m16970c(i, g59.zza(), j2, currentTimeMillis);
    }
}
