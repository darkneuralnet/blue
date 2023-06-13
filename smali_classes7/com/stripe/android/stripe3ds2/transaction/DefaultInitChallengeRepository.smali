.class public final Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepository;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001BW\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006 "
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;",
        "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepository;",
        "sdkTransactionId",
        "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;",
        "messageVersionRegistry",
        "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;",
        "jwsValidator",
        "Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;",
        "messageTransformer",
        "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;",
        "acsDataParser",
        "Lcom/stripe/android/stripe3ds2/transaction/AcsDataParser;",
        "challengeRequestResultRepository",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResultRepository;",
        "errorRequestExecutorFactory",
        "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;",
        "uiCustomization",
        "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;",
        "errorReporter",
        "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;",
        "logger",
        "Lcom/stripe/android/stripe3ds2/transaction/Logger;",
        "(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Lcom/stripe/android/stripe3ds2/transaction/AcsDataParser;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResultRepository;Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/Logger;)V",
        "createCreqData",
        "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;",
        "challengeParameters",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;",
        "startChallenge",
        "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult;",
        "args",
        "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;",
        "(Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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


# instance fields
.field private final acsDataParser:Lcom/stripe/android/stripe3ds2/transaction/AcsDataParser;

.field private final challengeRequestResultRepository:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResultRepository;

.field private final errorReporter:Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

.field private final errorRequestExecutorFactory:Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;

.field private final jwsValidator:Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;

.field private final logger:Lcom/stripe/android/stripe3ds2/transaction/Logger;

.field private final messageTransformer:Lcom/stripe/android/stripe3ds2/security/MessageTransformer;

.field private final messageVersionRegistry:Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;

.field private final sdkTransactionId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

.field private final uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;


# direct methods
.method public constructor <init>(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Lcom/stripe/android/stripe3ds2/transaction/AcsDataParser;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResultRepository;Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/Logger;)V
    .locals 1

    const-string v0, "sdkTransactionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageVersionRegistry"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jwsValidator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageTransformer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acsDataParser"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "challengeRequestResultRepository"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorRequestExecutorFactory"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiCustomization"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->sdkTransactionId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->messageVersionRegistry:Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;

    iput-object p3, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->jwsValidator:Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;

    iput-object p4, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->messageTransformer:Lcom/stripe/android/stripe3ds2/security/MessageTransformer;

    iput-object p5, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->acsDataParser:Lcom/stripe/android/stripe3ds2/transaction/AcsDataParser;

    iput-object p6, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->challengeRequestResultRepository:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResultRepository;

    iput-object p7, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->errorRequestExecutorFactory:Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;

    iput-object p8, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    iput-object p9, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->errorReporter:Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

    iput-object p10, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->logger:Lcom/stripe/android/stripe3ds2/transaction/Logger;

    return-void
.end method

.method private final createCreqData(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;
    .locals 13

    invoke-virtual {p2}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;->getAcsTransactionId()Ljava/lang/String;

    move-result-object v3

    const-string v0, "Required value was null."

    if-eqz v3, :cond_1

    invoke-virtual {p2}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;->getThreeDsServerTransactionId()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object p2, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->messageVersionRegistry:Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;

    invoke-virtual {p2}, Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;->getCurrent()Ljava/lang/String;

    move-result-object v1

    new-instance p2, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x3f0

    const/4 v12, 0x0

    move-object v0, p2

    move-object v4, p1

    invoke-direct/range {v0 .. v12}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p2

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public startChallenge(Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;

    iget v3, v2, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;

    invoke-direct {v2, v1, v0}, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;-><init>(Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v2, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->label:I

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->L$4:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;

    iget-object v4, v2, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->L$3:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;

    iget-object v5, v2, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->L$2:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;

    iget-object v7, v2, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;

    iget-object v2, v2, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v12, v3

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v0, v1, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->logger:Lcom/stripe/android/stripe3ds2/transaction/Logger;

    const-string v4, "Make initial challenge request."

    invoke-virtual {v0, v4}, Lcom/stripe/android/stripe3ds2/transaction/Logger;->info(Ljava/lang/String;)V

    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v0, v1, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->acsDataParser:Lcom/stripe/android/stripe3ds2/transaction/AcsDataParser;

    iget-object v4, v1, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->jwsValidator:Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->getChallengeParameters$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;->getAcsSignedContent()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_8

    invoke-interface {v4, v7}, Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;->getPayload(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    invoke-interface {v0, v4}, Lcom/stripe/android/stripe3ds2/transaction/AcsDataParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/stripe3ds2/transaction/AcsData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/transaction/AcsData;->component1()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/transaction/AcsData;->component2()Ljava/security/interfaces/ECPublicKey;

    move-result-object v0

    iget-object v4, v1, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->sdkTransactionId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->getChallengeParameters$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;

    move-result-object v7

    invoke-direct {v1, v4, v7}, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->createCreqData(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    move-result-object v4

    iget-object v7, v1, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->errorRequestExecutorFactory:Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;

    iget-object v8, v1, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->errorReporter:Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

    invoke-interface {v7, v11, v8}, Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;->create(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;

    move-result-object v13

    new-instance v14, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;

    iget-object v8, v1, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->messageTransformer:Lcom/stripe/android/stripe3ds2/security/MessageTransformer;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->getSdkReferenceNumber$3ds2sdk_release()Ljava/lang/String;

    move-result-object v9

    new-instance v12, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->getSdkKeyPair$3ds2sdk_release()Ljava/security/KeyPair;

    move-result-object v7

    invoke-virtual {v7}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v7

    invoke-interface {v7}, Ljava/security/Key;->getEncoded()[B

    move-result-object v7

    const-string v10, "args.sdkKeyPair.private.encoded"

    invoke-static {v7, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0

    const-string v10, "acsEphemPubKey.encoded"

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v12, v7, v0}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;-><init>([B[B)V

    move-object v7, v14

    move-object v10, v4

    invoke-direct/range {v7 .. v12}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;-><init>(Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;)V

    iget-object v0, v1, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->challengeRequestResultRepository:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResultRepository;

    iput-object v1, v2, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->L$0:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-object/from16 v7, p1

    :try_start_2
    iput-object v7, v2, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->L$1:Ljava/lang/Object;

    iput-object v1, v2, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->L$2:Ljava/lang/Object;

    iput-object v13, v2, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->L$3:Ljava/lang/Object;

    iput-object v14, v2, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->L$4:Ljava/lang/Object;

    iput v5, v2, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->label:I

    invoke-interface {v0, v14, v4, v2}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResultRepository;->get(Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v0, v3, :cond_3

    return-object v3

    :cond_3
    move-object v2, v1

    move-object v5, v2

    move-object v4, v13

    move-object v12, v14

    :goto_1
    :try_start_3
    check-cast v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;

    instance-of v3, v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Success;

    if-eqz v3, :cond_4

    new-instance v3, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$Start;

    new-instance v4, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;

    move-object v8, v0

    check-cast v8, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Success;

    invoke-virtual {v8}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Success;->getCresData()Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    move-result-object v9

    check-cast v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Success;

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Success;->getCreqData()Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    move-result-object v10

    iget-object v11, v5, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    new-instance v13, Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeRequestExecutor$Factory;

    invoke-direct {v13, v12}, Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeRequestExecutor$Factory;-><init>(Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;)V

    invoke-virtual {v7}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->getTimeoutMins$3ds2sdk_release()I

    move-result v14

    invoke-virtual {v7}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->getIntentData$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    move-result-object v15

    move-object v8, v4

    invoke-direct/range {v8 .. v15}, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;-><init>(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;ILcom/stripe/android/stripe3ds2/transaction/IntentData;)V

    invoke-direct {v3, v4}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$Start;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;)V

    goto :goto_2

    :cond_4
    instance-of v3, v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$ProtocolError;

    if-eqz v3, :cond_5

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$ProtocolError;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$ProtocolError;->getData()Lcom/stripe/android/stripe3ds2/transactions/ErrorData;

    move-result-object v3

    invoke-interface {v4, v3}, Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;->executeAsync(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;)V

    new-instance v3, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;

    new-instance v4, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$ProtocolError;

    check-cast v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$ProtocolError;

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$ProtocolError;->getData()Lcom/stripe/android/stripe3ds2/transactions/ErrorData;

    move-result-object v0

    invoke-virtual {v7}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->getIntentData$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    move-result-object v5

    invoke-direct {v4, v0, v6, v5}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$ProtocolError;-><init>(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V

    invoke-direct {v3, v4}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;-><init>(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;)V

    goto :goto_2

    :cond_5
    instance-of v3, v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Timeout;

    if-eqz v3, :cond_6

    check-cast v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Timeout;

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Timeout;->getData()Lcom/stripe/android/stripe3ds2/transactions/ErrorData;

    move-result-object v0

    invoke-interface {v4, v0}, Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;->executeAsync(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;)V

    new-instance v3, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;

    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Timeout;

    invoke-virtual {v7}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->getIntentData$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    move-result-object v4

    invoke-direct {v0, v6, v6, v4}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Timeout;-><init>(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V

    invoke-direct {v3, v0}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;-><init>(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;)V

    goto :goto_2

    :cond_6
    instance-of v3, v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$RuntimeError;

    if-eqz v3, :cond_7

    new-instance v3, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;

    new-instance v4, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$RuntimeError;

    check-cast v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$RuntimeError;

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$RuntimeError;->getThrowable()Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {v7}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->getIntentData$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    move-result-object v5

    invoke-direct {v4, v0, v6, v5}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$RuntimeError;-><init>(Ljava/lang/Throwable;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V

    invoke-direct {v3, v4}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;-><init>(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;)V

    :goto_2
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_5

    :cond_7
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_8
    move-object/from16 v7, p1

    :try_start_4
    const-string v0, "Required value was null."

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v0

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object/from16 v7, p1

    :goto_3
    move-object v2, v1

    :goto_4
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_5
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_9

    goto :goto_6

    :cond_9
    iget-object v0, v2, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->errorReporter:Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

    invoke-interface {v0, v3}, Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;->reportError(Ljava/lang/Throwable;)V

    iget-object v0, v2, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->logger:Lcom/stripe/android/stripe3ds2/transaction/Logger;

    const-string v2, "Exception during initial challenge request."

    invoke-virtual {v0, v2, v3}, Lcom/stripe/android/stripe3ds2/transaction/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;

    new-instance v2, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$RuntimeError;

    invoke-virtual {v7}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->getIntentData$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    move-result-object v4

    invoke-direct {v2, v3, v6, v4}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$RuntimeError;-><init>(Ljava/lang/Throwable;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V

    invoke-direct {v0, v2}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;-><init>(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;)V

    :goto_6
    return-object v0
.end method
