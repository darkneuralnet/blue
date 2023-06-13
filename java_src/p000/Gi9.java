package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: Gi9 */
/* loaded from: classes5.dex */
public final class Gi9 {

    /* renamed from: m */
    public static final ExecutorService f12294m = Executors.newSingleThreadExecutor();

    /* renamed from: n */
    public static final ExecutorService f12295n = Executors.newSingleThreadExecutor();

    /* renamed from: o */
    public static final long f12296o = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: p */
    public static Gi9 f12297p;

    /* renamed from: a */
    public final Context f12298a;

    /* renamed from: b */
    public final Executor f12299b;

    /* renamed from: c */
    public final Executor f12300c;

    /* renamed from: d */
    public final Kb9 f12301d;

    /* renamed from: e */
    public final C39907dh9 f12302e;

    /* renamed from: f */
    public volatile AbstractC50746vy7 f12303f;

    /* renamed from: g */
    public volatile AbstractC50746vy7 f12304g;

    /* renamed from: h */
    public final Map f12305h = new TreeMap();

    /* renamed from: i */
    public final C47042pj9 f12306i;

    /* renamed from: j */
    public final C39316cj9 f12307j;

    /* renamed from: k */
    public String f12308k;

    /* renamed from: l */
    public final C49393th9 f12309l;

    public Gi9(Context context, Kb9 kb9, ExecutorService executorService, ExecutorService executorService2, C49393th9 c49393th9, C39316cj9 c39316cj9, Db9 db9, byte[] bArr) {
        this.f12298a = context;
        this.f12301d = kb9;
        this.f12299b = executorService;
        this.f12300c = executorService2;
        this.f12309l = c49393th9;
        this.f12307j = c39316cj9;
        this.f12302e = new C39907dh9(context, db9.m110116b(), db9.m110117a(), "firebase", 5L, 5L, c39316cj9);
        this.f12306i = new C47042pj9(context);
    }

    /* renamed from: f */
    public static synchronized Gi9 m104848f() {
        Gi9 gi9;
        synchronized (Gi9.class) {
            if (f12297p == null) {
                f12297p = new Gi9((Context) C52226yU2.m3451c().m3453a(Context.class), Kb9.m98697b(), f12294m, f12295n, C49393th9.f110884a, new C39316cj9(), Fc9.f9785a, null);
            }
            gi9 = f12297p;
        }
        return gi9;
    }

    /* renamed from: m */
    public static AbstractC50746vy7 m104841m(JSONObject jSONObject) throws JSONException {
        String string;
        C38713bi9 c38713bi9 = new C38713bi9(jSONObject);
        C36273Tx7 c36273Tx7 = new C36273Tx7();
        Iterator<String> keys = c38713bi9.f57999b.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                String string2 = jSONObject.getString(next);
                if (string2 == null) {
                    string = null;
                } else if (string2.isEmpty()) {
                    string = "";
                } else {
                    StringBuilder sb = new StringBuilder(string2.length() + 13);
                    sb.append("{ \"value\": ");
                    sb.append(string2);
                    sb.append(" }");
                    string = new JSONObject(sb.toString()).getString("value");
                }
                c36273Tx7.m82216a(next, string);
            } catch (JSONException e) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(next).length() + 55);
                sb2.append("Getting JSON string value for remote config key ");
                sb2.append(next);
                sb2.append(" failed");
                Log.e("MLKit RemoteConfigRestC", sb2.toString(), e);
                throw e;
            }
        }
        return c36273Tx7.m82215b();
    }

    /* renamed from: a */
    public final Task m104853a(final long j) {
        final Date date = new Date(System.currentTimeMillis());
        final Yb9 yb9 = new Yb9();
        yb9.m74819g();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f12300c.execute(new Runnable(date, j, yb9, false, taskCompletionSource) { // from class: ri9

            /* renamed from: c */
            public final /* synthetic */ Date f107516c;

            /* renamed from: d */
            public final /* synthetic */ long f107517d;

            /* renamed from: e */
            public final /* synthetic */ Yb9 f107518e;

            /* renamed from: f */
            public final /* synthetic */ TaskCompletionSource f107519f;

            {
                this.f107519f = taskCompletionSource;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Gi9.this.m104845i(this.f107516c, this.f107517d, this.f107518e, false, this.f107519f);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: b */
    public final Task m104852b() {
        final Yb9 yb9 = new Yb9();
        yb9.m74819g();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f12299b.execute(new Runnable(yb9, true, taskCompletionSource) { // from class: ji9

            /* renamed from: c */
            public final /* synthetic */ Yb9 f93234c;

            /* renamed from: d */
            public final /* synthetic */ TaskCompletionSource f93235d;

            {
                this.f93235d = taskCompletionSource;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Gi9.this.m104844j(this.f93234c, true, this.f93235d);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: h */
    public final String m104846h(String str) {
        String str2;
        AbstractC50746vy7 abstractC50746vy7 = this.f12303f;
        if (abstractC50746vy7 != null) {
            return (String) abstractC50746vy7.get("vision_object_detection_enable_acceleration");
        }
        synchronized (this.f12305h) {
            str2 = (String) this.f12305h.get("vision_object_detection_enable_acceleration");
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0089 A[Catch: all -> 0x00a0, Vi9 | InterruptedException | RuntimeException -> 0x00a2, InterruptedException -> 0x00a4, RuntimeException -> 0x00a6, TryCatch #1 {all -> 0x00a0, blocks: (B:3:0x0003, B:12:0x0033, B:13:0x003d, B:15:0x0058, B:16:0x005e, B:18:0x007c, B:21:0x0089, B:23:0x0094, B:22:0x008f, B:6:0x000c, B:8:0x002a, B:33:0x00a7), top: B:37:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f A[Catch: all -> 0x00a0, Vi9 | InterruptedException | RuntimeException -> 0x00a2, InterruptedException -> 0x00a4, RuntimeException -> 0x00a6, TryCatch #1 {all -> 0x00a0, blocks: (B:3:0x0003, B:12:0x0033, B:13:0x003d, B:15:0x0058, B:16:0x005e, B:18:0x007c, B:21:0x0089, B:23:0x0094, B:22:0x008f, B:6:0x000c, B:8:0x002a, B:33:0x00a7), top: B:37:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void m104845i(Date date, long j, Yb9 yb9, boolean z, TaskCompletionSource taskCompletionSource) {
        Pair m104842l;
        AbstractC50746vy7 abstractC50746vy7;
        C52367yi9 c52367yi9;
        try {
            try {
                m104842l = m104842l(yb9, false);
            } finally {
                yb9.m74821e();
                this.f12307j.m61017c(yb9);
            }
        } catch (Vi9 | InterruptedException | RuntimeException e) {
            Log.e("MLKit RemoteConfigRestC", "Fetch failed", e);
            taskCompletionSource.setException(e);
        }
        if (m104842l != null) {
            abstractC50746vy7 = (AbstractC50746vy7) m104842l.first;
            if (date.after(new Date(((Date) m104842l.second).getTime() + TimeUnit.SECONDS.toMillis(j)))) {
                Log.i("MLKit RemoteConfigRestC", "Saved remote config is past its expiration time.");
            }
            if (abstractC50746vy7 == null) {
                try {
                    Log.d("MLKit RemoteConfigRestC", "Getting installation id...");
                    this.f12301d.m98695d();
                    Log.d("MLKit RemoteConfigRestC", "Got installation id. Checking temporary token for expiry...");
                    String m98696c = this.f12301d.m98696c();
                    Log.d("MLKit RemoteConfigRestC", "Got valid temporary auth token. Fetching remote config...");
                    c52367yi9 = new C52367yi9(this, m98696c, date, yb9);
                } catch (IOException e2) {
                    yb9.m74822d(EnumC38962c79.UNKNOWN_ERROR);
                    Log.e("MLKit RemoteConfigRestC", "Initializing installation id failed", e2);
                }
                if (!Xj9.m76495a(c52367yi9)) {
                    yb9.m74822d(EnumC38962c79.RPC_EXPONENTIAL_BACKOFF_FAILED);
                    abstractC50746vy7 = null;
                } else {
                    abstractC50746vy7 = c52367yi9.m2792a();
                    Log.d("MLKit RemoteConfigRestC", "writeAndSetFetchedConfig: ".concat(String.valueOf(abstractC50746vy7)));
                    this.f12306i.m18876b(c52367yi9.m2791b(), yb9);
                    this.f12304g = abstractC50746vy7;
                }
            }
            if (abstractC50746vy7 != null) {
                Log.e("MLKit RemoteConfigRestC", "Remote config was null!");
            } else {
                Log.d("MLKit RemoteConfigRestC", "Got remote config.");
            }
            taskCompletionSource.setResult(null);
        }
        abstractC50746vy7 = null;
        if (abstractC50746vy7 == null) {
        }
        if (abstractC50746vy7 != null) {
        }
        taskCompletionSource.setResult(null);
    }

    /* renamed from: j */
    public final /* synthetic */ void m104844j(Yb9 yb9, boolean z, TaskCompletionSource taskCompletionSource) {
        try {
            try {
                if (m104842l(yb9, true) == null) {
                    Log.w("MLKit RemoteConfigRestC", "Cached remote config was null!");
                } else {
                    Log.d("MLKit RemoteConfigRestC", "Loaded cached remote config.");
                }
                taskCompletionSource.setResult(null);
            } catch (RuntimeException e) {
                Log.e("MLKit RemoteConfigRestC", "Load failed", e);
                taskCompletionSource.setException(e);
            }
        } finally {
            yb9.m74821e();
            this.f12307j.m61015e(yb9);
        }
    }

    /* renamed from: k */
    public final void m104843k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f12308k = str;
    }

    /* renamed from: l */
    public final Pair m104842l(Yb9 yb9, boolean z) {
        Vg9 m18877a = this.f12306i.m18877a(yb9);
        if (m18877a == null) {
            return null;
        }
        JSONObject m79569d = m18877a.m79569d();
        try {
            AbstractC50746vy7 m104841m = m104841m(m79569d);
            this.f12304g = m104841m;
            if (z) {
                Yb9 yb92 = new Yb9();
                yb92.m74819g();
                this.f12303f = this.f12304g;
                yb92.m74821e();
                this.f12307j.m61018b(yb92);
            }
            yb9.m74818h();
            return Pair.create(m104841m, m18877a.m79570c());
        } catch (JSONException e) {
            yb9.m74823c(EnumC38962c79.FILE_READ_RETURNED_MALFORMED_DATA);
            Log.e("MLKit RemoteConfigRestC", "Saved remote config setting has invalid format: ".concat(String.valueOf(m79569d)), e);
            return null;
        }
    }
}
