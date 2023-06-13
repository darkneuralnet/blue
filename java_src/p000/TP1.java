package p000;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¨\u0006\r"}, m28432d2 = {"Landroidx/work/impl/WorkDatabase;", "", "key", "", DateTokenConverter.CONVERTER_KEY, "value", "", "e", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LmV5;", "sqLiteDatabase", "c", "work-runtime_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: TP1 */
/* loaded from: classes.dex */
public final class TP1 {
    /* renamed from: c */
    public static final void m83674c(Context context, InterfaceC45124mV5 sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            sqLiteDatabase.mo25485w();
            try {
                sqLiteDatabase.mo25491X1("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                sqLiteDatabase.mo25491X1("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                sharedPreferences.edit().clear().apply();
                sqLiteDatabase.mo25492W1();
            } finally {
                sqLiteDatabase.mo25488d2();
            }
        }
    }

    /* renamed from: d */
    public static final int m83673d(WorkDatabase workDatabase, String str) {
        int i;
        Long mo85287b = workDatabase.mo65553E().mo85287b(str);
        int i2 = 0;
        if (mo85287b != null) {
            i = (int) mo85287b.longValue();
        } else {
            i = 0;
        }
        if (i != Integer.MAX_VALUE) {
            i2 = i + 1;
        }
        m83672e(workDatabase, str, i2);
        return i;
    }

    /* renamed from: e */
    public static final void m83672e(WorkDatabase workDatabase, String str, int i) {
        workDatabase.mo65553E().mo85288a(new QZ3(str, Long.valueOf(i)));
    }
}
