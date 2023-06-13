.class public final Lcom/stripe/android/EphemeralKeyManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;,
        Lcom/stripe/android/EphemeralKeyManager$ClientKeyUpdateListener;,
        Lcom/stripe/android/EphemeralKeyManager$Companion;,
        Lcom/stripe/android/EphemeralKeyManager$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 \'2\u00020\u0001:\u0004&\'()BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0012\u0008\u0002\u0010\n\u001a\u000c\u0012\u0004\u0012\u00020\u000c0\u000bj\u0002`\r\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000c\u00a2\u0006\u0002\u0010\u000fJ\u0015\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0000\u00a2\u0006\u0002\u0008\u001cJ\u0017\u0010\u001d\u001a\u00020\t2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0000\u00a2\u0006\u0002\u0008\u001eJ\u001a\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0008\u0010 \u001a\u0004\u0018\u00010\u0011H\u0002J \u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0011H\u0002R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\u000c\u0012\u0004\u0012\u00020\u000c0\u000bj\u0002`\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"
    }
    d2 = {
        "Lcom/stripe/android/EphemeralKeyManager;",
        "",
        "ephemeralKeyProvider",
        "Lcom/stripe/android/EphemeralKeyProvider;",
        "listener",
        "Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;",
        "operationIdFactory",
        "Lcom/stripe/android/OperationIdFactory;",
        "shouldPrefetchEphemeralKey",
        "",
        "timeSupplier",
        "Lkotlin/Function0;",
        "",
        "Lcom/stripe/android/TimeSupplier;",
        "timeBufferInSeconds",
        "(Lcom/stripe/android/EphemeralKeyProvider;Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;Lcom/stripe/android/OperationIdFactory;ZLkotlin/jvm/functions/Function0;J)V",
        "apiVersion",
        "",
        "ephemeralKey",
        "Lcom/stripe/android/EphemeralKey;",
        "getEphemeralKey$payments_core_release",
        "()Lcom/stripe/android/EphemeralKey;",
        "setEphemeralKey$payments_core_release",
        "(Lcom/stripe/android/EphemeralKey;)V",
        "retrieveEphemeralKey",
        "",
        "operation",
        "Lcom/stripe/android/EphemeralOperation;",
        "retrieveEphemeralKey$payments_core_release",
        "shouldRefreshKey",
        "shouldRefreshKey$payments_core_release",
        "updateKey",
        "key",
        "updateKeyError",
        "operationId",
        "errorCode",
        "",
        "errorMessage",
        "ClientKeyUpdateListener",
        "Companion",
        "Factory",
        "KeyManagerListener",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nEphemeralKeyManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EphemeralKeyManager.kt\ncom/stripe/android/EphemeralKeyManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n1#2:165\n*E\n"
    }
.end annotation


# static fields
.field private static final Companion:Lcom/stripe/android/EphemeralKeyManager$Companion;

.field private static final REFRESH_BUFFER_IN_SECONDS:J = 0x1eL
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final apiVersion:Ljava/lang/String;

.field private synthetic ephemeralKey:Lcom/stripe/android/EphemeralKey;

.field private final ephemeralKeyProvider:Lcom/stripe/android/EphemeralKeyProvider;

.field private final listener:Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;

.field private final timeBufferInSeconds:J

.field private final timeSupplier:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/EphemeralKeyManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/EphemeralKeyManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/EphemeralKeyManager;->Companion:Lcom/stripe/android/EphemeralKeyManager$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/EphemeralKeyProvider;Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;Lcom/stripe/android/OperationIdFactory;ZLkotlin/jvm/functions/Function0;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/EphemeralKeyProvider;",
            "Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;",
            "Lcom/stripe/android/OperationIdFactory;",
            "Z",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;J)V"
        }
    .end annotation

    const-string v0, "ephemeralKeyProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "operationIdFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeSupplier"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/EphemeralKeyManager;->ephemeralKeyProvider:Lcom/stripe/android/EphemeralKeyProvider;

    iput-object p2, p0, Lcom/stripe/android/EphemeralKeyManager;->listener:Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;

    iput-object p5, p0, Lcom/stripe/android/EphemeralKeyManager;->timeSupplier:Lkotlin/jvm/functions/Function0;

    iput-wide p6, p0, Lcom/stripe/android/EphemeralKeyManager;->timeBufferInSeconds:J

    sget-object p1, Lcom/stripe/android/core/ApiVersion;->Companion:Lcom/stripe/android/core/ApiVersion$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/core/ApiVersion$Companion;->get()Lcom/stripe/android/core/ApiVersion;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/core/ApiVersion;->getCode()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/EphemeralKeyManager;->apiVersion:Ljava/lang/String;

    if-eqz p4, :cond_0

    new-instance p1, Lcom/stripe/android/EphemeralOperation$RetrieveKey;

    invoke-interface {p3}, Lcom/stripe/android/OperationIdFactory;->create()Ljava/lang/String;

    move-result-object p2

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Lcom/stripe/android/EphemeralOperation$RetrieveKey;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    invoke-virtual {p0, p1}, Lcom/stripe/android/EphemeralKeyManager;->retrieveEphemeralKey$payments_core_release(Lcom/stripe/android/EphemeralOperation;)V

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/EphemeralKeyProvider;Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;Lcom/stripe/android/OperationIdFactory;ZLkotlin/jvm/functions/Function0;JILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_0

    new-instance v0, Lcom/stripe/android/StripeOperationIdFactory;

    invoke-direct {v0}, Lcom/stripe/android/StripeOperationIdFactory;-><init>()V

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, p3

    :goto_0
    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    move v5, v0

    goto :goto_1

    :cond_1
    move v5, p4

    :goto_1
    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_2

    sget-object v0, Lcom/stripe/android/EphemeralKeyManager$1;->INSTANCE:Lcom/stripe/android/EphemeralKeyManager$1;

    move-object v6, v0

    goto :goto_2

    :cond_2
    move-object v6, p5

    :goto_2
    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_3

    const-wide/16 v0, 0x1e

    move-wide v7, v0

    goto :goto_3

    :cond_3
    move-wide v7, p6

    :goto_3
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/EphemeralKeyManager;-><init>(Lcom/stripe/android/EphemeralKeyProvider;Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;Lcom/stripe/android/OperationIdFactory;ZLkotlin/jvm/functions/Function0;J)V

    return-void
.end method

.method public static final synthetic access$updateKey(Lcom/stripe/android/EphemeralKeyManager;Lcom/stripe/android/EphemeralOperation;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/EphemeralKeyManager;->updateKey(Lcom/stripe/android/EphemeralOperation;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$updateKeyError(Lcom/stripe/android/EphemeralKeyManager;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/EphemeralKeyManager;->updateKeyError(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method private final updateKey(Lcom/stripe/android/EphemeralOperation;Ljava/lang/String;)V
    .locals 4

    const/16 v0, 0x1f4

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/stripe/android/EphemeralKeyManager;->listener:Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;

    invoke-virtual {p1}, Lcom/stripe/android/EphemeralOperation;->getId$payments_core_release()Ljava/lang/String;

    move-result-object p1

    const-string v1, "EphemeralKeyUpdateListener.onKeyUpdate was called with a null value"

    invoke-interface {p2, p1, v0, v1}, Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;->onKeyError(Ljava/lang/String;ILjava/lang/String;)V

    return-void

    :cond_0
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance v1, Lcom/stripe/android/model/parsers/EphemeralKeyJsonParser;

    invoke-direct {v1}, Lcom/stripe/android/model/parsers/EphemeralKeyJsonParser;-><init>()V

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/stripe/android/model/parsers/EphemeralKeyJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/EphemeralKey;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/EphemeralKeyManager;->ephemeralKey:Lcom/stripe/android/EphemeralKey;

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    :goto_0
    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_1

    check-cast p2, Lcom/stripe/android/EphemeralKey;

    iget-object v0, p0, Lcom/stripe/android/EphemeralKeyManager;->listener:Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;

    invoke-interface {v0, p2, p1}, Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;->onKeyUpdate(Lcom/stripe/android/EphemeralKey;Lcom/stripe/android/EphemeralOperation;)V

    goto :goto_2

    :cond_1
    instance-of p2, v1, Lorg/json/JSONException;

    const-string v2, "\n                        "

    if-eqz p2, :cond_2

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\n                        Received an ephemeral key that could not be parsed. See https://stripe.com/docs/mobile/android/basic for more details.\n                        \n                        "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lkotlin/text/StringsKt;->trimIndent(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\n                        Received an invalid ephemeral key. See https://stripe.com/docs/mobile/android/basic for more details.\n                        \n                        "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lkotlin/text/StringsKt;->trimIndent(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :goto_1
    iget-object v1, p0, Lcom/stripe/android/EphemeralKeyManager;->listener:Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;

    invoke-virtual {p1}, Lcom/stripe/android/EphemeralOperation;->getId$payments_core_release()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1, v0, p2}, Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;->onKeyError(Ljava/lang/String;ILjava/lang/String;)V

    :goto_2
    return-void
.end method

.method private final updateKeyError(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/stripe/android/EphemeralKeyManager;->ephemeralKey:Lcom/stripe/android/EphemeralKey;

    iget-object v0, p0, Lcom/stripe/android/EphemeralKeyManager;->listener:Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;

    invoke-interface {v0, p1, p2, p3}, Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;->onKeyError(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getEphemeralKey$payments_core_release()Lcom/stripe/android/EphemeralKey;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/EphemeralKeyManager;->ephemeralKey:Lcom/stripe/android/EphemeralKey;

    return-object v0
.end method

.method public final synthetic retrieveEphemeralKey$payments_core_release(Lcom/stripe/android/EphemeralOperation;)V
    .locals 3

    const-string v0, "operation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/EphemeralKeyManager;->ephemeralKey:Lcom/stripe/android/EphemeralKey;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lcom/stripe/android/EphemeralKeyManager;->shouldRefreshKey$payments_core_release(Lcom/stripe/android/EphemeralKey;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    const/4 v2, 0x0

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    move-object v0, v2

    :goto_2
    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/stripe/android/EphemeralKeyManager;->listener:Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;

    invoke-interface {v1, v0, p1}, Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;->onKeyUpdate(Lcom/stripe/android/EphemeralKey;Lcom/stripe/android/EphemeralOperation;)V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_3
    if-nez v2, :cond_4

    iget-object v0, p0, Lcom/stripe/android/EphemeralKeyManager;->ephemeralKeyProvider:Lcom/stripe/android/EphemeralKeyProvider;

    iget-object v1, p0, Lcom/stripe/android/EphemeralKeyManager;->apiVersion:Ljava/lang/String;

    new-instance v2, Lcom/stripe/android/EphemeralKeyManager$ClientKeyUpdateListener;

    invoke-direct {v2, p0, p1}, Lcom/stripe/android/EphemeralKeyManager$ClientKeyUpdateListener;-><init>(Lcom/stripe/android/EphemeralKeyManager;Lcom/stripe/android/EphemeralOperation;)V

    invoke-interface {v0, v1, v2}, Lcom/stripe/android/EphemeralKeyProvider;->createEphemeralKey(Ljava/lang/String;Lcom/stripe/android/EphemeralKeyUpdateListener;)V

    :cond_4
    return-void
.end method

.method public final setEphemeralKey$payments_core_release(Lcom/stripe/android/EphemeralKey;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/EphemeralKeyManager;->ephemeralKey:Lcom/stripe/android/EphemeralKey;

    return-void
.end method

.method public final shouldRefreshKey$payments_core_release(Lcom/stripe/android/EphemeralKey;)Z
    .locals 5

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v2, p0, Lcom/stripe/android/EphemeralKeyManager;->timeSupplier:Lkotlin/jvm/functions/Function0;

    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v1

    iget-wide v3, p0, Lcom/stripe/android/EphemeralKeyManager;->timeBufferInSeconds:J

    add-long/2addr v1, v3

    invoke-virtual {p1}, Lcom/stripe/android/EphemeralKey;->getExpires$payments_core_release()J

    move-result-wide v3

    cmp-long p1, v3, v1

    if-gez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
