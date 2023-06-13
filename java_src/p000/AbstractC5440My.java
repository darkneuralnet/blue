package p000;

import androidx.recyclerview.widget.C11905h;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC11834D;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\nJ\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0016\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H\u0016R\"\u0010\u001b\u001a\u00020\u00148\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"LMy;", "Landroidx/recyclerview/widget/RecyclerView$D;", "T", "Landroidx/recyclerview/widget/RecyclerView$h;", "", "getItemCount", "position", "getItemViewType", "LG6;", "p", "LH6;", "q", "section", "t", "LF6;", "r", "", "sections", "", "u", "LE6;", "b", "LE6;", "o", "()LE6;", "setAdapterData", "(LE6;)V", "adapterData", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: My */
/* loaded from: classes4.dex */
public abstract class AbstractC5440My<T extends RecyclerView.AbstractC11834D> extends RecyclerView.AbstractC11843h<T> {

    /* renamed from: b */
    public C1737E6 f23883b = new C1737E6(this);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.f23883b.m109395g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemViewType(int i) {
        return this.f23883b.m109394h().get(i).m105817b();
    }

    /* renamed from: o */
    public final C1737E6 m94545o() {
        return this.f23883b;
    }

    /* renamed from: p */
    public final C2637G6 m94544p(int i) {
        return this.f23883b.m109394h().get(i);
    }

    /* renamed from: q */
    public final C3023H6 m94543q(int i) {
        return this.f23883b.m109393i(m94544p(i));
    }

    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return null;
    }

    /* renamed from: t */
    public final int m94542t(C3023H6 section) {
        Intrinsics.checkNotNullParameter(section, "section");
        return this.f23883b.m109392j().indexOf(section);
    }

    /* renamed from: u */
    public void mo24871u(Collection<C3023H6> sections) {
        Unit unit;
        List<C3023H6> list;
        Intrinsics.checkNotNullParameter(sections, "sections");
        if (this.f23883b.m109391k()) {
            this.f23883b.m109400b(sections);
            return;
        }
        InterfaceC2152F6 mo2178r = mo2178r();
        if (mo2178r != null) {
            List<C3023H6> m109392j = this.f23883b.m109392j();
            list = CollectionsKt___CollectionsKt.toList(sections);
            C11905h.C11910e mo30a = mo2178r.mo30a(m109392j, list);
            this.f23883b.m109399c();
            this.f23883b.m109401a(sections);
            mo30a.m66261d(this);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f23883b.m109399c();
            this.f23883b.m109401a(sections);
            notifyDataSetChanged();
        }
    }
}
