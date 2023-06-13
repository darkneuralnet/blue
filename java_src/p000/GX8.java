package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzmh;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* renamed from: GX8 */
/* loaded from: classes5.dex */
public final class GX8 {

    /* renamed from: k */
    public static AbstractC40292eL7 f12041k;

    /* renamed from: l */
    public static final IL7 f12042l = IL7.m102467c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a */
    public final String f12043a;

    /* renamed from: b */
    public final String f12044b;

    /* renamed from: c */
    public final InterfaceC51073wX8 f12045c;

    /* renamed from: d */
    public final C37684Zy5 f12046d;

    /* renamed from: e */
    public final Task f12047e;

    /* renamed from: f */
    public final Task f12048f;

    /* renamed from: g */
    public final String f12049g;

    /* renamed from: h */
    public final int f12050h;

    /* renamed from: i */
    public final Map f12051i = new HashMap();

    /* renamed from: j */
    public final Map f12052j = new HashMap();

    public GX8(Context context, final C37684Zy5 c37684Zy5, InterfaceC51073wX8 interfaceC51073wX8, String str) {
        int i;
        this.f12043a = context.getPackageName();
        this.f12044b = C32216Cp0.m111503a(context);
        this.f12046d = c37684Zy5;
        this.f12045c = interfaceC51073wX8;
        XZ8.m76851a();
        this.f12049g = str;
        this.f12047e = ME2.m95480a().m95479b(new Callable() { // from class: mX8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return GX8.this.m105025a();
            }
        });
        this.f12048f = ME2.m95480a().m95479b(new Callable() { // from class: cX8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C37684Zy5.this.m72165a();
            }
        });
        IL7 il7 = f12042l;
        if (il7.containsKey(str)) {
            i = DynamiteModule.m51593c(context, (String) il7.get(str));
        } else {
            i = -1;
        }
        this.f12050h = i;
    }

    /* renamed from: d */
    public static synchronized AbstractC40292eL7 m105022d() {
        synchronized (GX8.class) {
            AbstractC40292eL7 abstractC40292eL7 = f12041k;
            if (abstractC40292eL7 != null) {
                return abstractC40292eL7;
            }
            C50711vv2 m40423a = C41243fx0.m40423a(Resources.getSystem().getConfiguration());
            CJ7 cj7 = new CJ7();
            for (int i = 0; i < m40423a.m7766h(); i++) {
                cj7.m112344c(C32216Cp0.m111502b(m40423a.m7771c(i)));
            }
            AbstractC40292eL7 m112343d = cj7.m112343d();
            f12041k = m112343d;
            return m112343d;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ String m105025a() throws Exception {
        return LibraryVersion.getInstance().getVersion(this.f12049g);
    }

    /* renamed from: b */
    public final /* synthetic */ void m105024b(C43968kY8 c43968kY8, IH8 ih8, String str) {
        String m72165a;
        c43968kY8.m28839e(ih8);
        String m28842b = c43968kY8.m28842b();
        NQ8 nq8 = new NQ8();
        nq8.m93916b(this.f12043a);
        nq8.m93915c(this.f12044b);
        nq8.m93910h(m105022d());
        nq8.m93911g(Boolean.TRUE);
        nq8.m93906l(m28842b);
        nq8.m93908j(str);
        if (this.f12048f.isSuccessful()) {
            m72165a = (String) this.f12048f.getResult();
        } else {
            m72165a = this.f12046d.m72165a();
        }
        nq8.m93909i(m72165a);
        nq8.m93914d(10);
        nq8.m93907k(Integer.valueOf(this.f12050h));
        c43968kY8.m28838f(nq8);
        this.f12045c.mo6683a(c43968kY8);
    }

    /* renamed from: c */
    public final void m105023c(C37948aQ7 c37948aQ7, final IH8 ih8) {
        String version;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f12051i.get(ih8) != null && elapsedRealtime - ((Long) this.f12051i.get(ih8)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
            return;
        }
        this.f12051i.put(ih8, Long.valueOf(elapsedRealtime));
        zzmh zzmhVar = c37948aQ7.f50449a;
        EnumC51522xH8 enumC51522xH8 = c37948aQ7.f50450b;
        int i = c37948aQ7.f50451c;
        UH8 uh8 = new UH8();
        uh8.m81672d(EG8.TYPE_THICK);
        AC8 ac8 = new AC8();
        C42593iD8 c42593iD8 = new C42593iD8();
        if (zzmhVar.m51298u() == 2) {
            c42593iD8.m34329a(EnumC49708uD8.ALL_CLASSIFICATIONS);
        } else {
            c42593iD8.m34329a(EnumC49708uD8.NO_CLASSIFICATIONS);
        }
        if (zzmhVar.zzd() == 2) {
            c42593iD8.m34326d(SD8.ALL_LANDMARKS);
        } else {
            c42593iD8.m34326d(SD8.NO_LANDMARKS);
        }
        if (zzmhVar.zzc() == 2) {
            c42593iD8.m34328b(GD8.ALL_CONTOURS);
        } else {
            c42593iD8.m34328b(GD8.NO_CONTOURS);
        }
        if (zzmhVar.m51297v() == 2) {
            c42593iD8.m34324f(EnumC39638dE8.ACCURATE);
        } else {
            c42593iD8.m34324f(EnumC39638dE8.FAST);
        }
        c42593iD8.m34325e(Float.valueOf(zzmhVar.m51299s()));
        c42593iD8.m34327c(Boolean.valueOf(zzmhVar.m51296x()));
        ac8.m116005b(c42593iD8.m34319k());
        ac8.m116006a(enumC51522xH8);
        uh8.m81670f(ac8.m116004c());
        final C43968kY8 m28840d = C43968kY8.m28840d(uh8, i);
        if (this.f12047e.isSuccessful()) {
            version = (String) this.f12047e.getResult();
        } else {
            version = LibraryVersion.getInstance().getVersion(this.f12049g);
        }
        final String str = version;
        ME2.m95477d().execute(new Runnable(m28840d, ih8, str, null) { // from class: SW8

            /* renamed from: c */
            public final /* synthetic */ IH8 f33840c;

            /* renamed from: d */
            public final /* synthetic */ String f33841d;

            /* renamed from: e */
            public final /* synthetic */ C43968kY8 f33842e;

            @Override // java.lang.Runnable
            public final void run() {
                GX8.this.m105024b(this.f33842e, this.f33840c, this.f33841d);
            }
        });
    }
}
