package com.stripe.android.paymentsheet.addresselement;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class InputAddressScreenKt$InputAddressScreen$2 extends Lambda implements Function3<PD3, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> $checkboxContent;
    final /* synthetic */ InterfaceC32037Bv1 $focusManager;
    final /* synthetic */ Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> $formContent;
    final /* synthetic */ Function0<Unit> $onPrimaryButtonClick;
    final /* synthetic */ boolean $primaryButtonEnabled;
    final /* synthetic */ String $primaryButtonText;
    final /* synthetic */ String $title;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nInputAddressScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputAddressScreen.kt\ncom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt$InputAddressScreen$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,144:1\n154#2:145\n154#2:179\n74#3,6:146\n80#3:178\n84#3:184\n75#4:152\n76#4,11:154\n89#4:183\n76#5:153\n460#6,13:165\n473#6,3:180\n*S KotlinDebug\n*F\n+ 1 InputAddressScreen.kt\ncom/stripe/android/paymentsheet/addresselement/InputAddressScreenKt$InputAddressScreen$2$1\n*L\n59#1:145\n64#1:179\n58#1:146,6\n58#1:178\n58#1:184\n58#1:152\n58#1:154,11\n58#1:183\n58#1:153\n58#1:165,13\n58#1:180,3\n*E\n"})
    /* renamed from: com.stripe.android.paymentsheet.addresselement.InputAddressScreenKt$InputAddressScreen$2$1 */
    /* loaded from: classes7.dex */
    public static final class C191871 extends Lambda implements Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> $checkboxContent;
        final /* synthetic */ InterfaceC32037Bv1 $focusManager;
        final /* synthetic */ Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> $formContent;
        final /* synthetic */ Function0<Unit> $onPrimaryButtonClick;
        final /* synthetic */ boolean $primaryButtonEnabled;
        final /* synthetic */ String $primaryButtonText;
        final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C191871(String str, int i, Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function32, boolean z, String str2, InterfaceC32037Bv1 interfaceC32037Bv1, Function0<Unit> function0) {
            super(3);
            this.$title = str;
            this.$$dirty = i;
            this.$formContent = function3;
            this.$checkboxContent = function32;
            this.$primaryButtonEnabled = z;
            this.$primaryButtonText = str2;
            this.$focusManager = interfaceC32037Bv1;
            this.$onPrimaryButtonClick = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC35231Pm0 interfaceC35231Pm0, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC35231Pm0, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC35231Pm0 ScrollableColumn, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(ScrollableColumn, "$this$ScrollableColumn");
            if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(178055957, i, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen.<anonymous>.<anonymous> (InputAddressScreen.kt:56)");
            }
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            InterfaceC41563gV2 m94182k = ND3.m94182k(c20912a, C43705k61.m29303g(20), 0.0f, 2, null);
            String str = this.$title;
            int i2 = this.$$dirty;
            Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> function3 = this.$formContent;
            Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> function32 = this.$checkboxContent;
            boolean z = this.$primaryButtonEnabled;
            String str2 = this.$primaryButtonText;
            InterfaceC32037Bv1 interfaceC32037Bv1 = this.$focusManager;
            Function0<Unit> function0 = this.$onPrimaryButtonClick;
            interfaceC32720Et0.mo89638F(-483455358);
            InterfaceC51579xO2 m91546a = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m94182k);
            if (!(interfaceC32720Et0.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            interfaceC32720Et0.mo89557h();
            if (interfaceC32720Et0.mo89521t()) {
                interfaceC32720Et0.mo89617M(m113415a);
            } else {
                interfaceC32720Et0.mo89566e();
            }
            interfaceC32720Et0.mo89620L();
            InterfaceC32720Et0 m64192a = C38680bf6.m64192a(interfaceC32720Et0);
            C38680bf6.m64191b(m64192a, m91546a, c0757a.m113412d());
            C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
            C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
            C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
            interfaceC32720Et0.mo89530q();
            m115273a.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89638F(2058660585);
            interfaceC32720Et0.mo89638F(-1163856341);
            C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
            interfaceC32720Et0.mo89638F(1167112587);
            C38909c26.m62000e(str, ND3.m94180m(c20912a, 0.0f, 0.0f, 0.0f, C43705k61.m29303g(8), 7, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, TM2.f35372a.m83729c(interfaceC32720Et0, TM2.f35373b).m104960h(), interfaceC32720Et0, ((i2 >> 6) & 14) | 48, 0, 32764);
            function3.invoke(c35465Qm0, interfaceC32720Et0, Integer.valueOf(((i2 >> 12) & 112) | 6));
            function32.invoke(c35465Qm0, interfaceC32720Et0, Integer.valueOf(((i2 >> 15) & 112) | 6));
            AddressElementPrimaryButtonKt.AddressElementPrimaryButton(z, str2, new InputAddressScreenKt$InputAddressScreen$2$1$1$1(interfaceC32037Bv1, function0), interfaceC32720Et0, (i2 & 14) | (i2 & 112));
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89563f();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputAddressScreenKt$InputAddressScreen$2(String str, int i, Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function32, boolean z, String str2, InterfaceC32037Bv1 interfaceC32037Bv1, Function0<Unit> function0) {
        super(3);
        this.$title = str;
        this.$$dirty = i;
        this.$formContent = function3;
        this.$checkboxContent = function32;
        this.$primaryButtonEnabled = z;
        this.$primaryButtonText = str2;
        this.$focusManager = interfaceC32037Bv1;
        this.$onPrimaryButtonClick = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PD3 pd3, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(pd3, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PD3 it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(it, "it");
        if ((i & 14) == 0) {
            i2 = (interfaceC32720Et0.mo89539n(it) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) == 18 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(973020890, i, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen.<anonymous> (InputAddressScreen.kt:53)");
        }
        AddressUtilsKt.ScrollableColumn(ND3.m94185h(InterfaceC41563gV2.f82354b0, it), C43575jt0.m29791b(interfaceC32720Et0, 178055957, true, new C191871(this.$title, this.$$dirty, this.$formContent, this.$checkboxContent, this.$primaryButtonEnabled, this.$primaryButtonText, this.$focusManager, this.$onPrimaryButtonClick)), interfaceC32720Et0, 48, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
