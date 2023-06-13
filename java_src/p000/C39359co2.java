package p000;

import android.view.View;
import androidx.compose.p003ui.platform.C11411h;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m28432d2 = {"Lao2;", "prefetchState", "LQn2;", "itemContentFactory", "LZS5;", "subcomposeLayoutState", "", C17296a.f69688o, "(Lao2;LQn2;LZS5;LEt0;I)V", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyLayoutPrefetcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,311:1\n76#2:312\n67#3,3:313\n66#3:316\n1114#4,6:317\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher_androidKt\n*L\n41#1:312\n42#1:313,3\n42#1:316\n42#1:317,6\n*E\n"})
/* renamed from: co2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39359co2 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co2$a */
    /* loaded from: classes.dex */
    public static final class C16712a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C38173ao2 f68242g;

        /* renamed from: h */
        public final /* synthetic */ C35476Qn2 f68243h;

        /* renamed from: i */
        public final /* synthetic */ ZS5 f68244i;

        /* renamed from: j */
        public final /* synthetic */ int f68245j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16712a(C38173ao2 c38173ao2, C35476Qn2 c35476Qn2, ZS5 zs5, int i) {
            super(2);
            this.f68242g = c38173ao2;
            this.f68243h = c35476Qn2;
            this.f68244i = zs5;
            this.f68245j = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C39359co2.m53907a(this.f68242g, this.f68243h, this.f68244i, interfaceC32720Et0, C47127ps4.m18626a(this.f68245j | 1));
        }
    }

    /* renamed from: a */
    public static final void m53907a(C38173ao2 prefetchState, C35476Qn2 itemContentFactory, ZS5 subcomposeLayoutState, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(prefetchState, "prefetchState");
        Intrinsics.checkNotNullParameter(itemContentFactory, "itemContentFactory");
        Intrinsics.checkNotNullParameter(subcomposeLayoutState, "subcomposeLayoutState");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1113453182);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1113453182, i, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher (LazyLayoutPrefetcher.android.kt:35)");
        }
        View view = (View) mo89518u.mo89572c(C11411h.m68320k());
        int i2 = ZS5.f48612f;
        mo89518u.mo89638F(1618982084);
        boolean mo89539n = mo89518u.mo89539n(subcomposeLayoutState) | mo89518u.mo89539n(prefetchState) | mo89518u.mo89539n(view);
        Object mo89635G = mo89518u.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89518u.mo89503z(new RunnableC38766bo2(prefetchState, subcomposeLayoutState, itemContentFactory, view));
        }
        mo89518u.mo89605Q();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C16712a(prefetchState, itemContentFactory, subcomposeLayoutState, i));
        }
    }
}
