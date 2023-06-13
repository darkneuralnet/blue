.class public abstract Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/core/networking/StripeConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/core/networking/StripeConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "AbstractConnection"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResponseBodyType:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/stripe/android/core/networking/StripeConnection<",
        "TResponseBodyType;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\'\u0018\u0000 \u0014*\u0004\u0008\u0001\u0010\u00012\u0008\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0014B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0008\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;",
        "ResponseBodyType",
        "Lcom/stripe/android/core/networking/StripeConnection;",
        "conn",
        "Ljava/net/HttpURLConnection;",
        "(Ljava/net/HttpURLConnection;)V",
        "response",
        "Lcom/stripe/android/core/networking/StripeResponse;",
        "getResponse",
        "()Lcom/stripe/android/core/networking/StripeResponse;",
        "responseCode",
        "",
        "getResponseCode",
        "()I",
        "responseStream",
        "Ljava/io/InputStream;",
        "getResponseStream",
        "()Ljava/io/InputStream;",
        "close",
        "",
        "Companion",
        "stripe-core_release"
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
.field private static final CHARSET:Ljava/lang/String;

.field public static final Companion:Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection$Companion;


# instance fields
.field private final conn:Ljava/net/HttpURLConnection;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;->Companion:Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection$Companion;

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;->CHARSET:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/net/HttpURLConnection;)V
    .locals 1

    const-string v0, "conn"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;->conn:Ljava/net/HttpURLConnection;

    return-void
.end method

.method public static final synthetic access$getCHARSET$cp()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;->CHARSET:Ljava/lang/String;

    return-object v0
.end method

.method private final getResponseStream()Ljava/io/InputStream;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;->getResponseCode()I

    move-result v0

    const/16 v1, 0xc8

    const/4 v2, 0x0

    if-gt v1, v0, :cond_0

    const/16 v1, 0x12c

    if-ge v0, v1, :cond_0

    const/4 v2, 0x1

    :cond_0
    if-eqz v2, :cond_1

    iget-object v0, p0, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;->conn:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;->conn:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v0

    :goto_0
    return-object v0
.end method


# virtual methods
.method public close()V
    .locals 1

    invoke-direct {p0}, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;->getResponseStream()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;->conn:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    return-void
.end method

.method public synthetic getResponse()Lcom/stripe/android/core/networking/StripeResponse;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;->getResponseCode()I

    move-result v0

    new-instance v1, Lcom/stripe/android/core/networking/StripeResponse;

    invoke-direct {p0}, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;->getResponseStream()Ljava/io/InputStream;

    move-result-object v2

    invoke-interface {p0, v2}, Lcom/stripe/android/core/networking/StripeConnection;->createBodyFromResponseStream(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;->conn:Ljava/net/HttpURLConnection;

    invoke-virtual {v3}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v3

    const-string v4, "conn.headerFields"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/core/networking/StripeResponse;-><init>(ILjava/lang/Object;Ljava/util/Map;)V

    return-object v1
.end method

.method public synthetic getResponseCode()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;->conn:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    return v0
.end method
