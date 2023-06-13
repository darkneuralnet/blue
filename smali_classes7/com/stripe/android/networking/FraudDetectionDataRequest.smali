.class public final Lcom/stripe/android/networking/FraudDetectionDataRequest;
.super Lcom/stripe/android/core/networking/StripeRequest;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/networking/FraudDetectionDataRequest$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0012\n\u0002\u0008\u0007\n\u0002\u0010\u001c\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u0000 +2\u00020\u0001:\u0001+B!\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016R \u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001bR(\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001d\u0010\n\"\u0004\u0008\u001e\u0010\u001fR\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\"0!X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0014\u0010%\u001a\u00020\u0004X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\u000f\u00a8\u0006,"
    }
    d2 = {
        "Lcom/stripe/android/networking/FraudDetectionDataRequest;",
        "Lcom/stripe/android/core/networking/StripeRequest;",
        "params",
        "",
        "",
        "",
        "guid",
        "(Ljava/util/Map;Ljava/lang/String;)V",
        "headers",
        "getHeaders",
        "()Ljava/util/Map;",
        "headersFactory",
        "Lcom/stripe/android/core/networking/RequestHeadersFactory$FraudDetection;",
        "jsonBody",
        "getJsonBody",
        "()Ljava/lang/String;",
        "method",
        "Lcom/stripe/android/core/networking/StripeRequest$Method;",
        "getMethod",
        "()Lcom/stripe/android/core/networking/StripeRequest$Method;",
        "mimeType",
        "Lcom/stripe/android/core/networking/StripeRequest$MimeType;",
        "getMimeType",
        "()Lcom/stripe/android/core/networking/StripeRequest$MimeType;",
        "postBodyBytes",
        "",
        "getPostBodyBytes",
        "()[B",
        "postHeaders",
        "getPostHeaders",
        "setPostHeaders",
        "(Ljava/util/Map;)V",
        "retryResponseCodes",
        "",
        "",
        "getRetryResponseCodes",
        "()Ljava/lang/Iterable;",
        "url",
        "getUrl",
        "writePostBody",
        "",
        "outputStream",
        "Ljava/io/OutputStream;",
        "Companion",
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


# static fields
.field private static final Companion:Lcom/stripe/android/networking/FraudDetectionDataRequest$Companion;

.field private static final URL:Ljava/lang/String; = "https://m.stripe.com/6"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final headers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final headersFactory:Lcom/stripe/android/core/networking/RequestHeadersFactory$FraudDetection;

.field private final method:Lcom/stripe/android/core/networking/StripeRequest$Method;

.field private final mimeType:Lcom/stripe/android/core/networking/StripeRequest$MimeType;

.field private final params:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private postHeaders:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final retryResponseCodes:Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final url:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/networking/FraudDetectionDataRequest$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/networking/FraudDetectionDataRequest$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/networking/FraudDetectionDataRequest;->Companion:Lcom/stripe/android/networking/FraudDetectionDataRequest$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "guid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/stripe/android/core/networking/StripeRequest;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/networking/FraudDetectionDataRequest;->params:Ljava/util/Map;

    new-instance p1, Lcom/stripe/android/core/networking/RequestHeadersFactory$FraudDetection;

    invoke-direct {p1, p2}, Lcom/stripe/android/core/networking/RequestHeadersFactory$FraudDetection;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/networking/FraudDetectionDataRequest;->headersFactory:Lcom/stripe/android/core/networking/RequestHeadersFactory$FraudDetection;

    sget-object p2, Lcom/stripe/android/core/networking/StripeRequest$Method;->POST:Lcom/stripe/android/core/networking/StripeRequest$Method;

    iput-object p2, p0, Lcom/stripe/android/networking/FraudDetectionDataRequest;->method:Lcom/stripe/android/core/networking/StripeRequest$Method;

    sget-object p2, Lcom/stripe/android/core/networking/StripeRequest$MimeType;->Json:Lcom/stripe/android/core/networking/StripeRequest$MimeType;

    iput-object p2, p0, Lcom/stripe/android/networking/FraudDetectionDataRequest;->mimeType:Lcom/stripe/android/core/networking/StripeRequest$MimeType;

    invoke-static {}, Lcom/stripe/android/core/networking/NetworkConstantsKt;->getDEFAULT_RETRY_CODES()Ljava/lang/Iterable;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/networking/FraudDetectionDataRequest;->retryResponseCodes:Ljava/lang/Iterable;

    const-string p2, "https://m.stripe.com/6"

    iput-object p2, p0, Lcom/stripe/android/networking/FraudDetectionDataRequest;->url:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/RequestHeadersFactory;->create()Ljava/util/Map;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/networking/FraudDetectionDataRequest;->headers:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/RequestHeadersFactory;->createPostHeader()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/networking/FraudDetectionDataRequest;->postHeaders:Ljava/util/Map;

    return-void
.end method

.method private final getJsonBody()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/stripe/android/core/model/StripeJsonUtils;->INSTANCE:Lcom/stripe/android/core/model/StripeJsonUtils;

    iget-object v1, p0, Lcom/stripe/android/networking/FraudDetectionDataRequest;->params:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lcom/stripe/android/core/model/StripeJsonUtils;->mapToJsonObject(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final getPostBodyBytes()[B
    .locals 9

    :try_start_0
    invoke-direct {p0}, Lcom/stripe/android/networking/FraudDetectionDataRequest;->getJsonBody()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v1, "this as java.lang.String).getBytes(charset)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    move-object v6, v0

    new-instance v0, Lcom/stripe/android/core/exception/InvalidRequestException;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Unable to encode parameters to "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ". Please contact support@stripe.com for assistance."

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/core/exception/InvalidRequestException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method


# virtual methods
.method public getHeaders()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/FraudDetectionDataRequest;->headers:Ljava/util/Map;

    return-object v0
.end method

.method public getMethod()Lcom/stripe/android/core/networking/StripeRequest$Method;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/networking/FraudDetectionDataRequest;->method:Lcom/stripe/android/core/networking/StripeRequest$Method;

    return-object v0
.end method

.method public getMimeType()Lcom/stripe/android/core/networking/StripeRequest$MimeType;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/networking/FraudDetectionDataRequest;->mimeType:Lcom/stripe/android/core/networking/StripeRequest$MimeType;

    return-object v0
.end method

.method public getPostHeaders()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/FraudDetectionDataRequest;->postHeaders:Ljava/util/Map;

    return-object v0
.end method

.method public getRetryResponseCodes()Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/networking/FraudDetectionDataRequest;->retryResponseCodes:Ljava/lang/Iterable;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/networking/FraudDetectionDataRequest;->url:Ljava/lang/String;

    return-object v0
.end method

.method public setPostHeaders(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/networking/FraudDetectionDataRequest;->postHeaders:Ljava/util/Map;

    return-void
.end method

.method public writePostBody(Ljava/io/OutputStream;)V
    .locals 1

    const-string v0, "outputStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/stripe/android/networking/FraudDetectionDataRequest;->getPostBodyBytes()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    return-void
.end method
