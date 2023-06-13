package p000;

import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\t\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0006\u0010\b\u001a\u00020\u0004J\b\u0010\t\u001a\u00020\u0004H$R\u0017\u0010\u000e\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R*\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00008\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\n\u0010\r\"\u0004\b\u0015\u0010\u0006¨\u0006\u0018"}, m28432d2 = {"Lg0;", "T", "Llm;", "node", "", "h", "(Ljava/lang/Object;)V", "i", "clear", "k", C17296a.f69688o, "Ljava/lang/Object;", "j", "()Ljava/lang/Object;", "root", "", "b", "Ljava/util/List;", "stack", "<set-?>", "c", "l", "current", "<init>", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: g0 */
/* loaded from: classes.dex */
public abstract class AbstractC20675g0<T> implements InterfaceC25773lm<T> {

    /* renamed from: a */
    public final T f81265a;

    /* renamed from: b */
    public final List<T> f81266b = new ArrayList();

    /* renamed from: c */
    public T f81267c;

    public AbstractC20675g0(T t) {
        this.f81265a = t;
        this.f81267c = t;
    }

    @Override // p000.InterfaceC25773lm
    /* renamed from: a */
    public T mo26853a() {
        return this.f81267c;
    }

    @Override // p000.InterfaceC25773lm
    public final void clear() {
        this.f81266b.clear();
        m40375l(this.f81265a);
        mo8330k();
    }

    @Override // p000.InterfaceC25773lm
    /* renamed from: h */
    public void mo26851h(T t) {
        this.f81266b.add(mo26853a());
        m40375l(t);
    }

    @Override // p000.InterfaceC25773lm
    /* renamed from: i */
    public void mo26850i() {
        if (!this.f81266b.isEmpty()) {
            List<T> list = this.f81266b;
            m40375l(list.remove(list.size() - 1));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: j */
    public final T m40376j() {
        return this.f81265a;
    }

    /* renamed from: k */
    public abstract void mo8330k();

    /* renamed from: l */
    public void m40375l(T t) {
        this.f81267c = t;
    }
}
