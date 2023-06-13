package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a7\u0010\t\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m28432d2 = {"", "key", "", "index", "LZn2;", "pinnedItemList", "Lkotlin/Function0;", "", "content", C17296a.f69688o, "(Ljava/lang/Object;ILZn2;Lkotlin/jvm/functions/Function2;LEt0;I)V", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyLayoutPinnableItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,161:1\n50#2:162\n49#2:163\n36#2:171\n1114#3,6:164\n1114#3,6:172\n76#4:170\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt\n*L\n49#1:162\n49#1:163\n52#1:171\n49#1:164,6\n52#1:172,6\n51#1:170\n*E\n"})
/* renamed from: Yn2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37348Yn2 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nLazyLayoutPinnableItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,161:1\n62#2,5:162\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1\n*L\n52#1:162,5\n*E\n"})
    /* renamed from: Yn2$a */
    /* loaded from: classes.dex */
    public static final class C9992a extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

        /* renamed from: g */
        public final /* synthetic */ C37114Xn2 f46625g;

        @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"Yn2$a$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1\n*L\n1#1,484:1\n52#2:485\n*E\n"})
        /* renamed from: Yn2$a$a */
        /* loaded from: classes.dex */
        public static final class C9993a implements InterfaceC44288l51 {

            /* renamed from: a */
            public final /* synthetic */ C37114Xn2 f46626a;

            public C9993a(C37114Xn2 c37114Xn2) {
                this.f46626a = c37114Xn2;
            }

            @Override // p000.InterfaceC44288l51
            public void dispose() {
                this.f46626a.m76322f();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9992a(C37114Xn2 c37114Xn2) {
            super(1);
            this.f46625g = c37114Xn2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new C9993a(this.f46625g);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yn2$b */
    /* loaded from: classes.dex */
    public static final class C9994b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Object f46627g;

        /* renamed from: h */
        public final /* synthetic */ int f46628h;

        /* renamed from: i */
        public final /* synthetic */ C37582Zn2 f46629i;

        /* renamed from: j */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f46630j;

        /* renamed from: k */
        public final /* synthetic */ int f46631k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9994b(Object obj, int i, C37582Zn2 c37582Zn2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i2) {
            super(2);
            this.f46627g = obj;
            this.f46628h = i;
            this.f46629i = c37582Zn2;
            this.f46630j = function2;
            this.f46631k = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C37348Yn2.m74227a(this.f46627g, this.f46628h, this.f46629i, this.f46630j, interfaceC32720Et0, C47127ps4.m18626a(this.f46631k | 1));
        }
    }

    /* renamed from: a */
    public static final void m74227a(Object obj, int i, C37582Zn2 pinnedItemList, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i2) {
        Intrinsics.checkNotNullParameter(pinnedItemList, "pinnedItemList");
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-2079116560);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-2079116560, i2, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:42)");
        }
        mo89518u.mo89638F(511388516);
        boolean mo89539n = mo89518u.mo89539n(obj) | mo89518u.mo89539n(pinnedItemList);
        Object mo89635G = mo89518u.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new C37114Xn2(obj, pinnedItemList);
            mo89518u.mo89503z(mo89635G);
        }
        mo89518u.mo89605Q();
        C37114Xn2 c37114Xn2 = (C37114Xn2) mo89635G;
        c37114Xn2.m76321g(i);
        c37114Xn2.m76319i((RT3) mo89518u.mo89572c(ST3.m85377a()));
        mo89518u.mo89638F(1157296644);
        boolean mo89539n2 = mo89518u.mo89539n(c37114Xn2);
        Object mo89635G2 = mo89518u.mo89635G();
        if (mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G2 = new C9992a(c37114Xn2);
            mo89518u.mo89503z(mo89635G2);
        }
        mo89518u.mo89605Q();
        Y91.m75536c(c37114Xn2, (Function1) mo89635G2, mo89518u, 0);
        C41806gu0.m37353a(new W94[]{ST3.m85377a().m81907c(c37114Xn2)}, content, mo89518u, ((i2 >> 6) & 112) | 8);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C9994b(obj, i, pinnedItemList, content, i2));
        }
    }
}
