.class public final Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;",
        ">;"
    }
.end annotation


# instance fields
.field private final eventTrackerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
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

.field private final goNextProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/GoNext;",
            ">;"
        }
    .end annotation
.end field

.field private final initialStateProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;",
            ">;"
        }
    .end annotation
.end field

.field private final localeProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/util/Locale;",
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

.field private final pollAuthorizationSessionAccountsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;",
            ">;"
        }
    .end annotation
.end field

.field private final selectAccountsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/SelectAccounts;",
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
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/SelectAccounts;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/GetManifest;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/GoNext;",
            ">;",
            "LY94<",
            "Ljava/util/Locale;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel_Factory;->initialStateProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel_Factory;->eventTrackerProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel_Factory;->selectAccountsProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel_Factory;->getManifestProvider:LY94;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel_Factory;->goNextProvider:LY94;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel_Factory;->localeProvider:LY94;

    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel_Factory;->navigationManagerProvider:LY94;

    iput-object p8, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel_Factory;->loggerProvider:LY94;

    iput-object p9, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel_Factory;->pollAuthorizationSessionAccountsProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel_Factory;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/SelectAccounts;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/GetManifest;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/GoNext;",
            ">;",
            "LY94<",
            "Ljava/util/Locale;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;",
            ">;)",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel_Factory;"
        }
    .end annotation

    new-instance v10, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel_Factory;

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

    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel_Factory;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v10
.end method

.method public static newInstance(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/SelectAccounts;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/domain/GoNext;Ljava/util/Locale;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;
    .locals 11

    new-instance v10, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

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

    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;-><init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/SelectAccounts;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/domain/GoNext;Ljava/util/Locale;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;)V

    return-object v10
.end method


# virtual methods
.method public get()Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;
    .locals 10

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel_Factory;->initialStateProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel_Factory;->eventTrackerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel_Factory;->selectAccountsProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/financialconnections/domain/SelectAccounts;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel_Factory;->getManifestProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/financialconnections/domain/GetManifest;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel_Factory;->goNextProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/financialconnections/domain/GoNext;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel_Factory;->localeProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Locale;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel_Factory;->navigationManagerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel_Factory;->loggerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/stripe/android/core/Logger;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel_Factory;->pollAuthorizationSessionAccountsProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;

    invoke-static/range {v1 .. v9}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel_Factory;->newInstance(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/SelectAccounts;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/domain/GoNext;Ljava/util/Locale;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel_Factory;->get()Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

    move-result-object v0

    return-object v0
.end method
