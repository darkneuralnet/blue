.class public final Lcom/stripe/android/uicore/image/ImageLruMemoryCache;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000-\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004*\u0001\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000c\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000fJ\u000c\u0010\u0014\u001a\u00020\u0011*\u00020\u0011H\u0002R\u0016\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\n\n\u0002\u0010\t\u0012\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/stripe/android/uicore/image/ImageLruMemoryCache;",
        "",
        "maxSize",
        "",
        "(I)V",
        "lruCache",
        "com/stripe/android/uicore/image/ImageLruMemoryCache$lruCache$1",
        "getLruCache$annotations",
        "()V",
        "Lcom/stripe/android/uicore/image/ImageLruMemoryCache$lruCache$1;",
        "getMaxSize",
        "()I",
        "clear",
        "",
        "getBitmap",
        "Landroid/graphics/Bitmap;",
        "key",
        "",
        "put",
        "bitmap",
        "toKey",
        "stripe-ui-core_release"
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
.field public static final $stable:I


# instance fields
.field private final lruCache:Lcom/stripe/android/uicore/image/ImageLruMemoryCache$lruCache$1;

.field private final maxSize:I


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lcom/stripe/android/uicore/image/ImageLruMemoryCache;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/stripe/android/uicore/image/ImageLruMemoryCache;->maxSize:I

    new-instance v0, Lcom/stripe/android/uicore/image/ImageLruMemoryCache$lruCache$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/uicore/image/ImageLruMemoryCache$lruCache$1;-><init>(I)V

    iput-object v0, p0, Lcom/stripe/android/uicore/image/ImageLruMemoryCache;->lruCache:Lcom/stripe/android/uicore/image/ImageLruMemoryCache$lruCache$1;

    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide p1

    const/16 p3, 0x400

    int-to-long v0, p3

    div-long/2addr p1, v0

    long-to-int p1, p1

    div-int/lit8 p1, p1, 0x8

    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/uicore/image/ImageLruMemoryCache;-><init>(I)V

    return-void
.end method

.method private static synthetic getLruCache$annotations()V
    .locals 0

    return-void
.end method

.method private final toKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final clear()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/stripe/android/uicore/image/ImageLruMemoryCache;->lruCache:Lcom/stripe/android/uicore/image/ImageLruMemoryCache$lruCache$1;

    invoke-virtual {v0}, Landroid/util/LruCache;->evictAll()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/stripe/android/uicore/image/ImageLruMemoryCache;->lruCache:Lcom/stripe/android/uicore/image/ImageLruMemoryCache$lruCache$1;

    invoke-direct {p0, p1}, Lcom/stripe/android/uicore/image/ImageLruMemoryCache;->toKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final getMaxSize()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/image/ImageLruMemoryCache;->maxSize:I

    return v0
.end method

.method public final put(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/stripe/android/uicore/image/ImageLruMemoryCache;->lruCache:Lcom/stripe/android/uicore/image/ImageLruMemoryCache$lruCache$1;

    invoke-direct {p0, p1}, Lcom/stripe/android/uicore/image/ImageLruMemoryCache;->toKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/uicore/image/ImageLruMemoryCache;->lruCache:Lcom/stripe/android/uicore/image/ImageLruMemoryCache$lruCache$1;

    invoke-direct {p0, p1}, Lcom/stripe/android/uicore/image/ImageLruMemoryCache;->toKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
