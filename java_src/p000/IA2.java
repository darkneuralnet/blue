package p000;

import co.bird.android.app.feature.map.p008ui.LocationSelectionUi;
import com.uber.autodispose.ScopeProvider;
/* renamed from: IA2 */
/* loaded from: classes2.dex */
public final class IA2 implements HA2 {

    /* renamed from: a */
    public final JA2 f14625a;

    public IA2(JA2 ja2) {
        this.f14625a = ja2;
    }

    /* renamed from: b */
    public static Y94<HA2> m102826b(JA2 ja2) {
        return C39546d52.m44621a(new IA2(ja2));
    }

    @Override // p000.HA2
    /* renamed from: a */
    public CA2 mo102827a(QA2 qa2, ScopeProvider scopeProvider, LocationSelectionUi locationSelectionUi) {
        return this.f14625a.m101054b(qa2, scopeProvider, locationSelectionUi);
    }
}
