.class public final Lcom/stripe/android/core/networking/ApiRequest;
.super Lcom/stripe/android/core/networking/StripeRequest;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/core/networking/ApiRequest$Options;,
        Lcom/stripe/android/core/networking/ApiRequest$Companion;,
        Lcom/stripe/android/core/networking/ApiRequest$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0012\n\u0002\u0008\u0008\n\u0002\u0010\u001c\n\u0002\u0010\u0008\n\u0002\u0008\u0011\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u0000 E2\u00020\u0001:\u0003EFGB_\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0008\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\u0008\u0003\u0018\u00010\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0005H\u00c6\u0003J\u0015\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\u0008\u0003\u0018\u00010\u0007H\u00c6\u0003J\t\u00106\u001a\u00020\tH\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000bH\u00c2\u0003J\t\u00108\u001a\u00020\u0005H\u00c2\u0003J\t\u00109\u001a\u00020\u0005H\u00c2\u0003J\t\u0010:\u001a\u00020\u000fH\u00c6\u0003Jg\u0010;\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0014\u0008\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\u0008\u0003\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00052\u0008\u0008\u0002\u0010\r\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000fH\u00c6\u0001J\u0013\u0010<\u001a\u00020\u000f2\u0008\u0010=\u001a\u0004\u0018\u00010>H\u00d6\u0003J\t\u0010?\u001a\u00020,H\u00d6\u0001J\u0008\u0010@\u001a\u00020\u0005H\u0016J\u0010\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0016R\u000e\u0010\u000c\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\u0008\u0003\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u0015R\u0014\u0010!\u001a\u00020\"8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010$R(\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008&\u0010\u0015\"\u0004\u0008\'\u0010(R\u000e\u0010)\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u0008\u0012\u0004\u0012\u00020,0+X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010.R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u00100R\u0014\u00101\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u00082\u0010\u0012\u00a8\u0006H"
    }
    d2 = {
        "Lcom/stripe/android/core/networking/ApiRequest;",
        "Lcom/stripe/android/core/networking/StripeRequest;",
        "method",
        "Lcom/stripe/android/core/networking/StripeRequest$Method;",
        "baseUrl",
        "",
        "params",
        "",
        "options",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "appInfo",
        "Lcom/stripe/android/core/AppInfo;",
        "apiVersion",
        "sdkVersion",
        "shouldCache",
        "",
        "(Lcom/stripe/android/core/networking/StripeRequest$Method;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/AppInfo;Ljava/lang/String;Ljava/lang/String;Z)V",
        "getBaseUrl",
        "()Ljava/lang/String;",
        "headers",
        "getHeaders",
        "()Ljava/util/Map;",
        "headersFactory",
        "Lcom/stripe/android/core/networking/RequestHeadersFactory$Api;",
        "getMethod",
        "()Lcom/stripe/android/core/networking/StripeRequest$Method;",
        "mimeType",
        "Lcom/stripe/android/core/networking/StripeRequest$MimeType;",
        "getMimeType",
        "()Lcom/stripe/android/core/networking/StripeRequest$MimeType;",
        "getOptions",
        "()Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "getParams",
        "postBodyBytes",
        "",
        "getPostBodyBytes",
        "()[B",
        "postHeaders",
        "getPostHeaders",
        "setPostHeaders",
        "(Ljava/util/Map;)V",
        "query",
        "retryResponseCodes",
        "",
        "",
        "getRetryResponseCodes",
        "()Ljava/lang/Iterable;",
        "getShouldCache",
        "()Z",
        "url",
        "getUrl",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "writePostBody",
        "",
        "outputStream",
        "Ljava/io/OutputStream;",
        "Companion",
        "Factory",
        "Options",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nApiRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiRequest.kt\ncom/stripe/android/core/networking/ApiRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n1#2:208\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/core/networking/ApiRequest$Companion;

.field private static volatile apiTestHost:Ljava/lang/String;


# instance fields
.field private final apiVersion:Ljava/lang/String;

.field private final appInfo:Lcom/stripe/android/core/AppInfo;

.field private final baseUrl:Ljava/lang/String;

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

.field private final headersFactory:Lcom/stripe/android/core/networking/RequestHeadersFactory$Api;

.field private final method:Lcom/stripe/android/core/networking/StripeRequest$Method;

.field private final mimeType:Lcom/stripe/android/core/networking/StripeRequest$MimeType;

.field private final options:Lcom/stripe/android/core/networking/ApiRequest$Options;

.field private final params:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;"
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

.field private final query:Ljava/lang/String;

.field private final retryResponseCodes:Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final sdkVersion:Ljava/lang/String;

.field private final shouldCache:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/core/networking/ApiRequest$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/core/networking/ApiRequest$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/core/networking/ApiRequest;->Companion:Lcom/stripe/android/core/networking/ApiRequest$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/core/networking/StripeRequest$Method;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/AppInfo;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/StripeRequest$Method;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lcom/stripe/android/core/AppInfo;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    const-string v7, "method"

    invoke-static {p1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "baseUrl"

    invoke-static {p2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "options"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "apiVersion"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "sdkVersion"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/stripe/android/core/networking/StripeRequest;-><init>()V

    iput-object v1, v0, Lcom/stripe/android/core/networking/ApiRequest;->method:Lcom/stripe/android/core/networking/StripeRequest$Method;

    iput-object v2, v0, Lcom/stripe/android/core/networking/ApiRequest;->baseUrl:Ljava/lang/String;

    iput-object v3, v0, Lcom/stripe/android/core/networking/ApiRequest;->params:Ljava/util/Map;

    iput-object v4, v0, Lcom/stripe/android/core/networking/ApiRequest;->options:Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-object/from16 v7, p5

    iput-object v7, v0, Lcom/stripe/android/core/networking/ApiRequest;->appInfo:Lcom/stripe/android/core/AppInfo;

    iput-object v5, v0, Lcom/stripe/android/core/networking/ApiRequest;->apiVersion:Ljava/lang/String;

    iput-object v6, v0, Lcom/stripe/android/core/networking/ApiRequest;->sdkVersion:Ljava/lang/String;

    move/from16 v1, p8

    iput-boolean v1, v0, Lcom/stripe/android/core/networking/ApiRequest;->shouldCache:Z

    sget-object v1, Lcom/stripe/android/core/networking/QueryStringFactory;->INSTANCE:Lcom/stripe/android/core/networking/QueryStringFactory;

    invoke-virtual {v1, p3}, Lcom/stripe/android/core/networking/QueryStringFactory;->createFromParamsWithEmptyValues(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/core/networking/ApiRequest;->query:Ljava/lang/String;

    new-instance v9, Lcom/stripe/android/core/networking/RequestHeadersFactory$Api;

    const/4 v8, 0x0

    const/4 v10, 0x4

    const/4 v11, 0x0

    move-object v1, v9

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move-object v4, v8

    move v7, v10

    move-object v8, v11

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/core/networking/RequestHeadersFactory$Api;-><init>(Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/AppInfo;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v9, v0, Lcom/stripe/android/core/networking/ApiRequest;->headersFactory:Lcom/stripe/android/core/networking/RequestHeadersFactory$Api;

    sget-object v1, Lcom/stripe/android/core/networking/StripeRequest$MimeType;->Form:Lcom/stripe/android/core/networking/StripeRequest$MimeType;

    iput-object v1, v0, Lcom/stripe/android/core/networking/ApiRequest;->mimeType:Lcom/stripe/android/core/networking/StripeRequest$MimeType;

    invoke-static {}, Lcom/stripe/android/core/networking/NetworkConstantsKt;->getDEFAULT_RETRY_CODES()Ljava/lang/Iterable;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/core/networking/ApiRequest;->retryResponseCodes:Ljava/lang/Iterable;

    invoke-virtual {v9}, Lcom/stripe/android/core/networking/RequestHeadersFactory;->create()Ljava/util/Map;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/core/networking/ApiRequest;->headers:Ljava/util/Map;

    invoke-virtual {v9}, Lcom/stripe/android/core/networking/RequestHeadersFactory;->createPostHeader()Ljava/util/Map;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/core/networking/ApiRequest;->postHeaders:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/core/networking/StripeRequest$Method;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/AppInfo;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v6, v2

    goto :goto_0

    :cond_0
    move-object v6, p3

    :goto_0
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1

    move-object v8, v2

    goto :goto_1

    :cond_1
    move-object/from16 v8, p5

    :goto_1
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_2

    sget-object v1, Lcom/stripe/android/core/ApiVersion;->Companion:Lcom/stripe/android/core/ApiVersion$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/core/ApiVersion$Companion;->get()Lcom/stripe/android/core/ApiVersion;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/core/ApiVersion;->getCode()Ljava/lang/String;

    move-result-object v1

    move-object v9, v1

    goto :goto_2

    :cond_2
    move-object/from16 v9, p6

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    const-string v1, "AndroidBindings/20.21.0"

    move-object v10, v1

    goto :goto_3

    :cond_3
    move-object/from16 v10, p7

    :goto_3
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    move v11, v0

    goto :goto_4

    :cond_4
    move/from16 v11, p8

    :goto_4
    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object/from16 v7, p4

    invoke-direct/range {v3 .. v11}, Lcom/stripe/android/core/networking/ApiRequest;-><init>(Lcom/stripe/android/core/networking/StripeRequest$Method;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/AppInfo;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static final synthetic access$getApiTestHost$cp()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/stripe/android/core/networking/ApiRequest;->apiTestHost:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$setApiTestHost$cp(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lcom/stripe/android/core/networking/ApiRequest;->apiTestHost:Ljava/lang/String;

    return-void
.end method

.method private final component5()Lcom/stripe/android/core/AppInfo;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/core/networking/ApiRequest;->appInfo:Lcom/stripe/android/core/AppInfo;

    return-object v0
.end method

.method private final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/core/networking/ApiRequest;->apiVersion:Ljava/lang/String;

    return-object v0
.end method

.method private final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/core/networking/ApiRequest;->sdkVersion:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/core/networking/ApiRequest;Lcom/stripe/android/core/networking/StripeRequest$Method;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/AppInfo;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;
    .locals 9

    move-object v0, p0

    move/from16 v1, p9

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/core/networking/ApiRequest;->getMethod()Lcom/stripe/android/core/networking/StripeRequest$Method;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/stripe/android/core/networking/ApiRequest;->baseUrl:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/stripe/android/core/networking/ApiRequest;->params:Ljava/util/Map;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/stripe/android/core/networking/ApiRequest;->options:Lcom/stripe/android/core/networking/ApiRequest$Options;

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/stripe/android/core/networking/ApiRequest;->appInfo:Lcom/stripe/android/core/AppInfo;

    goto :goto_4

    :cond_4
    move-object v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/stripe/android/core/networking/ApiRequest;->apiVersion:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/stripe/android/core/networking/ApiRequest;->sdkVersion:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_7

    invoke-virtual {p0}, Lcom/stripe/android/core/networking/ApiRequest;->getShouldCache()Z

    move-result v1

    goto :goto_7

    :cond_7
    move/from16 v1, p8

    :goto_7
    move-object p1, v2

    move-object p2, v3

    move-object p3, v4

    move-object p4, v5

    move-object p5, v6

    move-object p6, v7

    move-object/from16 p7, v8

    move/from16 p8, v1

    invoke-virtual/range {p0 .. p8}, Lcom/stripe/android/core/networking/ApiRequest;->copy(Lcom/stripe/android/core/networking/StripeRequest$Method;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/AppInfo;Ljava/lang/String;Ljava/lang/String;Z)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object v0

    return-object v0
.end method

.method private final getPostBodyBytes()[B
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/stripe/android/core/networking/ApiRequest;->query:Ljava/lang/String;

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
.method public final component1()Lcom/stripe/android/core/networking/StripeRequest$Method;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/core/networking/ApiRequest;->getMethod()Lcom/stripe/android/core/networking/StripeRequest$Method;

    move-result-object v0

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/core/networking/ApiRequest;->baseUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/core/networking/ApiRequest;->params:Ljava/util/Map;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/core/networking/ApiRequest$Options;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/core/networking/ApiRequest;->options:Lcom/stripe/android/core/networking/ApiRequest$Options;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/core/networking/ApiRequest;->getShouldCache()Z

    move-result v0

    return v0
.end method

.method public final copy(Lcom/stripe/android/core/networking/StripeRequest$Method;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/AppInfo;Ljava/lang/String;Ljava/lang/String;Z)Lcom/stripe/android/core/networking/ApiRequest;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/StripeRequest$Method;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lcom/stripe/android/core/AppInfo;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)",
            "Lcom/stripe/android/core/networking/ApiRequest;"
        }
    .end annotation

    const-string v0, "method"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "baseUrl"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    move-object v5, p4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiVersion"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkVersion"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/core/networking/ApiRequest;

    move-object v1, v0

    move-object v4, p3

    move-object v6, p5

    move/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/core/networking/ApiRequest;-><init>(Lcom/stripe/android/core/networking/StripeRequest$Method;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/AppInfo;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/core/networking/ApiRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/core/networking/ApiRequest;

    invoke-virtual {p0}, Lcom/stripe/android/core/networking/ApiRequest;->getMethod()Lcom/stripe/android/core/networking/StripeRequest$Method;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/ApiRequest;->getMethod()Lcom/stripe/android/core/networking/StripeRequest$Method;

    move-result-object v3

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/core/networking/ApiRequest;->baseUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/core/networking/ApiRequest;->baseUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/core/networking/ApiRequest;->params:Ljava/util/Map;

    iget-object v3, p1, Lcom/stripe/android/core/networking/ApiRequest;->params:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/core/networking/ApiRequest;->options:Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object v3, p1, Lcom/stripe/android/core/networking/ApiRequest;->options:Lcom/stripe/android/core/networking/ApiRequest$Options;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/core/networking/ApiRequest;->appInfo:Lcom/stripe/android/core/AppInfo;

    iget-object v3, p1, Lcom/stripe/android/core/networking/ApiRequest;->appInfo:Lcom/stripe/android/core/AppInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/core/networking/ApiRequest;->apiVersion:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/core/networking/ApiRequest;->apiVersion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/core/networking/ApiRequest;->sdkVersion:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/core/networking/ApiRequest;->sdkVersion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    invoke-virtual {p0}, Lcom/stripe/android/core/networking/ApiRequest;->getShouldCache()Z

    move-result v1

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/ApiRequest;->getShouldCache()Z

    move-result p1

    if-eq v1, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getBaseUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/core/networking/ApiRequest;->baseUrl:Ljava/lang/String;

    return-object v0
.end method

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

    iget-object v0, p0, Lcom/stripe/android/core/networking/ApiRequest;->headers:Ljava/util/Map;

    return-object v0
.end method

.method public getMethod()Lcom/stripe/android/core/networking/StripeRequest$Method;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/core/networking/ApiRequest;->method:Lcom/stripe/android/core/networking/StripeRequest$Method;

    return-object v0
.end method

.method public getMimeType()Lcom/stripe/android/core/networking/StripeRequest$MimeType;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/core/networking/ApiRequest;->mimeType:Lcom/stripe/android/core/networking/StripeRequest$MimeType;

    return-object v0
.end method

.method public final getOptions()Lcom/stripe/android/core/networking/ApiRequest$Options;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/core/networking/ApiRequest;->options:Lcom/stripe/android/core/networking/ApiRequest$Options;

    return-object v0
.end method

.method public final getParams()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/core/networking/ApiRequest;->params:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/stripe/android/core/networking/ApiRequest;->postHeaders:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/stripe/android/core/networking/ApiRequest;->retryResponseCodes:Ljava/lang/Iterable;

    return-object v0
.end method

.method public getShouldCache()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/core/networking/ApiRequest;->shouldCache:Z

    return v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    sget-object v1, Lcom/stripe/android/core/networking/StripeRequest$Method;->GET:Lcom/stripe/android/core/networking/StripeRequest$Method;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/core/networking/ApiRequest;->getMethod()Lcom/stripe/android/core/networking/StripeRequest$Method;

    move-result-object v2

    if-eq v1, v2, :cond_1

    sget-object v1, Lcom/stripe/android/core/networking/StripeRequest$Method;->DELETE:Lcom/stripe/android/core/networking/StripeRequest$Method;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/core/networking/ApiRequest;->getMethod()Lcom/stripe/android/core/networking/StripeRequest$Method;

    move-result-object v2

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lcom/stripe/android/core/networking/ApiRequest;->baseUrl:Ljava/lang/String;

    goto :goto_4

    :cond_1
    :goto_0
    const/4 v1, 0x2

    new-array v2, v1, [Ljava/lang/String;

    iget-object v3, v0, Lcom/stripe/android/core/networking/ApiRequest;->baseUrl:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, v0, Lcom/stripe/android/core/networking/ApiRequest;->query:Ljava/lang/String;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v5

    const/4 v6, 0x1

    if-lez v5, :cond_2

    move v5, v6

    goto :goto_1

    :cond_2
    move v5, v4

    :goto_1
    const/4 v7, 0x0

    if-eqz v5, :cond_3

    goto :goto_2

    :cond_3
    move-object v3, v7

    :goto_2
    aput-object v3, v2, v6

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Ljava/lang/Iterable;

    iget-object v2, v0, Lcom/stripe/android/core/networking/ApiRequest;->baseUrl:Ljava/lang/String;

    const-string v3, "?"

    invoke-static {v2, v3, v4, v1, v7}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "&"

    move-object v9, v1

    goto :goto_3

    :cond_4
    move-object v9, v3

    :goto_3
    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x3e

    const/16 v16, 0x0

    invoke-static/range {v8 .. v16}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :goto_4
    return-object v1
.end method

.method public hashCode()I
    .locals 3

    invoke-virtual {p0}, Lcom/stripe/android/core/networking/ApiRequest;->getMethod()Lcom/stripe/android/core/networking/StripeRequest$Method;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/core/networking/ApiRequest;->baseUrl:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/core/networking/ApiRequest;->params:Ljava/util/Map;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/core/networking/ApiRequest;->options:Lcom/stripe/android/core/networking/ApiRequest$Options;

    invoke-virtual {v1}, Lcom/stripe/android/core/networking/ApiRequest$Options;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/core/networking/ApiRequest;->appInfo:Lcom/stripe/android/core/AppInfo;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/core/AppInfo;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/core/networking/ApiRequest;->apiVersion:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/core/networking/ApiRequest;->sdkVersion:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/stripe/android/core/networking/ApiRequest;->getShouldCache()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    :cond_2
    add-int/2addr v0, v1

    return v0
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

    iput-object p1, p0, Lcom/stripe/android/core/networking/ApiRequest;->postHeaders:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/stripe/android/core/networking/ApiRequest;->getMethod()Lcom/stripe/android/core/networking/StripeRequest$Method;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/core/networking/StripeRequest$Method;->getCode()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/core/networking/ApiRequest;->baseUrl:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writePostBody(Ljava/io/OutputStream;)V
    .locals 1

    const-string v0, "outputStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/stripe/android/core/networking/ApiRequest;->getPostBodyBytes()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    return-void
.end method
