.class public final Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0086\u0002\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository$Companion;",
        "",
        "()V",
        "invoke",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;",
        "requestExecutor",
        "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;",
        "apiRequestFactory",
        "Lcom/stripe/android/core/networking/ApiRequest$Factory;",
        "apiOptions",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
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


# static fields
.field static final synthetic $$INSTANCE:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository$Companion;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository$Companion;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository$Companion;->$$INSTANCE:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;
    .locals 1

    const-string v0, "requestExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiRequestFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiOptions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;-><init>(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/Logger;)V

    return-object v0
.end method
