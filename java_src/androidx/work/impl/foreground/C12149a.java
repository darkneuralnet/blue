package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
/* renamed from: androidx.work.impl.foreground.a */
/* loaded from: classes.dex */
public class C12149a implements EC6, InterfaceC31677Ah1 {

    /* renamed from: l */
    public static final String f56303l = AbstractC32056Bx2.m113270i("SystemFgDispatcher");

    /* renamed from: b */
    public Context f56304b;

    /* renamed from: c */
    public C37830aD6 f56305c;

    /* renamed from: d */
    public final InterfaceC45160mZ5 f56306d;

    /* renamed from: e */
    public final Object f56307e = new Object();

    /* renamed from: f */
    public TC6 f56308f;

    /* renamed from: g */
    public final Map<TC6, C37428Yw1> f56309g;

    /* renamed from: h */
    public final Map<TC6, HG6> f56310h;

    /* renamed from: i */
    public final Set<HG6> f56311i;

    /* renamed from: j */
    public final FC6 f56312j;

    /* renamed from: k */
    public InterfaceC12151b f56313k;

    /* renamed from: androidx.work.impl.foreground.a$a */
    /* loaded from: classes.dex */
    public class RunnableC12150a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f56314b;

        public RunnableC12150a(String str) {
            this.f56314b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            HG6 m34421h = C12149a.this.f56305c.m71759r().m34421h(this.f56314b);
            if (m34421h != null && m34421h.m104071h()) {
                synchronized (C12149a.this.f56307e) {
                    C12149a.this.f56310h.put(KG6.m99055a(m34421h), m34421h);
                    C12149a.this.f56311i.add(m34421h);
                    C12149a c12149a = C12149a.this;
                    c12149a.f56312j.mo105647a(c12149a.f56311i);
                }
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.a$b */
    /* loaded from: classes.dex */
    public interface InterfaceC12151b {
        /* renamed from: a */
        void mo65477a(int i, Notification notification);

        /* renamed from: c */
        void mo65476c(int i, int i2, Notification notification);

        /* renamed from: d */
        void mo65475d(int i);

        void stop();
    }

    public C12149a(Context context) {
        this.f56304b = context;
        C37830aD6 m71761p = C37830aD6.m71761p(context);
        this.f56305c = m71761p;
        this.f56306d = m71761p.m71755v();
        this.f56308f = null;
        this.f56309g = new LinkedHashMap();
        this.f56311i = new HashSet();
        this.f56310h = new HashMap();
        this.f56312j = new GC6(this.f56305c.m71757t(), this);
        this.f56305c.m71759r().m34422g(this);
    }

    /* renamed from: c */
    public static Intent m65487c(Context context, TC6 tc6, C37428Yw1 c37428Yw1) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", c37428Yw1.m73971c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c37428Yw1.m73973a());
        intent.putExtra("KEY_NOTIFICATION", c37428Yw1.m73972b());
        intent.putExtra("KEY_WORKSPEC_ID", tc6.m84208b());
        intent.putExtra("KEY_GENERATION", tc6.m84209a());
        return intent;
    }

    /* renamed from: e */
    public static Intent m65486e(Context context, TC6 tc6, C37428Yw1 c37428Yw1) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", tc6.m84208b());
        intent.putExtra("KEY_GENERATION", tc6.m84209a());
        intent.putExtra("KEY_NOTIFICATION_ID", c37428Yw1.m73971c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c37428Yw1.m73973a());
        intent.putExtra("KEY_NOTIFICATION", c37428Yw1.m73972b());
        return intent;
    }

    /* renamed from: g */
    public static Intent m65485g(Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @Override // p000.EC6
    /* renamed from: a */
    public void mo64810a(List<HG6> list) {
        if (!list.isEmpty()) {
            for (HG6 hg6 : list) {
                String str = hg6.f13191a;
                AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
                String str2 = f56303l;
                m113272e.mo113269a(str2, "Constraints unmet for WorkSpec " + str);
                this.f56305c.m71775C(KG6.m99055a(hg6));
            }
        }
    }

    @Override // p000.InterfaceC31677Ah1
    /* renamed from: d */
    public void mo34425d(TC6 tc6, boolean z) {
        boolean z2;
        Map.Entry<TC6, C37428Yw1> entry;
        synchronized (this.f56307e) {
            HG6 remove = this.f56310h.remove(tc6);
            if (remove != null) {
                z2 = this.f56311i.remove(remove);
            } else {
                z2 = false;
            }
            if (z2) {
                this.f56312j.mo105647a(this.f56311i);
            }
        }
        C37428Yw1 remove2 = this.f56309g.remove(tc6);
        if (tc6.equals(this.f56308f) && this.f56309g.size() > 0) {
            Iterator<Map.Entry<TC6, C37428Yw1>> it = this.f56309g.entrySet().iterator();
            Map.Entry<TC6, C37428Yw1> next = it.next();
            while (true) {
                entry = next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.f56308f = entry.getKey();
            if (this.f56313k != null) {
                C37428Yw1 value = entry.getValue();
                this.f56313k.mo65476c(value.m73971c(), value.m73973a(), value.m73972b());
                this.f56313k.mo65475d(value.m73971c());
            }
        }
        InterfaceC12151b interfaceC12151b = this.f56313k;
        if (remove2 != null && interfaceC12151b != null) {
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            String str = f56303l;
            m113272e.mo113269a(str, "Removing Notification (id: " + remove2.m73971c() + ", workSpecId: " + tc6 + ", notificationType: " + remove2.m73973a());
            interfaceC12151b.mo65475d(remove2.m73971c());
        }
    }

    @Override // p000.EC6
    /* renamed from: f */
    public void mo64809f(List<HG6> list) {
    }

    /* renamed from: h */
    public final void m65484h(Intent intent) {
        AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
        String str = f56303l;
        m113272e.mo113265f(str, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
            this.f56305c.m71767j(UUID.fromString(stringExtra));
        }
    }

    /* renamed from: i */
    public final void m65483i(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        TC6 tc6 = new TC6(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
        String str = f56303l;
        m113272e.mo113269a(str, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification != null && this.f56313k != null) {
            this.f56309g.put(tc6, new C37428Yw1(intExtra, notification, intExtra2));
            if (this.f56308f == null) {
                this.f56308f = tc6;
                this.f56313k.mo65476c(intExtra, intExtra2, notification);
                return;
            }
            this.f56313k.mo65477a(intExtra, notification);
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry<TC6, C37428Yw1> entry : this.f56309g.entrySet()) {
                    i |= entry.getValue().m73973a();
                }
                C37428Yw1 c37428Yw1 = this.f56309g.get(this.f56308f);
                if (c37428Yw1 != null) {
                    this.f56313k.mo65476c(c37428Yw1.m73971c(), i, c37428Yw1.m73972b());
                }
            }
        }
    }

    /* renamed from: j */
    public final void m65482j(Intent intent) {
        AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
        String str = f56303l;
        m113272e.mo113265f(str, "Started foreground service " + intent);
        this.f56306d.m25427a(new RunnableC12150a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    /* renamed from: k */
    public void m65481k(Intent intent) {
        AbstractC32056Bx2.m113272e().mo113265f(f56303l, "Stopping foreground service");
        InterfaceC12151b interfaceC12151b = this.f56313k;
        if (interfaceC12151b != null) {
            interfaceC12151b.stop();
        }
    }

    /* renamed from: l */
    public void m65480l() {
        this.f56313k = null;
        synchronized (this.f56307e) {
            this.f56312j.reset();
        }
        this.f56305c.m71759r().m34415n(this);
    }

    /* renamed from: m */
    public void m65479m(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            m65482j(intent);
            m65483i(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            m65483i(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            m65484h(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            m65481k(intent);
        }
    }

    /* renamed from: n */
    public void m65478n(InterfaceC12151b interfaceC12151b) {
        if (this.f56313k != null) {
            AbstractC32056Bx2.m113272e().mo113267c(f56303l, "A callback already exists.");
        } else {
            this.f56313k = interfaceC12151b;
        }
    }
}
