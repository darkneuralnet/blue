.class public final Lio/github/sceneview/utils/SurfaceMirrorer$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/sceneview/utils/SurfaceMirrorer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u0005\u001a\u00020\u0004H\u00d6\u0001J\u0013\u0010\u0008\u001a\u00020\u00072\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR$\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\n\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0010\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lio/github/sceneview/utils/SurfaceMirrorer$a;",
        "",
        "",
        "toString",
        "",
        "hashCode",
        "other",
        "",
        "equals",
        "Landroid/view/Surface;",
        "a",
        "Landroid/view/Surface;",
        "getSurface",
        "()Landroid/view/Surface;",
        "surface",
        "Lcom/google/android/filament/SwapChain;",
        "b",
        "Lcom/google/android/filament/SwapChain;",
        "()Lcom/google/android/filament/SwapChain;",
        "setSwapChain",
        "(Lcom/google/android/filament/SwapChain;)V",
        "swapChain",
        "Lcom/google/android/filament/Viewport;",
        "c",
        "Lcom/google/android/filament/Viewport;",
        "()Lcom/google/android/filament/Viewport;",
        "viewport",
        "sceneview_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final a:Landroid/view/Surface;

.field public b:Lcom/google/android/filament/SwapChain;

.field public final c:Lcom/google/android/filament/Viewport;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/filament/SwapChain;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/utils/SurfaceMirrorer$a;->b:Lcom/google/android/filament/SwapChain;

    return-object v0
.end method

.method public final b()Lcom/google/android/filament/Viewport;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/utils/SurfaceMirrorer$a;->c:Lcom/google/android/filament/Viewport;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/sceneview/utils/SurfaceMirrorer$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/sceneview/utils/SurfaceMirrorer$a;

    iget-object v1, p0, Lio/github/sceneview/utils/SurfaceMirrorer$a;->a:Landroid/view/Surface;

    iget-object v3, p1, Lio/github/sceneview/utils/SurfaceMirrorer$a;->a:Landroid/view/Surface;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/github/sceneview/utils/SurfaceMirrorer$a;->b:Lcom/google/android/filament/SwapChain;

    iget-object v3, p1, Lio/github/sceneview/utils/SurfaceMirrorer$a;->b:Lcom/google/android/filament/SwapChain;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/github/sceneview/utils/SurfaceMirrorer$a;->c:Lcom/google/android/filament/Viewport;

    iget-object p1, p1, Lio/github/sceneview/utils/SurfaceMirrorer$a;->c:Lcom/google/android/filament/Viewport;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lio/github/sceneview/utils/SurfaceMirrorer$a;->a:Landroid/view/Surface;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/github/sceneview/utils/SurfaceMirrorer$a;->b:Lcom/google/android/filament/SwapChain;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/github/sceneview/utils/SurfaceMirrorer$a;->c:Lcom/google/android/filament/Viewport;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SurfaceMirror(surface="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/sceneview/utils/SurfaceMirrorer$a;->a:Landroid/view/Surface;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", swapChain="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/sceneview/utils/SurfaceMirrorer$a;->b:Lcom/google/android/filament/SwapChain;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", viewport="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/sceneview/utils/SurfaceMirrorer$a;->c:Lcom/google/android/filament/Viewport;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
