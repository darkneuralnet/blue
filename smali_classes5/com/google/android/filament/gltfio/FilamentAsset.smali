.class public Lcom/google/android/filament/gltfio/FilamentAsset;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mEngine:Lcom/google/android/filament/Engine;

.field private mNativeObject:J

.field private mPrimaryInstance:Lcom/google/android/filament/gltfio/FilamentInstance;


# direct methods
.method public constructor <init>(Lcom/google/android/filament/Engine;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mEngine:Lcom/google/android/filament/Engine;

    iput-wide p2, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mNativeObject:J

    return-void
.end method

.method private static native nGetBoundingBox(J[F)V
.end method

.method private static native nGetCameraEntities(J[I)V
.end method

.method private static native nGetCameraEntityCount(J)I
.end method

.method private static native nGetEntities(J[I)V
.end method

.method private static native nGetEntitiesByName(JLjava/lang/String;[I)I
.end method

.method private static native nGetEntitiesByPrefix(JLjava/lang/String;[I)I
.end method

.method private static native nGetEntityCount(J)I
.end method

.method private static native nGetExtras(JI)Ljava/lang/String;
.end method

.method private static native nGetFirstEntityByName(JLjava/lang/String;)I
.end method

.method private static native nGetInstance(J)J
.end method

.method private static native nGetLightEntities(J[I)V
.end method

.method private static native nGetLightEntityCount(J)I
.end method

.method private static native nGetMorphTargetCount(JI)I
.end method

.method private static native nGetMorphTargetNames(JI[Ljava/lang/String;)V
.end method

.method private static native nGetName(JI)Ljava/lang/String;
.end method

.method private static native nGetRenderableEntities(J[I)V
.end method

.method private static native nGetRenderableEntityCount(J)I
.end method

.method private static native nGetResourceUriCount(J)I
.end method

.method private static native nGetResourceUris(J[Ljava/lang/String;)V
.end method

.method private static native nGetRoot(J)I
.end method

.method private static native nPopRenderable(J)I
.end method

.method private static native nPopRenderables(J[I)I
.end method

.method private static native nReleaseSourceData(J)V
.end method


# virtual methods
.method public clearNativeObject()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mPrimaryInstance:Lcom/google/android/filament/gltfio/FilamentInstance;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mNativeObject:J

    return-void
.end method

.method public getBoundingBox()Lcom/google/android/filament/Box;
    .locals 10

    const/4 v0, 0x6

    new-array v0, v0, [F

    iget-wide v1, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mNativeObject:J

    invoke-static {v1, v2, v0}, Lcom/google/android/filament/gltfio/FilamentAsset;->nGetBoundingBox(J[F)V

    new-instance v1, Lcom/google/android/filament/Box;

    const/4 v2, 0x0

    aget v4, v0, v2

    const/4 v2, 0x1

    aget v5, v0, v2

    const/4 v2, 0x2

    aget v6, v0, v2

    const/4 v2, 0x3

    aget v7, v0, v2

    const/4 v2, 0x4

    aget v8, v0, v2

    const/4 v2, 0x5

    aget v9, v0, v2

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, Lcom/google/android/filament/Box;-><init>(FFFFFF)V

    return-object v1
.end method

.method public getCameraEntities()[I
    .locals 3
    .annotation build Lcom/google/android/filament/Entity;
    .end annotation

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mNativeObject:J

    invoke-static {v0, v1}, Lcom/google/android/filament/gltfio/FilamentAsset;->nGetCameraEntityCount(J)I

    move-result v0

    new-array v0, v0, [I

    iget-wide v1, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mNativeObject:J

    invoke-static {v1, v2, v0}, Lcom/google/android/filament/gltfio/FilamentAsset;->nGetCameraEntities(J[I)V

    return-object v0
.end method

.method public getEngine()Lcom/google/android/filament/Engine;
    .locals 1

    iget-object v0, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mEngine:Lcom/google/android/filament/Engine;

    return-object v0
.end method

.method public getEntities()[I
    .locals 3
    .annotation build Lcom/google/android/filament/Entity;
    .end annotation

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mNativeObject:J

    invoke-static {v0, v1}, Lcom/google/android/filament/gltfio/FilamentAsset;->nGetEntityCount(J)I

    move-result v0

    new-array v0, v0, [I

    iget-wide v1, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mNativeObject:J

    invoke-static {v1, v2, v0}, Lcom/google/android/filament/gltfio/FilamentAsset;->nGetEntities(J[I)V

    return-object v0
.end method

.method public getEntitiesByName(Ljava/lang/String;)[I
    .locals 3
    .annotation build Lcom/google/android/filament/Entity;
    .end annotation

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mNativeObject:J

    const/4 v2, 0x0

    invoke-static {v0, v1, p1, v2}, Lcom/google/android/filament/gltfio/FilamentAsset;->nGetEntitiesByName(JLjava/lang/String;[I)I

    move-result v0

    new-array v0, v0, [I

    iget-wide v1, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mNativeObject:J

    invoke-static {v1, v2, p1, v0}, Lcom/google/android/filament/gltfio/FilamentAsset;->nGetEntitiesByName(JLjava/lang/String;[I)I

    return-object v0
.end method

.method public getEntitiesByPrefix(Ljava/lang/String;)[I
    .locals 3
    .annotation build Lcom/google/android/filament/Entity;
    .end annotation

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mNativeObject:J

    const/4 v2, 0x0

    invoke-static {v0, v1, p1, v2}, Lcom/google/android/filament/gltfio/FilamentAsset;->nGetEntitiesByPrefix(JLjava/lang/String;[I)I

    move-result v0

    new-array v0, v0, [I

    iget-wide v1, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mNativeObject:J

    invoke-static {v1, v2, p1, v0}, Lcom/google/android/filament/gltfio/FilamentAsset;->nGetEntitiesByPrefix(JLjava/lang/String;[I)I

    return-object v0
.end method

.method public getExtras(I)Ljava/lang/String;
    .locals 2
    .param p1    # I
        .annotation build Lcom/google/android/filament/Entity;
        .end annotation
    .end param

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mNativeObject:J

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/gltfio/FilamentAsset;->nGetExtras(JI)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getFirstEntityByName(Ljava/lang/String;)I
    .locals 2
    .annotation build Lcom/google/android/filament/Entity;
    .end annotation

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mNativeObject:J

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/gltfio/FilamentAsset;->nGetFirstEntityByName(JLjava/lang/String;)I

    move-result p1

    return p1
.end method

.method public getInstance()Lcom/google/android/filament/gltfio/FilamentInstance;
    .locals 3

    iget-object v0, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mPrimaryInstance:Lcom/google/android/filament/gltfio/FilamentInstance;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/filament/gltfio/FilamentAsset;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/filament/gltfio/FilamentAsset;->nGetInstance(J)J

    move-result-wide v0

    new-instance v2, Lcom/google/android/filament/gltfio/FilamentInstance;

    invoke-direct {v2, p0, v0, v1}, Lcom/google/android/filament/gltfio/FilamentInstance;-><init>(Lcom/google/android/filament/gltfio/FilamentAsset;J)V

    iput-object v2, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mPrimaryInstance:Lcom/google/android/filament/gltfio/FilamentInstance;

    return-object v2
.end method

.method public getLightEntities()[I
    .locals 3
    .annotation build Lcom/google/android/filament/Entity;
    .end annotation

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mNativeObject:J

    invoke-static {v0, v1}, Lcom/google/android/filament/gltfio/FilamentAsset;->nGetLightEntityCount(J)I

    move-result v0

    new-array v0, v0, [I

    iget-wide v1, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mNativeObject:J

    invoke-static {v1, v2, v0}, Lcom/google/android/filament/gltfio/FilamentAsset;->nGetLightEntities(J[I)V

    return-object v0
.end method

.method public getMorphTargetNames(I)[Ljava/lang/String;
    .locals 3
    .param p1    # I
        .annotation build Lcom/google/android/filament/Entity;
        .end annotation
    .end param

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mNativeObject:J

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/gltfio/FilamentAsset;->nGetMorphTargetCount(JI)I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    iget-wide v1, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mNativeObject:J

    invoke-static {v1, v2, p1, v0}, Lcom/google/android/filament/gltfio/FilamentAsset;->nGetMorphTargetNames(JI[Ljava/lang/String;)V

    return-object v0
.end method

.method public getName(I)Ljava/lang/String;
    .locals 2
    .param p1    # I
        .annotation build Lcom/google/android/filament/Entity;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/google/android/filament/gltfio/FilamentAsset;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/gltfio/FilamentAsset;->nGetName(JI)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getNativeObject()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mNativeObject:J

    return-wide v0
.end method

.method public getRenderableEntities()[I
    .locals 3
    .annotation build Lcom/google/android/filament/Entity;
    .end annotation

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mNativeObject:J

    invoke-static {v0, v1}, Lcom/google/android/filament/gltfio/FilamentAsset;->nGetRenderableEntityCount(J)I

    move-result v0

    new-array v0, v0, [I

    iget-wide v1, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mNativeObject:J

    invoke-static {v1, v2, v0}, Lcom/google/android/filament/gltfio/FilamentAsset;->nGetRenderableEntities(J[I)V

    return-object v0
.end method

.method public getResourceUris()[Ljava/lang/String;
    .locals 3

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mNativeObject:J

    invoke-static {v0, v1}, Lcom/google/android/filament/gltfio/FilamentAsset;->nGetResourceUriCount(J)I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    iget-wide v1, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mNativeObject:J

    invoke-static {v1, v2, v0}, Lcom/google/android/filament/gltfio/FilamentAsset;->nGetResourceUris(J[Ljava/lang/String;)V

    return-object v0
.end method

.method public getRoot()I
    .locals 2
    .annotation build Lcom/google/android/filament/Entity;
    .end annotation

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mNativeObject:J

    invoke-static {v0, v1}, Lcom/google/android/filament/gltfio/FilamentAsset;->nGetRoot(J)I

    move-result v0

    return v0
.end method

.method public popRenderable()I
    .locals 2
    .annotation build Lcom/google/android/filament/Entity;
    .end annotation

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mNativeObject:J

    invoke-static {v0, v1}, Lcom/google/android/filament/gltfio/FilamentAsset;->nPopRenderable(J)I

    move-result v0

    return v0
.end method

.method public popRenderables([I)I
    .locals 2
    .param p1    # [I
        .annotation build Lcom/google/android/filament/Entity;
        .end annotation
    .end param

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mNativeObject:J

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/gltfio/FilamentAsset;->nPopRenderables(J[I)I

    move-result p1

    return p1
.end method

.method public releaseSourceData()V
    .locals 2

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/FilamentAsset;->mNativeObject:J

    invoke-static {v0, v1}, Lcom/google/android/filament/gltfio/FilamentAsset;->nReleaseSourceData(J)V

    return-void
.end method
