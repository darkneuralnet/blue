.class public final Lcom/stripe/android/link/LinkActivityContract;
.super Lv5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/LinkActivityContract$Args;,
        Lcom/stripe/android/link/LinkActivityContract$Result;,
        Lcom/stripe/android/link/LinkActivityContract$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv5<",
        "Lcom/stripe/android/link/LinkActivityContract$Args;",
        "Lcom/stripe/android/link/LinkActivityResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\u0008\u0007\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0010\u000f\u0011B\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\u000c\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkActivityContract;",
        "Lv5;",
        "Lcom/stripe/android/link/LinkActivityContract$Args;",
        "Lcom/stripe/android/link/LinkActivityResult;",
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
        "Companion",
        "Args",
        "Result",
        "link_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I = 0x0

.field public static final Companion:Lcom/stripe/android/link/LinkActivityContract$Companion;

.field public static final EXTRA_ARGS:Ljava/lang/String; = "com.stripe.android.link.LinkActivityContract.extra_args"

.field public static final EXTRA_RESULT:Ljava/lang/String; = "com.stripe.android.link.LinkActivityContract.extra_result"


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/link/LinkActivityContract$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/link/LinkActivityContract$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/link/LinkActivityContract;->Companion:Lcom/stripe/android/link/LinkActivityContract$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lv5;-><init>()V

    return-void
.end method


# virtual methods
.method public createIntent(Landroid/content/Context;Lcom/stripe/android/link/LinkActivityContract$Args;)Landroid/content/Intent;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "input"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/stripe/android/link/LinkActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p1, "com.stripe.android.link.LinkActivityContract.extra_args"

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p1

    const-string p2, "Intent(context, LinkActi\u2026tExtra(EXTRA_ARGS, input)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 0

    check-cast p2, Lcom/stripe/android/link/LinkActivityContract$Args;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/LinkActivityContract;->createIntent(Landroid/content/Context;Lcom/stripe/android/link/LinkActivityContract$Args;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public parseResult(ILandroid/content/Intent;)Lcom/stripe/android/link/LinkActivityResult;
    .locals 0

    if-eqz p2, :cond_0

    const-string p1, "com.stripe.android.link.LinkActivityContract.extra_result"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/LinkActivityContract$Result;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkActivityContract$Result;->getLinkResult()Lcom/stripe/android/link/LinkActivityResult;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    new-instance p1, Lcom/stripe/android/link/LinkActivityResult$Canceled;

    sget-object p2, Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;->BackPressed:Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;

    invoke-direct {p1, p2}, Lcom/stripe/android/link/LinkActivityResult$Canceled;-><init>(Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;)V

    :cond_1
    return-object p1
.end method

.method public bridge synthetic parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/LinkActivityContract;->parseResult(ILandroid/content/Intent;)Lcom/stripe/android/link/LinkActivityResult;

    move-result-object p1

    return-object p1
.end method
