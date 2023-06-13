package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.C18376a;
import com.google.firebase.remoteconfig.internal.C18381c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
/* renamed from: com.google.firebase.remoteconfig.internal.a */
/* loaded from: classes6.dex */
public class C18376a {

    /* renamed from: a */
    public final Set<InterfaceC32738Ev0> f74425a;

    /* renamed from: b */
    public final HttpURLConnection f74426b;

    /* renamed from: c */
    public final C18381c f74427c;

    /* renamed from: d */
    public final C34601Mu0 f74428d;

    /* renamed from: e */
    public final InterfaceC32738Ev0 f74429e;

    /* renamed from: f */
    public final ScheduledExecutorService f74430f;

    /* renamed from: g */
    public final Random f74431g = new Random();

    /* renamed from: com.google.firebase.remoteconfig.internal.a$a */
    /* loaded from: classes6.dex */
    public class RunnableC18377a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ int f74432b;

        /* renamed from: c */
        public final /* synthetic */ long f74433c;

        public RunnableC18377a(int i, long j) {
            this.f74432b = i;
            this.f74433c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            C18376a.this.m47007d(this.f74432b, this.f74433c);
        }
    }

    public C18376a(HttpURLConnection httpURLConnection, C18381c c18381c, C34601Mu0 c34601Mu0, Set<InterfaceC32738Ev0> set, InterfaceC32738Ev0 interfaceC32738Ev0, ScheduledExecutorService scheduledExecutorService) {
        this.f74426b = httpURLConnection;
        this.f74427c = c18381c;
        this.f74428d = c34601Mu0;
        this.f74425a = set;
        this.f74429e = interfaceC32738Ev0;
        this.f74430f = scheduledExecutorService;
    }

    /* renamed from: e */
    public static Boolean m47006e(C18381c.C18382a c18382a, long j) {
        boolean z = false;
        if (c18382a.m46951d() != null) {
            if (c18382a.m46951d().m46991i() >= j) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (c18382a.m46949f() == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ Task m47003h(Task task, Task task2, long j, int i, Task task3) throws Exception {
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", task2.getException()));
        }
        C18381c.C18382a c18382a = (C18381c.C18382a) task.getResult();
        C18378b c18378b = (C18378b) task2.getResult();
        if (!m47006e(c18382a, j).booleanValue()) {
            Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
            m47009b(i, j);
            return Tasks.forResult(null);
        } else if (c18382a.m46951d() == null) {
            Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
            return Tasks.forResult(null);
        } else {
            if (c18378b == null) {
                c18378b = C18378b.m46990j().m46989a();
            }
            Set<String> m46995e = c18378b.m46995e(c18382a.m46951d());
            if (m46995e.isEmpty()) {
                Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                return Tasks.forResult(null);
            }
            m47008c(AbstractC32504Dv0.m109702a(m46995e));
            return Tasks.forResult(null);
        }
    }

    /* renamed from: b */
    public final void m47009b(int i, long j) {
        if (i == 0) {
            m47000k(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.", FirebaseRemoteConfigException.EnumC18375a.CONFIG_UPDATE_NOT_FETCHED));
            return;
        }
        this.f74430f.schedule(new RunnableC18377a(i, j), this.f74431g.nextInt(4), TimeUnit.SECONDS);
    }

    /* renamed from: c */
    public final synchronized void m47008c(AbstractC32504Dv0 abstractC32504Dv0) {
        for (InterfaceC32738Ev0 interfaceC32738Ev0 : this.f74425a) {
            interfaceC32738Ev0.mo46897a(abstractC32504Dv0);
        }
    }

    /* renamed from: d */
    public synchronized Task<Void> m47007d(int i, final long j) {
        final int i2;
        final Task<C18381c.C18382a> m46967n;
        final Task<C18378b> m94603e;
        i2 = i - 1;
        m46967n = this.f74427c.m46967n(C18381c.EnumC18383b.REALTIME, 3 - i2);
        m94603e = this.f74428d.m94603e();
        return Tasks.whenAllComplete(m46967n, m94603e).continueWithTask(this.f74430f, new Continuation() { // from class: Iu0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task m47003h;
                m47003h = C18376a.this.m47003h(m46967n, m94603e, j, i2, task);
                return m47003h;
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
        r5 = new org.json.JSONObject(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
        if (r5.has("featureDisabled") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        if (r5.getBoolean("featureDisabled") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
        r9.f74429e.mo46896b(new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.", com.google.firebase.remoteconfig.FirebaseRemoteConfigException.EnumC18375a.CONFIG_UPDATE_UNAVAILABLE));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
        if (m47004g() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
        if (r5.has("latestTemplateVersionNumber") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
        r6 = r9.f74427c.m46963r();
        r4 = r5.getLong("latestTemplateVersionNumber");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
        if (r4 <= r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
        m47009b(3, r4);
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m47005f(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        loop0: while (true) {
            String str = "";
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break loop0;
                }
                str = str + readLine;
                if (readLine.contains("}")) {
                    str = m47001j(str);
                    if (!str.isEmpty()) {
                        try {
                            break;
                        } catch (JSONException e) {
                            m47000k(new FirebaseRemoteConfigClientException("Unable to parse config update message.", e.getCause(), FirebaseRemoteConfigException.EnumC18375a.CONFIG_UPDATE_MESSAGE_INVALID));
                            Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e);
                        }
                    }
                }
            }
        }
        bufferedReader.close();
        inputStream.close();
    }

    /* renamed from: g */
    public final synchronized boolean m47004g() {
        return this.f74425a.isEmpty();
    }

    /* renamed from: i */
    public void m47002i() {
        HttpURLConnection httpURLConnection = this.f74426b;
        if (httpURLConnection == null) {
            return;
        }
        try {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                m47005f(inputStream);
                inputStream.close();
            } catch (IOException e) {
                Log.d("FirebaseRemoteConfig", "Stream was cancelled due to an exception. Retrying the connection...", e);
            }
        } finally {
            this.f74426b.disconnect();
        }
    }

    /* renamed from: j */
    public final String m47001j(String str) {
        int indexOf = str.indexOf(123);
        int lastIndexOf = str.lastIndexOf(125);
        if (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) {
            return "";
        }
        return str.substring(indexOf, lastIndexOf + 1);
    }

    /* renamed from: k */
    public final synchronized void m47000k(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        for (InterfaceC32738Ev0 interfaceC32738Ev0 : this.f74425a) {
            interfaceC32738Ev0.mo46896b(firebaseRemoteConfigException);
        }
    }
}
