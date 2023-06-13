.class public Lcom/google/android/filament/gltfio/AssetLoader;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mEngine:Lcom/google/android/filament/Engine;

.field private mMaterialCache:Lcom/google/android/filament/gltfio/MaterialProvider;

.field private mNativeObject:J


# direct methods
.method public constructor <init>(Lcom/google/android/filament/Engine;Lcom/google/android/filament/gltfio/MaterialProvider;Lcom/google/android/filament/EntityManager;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/filament/Engine;->getNativeObject()J

    move-result-wide v0

    invoke-virtual {p3}, Lcom/google/android/filament/EntityManager;->getNativeObject()J

    move-result-wide v2

    invoke-static {v0, v1, p2, v2, v3}, Lcom/google/android/filament/gltfio/AssetLoader;->nCreateAssetLoader(JLjava/lang/Object;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/filament/gltfio/AssetLoader;->mNativeObject:J

    const-wide/16 v2, 0x0

    cmp-long p3, v0, v2

    if-eqz p3, :cond_0

    iput-object p1, p0, Lcom/google/android/filament/gltfio/AssetLoader;->mEngine:Lcom/google/android/filament/Engine;

    iput-object p2, p0, Lcom/google/android/filament/gltfio/AssetLoader;->mMaterialCache:Lcom/google/android/filament/gltfio/MaterialProvider;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unable to parse glTF asset."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static native nCreateAsset(JLjava/nio/Buffer;I)J
.end method

.method private static native nCreateAssetLoader(JLjava/lang/Object;J)J
.end method

.method private static native nCreateInstance(JJ)J
.end method

.method private static native nCreateInstancedAsset(JLjava/nio/Buffer;I[J)J
.end method

.method private static native nDestroyAsset(JJ)V
.end method

.method private static native nDestroyAssetLoader(J)V
.end method

.method private static native nEnableDiagnostics(JZ)V
.end method


# virtual methods
.method public createAsset(Ljava/nio/Buffer;)Lcom/google/android/filament/gltfio/FilamentAsset;
    .locals 4

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/AssetLoader;->mNativeObject:J

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    invoke-static {v0, v1, p1, v2}, Lcom/google/android/filament/gltfio/AssetLoader;->nCreateAsset(JLjava/nio/Buffer;I)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    new-instance p1, Lcom/google/android/filament/gltfio/FilamentAsset;

    iget-object v2, p0, Lcom/google/android/filament/gltfio/AssetLoader;->mEngine:Lcom/google/android/filament/Engine;

    invoke-direct {p1, v2, v0, v1}, Lcom/google/android/filament/gltfio/FilamentAsset;-><init>(Lcom/google/android/filament/Engine;J)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public createInstance(Lcom/google/android/filament/gltfio/FilamentAsset;)Lcom/google/android/filament/gltfio/FilamentInstance;
    .locals 4

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/AssetLoader;->mNativeObject:J

    invoke-virtual {p1}, Lcom/google/android/filament/gltfio/FilamentAsset;->getNativeObject()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/filament/gltfio/AssetLoader;->nCreateInstance(JJ)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v2, Lcom/google/android/filament/gltfio/FilamentInstance;

    invoke-direct {v2, p1, v0, v1}, Lcom/google/android/filament/gltfio/FilamentInstance;-><init>(Lcom/google/android/filament/gltfio/FilamentAsset;J)V

    return-object v2
.end method

.method public createInstancedAsset(Ljava/nio/Buffer;[Lcom/google/android/filament/gltfio/FilamentInstance;)Lcom/google/android/filament/gltfio/FilamentAsset;
    .locals 6

    array-length v0, p2

    new-array v1, v0, [J

    iget-wide v2, p0, Lcom/google/android/filament/gltfio/AssetLoader;->mNativeObject:J

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v4

    invoke-static {v2, v3, p1, v4, v1}, Lcom/google/android/filament/gltfio/AssetLoader;->nCreateInstancedAsset(JLjava/nio/Buffer;I[J)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p1, Lcom/google/android/filament/gltfio/FilamentAsset;

    iget-object v4, p0, Lcom/google/android/filament/gltfio/AssetLoader;->mEngine:Lcom/google/android/filament/Engine;

    invoke-direct {p1, v4, v2, v3}, Lcom/google/android/filament/gltfio/FilamentAsset;-><init>(Lcom/google/android/filament/Engine;J)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    new-instance v3, Lcom/google/android/filament/gltfio/FilamentInstance;

    aget-wide v4, v1, v2

    invoke-direct {v3, p1, v4, v5}, Lcom/google/android/filament/gltfio/FilamentInstance;-><init>(Lcom/google/android/filament/gltfio/FilamentAsset;J)V

    aput-object v3, p2, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object p1
.end method

.method public destroy()V
    .locals 2

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/AssetLoader;->mNativeObject:J

    invoke-static {v0, v1}, Lcom/google/android/filament/gltfio/AssetLoader;->nDestroyAssetLoader(J)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/filament/gltfio/AssetLoader;->mNativeObject:J

    return-void
.end method

.method public destroyAsset(Lcom/google/android/filament/gltfio/FilamentAsset;)V
    .locals 4

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/AssetLoader;->mNativeObject:J

    invoke-virtual {p1}, Lcom/google/android/filament/gltfio/FilamentAsset;->getNativeObject()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/filament/gltfio/AssetLoader;->nDestroyAsset(JJ)V

    invoke-virtual {p1}, Lcom/google/android/filament/gltfio/FilamentAsset;->clearNativeObject()V

    return-void
.end method

.method public enableDiagnostics(Z)V
    .locals 2

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/AssetLoader;->mNativeObject:J

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/gltfio/AssetLoader;->nEnableDiagnostics(JZ)V

    return-void
.end method
