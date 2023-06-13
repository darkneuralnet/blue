package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0005\u001a\u00020\u00042\"\u0010\u0003\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010\u0000\"\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"", "Ld13;", "LHY2;", "navigators", "LOY2;", C17296a.f69688o, "([Ld13;LEt0;I)LOY2;", "navigation-animation_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: QY2 */
/* loaded from: classes5.dex */
public final class QY2 {
    /* renamed from: a */
    public static final OY2 m88412a(AbstractC39507d13<? extends HY2>[] navigators, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(navigators, "navigators");
        interfaceC32720Et0.mo89638F(-514773754);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-514773754, i, -1, "com.google.accompanist.navigation.animation.rememberAnimatedNavController (NavHostController.kt:35)");
        }
        interfaceC32720Et0.mo89638F(-492369756);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new C5048Le();
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add((C5048Le) mo89635G);
        spreadBuilder.addSpread(navigators);
        OY2 m90122e = PY2.m90122e((AbstractC39507d13[]) spreadBuilder.toArray(new AbstractC39507d13[spreadBuilder.size()]), interfaceC32720Et0, 8);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m90122e;
    }
}
