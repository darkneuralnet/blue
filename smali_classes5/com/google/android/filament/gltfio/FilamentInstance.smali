.class public Lcom/google/android/filament/gltfio/FilamentInstance;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mAnimator:Lcom/google/android/filament/gltfio/Animator;

.field private mAsset:Lcom/google/android/filament/gltfio/FilamentAsset;

.field private mNativeObject:J


# direct methods
.method public constructor <init>(Lcom/google/android/filament/gltfio/FilamentAsset;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/filament/gltfio/FilamentInstance;->mAsset:Lcom/google/android/filament/gltfio/FilamentAsset;

    iput-wide p2, p0, Lcom/google/android/filament/gltfio/FilamentInstance;->mNativeObject:J

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/filament/gltfio/FilamentInstance;->mAnimator:Lcom/google/android/filament/gltfio/Animator;

    return-void
.end method

.method private static native nApplyMaterialVariant(JI)V
.end method

.method private static native nAttachSkin(JII)V
.end method

.method private static native nDetachSkin(JII)V
.end method

.method private static native nGetAnimator(J)J
.end method

.method private static native nGetEntities(J[I)V
.end method

.method private static native nGetEntityCount(J)I
.end method

.method private static native nGetJointCountAt(JI)I
.end method

.method private static native nGetJointsAt(JI[I)V
.end method

.method private static native nGetMaterialInstanceCount(J)I
.end method

.method private static native nGetMaterialInstances(J[J)V
.end method

.method private static native nGetMaterialVariantCount(J)I
.end method

.method private static native nGetMaterialVariantNames(J[Ljava/lang/String;)V
.end method

.method private static native nGetRoot(J)I
.end method

.method private static native nGetSkinCount(J)I
.end method

.method private static native nGetSkinNames(J[Ljava/lang/String;)V
.end method


# virtual methods
.method public applyMaterialVariant(I)V
    .locals 2

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/FilamentInstance;->mNativeObject:J

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/gltfio/FilamentInstance;->nApplyMaterialVariant(JI)V

    return-void
.end method

.method public attachSkin(II)V
    .locals 2
    .param p2    # I
        .annotation build Lcom/google/android/filament/Entity;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/google/android/filament/gltfio/FilamentInstance;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Lcom/google/android/filament/gltfio/FilamentInstance;->nAttachSkin(JII)V

    return-void
.end method

.method public clearNativeObject()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/filament/gltfio/FilamentInstance;->mNativeObject:J

    return-void
.end method

.method public detachSkin(II)V
    .locals 2
    .param p2    # I
        .annotation build Lcom/google/android/filament/Entity;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/google/android/filament/gltfio/FilamentInstance;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Lcom/google/android/filament/gltfio/FilamentInstance;->nDetachSkin(JII)V

    return-void
.end method

.method public getAnimator()Lcom/google/android/filament/gltfio/Animator;
    .locals 3

    iget-object v0, p0, Lcom/google/android/filament/gltfio/FilamentInstance;->mAnimator:Lcom/google/android/filament/gltfio/Animator;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/filament/gltfio/Animator;

    iget-wide v1, p0, Lcom/google/android/filament/gltfio/FilamentInstance;->mNativeObject:J

    invoke-static {v1, v2}, Lcom/google/android/filament/gltfio/FilamentInstance;->nGetAnimator(J)J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Lcom/google/android/filament/gltfio/Animator;-><init>(J)V

    iput-object v0, p0, Lcom/google/android/filament/gltfio/FilamentInstance;->mAnimator:Lcom/google/android/filament/gltfio/Animator;

    return-object v0
.end method

.method public getAsset()Lcom/google/android/filament/gltfio/FilamentAsset;
    .locals 1

    iget-object v0, p0, Lcom/google/android/filament/gltfio/FilamentInstance;->mAsset:Lcom/google/android/filament/gltfio/FilamentAsset;

    return-object v0
.end method

.method public getEntities()[I
    .locals 3
    .annotation build Lcom/google/android/filament/Entity;
    .end annotation

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/FilamentInstance;->mNativeObject:J

    invoke-static {v0, v1}, Lcom/google/android/filament/gltfio/FilamentInstance;->nGetEntityCount(J)I

    move-result v0

    new-array v0, v0, [I

    iget-wide v1, p0, Lcom/google/android/filament/gltfio/FilamentInstance;->mNativeObject:J

    invoke-static {v1, v2, v0}, Lcom/google/android/filament/gltfio/FilamentInstance;->nGetEntities(J[I)V

    return-object v0
.end method

.method public getJointCountAt(I)I
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/filament/gltfio/FilamentInstance;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/gltfio/FilamentInstance;->nGetJointCountAt(JI)I

    move-result p1

    return p1
.end method

.method public getJointsAt(I)[I
    .locals 3
    .annotation build Lcom/google/android/filament/Entity;
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/filament/gltfio/FilamentInstance;->getJointCountAt(I)I

    move-result v0

    new-array v0, v0, [I

    invoke-virtual {p0}, Lcom/google/android/filament/gltfio/FilamentInstance;->getNativeObject()J

    move-result-wide v1

    invoke-static {v1, v2, p1, v0}, Lcom/google/android/filament/gltfio/FilamentInstance;->nGetJointsAt(JI[I)V

    return-object v0
.end method

.method public getMaterialInstances()[Lcom/google/android/filament/MaterialInstance;
    .locals 8

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/FilamentInstance;->mNativeObject:J

    invoke-static {v0, v1}, Lcom/google/android/filament/gltfio/FilamentInstance;->nGetMaterialInstanceCount(J)I

    move-result v0

    new-array v1, v0, [Lcom/google/android/filament/MaterialInstance;

    new-array v2, v0, [J

    iget-wide v3, p0, Lcom/google/android/filament/gltfio/FilamentInstance;->mNativeObject:J

    invoke-static {v3, v4, v2}, Lcom/google/android/filament/gltfio/FilamentInstance;->nGetMaterialInstances(J[J)V

    iget-object v3, p0, Lcom/google/android/filament/gltfio/FilamentInstance;->mAsset:Lcom/google/android/filament/gltfio/FilamentAsset;

    invoke-virtual {v3}, Lcom/google/android/filament/gltfio/FilamentAsset;->getEngine()Lcom/google/android/filament/Engine;

    move-result-object v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v0, :cond_0

    new-instance v5, Lcom/google/android/filament/MaterialInstance;

    aget-wide v6, v2, v4

    invoke-direct {v5, v3, v6, v7}, Lcom/google/android/filament/MaterialInstance;-><init>(Lcom/google/android/filament/Engine;J)V

    aput-object v5, v1, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public getMaterialVariantNames()[Ljava/lang/String;
    .locals 3

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/FilamentInstance;->mNativeObject:J

    invoke-static {v0, v1}, Lcom/google/android/filament/gltfio/FilamentInstance;->nGetMaterialVariantCount(J)I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    iget-wide v1, p0, Lcom/google/android/filament/gltfio/FilamentInstance;->mNativeObject:J

    invoke-static {v1, v2, v0}, Lcom/google/android/filament/gltfio/FilamentInstance;->nGetMaterialVariantNames(J[Ljava/lang/String;)V

    return-object v0
.end method

.method public getNativeObject()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/FilamentInstance;->mNativeObject:J

    return-wide v0
.end method

.method public getRoot()I
    .locals 2
    .annotation build Lcom/google/android/filament/Entity;
    .end annotation

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/FilamentInstance;->mNativeObject:J

    invoke-static {v0, v1}, Lcom/google/android/filament/gltfio/FilamentInstance;->nGetRoot(J)I

    move-result v0

    return v0
.end method

.method public getSkinCount()I
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/filament/gltfio/FilamentInstance;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/filament/gltfio/FilamentInstance;->nGetSkinCount(J)I

    move-result v0

    return v0
.end method

.method public getSkinNames()[Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/filament/gltfio/FilamentInstance;->getSkinCount()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/filament/gltfio/FilamentInstance;->getNativeObject()J

    move-result-wide v1

    invoke-static {v1, v2, v0}, Lcom/google/android/filament/gltfio/FilamentInstance;->nGetSkinNames(J[Ljava/lang/String;)V

    return-object v0
.end method
