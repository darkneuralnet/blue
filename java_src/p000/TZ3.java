package p000;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
/* renamed from: TZ3 */
/* loaded from: classes.dex */
public class TZ3 {

    /* renamed from: a */
    public final WorkDatabase f35690a;

    public TZ3(WorkDatabase workDatabase) {
        this.f35690a = workDatabase;
    }

    /* renamed from: c */
    public static void m83390c(Context context, InterfaceC45124mV5 interfaceC45124mV5) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = 0;
            long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                j = 1;
            }
            interfaceC45124mV5.mo25485w();
            try {
                interfaceC45124mV5.mo25491X1("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                interfaceC45124mV5.mo25491X1("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j)});
                sharedPreferences.edit().clear().apply();
                interfaceC45124mV5.mo25492W1();
            } finally {
                interfaceC45124mV5.mo25488d2();
            }
        }
    }

    /* renamed from: a */
    public long m83392a() {
        Long mo85287b = this.f35690a.mo65553E().mo85287b("last_force_stop_ms");
        if (mo85287b != null) {
            return mo85287b.longValue();
        }
        return 0L;
    }

    /* renamed from: b */
    public boolean m83391b() {
        Long mo85287b = this.f35690a.mo65553E().mo85287b("reschedule_needed");
        if (mo85287b != null && mo85287b.longValue() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void m83389d(long j) {
        this.f35690a.mo65553E().mo85288a(new QZ3("last_force_stop_ms", Long.valueOf(j)));
    }

    /* renamed from: e */
    public void m83388e(boolean z) {
        this.f35690a.mo65553E().mo85288a(new QZ3("reschedule_needed", z));
    }
}
