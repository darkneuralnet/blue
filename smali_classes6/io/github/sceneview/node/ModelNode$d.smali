.class public final Lio/github/sceneview/node/ModelNode$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/github/sceneview/node/ModelNode;->S0(Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/google/android/filament/gltfio/FilamentInstance;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0012\u0012\u0008\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u00040\u0001J\u0015\u0010\u0006\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003H\u0096\u0002\u00a8\u0006\u0007"
    }
    d2 = {
        "io/github/sceneview/node/ModelNode$d",
        "Lkotlin/Function1;",
        "Lcom/google/android/filament/gltfio/FilamentInstance;",
        "Lio/github/sceneview/model/ModelInstance;",
        "",
        "modelInstance",
        "a",
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
.field public final synthetic b:Lio/github/sceneview/node/ModelNode;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/google/android/filament/gltfio/FilamentInstance;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/github/sceneview/node/ModelNode;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/github/sceneview/node/ModelNode;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/google/android/filament/gltfio/FilamentInstance;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/github/sceneview/node/ModelNode$d;->b:Lio/github/sceneview/node/ModelNode;

    iput-object p2, p0, Lio/github/sceneview/node/ModelNode$d;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/filament/gltfio/FilamentInstance;)V
    .locals 1

    const-string v0, "modelInstance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/node/ModelNode$d;->b:Lio/github/sceneview/node/ModelNode;

    invoke-virtual {v0}, Lio/github/sceneview/node/ModelNode;->X0()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, p0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lio/github/sceneview/node/ModelNode$d;->c:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/android/filament/gltfio/FilamentInstance;

    invoke-virtual {p0, p1}, Lio/github/sceneview/node/ModelNode$d;->a(Lcom/google/android/filament/gltfio/FilamentInstance;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
