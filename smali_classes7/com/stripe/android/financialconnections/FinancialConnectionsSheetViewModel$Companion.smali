.class public final Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$Companion;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWN2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LWN2<",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016R\u0014\u0010\t\u001a\u00020\u00088\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u0014\u0010\u000c\u001a\u00020\u000b8\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$Companion;",
        "LWN2;",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;",
        "LPr6;",
        "viewModelContext",
        "state",
        "create",
        "",
        "MAX_ACCOUNTS",
        "I",
        "",
        "QUERY_PARAM_LINKED_ACCOUNT",
        "Ljava/lang/String;",
        "<init>",
        "()V",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic create(LPr6;LAN2;)LRN2;
    .locals 0

    check-cast p2, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$Companion;->create(LPr6;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;

    move-result-object p1

    return-object p1
.end method

.method public create(LPr6;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;
    .locals 1

    const-string v0, "viewModelContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetComponent;->builder()Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent$Builder;

    move-result-object v0

    invoke-virtual {p1}, LPr6;->b()Landroid/app/Application;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent$Builder;->application(Landroid/app/Application;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent$Builder;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent$Builder;->initialState(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent$Builder;

    move-result-object p1

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->getInitialArgs()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;->getConfiguration()Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent$Builder;->configuration(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent$Builder;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent$Builder;->build()Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetComponent;->getViewModel()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic initialState(LPr6;)LAN2;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$Companion;->initialState(LPr6;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    move-result-object p1

    return-object p1
.end method

.method public initialState(LPr6;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;
    .locals 0

    invoke-static {p0, p1}, LWN2$a;->a(LWN2;LPr6;)LAN2;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    return-object p1
.end method
