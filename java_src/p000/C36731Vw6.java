package p000;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.LongCompanionObject;
@ShowFirstParty
@KeepForSdk
/* renamed from: Vw6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36731Vw6 {

    /* renamed from: r */
    public static final long f40079r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s */
    public static volatile ScheduledExecutorService f40080s = null;

    /* renamed from: t */
    public static final Object f40081t = new Object();

    /* renamed from: u */
    public static volatile InterfaceC40409eY7 f40082u = new C43769kC7();

    /* renamed from: a */
    public final Object f40083a;

    /* renamed from: b */
    public final PowerManager.WakeLock f40084b;

    /* renamed from: c */
    public int f40085c;

    /* renamed from: d */
    public Future<?> f40086d;

    /* renamed from: e */
    public long f40087e;

    /* renamed from: f */
    public final Set<C47863r68> f40088f;

    /* renamed from: g */
    public boolean f40089g;

    /* renamed from: h */
    public int f40090h;

    /* renamed from: i */
    public ZB7 f40091i;

    /* renamed from: j */
    public Clock f40092j;

    /* renamed from: k */
    public WorkSource f40093k;

    /* renamed from: l */
    public final String f40094l;

    /* renamed from: m */
    public final String f40095m;

    /* renamed from: n */
    public final Context f40096n;

    /* renamed from: o */
    public final Map<String, XP7> f40097o;

    /* renamed from: p */
    public AtomicInteger f40098p;

    /* renamed from: q */
    public final ScheduledExecutorService f40099q;

    @KeepForSdk
    public C36731Vw6(Context context, int i, String str) {
        String str2;
        String packageName = context.getPackageName();
        this.f40083a = new Object();
        this.f40085c = 0;
        this.f40088f = new HashSet();
        this.f40089g = true;
        this.f40092j = DefaultClock.getInstance();
        this.f40097o = new HashMap();
        this.f40098p = new AtomicInteger(0);
        Preconditions.checkNotNull(context, "WakeLock: context must not be null");
        Preconditions.checkNotEmpty(str, "WakeLock: wakeLockName must not be empty");
        this.f40096n = context.getApplicationContext();
        this.f40095m = str;
        this.f40091i = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "*gcore*:".concat(valueOf);
            } else {
                str2 = new String("*gcore*:");
            }
            this.f40094l = str2;
        } else {
            this.f40094l = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i, str);
            this.f40084b = newWakeLock;
            if (WorkSourceUtil.hasWorkSourcePermission(context)) {
                WorkSource fromPackage = WorkSourceUtil.fromPackage(context, Strings.isEmptyOrWhitespace(packageName) ? context.getPackageName() : packageName);
                this.f40093k = fromPackage;
                if (fromPackage != null) {
                    m79091i(newWakeLock, fromPackage);
                }
            }
            ScheduledExecutorService scheduledExecutorService = f40080s;
            if (scheduledExecutorService == null) {
                synchronized (f40081t) {
                    scheduledExecutorService = f40080s;
                    if (scheduledExecutorService == null) {
                        C43583jt8.m29775a();
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f40080s = scheduledExecutorService;
                    }
                }
            }
            this.f40099q = scheduledExecutorService;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new zzi(sb.toString());
    }

    /* renamed from: e */
    public static /* synthetic */ void m79095e(C36731Vw6 c36731Vw6) {
        synchronized (c36731Vw6.f40083a) {
            if (!c36731Vw6.m79098b()) {
                return;
            }
            Log.e("WakeLock", String.valueOf(c36731Vw6.f40094l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
            c36731Vw6.m79093g();
            if (!c36731Vw6.m79098b()) {
                return;
            }
            c36731Vw6.f40085c = 1;
            c36731Vw6.m79092h(0);
        }
    }

    /* renamed from: i */
    public static void m79091i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    @KeepForSdk
    /* renamed from: a */
    public void m79099a(long j) {
        this.f40098p.incrementAndGet();
        long j2 = f40079r;
        long j3 = LongCompanionObject.MAX_VALUE;
        long max = Math.max(Math.min((long) LongCompanionObject.MAX_VALUE, j2), 1L);
        if (j > 0) {
            max = Math.min(j, max);
        }
        synchronized (this.f40083a) {
            if (!m79098b()) {
                this.f40091i = ZB7.m73634a(false, null);
                this.f40084b.acquire();
                this.f40092j.elapsedRealtime();
            }
            this.f40085c++;
            this.f40090h++;
            m79094f(null);
            XP7 xp7 = this.f40097o.get(null);
            if (xp7 == null) {
                xp7 = new XP7(null);
                this.f40097o.put(null, xp7);
            }
            xp7.f43148a++;
            long elapsedRealtime = this.f40092j.elapsedRealtime();
            if (LongCompanionObject.MAX_VALUE - elapsedRealtime > max) {
                j3 = elapsedRealtime + max;
            }
            if (j3 > this.f40087e) {
                this.f40087e = j3;
                Future<?> future = this.f40086d;
                if (future != null) {
                    future.cancel(false);
                }
                this.f40086d = this.f40099q.schedule(new Runnable() { // from class: Me7
                    @Override // java.lang.Runnable
                    public final void run() {
                        C36731Vw6.m79095e(C36731Vw6.this);
                    }
                }, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public boolean m79098b() {
        boolean z;
        synchronized (this.f40083a) {
            if (this.f40085c > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @KeepForSdk
    /* renamed from: c */
    public void m79097c() {
        if (this.f40098p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f40094l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f40083a) {
            m79094f(null);
            if (this.f40097o.containsKey(null)) {
                XP7 xp7 = this.f40097o.get(null);
                if (xp7 != null) {
                    int i = xp7.f43148a - 1;
                    xp7.f43148a = i;
                    if (i == 0) {
                        this.f40097o.remove(null);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.f40094l).concat(" counter does not exist"));
            }
            m79092h(0);
        }
    }

    @KeepForSdk
    /* renamed from: d */
    public void m79096d(boolean z) {
        synchronized (this.f40083a) {
            this.f40089g = z;
        }
    }

    /* renamed from: f */
    public final String m79094f(String str) {
        if (this.f40089g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    /* renamed from: g */
    public final void m79093g() {
        if (this.f40088f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f40088f);
        this.f40088f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        C47863r68 c47863r68 = (C47863r68) arrayList.get(0);
        throw null;
    }

    /* renamed from: h */
    public final void m79092h(int i) {
        synchronized (this.f40083a) {
            if (!m79098b()) {
                return;
            }
            if (this.f40089g) {
                int i2 = this.f40085c - 1;
                this.f40085c = i2;
                if (i2 > 0) {
                    return;
                }
            } else {
                this.f40085c = 0;
            }
            m79093g();
            for (XP7 xp7 : this.f40097o.values()) {
                xp7.f43148a = 0;
            }
            this.f40097o.clear();
            Future<?> future = this.f40086d;
            if (future != null) {
                future.cancel(false);
                this.f40086d = null;
                this.f40087e = 0L;
            }
            this.f40090h = 0;
            if (this.f40084b.isHeld()) {
                try {
                    this.f40084b.release();
                    if (this.f40091i != null) {
                        this.f40091i = null;
                    }
                } catch (RuntimeException e) {
                    if (e.getClass().equals(RuntimeException.class)) {
                        Log.e("WakeLock", String.valueOf(this.f40094l).concat(" failed to release!"), e);
                        if (this.f40091i != null) {
                            this.f40091i = null;
                        }
                    } else {
                        throw e;
                    }
                }
            } else {
                Log.e("WakeLock", String.valueOf(this.f40094l).concat(" should be held!"));
            }
        }
    }
}
