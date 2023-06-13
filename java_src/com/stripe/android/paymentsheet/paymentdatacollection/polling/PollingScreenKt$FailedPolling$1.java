package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPollingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PollingScreen.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$FailedPolling$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,261:1\n154#2:262\n*S KotlinDebug\n*F\n+ 1 PollingScreen.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$FailedPolling$1\n*L\n147#1:262\n*E\n"})
/* loaded from: classes7.dex */
public final class PollingScreenKt$FailedPolling$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function0<Unit> $onCancel;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingScreenKt$FailedPolling$1$1 */
    /* loaded from: classes7.dex */
    public static final class C192821 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ Function0<Unit> $onCancel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192821(Function0<Unit> function0, int i) {
            super(2);
            this.$onCancel = function0;
            this.$$dirty = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1411609844, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.FailedPolling.<anonymous>.<anonymous> (PollingScreen.kt:148)");
            }
            C47438qP1.m17541a(this.$onCancel, null, false, null, ComposableSingletons$PollingScreenKt.INSTANCE.m116610getLambda3$paymentsheet_release(), interfaceC32720Et0, (this.$$dirty & 14) | 24576, 14);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollingScreenKt$FailedPolling$1(Function0<Unit> function0, int i) {
        super(2);
        this.$onCancel = function0;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(108078738, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.FailedPolling.<anonymous> (PollingScreen.kt:143)");
        }
        float m29303g = C43705k61.m29303g(0);
        C3727Ih.m101812c(ComposableSingletons$PollingScreenKt.INSTANCE.m116609getLambda2$paymentsheet_release(), null, C43575jt0.m29791b(interfaceC32720Et0, -1411609844, true, new C192821(this.$onCancel, this.$$dirty)), null, TM2.f35372a.m83731a(interfaceC32720Et0, TM2.f35373b).m94896n(), 0L, m29303g, interfaceC32720Et0, 1573254, 42);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
