package p000;

import android.support.annotation.Nullable;
import com.google.android.play.core.tasks.RuntimeExecutionException;
import java.util.concurrent.Executor;
/* renamed from: zO6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52769zO6<ResultT> extends XY5<ResultT> {

    /* renamed from: a */
    public final Object f121289a = new Object();

    /* renamed from: b */
    public final RN6<ResultT> f121290b = new RN6<>();

    /* renamed from: c */
    public boolean f121291c;

    /* renamed from: d */
    public ResultT f121292d;

    /* renamed from: e */
    public Exception f121293e;

    @Override // p000.XY5
    /* renamed from: a */
    public final XY5<ResultT> mo1427a(InterfaceC44031kf3<ResultT> interfaceC44031kf3) {
        this.f121290b.m86788a(new YK6(C46346oZ5.f102144a, interfaceC44031kf3));
        m1414n();
        return this;
    }

    @Override // p000.XY5
    /* renamed from: b */
    public final XY5<ResultT> mo1426b(Executor executor, InterfaceC34946Og3 interfaceC34946Og3) {
        this.f121290b.m86788a(new VM6(executor, interfaceC34946Og3));
        m1414n();
        return this;
    }

    @Override // p000.XY5
    /* renamed from: c */
    public final XY5<ResultT> mo1425c(Executor executor, InterfaceC45830nh3<? super ResultT> interfaceC45830nh3) {
        this.f121290b.m86788a(new C51574xN6(executor, interfaceC45830nh3));
        m1414n();
        return this;
    }

    @Override // p000.XY5
    @Nullable
    /* renamed from: d */
    public final Exception mo1424d() {
        Exception exc;
        synchronized (this.f121289a) {
            exc = this.f121293e;
        }
        return exc;
    }

    @Override // p000.XY5
    /* renamed from: e */
    public final ResultT mo1423e() {
        ResultT resultt;
        synchronized (this.f121289a) {
            m1416l();
            Exception exc = this.f121293e;
            if (exc != null) {
                throw new RuntimeExecutionException(exc);
            }
            resultt = this.f121292d;
        }
        return resultt;
    }

    @Override // p000.XY5
    /* renamed from: f */
    public final boolean mo1422f() {
        boolean z;
        synchronized (this.f121289a) {
            z = this.f121291c;
        }
        return z;
    }

    @Override // p000.XY5
    /* renamed from: g */
    public final boolean mo1421g() {
        boolean z;
        synchronized (this.f121289a) {
            z = false;
            if (this.f121291c && this.f121293e == null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: h */
    public final void m1420h(ResultT resultt) {
        synchronized (this.f121289a) {
            m1415m();
            this.f121291c = true;
            this.f121292d = resultt;
        }
        this.f121290b.m86787b(this);
    }

    /* renamed from: i */
    public final boolean m1419i(ResultT resultt) {
        synchronized (this.f121289a) {
            if (this.f121291c) {
                return false;
            }
            this.f121291c = true;
            this.f121292d = resultt;
            this.f121290b.m86787b(this);
            return true;
        }
    }

    /* renamed from: j */
    public final void m1418j(Exception exc) {
        synchronized (this.f121289a) {
            m1415m();
            this.f121291c = true;
            this.f121293e = exc;
        }
        this.f121290b.m86787b(this);
    }

    /* renamed from: k */
    public final boolean m1417k(Exception exc) {
        synchronized (this.f121289a) {
            if (this.f121291c) {
                return false;
            }
            this.f121291c = true;
            this.f121293e = exc;
            this.f121290b.m86787b(this);
            return true;
        }
    }

    /* renamed from: l */
    public final void m1416l() {
        MK6.m95439c(this.f121291c, "Task is not yet complete");
    }

    /* renamed from: m */
    public final void m1415m() {
        MK6.m95439c(!this.f121291c, "Task is already complete");
    }

    /* renamed from: n */
    public final void m1414n() {
        synchronized (this.f121289a) {
            if (this.f121291c) {
                this.f121290b.m86787b(this);
            }
        }
    }
}
