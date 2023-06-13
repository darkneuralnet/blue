.class public final Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/repository/ConsumersApiServiceImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u0004H\u0002R\u0014\u0010\u0003\u001a\u00020\u00048@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u0006\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;",
        "",
        "()V",
        "confirmConsumerVerificationUrl",
        "",
        "getConfirmConsumerVerificationUrl$payments_model_release",
        "()Ljava/lang/String;",
        "consumerSessionLookupUrl",
        "getConsumerSessionLookupUrl$payments_model_release",
        "startConsumerVerificationUrl",
        "getStartConsumerVerificationUrl$payments_model_release",
        "getApiUrl",
        "path",
        "payments-model_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
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

    invoke-direct {p0}, Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;-><init>()V

    return-void
.end method

.method private final getApiUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/stripe/android/core/networking/ApiRequest;->Companion:Lcom/stripe/android/core/networking/ApiRequest$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/core/networking/ApiRequest$Companion;->getAPI_HOST()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/v1/"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final synthetic getConfirmConsumerVerificationUrl$payments_model_release()Ljava/lang/String;
    .locals 1

    const-string v0, "consumers/sessions/confirm_verification"

    invoke-direct {p0, v0}, Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;->getApiUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic getConsumerSessionLookupUrl$payments_model_release()Ljava/lang/String;
    .locals 1

    const-string v0, "consumers/sessions/lookup"

    invoke-direct {p0, v0}, Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;->getApiUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic getStartConsumerVerificationUrl$payments_model_release()Ljava/lang/String;
    .locals 1

    const-string v0, "consumers/sessions/start_verification"

    invoke-direct {p0, v0}, Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;->getApiUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
