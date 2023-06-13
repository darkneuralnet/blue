.class public final Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeRequestExecutor$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeRequestExecutor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeRequestExecutor$Factory;",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;",
        "config",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;",
        "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;)V",
        "create",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor;",
        "errorReporter",
        "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
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
.field private final config:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;


# direct methods
.method public constructor <init>(Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;)V
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeRequestExecutor$Factory;->config:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;

    return-void
.end method


# virtual methods
.method public create(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    const-string v1, "errorReporter"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "workContext"

    move-object/from16 v9, p2

    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/stripe3ds2/security/EcKeyFactory;

    invoke-direct {v1, v7}, Lcom/stripe/android/stripe3ds2/security/EcKeyFactory;-><init>(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V

    new-instance v15, Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeRequestExecutor;

    iget-object v2, v0, Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeRequestExecutor$Factory;->config:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->getMessageTransformer$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/security/MessageTransformer;

    move-result-object v2

    iget-object v3, v0, Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeRequestExecutor$Factory;->config:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->getSdkReferenceId$3ds2sdk_release()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v0, Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeRequestExecutor$Factory;->config:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->getKeys$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;->getSdkPrivateKeyEncoded$3ds2sdk_release()[B

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/stripe/android/stripe3ds2/security/EcKeyFactory;->createPrivate([B)Ljava/security/interfaces/ECPrivateKey;

    move-result-object v4

    iget-object v5, v0, Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeRequestExecutor$Factory;->config:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;

    invoke-virtual {v5}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->getKeys$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;->getAcsPublicKeyEncoded$3ds2sdk_release()[B

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/stripe/android/stripe3ds2/security/EcKeyFactory;->createPublic([B)Ljava/security/interfaces/ECPublicKey;

    move-result-object v5

    iget-object v1, v0, Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeRequestExecutor$Factory;->config:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;->getAcsUrl$3ds2sdk_release()Ljava/lang/String;

    move-result-object v6

    new-instance v8, Lcom/stripe/android/stripe3ds2/security/StripeDiffieHellmanKeyGenerator;

    invoke-direct {v8, v7}, Lcom/stripe/android/stripe3ds2/security/StripeDiffieHellmanKeyGenerator;-><init>(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V

    const/4 v10, 0x0

    iget-object v11, v0, Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeRequestExecutor$Factory;->config:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;

    const/4 v12, 0x0

    const/16 v13, 0x500

    const/4 v14, 0x0

    move-object v1, v15

    invoke-direct/range {v1 .. v14}, Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeRequestExecutor;-><init>(Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Ljava/lang/String;Ljava/security/PrivateKey;Ljava/security/interfaces/ECPublicKey;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/security/DiffieHellmanKeyGenerator;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/stripe3ds2/transaction/HttpClient;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessorFactory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v15
.end method
