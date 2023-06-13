package androidx.camera.view;

import androidx.camera.view.C11270a;
import androidx.camera.view.PreviewView;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import p000.InterfaceC34196Lb0;
import p000.InterfaceC37493Zd3;
import p000.O80;
/* renamed from: androidx.camera.view.a */
/* loaded from: classes.dex */
public final class C11270a implements InterfaceC37493Zd3.InterfaceC10303a<InterfaceC34196Lb0.EnumC5034a> {

    /* renamed from: a */
    public final InterfaceC33962Kb0 f52862a;

    /* renamed from: b */
    public final C49882uX2<PreviewView.EnumC11269h> f52863b;

    /* renamed from: c */
    public PreviewView.EnumC11269h f52864c;

    /* renamed from: d */
    public final AbstractC11275c f52865d;

    /* renamed from: e */
    public ListenableFuture<Void> f52866e;

    /* renamed from: f */
    public boolean f52867f = false;

    /* renamed from: androidx.camera.view.a$a */
    /* loaded from: classes.dex */
    public class C11271a implements CA1<Void> {

        /* renamed from: a */
        public final /* synthetic */ List f52868a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC33728Jb0 f52869b;

        public C11271a(List list, InterfaceC33728Jb0 interfaceC33728Jb0) {
            this.f52868a = list;
            this.f52869b = interfaceC33728Jb0;
        }

        @Override // p000.CA1
        /* renamed from: a */
        public void onSuccess(Void r2) {
            C11270a.this.f52866e = null;
        }

        @Override // p000.CA1
        public void onFailure(Throwable th) {
            C11270a.this.f52866e = null;
            if (!this.f52868a.isEmpty()) {
                for (AbstractC46943pa0 abstractC46943pa0 : this.f52868a) {
                    ((InterfaceC33962Kb0) this.f52869b).mo98719d(abstractC46943pa0);
                }
                this.f52868a.clear();
            }
        }
    }

    /* renamed from: androidx.camera.view.a$b */
    /* loaded from: classes.dex */
    public class C11272b extends AbstractC46943pa0 {

        /* renamed from: a */
        public final /* synthetic */ O80.C5832a f52871a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC33728Jb0 f52872b;

        public C11272b(O80.C5832a c5832a, InterfaceC33728Jb0 interfaceC33728Jb0) {
            this.f52871a = c5832a;
            this.f52872b = interfaceC33728Jb0;
        }

        @Override // p000.AbstractC46943pa0
        /* renamed from: b */
        public void mo4448b(InterfaceC51685xa0 interfaceC51685xa0) {
            this.f52871a.m92861c(null);
            ((InterfaceC33962Kb0) this.f52872b).mo98719d(this);
        }
    }

    public C11270a(InterfaceC33962Kb0 interfaceC33962Kb0, C49882uX2<PreviewView.EnumC11269h> c49882uX2, AbstractC11275c abstractC11275c) {
        this.f52862a = interfaceC33962Kb0;
        this.f52863b = c49882uX2;
        this.f52865d = abstractC11275c;
        synchronized (this) {
            this.f52864c = c49882uX2.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ ListenableFuture m68957g(Void r1) throws Exception {
        return this.f52865d.mo68914h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ Void m68956h(Void r1) {
        m68952l(PreviewView.EnumC11269h.STREAMING);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Object m68955i(InterfaceC33728Jb0 interfaceC33728Jb0, List list, O80.C5832a c5832a) throws Exception {
        C11272b c11272b = new C11272b(c5832a, interfaceC33728Jb0);
        list.add(c11272b);
        ((InterfaceC33962Kb0) interfaceC33728Jb0).mo98720c(C31631Ac0.m115449a(), c11272b);
        return "waitForCaptureResult";
    }

    /* renamed from: e */
    public final void m68959e() {
        ListenableFuture<Void> listenableFuture = this.f52866e;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.f52866e = null;
        }
    }

    /* renamed from: f */
    public void m68958f() {
        m68959e();
    }

    @Override // p000.InterfaceC37493Zd3.InterfaceC10303a
    /* renamed from: j */
    public void mo68963a(InterfaceC34196Lb0.EnumC5034a enumC5034a) {
        if (enumC5034a != InterfaceC34196Lb0.EnumC5034a.CLOSING && enumC5034a != InterfaceC34196Lb0.EnumC5034a.CLOSED && enumC5034a != InterfaceC34196Lb0.EnumC5034a.RELEASING && enumC5034a != InterfaceC34196Lb0.EnumC5034a.RELEASED) {
            if ((enumC5034a == InterfaceC34196Lb0.EnumC5034a.OPENING || enumC5034a == InterfaceC34196Lb0.EnumC5034a.OPEN || enumC5034a == InterfaceC34196Lb0.EnumC5034a.PENDING_OPEN) && !this.f52867f) {
                m68953k(this.f52862a);
                this.f52867f = true;
                return;
            }
            return;
        }
        m68952l(PreviewView.EnumC11269h.IDLE);
        if (this.f52867f) {
            this.f52867f = false;
            m68959e();
        }
    }

    /* renamed from: k */
    public final void m68953k(InterfaceC33728Jb0 interfaceC33728Jb0) {
        m68952l(PreviewView.EnumC11269h.IDLE);
        ArrayList arrayList = new ArrayList();
        DA1 m110817d = DA1.m110820a(m68951m(interfaceC33728Jb0, arrayList)).m110816e(new InterfaceC20537fp() { // from class: d24
            @Override // p000.InterfaceC20537fp
            public final ListenableFuture apply(Object obj) {
                ListenableFuture m68957g;
                m68957g = C11270a.this.m68957g((Void) obj);
                return m68957g;
            }
        }, C31631Ac0.m115449a()).m110817d(new InterfaceC51452xA1() { // from class: e24
            @Override // p000.InterfaceC51452xA1
            public final Object apply(Object obj) {
                Void m68956h;
                m68956h = C11270a.this.m68956h((Void) obj);
                return m68956h;
            }
        }, C31631Ac0.m115449a());
        this.f52866e = m110817d;
        IA1.m102842b(m110817d, new C11271a(arrayList, interfaceC33728Jb0), C31631Ac0.m115449a());
    }

    /* renamed from: l */
    public void m68952l(PreviewView.EnumC11269h enumC11269h) {
        synchronized (this) {
            if (this.f52864c.equals(enumC11269h)) {
                return;
            }
            this.f52864c = enumC11269h;
            C33928Jx2.m99533a("StreamStateObserver", "Update Preview stream state to " + enumC11269h);
            this.f52863b.postValue(enumC11269h);
        }
    }

    /* renamed from: m */
    public final ListenableFuture<Void> m68951m(final InterfaceC33728Jb0 interfaceC33728Jb0, final List<AbstractC46943pa0> list) {
        return O80.m92864a(new O80.InterfaceC5834c() { // from class: f24
            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public final Object mo3207a(O80.C5832a c5832a) {
                Object m68955i;
                m68955i = C11270a.this.m68955i(interfaceC33728Jb0, list, c5832a);
                return m68955i;
            }
        });
    }

    @Override // p000.InterfaceC37493Zd3.InterfaceC10303a
    public void onError(Throwable th) {
        m68958f();
        m68952l(PreviewView.EnumC11269h.IDLE);
    }
}
