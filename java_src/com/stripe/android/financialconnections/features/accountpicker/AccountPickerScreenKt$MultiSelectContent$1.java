package com.stripe.android.financialconnections.features.accountpicker;

import com.stripe.android.financialconnections.C18634R;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.PartnerAccount;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nAccountPickerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountPickerScreen.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$MultiSelectContent$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,521:1\n136#2,12:522\n*S KotlinDebug\n*F\n+ 1 AccountPickerScreen.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$MultiSelectContent$1\n*L\n323#1:522,12\n*E\n"})
/* loaded from: classes7.dex */
public final class AccountPickerScreenKt$MultiSelectContent$1 extends Lambda implements Function1<InterfaceC52420yo2, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ List<AccountPickerState.PartnerAccountUI> $accounts;
    final /* synthetic */ boolean $allAccountsSelected;
    final /* synthetic */ Function1<PartnerAccount, Unit> $onAccountClicked;
    final /* synthetic */ Function0<Unit> $onSelectAllAccountsClicked;
    final /* synthetic */ Set<String> $selectedIds;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nAccountPickerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountPickerScreen.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$MultiSelectContent$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,521:1\n36#2:522\n1057#3,6:523\n*S KotlinDebug\n*F\n+ 1 AccountPickerScreen.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$MultiSelectContent$1$1\n*L\n302#1:522\n302#1:523,6\n*E\n"})
    /* renamed from: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$MultiSelectContent$1$1 */
    /* loaded from: classes7.dex */
    public static final class C186651 extends Lambda implements Function3<InterfaceC34306Ln2, InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ boolean $allAccountsSelected;
        final /* synthetic */ Function0<Unit> $onSelectAllAccountsClicked;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$MultiSelectContent$1$1$2 */
        /* loaded from: classes7.dex */
        public static final class C186662 extends Lambda implements Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ boolean $allAccountsSelected;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C186662(boolean z, int i) {
                super(3);
                this.$allAccountsSelected = z;
                this.$$dirty = i;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC37486Zc5 interfaceC37486Zc5, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(interfaceC37486Zc5, interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(InterfaceC37486Zc5 AccountItem, InterfaceC32720Et0 interfaceC32720Et0, int i) {
                Intrinsics.checkNotNullParameter(AccountItem, "$this$AccountItem");
                if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
                    interfaceC32720Et0.mo89548k();
                    return;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-2027106933, i, -1, "com.stripe.android.financialconnections.features.accountpicker.MultiSelectContent.<anonymous>.<anonymous>.<anonymous> (AccountPickerScreen.kt:316)");
                }
                AccountPickerScreenKt.FinancialConnectionCheckbox(this.$allAccountsSelected, interfaceC32720Et0, (this.$$dirty >> 12) & 14);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C186651(boolean z, Function0<Unit> function0, int i) {
            super(3);
            this.$allAccountsSelected = z;
            this.$onSelectAllAccountsClicked = function0;
            this.$$dirty = i;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC34306Ln2 interfaceC34306Ln2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC34306Ln2, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r28v0, types: [Et0] */
        /* JADX WARN: Type inference failed for: r4v2 */
        public final void invoke(InterfaceC34306Ln2 item, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            List emptyList;
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1710406049, i, -1, "com.stripe.android.financialconnections.features.accountpicker.MultiSelectContent.<anonymous>.<anonymous> (AccountPickerScreen.kt:298)");
            }
            boolean z = this.$allAccountsSelected;
            Function0<Unit> function0 = this.$onSelectAllAccountsClicked;
            interfaceC32720Et0.mo89638F(1157296644);
            boolean mo89539n = interfaceC32720Et0.mo89539n(function0);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new AccountPickerScreenKt$MultiSelectContent$1$1$1$1(function0);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            FinancialConnectionsAccount.Category category = FinancialConnectionsAccount.Category.UNKNOWN;
            FinancialConnectionsAccount.Subcategory subcategory = FinancialConnectionsAccount.Subcategory.UNKNOWN;
            String m41310c = C40946fS5.m41310c(C18634R.string.stripe_account_picker_select_all_accounts, interfaceC32720Et0, 0);
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            AccountPickerScreenKt.AccountItem(z, mo89635G, new AccountPickerState.PartnerAccountUI(new PartnerAccount("", category, "select_all_accounts", m41310c, subcategory, emptyList, (Integer) null, (String) null, (String) null, (Integer) null, (String) null, Boolean.TRUE, "", (String) null, (String) null, (String) null, (FinancialConnectionsAccount.Status) null, 124864, (DefaultConstructorMarker) null), null, null), C43575jt0.m29791b(interfaceC32720Et0, -2027106933, true, new C186662(this.$allAccountsSelected, this.$$dirty)), interfaceC32720Et0, ((this.$$dirty >> 12) & 14) | 3584);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$MultiSelectContent$1$2 */
    /* loaded from: classes7.dex */
    public static final class C186672 extends Lambda implements Function1<AccountPickerState.PartnerAccountUI, Object> {
        public static final C186672 INSTANCE = new C186672();

        public C186672() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(AccountPickerState.PartnerAccountUI it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getAccount().getId();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AccountPickerScreenKt$MultiSelectContent$1(List<AccountPickerState.PartnerAccountUI> list, boolean z, Function0<Unit> function0, int i, Set<String> set, Function1<? super PartnerAccount, Unit> function1) {
        super(1);
        this.$accounts = list;
        this.$allAccountsSelected = z;
        this.$onSelectAllAccountsClicked = function0;
        this.$$dirty = i;
        this.$selectedIds = set;
        this.$onAccountClicked = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC52420yo2 interfaceC52420yo2) {
        invoke2(interfaceC52420yo2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC52420yo2 LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        InterfaceC52420yo2.m2567a(LazyColumn, "select_all_accounts", null, C43575jt0.m29790c(1710406049, true, new C186651(this.$allAccountsSelected, this.$onSelectAllAccountsClicked, this.$$dirty)), 2, null);
        List<AccountPickerState.PartnerAccountUI> list = this.$accounts;
        C186672 c186672 = C186672.INSTANCE;
        Set<String> set = this.$selectedIds;
        Function1<PartnerAccount, Unit> function1 = this.$onAccountClicked;
        int i = this.$$dirty;
        LazyColumn.mo409c(list.size(), c186672 != null ? new C18657x3df1a43b(c186672, list) : null, new C18658x3df1a43c(C18656x3df1a43a.INSTANCE, list), C43575jt0.m29790c(-632812321, true, new C18659x3df1a43d(list, set, function1, i)));
    }
}
