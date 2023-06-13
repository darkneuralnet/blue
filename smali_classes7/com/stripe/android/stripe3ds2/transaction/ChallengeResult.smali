.class public abstract Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Succeeded;,
        Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Failed;,
        Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Canceled;,
        Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$ProtocolError;,
        Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$RuntimeError;,
        Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Timeout;,
        Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u0000 \u000f2\u00020\u0001:\u0007\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u000b\u001a\u00020\u000cH\u0000\u00a2\u0006\u0002\u0008\rR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0008X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\n\u0082\u0001\u0006\u0015\u0016\u0017\u0018\u0019\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;",
        "Landroid/os/Parcelable;",
        "()V",
        "initialUiType",
        "Lcom/stripe/android/stripe3ds2/transactions/UiType;",
        "getInitialUiType",
        "()Lcom/stripe/android/stripe3ds2/transactions/UiType;",
        "intentData",
        "Lcom/stripe/android/stripe3ds2/transaction/IntentData;",
        "getIntentData",
        "()Lcom/stripe/android/stripe3ds2/transaction/IntentData;",
        "toBundle",
        "Landroid/os/Bundle;",
        "toBundle$3ds2sdk_release",
        "Canceled",
        "Companion",
        "Failed",
        "ProtocolError",
        "RuntimeError",
        "Succeeded",
        "Timeout",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Canceled;",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Failed;",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$ProtocolError;",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$RuntimeError;",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Succeeded;",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Timeout;",
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


# static fields
.field public static final Companion:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Companion;

.field private static final EXTRA_RESULT:Ljava/lang/String; = "extra_result"


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;->Companion:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getInitialUiType()Lcom/stripe/android/stripe3ds2/transactions/UiType;
.end method

.method public abstract getIntentData()Lcom/stripe/android/stripe3ds2/transaction/IntentData;
.end method

.method public final toBundle$3ds2sdk_release()Landroid/os/Bundle;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "extra_result"

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Ld70;->a([Lkotlin/Pair;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
