package com.stripe.android.link.p042ui.cardedit;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p003ui.platform.C11411h;
import com.stripe.android.link.C18975R;
import com.stripe.android.link.p042ui.ErrorMessage;
import com.stripe.android.link.p042ui.ErrorTextKt;
import com.stripe.android.link.p042ui.PrimaryButtonKt;
import com.stripe.android.link.p042ui.PrimaryButtonState;
import com.stripe.android.link.theme.ColorKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCardEditScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardEditScreen.kt\ncom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,193:1\n154#2:194\n*S KotlinDebug\n*F\n+ 1 CardEditScreen.kt\ncom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4\n*L\n132#1:194\n*E\n"})
/* renamed from: com.stripe.android.link.ui.cardedit.CardEditScreenKt$CardEditBody$4 */
/* loaded from: classes7.dex */
public final class CardEditScreenKt$CardEditBody$4 extends Lambda implements Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ ErrorMessage $errorMessage;
    final /* synthetic */ Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> $formContent;
    final /* synthetic */ boolean $isDefault;
    final /* synthetic */ boolean $isProcessing;
    final /* synthetic */ Function0<Unit> $onCancelClick;
    final /* synthetic */ Function0<Unit> $onPrimaryButtonClick;
    final /* synthetic */ Function1<Boolean, Unit> $onSetAsDefaultClick;
    final /* synthetic */ boolean $primaryButtonEnabled;
    final /* synthetic */ boolean $setAsDefaultChecked;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nCardEditScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardEditScreen.kt\ncom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,193:1\n154#2:194\n*S KotlinDebug\n*F\n+ 1 CardEditScreen.kt\ncom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4$1\n*L\n140#1:194\n*E\n"})
    /* renamed from: com.stripe.android.link.ui.cardedit.CardEditScreenKt$CardEditBody$4$1 */
    /* loaded from: classes7.dex */
    public static final class C190071 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $$dirty$1;
        final /* synthetic */ Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> $formContent;
        final /* synthetic */ boolean $isDefault;
        final /* synthetic */ boolean $isProcessing;
        final /* synthetic */ Function1<Boolean, Unit> $onSetAsDefaultClick;
        final /* synthetic */ boolean $setAsDefaultChecked;
        final /* synthetic */ InterfaceC35231Pm0 $this_ScrollableTopLevelColumn;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C190071(Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, InterfaceC35231Pm0 interfaceC35231Pm0, int i, int i2, boolean z, boolean z2, boolean z3, Function1<? super Boolean, Unit> function1) {
            super(2);
            this.$formContent = function3;
            this.$this_ScrollableTopLevelColumn = interfaceC35231Pm0;
            this.$$dirty = i;
            this.$$dirty$1 = i2;
            this.$setAsDefaultChecked = z;
            this.$isDefault = z2;
            this.$isProcessing = z3;
            this.$onSetAsDefaultClick = function1;
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
                C35528Qt0.m87816Z(-473288965, i, -1, "com.stripe.android.link.ui.cardedit.CardEditBody.<anonymous>.<anonymous> (CardEditScreen.kt:136)");
            }
            this.$formContent.invoke(this.$this_ScrollableTopLevelColumn, interfaceC32720Et0, Integer.valueOf((this.$$dirty & 14) | ((this.$$dirty$1 >> 21) & 112)));
            DN5.m110552a(BB5.m114254o(InterfaceC41563gV2.f82354b0, C43705k61.m29303g(8)), interfaceC32720Et0, 6);
            boolean z = this.$setAsDefaultChecked;
            boolean z2 = this.$isDefault;
            boolean z3 = this.$isProcessing;
            Function1<Boolean, Unit> function1 = this.$onSetAsDefaultClick;
            int i2 = this.$$dirty$1;
            CardEditScreenKt.DefaultPaymentMethodCheckbox(z, z2, z3, function1, interfaceC32720Et0, ((i2 >> 6) & 14) | (i2 & 112) | ((i2 << 6) & 896) | ((i2 >> 6) & 7168));
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nCardEditScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardEditScreen.kt\ncom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,193:1\n76#2:194\n*S KotlinDebug\n*F\n+ 1 CardEditScreen.kt\ncom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4$2\n*L\n152#1:194\n*E\n"})
    /* renamed from: com.stripe.android.link.ui.cardedit.CardEditScreenKt$CardEditBody$4$2 */
    /* loaded from: classes7.dex */
    public static final class C190082 extends Lambda implements Function3<InterfaceC7907Te, InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ ErrorMessage $errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190082(ErrorMessage errorMessage) {
            super(3);
            this.$errorMessage = errorMessage;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC7907Te interfaceC7907Te, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC7907Te, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC7907Te AnimatedVisibility, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            String str;
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1273364993, i, -1, "com.stripe.android.link.ui.cardedit.CardEditBody.<anonymous>.<anonymous> (CardEditScreen.kt:149)");
            }
            ErrorMessage errorMessage = this.$errorMessage;
            if (errorMessage != null) {
                Resources resources = ((Context) interfaceC32720Et0.mo89572c(C11411h.m68324g())).getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "LocalContext.current.resources");
                str = errorMessage.getMessage(resources);
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            ErrorTextKt.ErrorText(str, BB5.m114255n(InterfaceC41563gV2.f82354b0, 0.0f, 1, null), null, interfaceC32720Et0, 48, 4);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardEditScreenKt$CardEditBody$4(ErrorMessage errorMessage, boolean z, boolean z2, Function0<Unit> function0, int i, Function0<Unit> function02, Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, boolean z3, boolean z4, Function1<? super Boolean, Unit> function1) {
        super(3);
        this.$errorMessage = errorMessage;
        this.$isProcessing = z;
        this.$primaryButtonEnabled = z2;
        this.$onPrimaryButtonClick = function0;
        this.$$dirty = i;
        this.$onCancelClick = function02;
        this.$formContent = function3;
        this.$setAsDefaultChecked = z3;
        this.$isDefault = z4;
        this.$onSetAsDefaultClick = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC35231Pm0 interfaceC35231Pm0, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC35231Pm0, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC35231Pm0 ScrollableTopLevelColumn, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        PrimaryButtonState primaryButtonState;
        Intrinsics.checkNotNullParameter(ScrollableTopLevelColumn, "$this$ScrollableTopLevelColumn");
        if ((i & 14) == 0) {
            i2 = i | (interfaceC32720Et0.mo89539n(ScrollableTopLevelColumn) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) == 18 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(2091799335, i2, -1, "com.stripe.android.link.ui.cardedit.CardEditBody.<anonymous> (CardEditScreen.kt:127)");
        }
        int i3 = C18975R.string.wallet_update_card;
        String m41310c = C40946fS5.m41310c(i3, interfaceC32720Et0, 0);
        InterfaceC41563gV2 m94180m = ND3.m94180m(InterfaceC41563gV2.f82354b0, 0.0f, C43705k61.m29303g(4), 0.0f, C43705k61.m29303g(32), 5, null);
        int m16678a = C47801r06.f106195b.m16678a();
        TM2 tm2 = TM2.f35372a;
        int i4 = TM2.f35373b;
        C38909c26.m62000e(m41310c, m94180m, tm2.m83731a(interfaceC32720Et0, i4).m94903g(), 0L, null, null, null, 0L, null, C47801r06.m16685g(m16678a), 0L, 0, false, 0, null, tm2.m83729c(interfaceC32720Et0, i4).m104961g(), interfaceC32720Et0, 48, 0, 32248);
        int i5 = i2;
        ColorKt.StripeThemeForLink(C43575jt0.m29791b(interfaceC32720Et0, -473288965, true, new C190071(this.$formContent, ScrollableTopLevelColumn, i2, this.$$dirty, this.$setAsDefaultChecked, this.$isDefault, this.$isProcessing, this.$onSetAsDefaultClick)), interfaceC32720Et0, 6);
        ErrorMessage errorMessage = this.$errorMessage;
        C7489Se.m85173b(ScrollableTopLevelColumn, errorMessage != null, null, null, null, null, C43575jt0.m29791b(interfaceC32720Et0, -1273364993, true, new C190082(errorMessage)), interfaceC32720Et0, (i5 & 14) | 1572864, 30);
        String m41310c2 = C40946fS5.m41310c(i3, interfaceC32720Et0, 0);
        if (this.$isProcessing) {
            primaryButtonState = PrimaryButtonState.Processing;
        } else {
            primaryButtonState = this.$primaryButtonEnabled ? PrimaryButtonState.Enabled : PrimaryButtonState.Disabled;
        }
        PrimaryButtonKt.PrimaryButton(m41310c2, primaryButtonState, this.$onPrimaryButtonClick, null, null, interfaceC32720Et0, (this.$$dirty >> 12) & 896, 24);
        PrimaryButtonKt.SecondaryButton(!this.$isProcessing, C40946fS5.m41310c(C18975R.string.cancel, interfaceC32720Et0, 0), this.$onCancelClick, interfaceC32720Et0, (this.$$dirty >> 15) & 896);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
