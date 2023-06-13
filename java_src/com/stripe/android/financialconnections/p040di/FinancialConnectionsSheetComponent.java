package com.stripe.android.financialconnections.p040di;

import android.app.Application;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.FinancialConnectionsSheetState;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
@Component(modules = {FinancialConnectionsSheetModule.class, FinancialConnectionsSheetSharedModule.class, CoroutineContextModule.class, CoreCommonModule.class})
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent;", "", "viewModel", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;", "getViewModel", "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;", "Builder", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetComponent */
/* loaded from: classes7.dex */
public interface FinancialConnectionsSheetComponent {

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tH'¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent$Builder;", "", "application", "Landroid/app/Application;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "initialState", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @Component.Builder
    /* renamed from: com.stripe.android.financialconnections.di.FinancialConnectionsSheetComponent$Builder */
    /* loaded from: classes7.dex */
    public interface Builder {
        @BindsInstance
        Builder application(Application application);

        FinancialConnectionsSheetComponent build();

        @BindsInstance
        Builder configuration(FinancialConnectionsSheet.Configuration configuration);

        @BindsInstance
        Builder initialState(FinancialConnectionsSheetState financialConnectionsSheetState);
    }

    FinancialConnectionsSheetViewModel getViewModel();
}
