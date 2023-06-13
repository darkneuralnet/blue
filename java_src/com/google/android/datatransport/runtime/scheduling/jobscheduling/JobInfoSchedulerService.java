package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import p000.T96;
/* loaded from: classes5.dex */
public class JobInfoSchedulerService extends JobService {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m51926b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C42798ia6.m33786f(getApplicationContext());
        T96.AbstractC7673a mo16798d = T96.m84269a().mo16800b(string).mo16798d(R24.m87394b(i));
        if (string2 != null) {
            mo16798d.mo16799c(Base64.decode(string2, 0));
        }
        C42798ia6.m33789c().m33787e().m2987v(mo16798d.mo16801a(), i2, new Runnable() { // from class: Dh2
            @Override // java.lang.Runnable
            public final void run() {
                JobInfoSchedulerService.this.m51926b(jobParameters);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
