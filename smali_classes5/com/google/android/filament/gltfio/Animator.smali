.class public Lcom/google/android/filament/gltfio/Animator;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mNativeObject:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/google/android/filament/gltfio/Animator;->mNativeObject:J

    return-void
.end method

.method private static native nApplyAnimation(JIF)V
.end method

.method private static native nApplyCrossFade(JIFF)V
.end method

.method private static native nGetAnimationCount(J)I
.end method

.method private static native nGetAnimationDuration(JI)F
.end method

.method private static native nGetAnimationName(JI)Ljava/lang/String;
.end method

.method private static native nResetBoneMatrices(J)V
.end method

.method private static native nUpdateBoneMatrices(J)V
.end method


# virtual methods
.method public applyAnimation(IF)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/filament/gltfio/Animator;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Lcom/google/android/filament/gltfio/Animator;->nApplyAnimation(JIF)V

    return-void
.end method

.method public applyCrossFade(IFF)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/filament/gltfio/Animator;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2, p3}, Lcom/google/android/filament/gltfio/Animator;->nApplyCrossFade(JIFF)V

    return-void
.end method

.method public clearNativeObject()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/filament/gltfio/Animator;->mNativeObject:J

    return-void
.end method

.method public getAnimationCount()I
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/filament/gltfio/Animator;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/filament/gltfio/Animator;->nGetAnimationCount(J)I

    move-result v0

    return v0
.end method

.method public getAnimationDuration(I)F
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/filament/gltfio/Animator;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/gltfio/Animator;->nGetAnimationDuration(JI)F

    move-result p1

    return p1
.end method

.method public getAnimationName(I)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/filament/gltfio/Animator;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/gltfio/Animator;->nGetAnimationName(JI)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getNativeObject()J
    .locals 4

    iget-wide v0, p0, Lcom/google/android/filament/gltfio/Animator;->mNativeObject:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    return-wide v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Using Animator on destroyed asset"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public resetBoneMatrices()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/filament/gltfio/Animator;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/filament/gltfio/Animator;->nResetBoneMatrices(J)V

    return-void
.end method

.method public updateBoneMatrices()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/filament/gltfio/Animator;->getNativeObject()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/filament/gltfio/Animator;->nUpdateBoneMatrices(J)V

    return-void
.end method
