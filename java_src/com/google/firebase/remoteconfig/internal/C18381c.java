package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.C18378b;
import com.google.firebase.remoteconfig.internal.C18381c;
import com.google.firebase.remoteconfig.internal.C18384d;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* renamed from: com.google.firebase.remoteconfig.internal.c */
/* loaded from: classes6.dex */
public class C18381c {

    /* renamed from: j */
    public static final long f74447j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k */
    public static final int[] f74448k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a */
    public final InterfaceC35934Sm1 f74449a;

    /* renamed from: b */
    public final X94<InterfaceC12447ba> f74450b;

    /* renamed from: c */
    public final Executor f74451c;

    /* renamed from: d */
    public final Clock f74452d;

    /* renamed from: e */
    public final Random f74453e;

    /* renamed from: f */
    public final C34601Mu0 f74454f;

    /* renamed from: g */
    public final ConfigFetchHttpClient f74455g;

    /* renamed from: h */
    public final C18384d f74456h;

    /* renamed from: i */
    public final Map<String, String> f74457i;

    /* renamed from: com.google.firebase.remoteconfig.internal.c$a */
    /* loaded from: classes6.dex */
    public static class C18382a {

        /* renamed from: a */
        public final Date f74458a;

        /* renamed from: b */
        public final int f74459b;

        /* renamed from: c */
        public final C18378b f74460c;

        /* renamed from: d */
        public final String f74461d;

        public C18382a(Date date, int i, C18378b c18378b, String str) {
            this.f74458a = date;
            this.f74459b = i;
            this.f74460c = c18378b;
            this.f74461d = str;
        }

        /* renamed from: a */
        public static C18382a m46954a(Date date, C18378b c18378b) {
            return new C18382a(date, 1, c18378b, null);
        }

        /* renamed from: b */
        public static C18382a m46953b(C18378b c18378b, String str) {
            return new C18382a(c18378b.m46993g(), 0, c18378b, str);
        }

        /* renamed from: c */
        public static C18382a m46952c(Date date) {
            return new C18382a(date, 2, null, null);
        }

        /* renamed from: d */
        public C18378b m46951d() {
            return this.f74460c;
        }

        /* renamed from: e */
        public String m46950e() {
            return this.f74461d;
        }

        /* renamed from: f */
        public int m46949f() {
            return this.f74459b;
        }
    }

    /* renamed from: com.google.firebase.remoteconfig.internal.c$b */
    /* loaded from: classes6.dex */
    public enum EnumC18383b {
        BASE("BASE"),
        REALTIME("REALTIME");
        

        /* renamed from: b */
        public final String f74465b;

        EnumC18383b(String str) {
            this.f74465b = str;
        }

        /* renamed from: a */
        public String m46948a() {
            return this.f74465b;
        }
    }

    public C18381c(InterfaceC35934Sm1 interfaceC35934Sm1, X94<InterfaceC12447ba> x94, Executor executor, Clock clock, Random random, C34601Mu0 c34601Mu0, ConfigFetchHttpClient configFetchHttpClient, C18384d c18384d, Map<String, String> map) {
        this.f74449a = interfaceC35934Sm1;
        this.f74450b = x94;
        this.f74451c = executor;
        this.f74452d = clock;
        this.f74453e = random;
        this.f74454f = c34601Mu0;
        this.f74455g = configFetchHttpClient;
        this.f74456h = c18384d;
        this.f74457i = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ Task m46958w(Task task, Task task2, Date date, Map map, Task task3) throws Exception {
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task2.getException()));
        }
        return m46969l((String) task.getResult(), ((AbstractC37749a52) task2.getResult()).mo71914b(), date, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ Task m46957x(Date date, Task task) throws Exception {
        m46981C(task, date);
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ Task m46956y(Map map, Task task) throws Exception {
        return m46960u(task, 0L, map);
    }

    /* renamed from: A */
    public final C18384d.C18385a m46983A(int i, Date date) {
        if (m46961t(i)) {
            m46982B(date);
        }
        return this.f74456h.m46947a();
    }

    /* renamed from: B */
    public final void m46982B(Date date) {
        int m46929b = this.f74456h.m46947a().m46929b() + 1;
        this.f74456h.m46937k(m46929b, new Date(date.getTime() + m46964q(m46929b)));
    }

    /* renamed from: C */
    public final void m46981C(Task<C18382a> task, Date date) {
        if (task.isSuccessful()) {
            this.f74456h.m46932p(date);
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return;
        }
        if (exception instanceof FirebaseRemoteConfigFetchThrottledException) {
            this.f74456h.m46931q();
        } else {
            this.f74456h.m46933o();
        }
    }

    /* renamed from: f */
    public final boolean m46975f(long j, Date date) {
        Date m46943e = this.f74456h.m46943e();
        if (m46943e.equals(C18384d.f74466e)) {
            return false;
        }
        return date.before(new Date(m46943e.getTime() + TimeUnit.SECONDS.toMillis(j)));
    }

    /* renamed from: g */
    public final FirebaseRemoteConfigServerException m46974g(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) throws FirebaseRemoteConfigClientException {
        String str;
        int m47025a = firebaseRemoteConfigServerException.m47025a();
        if (m47025a != 401) {
            if (m47025a != 403) {
                if (m47025a != 429) {
                    if (m47025a != 500) {
                        switch (m47025a) {
                            case 502:
                            case 503:
                            case 504:
                                str = "The server is unavailable. Please try again later.";
                                break;
                            default:
                                str = "The server returned an unexpected error.";
                                break;
                        }
                    } else {
                        str = "There was an internal server error.";
                    }
                } else {
                    throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
            } else {
                str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            }
        } else {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        }
        int m47025a2 = firebaseRemoteConfigServerException.m47025a();
        return new FirebaseRemoteConfigServerException(m47025a2, "Fetch failed: " + str, firebaseRemoteConfigServerException);
    }

    /* renamed from: h */
    public final String m46973h(long j) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j)));
    }

    /* renamed from: i */
    public Task<C18382a> m46972i() {
        return m46971j(this.f74456h.m46941g());
    }

    /* renamed from: j */
    public Task<C18382a> m46971j(final long j) {
        final HashMap hashMap = new HashMap(this.f74457i);
        hashMap.put("X-Firebase-RC-Fetch-Type", EnumC18383b.BASE.m46948a() + "/1");
        return this.f74454f.m94603e().continueWithTask(this.f74451c, new Continuation() { // from class: hv0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task m46960u;
                m46960u = C18381c.this.m46960u(j, hashMap, task);
                return m46960u;
            }
        });
    }

    /* renamed from: k */
    public final C18382a m46970k(String str, String str2, Date date, Map<String, String> map) throws FirebaseRemoteConfigException {
        try {
            C18382a fetch = this.f74455g.fetch(this.f74455g.m47020d(), str, str2, m46962s(), this.f74456h.m46944d(), map, m46965p(), date);
            if (fetch.m46951d() != null) {
                this.f74456h.m46935m(fetch.m46951d().m46991i());
            }
            if (fetch.m46950e() != null) {
                this.f74456h.m46936l(fetch.m46950e());
            }
            this.f74456h.m46939i();
            return fetch;
        } catch (FirebaseRemoteConfigServerException e) {
            C18384d.C18385a m46983A = m46983A(e.m47025a(), date);
            if (m46955z(m46983A, e.m47025a())) {
                throw new FirebaseRemoteConfigFetchThrottledException(m46983A.m46930a().getTime());
            }
            throw m46974g(e);
        }
    }

    /* renamed from: l */
    public final Task<C18382a> m46969l(String str, String str2, Date date, Map<String, String> map) {
        try {
            final C18382a m46970k = m46970k(str, str2, date, map);
            if (m46970k.m46949f() != 0) {
                return Tasks.forResult(m46970k);
            }
            return this.f74454f.m94597k(m46970k.m46951d()).onSuccessTask(this.f74451c, new SuccessContinuation() { // from class: kv0
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    Task forResult;
                    C18378b c18378b = (C18378b) obj;
                    forResult = Tasks.forResult(C18381c.C18382a.this);
                    return forResult;
                }
            });
        } catch (FirebaseRemoteConfigException e) {
            return Tasks.forException(e);
        }
    }

    /* renamed from: m */
    public final Task<C18382a> m46960u(Task<C18378b> task, long j, final Map<String, String> map) {
        Task continueWithTask;
        final Date date = new Date(this.f74452d.currentTimeMillis());
        if (task.isSuccessful() && m46975f(j, date)) {
            return Tasks.forResult(C18382a.m46952c(date));
        }
        Date m46966o = m46966o(date);
        if (m46966o != null) {
            continueWithTask = Tasks.forException(new FirebaseRemoteConfigFetchThrottledException(m46973h(m46966o.getTime() - date.getTime()), m46966o.getTime()));
        } else {
            final Task<String> id = this.f74449a.getId();
            final Task<AbstractC37749a52> mo47278a = this.f74449a.mo47278a(false);
            continueWithTask = Tasks.whenAllComplete(id, mo47278a).continueWithTask(this.f74451c, new Continuation() { // from class: iv0
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    Task m46958w;
                    m46958w = C18381c.this.m46958w(id, mo47278a, date, map, task2);
                    return m46958w;
                }
            });
        }
        return continueWithTask.continueWithTask(this.f74451c, new Continuation() { // from class: jv0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Task m46957x;
                m46957x = C18381c.this.m46957x(date, task2);
                return m46957x;
            }
        });
    }

    /* renamed from: n */
    public Task<C18382a> m46967n(EnumC18383b enumC18383b, int i) {
        final HashMap hashMap = new HashMap(this.f74457i);
        hashMap.put("X-Firebase-RC-Fetch-Type", enumC18383b.m46948a() + "/" + i);
        return this.f74454f.m94603e().continueWithTask(this.f74451c, new Continuation() { // from class: gv0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task m46956y;
                m46956y = C18381c.this.m46956y(hashMap, task);
                return m46956y;
            }
        });
    }

    /* renamed from: o */
    public final Date m46966o(Date date) {
        Date m46930a = this.f74456h.m46947a().m46930a();
        if (date.before(m46930a)) {
            return m46930a;
        }
        return null;
    }

    /* renamed from: p */
    public final Long m46965p() {
        InterfaceC12447ba interfaceC12447ba = this.f74450b.get();
        if (interfaceC12447ba == null) {
            return null;
        }
        return (Long) interfaceC12447ba.mo61203g(true).get("_fot");
    }

    /* renamed from: q */
    public final long m46964q(int i) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f74448k;
        long millis = timeUnit.toMillis(iArr[Math.min(i, iArr.length) - 1]);
        return (millis / 2) + this.f74453e.nextInt((int) millis);
    }

    /* renamed from: r */
    public long m46963r() {
        return this.f74456h.m46942f();
    }

    /* renamed from: s */
    public final Map<String, String> m46962s() {
        HashMap hashMap = new HashMap();
        InterfaceC12447ba interfaceC12447ba = this.f74450b.get();
        if (interfaceC12447ba == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : interfaceC12447ba.mo61203g(false).entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }

    /* renamed from: t */
    public final boolean m46961t(int i) {
        return i == 429 || i == 502 || i == 503 || i == 504;
    }

    /* renamed from: z */
    public final boolean m46955z(C18384d.C18385a c18385a, int i) {
        return c18385a.m46929b() > 1 || i == 429;
    }
}
