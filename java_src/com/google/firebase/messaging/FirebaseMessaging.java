package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.C18358d;
import com.google.firebase.messaging.C18360e;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.InterfaceC36402Um1;
/* loaded from: classes6.dex */
public class FirebaseMessaging {
    private static final String EXTRA_DUMMY_P_INTENT = "app";
    static final String GMS_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final String INSTANCE_ID_SCOPE = "FCM";
    private static final long MAX_DELAY_SEC = TimeUnit.HOURS.toSeconds(8);
    private static final long MIN_DELAY_SEC = 30;
    private static final String SEND_INTENT_ACTION = "com.google.android.gcm.intent.SEND";
    private static final String SUBTYPE_DEFAULT = "";
    static final String TAG = "FirebaseMessaging";
    private static C18360e store;
    static ScheduledExecutorService syncExecutor;
    @SuppressLint({"FirebaseUnknownNullness"})
    static U96 transportFactory;
    private final C18351a autoInit;
    private final Context context;
    private final Executor fileExecutor;
    private final C31722Am1 firebaseApp;
    private final InterfaceC35934Sm1 fis;
    private final ZC1 gmsRpc;
    private final InterfaceC36402Um1 iid;
    private final Executor initExecutor;
    private final Application.ActivityLifecycleCallbacks lifecycleCallbacks;
    private final ET2 metadata;
    private final C18358d requestDeduplicator;
    private boolean syncScheduledOrRunning;
    private final Executor taskExecutor;
    private final Task<O56> topicsSubscriberTask;

    /* renamed from: com.google.firebase.messaging.FirebaseMessaging$a */
    /* loaded from: classes6.dex */
    public class C18351a {

        /* renamed from: a */
        public final InterfaceC42734iT5 f74298a;

        /* renamed from: b */
        public boolean f74299b;

        /* renamed from: c */
        public InterfaceC33540Ig1<GS0> f74300c;

        /* renamed from: d */
        public Boolean f74301d;

        public C18351a(InterfaceC42734iT5 interfaceC42734iT5) {
            this.f74298a = interfaceC42734iT5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m47226d(C51746xg1 c51746xg1) {
            if (m47227c()) {
                FirebaseMessaging.this.startSyncIfNecessary();
            }
        }

        /* renamed from: b */
        public synchronized void m47228b() {
            if (this.f74299b) {
                return;
            }
            Boolean m47225e = m47225e();
            this.f74301d = m47225e;
            if (m47225e == null) {
                InterfaceC33540Ig1<GS0> interfaceC33540Ig1 = new InterfaceC33540Ig1() { // from class: hn1
                    @Override // p000.InterfaceC33540Ig1
                    /* renamed from: a */
                    public final void mo5677a(C51746xg1 c51746xg1) {
                        FirebaseMessaging.C18351a.this.m47226d(c51746xg1);
                    }
                };
                this.f74300c = interfaceC33540Ig1;
                this.f74298a.mo33865c(GS0.class, interfaceC33540Ig1);
            }
            this.f74299b = true;
        }

        /* renamed from: c */
        public synchronized boolean m47227c() {
            boolean m115284s;
            m47228b();
            Boolean bool = this.f74301d;
            if (bool != null) {
                m115284s = bool.booleanValue();
            } else {
                m115284s = FirebaseMessaging.this.firebaseApp.m115284s();
            }
            return m115284s;
        }

        /* renamed from: e */
        public final Boolean m47225e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context m115293j = FirebaseMessaging.this.firebaseApp.m115293j();
            SharedPreferences sharedPreferences = m115293j.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = m115293j.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(m115293j.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                }
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: f */
        public synchronized void m47224f(boolean z) {
            m47228b();
            InterfaceC33540Ig1<GS0> interfaceC33540Ig1 = this.f74300c;
            if (interfaceC33540Ig1 != null) {
                this.f74298a.mo33866b(GS0.class, interfaceC33540Ig1);
                this.f74300c = null;
            }
            SharedPreferences.Editor edit = FirebaseMessaging.this.firebaseApp.m115293j().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z);
            edit.apply();
            if (z) {
                FirebaseMessaging.this.startSyncIfNecessary();
            }
            this.f74301d = Boolean.valueOf(z);
        }
    }

    public FirebaseMessaging(C31722Am1 c31722Am1, InterfaceC36402Um1 interfaceC36402Um1, X94<InterfaceC42265hg6> x94, X94<InterfaceC50338vI1> x942, InterfaceC35934Sm1 interfaceC35934Sm1, U96 u96, InterfaceC42734iT5 interfaceC42734iT5) {
        this(c31722Am1, interfaceC36402Um1, x94, x942, interfaceC35934Sm1, u96, interfaceC42734iT5, new ET2(c31722Am1.m115293j()));
    }

    public static synchronized void clearStoreForTest() {
        synchronized (FirebaseMessaging.class) {
            store = null;
        }
    }

    public static void clearTransportFactoryForTest() {
        transportFactory = null;
    }

    public static synchronized FirebaseMessaging getInstance() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(C31722Am1.m115292k());
        }
        return firebaseMessaging;
    }

    private static synchronized C18360e getStore(Context context) {
        C18360e c18360e;
        synchronized (FirebaseMessaging.class) {
            if (store == null) {
                store = new C18360e(context);
            }
            c18360e = store;
        }
        return c18360e;
    }

    private String getSubtype() {
        if ("[DEFAULT]".equals(this.firebaseApp.m115291l())) {
            return "";
        }
        return this.firebaseApp.m115289n();
    }

    public static U96 getTransportFactory() {
        return transportFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invokeOnTokenRefresh */
    public void lambda$new$0(String str) {
        if ("[DEFAULT]".equals(this.firebaseApp.m115291l())) {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Invoking onNewToken for app: " + this.firebaseApp.m115291l());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C36141Tj1(this.context).m83066i(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$blockingGetToken$10(final String str, final C18360e.C18361a c18361a) {
        return this.gmsRpc.m73627f().onSuccessTask(this.fileExecutor, new SuccessContinuation() { // from class: Xm1
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task lambda$blockingGetToken$9;
                lambda$blockingGetToken$9 = FirebaseMessaging.this.lambda$blockingGetToken$9(str, c18361a, (String) obj);
                return lambda$blockingGetToken$9;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$blockingGetToken$9(String str, C18360e.C18361a c18361a, String str2) throws Exception {
        getStore(this.context).m47136g(getSubtype(), str, str2, this.metadata.m108942a());
        if (c18361a == null || !str2.equals(c18361a.f74340a)) {
            lambda$new$0(str2);
        }
        return Tasks.forResult(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteToken$5(TaskCompletionSource taskCompletionSource) {
        try {
            this.iid.m80885a(ET2.m108940c(this.firebaseApp), INSTANCE_ID_SCOPE);
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteToken$6(TaskCompletionSource taskCompletionSource) {
        try {
            Tasks.await(this.gmsRpc.m73630c());
            getStore(this.context).m47139d(getSubtype(), ET2.m108940c(this.firebaseApp));
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getToken$4(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(blockingGetToken());
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1() {
        if (isAutoInitEnabled()) {
            startSyncIfNecessary();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(O56 o56) {
        if (isAutoInitEnabled()) {
            o56.m92925q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3() {
        C41017fa4.m41159c(this.context);
    }

    private synchronized void startSync() {
        if (!this.syncScheduledOrRunning) {
            syncWithDelaySecondsInternal(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSyncIfNecessary() {
        InterfaceC36402Um1 interfaceC36402Um1 = this.iid;
        if (interfaceC36402Um1 != null) {
            interfaceC36402Um1.getToken();
        } else if (tokenNeedsRefresh(getTokenWithoutTriggeringSync())) {
            startSync();
        }
    }

    public String blockingGetToken() throws IOException {
        InterfaceC36402Um1 interfaceC36402Um1 = this.iid;
        if (interfaceC36402Um1 != null) {
            try {
                return (String) Tasks.await(interfaceC36402Um1.m80883c());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        final C18360e.C18361a tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync();
        if (!tokenNeedsRefresh(tokenWithoutTriggeringSync)) {
            return tokenWithoutTriggeringSync.f74340a;
        }
        final String m108940c = ET2.m108940c(this.firebaseApp);
        try {
            return (String) Tasks.await(this.requestDeduplicator.m47144b(m108940c, new C18358d.InterfaceC18359a() { // from class: dn1
                @Override // com.google.firebase.messaging.C18358d.InterfaceC18359a
                public final Task start() {
                    Task lambda$blockingGetToken$10;
                    lambda$blockingGetToken$10 = FirebaseMessaging.this.lambda$blockingGetToken$10(m108940c, tokenWithoutTriggeringSync);
                    return lambda$blockingGetToken$10;
                }
            }));
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    public Task<Void> deleteToken() {
        if (this.iid != null) {
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.initExecutor.execute(new Runnable() { // from class: en1
                @Override // java.lang.Runnable
                public final void run() {
                    FirebaseMessaging.this.lambda$deleteToken$5(taskCompletionSource);
                }
            });
            return taskCompletionSource.getTask();
        } else if (getTokenWithoutTriggeringSync() == null) {
            return Tasks.forResult(null);
        } else {
            final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            C36375Uj1.m80973e().execute(new Runnable() { // from class: fn1
                @Override // java.lang.Runnable
                public final void run() {
                    FirebaseMessaging.this.lambda$deleteToken$6(taskCompletionSource2);
                }
            });
            return taskCompletionSource2.getTask();
        }
    }

    public boolean deliveryMetricsExportToBigQueryEnabled() {
        return C18356b.m47197a();
    }

    @SuppressLint({"ThreadPoolCreation"})
    public void enqueueTaskWithDelaySeconds(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            if (syncExecutor == null) {
                syncExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            syncExecutor.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    public Context getApplicationContext() {
        return this.context;
    }

    public Task<String> getToken() {
        InterfaceC36402Um1 interfaceC36402Um1 = this.iid;
        if (interfaceC36402Um1 != null) {
            return interfaceC36402Um1.m80883c();
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.initExecutor.execute(new Runnable() { // from class: gn1
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.lambda$getToken$4(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public C18360e.C18361a getTokenWithoutTriggeringSync() {
        return getStore(this.context).m47138e(getSubtype(), ET2.m108940c(this.firebaseApp));
    }

    public Task<O56> getTopicsSubscriberTask() {
        return this.topicsSubscriberTask;
    }

    public boolean isAutoInitEnabled() {
        return this.autoInit.m47227c();
    }

    public boolean isGmsCorePresent() {
        return this.metadata.m108936g();
    }

    public boolean isNotificationDelegationEnabled() {
        return C41017fa4.m41158d(this.context);
    }

    public void send(RemoteMessage remoteMessage) {
        if (!TextUtils.isEmpty(remoteMessage.m47206v())) {
            Intent intent = new Intent(SEND_INTENT_ACTION);
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            intent.putExtra("app", PendingIntent.getBroadcast(this.context, 0, intent2, 67108864));
            intent.setPackage("com.google.android.gms");
            remoteMessage.m47210E(intent);
            this.context.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        throw new IllegalArgumentException("Missing 'to'");
    }

    public void setAutoInitEnabled(boolean z) {
        this.autoInit.m47224f(z);
    }

    public void setDeliveryMetricsExportToBigQuery(boolean z) {
        C18356b.m47173y(z);
    }

    public Task<Void> setNotificationDelegationEnabled(boolean z) {
        return C41017fa4.m41156f(this.initExecutor, this.context, z);
    }

    public synchronized void setSyncScheduledOrRunning(boolean z) {
        this.syncScheduledOrRunning = z;
    }

    @SuppressLint({"TaskMainThread"})
    public Task<Void> subscribeToTopic(final String str) {
        return this.topicsSubscriberTask.onSuccessTask(new SuccessContinuation() { // from class: cn1
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m92924r;
                m92924r = ((O56) obj).m92924r(str);
                return m92924r;
            }
        });
    }

    public synchronized void syncWithDelaySecondsInternal(long j) {
        enqueueTaskWithDelaySeconds(new AX5(this, Math.min(Math.max((long) MIN_DELAY_SEC, 2 * j), MAX_DELAY_SEC)), j);
        this.syncScheduledOrRunning = true;
    }

    public boolean tokenNeedsRefresh(C18360e.C18361a c18361a) {
        return c18361a == null || c18361a.m47134b(this.metadata.m108942a());
    }

    @SuppressLint({"TaskMainThread"})
    public Task<Void> unsubscribeFromTopic(final String str) {
        return this.topicsSubscriberTask.onSuccessTask(new SuccessContinuation() { // from class: Wm1
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m92921u;
                m92921u = ((O56) obj).m92921u(str);
                return m92921u;
            }
        });
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(C31722Am1 c31722Am1) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) c31722Am1.m115294i(FirebaseMessaging.class);
            Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public FirebaseMessaging(C31722Am1 c31722Am1, InterfaceC36402Um1 interfaceC36402Um1, X94<InterfaceC42265hg6> x94, X94<InterfaceC50338vI1> x942, InterfaceC35934Sm1 interfaceC35934Sm1, U96 u96, InterfaceC42734iT5 interfaceC42734iT5, ET2 et2) {
        this(c31722Am1, interfaceC36402Um1, interfaceC35934Sm1, u96, interfaceC42734iT5, et2, new ZC1(c31722Am1, et2, x94, x942, interfaceC35934Sm1), C36375Uj1.m80972f(), C36375Uj1.m80975c(), C36375Uj1.m80976b());
    }

    public FirebaseMessaging(C31722Am1 c31722Am1, InterfaceC36402Um1 interfaceC36402Um1, InterfaceC35934Sm1 interfaceC35934Sm1, U96 u96, InterfaceC42734iT5 interfaceC42734iT5, ET2 et2, ZC1 zc1, Executor executor, Executor executor2, Executor executor3) {
        this.syncScheduledOrRunning = false;
        transportFactory = u96;
        this.firebaseApp = c31722Am1;
        this.iid = interfaceC36402Um1;
        this.fis = interfaceC35934Sm1;
        this.autoInit = new C18351a(interfaceC42734iT5);
        Context m115293j = c31722Am1.m115293j();
        this.context = m115293j;
        C36843Wj1 c36843Wj1 = new C36843Wj1();
        this.lifecycleCallbacks = c36843Wj1;
        this.metadata = et2;
        this.taskExecutor = executor;
        this.gmsRpc = zc1;
        this.requestDeduplicator = new C18358d(executor);
        this.initExecutor = executor2;
        this.fileExecutor = executor3;
        Context m115293j2 = c31722Am1.m115293j();
        if (m115293j2 instanceof Application) {
            ((Application) m115293j2).registerActivityLifecycleCallbacks(c36843Wj1);
        } else {
            Log.w(TAG, "Context " + m115293j2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (interfaceC36402Um1 != null) {
            interfaceC36402Um1.m80884b(new InterfaceC36402Um1.InterfaceC8441a() { // from class: Ym1
            });
        }
        executor2.execute(new Runnable() { // from class: Zm1
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.lambda$new$1();
            }
        });
        Task<O56> m92936f = O56.m92936f(this, et2, zc1, m115293j, C36375Uj1.m80971g());
        this.topicsSubscriberTask = m92936f;
        m92936f.addOnSuccessListener(executor2, new OnSuccessListener() { // from class: an1
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FirebaseMessaging.this.lambda$new$2((O56) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: bn1
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.lambda$new$3();
            }
        });
    }
}
