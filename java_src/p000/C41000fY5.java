package p000;

import android.annotation.SuppressLint;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import p000.C44821lz0;
@SuppressLint({"ClassVerificationFailure"})
/* renamed from: fY5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C41000fY5 {

    /* renamed from: b */
    public static final String f80314b = AbstractC32056Bx2.m113270i("SystemJobInfoConverter");

    /* renamed from: a */
    public final ComponentName f80315a;

    /* renamed from: fY5$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C20465a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f80316a;

        static {
            int[] iArr = new int[S73.values().length];
            f80316a = iArr;
            try {
                iArr[S73.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f80316a[S73.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f80316a[S73.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f80316a[S73.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f80316a[S73.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C41000fY5(Context context) {
        this.f80315a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    /* renamed from: b */
    public static JobInfo.TriggerContentUri m41201b(C44821lz0.C25843c c25843c) {
        return new JobInfo.TriggerContentUri(c25843c.m26572a(), c25843c.m26571b() ? 1 : 0);
    }

    /* renamed from: c */
    public static int m41200c(S73 s73) {
        int i = C20465a.f80316a[s73.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 3) {
                return 2;
            }
            if (i == 4) {
                return 3;
            }
            if (i == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            String str = f80314b;
            m113272e.mo113269a(str, "API version too low. Cannot convert network type value " + s73);
            return 1;
        }
        return 0;
    }

    /* renamed from: d */
    public static void m41199d(JobInfo.Builder builder, S73 s73) {
        if (Build.VERSION.SDK_INT >= 30 && s73 == S73.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        } else {
            builder.setRequiredNetworkType(m41200c(s73));
        }
    }

    /* renamed from: a */
    public JobInfo m41202a(HG6 hg6, int i) {
        boolean z;
        int i2;
        C44821lz0 c44821lz0 = hg6.f13200j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", hg6.f13191a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", hg6.m104073f());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", hg6.m104069j());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.f80315a).setRequiresCharging(c44821lz0.m26577g()).setRequiresDeviceIdle(c44821lz0.m26576h()).setExtras(persistableBundle);
        m41199d(extras, c44821lz0.m26580d());
        boolean z2 = false;
        if (!c44821lz0.m26576h()) {
            if (hg6.f13202l == EnumC22516gw.LINEAR) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            extras.setBackoffCriteria(hg6.f13203m, i2);
        }
        long max = Math.max(hg6.m104076c() - System.currentTimeMillis(), 0L);
        if (Build.VERSION.SDK_INT <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!hg6.f13207q) {
            extras.setImportantWhileForeground(true);
        }
        if (c44821lz0.m26579e()) {
            for (C44821lz0.C25843c c25843c : c44821lz0.m26581c()) {
                extras.addTriggerContentUri(m41201b(c25843c));
            }
            extras.setTriggerContentUpdateDelay(c44821lz0.m26582b());
            extras.setTriggerContentMaxDelay(c44821lz0.m26583a());
        }
        extras.setPersisted(false);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            extras.setRequiresBatteryNotLow(c44821lz0.m26578f());
            extras.setRequiresStorageNotLow(c44821lz0.m26575i());
        }
        if (hg6.f13201k > 0) {
            z = true;
        } else {
            z = false;
        }
        if (max > 0) {
            z2 = true;
        }
        if (i3 >= 31 && hg6.f13207q && !z && !z2) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
