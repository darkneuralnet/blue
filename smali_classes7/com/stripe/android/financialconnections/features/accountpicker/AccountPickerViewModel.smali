.class public final Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;
.super LRN2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LRN2<",
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 82\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u00018BS\u0008\u0007\u0012\u0006\u00105\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010\'\u001a\u00020&\u0012\u0008\u0010*\u001a\u0004\u0018\u00010)\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00103\u001a\u000202\u00a2\u0006\u0004\u00086\u00107J\u0008\u0010\u0004\u001a\u00020\u0003H\u0002J \u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0002J\u0008\u0010\u000c\u001a\u00020\u0003H\u0002J\u0008\u0010\r\u001a\u00020\u0003H\u0002J\u001e\u0010\u0013\u001a\u00020\u00032\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u000e\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0003J\u0006\u0010\u0018\u001a\u00020\u0003J\u0006\u0010\u0019\u001a\u00020\u0003J\u0006\u0010\u001a\u001a\u00020\u0003J\u0006\u0010\u001b\u001a\u00020\u0003J\u0006\u0010\u001c\u001a\u00020\u0003R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010\'\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0016\u0010*\u001a\u0004\u0018\u00010)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u00104\u00a8\u00069"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;",
        "LRN2;",
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;",
        "",
        "loadAccounts",
        "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
        "partnerAccountList",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "activeInstitution",
        "",
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;",
        "buildAccountList",
        "onPayloadLoaded",
        "logErrors",
        "",
        "",
        "selectedIds",
        "",
        "updateLocalCache",
        "submitAccounts",
        "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
        "account",
        "onAccountClicked",
        "onSubmit",
        "selectAnotherBank",
        "onEnterDetailsManually",
        "onLoadAccountsAgain",
        "onSelectAllAccountsClicked",
        "onLearnMoreAboutDataAccessClick",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "eventTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "Lcom/stripe/android/financialconnections/domain/SelectAccounts;",
        "selectAccounts",
        "Lcom/stripe/android/financialconnections/domain/SelectAccounts;",
        "Lcom/stripe/android/financialconnections/domain/GetManifest;",
        "getManifest",
        "Lcom/stripe/android/financialconnections/domain/GetManifest;",
        "Lcom/stripe/android/financialconnections/domain/GoNext;",
        "goNext",
        "Lcom/stripe/android/financialconnections/domain/GoNext;",
        "Ljava/util/Locale;",
        "locale",
        "Ljava/util/Locale;",
        "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
        "navigationManager",
        "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
        "Lcom/stripe/android/core/Logger;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;",
        "pollAuthorizationSessionAccounts",
        "Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;",
        "initialState",
        "<init>",
        "(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/SelectAccounts;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/domain/GoNext;Ljava/util/Locale;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;)V",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAccountPickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,323:1\n1549#2:324\n1620#2,3:325\n1045#2:328\n*S KotlinDebug\n*F\n+ 1 AccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel\n*L\n108#1:324\n108#1:325,3\n124#1:328\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$Companion;


# instance fields
.field private final eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

.field private final getManifest:Lcom/stripe/android/financialconnections/domain/GetManifest;

.field private final goNext:Lcom/stripe/android/financialconnections/domain/GoNext;

.field private final locale:Ljava/util/Locale;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final navigationManager:Lcom/stripe/android/financialconnections/navigation/NavigationManager;

.field private final pollAuthorizationSessionAccounts:Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;

.field private final selectAccounts:Lcom/stripe/android/financialconnections/domain/SelectAccounts;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->Companion:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/SelectAccounts;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/domain/GoNext;Ljava/util/Locale;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;)V
    .locals 2

    const-string v0, "initialState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTracker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectAccounts"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getManifest"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goNext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationManager"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollAuthorizationSessionAccounts"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, LRN2;-><init>(LAN2;LTN2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->selectAccounts:Lcom/stripe/android/financialconnections/domain/SelectAccounts;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->getManifest:Lcom/stripe/android/financialconnections/domain/GetManifest;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->goNext:Lcom/stripe/android/financialconnections/domain/GoNext;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->locale:Ljava/util/Locale;

    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->navigationManager:Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    iput-object p8, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->logger:Lcom/stripe/android/core/Logger;

    iput-object p9, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->pollAuthorizationSessionAccounts:Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->logErrors()V

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->onPayloadLoaded()V

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->loadAccounts()V

    return-void
.end method

.method public static final synthetic access$buildAccountList(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lcom/stripe/android/financialconnections/model/PartnerAccountsList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->buildAccountList(Lcom/stripe/android/financialconnections/model/PartnerAccountsList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    return-object p0
.end method

.method public static final synthetic access$getGetManifest$p(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;)Lcom/stripe/android/financialconnections/domain/GetManifest;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->getManifest:Lcom/stripe/android/financialconnections/domain/GetManifest;

    return-object p0
.end method

.method public static final synthetic access$getGoNext$p(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;)Lcom/stripe/android/financialconnections/domain/GoNext;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->goNext:Lcom/stripe/android/financialconnections/domain/GoNext;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;)Lcom/stripe/android/core/Logger;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getPollAuthorizationSessionAccounts$p(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;)Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->pollAuthorizationSessionAccounts:Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;

    return-object p0
.end method

.method public static final synthetic access$getSelectAccounts$p(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;)Lcom/stripe/android/financialconnections/domain/SelectAccounts;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->selectAccounts:Lcom/stripe/android/financialconnections/domain/SelectAccounts;

    return-object p0
.end method

.method public static final synthetic access$setState(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-virtual {p0, p1}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$submitAccounts(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Ljava/util/Set;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->submitAccounts(Ljava/util/Set;Z)V

    return-void
.end method

.method private final buildAccountList(Lcom/stripe/android/financialconnections/model/PartnerAccountsList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            ")",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->getData()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    new-instance v2, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;

    const/4 v3, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->getIcon()Lcom/stripe/android/financialconnections/model/Image;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/model/Image;->getDefault()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_0
    move-object v4, v3

    :goto_1
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getBalanceAmount()Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getCurrency()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_2

    sget-object v3, Lcom/stripe/android/uicore/format/CurrencyFormatter;->INSTANCE:Lcom/stripe/android/uicore/format/CurrencyFormatter;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getBalanceAmount()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    int-to-long v5, v5

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getCurrency()Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->locale:Ljava/util/Locale;

    if-nez v8, :cond_1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v8

    :cond_1
    const-string v9, "locale ?: Locale.getDefault()"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v5, v6, v7, v8}, Lcom/stripe/android/uicore/format/CurrencyFormatter;->format(JLjava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    :cond_2
    invoke-direct {v2, v1, v4, v3}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;-><init>(Lcom/stripe/android/financialconnections/model/PartnerAccount;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$buildAccountList$$inlined$sortedBy$1;

    invoke-direct {p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$buildAccountList$$inlined$sortedBy$1;-><init>()V

    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final loadAccounts()V
    .locals 7

    new-instance v1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$1;-><init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    sget-object v4, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$2;->INSTANCE:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$loadAccounts$2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, LRN2;->execute$default(LRN2;Lkotlin/jvm/functions/Function1;LSC0;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method private final logErrors()V
    .locals 13

    sget-object v1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$logErrors$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$logErrors$1;

    new-instance v2, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$logErrors$2;

    const/4 v6, 0x0

    invoke-direct {v2, p0, v6}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$logErrors$2;-><init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LRN2;->onAsync$default(LRN2;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    sget-object v8, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$logErrors$3;->INSTANCE:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$logErrors$3;

    new-instance v9, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$logErrors$4;

    invoke-direct {v9, p0, v6}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$logErrors$4;-><init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v10, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x0

    move-object v7, p0

    invoke-static/range {v7 .. v12}, LRN2;->onAsync$default(LRN2;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method private final onPayloadLoaded()V
    .locals 6

    sget-object v1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onPayloadLoaded$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onPayloadLoaded$1;

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onPayloadLoaded$2;

    const/4 v0, 0x0

    invoke-direct {v3, p0, v0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onPayloadLoaded$2;-><init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LRN2;->onAsync$default(LRN2;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method private final submitAccounts(Ljava/util/Set;Z)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    new-instance v1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$submitAccounts$1;

    const/4 v0, 0x0

    invoke-direct {v1, p0, p1, p2, v0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$submitAccounts$1;-><init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Ljava/util/Set;ZLkotlin/coroutines/Continuation;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    sget-object v4, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$submitAccounts$2;->INSTANCE:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$submitAccounts$2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, LRN2;->execute$default(LRN2;Lkotlin/jvm/functions/Function1;LSC0;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method


# virtual methods
.method public final onAccountClicked(Lcom/stripe/android/financialconnections/model/PartnerAccount;)V
    .locals 1

    const-string v0, "account"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onAccountClicked$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onAccountClicked$1;-><init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lcom/stripe/android/financialconnections/model/PartnerAccount;)V

    invoke-virtual {p0, v0}, LRN2;->withState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final onEnterDetailsManually()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->navigationManager:Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    sget-object v1, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/NavigationDirections;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->getManualEntry()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/financialconnections/navigation/NavigationManager;->navigate(Lcom/stripe/android/financialconnections/navigation/NavigationCommand;)V

    return-void
.end method

.method public final onLearnMoreAboutDataAccessClick()V
    .locals 6

    invoke-virtual {p0}, LRN2;->getViewModelScope()LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onLearnMoreAboutDataAccessClick$1;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onLearnMoreAboutDataAccessClick$1;-><init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final onLoadAccountsAgain()V
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onLoadAccountsAgain$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onLoadAccountsAgain$1;

    invoke-virtual {p0, v0}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->loadAccounts()V

    return-void
.end method

.method public final onSelectAllAccountsClicked()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onSelectAllAccountsClicked$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onSelectAllAccountsClicked$1;-><init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;)V

    invoke-virtual {p0, v0}, LRN2;->withState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final onSubmit()V
    .locals 6

    invoke-virtual {p0}, LRN2;->getViewModelScope()LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onSubmit$1;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onSubmit$1;-><init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onSubmit$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$onSubmit$2;-><init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;)V

    invoke-virtual {p0, v0}, LRN2;->withState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final selectAnotherBank()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->navigationManager:Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    sget-object v1, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/NavigationDirections;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->getReset()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/financialconnections/navigation/NavigationManager;->navigate(Lcom/stripe/android/financialconnections/navigation/NavigationCommand;)V

    return-void
.end method
