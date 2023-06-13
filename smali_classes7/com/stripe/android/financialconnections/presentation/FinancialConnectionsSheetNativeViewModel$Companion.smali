.class public final Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$Companion;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWN2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LWN2<",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000cR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000cR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u000cR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u000c\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$Companion;",
        "LWN2;",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;",
        "",
        "applicationId",
        "baseUrl",
        "LPr6;",
        "viewModelContext",
        "state",
        "create",
        "PARAM_ERROR_REASON",
        "Ljava/lang/String;",
        "PARAM_STATUS",
        "STATUS_CANCEL",
        "STATUS_FAILURE",
        "STATUS_SUCCESS",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFinancialConnectionsSheetNativeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsSheetNativeViewModel.kt\ncom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,375:1\n1#2:376\n*E\n"
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

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$baseUrl(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$Companion;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$Companion;->baseUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final baseUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "stripe://auth-redirect/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public bridge synthetic create(LPr6;LAN2;)LRN2;
    .locals 0

    check-cast p2, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$Companion;->create(LPr6;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    move-result-object p1

    return-object p1
.end method

.method public create(LPr6;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;
    .locals 3

    const-string v0, "viewModelContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LPr6;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;

    invoke-static {}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent;->builder()Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;

    move-result-object v1

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;->getInitialSyncResponse()Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    move-result-object v0

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->getFirstInit()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-interface {v1, v0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;->initialSyncResponse(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;

    move-result-object v0

    invoke-virtual {p1}, LPr6;->b()Landroid/app/Application;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;->application(Landroid/app/Application;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;

    move-result-object p1

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->getConfiguration()Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;->configuration(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;->initialState(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;->build()Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;->getViewModel()Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic initialState(LPr6;)LAN2;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$Companion;->initialState(LPr6;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    move-result-object p1

    return-object p1
.end method

.method public initialState(LPr6;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;
    .locals 0

    invoke-static {p0, p1}, LWN2$a;->a(LWN2;LPr6;)LAN2;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    return-object p1
.end method
