.class public final Lcom/stripe/android/stripe3ds2/transaction/ChallengeContract;
.super Lv5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv5<",
        "Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\u000c\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeContract;",
        "Lv5;",
        "Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;",
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
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lv5;-><init>()V

    return-void
.end method


# virtual methods
.method public createIntent(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;)Landroid/content/Intent;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "input"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p2}, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->toBundle()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const-string p2, "Intent(context, Challeng\u2026tExtras(input.toBundle())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 0

    check-cast p2, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeContract;->createIntent(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public parseResult(ILandroid/content/Intent;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;
    .locals 0

    sget-object p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;->Companion:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Companion;

    invoke-virtual {p1, p2}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Companion;->fromIntent(Landroid/content/Intent;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeContract;->parseResult(ILandroid/content/Intent;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    move-result-object p1

    return-object p1
.end method
