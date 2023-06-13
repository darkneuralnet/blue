package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00018\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\t\u001a\u00020\u0006R*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"LC5;", "I", "", "input", "LE4;", "options", "", C17296a.f69688o, "(Ljava/lang/Object;LE4;)V", "c", "LB5;", "LB5;", "getLauncher", "()LB5;", "b", "(LB5;)V", "launcher", "<init>", "()V", "activity-compose_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: C5 */
/* loaded from: classes.dex */
public final class C0854C5<I> {

    /* renamed from: a */
    public AbstractC0407B5<I> f3374a;

    /* renamed from: a */
    public final void m112904a(I i, C1727E4 c1727e4) {
        Unit unit;
        AbstractC0407B5<I> abstractC0407B5 = this.f3374a;
        if (abstractC0407B5 != null) {
            abstractC0407B5.mo67436b(i, c1727e4);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("Launcher has not been initialized".toString());
        }
    }

    /* renamed from: b */
    public final void m112903b(AbstractC0407B5<I> abstractC0407B5) {
        this.f3374a = abstractC0407B5;
    }

    /* renamed from: c */
    public final void m112902c() {
        Unit unit;
        AbstractC0407B5<I> abstractC0407B5 = this.f3374a;
        if (abstractC0407B5 != null) {
            abstractC0407B5.mo67435c();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("Launcher has not been initialized".toString());
        }
    }
}
