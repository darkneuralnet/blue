.class public final Lel1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004\u001a \u0010\r\u001a\u00020\u0006*\u00020\u00082\u0008\u0008\u0001\u0010\t\u001a\u00020\u00042\n\u0010\u000c\u001a\u00060\nj\u0002`\u000b\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/google/android/filament/Engine;",
        "Lcom/google/android/filament/Camera;",
        "b",
        "Lcom/google/android/filament/RenderableManager$Builder;",
        "",
        "entity",
        "",
        "a",
        "Lcom/google/android/filament/TransformManager;",
        "i",
        "LyM2;",
        "Lio/github/sceneview/math/Transform;",
        "worldTransform",
        "c",
        "sceneview_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# direct methods
.method public static final a(Lcom/google/android/filament/RenderableManager$Builder;I)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ldl1;->c()Lcom/google/android/filament/Engine;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/google/android/filament/RenderableManager$Builder;->build(Lcom/google/android/filament/Engine;I)V

    return-void
.end method

.method public static final b(Lcom/google/android/filament/Engine;)Lcom/google/android/filament/Camera;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/filament/Engine;->getEntityManager()Lcom/google/android/filament/EntityManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/filament/EntityManager;->create()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/Engine;->createCamera(I)Lcom/google/android/filament/Camera;

    move-result-object p0

    const-string v0, "createCamera(entityManager.create())"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final c(Lcom/google/android/filament/TransformManager;ILyM2;)V
    .locals 1
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "worldTransform"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, LgN2;->k(LyM2;)[F

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/google/android/filament/TransformManager;->setTransform(I[F)V

    return-void
.end method
