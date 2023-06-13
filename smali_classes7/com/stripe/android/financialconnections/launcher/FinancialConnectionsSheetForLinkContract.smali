.class public final Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForLinkContract;
.super Lv5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv5<",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForLink;",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLinkResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000c\u0010\u0005\u001a\u00020\u0003*\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0002H\u0016J\u001a\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\r\u001a\u0004\u0018\u00010\tH\u0016\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForLinkContract;",
        "Lv5;",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForLink;",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLinkResult;",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;",
        "toExposedResult",
        "Landroid/content/Context;",
        "context",
        "input",
        "Landroid/content/Intent;",
        "createIntent",
        "",
        "resultCode",
        "intent",
        "parseResult",
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


# static fields
.field public static final $stable:I


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lv5;-><init>()V

    return-void
.end method

.method private final toExposedResult(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLinkResult;
    .locals 2

    instance-of v0, p1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Canceled;

    if-eqz v0, :cond_0

    sget-object p1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLinkResult$Canceled;->INSTANCE:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLinkResult$Canceled;

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLinkResult$Failed;

    check-cast p1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;->getError()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLinkResult$Failed;-><init>(Ljava/lang/Throwable;)V

    :goto_0
    move-object p1, v0

    goto :goto_1

    :cond_1
    instance-of v0, p1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Completed;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Completed;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Completed;->getLinkedAccountId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance p1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLinkResult$Failed;

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "linkedAccountId not set for this session"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLinkResult$Failed;-><init>(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_2
    new-instance v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLinkResult$Completed;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Completed;->getLinkedAccountId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLinkResult$Completed;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :goto_1
    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public createIntent(Landroid/content/Context;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForLink;)Landroid/content/Intent;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "input"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p1, "mavericks:arg"

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p1

    const-string p2, "Intent(context, Financia\u2026Mavericks.KEY_ARG, input)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 0

    check-cast p2, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForLink;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForLinkContract;->createIntent(Landroid/content/Context;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForLink;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public parseResult(ILandroid/content/Intent;)Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLinkResult;
    .locals 1

    if-eqz p2, :cond_0

    const-string p1, "com.stripe.android.financialconnections.ConnectionsSheetContract.extra_result"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForLinkContract;->toExposedResult(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLinkResult;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLinkResult$Failed;

    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed to retrieve a ConnectionsSheetResult."

    invoke-direct {p2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLinkResult$Failed;-><init>(Ljava/lang/Throwable;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForLinkContract;->parseResult(ILandroid/content/Intent;)Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLinkResult;

    move-result-object p1

    return-object p1
.end method
