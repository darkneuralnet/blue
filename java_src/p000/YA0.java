package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lx16;", "manager", "Lkotlin/Function0;", "", "content", C17296a.f69688o, "(Lx16;Lkotlin/jvm/functions/Function2;LEt0;I)V", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: YA0 */
/* loaded from: classes.dex */
public final class YA0 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: YA0$a */
    /* loaded from: classes.dex */
    public static final class C9698a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C51367x16 f44736g;

        /* renamed from: h */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f44737h;

        /* renamed from: i */
        public final /* synthetic */ int f44738i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9698a(C51367x16 c51367x16, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i) {
            super(2);
            this.f44736g = c51367x16;
            this.f44737h = function2;
            this.f44738i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            YA0.m75478a(this.f44736g, this.f44737h, interfaceC32720Et0, C47127ps4.m18626a(this.f44738i | 1));
        }
    }

    /* renamed from: a */
    public static final void m75478a(C51367x16 manager, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1985516685);
        if ((i & 112) == 0) {
            if (mo89518u.mo89629I(content)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) == 16 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1985516685, i2, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:23)");
            }
            content.invoke(mo89518u, Integer.valueOf((i2 >> 3) & 14));
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C9698a(manager, content, i));
        }
    }
}
