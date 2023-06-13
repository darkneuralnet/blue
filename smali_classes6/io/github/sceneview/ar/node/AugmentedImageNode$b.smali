.class public final Lio/github/sceneview/ar/node/AugmentedImageNode$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/github/sceneview/ar/node/AugmentedImageNode;->q0(Lio/github/sceneview/SceneView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lio/github/sceneview/ar/arcore/ArSession;",
        "Lcom/google/ar/core/Config;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lio/github/sceneview/ar/arcore/ArSession;",
        "session",
        "Lcom/google/ar/core/Config;",
        "config",
        "",
        "a",
        "(Lio/github/sceneview/ar/arcore/ArSession;Lcom/google/ar/core/Config;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic g:Lio/github/sceneview/ar/node/AugmentedImageNode;


# direct methods
.method public constructor <init>(Lio/github/sceneview/ar/node/AugmentedImageNode;)V
    .locals 0

    iput-object p1, p0, Lio/github/sceneview/ar/node/AugmentedImageNode$b;->g:Lio/github/sceneview/ar/node/AugmentedImageNode;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lio/github/sceneview/ar/arcore/ArSession;Lcom/google/ar/core/Config;)V
    .locals 3

    const-string v0, "session"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p2}, Lcom/google/ar/core/Config;->getAugmentedImageDatabase()Lcom/google/ar/core/AugmentedImageDatabase;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/ar/core/AugmentedImageDatabase;->getNumImages()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-nez v0, :cond_3

    new-instance v0, Lcom/google/ar/core/AugmentedImageDatabase;

    invoke-direct {v0, p1}, Lcom/google/ar/core/AugmentedImageDatabase;-><init>(Lcom/google/ar/core/Session;)V

    iget-object p1, p0, Lio/github/sceneview/ar/node/AugmentedImageNode$b;->g:Lio/github/sceneview/ar/node/AugmentedImageNode;

    invoke-virtual {p1}, Lio/github/sceneview/ar/node/AugmentedImageNode;->B1()Ljava/lang/Float;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lio/github/sceneview/ar/node/AugmentedImageNode;->z1()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/github/sceneview/ar/node/AugmentedImageNode;->y1()Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {p1}, Lio/github/sceneview/ar/node/AugmentedImageNode;->B1()Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {v0, v1, v2, p1}, Lcom/google/ar/core/AugmentedImageDatabase;->addImage(Ljava/lang/String;Landroid/graphics/Bitmap;F)I

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lio/github/sceneview/ar/node/AugmentedImageNode;->z1()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/github/sceneview/ar/node/AugmentedImageNode;->y1()Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/google/ar/core/AugmentedImageDatabase;->addImage(Ljava/lang/String;Landroid/graphics/Bitmap;)I

    :cond_3
    :goto_2
    invoke-virtual {p2, v0}, Lcom/google/ar/core/Config;->setAugmentedImageDatabase(Lcom/google/ar/core/AugmentedImageDatabase;)Lcom/google/ar/core/Config;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    iget-object p2, p0, Lio/github/sceneview/ar/node/AugmentedImageNode$b;->g:Lio/github/sceneview/ar/node/AugmentedImageNode;

    invoke-virtual {p2}, Lio/github/sceneview/ar/node/AugmentedImageNode;->A1()Lkotlin/jvm/functions/Function1;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    :goto_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/github/sceneview/ar/arcore/ArSession;

    check-cast p2, Lcom/google/ar/core/Config;

    invoke-virtual {p0, p1, p2}, Lio/github/sceneview/ar/node/AugmentedImageNode$b;->a(Lio/github/sceneview/ar/arcore/ArSession;Lcom/google/ar/core/Config;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
