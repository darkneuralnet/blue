package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* renamed from: Se9 */
/* loaded from: classes5.dex */
public final class Se9 {

    /* renamed from: k */
    public static AbstractC38851bw7 f34026k;

    /* renamed from: l */
    public static final AbstractC50746vy7 f34027l = AbstractC50746vy7.m7626d("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a */
    public final String f34028a;

    /* renamed from: b */
    public final String f34029b;

    /* renamed from: c */
    public final Le9 f34030c;

    /* renamed from: d */
    public final C37684Zy5 f34031d;

    /* renamed from: e */
    public final Task f34032e;

    /* renamed from: f */
    public final Task f34033f;

    /* renamed from: g */
    public final String f34034g;

    /* renamed from: h */
    public final int f34035h;

    /* renamed from: i */
    public final Map f34036i = new HashMap();

    /* renamed from: j */
    public final Map f34037j = new HashMap();

    public Se9(Context context, final C37684Zy5 c37684Zy5, Le9 le9, final String str) {
        int i;
        this.f34028a = context.getPackageName();
        this.f34029b = C32216Cp0.m111503a(context);
        this.f34031d = c37684Zy5;
        this.f34030c = le9;
        this.f34034g = str;
        this.f34032e = ME2.m95480a().m95479b(new Callable() { // from class: Ee9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str2 = str;
                AbstractC38851bw7 abstractC38851bw7 = Se9.f34026k;
                return LibraryVersion.getInstance().getVersion(str2);
            }
        });
        ME2 m95480a = ME2.m95480a();
        c37684Zy5.getClass();
        this.f34033f = m95480a.m95479b(new Callable() { // from class: xe9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C37684Zy5.this.m72165a();
            }
        });
        AbstractC50746vy7 abstractC50746vy7 = f34027l;
        if (abstractC50746vy7.containsKey(str)) {
            i = DynamiteModule.m51593c(context, (String) abstractC50746vy7.get(str));
        } else {
            i = -1;
        }
        this.f34035h = i;
    }

    /* renamed from: a */
    public static long m85159a(List list, double d) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d / 100.0d) * list.size())) - 1, 0))).longValue();
    }

    /* renamed from: g */
    public static synchronized AbstractC38851bw7 m85153g() {
        synchronized (Se9.class) {
            AbstractC38851bw7 abstractC38851bw7 = f34026k;
            if (abstractC38851bw7 != null) {
                return abstractC38851bw7;
            }
            C50711vv2 m40423a = C41243fx0.m40423a(Resources.getSystem().getConfiguration());
            C36003St7 c36003St7 = new C36003St7();
            for (int i = 0; i < m40423a.m7766h(); i++) {
                c36003St7.m84668d(C32216Cp0.m111502b(m40423a.m7771c(i)));
            }
            AbstractC38851bw7 m84667e = c36003St7.m84667e();
            f34026k = m84667e;
            return m84667e;
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void m85158b(C47595qf9 c47595qf9, EnumC45136mW8 enumC45136mW8, String str) {
        String m72165a;
        c47595qf9.m17258f(enumC45136mW8);
        String m17262b = c47595qf9.m17262b();
        C52023y79 c52023y79 = new C52023y79();
        c52023y79.m4106b(this.f34028a);
        c52023y79.m4105c(this.f34029b);
        c52023y79.m4100h(m85153g());
        c52023y79.m4101g(Boolean.TRUE);
        c52023y79.m4096l(m17262b);
        c52023y79.m4098j(str);
        if (this.f34033f.isSuccessful()) {
            m72165a = (String) this.f34033f.getResult();
        } else {
            m72165a = this.f34031d.m72165a();
        }
        c52023y79.m4099i(m72165a);
        c52023y79.m4104d(10);
        c52023y79.m4097k(Integer.valueOf(this.f34035h));
        c47595qf9.m17257g(c52023y79);
        this.f34030c.mo61068a(c47595qf9);
    }

    /* renamed from: c */
    public final /* synthetic */ void m85157c(EnumC45136mW8 enumC45136mW8, Object obj, long j, C47453qQ7 c47453qQ7) {
        if (!this.f34037j.containsKey(enumC45136mW8)) {
            this.f34037j.put(enumC45136mW8, C47182px9.m18379q());
        }
        InterfaceC38406bB7 interfaceC38406bB7 = (InterfaceC38406bB7) this.f34037j.get(enumC45136mW8);
        interfaceC38406bB7.mo1544i(obj, Long.valueOf(j));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!m85151i(enumC45136mW8, elapsedRealtime, 30L)) {
            return;
        }
        this.f34036i.put(enumC45136mW8, Long.valueOf(elapsedRealtime));
        for (Object obj2 : interfaceC38406bB7.mo1545h()) {
            ArrayList<Long> arrayList = new ArrayList(interfaceC38406bB7.zzc(obj2));
            Collections.sort(arrayList);
            DR8 dr8 = new DR8();
            long j2 = 0;
            for (Long l : arrayList) {
                j2 += l.longValue();
            }
            dr8.m110444a(Long.valueOf(j2 / arrayList.size()));
            dr8.m110442c(Long.valueOf(m85159a(arrayList, 100.0d)));
            dr8.m110439f(Long.valueOf(m85159a(arrayList, 75.0d)));
            dr8.m110441d(Long.valueOf(m85159a(arrayList, 50.0d)));
            dr8.m110443b(Long.valueOf(m85159a(arrayList, 25.0d)));
            dr8.m110440e(Long.valueOf(m85159a(arrayList, 0.0d)));
            ZR8 m110438g = dr8.m110438g();
            int size = arrayList.size();
            C52250yW8 c52250yW8 = new C52250yW8();
            c52250yW8.m3390e(TV8.TYPE_THICK);
            C34942Of8 c34942Of8 = new C34942Of8();
            c34942Of8.m91711a(Integer.valueOf(size));
            c34942Of8.m91709c((C33781Jg8) obj2);
            c34942Of8.m91710b(m110438g);
            c52250yW8.m3391d(c34942Of8.m91707e());
            m85155e(C47595qf9.m17260d(c52250yW8), enumC45136mW8, m85152h());
        }
        this.f34037j.remove(enumC45136mW8);
    }

    /* renamed from: d */
    public final void m85156d(C47595qf9 c47595qf9, EnumC45136mW8 enumC45136mW8) {
        m85155e(c47595qf9, enumC45136mW8, m85152h());
    }

    /* renamed from: e */
    public final void m85155e(final C47595qf9 c47595qf9, final EnumC45136mW8 enumC45136mW8, final String str) {
        ME2.m95477d().execute(new Runnable(c47595qf9, enumC45136mW8, str, null) { // from class: qe9

            /* renamed from: c */
            public final /* synthetic */ EnumC45136mW8 f105574c;

            /* renamed from: d */
            public final /* synthetic */ String f105575d;

            /* renamed from: e */
            public final /* synthetic */ C47595qf9 f105576e;

            @Override // java.lang.Runnable
            public final void run() {
                Se9.this.m85158b(this.f105576e, this.f105574c, this.f105575d);
            }
        });
    }

    /* renamed from: f */
    public final void m85154f(C52267yY7 c52267yY7, EnumC45136mW8 enumC45136mW8) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!m85151i(enumC45136mW8, elapsedRealtime, 30L)) {
            return;
        }
        this.f34036i.put(enumC45136mW8, Long.valueOf(elapsedRealtime));
        m85155e(c52267yY7.m3271a(), enumC45136mW8, m85152h());
    }

    /* renamed from: h */
    public final String m85152h() {
        if (this.f34032e.isSuccessful()) {
            return (String) this.f34032e.getResult();
        }
        return LibraryVersion.getInstance().getVersion(this.f34034g);
    }

    /* renamed from: i */
    public final boolean m85151i(EnumC45136mW8 enumC45136mW8, long j, long j2) {
        if (this.f34036i.get(enumC45136mW8) == null || j - ((Long) this.f34036i.get(enumC45136mW8)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
