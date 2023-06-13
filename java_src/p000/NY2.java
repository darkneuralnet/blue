package p000;

import android.os.Bundle;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC39507d13;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J*\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J$\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LNY2;", "Ld13;", "LJY2;", "l", "", "LAY2;", "entries", "LTY2;", "navOptions", "Ld13$a;", "navigatorExtras", "", "e", "entry", "m", "Li13;", "c", "Li13;", "navigatorProvider", "<init>", "(Li13;)V", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
@AbstractC39507d13.InterfaceC19661b("navigation")
/* renamed from: NY2 */
/* loaded from: classes.dex */
public class NY2 extends AbstractC39507d13<JY2> {

    /* renamed from: c */
    public final C42471i13 f24759c;

    public NY2(C42471i13 navigatorProvider) {
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        this.f24759c = navigatorProvider;
    }

    @Override // p000.AbstractC39507d13
    /* renamed from: e */
    public void mo172e(List<AY2> entries, TY2 ty2, AbstractC39507d13.InterfaceC19660a interfaceC19660a) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        for (AY2 ay2 : entries) {
            m93787m(ay2, ty2, interfaceC19660a);
        }
    }

    @Override // p000.AbstractC39507d13
    /* renamed from: l */
    public JY2 mo173a() {
        return new JY2(this);
    }

    /* renamed from: m */
    public final void m93787m(AY2 ay2, TY2 ty2, AbstractC39507d13.InterfaceC19660a interfaceC19660a) {
        boolean z;
        HY2 m100258I;
        List<AY2> listOf;
        JY2 jy2 = (JY2) ay2.m115582f();
        Bundle m115584d = ay2.m115584d();
        int m100253N = jy2.m100253N();
        String m100252O = jy2.m100252O();
        if (m100253N == 0 && m100252O == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (m100252O != null) {
                m100258I = jy2.m100256K(m100252O, false);
            } else {
                m100258I = jy2.m100258I(m100253N, false);
            }
            if (m100258I != null) {
                AbstractC39507d13 m35381e = this.f24759c.m35381e(m100258I.m103773u());
                listOf = CollectionsKt__CollectionsJVMKt.listOf(m44723b().mo31251a(m100258I, m100258I.m103778e(m115584d)));
                m35381e.mo172e(listOf, ty2, interfaceC19660a);
                return;
            }
            throw new IllegalArgumentException("navigation destination " + jy2.m100254M() + " is not a direct child of this NavGraph");
        }
        throw new IllegalStateException(("no start destination defined via app:startDestination for " + jy2.mo100247o()).toString());
    }
}
