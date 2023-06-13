package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;
@Deprecated
/* loaded from: classes.dex */
public abstract class JobIntentService extends Service {

    /* renamed from: i */
    public static final Object f54231i = new Object();

    /* renamed from: j */
    public static final HashMap<ComponentName, AbstractC11542h> f54232j = new HashMap<>();

    /* renamed from: b */
    public InterfaceC11535b f54233b;

    /* renamed from: c */
    public AbstractC11542h f54234c;

    /* renamed from: d */
    public AsyncTaskC11534a f54235d;

    /* renamed from: e */
    public boolean f54236e = false;

    /* renamed from: f */
    public boolean f54237f = false;

    /* renamed from: g */
    public boolean f54238g = false;

    /* renamed from: h */
    public final ArrayList<C11537d> f54239h;

    /* renamed from: androidx.core.app.JobIntentService$a */
    /* loaded from: classes.dex */
    public final class AsyncTaskC11534a extends AsyncTask<Void, Void, Void> {
        public AsyncTaskC11534a() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                InterfaceC11538e m67749a = JobIntentService.this.m67749a();
                if (m67749a != null) {
                    JobIntentService.this.mo52985g(m67749a.getIntent());
                    m67749a.mo67736e();
                } else {
                    return null;
                }
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onCancelled(Void r1) {
            JobIntentService.this.m67742i();
        }

        @Override // android.os.AsyncTask
        /* renamed from: c */
        public void onPostExecute(Void r1) {
            JobIntentService.this.m67742i();
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$b */
    /* loaded from: classes.dex */
    public interface InterfaceC11535b {
        /* renamed from: a */
        IBinder mo67738a();

        /* renamed from: b */
        InterfaceC11538e mo67737b();
    }

    /* renamed from: androidx.core.app.JobIntentService$c */
    /* loaded from: classes.dex */
    public static final class C11536c extends AbstractC11542h {

        /* renamed from: d */
        public final Context f54241d;

        /* renamed from: e */
        public final PowerManager.WakeLock f54242e;

        /* renamed from: f */
        public final PowerManager.WakeLock f54243f;

        /* renamed from: g */
        public boolean f54244g;

        /* renamed from: h */
        public boolean f54245h;

        public C11536c(Context context, ComponentName componentName) {
            super(componentName);
            this.f54241d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f54242e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f54243f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.JobIntentService.AbstractC11542h
        /* renamed from: a */
        public void mo67735a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f54256a);
            if (this.f54241d.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.f54244g) {
                        this.f54244g = true;
                        if (!this.f54245h) {
                            this.f54242e.acquire(60000L);
                        }
                    }
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.AbstractC11542h
        /* renamed from: c */
        public void mo67733c() {
            synchronized (this) {
                if (this.f54245h) {
                    if (this.f54244g) {
                        this.f54242e.acquire(60000L);
                    }
                    this.f54245h = false;
                    this.f54243f.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.AbstractC11542h
        /* renamed from: d */
        public void mo67732d() {
            synchronized (this) {
                if (!this.f54245h) {
                    this.f54245h = true;
                    this.f54243f.acquire(600000L);
                    this.f54242e.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.AbstractC11542h
        /* renamed from: e */
        public void mo67731e() {
            synchronized (this) {
                this.f54244g = false;
            }
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$d */
    /* loaded from: classes.dex */
    public final class C11537d implements InterfaceC11538e {

        /* renamed from: a */
        public final Intent f54246a;

        /* renamed from: b */
        public final int f54247b;

        public C11537d(Intent intent, int i) {
            this.f54246a = intent;
            this.f54247b = i;
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC11538e
        /* renamed from: e */
        public void mo67736e() {
            JobIntentService.this.stopSelf(this.f54247b);
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC11538e
        public Intent getIntent() {
            return this.f54246a;
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$e */
    /* loaded from: classes.dex */
    public interface InterfaceC11538e {
        /* renamed from: e */
        void mo67736e();

        Intent getIntent();
    }

    /* renamed from: androidx.core.app.JobIntentService$f  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class jobJobServiceEngineC11539f extends JobServiceEngine implements InterfaceC11535b {

        /* renamed from: a */
        public final JobIntentService f54249a;

        /* renamed from: b */
        public final Object f54250b;

        /* renamed from: c */
        public JobParameters f54251c;

        /* renamed from: androidx.core.app.JobIntentService$f$a */
        /* loaded from: classes.dex */
        public final class C11540a implements InterfaceC11538e {

            /* renamed from: a */
            public final JobWorkItem f54252a;

            public C11540a(JobWorkItem jobWorkItem) {
                this.f54252a = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.InterfaceC11538e
            /* renamed from: e */
            public void mo67736e() {
                synchronized (jobJobServiceEngineC11539f.this.f54250b) {
                    JobParameters jobParameters = jobJobServiceEngineC11539f.this.f54251c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f54252a);
                    }
                }
            }

            @Override // androidx.core.app.JobIntentService.InterfaceC11538e
            public Intent getIntent() {
                Intent intent;
                intent = this.f54252a.getIntent();
                return intent;
            }
        }

        public jobJobServiceEngineC11539f(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f54250b = new Object();
            this.f54249a = jobIntentService;
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC11535b
        /* renamed from: a */
        public IBinder mo67738a() {
            return getBinder();
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC11535b
        /* renamed from: b */
        public InterfaceC11538e mo67737b() {
            JobWorkItem dequeueWork;
            Intent intent;
            synchronized (this.f54250b) {
                JobParameters jobParameters = this.f54251c;
                if (jobParameters == null) {
                    return null;
                }
                dequeueWork = jobParameters.dequeueWork();
                if (dequeueWork == null) {
                    return null;
                }
                intent = dequeueWork.getIntent();
                intent.setExtrasClassLoader(this.f54249a.getClassLoader());
                return new C11540a(dequeueWork);
            }
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            this.f54251c = jobParameters;
            this.f54249a.m67745e(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            boolean m67748b = this.f54249a.m67748b();
            synchronized (this.f54250b) {
                this.f54251c = null;
            }
            return m67748b;
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$g */
    /* loaded from: classes.dex */
    public static final class C11541g extends AbstractC11542h {

        /* renamed from: d */
        public final JobInfo f54254d;

        /* renamed from: e */
        public final JobScheduler f54255e;

        public C11541g(Context context, ComponentName componentName, int i) {
            super(componentName);
            m67734b(i);
            this.f54254d = new JobInfo.Builder(i, this.f54256a).setOverrideDeadline(0L).build();
            this.f54255e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // androidx.core.app.JobIntentService.AbstractC11542h
        /* renamed from: a */
        public void mo67735a(Intent intent) {
            JobScheduler jobScheduler = this.f54255e;
            JobInfo jobInfo = this.f54254d;
            C33784Jh2.m100019a();
            jobScheduler.enqueue(jobInfo, C33550Ih2.m101804a(intent));
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$h */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11542h {

        /* renamed from: a */
        public final ComponentName f54256a;

        /* renamed from: b */
        public boolean f54257b;

        /* renamed from: c */
        public int f54258c;

        public AbstractC11542h(ComponentName componentName) {
            this.f54256a = componentName;
        }

        /* renamed from: a */
        public abstract void mo67735a(Intent intent);

        /* renamed from: b */
        public void m67734b(int i) {
            if (!this.f54257b) {
                this.f54257b = true;
                this.f54258c = i;
            } else if (this.f54258c == i) {
            } else {
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.f54258c);
            }
        }

        /* renamed from: c */
        public void mo67733c() {
        }

        /* renamed from: d */
        public void mo67732d() {
        }

        /* renamed from: e */
        public void mo67731e() {
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f54239h = null;
        } else {
            this.f54239h = new ArrayList<>();
        }
    }

    /* renamed from: c */
    public static void m67747c(Context context, ComponentName componentName, int i, Intent intent) {
        if (intent != null) {
            synchronized (f54231i) {
                AbstractC11542h m67744f = m67744f(context, componentName, true, i);
                m67744f.m67734b(i);
                m67744f.mo67735a(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    /* renamed from: d */
    public static void m67746d(Context context, Class<?> cls, int i, Intent intent) {
        m67747c(context, new ComponentName(context, cls), i, intent);
    }

    /* renamed from: f */
    public static AbstractC11542h m67744f(Context context, ComponentName componentName, boolean z, int i) {
        AbstractC11542h c11536c;
        HashMap<ComponentName, AbstractC11542h> hashMap = f54232j;
        AbstractC11542h abstractC11542h = hashMap.get(componentName);
        if (abstractC11542h == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                if (z) {
                    c11536c = new C11541g(context, componentName, i);
                } else {
                    throw new IllegalArgumentException("Can't be here without a job id");
                }
            } else {
                c11536c = new C11536c(context, componentName);
            }
            AbstractC11542h abstractC11542h2 = c11536c;
            hashMap.put(componentName, abstractC11542h2);
            return abstractC11542h2;
        }
        return abstractC11542h;
    }

    /* renamed from: a */
    public InterfaceC11538e m67749a() {
        InterfaceC11535b interfaceC11535b = this.f54233b;
        if (interfaceC11535b != null) {
            return interfaceC11535b.mo67737b();
        }
        synchronized (this.f54239h) {
            if (this.f54239h.size() > 0) {
                return this.f54239h.remove(0);
            }
            return null;
        }
    }

    /* renamed from: b */
    public boolean m67748b() {
        AsyncTaskC11534a asyncTaskC11534a = this.f54235d;
        if (asyncTaskC11534a != null) {
            asyncTaskC11534a.cancel(this.f54236e);
        }
        this.f54237f = true;
        return m67743h();
    }

    /* renamed from: e */
    public void m67745e(boolean z) {
        if (this.f54235d == null) {
            this.f54235d = new AsyncTaskC11534a();
            AbstractC11542h abstractC11542h = this.f54234c;
            if (abstractC11542h != null && z) {
                abstractC11542h.mo67732d();
            }
            this.f54235d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: g */
    public abstract void mo52985g(Intent intent);

    /* renamed from: h */
    public boolean m67743h() {
        return true;
    }

    /* renamed from: i */
    public void m67742i() {
        ArrayList<C11537d> arrayList = this.f54239h;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f54235d = null;
                ArrayList<C11537d> arrayList2 = this.f54239h;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    m67745e(false);
                } else if (!this.f54238g) {
                    this.f54234c.mo67733c();
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        InterfaceC11535b interfaceC11535b = this.f54233b;
        if (interfaceC11535b != null) {
            return interfaceC11535b.mo67738a();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f54233b = new jobJobServiceEngineC11539f(this);
            this.f54234c = null;
            return;
        }
        this.f54233b = null;
        this.f54234c = m67744f(this, new ComponentName(this, getClass()), false, 0);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<C11537d> arrayList = this.f54239h;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f54238g = true;
                this.f54234c.mo67733c();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.f54239h != null) {
            this.f54234c.mo67731e();
            synchronized (this.f54239h) {
                ArrayList<C11537d> arrayList = this.f54239h;
                if (intent == null) {
                    intent = new Intent();
                }
                arrayList.add(new C11537d(intent, i2));
                m67745e(true);
            }
            return 3;
        }
        return 2;
    }
}
