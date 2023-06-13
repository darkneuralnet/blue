package p000;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: dO6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39726dO6 extends KN6 {

    /* renamed from: l */
    public static C39726dO6 f76553l;

    /* renamed from: c */
    public String f76554c = "";

    /* renamed from: d */
    public JSONObject f76555d;

    /* renamed from: e */
    public C44460lN6 f76556e;

    /* renamed from: f */
    public JSONArray f76557f;

    /* renamed from: g */
    public Handler f76558g;

    /* renamed from: h */
    public VF2 f76559h;

    /* renamed from: i */
    public AO6 f76560i;

    /* renamed from: j */
    public AO6 f76561j;

    /* renamed from: k */
    public AO6 f76562k;

    /* renamed from: dO6$a */
    /* loaded from: classes8.dex */
    public class RunnableC19747a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ JSONObject f76563b;

        public RunnableC19747a(JSONObject jSONObject) {
            this.f76563b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C39726dO6.this.f76560i != null && this.f76563b.optBoolean(EnumC41486gM6.AC.toString(), false)) {
                C39726dO6.this.f76557f.put(C39726dO6.this.f76560i.m115834d());
            }
            if (C39726dO6.this.f76561j != null && this.f76563b.optBoolean(EnumC41486gM6.GY.toString(), false)) {
                C39726dO6.this.f76557f.put(C39726dO6.this.f76561j.m115834d());
            }
            if (C39726dO6.this.f76562k != null && this.f76563b.optBoolean(EnumC41486gM6.MG.toString(), false)) {
                C39726dO6.this.f76557f.put(C39726dO6.this.f76562k.m115834d());
            }
            C39726dO6.this.m44312x();
        }
    }

    /* renamed from: u */
    public static synchronized C39726dO6 m44315u() {
        C39726dO6 c39726dO6;
        synchronized (C39726dO6.class) {
            if (f76553l == null) {
                f76553l = new C39726dO6();
            }
            c39726dO6 = f76553l;
        }
        return c39726dO6;
    }

    @Override // p000.KN6
    /* renamed from: d */
    public JSONObject mo8750d() {
        return null;
    }

    /* renamed from: r */
    public JSONObject m44318r(VF2 vf2, String str, JSONObject jSONObject) {
        this.f76554c = str;
        this.f76555d = jSONObject;
        m44317s(96, vf2);
        m44317s(97, vf2);
        m44317s(102, vf2);
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        newSingleThreadScheduledExecutor.schedule(new RunnableC19747a(jSONObject), this.f76556e.m27371q(), TimeUnit.SECONDS);
        newSingleThreadScheduledExecutor.shutdown();
        return null;
    }

    /* renamed from: s */
    public void m44317s(int i, VF2 vf2) {
        AO6 ao6;
        try {
            Context m80162b = vf2.m80162b();
            if (i != 96) {
                if (i != 97) {
                    if (i != 102 || !this.f76556e.m27378j(i)) {
                        return;
                    }
                    this.f76562k = new AO6(m80162b, this.f76558g, 2);
                    if (!this.f76555d.optBoolean(EnumC41486gM6.MG.toString(), false)) {
                        return;
                    }
                    ao6 = this.f76562k;
                } else if (!this.f76556e.m27378j(i)) {
                    return;
                } else {
                    this.f76561j = new AO6(m80162b, this.f76558g, 4);
                    if (!this.f76555d.optBoolean(EnumC41486gM6.GY.toString(), false)) {
                        return;
                    }
                    ao6 = this.f76561j;
                }
            } else if (!this.f76556e.m27378j(i)) {
                return;
            } else {
                this.f76560i = new AO6(m80162b, this.f76558g, 1);
                if (!this.f76555d.optBoolean(EnumC41486gM6.AC.toString(), false)) {
                    return;
                }
                ao6 = this.f76560i;
            }
            ao6.m115836b();
        } catch (Exception e) {
            KJ6.m99011b(C39726dO6.class, 3, e);
        }
    }

    /* renamed from: t */
    public void m44316t(C44460lN6 c44460lN6, Handler handler, VF2 vf2) {
        this.f76558g = handler;
        this.f76556e = c44460lN6;
        this.f76559h = vf2;
        this.f76557f = new JSONArray();
    }

    /* renamed from: x */
    public final void m44312x() {
        try {
            boolean m98931l = KN6.m98931l("s");
            JSONObject m98927p = m98931l ? KN6.m98927p(this.f76554c, this.f76557f, "s") : KN6.m98938e(this.f76554c, this.f76557f, "s");
            if (m98927p != null) {
                new C38495bL6(EnumC39097cM6.PRODUCTION_JSON_URL, m98927p, m98931l, this.f76559h, this.f76558g).m64644c();
            }
        } catch (Exception e) {
            KJ6.m99011b(C39726dO6.class, 3, e);
        }
    }
}
