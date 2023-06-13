.class public Lcom/google/android/filament/gltfio/ResourceLoader;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final mNativeKtx2Provider:J

.field private final mNativeObject:J

.field private final mNativeStbProvider:J


# direct methods
.method public constructor <init>(Lcom/google/android/filament/Engine;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/filament/Engine;->getNativeObject()J

    move-result-wide v0

    const/4 p1, 0x0

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/gltfio/ResourceLoader;->nCreateResourceLoader(JZ)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/filament/gltfio/ResourceLoader;->mNativeObject:J

    invoke-static {v0, v1}, Lcom/google/android/filament/gltfio/ResourceLoader;->nCreateStbProvider(J)J

    move-result-wide v4

    iput-wide v4, p0, Lcom/google/android/filament/gltfio/ResourceLoader;->mNativeStbProvider:J

    invoke-static {v0, v1}, Lcom/google/android/filament/gltfio/ResourceLoader;->nCreateKtx2Provider(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/filament/gltfio/ResourceLoader;->mNativeKtx2Provider:J

    const-string p1, "image/jpeg"

    invoke-static {v2, v3, p1, v4, v5}, Lcom/google/android/filament/gltfio/ResourceLoader;->nAddTextureProvider(JLjava/lang/String;J)V

    const-string p1, "image/png"

    invoke-static {v2, v3, p1, v4, v5}, Lcom/google/android/filament/gltfio/ResourceLoader;->nAddTextureProvider(JLjava/lang/String;J)V

    const-string p1, "image/ktx2"

    invoke-static {v2, v3, p1, v0, v1}, Lcom/google/android/filament/gltfio/ResourceLoader;->nAddTextureProvider(JLjava/lang/String;J)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/filament/Engine;Z)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/filament/Engine;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1, p2}, Lcom/google/android/filament/gltfio/ResourceLoader;->nCreateResourceLoader(JZ)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/google/android/filament/gltfio/ResourceLoader;->mNativeObject:J

    invoke-static {v0, v1}, Lcom/google/android/filament/gltfio/ResourceLoader;->nCreateStbProvider(J)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/filament/gltfio/ResourceLoader;->mNativeStbProvider:J

    invoke-static {v0, v1}, Lcom/google/android/filament/gltfio/ResourceLoader;->nCreateKtx2Provider(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/filament/gltfio/ResourceLoader;->mNativeKtx2Provider:J

    const-string v4, "image/jpeg"

    invoke-static {p1, p2, v4, v2, v3}, Lcom/google/android/filament/gltfio/ResourceLoader;->nAddTextureProvider(JLjava/lang/String;J)V

    const-string v4, "image/png"

    invoke-static {p1, p2, v4, v2, v3}, Lcom/google/android/filament/gltfio/ResourceLoader;->nAddTextureProvider(JLjava/lang/String;J)V

    const-string v2, "image/ktx2"

    invoke-static {p1, p2, v2, v0, v1}, Lcom/google/android/filament/gltfio/ResourceLoader;->nAddTextureProvider(JLjava/lang/String;J)V

    return-void
.end method

.method private static native nAddResourceData(JLjava/lang/String;Ljava/nio/Buffer;I)V
.end method

.method private static native nAddTextureProvider(JLjava/lang/String;J)V
.end method

.method private static native nAsyncBeginLoad(JJ)Z
.end method

.method private static native nAsyncCancelLoad(J)V
.end method

.method private static native nAsyncGetLoadProgress(J)F
.end method

.method private static native nAsyncUpdateLoad(J)V
.end method

.method private static native nCreateKtx2Provider(J)J
.end method

.method private static native nCreateResourceLoader(JZ)J
.end method

.method private static native nCreateStbProvider(J)J
.end method

.method private static native nDestroyResourceLoader(J)V
.end method

.method private static native nDestroyTextureProvider(J)V
.end method

.method private static native nEvictResourceData(J)V
.end method

.method private static native nHasResourceData(JLjava/lang/String;)Z
.end method

.method private static native nLoadResources(JJ)V
.end method


# virtual methods
.method public addResourceData(Ljava/lang/String;Ljava/nio/Buffer;)Lcom/google/android/filament/gltfio/ResourceLoader;
    .locals 3

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/ResourceLoader;->mNativeObject:J

    invoke-virtual {p2}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    invoke-static {v0, v1, p1, p2, v2}, Lcom/google/android/filament/gltfio/ResourceLoader;->nAddResourceData(JLjava/lang/String;Ljava/nio/Buffer;I)V

    return-object p0
.end method

.method public asyncBeginLoad(Lcom/google/android/filament/gltfio/FilamentAsset;)Z
    .locals 4

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/ResourceLoader;->mNativeObject:J

    invoke-virtual {p1}, Lcom/google/android/filament/gltfio/FilamentAsset;->getNativeObject()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/filament/gltfio/ResourceLoader;->nAsyncBeginLoad(JJ)Z

    move-result p1

    return p1
.end method

.method public asyncCancelLoad()V
    .locals 2

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/ResourceLoader;->mNativeObject:J

    invoke-static {v0, v1}, Lcom/google/android/filament/gltfio/ResourceLoader;->nAsyncCancelLoad(J)V

    return-void
.end method

.method public asyncGetLoadProgress()F
    .locals 2

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/ResourceLoader;->mNativeObject:J

    invoke-static {v0, v1}, Lcom/google/android/filament/gltfio/ResourceLoader;->nAsyncGetLoadProgress(J)F

    move-result v0

    return v0
.end method

.method public asyncUpdateLoad()V
    .locals 2

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/ResourceLoader;->mNativeObject:J

    invoke-static {v0, v1}, Lcom/google/android/filament/gltfio/ResourceLoader;->nAsyncUpdateLoad(J)V

    return-void
.end method

.method public destroy()V
    .locals 2

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/ResourceLoader;->mNativeObject:J

    invoke-static {v0, v1}, Lcom/google/android/filament/gltfio/ResourceLoader;->nDestroyResourceLoader(J)V

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/ResourceLoader;->mNativeStbProvider:J

    invoke-static {v0, v1}, Lcom/google/android/filament/gltfio/ResourceLoader;->nDestroyTextureProvider(J)V

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/ResourceLoader;->mNativeKtx2Provider:J

    invoke-static {v0, v1}, Lcom/google/android/filament/gltfio/ResourceLoader;->nDestroyTextureProvider(J)V

    return-void
.end method

.method public evictResourceData()V
    .locals 2

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/ResourceLoader;->mNativeObject:J

    invoke-static {v0, v1}, Lcom/google/android/filament/gltfio/ResourceLoader;->nEvictResourceData(J)V

    return-void
.end method

.method public hasResourceData(Ljava/lang/String;)Z
    .locals 2

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/ResourceLoader;->mNativeObject:J

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/gltfio/ResourceLoader;->nHasResourceData(JLjava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public loadResources(Lcom/google/android/filament/gltfio/FilamentAsset;)Lcom/google/android/filament/gltfio/ResourceLoader;
    .locals 4

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/ResourceLoader;->mNativeObject:J

    invoke-virtual {p1}, Lcom/google/android/filament/gltfio/FilamentAsset;->getNativeObject()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/filament/gltfio/ResourceLoader;->nLoadResources(JJ)V

    return-object p0
.end method
