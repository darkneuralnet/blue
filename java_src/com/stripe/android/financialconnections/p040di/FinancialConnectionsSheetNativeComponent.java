package com.stripe.android.financialconnections.p040di;

import android.app.Application;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerSubcomponent;
import com.stripe.android.financialconnections.features.attachpayment.AttachPaymentSubcomponent;
import com.stripe.android.financialconnections.features.consent.ConsentSubcomponent;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerSubcomponent;
import com.stripe.android.financialconnections.features.manualentry.ManualEntrySubcomponent;
import com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessSubcomponent;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthSubcomponent;
import com.stripe.android.financialconnections.features.reset.ResetSubcomponent;
import com.stripe.android.financialconnections.features.success.SuccessSubcomponent;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
@Component(modules = {FinancialConnectionsSheetNativeModule.class, FinancialConnectionsSheetSharedModule.class, CoreCommonModule.class, CoroutineContextModule.class})
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001.J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0012\u0010\u001e\u001a\u00020\u001fX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0012\u0010\"\u001a\u00020#X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0012\u0010&\u001a\u00020'X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006/"}, m28432d2 = {"Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;", "", "accountPickerBuilder", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerSubcomponent$Builder;", "getAccountPickerBuilder", "()Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerSubcomponent$Builder;", "attachPaymentSubcomponent", "Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentSubcomponent$Builder;", "getAttachPaymentSubcomponent", "()Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentSubcomponent$Builder;", "consentBuilder", "Lcom/stripe/android/financialconnections/features/consent/ConsentSubcomponent$Builder;", "getConsentBuilder", "()Lcom/stripe/android/financialconnections/features/consent/ConsentSubcomponent$Builder;", "institutionPickerBuilder", "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerSubcomponent$Builder;", "getInstitutionPickerBuilder", "()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerSubcomponent$Builder;", "manualEntryBuilder", "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntrySubcomponent$Builder;", "getManualEntryBuilder", "()Lcom/stripe/android/financialconnections/features/manualentry/ManualEntrySubcomponent$Builder;", "manualEntrySuccessBuilder", "Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessSubcomponent$Builder;", "getManualEntrySuccessBuilder", "()Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessSubcomponent$Builder;", "partnerAuthSubcomponent", "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthSubcomponent$Builder;", "getPartnerAuthSubcomponent", "()Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthSubcomponent$Builder;", "resetSubcomponent", "Lcom/stripe/android/financialconnections/features/reset/ResetSubcomponent$Builder;", "getResetSubcomponent", "()Lcom/stripe/android/financialconnections/features/reset/ResetSubcomponent$Builder;", "successSubcomponent", "Lcom/stripe/android/financialconnections/features/success/SuccessSubcomponent$Builder;", "getSuccessSubcomponent", "()Lcom/stripe/android/financialconnections/features/success/SuccessSubcomponent$Builder;", "viewModel", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;", "getViewModel", "()Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;", "inject", "", "financialConnectionsSheetNativeActivity", "Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;", "Builder", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent */
/* loaded from: classes7.dex */
public interface FinancialConnectionsSheetNativeComponent {

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tH'J\u0014\u0010\n\u001a\u00020\u00002\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000bH'¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;", "", "application", "Landroid/app/Application;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "initialState", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;", "initialSyncResponse", "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @Component.Builder
    /* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent$Builder */
    /* loaded from: classes7.dex */
    public interface Builder {
        @BindsInstance
        Builder application(Application application);

        FinancialConnectionsSheetNativeComponent build();

        @BindsInstance
        Builder configuration(FinancialConnectionsSheet.Configuration configuration);

        @BindsInstance
        Builder initialState(FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState);

        @BindsInstance
        Builder initialSyncResponse(SynchronizeSessionResponse synchronizeSessionResponse);
    }

    AccountPickerSubcomponent.Builder getAccountPickerBuilder();

    AttachPaymentSubcomponent.Builder getAttachPaymentSubcomponent();

    ConsentSubcomponent.Builder getConsentBuilder();

    InstitutionPickerSubcomponent.Builder getInstitutionPickerBuilder();

    ManualEntrySubcomponent.Builder getManualEntryBuilder();

    ManualEntrySuccessSubcomponent.Builder getManualEntrySuccessBuilder();

    PartnerAuthSubcomponent.Builder getPartnerAuthSubcomponent();

    ResetSubcomponent.Builder getResetSubcomponent();

    SuccessSubcomponent.Builder getSuccessSubcomponent();

    FinancialConnectionsSheetNativeViewModel getViewModel();

    void inject(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity);
}
