package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.PublishedApi;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0003R\u001a\u0010\f\u001a\u00020\u00058\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0013"}, m28432d2 = {"LBh2;", "LSh2;", "Lms0;", "", "exception", "", C17296a.f69688o, "b1", "c", "Z", "p0", "()Z", "handlesException", "q0", "onCancelComplete", "Lzh2;", "parent", "<init>", "(Lzh2;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
@PublishedApi
/* renamed from: Bh2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C31912Bh2 extends C35890Sh2 implements InterfaceC45344ms0 {

    /* renamed from: c */
    public final boolean f2695c;

    public C31912Bh2(InterfaceC52943zh2 interfaceC52943zh2) {
        super(true);
        m85076w0(interfaceC52943zh2);
        this.f2695c = m113669b1();
    }

    @Override // p000.InterfaceC45344ms0
    /* renamed from: a */
    public boolean mo24839a(Throwable th) {
        return m85122B0(new C47716qs0(th, false, 2, null));
    }

    /* renamed from: b1 */
    public final boolean m113669b1() {
        C34025Ki0 c34025Ki0;
        C35890Sh2 m89917Q;
        C34025Ki0 c34025Ki02;
        InterfaceC33791Ji0 m85078s0 = m85078s0();
        if (m85078s0 instanceof C34025Ki0) {
            c34025Ki0 = (C34025Ki0) m85078s0;
        } else {
            c34025Ki0 = null;
        }
        if (c34025Ki0 != null && (m89917Q = c34025Ki0.m89917Q()) != null) {
            while (!m89917Q.mo85080p0()) {
                InterfaceC33791Ji0 m85078s02 = m89917Q.m85078s0();
                if (m85078s02 instanceof C34025Ki0) {
                    c34025Ki02 = (C34025Ki0) m85078s02;
                } else {
                    c34025Ki02 = null;
                }
                if (c34025Ki02 != null) {
                    m89917Q = c34025Ki02.m89917Q();
                    if (m89917Q == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.C35890Sh2
    /* renamed from: p0 */
    public boolean mo85080p0() {
        return this.f2695c;
    }

    @Override // p000.C35890Sh2
    /* renamed from: q0 */
    public boolean mo29820q0() {
        return true;
    }
}
