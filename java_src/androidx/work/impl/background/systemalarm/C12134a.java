package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C12137d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: androidx.work.impl.background.systemalarm.a */
/* loaded from: classes.dex */
public class C12134a implements InterfaceC31677Ah1 {

    /* renamed from: f */
    public static final String f56242f = AbstractC32056Bx2.m113270i("CommandHandler");

    /* renamed from: b */
    public final Context f56243b;

    /* renamed from: c */
    public final Map<TC6, C12136c> f56244c = new HashMap();

    /* renamed from: d */
    public final Object f56245d = new Object();

    /* renamed from: e */
    public final C43291jP5 f56246e;

    public C12134a(Context context, C43291jP5 c43291jP5) {
        this.f56243b = context;
        this.f56246e = c43291jP5;
    }

    /* renamed from: a */
    public static Intent m65533a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* renamed from: b */
    public static Intent m65532b(Context context, TC6 tc6) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        return m65518q(intent, tc6);
    }

    /* renamed from: c */
    public static Intent m65531c(Context context, TC6 tc6, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return m65518q(intent, tc6);
    }

    /* renamed from: e */
    public static Intent m65530e(Context context, TC6 tc6) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        return m65518q(intent, tc6);
    }

    /* renamed from: f */
    public static Intent m65529f(Context context, TC6 tc6) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        return m65518q(intent, tc6);
    }

    /* renamed from: m */
    public static boolean m65522m(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    public static TC6 m65519p(Intent intent) {
        return new TC6(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    /* renamed from: q */
    public static Intent m65518q(Intent intent, TC6 tc6) {
        intent.putExtra("KEY_WORKSPEC_ID", tc6.m84208b());
        intent.putExtra("KEY_WORKSPEC_GENERATION", tc6.m84209a());
        return intent;
    }

    @Override // p000.InterfaceC31677Ah1
    /* renamed from: d */
    public void mo34425d(TC6 tc6, boolean z) {
        synchronized (this.f56245d) {
            C12136c remove = this.f56244c.remove(tc6);
            this.f56246e.m30657b(tc6);
            if (remove != null) {
                remove.m65511h(z);
            }
        }
    }

    /* renamed from: g */
    public final void m65528g(Intent intent, int i, C12137d c12137d) {
        AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
        String str = f56242f;
        m113272e.mo113269a(str, "Handling constraints changed " + intent);
        new C12135b(this.f56243b, i, c12137d).m65517a();
    }

    /* renamed from: h */
    public final void m65527h(Intent intent, int i, C12137d c12137d) {
        synchronized (this.f56245d) {
            TC6 m65519p = m65519p(intent);
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            String str = f56242f;
            m113272e.mo113269a(str, "Handing delay met for " + m65519p);
            if (!this.f56244c.containsKey(m65519p)) {
                C12136c c12136c = new C12136c(this.f56243b, i, c12137d, this.f56246e.m30655d(m65519p));
                this.f56244c.put(m65519p, c12136c);
                c12136c.m65512g();
            } else {
                AbstractC32056Bx2 m113272e2 = AbstractC32056Bx2.m113272e();
                m113272e2.mo113269a(str, "WorkSpec " + m65519p + " is is already being handled for ACTION_DELAY_MET");
            }
        }
    }

    /* renamed from: i */
    public final void m65526i(Intent intent, int i) {
        TC6 m65519p = m65519p(intent);
        boolean z = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
        String str = f56242f;
        m113272e.mo113269a(str, "Handling onExecutionCompleted " + intent + ", " + i);
        mo34425d(m65519p, z);
    }

    /* renamed from: j */
    public final void m65525j(Intent intent, int i, C12137d c12137d) {
        AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
        String str = f56242f;
        m113272e.mo113269a(str, "Handling reschedule " + intent + ", " + i);
        c12137d.m65503g().m71752y();
    }

    /* renamed from: k */
    public final void m65524k(Intent intent, int i, C12137d c12137d) {
        TC6 m65519p = m65519p(intent);
        AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
        String str = f56242f;
        m113272e.mo113269a(str, "Handling schedule work for " + m65519p);
        WorkDatabase m71756u = c12137d.m65503g().m71756u();
        m71756u.m108730c();
        try {
            HG6 mo100756l = m71756u.mo65549I().mo100756l(m65519p.m84208b());
            if (mo100756l == null) {
                AbstractC32056Bx2 m113272e2 = AbstractC32056Bx2.m113272e();
                m113272e2.mo113262k(str, "Skipping scheduling " + m65519p + " because it's no longer in the DB");
            } else if (mo100756l.f13192b.m81823b()) {
                AbstractC32056Bx2 m113272e3 = AbstractC32056Bx2.m113272e();
                m113272e3.mo113262k(str, "Skipping scheduling " + m65519p + "because it is finished.");
            } else {
                long m104076c = mo100756l.m104076c();
                if (!mo100756l.m104071h()) {
                    AbstractC32056Bx2 m113272e4 = AbstractC32056Bx2.m113272e();
                    m113272e4.mo113269a(str, "Setting up Alarms for " + m65519p + "at " + m104076c);
                    C25641l9.m27735c(this.f56243b, m71756u, m65519p, m104076c);
                } else {
                    AbstractC32056Bx2 m113272e5 = AbstractC32056Bx2.m113272e();
                    m113272e5.mo113269a(str, "Opportunistically setting an alarm for " + m65519p + "at " + m104076c);
                    C25641l9.m27735c(this.f56243b, m71756u, m65519p, m104076c);
                    c12137d.m65504f().mo25426b().execute(new C12137d.RunnableC12139b(c12137d, m65533a(this.f56243b), i));
                }
                m71756u.m108734A();
            }
        } finally {
            m71756u.m108728g();
        }
    }

    /* renamed from: l */
    public final void m65523l(Intent intent, C12137d c12137d) {
        List<C42698iP5> m30656c;
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        if (extras.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i = extras.getInt("KEY_WORKSPEC_GENERATION");
            m30656c = new ArrayList<>(1);
            C42698iP5 m30657b = this.f56246e.m30657b(new TC6(string, i));
            if (m30657b != null) {
                m30656c.add(m30657b);
            }
        } else {
            m30656c = this.f56246e.m30656c(string);
        }
        for (C42698iP5 c42698iP5 : m30656c) {
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            String str = f56242f;
            m113272e.mo113269a(str, "Handing stopWork work for " + string);
            c12137d.m65503g().m71774D(c42698iP5);
            C25641l9.m27737a(this.f56243b, c12137d.m65503g().m71756u(), c42698iP5.m34016a());
            c12137d.mo34425d(c42698iP5.m34016a(), false);
        }
    }

    /* renamed from: n */
    public boolean m65521n() {
        boolean z;
        synchronized (this.f56245d) {
            if (!this.f56244c.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: o */
    public void m65520o(Intent intent, int i, C12137d c12137d) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m65528g(intent, i, c12137d);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            m65525j(intent, i, c12137d);
        } else if (!m65522m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            String str = f56242f;
            m113272e.mo113267c(str, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
        } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
            m65524k(intent, i, c12137d);
        } else if ("ACTION_DELAY_MET".equals(action)) {
            m65527h(intent, i, c12137d);
        } else if ("ACTION_STOP_WORK".equals(action)) {
            m65523l(intent, c12137d);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            m65526i(intent, i);
        } else {
            AbstractC32056Bx2 m113272e2 = AbstractC32056Bx2.m113272e();
            String str2 = f56242f;
            m113272e2.mo113262k(str2, "Ignoring intent " + intent);
        }
    }
}
