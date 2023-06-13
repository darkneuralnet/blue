package p000;

import androidx.work.impl.WorkDatabase;
import java.util.LinkedList;
import java.util.UUID;
import p000.InterfaceC37061Xh3;
import p000.UC6;
/* renamed from: Tc0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC36077Tc0 implements Runnable {

    /* renamed from: b */
    public final C38114ai3 f35749b = new C38114ai3();

    /* renamed from: Tc0$a */
    /* loaded from: classes.dex */
    public class C7889a extends AbstractRunnableC36077Tc0 {

        /* renamed from: c */
        public final /* synthetic */ C37830aD6 f35750c;

        /* renamed from: d */
        public final /* synthetic */ UUID f35751d;

        public C7889a(C37830aD6 c37830aD6, UUID uuid) {
            this.f35750c = c37830aD6;
            this.f35751d = uuid;
        }

        @Override // p000.AbstractRunnableC36077Tc0
        /* renamed from: g */
        public void mo83335g() {
            WorkDatabase m71756u = this.f35750c.m71756u();
            m71756u.m108730c();
            try {
                m83341a(this.f35750c, this.f35751d.toString());
                m71756u.m108734A();
                m71756u.m108728g();
                m83336f(this.f35750c);
            } catch (Throwable th) {
                m71756u.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: Tc0$b */
    /* loaded from: classes.dex */
    public class C7890b extends AbstractRunnableC36077Tc0 {

        /* renamed from: c */
        public final /* synthetic */ C37830aD6 f35752c;

        /* renamed from: d */
        public final /* synthetic */ String f35753d;

        /* renamed from: e */
        public final /* synthetic */ boolean f35754e;

        public C7890b(C37830aD6 c37830aD6, String str, boolean z) {
            this.f35752c = c37830aD6;
            this.f35753d = str;
            this.f35754e = z;
        }

        @Override // p000.AbstractRunnableC36077Tc0
        /* renamed from: g */
        public void mo83335g() {
            WorkDatabase m71756u = this.f35752c.m71756u();
            m71756u.m108730c();
            try {
                for (String str : m71756u.mo65549I().mo100767a(this.f35753d)) {
                    m83341a(this.f35752c, str);
                }
                m71756u.m108734A();
                m71756u.m108728g();
                if (this.f35754e) {
                    m83336f(this.f35752c);
                }
            } catch (Throwable th) {
                m71756u.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static AbstractRunnableC36077Tc0 m83340b(UUID uuid, C37830aD6 c37830aD6) {
        return new C7889a(c37830aD6, uuid);
    }

    /* renamed from: c */
    public static AbstractRunnableC36077Tc0 m83339c(String str, C37830aD6 c37830aD6, boolean z) {
        return new C7890b(c37830aD6, str, z);
    }

    /* renamed from: a */
    public void m83341a(C37830aD6 c37830aD6, String str) {
        m83337e(c37830aD6.m71756u(), str);
        c37830aD6.m71759r().m34411r(str);
        for (InterfaceC51810xm5 interfaceC51810xm5 : c37830aD6.m71758s()) {
            interfaceC51810xm5.mo4714e(str);
        }
    }

    /* renamed from: d */
    public InterfaceC37061Xh3 m83338d() {
        return this.f35749b;
    }

    /* renamed from: e */
    public final void m83337e(WorkDatabase workDatabase, String str) {
        IG6 mo65549I = workDatabase.mo65549I();
        InterfaceC44831m01 mo65554D = workDatabase.mo65554D();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            UC6.EnumC8214a mo100766b = mo65549I.mo100766b(str2);
            if (mo100766b != UC6.EnumC8214a.SUCCEEDED && mo100766b != UC6.EnumC8214a.FAILED) {
                mo65549I.mo100758j(UC6.EnumC8214a.CANCELLED, str2);
            }
            linkedList.addAll(mo65554D.mo24595a(str2));
        }
    }

    /* renamed from: f */
    public void m83336f(C37830aD6 c37830aD6) {
        C32662Em5.m108385b(c37830aD6.m71763n(), c37830aD6.m71756u(), c37830aD6.m71758s());
    }

    /* renamed from: g */
    public abstract void mo83335g();

    @Override // java.lang.Runnable
    public void run() {
        try {
            mo83335g();
            this.f35749b.m70830a(InterfaceC37061Xh3.f43681a);
        } catch (Throwable th) {
            this.f35749b.m70830a(new InterfaceC37061Xh3.AbstractC9449b.C9450a(th));
        }
    }
}
