package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* renamed from: t19  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48999t19 {

    /* renamed from: k */
    public static Ed9 f109747k;

    /* renamed from: l */
    public static final AbstractC47062pl9 f109748l = AbstractC47062pl9.m18759c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a */
    public final String f109749a;

    /* renamed from: b */
    public final String f109750b;

    /* renamed from: c */
    public final InterfaceC40688f09 f109751c;

    /* renamed from: d */
    public final C37684Zy5 f109752d;

    /* renamed from: e */
    public final Task f109753e;

    /* renamed from: f */
    public final Task f109754f;

    /* renamed from: g */
    public final String f109755g;

    /* renamed from: h */
    public final int f109756h;

    /* renamed from: i */
    public final Map f109757i = new HashMap();

    /* renamed from: j */
    public final Map f109758j = new HashMap();

    public C48999t19(Context context, final C37684Zy5 c37684Zy5, InterfaceC40688f09 interfaceC40688f09, String str) {
        int i;
        this.f109749a = context.getPackageName();
        this.f109750b = C32216Cp0.m111503a(context);
        this.f109752d = c37684Zy5;
        this.f109751c = interfaceC40688f09;
        Z39.m73790a();
        this.f109755g = str;
        this.f109753e = ME2.m95480a().m95479b(new Callable() { // from class: Q09
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C48999t19.this.m13214a();
            }
        });
        ME2 m95480a = ME2.m95480a();
        c37684Zy5.getClass();
        this.f109754f = m95480a.m95479b(new Callable() { // from class: a19
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C37684Zy5.this.m72165a();
            }
        });
        AbstractC47062pl9 abstractC47062pl9 = f109748l;
        if (abstractC47062pl9.containsKey(str)) {
            i = DynamiteModule.m51593c(context, (String) abstractC47062pl9.get(str));
        } else {
            i = -1;
        }
        this.f109756h = i;
    }

    /* renamed from: d */
    public static synchronized Ed9 m13211d() {
        synchronized (C48999t19.class) {
            Ed9 ed9 = f109747k;
            if (ed9 != null) {
                return ed9;
            }
            C50711vv2 m40423a = C41243fx0.m40423a(Resources.getSystem().getConfiguration());
            C40419eZ8 c40419eZ8 = new C40419eZ8();
            for (int i = 0; i < m40423a.m7766h(); i++) {
                c40419eZ8.m42758c(C32216Cp0.m111502b(m40423a.m7771c(i)));
            }
            Ed9 m42757d = c40419eZ8.m42757d();
            f109747k = m42757d;
            return m42757d;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ String m13214a() throws Exception {
        return LibraryVersion.getInstance().getVersion(this.f109755g);
    }

    /* renamed from: b */
    public final /* synthetic */ void m13213b(VZ8 vz8, GF8 gf8, String str) {
        String m72165a;
        vz8.mo79743c(gf8);
        String zzc = vz8.zzc();
        XS8 xs8 = new XS8();
        xs8.m76995b(this.f109749a);
        xs8.m76994c(this.f109750b);
        xs8.m76989h(m13211d());
        xs8.m76990g(Boolean.TRUE);
        xs8.m76985l(zzc);
        xs8.m76987j(str);
        if (this.f109754f.isSuccessful()) {
            m72165a = (String) this.f109754f.getResult();
        } else {
            m72165a = this.f109752d.m72165a();
        }
        xs8.m76988i(m72165a);
        xs8.m76993d(10);
        xs8.m76986k(Integer.valueOf(this.f109756h));
        vz8.mo79744b(xs8);
        this.f109751c.mo42285a(vz8);
    }

    /* renamed from: c */
    public final void m13212c(C51983y39 c51983y39, final GF8 gf8) {
        JC8 jc8;
        EnumC38434bE8 enumC38434bE8;
        final String version;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f109757i.get(gf8) != null && elapsedRealtime - ((Long) this.f109757i.get(gf8)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
            return;
        }
        this.f109757i.put(gf8, Long.valueOf(elapsedRealtime));
        int i = c51983y39.f118668a;
        int i2 = c51983y39.f118669b;
        int i3 = c51983y39.f118670c;
        int i4 = c51983y39.f118671d;
        int i5 = c51983y39.f118672e;
        long j = c51983y39.f118673f;
        int i6 = c51983y39.f118674g;
        QD8 qd8 = new QD8();
        if (i != -1) {
            if (i != 35) {
                if (i != 842094169) {
                    if (i != 16) {
                        if (i != 17) {
                            jc8 = JC8.UNKNOWN_FORMAT;
                        } else {
                            jc8 = JC8.NV21;
                        }
                    } else {
                        jc8 = JC8.NV16;
                    }
                } else {
                    jc8 = JC8.YV12;
                }
            } else {
                jc8 = JC8.YUV_420_888;
            }
        } else {
            jc8 = JC8.BITMAP;
        }
        qd8.m88726d(jc8);
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        enumC38434bE8 = EnumC38434bE8.ANDROID_MEDIA_IMAGE;
                    } else {
                        enumC38434bE8 = EnumC38434bE8.FILEPATH;
                    }
                } else {
                    enumC38434bE8 = EnumC38434bE8.BYTEBUFFER;
                }
            } else {
                enumC38434bE8 = EnumC38434bE8.BYTEARRAY;
            }
        } else {
            enumC38434bE8 = EnumC38434bE8.BITMAP;
        }
        qd8.m88724f(enumC38434bE8);
        qd8.m88727c(Integer.valueOf(i3));
        qd8.m88725e(Integer.valueOf(i4));
        qd8.m88723g(Integer.valueOf(i5));
        qd8.m88728b(Long.valueOf(j));
        qd8.m88722h(Integer.valueOf(i6));
        C52681zE8 m88720j = qd8.m88720j();
        SF8 sf8 = new SF8();
        sf8.m85794d(m88720j);
        final VZ8 m112967d = C19.m112967d(sf8);
        if (this.f109753e.isSuccessful()) {
            version = (String) this.f109753e.getResult();
        } else {
            version = LibraryVersion.getInstance().getVersion(this.f109755g);
        }
        ME2.m95477d().execute(new Runnable() { // from class: j19
            @Override // java.lang.Runnable
            public final void run() {
                C48999t19.this.m13213b(m112967d, gf8, version);
            }
        });
    }
}
