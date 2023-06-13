package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0007\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, m28432d2 = {"LgV2;", "modifier", "Lkotlin/Function1;", "LMB5;", "LBt0;", "", "Lkotlin/ExtensionFunctionType;", C17296a.f69688o, "(LgV2;)Lkotlin/jvm/functions/Function3;", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,316:1\n74#1:354\n75#1,11:356\n88#1:381\n76#2:317\n76#2:318\n76#2:319\n76#2:334\n76#2:335\n76#2:336\n76#2:355\n76#2:382\n76#2:383\n76#2:384\n456#3,14:320\n286#3,10:337\n36#3:347\n456#3,14:367\n365#3,11:385\n1114#4,6:348\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n*L\n167#1:354\n167#1:356,11\n167#1:381\n74#1:317\n75#1:318\n76#1:319\n120#1:334\n121#1:335\n122#1:336\n167#1:355\n210#1:382\n211#1:383\n212#1:384\n77#1:320,14\n124#1:337,10\n170#1:347\n167#1:367,14\n214#1:385,11\n170#1:348,6\n*E\n"})
/* renamed from: Am2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31723Am2 {

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LMB5;", "LBt0;", "", C17296a.f69688o, "(LEt0;LEt0;I)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$materializerOf$1\n+ 2 Composer.kt\nandroidx/compose/runtime/SkippableUpdater\n*L\n1#1,316:1\n4216#2,4:317\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$materializerOf$1\n*L\n192#1:317,4\n*E\n"})
    /* renamed from: Am2$a */
    /* loaded from: classes.dex */
    public static final class C0208a extends Lambda implements Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC41563gV2 f1056g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0208a(InterfaceC41563gV2 interfaceC41563gV2) {
            super(3);
            this.f1056g = interfaceC41563gV2;
        }

        /* renamed from: a */
        public final void m115272a(InterfaceC32720Et0 interfaceC32720Et0, InterfaceC32720Et0 interfaceC32720Et02, int i) {
            Intrinsics.checkNotNullParameter(interfaceC32720Et0, "$this$null");
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1586257396, i, -1, "androidx.compose.ui.layout.materializerOf.<anonymous> (Layout.kt:189)");
            }
            InterfaceC41563gV2 m109806c = C32486Dt0.m109806c(interfaceC32720Et02, this.f1056g);
            interfaceC32720Et0.mo89638F(509942095);
            C38680bf6.m64191b(C38680bf6.m64192a(interfaceC32720Et0), m109806c, InterfaceC32018Bt0.f2995M.m113411e());
            interfaceC32720Et0.mo89605Q();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(MB5<InterfaceC32018Bt0> mb5, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            m115272a(mb5.m95601f(), interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @PublishedApi
    /* renamed from: a */
    public static final Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a(InterfaceC41563gV2 modifier) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        return C43575jt0.m29790c(-1586257396, true, new C0208a(modifier));
    }
}
