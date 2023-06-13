package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Lkotlin/Function0;", "", "content", C17296a.f69688o, "(Lkotlin/jvm/functions/Function2;LEt0;I)V", "material_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: WM2 */
/* loaded from: classes.dex */
public final class WM2 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: WM2$a */
    /* loaded from: classes.dex */
    public static final class C9006a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f40900g;

        /* renamed from: h */
        public final /* synthetic */ int f40901h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9006a(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i) {
            super(2);
            this.f40900g = function2;
            this.f40901h = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            WM2.m78534a(this.f40900g, interfaceC32720Et0, C47127ps4.m18626a(this.f40901h | 1));
        }
    }

    /* renamed from: a */
    public static final void m78534a(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1322912246);
        if ((i & 14) == 0) {
            if (mo89518u.mo89629I(content)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1322912246, i2, -1, "androidx.compose.material.PlatformMaterialTheme (MaterialTheme.android.kt:21)");
            }
            content.invoke(mo89518u, Integer.valueOf(i2 & 14));
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C9006a(content, i));
        }
    }
}
