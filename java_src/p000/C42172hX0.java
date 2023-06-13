package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p000.AbstractC31956Bm1;
import p000.InterfaceC37319Yk0;
/* renamed from: hX0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C42172hX0 extends AbstractC31956Bm1 {

    /* renamed from: a */
    public final C31722Am1 f85343a;

    /* renamed from: b */
    public final X94<InterfaceC49746uI1> f85344b;

    /* renamed from: c */
    public final List<InterfaceC9148Wh> f85345c;

    /* renamed from: d */
    public final List<AbstractC31956Bm1.InterfaceC0730a> f85346d;

    /* renamed from: e */
    public final C38548bR5 f85347e;

    /* renamed from: f */
    public final C47851r56 f85348f;

    /* renamed from: g */
    public final Executor f85349g;

    /* renamed from: h */
    public final Executor f85350h;

    /* renamed from: i */
    public final Executor f85351i;

    /* renamed from: j */
    public final Task<Void> f85352j;

    /* renamed from: k */
    public final InterfaceC37319Yk0 f85353k;

    /* renamed from: l */
    public InterfaceC8344Uh f85354l;

    /* renamed from: m */
    public InterfaceC7912Th f85355m;

    /* renamed from: n */
    public AbstractC8723Vh f85356n;

    public C42172hX0(C31722Am1 c31722Am1, X94<InterfaceC49746uI1> x94, @InterfaceC52314yd6 Executor executor, @InterfaceC36673Vq2 Executor executor2, @InterfaceC10076Yv Executor executor3, @InterfaceC8305UW ScheduledExecutorService scheduledExecutorService) {
        Preconditions.checkNotNull(c31722Am1);
        Preconditions.checkNotNull(x94);
        this.f85343a = c31722Am1;
        this.f85344b = x94;
        this.f85345c = new ArrayList();
        this.f85346d = new ArrayList();
        this.f85347e = new C38548bR5(c31722Am1.m115293j(), c31722Am1.m115289n());
        this.f85348f = new C47851r56(c31722Am1.m115293j(), this, executor2, scheduledExecutorService);
        this.f85349g = executor;
        this.f85350h = executor2;
        this.f85351i = executor3;
        this.f85352j = m36231s(executor3);
        this.f85353k = new InterfaceC37319Yk0.C9955a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Task m36235o(AbstractC8723Vh abstractC8723Vh) throws Exception {
        m36229u(abstractC8723Vh);
        for (AbstractC31956Bm1.InterfaceC0730a interfaceC0730a : this.f85346d) {
            interfaceC0730a.mo7546a(abstractC8723Vh);
        }
        C47500qW0 m17479a = C47500qW0.m17479a(abstractC8723Vh);
        for (InterfaceC9148Wh interfaceC9148Wh : this.f85345c) {
            interfaceC9148Wh.m78009a(m17479a);
        }
        return Tasks.forResult(abstractC8723Vh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Task m36234p(boolean z, Task task) throws Exception {
        if (!z && m36237m()) {
            return Tasks.forResult(this.f85356n);
        }
        if (this.f85355m == null) {
            return Tasks.forException(new FirebaseException("No AppCheckProvider installed."));
        }
        return m36239k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m36233q(TaskCompletionSource taskCompletionSource) {
        AbstractC8723Vh m64528d = this.f85347e.m64528d();
        if (m64528d != null) {
            m36230t(m64528d);
        }
        taskCompletionSource.setResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m36232r(AbstractC8723Vh abstractC8723Vh) {
        this.f85347e.m64527e(abstractC8723Vh);
    }

    @Override // p000.AbstractC31956Bm1
    /* renamed from: a */
    public void mo36247a(AbstractC31956Bm1.InterfaceC0730a interfaceC0730a) {
        Preconditions.checkNotNull(interfaceC0730a);
        this.f85346d.add(interfaceC0730a);
        this.f85348f.m16496e(this.f85345c.size() + this.f85346d.size());
        if (m36237m()) {
            interfaceC0730a.mo7546a(this.f85356n);
        }
    }

    @Override // p000.AbstractC31956Bm1
    /* renamed from: b */
    public Task<AbstractC8723Vh> mo36246b(final boolean z) {
        return this.f85352j.continueWithTask(this.f85350h, new Continuation() { // from class: dX0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task m36234p;
                m36234p = C42172hX0.this.m36234p(z, task);
                return m36234p;
            }
        });
    }

    @Override // p000.AbstractC31956Bm1
    /* renamed from: e */
    public void mo36245e(InterfaceC8344Uh interfaceC8344Uh) {
        m36236n(interfaceC8344Uh, this.f85343a.m115284s());
    }

    @Override // p000.AbstractC31956Bm1
    /* renamed from: f */
    public void mo36244f(boolean z) {
        this.f85348f.m16495f(z);
    }

    /* renamed from: k */
    public Task<AbstractC8723Vh> m36239k() {
        return this.f85355m.getToken().onSuccessTask(this.f85349g, new SuccessContinuation() { // from class: fX0
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m36235o;
                m36235o = C42172hX0.this.m36235o((AbstractC8723Vh) obj);
                return m36235o;
            }
        });
    }

    /* renamed from: l */
    public X94<InterfaceC49746uI1> m36238l() {
        return this.f85344b;
    }

    /* renamed from: m */
    public final boolean m36237m() {
        AbstractC8723Vh abstractC8723Vh = this.f85356n;
        if (abstractC8723Vh != null && abstractC8723Vh.mo19171a() - this.f85353k.currentTimeMillis() > 300000) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public void m36236n(InterfaceC8344Uh interfaceC8344Uh, boolean z) {
        Preconditions.checkNotNull(interfaceC8344Uh);
        this.f85354l = interfaceC8344Uh;
        this.f85355m = interfaceC8344Uh.mo3432a(this.f85343a);
        this.f85348f.m16495f(z);
    }

    /* renamed from: s */
    public final Task<Void> m36231s(Executor executor) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: eX0
            @Override // java.lang.Runnable
            public final void run() {
                C42172hX0.this.m36233q(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: t */
    public void m36230t(AbstractC8723Vh abstractC8723Vh) {
        this.f85356n = abstractC8723Vh;
    }

    /* renamed from: u */
    public final void m36229u(final AbstractC8723Vh abstractC8723Vh) {
        this.f85351i.execute(new Runnable() { // from class: gX0
            @Override // java.lang.Runnable
            public final void run() {
                C42172hX0.this.m36232r(abstractC8723Vh);
            }
        });
        m36230t(abstractC8723Vh);
        this.f85348f.m16497d(abstractC8723Vh);
    }
}
