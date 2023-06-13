package com.stripe.android.financialconnections.features.consent;

import com.stripe.android.financialconnections.features.common.LoadingContentKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lh10;", "", "invoke", "(Lh10;LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.financialconnections.features.consent.ComposableSingletons$ConsentScreenKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$ConsentScreenKt$lambda1$1 extends Lambda implements Function3<InterfaceC41875h10, InterfaceC32720Et0, Integer, Unit> {
    public static final ComposableSingletons$ConsentScreenKt$lambda1$1 INSTANCE = new ComposableSingletons$ConsentScreenKt$lambda1$1();

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nConsentScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsentScreen.kt\ncom/stripe/android/financialconnections/features/consent/ComposableSingletons$ConsentScreenKt$lambda-1$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,558:1\n154#2:559\n154#2:560\n*S KotlinDebug\n*F\n+ 1 ConsentScreen.kt\ncom/stripe/android/financialconnections/features/consent/ComposableSingletons$ConsentScreenKt$lambda-1$1$1\n*L\n287#1:559\n288#1:560\n*E\n"})
    /* renamed from: com.stripe.android.financialconnections.features.consent.ComposableSingletons$ConsentScreenKt$lambda-1$1$1 */
    /* loaded from: classes7.dex */
    public static final class C187261 extends Lambda implements Function3<AbstractC37727a30, InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ InterfaceC41875h10 $this_StripeImage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C187261(InterfaceC41875h10 interfaceC41875h10) {
            super(3);
            this.$this_StripeImage = interfaceC41875h10;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC37727a30 abstractC37727a30, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(abstractC37727a30, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AbstractC37727a30 shimmer, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(shimmer, "shimmer");
            if ((i & 14) == 0) {
                i2 = (interfaceC32720Et0.mo89539n(shimmer) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 91) == 18 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-970299162, i, -1, "com.stripe.android.financialconnections.features.consent.ComposableSingletons$ConsentScreenKt.lambda-1.<anonymous>.<anonymous> (ConsentScreen.kt:282)");
            }
            DN5.m110552a(C13342bw.m62126b(BB5.m114256m(C35447Qk0.m88106a(BB5.m114246w(this.$this_StripeImage.mo35388c(InterfaceC41563gV2.f82354b0, InterfaceC4360K9.f19170a.m99141e()), C43705k61.m29303g(40)), C39242cc5.m61172d(C43705k61.m29303g(10))), 0.5f), shimmer, null, 0.0f, 6, null), interfaceC32720Et0, 0);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    public ComposableSingletons$ConsentScreenKt$lambda1$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC41875h10 interfaceC41875h10, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC41875h10, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC41875h10 StripeImage, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(StripeImage, "$this$StripeImage");
        if ((i & 14) == 0) {
            i2 = (interfaceC32720Et0.mo89539n(StripeImage) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) == 18 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(210548325, i, -1, "com.stripe.android.financialconnections.features.consent.ComposableSingletons$ConsentScreenKt.lambda-1.<anonymous> (ConsentScreen.kt:281)");
        }
        LoadingContentKt.LoadingShimmerEffect(C43575jt0.m29791b(interfaceC32720Et0, -970299162, true, new C187261(StripeImage)), interfaceC32720Et0, 6);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
