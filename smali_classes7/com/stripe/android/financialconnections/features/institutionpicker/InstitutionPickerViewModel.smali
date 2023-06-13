.class public final Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;
.super LRN2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LRN2<",
        "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 22\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u00012BQ\u0008\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010\'\u001a\u00020&\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010/\u001a\u00020\u0002\u00a2\u0006\u0004\u00080\u00101J\u0008\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u0008\u001a\u00020\u0007*\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0008\u0010\t\u001a\u00020\u0003H\u0002J\u000e\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0007J\u0006\u0010\u0011\u001a\u00020\u0003J\u0006\u0010\u0012\u001a\u00020\u0003J\u0006\u0010\u0013\u001a\u00020\u0003R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010\'\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008-\u0010.\u00a8\u00063"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;",
        "LRN2;",
        "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;",
        "",
        "logErrors",
        "Ldp;",
        "Lcom/stripe/android/financialconnections/model/InstitutionResponse;",
        "",
        "isCancellationError",
        "clearSearch",
        "",
        "query",
        "onQueryChanged",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "institution",
        "fromFeatured",
        "onInstitutionSelected",
        "onCancelSearchClick",
        "onSearchFocused",
        "onManualEntryClick",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
        "configuration",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
        "Lcom/stripe/android/financialconnections/domain/SearchInstitutions;",
        "searchInstitutions",
        "Lcom/stripe/android/financialconnections/domain/SearchInstitutions;",
        "Lcom/stripe/android/financialconnections/domain/FeaturedInstitutions;",
        "featuredInstitutions",
        "Lcom/stripe/android/financialconnections/domain/FeaturedInstitutions;",
        "Lcom/stripe/android/financialconnections/domain/GetManifest;",
        "getManifest",
        "Lcom/stripe/android/financialconnections/domain/GetManifest;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "eventTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
        "navigationManager",
        "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
        "Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;",
        "updateLocalManifest",
        "Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;",
        "Lcom/stripe/android/core/Logger;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "Lcom/stripe/android/financialconnections/utils/ConflatedJob;",
        "searchJob",
        "Lcom/stripe/android/financialconnections/utils/ConflatedJob;",
        "initialState",
        "<init>",
        "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Lcom/stripe/android/financialconnections/domain/SearchInstitutions;Lcom/stripe/android/financialconnections/domain/FeaturedInstitutions;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;)V",
        "Companion",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$Companion;

.field private static final SEARCH_DEBOUNCE_MS:J = 0x12cL


# instance fields
.field private final configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

.field private final eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

.field private final featuredInstitutions:Lcom/stripe/android/financialconnections/domain/FeaturedInstitutions;

.field private final getManifest:Lcom/stripe/android/financialconnections/domain/GetManifest;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final navigationManager:Lcom/stripe/android/financialconnections/navigation/NavigationManager;

.field private final searchInstitutions:Lcom/stripe/android/financialconnections/domain/SearchInstitutions;

.field private searchJob:Lcom/stripe/android/financialconnections/utils/ConflatedJob;

.field private final updateLocalManifest:Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;->Companion:Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Lcom/stripe/android/financialconnections/domain/SearchInstitutions;Lcom/stripe/android/financialconnections/domain/FeaturedInstitutions;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;)V
    .locals 2

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "searchInstitutions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featuredInstitutions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getManifest"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTracker"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationManager"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateLocalManifest"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialState"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p0, p9, v1, v0, v1}, LRN2;-><init>(LAN2;LTN2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;->searchInstitutions:Lcom/stripe/android/financialconnections/domain/SearchInstitutions;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;->featuredInstitutions:Lcom/stripe/android/financialconnections/domain/FeaturedInstitutions;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;->getManifest:Lcom/stripe/android/financialconnections/domain/GetManifest;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;->navigationManager:Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;->updateLocalManifest:Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;

    iput-object p8, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;->logger:Lcom/stripe/android/core/Logger;

    new-instance p1, Lcom/stripe/android/financialconnections/utils/ConflatedJob;

    invoke-direct {p1}, Lcom/stripe/android/financialconnections/utils/ConflatedJob;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;->searchJob:Lcom/stripe/android/financialconnections/utils/ConflatedJob;

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;->logErrors()V

    new-instance p3, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$1;

    invoke-direct {p3, p0, v1}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$1;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 p4, 0x0

    const/4 p5, 0x0

    sget-object p6, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$2;->INSTANCE:Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$2;

    const/4 p7, 0x3

    const/4 p8, 0x0

    move-object p2, p0

    invoke-static/range {p2 .. p8}, LRN2;->execute$default(LRN2;Lkotlin/jvm/functions/Function1;LSC0;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public static final synthetic access$getConfiguration$p(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    return-object p0
.end method

.method public static final synthetic access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    return-object p0
.end method

.method public static final synthetic access$getFeaturedInstitutions$p(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;)Lcom/stripe/android/financialconnections/domain/FeaturedInstitutions;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;->featuredInstitutions:Lcom/stripe/android/financialconnections/domain/FeaturedInstitutions;

    return-object p0
.end method

.method public static final synthetic access$getGetManifest$p(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;)Lcom/stripe/android/financialconnections/domain/GetManifest;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;->getManifest:Lcom/stripe/android/financialconnections/domain/GetManifest;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;)Lcom/stripe/android/core/Logger;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getNavigationManager$p(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;)Lcom/stripe/android/financialconnections/navigation/NavigationManager;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;->navigationManager:Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    return-object p0
.end method

.method public static final synthetic access$getSearchInstitutions$p(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;)Lcom/stripe/android/financialconnections/domain/SearchInstitutions;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;->searchInstitutions:Lcom/stripe/android/financialconnections/domain/SearchInstitutions;

    return-object p0
.end method

.method public static final synthetic access$getUpdateLocalManifest$p(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;)Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;->updateLocalManifest:Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;

    return-object p0
.end method

.method public static final synthetic access$isCancellationError(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;Ldp;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;->isCancellationError(Ldp;)Z

    move-result p0

    return p0
.end method

.method private final clearSearch()V
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$clearSearch$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$clearSearch$1;

    invoke-virtual {p0, v0}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final isCancellationError(Ldp;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/model/InstitutionResponse;",
            ">;)Z"
        }
    .end annotation

    instance-of v0, p1, LCj1;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    check-cast p1, LCj1;

    invoke-virtual {p1}, LCj1;->b()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Ljava/util/concurrent/CancellationException;

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    :goto_0
    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, LCj1;->b()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Lcom/stripe/android/core/exception/StripeException;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LCj1;->b()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p1, p1, Ljava/util/concurrent/CancellationException;

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    return v1
.end method

.method private final logErrors()V
    .locals 10

    sget-object v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$logErrors$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$logErrors$1;

    new-instance v1, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$logErrors$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$logErrors$2;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;Lkotlin/coroutines/Continuation;)V

    new-instance v3, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$logErrors$3;

    invoke-direct {v3, p0, v2}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$logErrors$3;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;Lkotlin/coroutines/Continuation;)V

    invoke-virtual {p0, v0, v1, v3}, LRN2;->onAsync(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lzh2;

    sget-object v5, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$logErrors$4;->INSTANCE:Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$logErrors$4;

    new-instance v6, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$logErrors$5;

    invoke-direct {v6, p0, v2}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$logErrors$5;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    move-object v4, p0

    invoke-static/range {v4 .. v9}, LRN2;->onAsync$default(LRN2;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method


# virtual methods
.method public final onCancelSearchClick()V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;->clearSearch()V

    return-void
.end method

.method public final onInstitutionSelected(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Z)V
    .locals 8

    const-string v0, "institution"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;->clearSearch()V

    new-instance v2, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$onInstitutionSelected$1;

    const/4 v0, 0x0

    invoke-direct {v2, p0, p2, p1, v0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$onInstitutionSelected$1;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lkotlin/coroutines/Continuation;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v5, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$onInstitutionSelected$2;->INSTANCE:Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$onInstitutionSelected$2;

    const/4 v6, 0x3

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, LRN2;->execute$default(LRN2;Lkotlin/jvm/functions/Function1;LSC0;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final onManualEntryClick()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;->navigationManager:Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    sget-object v1, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/NavigationDirections;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->getManualEntry()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/financialconnections/navigation/NavigationManager;->navigate(Lcom/stripe/android/financialconnections/navigation/NavigationCommand;)V

    return-void
.end method

.method public final onQueryChanged(Ljava/lang/String;)V
    .locals 8

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;->searchJob:Lcom/stripe/android/financialconnections/utils/ConflatedJob;

    new-instance v2, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$onQueryChanged$1;

    const/4 v1, 0x0

    invoke-direct {v2, p1, p0, v1}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$onQueryChanged$1;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$onQueryChanged$2;

    invoke-direct {v5, p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$onQueryChanged$2;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, LRN2;->execute$default(LRN2;Lkotlin/jvm/functions/Function1;LSC0;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/stripe/android/financialconnections/utils/ConflatedJob;->plusAssign(Lzh2;)V

    return-void
.end method

.method public final onSearchFocused()V
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$onSearchFocused$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$onSearchFocused$1;

    invoke-virtual {p0, v0}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
