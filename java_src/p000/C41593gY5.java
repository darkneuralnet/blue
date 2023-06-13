package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p000.UC6;
/* renamed from: gY5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C41593gY5 implements InterfaceC51810xm5 {

    /* renamed from: f */
    public static final String f82416f = AbstractC32056Bx2.m113270i("SystemJobScheduler");

    /* renamed from: b */
    public final Context f82417b;

    /* renamed from: c */
    public final JobScheduler f82418c;

    /* renamed from: d */
    public final C37830aD6 f82419d;

    /* renamed from: e */
    public final C41000fY5 f82420e;

    public C41593gY5(Context context, C37830aD6 c37830aD6) {
        this(context, c37830aD6, (JobScheduler) context.getSystemService("jobscheduler"), new C41000fY5(context));
    }

    /* renamed from: a */
    public static void m39176a(Context context) {
        List<JobInfo> m39173g;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (m39173g = m39173g(context, jobScheduler)) != null && !m39173g.isEmpty()) {
            for (JobInfo jobInfo : m39173g) {
                m39175d(jobScheduler, jobInfo.getId());
            }
        }
    }

    /* renamed from: d */
    public static void m39175d(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            AbstractC32056Bx2.m113272e().mo113266d(f82416f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    /* renamed from: f */
    public static List<Integer> m39174f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> m39173g = m39173g(context, jobScheduler);
        if (m39173g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : m39173g) {
            TC6 m39172h = m39172h(jobInfo);
            if (m39172h != null && str.equals(m39172h.m84208b())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static List<JobInfo> m39173g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            AbstractC32056Bx2.m113272e().mo113266d(f82416f, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static TC6 m39172h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return new TC6(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
                }
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: i */
    public static boolean m39171i(Context context, C37830aD6 c37830aD6) {
        int i;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> m39173g = m39173g(context, jobScheduler);
        List<String> mo74926c = c37830aD6.m71756u().mo65552F().mo74926c();
        boolean z = false;
        if (m39173g != null) {
            i = m39173g.size();
        } else {
            i = 0;
        }
        HashSet hashSet = new HashSet(i);
        if (m39173g != null && !m39173g.isEmpty()) {
            for (JobInfo jobInfo : m39173g) {
                TC6 m39172h = m39172h(jobInfo);
                if (m39172h != null) {
                    hashSet.add(m39172h.m84208b());
                } else {
                    m39175d(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = mo74926c.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains(it.next())) {
                    AbstractC32056Bx2.m113272e().mo113269a(f82416f, "Reconciling jobs");
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            WorkDatabase m71756u = c37830aD6.m71756u();
            m71756u.m108730c();
            try {
                IG6 mo65549I = m71756u.mo65549I();
                for (String str : mo74926c) {
                    mo65549I.mo100753o(str, -1L);
                }
                m71756u.m108734A();
            } finally {
                m71756u.m108728g();
            }
        }
        return z;
    }

    @Override // p000.InterfaceC51810xm5
    /* renamed from: b */
    public void mo4716b(HG6... hg6Arr) {
        int m85496e;
        WorkDatabase m71756u = this.f82419d.m71756u();
        SP1 sp1 = new SP1(m71756u);
        for (HG6 hg6 : hg6Arr) {
            m71756u.m108730c();
            try {
                HG6 mo100756l = m71756u.mo65549I().mo100756l(hg6.f13191a);
                if (mo100756l == null) {
                    AbstractC32056Bx2.m113272e().mo113262k(f82416f, "Skipping scheduling " + hg6.f13191a + " because it's no longer in the DB");
                    m71756u.m108734A();
                } else if (mo100756l.f13192b != UC6.EnumC8214a.ENQUEUED) {
                    AbstractC32056Bx2.m113272e().mo113262k(f82416f, "Skipping scheduling " + hg6.f13191a + " because it is no longer enqueued");
                    m71756u.m108734A();
                } else {
                    TC6 m99055a = KG6.m99055a(hg6);
                    WX5 mo74925d = m71756u.mo65552F().mo74925d(m99055a);
                    if (mo74925d != null) {
                        m85496e = mo74925d.f41254c;
                    } else {
                        m85496e = sp1.m85496e(this.f82419d.m71763n().m65601i(), this.f82419d.m71763n().m65603g());
                    }
                    if (mo74925d == null) {
                        this.f82419d.m71756u().mo65552F().mo74924e(ZX5.m72975a(m99055a, m85496e));
                    }
                    m39170j(hg6, m85496e);
                    m71756u.m108734A();
                }
            } finally {
                m71756u.m108728g();
            }
        }
    }

    @Override // p000.InterfaceC51810xm5
    /* renamed from: c */
    public boolean mo4715c() {
        return true;
    }

    @Override // p000.InterfaceC51810xm5
    /* renamed from: e */
    public void mo4714e(String str) {
        List<Integer> m39174f = m39174f(this.f82417b, this.f82418c, str);
        if (m39174f != null && !m39174f.isEmpty()) {
            for (Integer num : m39174f) {
                m39175d(this.f82418c, num.intValue());
            }
            this.f82419d.m71756u().mo65552F().mo74922g(str);
        }
    }

    /* renamed from: j */
    public void m39170j(HG6 hg6, int i) {
        int i2;
        JobInfo m41202a = this.f82420e.m41202a(hg6, i);
        AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
        String str = f82416f;
        m113272e.mo113269a(str, "Scheduling work ID " + hg6.f13191a + "Job ID " + i);
        try {
            if (this.f82418c.schedule(m41202a) == 0) {
                AbstractC32056Bx2.m113272e().mo113262k(str, "Unable to schedule work ID " + hg6.f13191a);
                if (hg6.f13207q && hg6.f13208r == EnumC37214Xy3.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    hg6.f13207q = false;
                    AbstractC32056Bx2.m113272e().mo113269a(str, String.format("Scheduling a non-expedited job (work ID %s)", hg6.f13191a));
                    m39170j(hg6, i);
                }
            }
        } catch (IllegalStateException e) {
            List<JobInfo> m39173g = m39173g(this.f82417b, this.f82418c);
            if (m39173g != null) {
                i2 = m39173g.size();
            } else {
                i2 = 0;
            }
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(i2), Integer.valueOf(this.f82419d.m71756u().mo65549I().mo100757k().size()), Integer.valueOf(this.f82419d.m71763n().m65602h()));
            AbstractC32056Bx2.m113272e().mo113267c(f82416f, format);
            IllegalStateException illegalStateException = new IllegalStateException(format, e);
            InterfaceC48378rz0<Throwable> m65598l = this.f82419d.m71763n().m65598l();
            if (m65598l != null) {
                m65598l.accept(illegalStateException);
                return;
            }
            throw illegalStateException;
        } catch (Throwable th) {
            AbstractC32056Bx2.m113272e().mo113266d(f82416f, "Unable to schedule " + hg6, th);
        }
    }

    public C41593gY5(Context context, C37830aD6 c37830aD6, JobScheduler jobScheduler, C41000fY5 c41000fY5) {
        this.f82417b = context;
        this.f82419d = c37830aD6;
        this.f82418c = jobScheduler;
        this.f82420e = c41000fY5;
    }
}
