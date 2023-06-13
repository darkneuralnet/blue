package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0006\u0010\u001e\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\bH\u0016J\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\nJ\b\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0002J\b\u0010\u000f\u001a\u00020\bH\u0002J\b\u0010\u0010\u001a\u00020\bH\u0002R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017¨\u0006!"}, m28432d2 = {"LRR3;", "T", "", "LK0;", "previous", "()Ljava/lang/Object;", "next", "element", "", "add", "(Ljava/lang/Object;)V", "remove", "set", "i", "j", "g", "h", "LPR3;", DateTokenConverter.CONVERTER_KEY, "LPR3;", "builder", "", "e", "I", "expectedModCount", "Lpa6;", "f", "Lpa6;", "trieIterator", "lastIteratedIndex", "index", "<init>", "(LPR3;I)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: RR3 */
/* loaded from: classes.dex */
public final class RR3<T> extends AbstractC4296K0<T> implements KMutableListIterator {

    /* renamed from: d */
    public final PR3<T> f32026d;

    /* renamed from: e */
    public int f32027e;

    /* renamed from: f */
    public C46949pa6<? extends T> f32028f;

    /* renamed from: g */
    public int f32029g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RR3(PR3<T> builder, int i) {
        super(i, builder.size());
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f32026d = builder;
        this.f32027e = builder.m90265c();
        this.f32029g = -1;
        m86746j();
    }

    @Override // p000.AbstractC4296K0, java.util.ListIterator
    public void add(T t) {
        m86749g();
        this.f32026d.add(m99365c(), t);
        m99363e(m99365c() + 1);
        m86747i();
    }

    /* renamed from: g */
    public final void m86749g() {
        if (this.f32027e == this.f32026d.m90265c()) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: h */
    public final void m86748h() {
        if (this.f32029g != -1) {
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: i */
    public final void m86747i() {
        m99362f(this.f32026d.size());
        this.f32027e = this.f32026d.m90265c();
        this.f32029g = -1;
        m86746j();
    }

    /* renamed from: j */
    public final void m86746j() {
        int coerceAtMost;
        Object[] m90264e = this.f32026d.m90264e();
        if (m90264e == null) {
            this.f32028f = null;
            return;
        }
        int m80982d = C36371Ui6.m80982d(this.f32026d.size());
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(m99365c(), m80982d);
        int m90263f = (this.f32026d.m90263f() / 5) + 1;
        C46949pa6<? extends T> c46949pa6 = this.f32028f;
        if (c46949pa6 == null) {
            this.f32028f = new C46949pa6<>(m90264e, coerceAtMost, m80982d, m90263f);
            return;
        }
        Intrinsics.checkNotNull(c46949pa6);
        c46949pa6.m19094j(m90264e, coerceAtMost, m80982d, m90263f);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        m86749g();
        m99367a();
        this.f32029g = m99365c();
        C46949pa6<? extends T> c46949pa6 = this.f32028f;
        if (c46949pa6 == null) {
            Object[] m90262h = this.f32026d.m90262h();
            int m99365c = m99365c();
            m99363e(m99365c + 1);
            return (T) m90262h[m99365c];
        } else if (c46949pa6.hasNext()) {
            m99363e(m99365c() + 1);
            return c46949pa6.next();
        } else {
            Object[] m90262h2 = this.f32026d.m90262h();
            int m99365c2 = m99365c();
            m99363e(m99365c2 + 1);
            return (T) m90262h2[m99365c2 - c46949pa6.m99364d()];
        }
    }

    @Override // java.util.ListIterator
    public T previous() {
        m86749g();
        m99366b();
        this.f32029g = m99365c() - 1;
        C46949pa6<? extends T> c46949pa6 = this.f32028f;
        if (c46949pa6 == null) {
            Object[] m90262h = this.f32026d.m90262h();
            m99363e(m99365c() - 1);
            return (T) m90262h[m99365c()];
        } else if (m99365c() > c46949pa6.m99364d()) {
            Object[] m90262h2 = this.f32026d.m90262h();
            m99363e(m99365c() - 1);
            return (T) m90262h2[m99365c() - c46949pa6.m99364d()];
        } else {
            m99363e(m99365c() - 1);
            return c46949pa6.previous();
        }
    }

    @Override // p000.AbstractC4296K0, java.util.ListIterator, java.util.Iterator
    public void remove() {
        m86749g();
        m86748h();
        this.f32026d.remove(this.f32029g);
        if (this.f32029g < m99365c()) {
            m99363e(this.f32029g);
        }
        m86747i();
    }

    @Override // p000.AbstractC4296K0, java.util.ListIterator
    public void set(T t) {
        m86749g();
        m86748h();
        this.f32026d.set(this.f32029g, t);
        this.f32027e = this.f32026d.m90265c();
        m86746j();
    }
}
