.class public final Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$Companion;",
        "",
        "()V",
        "KEY_RESULT",
        "",
        "fromBundle",
        "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult;",
        "bundle",
        "Landroid/os/Bundle;",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromBundle(Landroid/os/Bundle;)Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult;
    .locals 4

    const-string v0, "bundle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key_init_challenge_result"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult;

    if-nez p1, :cond_0

    new-instance p1, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;

    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$RuntimeError;

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Could not retrieve result."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    sget-object v2, Lcom/stripe/android/stripe3ds2/transaction/IntentData;->Companion:Lcom/stripe/android/stripe3ds2/transaction/IntentData$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/transaction/IntentData$Companion;->getEMPTY()Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$RuntimeError;-><init>(Ljava/lang/Throwable;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V

    invoke-direct {p1, v0}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;-><init>(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;)V

    :cond_0
    return-object p1
.end method
