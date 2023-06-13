package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.amazonaws.services.p026s3.internal.Constants;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
/* renamed from: Ch2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C32146Ch2 implements FG6 {

    /* renamed from: a */
    public final Context f4484a;

    /* renamed from: b */
    public final InterfaceC35412Qg1 f4485b;

    /* renamed from: c */
    public final AbstractC52403ym5 f4486c;

    public C32146Ch2(Context context, InterfaceC35412Qg1 interfaceC35412Qg1, AbstractC52403ym5 abstractC52403ym5) {
        this.f4484a = context;
        this.f4485b = interfaceC35412Qg1;
        this.f4486c = abstractC52403ym5;
    }

    @Override // p000.FG6
    /* renamed from: a */
    public void mo107365a(T96 t96, int i) {
        mo107364b(t96, i, false);
    }

    @Override // p000.FG6
    /* renamed from: b */
    public void mo107364b(T96 t96, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.f4484a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f4484a.getSystemService("jobscheduler");
        int m111875c = m111875c(t96);
        if (!z && m111874d(jobScheduler, m111875c, i)) {
            C35800Rx2.m86172b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", t96);
            return;
        }
        long mo72754O0 = this.f4485b.mo72754O0(t96);
        JobInfo.Builder m2621c = this.f4486c.m2621c(new JobInfo.Builder(m111875c, componentName), t96.mo16802d(), mo72754O0, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", t96.mo16804b());
        persistableBundle.putInt("priority", R24.m87395a(t96.mo16802d()));
        if (t96.mo16803c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(t96.mo16803c(), 0));
        }
        m2621c.setExtras(persistableBundle);
        C35800Rx2.m86171c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", t96, Integer.valueOf(m111875c), Long.valueOf(this.f4486c.m2617g(t96.mo16802d(), mo72754O0, i)), Long.valueOf(mo72754O0), Integer.valueOf(i));
        jobScheduler.schedule(m2621c.build());
    }

    /* renamed from: c */
    public int m111875c(T96 t96) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f4484a.getPackageName().getBytes(Charset.forName(Constants.DEFAULT_ENCODING)));
        adler32.update(t96.mo16804b().getBytes(Charset.forName(Constants.DEFAULT_ENCODING)));
        adler32.update(ByteBuffer.allocate(4).putInt(R24.m87395a(t96.mo16802d())).array());
        if (t96.mo16803c() != null) {
            adler32.update(t96.mo16803c());
        }
        return (int) adler32.getValue();
    }

    /* renamed from: d */
    public final boolean m111874d(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i3 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i) {
                if (i3 < i2) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
