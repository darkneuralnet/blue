package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC41927h62;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¨\u0006\r"}, m28432d2 = {"LHO4;", "Lh62;", "Lh62$a;", "chain", "LM12;", C17296a.f69688o, "Landroid/view/View;", "view", "Landroid/util/AttributeSet;", "attributeSet", "b", "<init>", "()V", "reword_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: HO4 */
/* loaded from: classes7.dex */
public final class HO4 implements InterfaceC41927h62 {

    /* renamed from: a */
    public static final HO4 f13334a = new HO4();

    private HO4() {
    }

    @Override // p000.InterfaceC41927h62
    /* renamed from: a */
    public M12 mo36851a(InterfaceC41927h62.InterfaceC22551a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        String m97925d = chain.request().m97925d();
        Context m97927b = chain.request().m97927b();
        AttributeSet m97928a = chain.request().m97928a();
        View m93219a = GO4.f11851a.m105149a().m93219a(m97925d, m97927b, m97928a);
        if (m93219a != null) {
            return new M12(m103918b(m93219a, m97928a), m97925d, m97927b, m97928a);
        }
        M12 mo34447a = chain.mo34447a(chain.request());
        return M12.m96010b(mo34447a, f13334a.m103918b(mo34447a.m96008d(), mo34447a.m96009c()), null, null, null, 14, null);
    }

    /* renamed from: b */
    public final View m103918b(View view, AttributeSet attributeSet) {
        View m102424b;
        if (view == null || attributeSet == null) {
            return view;
        }
        m102424b = IO4.m102424b(view, attributeSet);
        return m102424b;
    }
}
