.class final Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$challengeActionHandler$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;


# direct methods
.method public constructor <init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$challengeActionHandler$2;->this$0:Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;
    .locals 5

    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$challengeActionHandler$2;->this$0:Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;

    invoke-static {v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->access$getViewArgs(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;)Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->getCreqData$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$challengeActionHandler$2;->this$0:Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;

    invoke-static {v2}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->access$getErrorReporter(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;)Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

    move-result-object v2

    iget-object v3, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$challengeActionHandler$2;->this$0:Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;

    invoke-static {v3}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->access$getViewArgs(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;)Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;->getCreqExecutorFactory$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;

    move-result-object v3

    invoke-static {}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->access$getWORK_CONTEXT$cp()LSC0;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;-><init>(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;Lkotlin/coroutines/CoroutineContext;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$challengeActionHandler$2;->invoke()Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;

    move-result-object v0

    return-object v0
.end method
