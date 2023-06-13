.class final Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule$providesJson$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule;->providesJson$financial_connections_release()Lbi2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lhi2;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lhi2;",
        "",
        "invoke",
        "(Lhi2;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule$providesJson$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule$providesJson$1;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule$providesJson$1;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule$providesJson$1;->INSTANCE:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule$providesJson$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lhi2;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule$providesJson$1;->invoke(Lhi2;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lhi2;)V
    .locals 1

    const-string v0, "$this$Json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lhi2;->d(Z)V

    invoke-virtual {p1, v0}, Lhi2;->f(Z)V

    invoke-virtual {p1, v0}, Lhi2;->g(Z)V

    invoke-virtual {p1, v0}, Lhi2;->e(Z)V

    return-void
.end method
