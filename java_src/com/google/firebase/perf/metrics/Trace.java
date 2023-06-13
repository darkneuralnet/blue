package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes6.dex */
public class Trace extends AbstractC27053ol implements Parcelable, InterfaceC43007iv5 {

    /* renamed from: b */
    public final WeakReference<InterfaceC43007iv5> f74387b;

    /* renamed from: c */
    public final Trace f74388c;

    /* renamed from: d */
    public final GaugeManager f74389d;

    /* renamed from: e */
    public final String f74390e;

    /* renamed from: f */
    public final Map<String, Counter> f74391f;

    /* renamed from: g */
    public final Map<String, String> f74392g;

    /* renamed from: h */
    public final List<PerfSession> f74393h;

    /* renamed from: i */
    public final List<Trace> f74394i;

    /* renamed from: j */
    public final C41612ga6 f74395j;

    /* renamed from: k */
    public final C38141al0 f74396k;

    /* renamed from: l */
    public Timer f74397l;

    /* renamed from: m */
    public Timer f74398m;

    /* renamed from: n */
    public static final C10776ad f74384n = C10776ad.m71007e();

    /* renamed from: o */
    public static final Map<String, Trace> f74385o = new ConcurrentHashMap();
    @Keep
    public static final Parcelable.Creator<Trace> CREATOR = new C18370a();
    @VisibleForTesting

    /* renamed from: p */
    public static final Parcelable.Creator<Trace> f74386p = new C18371b();

    /* renamed from: com.google.firebase.perf.metrics.Trace$a */
    /* loaded from: classes6.dex */
    public class C18370a implements Parcelable.Creator<Trace> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, false, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Trace[] newArray(int i) {
            return new Trace[i];
        }
    }

    /* renamed from: com.google.firebase.perf.metrics.Trace$b */
    /* loaded from: classes6.dex */
    public class C18371b implements Parcelable.Creator<Trace> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, true, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Trace[] newArray(int i) {
            return new Trace[i];
        }
    }

    public /* synthetic */ Trace(Parcel parcel, boolean z, C18370a c18370a) {
        this(parcel, z);
    }

    /* renamed from: c */
    public static Trace m47083c(String str) {
        return new Trace(str);
    }

    @Override // p000.InterfaceC43007iv5
    /* renamed from: a */
    public void mo31643a(PerfSession perfSession) {
        if (perfSession == null) {
            f74384n.m71002j("Unable to add new SessionId to the Trace. Continuing without it.");
        } else if (m47076k() && !m47074m()) {
            this.f74393h.add(perfSession);
        }
    }

    /* renamed from: b */
    public final void m47084b(String str, String str2) {
        if (!m47074m()) {
            if (!this.f74392g.containsKey(str) && this.f74392g.size() >= 5) {
                throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
            }
            AbstractC45077mQ3.m25654d(str, str2);
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", this.f74390e));
    }

    @VisibleForTesting
    /* renamed from: d */
    public Map<String, Counter> m47082d() {
        return this.f74391f;
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    @VisibleForTesting
    /* renamed from: e */
    public Timer m47081e() {
        return this.f74398m;
    }

    public void finalize() throws Throwable {
        try {
            if (m47075l()) {
                f74384n.m71001k("Trace '%s' is started but not stopped when it is destructed!", this.f74390e);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    @VisibleForTesting
    /* renamed from: g */
    public String m47080g() {
        return this.f74390e;
    }

    @Keep
    public String getAttribute(String str) {
        return this.f74392g.get(str);
    }

    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f74392g);
    }

    @Keep
    public long getLongMetric(String str) {
        Counter counter;
        if (str != null) {
            counter = this.f74391f.get(str.trim());
        } else {
            counter = null;
        }
        if (counter == null) {
            return 0L;
        }
        return counter.m47090a();
    }

    @VisibleForTesting
    /* renamed from: h */
    public List<PerfSession> m47079h() {
        List<PerfSession> unmodifiableList;
        synchronized (this.f74393h) {
            ArrayList arrayList = new ArrayList();
            for (PerfSession perfSession : this.f74393h) {
                if (perfSession != null) {
                    arrayList.add(perfSession);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    @VisibleForTesting
    /* renamed from: i */
    public Timer m47078i() {
        return this.f74397l;
    }

    @Keep
    public void incrementMetric(String str, long j) {
        String m25653e = AbstractC45077mQ3.m25653e(str);
        if (m25653e != null) {
            f74384n.m71008d("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, m25653e);
        } else if (!m47076k()) {
            f74384n.m71001k("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.f74390e);
        } else if (m47074m()) {
            f74384n.m71001k("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.f74390e);
        } else {
            Counter m47073n = m47073n(str.trim());
            m47073n.m47088c(j);
            f74384n.m71010b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(m47073n.m47090a()), this.f74390e);
        }
    }

    @VisibleForTesting
    /* renamed from: j */
    public List<Trace> m47077j() {
        return this.f74394i;
    }

    @VisibleForTesting
    /* renamed from: k */
    public boolean m47076k() {
        return this.f74397l != null;
    }

    @VisibleForTesting
    /* renamed from: l */
    public boolean m47075l() {
        return m47076k() && !m47074m();
    }

    @VisibleForTesting
    /* renamed from: m */
    public boolean m47074m() {
        return this.f74398m != null;
    }

    /* renamed from: n */
    public final Counter m47073n(String str) {
        Counter counter = this.f74391f.get(str);
        if (counter == null) {
            Counter counter2 = new Counter(str);
            this.f74391f.put(str, counter2);
            return counter2;
        }
        return counter;
    }

    /* renamed from: o */
    public final void m47072o(Timer timer) {
        if (this.f74394i.isEmpty()) {
            return;
        }
        Trace trace = this.f74394i.get(this.f74394i.size() - 1);
        if (trace.f74398m == null) {
            trace.f74398m = timer;
        }
    }

    @Keep
    public void putAttribute(String str, String str2) {
        boolean z = false;
        try {
            str = str.trim();
            str2 = str2.trim();
            m47084b(str, str2);
            f74384n.m71010b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f74390e);
            z = true;
        } catch (Exception e) {
            f74384n.m71008d("Can not set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
        }
        if (z) {
            this.f74392g.put(str, str2);
        }
    }

    @Keep
    public void putMetric(String str, long j) {
        String m25653e = AbstractC45077mQ3.m25653e(str);
        if (m25653e != null) {
            f74384n.m71008d("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, m25653e);
        } else if (!m47076k()) {
            f74384n.m71001k("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.f74390e);
        } else if (m47074m()) {
            f74384n.m71001k("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.f74390e);
        } else {
            m47073n(str.trim()).m47087d(j);
            f74384n.m71010b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j), this.f74390e);
        }
    }

    @Keep
    public void removeAttribute(String str) {
        if (m47074m()) {
            f74384n.m71009c("Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.f74392g.remove(str);
        }
    }

    @Keep
    public void start() {
        if (!C32036Bv0.m113351g().m113363K()) {
            f74384n.m71011a("Trace feature is disabled.");
            return;
        }
        String m25652f = AbstractC45077mQ3.m25652f(this.f74390e);
        if (m25652f != null) {
            f74384n.m71008d("Cannot start trace '%s'. Trace name is invalid.(%s)", this.f74390e, m25652f);
        } else if (this.f74397l != null) {
            f74384n.m71008d("Trace '%s' has already started, should not start again!", this.f74390e);
        } else {
            this.f74397l = this.f74396k.m70796a();
            registerForAppState();
            PerfSession perfSession = SessionManager.getInstance().perfSession();
            SessionManager.getInstance().registerForSessionUpdates(this.f74387b);
            mo31643a(perfSession);
            if (perfSession.m47050g()) {
                this.f74389d.collectGaugeMetricOnce(perfSession.m47052d());
            }
        }
    }

    @Keep
    public void stop() {
        if (!m47076k()) {
            f74384n.m71008d("Trace '%s' has not been started so unable to stop!", this.f74390e);
        } else if (m47074m()) {
            f74384n.m71008d("Trace '%s' has already stopped, should not stop again!", this.f74390e);
        } else {
            SessionManager.getInstance().unregisterForSessionUpdates(this.f74387b);
            unregisterForAppState();
            Timer m70796a = this.f74396k.m70796a();
            this.f74398m = m70796a;
            if (this.f74388c == null) {
                m47072o(m70796a);
                if (!this.f74390e.isEmpty()) {
                    this.f74395j.m39144C(new C41931h66(this).m36847a(), getAppState());
                    if (SessionManager.getInstance().perfSession().m47050g()) {
                        this.f74389d.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().m47052d());
                        return;
                    }
                    return;
                }
                f74384n.m71009c("Trace name is empty, no log is sent to server");
            }
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f74388c, 0);
        parcel.writeString(this.f74390e);
        parcel.writeList(this.f74394i);
        parcel.writeMap(this.f74391f);
        parcel.writeParcelable(this.f74397l, 0);
        parcel.writeParcelable(this.f74398m, 0);
        synchronized (this.f74393h) {
            parcel.writeList(this.f74393h);
        }
    }

    public Trace(String str) {
        this(str, C41612ga6.m39128k(), new C38141al0(), C26577nl.m23239b(), GaugeManager.getInstance());
    }

    public Trace(String str, C41612ga6 c41612ga6, C38141al0 c38141al0, C26577nl c26577nl) {
        this(str, c41612ga6, c38141al0, c26577nl, GaugeManager.getInstance());
    }

    public Trace(String str, C41612ga6 c41612ga6, C38141al0 c38141al0, C26577nl c26577nl, GaugeManager gaugeManager) {
        super(c26577nl);
        this.f74387b = new WeakReference<>(this);
        this.f74388c = null;
        this.f74390e = str.trim();
        this.f74394i = new ArrayList();
        this.f74391f = new ConcurrentHashMap();
        this.f74392g = new ConcurrentHashMap();
        this.f74396k = c38141al0;
        this.f74395j = c41612ga6;
        this.f74393h = Collections.synchronizedList(new ArrayList());
        this.f74389d = gaugeManager;
    }

    public Trace(Parcel parcel, boolean z) {
        super(z ? null : C26577nl.m23239b());
        this.f74387b = new WeakReference<>(this);
        this.f74388c = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f74390e = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f74394i = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f74391f = concurrentHashMap;
        this.f74392g = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, Counter.class.getClassLoader());
        this.f74397l = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        this.f74398m = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        List<PerfSession> synchronizedList = Collections.synchronizedList(new ArrayList());
        this.f74393h = synchronizedList;
        parcel.readList(synchronizedList, PerfSession.class.getClassLoader());
        if (z) {
            this.f74395j = null;
            this.f74396k = null;
            this.f74389d = null;
            return;
        }
        this.f74395j = C41612ga6.m39128k();
        this.f74396k = new C38141al0();
        this.f74389d = GaugeManager.getInstance();
    }
}
