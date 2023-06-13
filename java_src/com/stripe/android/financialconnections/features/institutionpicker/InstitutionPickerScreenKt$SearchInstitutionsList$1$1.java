package com.stripe.android.financialconnections.features.institutionpicker;

import com.stripe.android.financialconnections.C18634R;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nInstitutionPickerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstitutionPickerScreen.kt\ncom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchInstitutionsList$1$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,617:1\n136#2,12:618\n*S KotlinDebug\n*F\n+ 1 InstitutionPickerScreen.kt\ncom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchInstitutionsList$1$1\n*L\n294#1:618,12\n*E\n"})
/* loaded from: classes7.dex */
public final class InstitutionPickerScreenKt$SearchInstitutionsList$1$1 extends Lambda implements Function1<InterfaceC52420yo2, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function0<AbstractC19862dp<InstitutionResponse>> $institutionsProvider;
    final /* synthetic */ boolean $manualEntryEnabled;
    final /* synthetic */ Function2<FinancialConnectionsInstitution, Boolean, Unit> $onInstitutionSelected;
    final /* synthetic */ Function0<Unit> $onManualEntryClick;
    final /* synthetic */ String $query;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt$SearchInstitutionsList$1$1$1 */
    /* loaded from: classes7.dex */
    public static final class C187781 extends Lambda implements Function3<InterfaceC34306Ln2, InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ boolean $manualEntryEnabled;
        final /* synthetic */ Function0<Unit> $onManualEntryClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C187781(boolean z, Function0<Unit> function0, int i) {
            super(3);
            this.$manualEntryEnabled = z;
            this.$onManualEntryClick = function0;
            this.$$dirty = i;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC34306Ln2 interfaceC34306Ln2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC34306Ln2, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC34306Ln2 item, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-196563470, i, -1, "com.stripe.android.financialconnections.features.institutionpicker.SearchInstitutionsList.<anonymous>.<anonymous>.<anonymous> (InstitutionPickerScreen.kt:265)");
            }
            boolean z = this.$manualEntryEnabled;
            Function0<Unit> function0 = this.$onManualEntryClick;
            int i2 = this.$$dirty;
            InstitutionPickerScreenKt.SearchInstitutionsFailedRow(z, function0, interfaceC32720Et0, ((i2 >> 6) & 112) | ((i2 >> 12) & 14));
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt$SearchInstitutionsList$1$1$2 */
    /* loaded from: classes7.dex */
    public static final class C187792 extends Lambda implements Function3<InterfaceC34306Ln2, InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ String $query;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C187792(String str) {
            super(3);
            this.$query = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC34306Ln2 interfaceC34306Ln2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC34306Ln2, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC34306Ln2 item, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-2059275563, i, -1, "com.stripe.android.financialconnections.features.institutionpicker.SearchInstitutionsList.<anonymous>.<anonymous>.<anonymous> (InstitutionPickerScreen.kt:281)");
            }
            String m41309d = C40946fS5.m41309d(C18634R.string.stripe_picker_search_no_results, new Object[]{this.$query}, interfaceC32720Et0, 64);
            FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
            C38909c26.m62000e(m41309d, null, financialConnectionsTheme.getColors(interfaceC32720Et0, 6).m116474getTextSecondary0d7_KjU(), 0L, null, null, null, 0L, null, C47801r06.m16685g(C47801r06.f106195b.m16673f()), 0L, 0, false, 0, null, financialConnectionsTheme.getTypography(interfaceC32720Et0, 6).getDetailEmphasized(), interfaceC32720Et0, 0, 0, 32250);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt$SearchInstitutionsList$1$1$3 */
    /* loaded from: classes7.dex */
    public static final class C187803 extends Lambda implements Function1<FinancialConnectionsInstitution, Object> {
        public static final C187803 INSTANCE = new C187803();

        public C187803() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(FinancialConnectionsInstitution it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getId();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nInstitutionPickerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstitutionPickerScreen.kt\ncom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchInstitutionsList$1$1$5\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,617:1\n73#2,7:618\n80#2:651\n84#2:657\n75#3:625\n76#3,11:627\n89#3:656\n76#4:626\n460#5,13:638\n473#5,3:653\n154#6:652\n*S KotlinDebug\n*F\n+ 1 InstitutionPickerScreen.kt\ncom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchInstitutionsList$1$1$5\n*L\n299#1:618,7\n299#1:651\n299#1:657\n299#1:625\n299#1:627,11\n299#1:656\n299#1:626\n299#1:638,13\n299#1:653,3\n300#1:652\n*E\n"})
    /* renamed from: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt$SearchInstitutionsList$1$1$5 */
    /* loaded from: classes7.dex */
    public static final class C187815 extends Lambda implements Function3<InterfaceC34306Ln2, InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ boolean $manualEntryEnabled;
        final /* synthetic */ Function0<Unit> $onManualEntryClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C187815(Function0<Unit> function0, boolean z, int i) {
            super(3);
            this.$onManualEntryClick = function0;
            this.$manualEntryEnabled = z;
            this.$$dirty = i;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC34306Ln2 interfaceC34306Ln2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC34306Ln2, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC34306Ln2 item, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1096636422, i, -1, "com.stripe.android.financialconnections.features.institutionpicker.SearchInstitutionsList.<anonymous>.<anonymous>.<anonymous> (InstitutionPickerScreen.kt:297)");
            }
            Function0<Unit> function0 = this.$onManualEntryClick;
            boolean z = this.$manualEntryEnabled;
            int i2 = this.$$dirty;
            interfaceC32720Et0.mo89638F(-483455358);
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            InterfaceC51579xO2 m91546a = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(c20912a);
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
            interfaceC32720Et0.mo89638F(705168624);
            DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(16)), interfaceC32720Et0, 6);
            int i3 = i2 >> 9;
            SearchFooterKt.SearchFooter(function0, z, interfaceC32720Et0, (i3 & 112) | (i3 & 14));
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
    public InstitutionPickerScreenKt$SearchInstitutionsList$1$1(Function0<? extends AbstractC19862dp<InstitutionResponse>> function0, boolean z, Function0<Unit> function02, int i, String str, Function2<? super FinancialConnectionsInstitution, ? super Boolean, Unit> function2) {
        super(1);
        this.$institutionsProvider = function0;
        this.$manualEntryEnabled = z;
        this.$onManualEntryClick = function02;
        this.$$dirty = i;
        this.$query = str;
        this.$onInstitutionSelected = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC52420yo2 interfaceC52420yo2) {
        invoke2(interfaceC52420yo2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC52420yo2 LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        AbstractC19862dp<InstitutionResponse> invoke = this.$institutionsProvider.invoke();
        if (Intrinsics.areEqual(invoke, C34454Md6.f23316e) ? true : invoke instanceof C32163Cj1) {
            InterfaceC52420yo2.m2567a(LazyColumn, null, null, C43575jt0.m29790c(-196563470, true, new C187781(this.$manualEntryEnabled, this.$onManualEntryClick, this.$$dirty)), 3, null);
        } else if (invoke instanceof C31786At2) {
            InterfaceC52420yo2.m2567a(LazyColumn, null, null, ComposableSingletons$InstitutionPickerScreenKt.INSTANCE.m116385getLambda3$financial_connections_release(), 3, null);
        } else if (invoke instanceof C51034wT5) {
            C51034wT5 c51034wT5 = (C51034wT5) invoke;
            if (((InstitutionResponse) c51034wT5.mo6788a()).getData().isEmpty()) {
                InterfaceC52420yo2.m2567a(LazyColumn, null, null, C43575jt0.m29790c(-2059275563, true, new C187792(this.$query)), 3, null);
            } else {
                List<FinancialConnectionsInstitution> data = ((InstitutionResponse) c51034wT5.mo6788a()).getData();
                C187803 c187803 = C187803.INSTANCE;
                Function2<FinancialConnectionsInstitution, Boolean, Unit> function2 = this.$onInstitutionSelected;
                int i = this.$$dirty;
                LazyColumn.mo409c(data.size(), c187803 != null ? new C18759x55655b7a(c187803, data) : null, new C18760x55655b7b(C18758x55655b79.INSTANCE, data), C43575jt0.m29790c(-632812321, true, new C18761x55655b7c(data, function2, i)));
            }
            InterfaceC52420yo2.m2567a(LazyColumn, null, null, C43575jt0.m29790c(-1096636422, true, new C187815(this.$onManualEntryClick, this.$manualEntryEnabled, this.$$dirty)), 3, null);
        }
    }
}
