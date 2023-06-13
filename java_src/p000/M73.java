package p000;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p000.L73;
/* renamed from: M73 */
/* loaded from: classes6.dex */
public final class M73 extends AbstractC27053ol implements InterfaceC43007iv5 {

    /* renamed from: j */
    public static final C10776ad f22650j = C10776ad.m71007e();

    /* renamed from: b */
    public final List<PerfSession> f22651b;

    /* renamed from: c */
    public final GaugeManager f22652c;

    /* renamed from: d */
    public final C41612ga6 f22653d;

    /* renamed from: e */
    public final L73.C4739b f22654e;

    /* renamed from: f */
    public final WeakReference<InterfaceC43007iv5> f22655f;

    /* renamed from: g */
    public String f22656g;

    /* renamed from: h */
    public boolean f22657h;

    /* renamed from: i */
    public boolean f22658i;

    public M73(C41612ga6 c41612ga6) {
        this(c41612ga6, C26577nl.m23239b(), GaugeManager.getInstance());
    }

    /* renamed from: c */
    public static M73 m95789c(C41612ga6 c41612ga6) {
        return new M73(c41612ga6);
    }

    /* renamed from: j */
    public static boolean m95783j(String str) {
        if (str.length() > 128) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt > 127) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.InterfaceC43007iv5
    /* renamed from: a */
    public void mo31643a(PerfSession perfSession) {
        if (perfSession == null) {
            f22650j.m71002j("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else if (m95785h() && !m95784i()) {
            this.f22651b.add(perfSession);
        }
    }

    /* renamed from: b */
    public L73 m95790b() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.f22655f);
        unregisterForAppState();
        C45670nQ3[] m47054b = PerfSession.m47054b(m95788d());
        if (m47054b != null) {
            this.f22654e.m97705M(Arrays.asList(m47054b));
        }
        L73 build = this.f22654e.build();
        if (!N73.m94351c(this.f22656g)) {
            f22650j.m71011a("Dropping network request from a 'User-Agent' that is not allowed");
            return build;
        } else if (!this.f22657h) {
            this.f22653d.m39145B(build, getAppState());
            this.f22657h = true;
            return build;
        } else {
            if (this.f22658i) {
                f22650j.m71011a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
            }
            return build;
        }
    }

    /* renamed from: d */
    public List<PerfSession> m95788d() {
        List<PerfSession> unmodifiableList;
        synchronized (this.f22651b) {
            ArrayList arrayList = new ArrayList();
            for (PerfSession perfSession : this.f22651b) {
                if (perfSession != null) {
                    arrayList.add(perfSession);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    /* renamed from: e */
    public long m95787e() {
        return this.f22654e.m97703O();
    }

    /* renamed from: g */
    public boolean m95786g() {
        return this.f22654e.m97701Q();
    }

    /* renamed from: h */
    public final boolean m95785h() {
        return this.f22654e.m97702P();
    }

    /* renamed from: i */
    public final boolean m95784i() {
        return this.f22654e.m97700S();
    }

    /* renamed from: k */
    public M73 m95782k(String str) {
        L73.EnumC4741d enumC4741d;
        if (str != null) {
            L73.EnumC4741d enumC4741d2 = L73.EnumC4741d.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            upperCase.hashCode();
            char c = 65535;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        c = 0;
                        break;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        c = 1;
                        break;
                    }
                    break;
                case 79599:
                    if (upperCase.equals("PUT")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals("HEAD")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        c = 4;
                        break;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        c = 5;
                        break;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals("TRACE")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals("CONNECT")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        c = '\b';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    enumC4741d = L73.EnumC4741d.OPTIONS;
                    break;
                case 1:
                    enumC4741d = L73.EnumC4741d.GET;
                    break;
                case 2:
                    enumC4741d = L73.EnumC4741d.PUT;
                    break;
                case 3:
                    enumC4741d = L73.EnumC4741d.HEAD;
                    break;
                case 4:
                    enumC4741d = L73.EnumC4741d.POST;
                    break;
                case 5:
                    enumC4741d = L73.EnumC4741d.PATCH;
                    break;
                case 6:
                    enumC4741d = L73.EnumC4741d.TRACE;
                    break;
                case 7:
                    enumC4741d = L73.EnumC4741d.CONNECT;
                    break;
                case '\b':
                    enumC4741d = L73.EnumC4741d.DELETE;
                    break;
                default:
                    enumC4741d = L73.EnumC4741d.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.f22654e.m97698V(enumC4741d);
        }
        return this;
    }

    /* renamed from: l */
    public M73 m95781l(int i) {
        this.f22654e.m97697W(i);
        return this;
    }

    /* renamed from: m */
    public M73 m95780m() {
        this.f22654e.m97696X(L73.EnumC4744e.GENERIC_CLIENT_ERROR);
        return this;
    }

    /* renamed from: n */
    public M73 m95779n(long j) {
        this.f22654e.m97695Y(j);
        return this;
    }

    /* renamed from: o */
    public M73 m95778o(long j) {
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f22655f);
        this.f22654e.m97699U(j);
        mo31643a(perfSession);
        if (perfSession.m47050g()) {
            this.f22652c.collectGaugeMetricOnce(perfSession.m47052d());
        }
        return this;
    }

    /* renamed from: p */
    public M73 m95777p(String str) {
        if (str == null) {
            this.f22654e.m97704N();
            return this;
        }
        if (m95783j(str)) {
            this.f22654e.m97694Z(str);
        } else {
            C10776ad c10776ad = f22650j;
            c10776ad.m71002j("The content type of the response is not a valid content-type:" + str);
        }
        return this;
    }

    /* renamed from: q */
    public M73 m95776q(long j) {
        this.f22654e.m97693a0(j);
        return this;
    }

    /* renamed from: r */
    public M73 m95775r(long j) {
        this.f22654e.m97692b0(j);
        return this;
    }

    /* renamed from: s */
    public M73 m95774s(long j) {
        this.f22654e.m97691c0(j);
        if (SessionManager.getInstance().perfSession().m47050g()) {
            this.f22652c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().m47052d());
        }
        return this;
    }

    /* renamed from: t */
    public M73 m95773t(long j) {
        this.f22654e.m97690d0(j);
        return this;
    }

    /* renamed from: u */
    public M73 m95772u(String str) {
        if (str != null) {
            this.f22654e.m97689e0(C35435Qi6.m88154e(C35435Qi6.m88155d(str), CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE));
        }
        return this;
    }

    /* renamed from: v */
    public M73 m95771v(String str) {
        this.f22656g = str;
        return this;
    }

    public M73(C41612ga6 c41612ga6, C26577nl c26577nl, GaugeManager gaugeManager) {
        super(c26577nl);
        this.f22654e = L73.m97749F0();
        this.f22655f = new WeakReference<>(this);
        this.f22653d = c41612ga6;
        this.f22652c = gaugeManager;
        this.f22651b = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }
}
