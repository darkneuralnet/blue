package com.stripe.android.uicore.image;

import android.graphics.Bitmap;
import com.stripe.android.uicore.image.StripeImageState;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nStripeImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeImage.kt\ncom/stripe/android/uicore/image/StripeImageKt$StripeImage$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,120:1\n76#2:121\n25#3:122\n1057#4,6:123\n*S KotlinDebug\n*F\n+ 1 StripeImage.kt\ncom/stripe/android/uicore/image/StripeImageKt$StripeImage$1\n*L\n55#1:121\n57#1:122\n57#1:123,6\n*E\n"})
/* loaded from: classes7.dex */
public final class StripeImageKt$StripeImage$1 extends Lambda implements Function3<InterfaceC41875h10, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C48841sm0 $colorFilter;
    final /* synthetic */ String $contentDescription;
    final /* synthetic */ BA0 $contentScale;
    final /* synthetic */ AbstractC45562nE3 $debugPainter;
    final /* synthetic */ Function3<InterfaceC41875h10, InterfaceC32720Et0, Integer, Unit> $errorContent;
    final /* synthetic */ StripeImageLoader $imageLoader;
    final /* synthetic */ Function3<InterfaceC41875h10, InterfaceC32720Et0, Integer, Unit> $loadingContent;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ String $url;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "com.stripe.android.uicore.image.StripeImageKt$StripeImage$1$1", m28418f = "StripeImage.kt", m28417i = {}, m28416l = {66}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.uicore.image.StripeImageKt$StripeImage$1$1 */
    /* loaded from: classes7.dex */
    public static final class C194961 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $height;
        final /* synthetic */ StripeImageLoader $imageLoader;
        final /* synthetic */ EX2<StripeImageState> $state;
        final /* synthetic */ String $url;
        final /* synthetic */ int $width;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194961(StripeImageLoader stripeImageLoader, String str, int i, int i2, EX2<StripeImageState> ex2, Continuation<? super C194961> continuation) {
            super(2, continuation);
            this.$imageLoader = stripeImageLoader;
            this.$url = str;
            this.$width = i;
            this.$height = i2;
            this.$state = ex2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C194961(this.$imageLoader, this.$url, this.$width, this.$height, this.$state, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C194961) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            Object m116766loadBWLJW6A;
            Bitmap bitmap;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    m116766loadBWLJW6A = ((Result) obj).m116792unboximpl();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                StripeImageLoader stripeImageLoader = this.$imageLoader;
                String str = this.$url;
                int i2 = this.$width;
                int i3 = this.$height;
                this.label = 1;
                m116766loadBWLJW6A = stripeImageLoader.m116766loadBWLJW6A(str, i2, i3, this);
                if (m116766loadBWLJW6A == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            EX2<StripeImageState> ex2 = this.$state;
            if (Result.m116790isSuccessimpl(m116766loadBWLJW6A) && (bitmap = (Bitmap) m116766loadBWLJW6A) != null) {
                ex2.setValue(new StripeImageState.Success(new C13582cU(C6809Qc.m88362c(bitmap), 0L, 0L, 6, null)));
            }
            EX2<StripeImageState> ex22 = this.$state;
            if (Result.m116786exceptionOrNullimpl(m116766loadBWLJW6A) != null) {
                ex22.setValue(StripeImageState.Error.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StripeImageKt$StripeImage$1(String str, int i, Function3<? super InterfaceC41875h10, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, Function3<? super InterfaceC41875h10, ? super InterfaceC32720Et0, ? super Integer, Unit> function32, String str2, InterfaceC41563gV2 interfaceC41563gV2, BA0 ba0, C48841sm0 c48841sm0, AbstractC45562nE3 abstractC45562nE3, StripeImageLoader stripeImageLoader) {
        super(3);
        this.$url = str;
        this.$$dirty = i;
        this.$errorContent = function3;
        this.$loadingContent = function32;
        this.$contentDescription = str2;
        this.$modifier = interfaceC41563gV2;
        this.$contentScale = ba0;
        this.$colorFilter = c48841sm0;
        this.$debugPainter = abstractC45562nE3;
        this.$imageLoader = stripeImageLoader;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC41875h10 interfaceC41875h10, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC41875h10, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC41875h10 BoxWithConstraints, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Pair calculateBoxSize;
        EX2 m97025e;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i & 14) == 0) {
            i |= interfaceC32720Et0.mo89539n(BoxWithConstraints) ? 4 : 2;
        }
        if ((i & 91) == 18 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(325645268, i, -1, "com.stripe.android.uicore.image.StripeImage.<anonymous> (StripeImage.kt:53)");
        }
        boolean booleanValue = ((Boolean) interfaceC32720Et0.mo89572c(T32.m84395a())).booleanValue();
        calculateBoxSize = StripeImageKt.calculateBoxSize(BoxWithConstraints);
        int intValue = ((Number) calculateBoxSize.component1()).intValue();
        int intValue2 = ((Number) calculateBoxSize.component2()).intValue();
        AbstractC45562nE3 abstractC45562nE3 = this.$debugPainter;
        interfaceC32720Et0.mo89638F(-492369756);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            if (booleanValue && abstractC45562nE3 != null) {
                m97025e = LM5.m97025e(new StripeImageState.Success(abstractC45562nE3), null, 2, null);
            } else {
                m97025e = LM5.m97025e(StripeImageState.Loading.INSTANCE, null, 2, null);
            }
            mo89635G = m97025e;
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        EX2 ex2 = (EX2) mo89635G;
        String str = this.$url;
        Y91.m75533f(str, new C194961(this.$imageLoader, str, intValue, intValue2, ex2, null), interfaceC32720Et0, (this.$$dirty & 14) | 64);
        StripeImageState stripeImageState = (StripeImageState) ex2.getValue();
        if (Intrinsics.areEqual(stripeImageState, StripeImageState.Error.INSTANCE)) {
            interfaceC32720Et0.mo89638F(956713438);
            this.$errorContent.invoke(BoxWithConstraints, interfaceC32720Et0, Integer.valueOf((i & 14) | ((this.$$dirty >> 18) & 112)));
            interfaceC32720Et0.mo89605Q();
        } else if (Intrinsics.areEqual(stripeImageState, StripeImageState.Loading.INSTANCE)) {
            interfaceC32720Et0.mo89638F(956713476);
            this.$loadingContent.invoke(BoxWithConstraints, interfaceC32720Et0, Integer.valueOf((i & 14) | ((this.$$dirty >> 21) & 112)));
            interfaceC32720Et0.mo89605Q();
        } else if (stripeImageState instanceof StripeImageState.Success) {
            interfaceC32720Et0.mo89638F(956713519);
            AbstractC45562nE3 painter = ((StripeImageState.Success) stripeImageState).getPainter();
            String str2 = this.$contentDescription;
            InterfaceC41563gV2 interfaceC41563gV2 = this.$modifier;
            BA0 ba0 = this.$contentScale;
            C48841sm0 c48841sm0 = this.$colorFilter;
            int i2 = this.$$dirty;
            C51659xX1.m5069a(painter, str2, interfaceC41563gV2, null, ba0, 0.0f, c48841sm0, interfaceC32720Et0, ((i2 >> 3) & 112) | 8 | ((i2 >> 3) & 896) | (57344 & i2) | ((i2 << 3) & 3670016), 40);
            interfaceC32720Et0.mo89605Q();
        } else {
            interfaceC32720Et0.mo89638F(956713772);
            interfaceC32720Et0.mo89605Q();
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
