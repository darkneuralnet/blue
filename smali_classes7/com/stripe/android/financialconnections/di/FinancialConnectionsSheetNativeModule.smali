.class public final Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Module;
    subcomponents = {
        Lcom/stripe/android/financialconnections/features/consent/ConsentSubcomponent;,
        Lcom/stripe/android/financialconnections/features/manualentry/ManualEntrySubcomponent;,
        Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerSubcomponent;,
        Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthSubcomponent;,
        Lcom/stripe/android/financialconnections/features/success/SuccessSubcomponent;,
        Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerSubcomponent;,
        Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentSubcomponent;,
        Lcom/stripe/android/financialconnections/features/reset/ResetSubcomponent;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0008H\u0007J>\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00082\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000b\u001a\u00020\u000c2\n\u0008\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0008\u0010\u0019\u001a\u00020\u001aH\u0007\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;",
        "",
        "()V",
        "providesFinancialConnectionsAccountsRepository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;",
        "requestExecutor",
        "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;",
        "apiOptions",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "apiRequestFactory",
        "Lcom/stripe/android/core/networking/ApiRequest$Factory;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "providesFinancialConnectionsInstitutionsRepository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;",
        "providesFinancialConnectionsManifestRepository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;",
        "locale",
        "Ljava/util/Locale;",
        "initialSynchronizeSessionResponse",
        "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;",
        "providesImageLoader",
        "Lcom/stripe/android/uicore/image/StripeImageLoader;",
        "context",
        "Landroid/app/Application;",
        "providesNavigationManager",
        "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final providesFinancialConnectionsAccountsRepository(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "requestExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiOptions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiRequestFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;->Companion:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository$Companion;

    invoke-virtual {v0, p1, p3, p2, p4}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository$Companion;->invoke(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;

    move-result-object p1

    return-object p1
.end method

.method public final providesFinancialConnectionsInstitutionsRepository(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/core/networking/ApiRequest$Options;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "requestExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiRequestFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiOptions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;->Companion:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository$Companion;

    invoke-virtual {v0, p1, p3, p2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository$Companion;->invoke(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/networking/ApiRequest$Factory;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;

    move-result-object p1

    return-object p1
.end method

.method public final providesFinancialConnectionsManifestRepository(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Locale;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;
    .locals 8
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "requestExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiRequestFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiOptions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;->Companion:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository$Companion;

    if-nez p4, :cond_0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p4

    :cond_0
    move-object v6, p4

    const-string p4, "locale ?: Locale.getDefault()"

    invoke-static {v6, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p5

    move-object v7, p6

    invoke-virtual/range {v1 .. v7}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository$Companion;->invoke(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/Logger;Ljava/util/Locale;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;

    move-result-object p1

    return-object p1
.end method

.method public final providesImageLoader(Landroid/app/Application;)Lcom/stripe/android/uicore/image/StripeImageLoader;
    .locals 9
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/uicore/image/StripeImageLoader;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xe

    const/4 v8, 0x0

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/uicore/image/StripeImageLoader;-><init>(Landroid/content/Context;Lcom/stripe/android/core/Logger;Lcom/stripe/android/uicore/image/ImageLruMemoryCache;Lcom/stripe/android/uicore/image/NetworkImageDecoder;Lcom/stripe/android/uicore/image/ImageLruDiskCache;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final providesNavigationManager()Lcom/stripe/android/financialconnections/navigation/NavigationManager;
    .locals 3
    .annotation runtime Ldagger/Provides;
    .end annotation

    new-instance v0, Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v2, v1}, LXU5;->b(Lzh2;ILjava/lang/Object;)Lms0;

    move-result-object v1

    invoke-static {}, LT41;->a()LSC0;

    move-result-object v2

    invoke-interface {v1, v2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v1

    invoke-static {v1}, LaD0;->a(Lkotlin/coroutines/CoroutineContext;)LZC0;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/navigation/NavigationManager;-><init>(LZC0;)V

    return-object v0
.end method
