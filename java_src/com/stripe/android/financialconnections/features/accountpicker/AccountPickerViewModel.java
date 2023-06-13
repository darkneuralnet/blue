package com.stripe.android.financialconnections.features.accountpicker;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.GetManifest;
import com.stripe.android.financialconnections.domain.GoNext;
import com.stripe.android.financialconnections.domain.PollAuthorizationSessionAccounts;
import com.stripe.android.financialconnections.domain.SelectAccounts;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.model.PartnerAccountsList;
import com.stripe.android.financialconnections.navigation.NavigationDirections;
import com.stripe.android.financialconnections.navigation.NavigationManager;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.uicore.format.CurrencyFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty1;
import p000.WN2;
@Metadata(m28433d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00018BS\b\u0007\u0012\u0006\u00105\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00103\u001a\u000202¢\u0006\u0004\b6\u00107J\b\u0010\u0004\u001a\u00020\u0003H\u0002J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\f\u001a\u00020\u0003H\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\u001e\u0010\u0013\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u000e\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0003J\u0006\u0010\u0018\u001a\u00020\u0003J\u0006\u0010\u0019\u001a\u00020\u0003J\u0006\u0010\u001a\u001a\u00020\u0003J\u0006\u0010\u001b\u001a\u00020\u0003J\u0006\u0010\u001c\u001a\u00020\u0003R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u0004\u0018\u00010)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00069"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;", "LRN2;", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;", "", "loadAccounts", "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;", "partnerAccountList", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "activeInstitution", "", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;", "buildAccountList", "onPayloadLoaded", "logErrors", "", "", "selectedIds", "", "updateLocalCache", "submitAccounts", "Lcom/stripe/android/financialconnections/model/PartnerAccount;", "account", "onAccountClicked", "onSubmit", "selectAnotherBank", "onEnterDetailsManually", "onLoadAccountsAgain", "onSelectAllAccountsClicked", "onLearnMoreAboutDataAccessClick", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "Lcom/stripe/android/financialconnections/domain/SelectAccounts;", "selectAccounts", "Lcom/stripe/android/financialconnections/domain/SelectAccounts;", "Lcom/stripe/android/financialconnections/domain/GetManifest;", "getManifest", "Lcom/stripe/android/financialconnections/domain/GetManifest;", "Lcom/stripe/android/financialconnections/domain/GoNext;", "goNext", "Lcom/stripe/android/financialconnections/domain/GoNext;", "Ljava/util/Locale;", "locale", "Ljava/util/Locale;", "Lcom/stripe/android/financialconnections/navigation/NavigationManager;", "navigationManager", "Lcom/stripe/android/financialconnections/navigation/NavigationManager;", "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/core/Logger;", "Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;", "pollAuthorizationSessionAccounts", "Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;", "initialState", "<init>", "(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/SelectAccounts;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/domain/GoNext;Ljava/util/Locale;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;)V", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAccountPickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,323:1\n1549#2:324\n1620#2,3:325\n1045#2:328\n*S KotlinDebug\n*F\n+ 1 AccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel\n*L\n108#1:324\n108#1:325,3\n124#1:328\n*E\n"})
/* loaded from: classes7.dex */
public final class AccountPickerViewModel extends RN2<AccountPickerState> {
    public static final Companion Companion = new Companion(null);
    private final FinancialConnectionsAnalyticsTracker eventTracker;
    private final GetManifest getManifest;
    private final GoNext goNext;
    private final Locale locale;
    private final Logger logger;
    private final NavigationManager navigationManager;
    private final PollAuthorizationSessionAccounts pollAuthorizationSessionAccounts;
    private final SelectAccounts selectAccounts;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$Companion;", "LWN2;", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;", "LPr6;", "viewModelContext", TransferTable.COLUMN_STATE, "create", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion implements WN2<AccountPickerViewModel, AccountPickerState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public AccountPickerViewModel create(AbstractC35282Pr6 viewModelContext, AccountPickerState state) {
            Intrinsics.checkNotNullParameter(viewModelContext, "viewModelContext");
            Intrinsics.checkNotNullParameter(state, "state");
            return ((FinancialConnectionsSheetNativeActivity) viewModelContext.m89681a()).getViewModel().getActivityRetainedComponent().getAccountPickerBuilder().initialState(state).build().getViewModel();
        }

        public AccountPickerState initialState(AbstractC35282Pr6 abstractC35282Pr6) {
            return (AccountPickerState) WN2.C9011a.m78516a(this, abstractC35282Pr6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPickerViewModel(AccountPickerState initialState, FinancialConnectionsAnalyticsTracker eventTracker, SelectAccounts selectAccounts, GetManifest getManifest, GoNext goNext, Locale locale, NavigationManager navigationManager, Logger logger, PollAuthorizationSessionAccounts pollAuthorizationSessionAccounts) {
        super(initialState, null, 2, null);
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(selectAccounts, "selectAccounts");
        Intrinsics.checkNotNullParameter(getManifest, "getManifest");
        Intrinsics.checkNotNullParameter(goNext, "goNext");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(pollAuthorizationSessionAccounts, "pollAuthorizationSessionAccounts");
        this.eventTracker = eventTracker;
        this.selectAccounts = selectAccounts;
        this.getManifest = getManifest;
        this.goNext = goNext;
        this.locale = locale;
        this.navigationManager = navigationManager;
        this.logger = logger;
        this.pollAuthorizationSessionAccounts = pollAuthorizationSessionAccounts;
        logErrors();
        onPayloadLoaded();
        loadAccounts();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<AccountPickerState.PartnerAccountUI> buildAccountList(PartnerAccountsList partnerAccountsList, FinancialConnectionsInstitution financialConnectionsInstitution) {
        int collectionSizeOrDefault;
        List<AccountPickerState.PartnerAccountUI> sortedWith;
        String str;
        Image icon;
        List<PartnerAccount> data = partnerAccountsList.getData();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(data, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (PartnerAccount partnerAccount : data) {
            String str2 = null;
            if (financialConnectionsInstitution != null && (icon = financialConnectionsInstitution.getIcon()) != null) {
                str = icon.getDefault();
            } else {
                str = null;
            }
            if (partnerAccount.getBalanceAmount() != null && partnerAccount.getCurrency() != null) {
                CurrencyFormatter currencyFormatter = CurrencyFormatter.INSTANCE;
                long intValue = partnerAccount.getBalanceAmount().intValue();
                String currency = partnerAccount.getCurrency();
                Locale locale = this.locale;
                if (locale == null) {
                    locale = Locale.getDefault();
                }
                Intrinsics.checkNotNullExpressionValue(locale, "locale ?: Locale.getDefault()");
                str2 = currencyFormatter.format(intValue, currency, locale);
            }
            arrayList.add(new AccountPickerState.PartnerAccountUI(partnerAccount, str, str2));
        }
        sortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$buildAccountList$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compareValues;
                compareValues = ComparisonsKt__ComparisonsKt.compareValues(Boolean.valueOf(!((AccountPickerState.PartnerAccountUI) t).getAccount().getAllowSelection$financial_connections_release()), Boolean.valueOf(!((AccountPickerState.PartnerAccountUI) t2).getAccount().getAllowSelection$financial_connections_release()));
                return compareValues;
            }
        });
        return sortedWith;
    }

    private final void loadAccounts() {
        RN2.execute$default(this, new AccountPickerViewModel$loadAccounts$1(this, null), (SC0) null, (KProperty1) null, AccountPickerViewModel$loadAccounts$2.INSTANCE, 3, (Object) null);
    }

    private final void logErrors() {
        RN2.onAsync$default(this, AccountPickerViewModel$logErrors$1.INSTANCE, new AccountPickerViewModel$logErrors$2(this, null), null, 4, null);
        RN2.onAsync$default(this, AccountPickerViewModel$logErrors$3.INSTANCE, new AccountPickerViewModel$logErrors$4(this, null), null, 4, null);
    }

    private final void onPayloadLoaded() {
        RN2.onAsync$default(this, AccountPickerViewModel$onPayloadLoaded$1.INSTANCE, null, new AccountPickerViewModel$onPayloadLoaded$2(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void submitAccounts(Set<String> set, boolean z) {
        RN2.execute$default(this, new AccountPickerViewModel$submitAccounts$1(this, set, z, null), (SC0) null, (KProperty1) null, AccountPickerViewModel$submitAccounts$2.INSTANCE, 3, (Object) null);
    }

    public final void onAccountClicked(PartnerAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        withState(new AccountPickerViewModel$onAccountClicked$1(this, account));
    }

    public final void onEnterDetailsManually() {
        this.navigationManager.navigate(NavigationDirections.INSTANCE.getManualEntry());
    }

    public final void onLearnMoreAboutDataAccessClick() {
        Z30.m73800d(getViewModelScope(), null, null, new AccountPickerViewModel$onLearnMoreAboutDataAccessClick$1(this, null), 3, null);
    }

    public final void onLoadAccountsAgain() {
        setState(AccountPickerViewModel$onLoadAccountsAgain$1.INSTANCE);
        loadAccounts();
    }

    public final void onSelectAllAccountsClicked() {
        withState(new AccountPickerViewModel$onSelectAllAccountsClicked$1(this));
    }

    public final void onSubmit() {
        Z30.m73800d(getViewModelScope(), null, null, new AccountPickerViewModel$onSubmit$1(this, null), 3, null);
        withState(new AccountPickerViewModel$onSubmit$2(this));
    }

    public final void selectAnotherBank() {
        this.navigationManager.navigate(NavigationDirections.INSTANCE.getReset());
    }
}
