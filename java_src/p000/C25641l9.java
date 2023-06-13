package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C12134a;
/* renamed from: l9 */
/* loaded from: classes.dex */
public class C25641l9 {

    /* renamed from: a */
    public static final String f95638a = AbstractC32056Bx2.m113270i("Alarms");

    /* renamed from: l9$a */
    /* loaded from: classes.dex */
    public static class C25642a {
        private C25642a() {
        }

        /* renamed from: a */
        public static void m27733a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setExact(i, j, pendingIntent);
        }
    }

    private C25641l9() {
    }

    /* renamed from: a */
    public static void m27737a(Context context, WorkDatabase workDatabase, TC6 tc6) {
        XX5 mo65552F = workDatabase.mo65552F();
        WX5 mo74925d = mo65552F.mo74925d(tc6);
        if (mo74925d != null) {
            m27736b(context, tc6, mo74925d.f41254c);
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            String str = f95638a;
            m113272e.mo113269a(str, "Removing SystemIdInfo for workSpecId (" + tc6 + ")");
            mo65552F.mo74928a(tc6);
        }
    }

    /* renamed from: b */
    public static void m27736b(Context context, TC6 tc6, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C12134a.m65532b(context, tc6), 603979776);
        if (service != null && alarmManager != null) {
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            String str = f95638a;
            m113272e.mo113269a(str, "Cancelling existing alarm with (workSpecId, systemId) (" + tc6 + ", " + i + ")");
            alarmManager.cancel(service);
        }
    }

    /* renamed from: c */
    public static void m27735c(Context context, WorkDatabase workDatabase, TC6 tc6, long j) {
        XX5 mo65552F = workDatabase.mo65552F();
        WX5 mo74925d = mo65552F.mo74925d(tc6);
        if (mo74925d != null) {
            m27736b(context, tc6, mo74925d.f41254c);
            m27734d(context, tc6, mo74925d.f41254c, j);
            return;
        }
        int m85498c = new SP1(workDatabase).m85498c();
        mo65552F.mo74924e(ZX5.m72975a(tc6, m85498c));
        m27734d(context, tc6, m85498c, j);
    }

    /* renamed from: d */
    public static void m27734d(Context context, TC6 tc6, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C12134a.m65532b(context, tc6), 201326592);
        if (alarmManager != null) {
            C25642a.m27733a(alarmManager, 0, j, service);
        }
    }
}
