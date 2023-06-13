package p000;

import android.os.SystemClock;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.mlkit.common.MlKitException;
/* renamed from: z26  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C52563z26 extends LE2<C46615p06, C41304g32> {

    /* renamed from: i */
    public static boolean f120673i = true;

    /* renamed from: d */
    public final KT8 f120675d;

    /* renamed from: e */
    public final C45293mm9 f120676e;

    /* renamed from: f */
    public final C52407ym9 f120677f;

    /* renamed from: g */
    public final InterfaceC51377x26 f120678g;

    /* renamed from: j */
    public static final C48704sY1 f120674j = C48704sY1.m14056b();
    @KeepForSdk

    /* renamed from: h */
    public static final AZ5 f120672h = new AZ5();

    public C52563z26(C45293mm9 c45293mm9, KT8 kt8, InterfaceC51377x26 interfaceC51377x26) {
        super(f120672h);
        this.f120676e = c45293mm9;
        this.f120675d = kt8;
        this.f120677f = C52407ym9.m2591a(C52226yU2.m3451c().m3452b());
        this.f120678g = interfaceC51377x26;
    }

    @Override // p000.AbstractC39174cV2
    /* renamed from: b */
    public final synchronized void mo1910b() throws MlKitException {
        this.f120675d.zzb();
    }

    @Override // p000.AbstractC39174cV2
    /* renamed from: d */
    public final synchronized void mo1909d() {
        f120673i = true;
        this.f120675d.zzc();
    }

    /* renamed from: j */
    public final /* synthetic */ InterfaceC51794xk9 m1907j(long j, V39 v39, C41304g32 c41304g32) {
        V09 v09;
        M39 m39;
        C48178re9 c48178re9 = new C48178re9();
        C38319b29 c38319b29 = new C38319b29();
        c38319b29.m65074c(Long.valueOf(j));
        c38319b29.m65073d(v39);
        c38319b29.m65072e(Boolean.valueOf(f120673i));
        Boolean bool = Boolean.TRUE;
        c38319b29.m65076a(bool);
        c38319b29.m65075b(bool);
        c48178re9.m15620d(c38319b29.m65071f());
        C48704sY1 c48704sY1 = f120674j;
        int m14055c = c48704sY1.m14055c(c41304g32);
        int m14054d = c48704sY1.m14054d(c41304g32);
        L09 l09 = new L09();
        if (m14055c != -1) {
            if (m14055c != 35) {
                if (m14055c != 842094169) {
                    if (m14055c != 16) {
                        if (m14055c != 17) {
                            v09 = V09.UNKNOWN_FORMAT;
                        } else {
                            v09 = V09.NV21;
                        }
                    } else {
                        v09 = V09.NV16;
                    }
                } else {
                    v09 = V09.YV12;
                }
            } else {
                v09 = V09.YUV_420_888;
            }
        } else {
            v09 = V09.BITMAP;
        }
        l09.m97933a(v09);
        l09.m97932b(Integer.valueOf(m14054d));
        c48178re9.m15621c(l09.m97930d());
        Me9 me9 = new Me9();
        me9.m95085a(C37204Xx2.m76025a(this.f120678g.mo5906f()));
        c48178re9.m15619e(me9.m95083c());
        Fe9 m15618f = c48178re9.m15618f();
        C44879m49 c44879m49 = new C44879m49();
        if (this.f120678g.mo5908d()) {
            m39 = M39.TYPE_THICK;
        } else {
            m39 = M39.TYPE_THIN;
        }
        c44879m49.m26380e(m39);
        c44879m49.m26377h(m15618f);
        return Dm9.m109953d(c44879m49);
    }

    /* renamed from: k */
    public final /* synthetic */ InterfaceC51794xk9 m1906k(C46368ob8 c46368ob8, int i, C37706a09 c37706a09) {
        M39 m39;
        C44879m49 c44879m49 = new C44879m49();
        if (this.f120678g.mo5908d()) {
            m39 = M39.TYPE_THICK;
        } else {
            m39 = M39.TYPE_THIN;
        }
        c44879m49.m26380e(m39);
        C51693xa8 c51693xa8 = new C51693xa8();
        c51693xa8.m4982a(Integer.valueOf(i));
        c51693xa8.m4980c(c46368ob8);
        c51693xa8.m4981b(c37706a09);
        c44879m49.m26381d(c51693xa8.m4978e());
        return Dm9.m109953d(c44879m49);
    }

    @Override // p000.LE2
    /* renamed from: l */
    public final synchronized C46615p06 mo1908i(C41304g32 c41304g32) throws MlKitException {
        V39 v39;
        C46615p06 mo14218a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            mo14218a = this.f120675d.mo14218a(c41304g32);
            m1904m(V39.NO_ERROR, elapsedRealtime, c41304g32);
            f120673i = false;
        } catch (MlKitException e) {
            if (e.m46765a() == 14) {
                v39 = V39.MODEL_NOT_DOWNLOADED;
            } else {
                v39 = V39.UNKNOWN_ERROR;
            }
            m1904m(v39, elapsedRealtime, c41304g32);
            throw e;
        }
        return mo14218a;
    }

    /* renamed from: m */
    public final void m1904m(final V39 v39, long j, final C41304g32 c41304g32) {
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.f120676e.m25016f(new InterfaceC41735gm9() { // from class: v99
            @Override // p000.InterfaceC41735gm9
            public final InterfaceC51794xk9 zza() {
                return C52563z26.this.m1907j(elapsedRealtime, v39, c41304g32);
            }
        }, EnumC40135e49.ON_DEVICE_TEXT_DETECT);
        C37237Ya8 c37237Ya8 = new C37237Ya8();
        c37237Ya8.m74886a(v39);
        c37237Ya8.m74885b(Boolean.valueOf(f120673i));
        Me9 me9 = new Me9();
        me9.m95085a(C37204Xx2.m76025a(this.f120678g.mo5906f()));
        c37237Ya8.m74884c(me9.m95083c());
        final C46368ob8 m74883d = c37237Ya8.m74883d();
        final C50538vd9 c50538vd9 = new C50538vd9(this);
        final C45293mm9 c45293mm9 = this.f120676e;
        final EnumC40135e49 enumC40135e49 = EnumC40135e49.AGGREGATED_ON_DEVICE_TEXT_DETECTION;
        ME2.m95477d().execute(new Runnable() { // from class: Ul9
            @Override // java.lang.Runnable
            public final void run() {
                C45293mm9.this.m25014h(enumC40135e49, m74883d, elapsedRealtime, c50538vd9);
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        this.f120677f.m2589c(this.f120678g.mo5904h(), v39.zza(), currentTimeMillis - elapsedRealtime, currentTimeMillis);
    }
}
