.class public final Lpx4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u000e\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u0005*\u00060\u0001j\u0002`\u00022\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u0001\u001a \u0010\t\u001a\u00020\u0008*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u0001\u001a\u000e\u0010\n\u001a\u00020\u0008*\u00060\u0001j\u0002`\u0002\"\u001d\u0010\u000e\u001a\u00060\u0001j\u0002`\u000b*\u00060\u0001j\u0002`\u00028G\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r*\n\u0010\u000f\"\u00020\u00012\u00020\u0001*\n\u0010\u0010\"\u00020\u00012\u00020\u0001\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/google/android/filament/RenderableManager$Builder;",
        "",
        "Lio/github/sceneview/renderable/Renderable;",
        "a",
        "primitiveIndex",
        "Lcom/google/android/filament/MaterialInstance;",
        "c",
        "material",
        "",
        "f",
        "b",
        "Lio/github/sceneview/renderable/RenderableInstance;",
        "e",
        "(I)I",
        "renderableInstance",
        "Renderable",
        "RenderableInstance",
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
.method public static final a(Lcom/google/android/filament/RenderableManager$Builder;)I
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ldl1;->d()Lcom/google/android/filament/EntityManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/filament/EntityManager;->create()I

    move-result v0

    invoke-static {}, Ldl1;->c()Lcom/google/android/filament/Engine;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lcom/google/android/filament/RenderableManager$Builder;->build(Lcom/google/android/filament/Engine;I)V

    return v0
.end method

.method public static final b(I)V
    .locals 2

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {}, Ldl1;->c()Lcom/google/android/filament/Engine;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/filament/Engine;->destroyEntity(I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    :try_start_1
    invoke-static {}, Ldl1;->c()Lcom/google/android/filament/Engine;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/filament/Engine;->getEntityManager()Lcom/google/android/filament/EntityManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/filament/EntityManager;->destroy(I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    :try_start_2
    invoke-static {}, Ldl1;->h()Lcom/google/android/filament/RenderableManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/filament/RenderableManager;->destroy(I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception p0

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    return-void
.end method

.method public static final c(II)Lcom/google/android/filament/MaterialInstance;
    .locals 1

    invoke-static {}, Ldl1;->h()Lcom/google/android/filament/RenderableManager;

    move-result-object v0

    invoke-static {p0}, Lpx4;->e(I)I

    move-result p0

    invoke-virtual {v0, p0, p1}, Lcom/google/android/filament/RenderableManager;->getMaterialInstanceAt(II)Lcom/google/android/filament/MaterialInstance;

    move-result-object p0

    const-string p1, "renderableManager.getMat\u2026Instance, primitiveIndex)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic d(IIILjava/lang/Object;)Lcom/google/android/filament/MaterialInstance;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lpx4;->c(II)Lcom/google/android/filament/MaterialInstance;

    move-result-object p0

    return-object p0
.end method

.method public static final e(I)I
    .locals 1
    .annotation build Lcom/google/android/filament/EntityInstance;
    .end annotation

    invoke-static {}, Ldl1;->h()Lcom/google/android/filament/RenderableManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/filament/RenderableManager;->getInstance(I)I

    move-result p0

    return p0
.end method

.method public static final f(ILcom/google/android/filament/MaterialInstance;I)V
    .locals 1

    const-string v0, "material"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ldl1;->h()Lcom/google/android/filament/RenderableManager;

    move-result-object v0

    invoke-static {p0}, Lpx4;->e(I)I

    move-result p0

    invoke-virtual {v0, p0, p2, p1}, Lcom/google/android/filament/RenderableManager;->setMaterialInstanceAt(IILcom/google/android/filament/MaterialInstance;)V

    return-void
.end method

.method public static synthetic g(ILcom/google/android/filament/MaterialInstance;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lpx4;->f(ILcom/google/android/filament/MaterialInstance;I)V

    return-void
.end method
