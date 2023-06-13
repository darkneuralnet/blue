.class public final Lcom/stripe/android/uicore/image/StripeImageLoader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/image/StripeImageLoader$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 32\u00020\u0001:\u00013B;\u0012\u0006\u00100\u001a\u00020/\u0012\u0008\u0008\u0002\u0010 \u001a\u00020\u001f\u0012\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0008\u0008\u0002\u0010&\u001a\u00020%\u0012\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010(\u00a2\u0006\u0004\u00081\u00102J(\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\t\u0010\u0007J<\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0083@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ,\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0083@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J?\u0010\u0017\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u0016\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014H\u0082@\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J<\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u000fJ,\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u0012R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0016\u0010#\u001a\u0004\u0018\u00010\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0016\u0010)\u001a\u0004\u0018\u00010(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.\u0082\u0002\u000f\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u00064"
    }
    d2 = {
        "Lcom/stripe/android/uicore/image/StripeImageLoader;",
        "",
        "",
        "url",
        "Lkotlin/Result;",
        "Landroid/graphics/Bitmap;",
        "loadFromMemory-CmtIpJM",
        "(Ljava/lang/String;)Lkotlin/Result;",
        "loadFromMemory",
        "loadFromDisk-CmtIpJM",
        "loadFromDisk",
        "",
        "width",
        "height",
        "loadFromNetwork-BWLJW6A",
        "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadFromNetwork",
        "loadFromNetwork-gIAlu-s",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "T",
        "Lkotlin/Function1;",
        "Lkotlin/coroutines/Continuation;",
        "action",
        "withMutexByUrlLock",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "message",
        "",
        "debug",
        "load-BWLJW6A",
        "load",
        "load-gIAlu-s",
        "Lcom/stripe/android/core/Logger;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "Lcom/stripe/android/uicore/image/ImageLruMemoryCache;",
        "memoryCache",
        "Lcom/stripe/android/uicore/image/ImageLruMemoryCache;",
        "Lcom/stripe/android/uicore/image/NetworkImageDecoder;",
        "networkImageDecoder",
        "Lcom/stripe/android/uicore/image/NetworkImageDecoder;",
        "Lcom/stripe/android/uicore/image/ImageLruDiskCache;",
        "diskCache",
        "Lcom/stripe/android/uicore/image/ImageLruDiskCache;",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "LSX2;",
        "imageLoadMutexes",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;Lcom/stripe/android/core/Logger;Lcom/stripe/android/uicore/image/ImageLruMemoryCache;Lcom/stripe/android/uicore/image/NetworkImageDecoder;Lcom/stripe/android/uicore/image/ImageLruDiskCache;)V",
        "Companion",
        "stripe-ui-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nStripeImageLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeImageLoader.kt\ncom/stripe/android/uicore/image/StripeImageLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 4 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,139:1\n1#2:140\n1#2:143\n73#3,2:141\n107#4,10:144\n*S KotlinDebug\n*F\n+ 1 StripeImageLoader.kt\ncom/stripe/android/uicore/image/StripeImageLoader\n*L\n121#1:143\n121#1:141,2\n121#1:144,10\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I

.field private static final Companion:Lcom/stripe/android/uicore/image/StripeImageLoader$Companion;

.field private static final TAG:Ljava/lang/String; = "StripeImageLoader"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final diskCache:Lcom/stripe/android/uicore/image/ImageLruDiskCache;

.field private final imageLoadMutexes:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "LSX2;",
            ">;"
        }
    .end annotation
.end field

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final memoryCache:Lcom/stripe/android/uicore/image/ImageLruMemoryCache;

.field private final networkImageDecoder:Lcom/stripe/android/uicore/image/NetworkImageDecoder;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/uicore/image/StripeImageLoader$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/uicore/image/StripeImageLoader$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/image/StripeImageLoader;->Companion:Lcom/stripe/android/uicore/image/StripeImageLoader$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/uicore/image/StripeImageLoader;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/stripe/android/core/Logger;Lcom/stripe/android/uicore/image/ImageLruMemoryCache;Lcom/stripe/android/uicore/image/NetworkImageDecoder;Lcom/stripe/android/uicore/image/ImageLruDiskCache;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "logger"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "networkImageDecoder"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/uicore/image/StripeImageLoader;->logger:Lcom/stripe/android/core/Logger;

    iput-object p3, p0, Lcom/stripe/android/uicore/image/StripeImageLoader;->memoryCache:Lcom/stripe/android/uicore/image/ImageLruMemoryCache;

    iput-object p4, p0, Lcom/stripe/android/uicore/image/StripeImageLoader;->networkImageDecoder:Lcom/stripe/android/uicore/image/NetworkImageDecoder;

    iput-object p5, p0, Lcom/stripe/android/uicore/image/StripeImageLoader;->diskCache:Lcom/stripe/android/uicore/image/ImageLruDiskCache;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/uicore/image/StripeImageLoader;->imageLoadMutexes:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lcom/stripe/android/core/Logger;Lcom/stripe/android/uicore/image/ImageLruMemoryCache;Lcom/stripe/android/uicore/image/NetworkImageDecoder;Lcom/stripe/android/uicore/image/ImageLruDiskCache;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    and-int/lit8 v0, p6, 0x2

    if-eqz v0, :cond_0

    sget-object v0, Lcom/stripe/android/core/Logger;->Companion:Lcom/stripe/android/core/Logger$Companion;

    invoke-static {p1}, Lcom/stripe/android/uicore/image/StripeImageLoaderKt;->access$isDebuggable(Landroid/content/Context;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/core/Logger$Companion;->getInstance(Z)Lcom/stripe/android/core/Logger;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    and-int/lit8 v1, p6, 0x4

    if-eqz v1, :cond_1

    new-instance v1, Lcom/stripe/android/uicore/image/ImageLruMemoryCache;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v4, v2, v3}, Lcom/stripe/android/uicore/image/ImageLruMemoryCache;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_1
    move-object v1, p3

    :goto_1
    and-int/lit8 v2, p6, 0x8

    if-eqz v2, :cond_2

    new-instance v2, Lcom/stripe/android/uicore/image/NetworkImageDecoder;

    invoke-direct {v2}, Lcom/stripe/android/uicore/image/NetworkImageDecoder;-><init>()V

    goto :goto_2

    :cond_2
    move-object v2, p4

    :goto_2
    and-int/lit8 v3, p6, 0x10

    if-eqz v3, :cond_3

    new-instance v3, Lcom/stripe/android/uicore/image/ImageLruDiskCache;

    const-string v6, "stripe_image_cache"

    const-wide/16 v7, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    move-object v4, v3

    move-object v5, p1

    invoke-direct/range {v4 .. v10}, Lcom/stripe/android/uicore/image/ImageLruDiskCache;-><init>(Landroid/content/Context;Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_3

    :cond_3
    move-object/from16 v3, p5

    :goto_3
    move-object p2, p0

    move-object p3, p1

    move-object p4, v0

    move-object/from16 p5, v1

    move-object/from16 p6, v2

    move-object/from16 p7, v3

    invoke-direct/range {p2 .. p7}, Lcom/stripe/android/uicore/image/StripeImageLoader;-><init>(Landroid/content/Context;Lcom/stripe/android/core/Logger;Lcom/stripe/android/uicore/image/ImageLruMemoryCache;Lcom/stripe/android/uicore/image/NetworkImageDecoder;Lcom/stripe/android/uicore/image/ImageLruDiskCache;)V

    return-void
.end method

.method public static final synthetic access$loadFromDisk-CmtIpJM(Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;)Lkotlin/Result;
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/uicore/image/StripeImageLoader;->loadFromDisk-CmtIpJM(Ljava/lang/String;)Lkotlin/Result;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$loadFromMemory-CmtIpJM(Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;)Lkotlin/Result;
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/uicore/image/StripeImageLoader;->loadFromMemory-CmtIpJM(Ljava/lang/String;)Lkotlin/Result;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$loadFromNetwork-BWLJW6A(Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/uicore/image/StripeImageLoader;->loadFromNetwork-BWLJW6A(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$loadFromNetwork-gIAlu-s(Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/uicore/image/StripeImageLoader;->loadFromNetwork-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$withMutexByUrlLock(Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/uicore/image/StripeImageLoader;->withMutexByUrlLock(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final debug(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/uicore/image/StripeImageLoader;->logger:Lcom/stripe/android/core/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "StripeImageLoader: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    return-void
.end method

.method private final loadFromDisk-CmtIpJM(Ljava/lang/String;)Lkotlin/Result;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlin/Result<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/image/StripeImageLoader;->diskCache:Lcom/stripe/android/uicore/image/ImageLruDiskCache;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/stripe/android/uicore/image/ImageLruDiskCache;->getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    const-string v2, "Image loaded from disk cache"

    invoke-direct {p0, v2}, Lcom/stripe/android/uicore/image/StripeImageLoader;->debug(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    const-string v2, "Image not found on disk cache"

    invoke-direct {p0, v2}, Lcom/stripe/android/uicore/image/StripeImageLoader;->debug(Ljava/lang/String;)V

    :goto_1
    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/stripe/android/uicore/image/StripeImageLoader;->memoryCache:Lcom/stripe/android/uicore/image/ImageLruMemoryCache;

    if-eqz v1, :cond_2

    invoke-virtual {v1, p1, v0}, Lcom/stripe/android/uicore/image/ImageLruMemoryCache;->put(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    :cond_2
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object v1

    :cond_3
    return-object v1
.end method

.method private final loadFromMemory-CmtIpJM(Ljava/lang/String;)Lkotlin/Result;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlin/Result<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/image/StripeImageLoader;->memoryCache:Lcom/stripe/android/uicore/image/ImageLruMemoryCache;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/stripe/android/uicore/image/ImageLruMemoryCache;->getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    const-string v2, "Image loaded from memory cache"

    invoke-direct {p0, v2}, Lcom/stripe/android/uicore/image/StripeImageLoader;->debug(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    const-string v2, "Image not found on memory cache"

    invoke-direct {p0, v2}, Lcom/stripe/android/uicore/image/StripeImageLoader;->debug(Ljava/lang/String;)V

    :goto_1
    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/stripe/android/uicore/image/StripeImageLoader;->diskCache:Lcom/stripe/android/uicore/image/ImageLruDiskCache;

    if-eqz v1, :cond_2

    invoke-virtual {v1, p1, v0}, Lcom/stripe/android/uicore/image/ImageLruDiskCache;->put(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    :cond_2
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object v1

    :cond_3
    return-object v1
.end method

.method private final loadFromNetwork-BWLJW6A(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Landroid/graphics/Bitmap;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/uicore/image/StripeImageLoader$loadFromNetwork$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/uicore/image/StripeImageLoader$loadFromNetwork$1;

    iget v1, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$loadFromNetwork$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$loadFromNetwork$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/uicore/image/StripeImageLoader$loadFromNetwork$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/uicore/image/StripeImageLoader$loadFromNetwork$1;-><init>(Lcom/stripe/android/uicore/image/StripeImageLoader;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$loadFromNetwork$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$loadFromNetwork$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$loadFromNetwork$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p2, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$loadFromNetwork$1;->L$0:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/uicore/image/StripeImageLoader;

    :try_start_0
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :try_start_1
    sget-object p4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Image "

    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " loading from internet ("

    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " x "

    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-direct {p0, p4}, Lcom/stripe/android/uicore/image/StripeImageLoader;->debug(Ljava/lang/String;)V

    iget-object p4, p0, Lcom/stripe/android/uicore/image/StripeImageLoader;->networkImageDecoder:Lcom/stripe/android/uicore/image/NetworkImageDecoder;

    iput-object p0, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$loadFromNetwork$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$loadFromNetwork$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$loadFromNetwork$1;->label:I

    invoke-virtual {p4, p1, p2, p3, v0}, Lcom/stripe/android/uicore/image/NetworkImageDecoder;->decode(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    move-object p2, p0

    :goto_1
    :try_start_2
    check-cast p4, Landroid/graphics/Bitmap;

    if-eqz p4, :cond_5

    iget-object p3, p2, Lcom/stripe/android/uicore/image/StripeImageLoader;->diskCache:Lcom/stripe/android/uicore/image/ImageLruDiskCache;

    if-eqz p3, :cond_4

    invoke-virtual {p3, p1, p4}, Lcom/stripe/android/uicore/image/ImageLruDiskCache;->put(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    :cond_4
    iget-object p3, p2, Lcom/stripe/android/uicore/image/StripeImageLoader;->memoryCache:Lcom/stripe/android/uicore/image/ImageLruMemoryCache;

    if-eqz p3, :cond_6

    invoke-virtual {p3, p1, p4}, Lcom/stripe/android/uicore/image/ImageLruMemoryCache;->put(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    goto :goto_2

    :cond_5
    const/4 p4, 0x0

    :cond_6
    :goto_2
    invoke-static {p4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4

    :catchall_1
    move-exception p1

    move-object p2, p0

    :goto_3
    sget-object p3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_4
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p3

    if-eqz p3, :cond_7

    iget-object p2, p2, Lcom/stripe/android/uicore/image/StripeImageLoader;->logger:Lcom/stripe/android/core/Logger;

    const-string p4, "StripeImageLoader: Could not load image from network"

    invoke-interface {p2, p4, p3}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    return-object p1
.end method

.method private final loadFromNetwork-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Landroid/graphics/Bitmap;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/uicore/image/StripeImageLoader$loadFromNetwork$4;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/uicore/image/StripeImageLoader$loadFromNetwork$4;

    iget v1, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$loadFromNetwork$4;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$loadFromNetwork$4;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/uicore/image/StripeImageLoader$loadFromNetwork$4;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/uicore/image/StripeImageLoader$loadFromNetwork$4;-><init>(Lcom/stripe/android/uicore/image/StripeImageLoader;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$loadFromNetwork$4;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$loadFromNetwork$4;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$loadFromNetwork$4;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v0, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$loadFromNetwork$4;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/uicore/image/StripeImageLoader;

    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :try_start_1
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Image "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " loading from internet"

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/stripe/android/uicore/image/StripeImageLoader;->debug(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/uicore/image/StripeImageLoader;->networkImageDecoder:Lcom/stripe/android/uicore/image/NetworkImageDecoder;

    iput-object p0, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$loadFromNetwork$4;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$loadFromNetwork$4;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$loadFromNetwork$4;->label:I

    invoke-virtual {p2, p1, v0}, Lcom/stripe/android/uicore/image/NetworkImageDecoder;->decode(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    :try_start_2
    check-cast p2, Landroid/graphics/Bitmap;

    if-eqz p2, :cond_5

    iget-object v1, v0, Lcom/stripe/android/uicore/image/StripeImageLoader;->diskCache:Lcom/stripe/android/uicore/image/ImageLruDiskCache;

    if-eqz v1, :cond_4

    invoke-virtual {v1, p1, p2}, Lcom/stripe/android/uicore/image/ImageLruDiskCache;->put(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    :cond_4
    iget-object v1, v0, Lcom/stripe/android/uicore/image/StripeImageLoader;->memoryCache:Lcom/stripe/android/uicore/image/ImageLruMemoryCache;

    if-eqz v1, :cond_6

    invoke-virtual {v1, p1, p2}, Lcom/stripe/android/uicore/image/ImageLruMemoryCache;->put(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    goto :goto_2

    :cond_5
    const/4 p2, 0x0

    :cond_6
    :goto_2
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4

    :catchall_1
    move-exception p1

    move-object v0, p0

    :goto_3
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_4
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-eqz p2, :cond_7

    iget-object v0, v0, Lcom/stripe/android/uicore/image/StripeImageLoader;->logger:Lcom/stripe/android/core/Logger;

    const-string v1, "StripeImageLoader: Could not load image from network"

    invoke-interface {v0, v1, p2}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    return-object p1
.end method

.method private final withMutexByUrlLock(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/uicore/image/StripeImageLoader$withMutexByUrlLock$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/uicore/image/StripeImageLoader$withMutexByUrlLock$1;

    iget v1, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$withMutexByUrlLock$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$withMutexByUrlLock$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/uicore/image/StripeImageLoader$withMutexByUrlLock$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/uicore/image/StripeImageLoader$withMutexByUrlLock$1;-><init>(Lcom/stripe/android/uicore/image/StripeImageLoader;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$withMutexByUrlLock$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$withMutexByUrlLock$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$withMutexByUrlLock$1;->L$2:Ljava/lang/Object;

    check-cast p1, LSX2;

    iget-object p2, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$withMutexByUrlLock$1;->L$1:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object v0, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$withMutexByUrlLock$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/uicore/image/StripeImageLoader;

    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception p2

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$withMutexByUrlLock$1;->L$3:Ljava/lang/Object;

    check-cast p1, LSX2;

    iget-object p2, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$withMutexByUrlLock$1;->L$2:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/functions/Function1;

    iget-object v2, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$withMutexByUrlLock$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v4, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$withMutexByUrlLock$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/uicore/image/StripeImageLoader;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v6, v2

    move-object v2, p1

    move-object p1, v6

    goto :goto_2

    :cond_3
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p3, p0, Lcom/stripe/android/uicore/image/StripeImageLoader;->imageLoadMutexes:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_5

    const/4 v2, 0x0

    invoke-static {v2, v4, v5}, LUX2;->b(ZILjava/lang/Object;)LSX2;

    move-result-object v2

    invoke-interface {p3, p1, v2}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-nez p3, :cond_4

    goto :goto_1

    :cond_4
    move-object v2, p3

    :cond_5
    :goto_1
    const-string p3, "imageLoadMutexes.getOrPut(url) { Mutex() }"

    invoke-static {v2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, LSX2;

    iput-object p0, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$withMutexByUrlLock$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$withMutexByUrlLock$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$withMutexByUrlLock$1;->L$2:Ljava/lang/Object;

    iput-object v2, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$withMutexByUrlLock$1;->L$3:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$withMutexByUrlLock$1;->label:I

    invoke-interface {v2, v5, v0}, LSX2;->a(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_6

    return-object v1

    :cond_6
    move-object v4, p0

    :goto_2
    :try_start_1
    iput-object v4, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$withMutexByUrlLock$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$withMutexByUrlLock$1;->L$1:Ljava/lang/Object;

    iput-object v2, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$withMutexByUrlLock$1;->L$2:Ljava/lang/Object;

    iput-object v5, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$withMutexByUrlLock$1;->L$3:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$withMutexByUrlLock$1;->label:I

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p3, v1, :cond_7

    return-object v1

    :cond_7
    move-object p2, p1

    move-object p1, v2

    move-object v0, v4

    :goto_3
    invoke-interface {p1, v5}, LSX2;->b(Ljava/lang/Object;)V

    iget-object p1, v0, Lcom/stripe/android/uicore/image/StripeImageLoader;->imageLoadMutexes:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p3

    :catchall_1
    move-exception p2

    move-object p1, v2

    :goto_4
    invoke-interface {p1, v5}, LSX2;->b(Ljava/lang/Object;)V

    throw p2
.end method


# virtual methods
.method public final load-BWLJW6A(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Landroid/graphics/Bitmap;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/uicore/image/StripeImageLoader$load$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/uicore/image/StripeImageLoader$load$1;

    iget v1, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$load$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$load$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/uicore/image/StripeImageLoader$load$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/uicore/image/StripeImageLoader$load$1;-><init>(Lcom/stripe/android/uicore/image/StripeImageLoader;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$load$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$load$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    invoke-static {}, LT41;->b()LSC0;

    move-result-object p4

    new-instance v2, Lcom/stripe/android/uicore/image/StripeImageLoader$load$2;

    const/4 v9, 0x0

    move-object v4, v2

    move-object v5, p0

    move-object v6, p1

    move v7, p2

    move v8, p3

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/uicore/image/StripeImageLoader$load$2;-><init>(Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;IILkotlin/coroutines/Continuation;)V

    iput v3, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$load$1;->label:I

    invoke-static {p4, v2, v0}, LX30;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p4, Lkotlin/Result;

    invoke-virtual {p4}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final load-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Landroid/graphics/Bitmap;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/uicore/image/StripeImageLoader$load$3;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/uicore/image/StripeImageLoader$load$3;

    iget v1, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$load$3;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$load$3;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/uicore/image/StripeImageLoader$load$3;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/uicore/image/StripeImageLoader$load$3;-><init>(Lcom/stripe/android/uicore/image/StripeImageLoader;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$load$3;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$load$3;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    invoke-static {}, LT41;->b()LSC0;

    move-result-object p2

    new-instance v2, Lcom/stripe/android/uicore/image/StripeImageLoader$load$4;

    const/4 v4, 0x0

    invoke-direct {v2, p0, p1, v4}, Lcom/stripe/android/uicore/image/StripeImageLoader$load$4;-><init>(Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    iput v3, v0, Lcom/stripe/android/uicore/image/StripeImageLoader$load$3;->label:I

    invoke-static {p2, v2, v0}, LX30;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
