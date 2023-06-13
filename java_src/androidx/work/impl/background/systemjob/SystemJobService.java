package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC31677Ah1 {

    /* renamed from: e */
    public static final String f56281e = AbstractC32056Bx2.m113270i("SystemJobService");

    /* renamed from: b */
    public C37830aD6 f56282b;

    /* renamed from: c */
    public final Map<TC6, JobParameters> f56283c = new HashMap();

    /* renamed from: d */
    public final C43291jP5 f56284d = new C43291jP5();

    /* renamed from: androidx.work.impl.background.systemjob.SystemJobService$a */
    /* loaded from: classes.dex */
    public static class C12142a {
        private C12142a() {
        }

        /* renamed from: a */
        public static String[] m65495a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        /* renamed from: b */
        public static Uri[] m65494b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    /* renamed from: androidx.work.impl.background.systemjob.SystemJobService$b */
    /* loaded from: classes.dex */
    public static class C12143b {
        private C12143b() {
        }

        /* renamed from: a */
        public static Network m65493a(JobParameters jobParameters) {
            Network network;
            network = jobParameters.getNetwork();
            return network;
        }
    }

    /* renamed from: a */
    public static TC6 m65496a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return new TC6(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // p000.InterfaceC31677Ah1
    /* renamed from: d */
    public void mo34425d(TC6 tc6, boolean z) {
        JobParameters remove;
        AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
        String str = f56281e;
        m113272e.mo113269a(str, tc6.m84208b() + " executed on JobScheduler");
        synchronized (this.f56283c) {
            remove = this.f56283c.remove(tc6);
        }
        this.f56284d.m30657b(tc6);
        if (remove != null) {
            jobFinished(remove, z);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            C37830aD6 m71761p = C37830aD6.m71761p(getApplicationContext());
            this.f56282b = m71761p;
            m71761p.m71759r().m34422g(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                AbstractC32056Bx2.m113272e().mo113262k(f56281e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        C37830aD6 c37830aD6 = this.f56282b;
        if (c37830aD6 != null) {
            c37830aD6.m71759r().m34415n(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f56282b == null) {
            AbstractC32056Bx2.m113272e().mo113269a(f56281e, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        TC6 m65496a = m65496a(jobParameters);
        if (m65496a == null) {
            AbstractC32056Bx2.m113272e().mo113267c(f56281e, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f56283c) {
            if (this.f56283c.containsKey(m65496a)) {
                AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
                String str = f56281e;
                m113272e.mo113269a(str, "Job is already being executed by SystemJobService: " + m65496a);
                return false;
            }
            AbstractC32056Bx2 m113272e2 = AbstractC32056Bx2.m113272e();
            String str2 = f56281e;
            m113272e2.mo113269a(str2, "onStartJob for " + m65496a);
            this.f56283c.put(m65496a, jobParameters);
            int i = Build.VERSION.SDK_INT;
            WorkerParameters.C12119a c12119a = new WorkerParameters.C12119a();
            if (C12142a.m65494b(jobParameters) != null) {
                c12119a.f56183b = Arrays.asList(C12142a.m65494b(jobParameters));
            }
            if (C12142a.m65495a(jobParameters) != null) {
                c12119a.f56182a = Arrays.asList(C12142a.m65495a(jobParameters));
            }
            if (i >= 28) {
                c12119a.f56184c = C12143b.m65493a(jobParameters);
            }
            this.f56282b.m71776B(this.f56284d.m30655d(m65496a), c12119a);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f56282b == null) {
            AbstractC32056Bx2.m113272e().mo113269a(f56281e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        TC6 m65496a = m65496a(jobParameters);
        if (m65496a == null) {
            AbstractC32056Bx2.m113272e().mo113267c(f56281e, "WorkSpec id not found!");
            return false;
        }
        AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
        String str = f56281e;
        m113272e.mo113269a(str, "onStopJob for " + m65496a);
        synchronized (this.f56283c) {
            this.f56283c.remove(m65496a);
        }
        C42698iP5 m30657b = this.f56284d.m30657b(m65496a);
        if (m30657b != null) {
            this.f56282b.m71774D(m30657b);
        }
        return !this.f56282b.m71759r().m34419j(m65496a.m84208b());
    }
}
