.class public final Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;",
        ">;"
    }
.end annotation


# instance fields
.field private final configurationProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
            ">;"
        }
    .end annotation
.end field

.field private final eventTrackerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
            ">;"
        }
    .end annotation
.end field

.field private final featuredInstitutionsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/FeaturedInstitutions;",
            ">;"
        }
    .end annotation
.end field

.field private final getManifestProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/GetManifest;",
            ">;"
        }
    .end annotation
.end field

.field private final initialStateProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;",
            ">;"
        }
    .end annotation
.end field

.field private final loggerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;"
        }
    .end annotation
.end field

.field private final navigationManagerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
            ">;"
        }
    .end annotation
.end field

.field private final searchInstitutionsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/SearchInstitutions;",
            ">;"
        }
    .end annotation
.end field

.field private final updateLocalManifestProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/SearchInstitutions;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/FeaturedInstitutions;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/GetManifest;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel_Factory;->configurationProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel_Factory;->searchInstitutionsProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel_Factory;->featuredInstitutionsProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel_Factory;->getManifestProvider:LY94;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel_Factory;->eventTrackerProvider:LY94;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel_Factory;->navigationManagerProvider:LY94;

    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel_Factory;->updateLocalManifestProvider:LY94;

    iput-object p8, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel_Factory;->loggerProvider:LY94;

    iput-object p9, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel_Factory;->initialStateProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel_Factory;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/SearchInstitutions;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/FeaturedInstitutions;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/GetManifest;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;",
            ">;)",
            "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel_Factory;"
        }
    .end annotation

    new-instance v10, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel_Factory;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel_Factory;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v10
.end method

.method public static newInstance(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Lcom/stripe/android/financialconnections/domain/SearchInstitutions;Lcom/stripe/android/financialconnections/domain/FeaturedInstitutions;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;
    .locals 11

    new-instance v10, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Lcom/stripe/android/financialconnections/domain/SearchInstitutions;Lcom/stripe/android/financialconnections/domain/FeaturedInstitutions;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;)V

    return-object v10
.end method


# virtual methods
.method public get()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;
    .locals 10

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel_Factory;->configurationProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel_Factory;->searchInstitutionsProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/financialconnections/domain/SearchInstitutions;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel_Factory;->featuredInstitutionsProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/financialconnections/domain/FeaturedInstitutions;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel_Factory;->getManifestProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/financialconnections/domain/GetManifest;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel_Factory;->eventTrackerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel_Factory;->navigationManagerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel_Factory;->updateLocalManifestProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel_Factory;->loggerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/stripe/android/core/Logger;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel_Factory;->initialStateProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    invoke-static/range {v1 .. v9}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel_Factory;->newInstance(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Lcom/stripe/android/financialconnections/domain/SearchInstitutions;Lcom/stripe/android/financialconnections/domain/FeaturedInstitutions;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/financialconnections/domain/UpdateLocalManifest;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel_Factory;->get()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;

    move-result-object v0

    return-object v0
.end method
