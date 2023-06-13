.class public final Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\" \u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0004\u0010\u0005\" \u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0003\u001a\u0004\u0008\u0008\u0010\u0005\" \u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0003\u001a\u0004\u0008\u000b\u0010\u0005\u00a8\u0006\u000c"
    }
    d2 = {
        "LU94;",
        "LOY2;",
        "LocalNavHostController",
        "LU94;",
        "getLocalNavHostController",
        "()LU94;",
        "",
        "LocalReducedBranding",
        "getLocalReducedBranding",
        "Lcom/stripe/android/uicore/image/StripeImageLoader;",
        "LocalImageLoader",
        "getLocalImageLoader",
        "financial-connections_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field private static final LocalImageLoader:LU94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LU94<",
            "Lcom/stripe/android/uicore/image/StripeImageLoader;",
            ">;"
        }
    .end annotation
.end field

.field private static final LocalNavHostController:LU94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LU94<",
            "LOY2;",
            ">;"
        }
    .end annotation
.end field

.field private static final LocalReducedBranding:LU94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LU94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt$LocalNavHostController$1;->INSTANCE:Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt$LocalNavHostController$1;

    invoke-static {v0}, Lgu0;->d(Lkotlin/jvm/functions/Function0;)LU94;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->LocalNavHostController:LU94;

    sget-object v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt$LocalReducedBranding$1;->INSTANCE:Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt$LocalReducedBranding$1;

    invoke-static {v0}, Lgu0;->d(Lkotlin/jvm/functions/Function0;)LU94;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->LocalReducedBranding:LU94;

    sget-object v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt$LocalImageLoader$1;->INSTANCE:Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt$LocalImageLoader$1;

    invoke-static {v0}, Lgu0;->d(Lkotlin/jvm/functions/Function0;)LU94;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->LocalImageLoader:LU94;

    return-void
.end method

.method public static final getLocalImageLoader()LU94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LU94<",
            "Lcom/stripe/android/uicore/image/StripeImageLoader;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->LocalImageLoader:LU94;

    return-object v0
.end method

.method public static final getLocalNavHostController()LU94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LU94<",
            "LOY2;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->LocalNavHostController:LU94;

    return-object v0
.end method

.method public static final getLocalReducedBranding()LU94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LU94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->LocalReducedBranding:LU94;

    return-object v0
.end method
