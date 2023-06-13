.class public final Lio/github/sceneview/SceneView$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/github/sceneview/SceneView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/google/ar/sceneform/CameraNode;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LiC1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LiC1;",
        "b",
        "()LiC1;"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic g:Landroid/content/Context;

.field public final synthetic h:Lio/github/sceneview/SceneView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/github/sceneview/SceneView;)V
    .locals 0

    iput-object p1, p0, Lio/github/sceneview/SceneView$h;->g:Landroid/content/Context;

    iput-object p2, p0, Lio/github/sceneview/SceneView$h;->h:Lio/github/sceneview/SceneView;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()LiC1;
    .locals 4

    new-instance v0, LiC1;

    iget-object v1, p0, Lio/github/sceneview/SceneView$h;->g:Landroid/content/Context;

    new-instance v2, Lio/github/sceneview/SceneView$h$a;

    iget-object v3, p0, Lio/github/sceneview/SceneView$h;->h:Lio/github/sceneview/SceneView;

    invoke-direct {v2, v3}, Lio/github/sceneview/SceneView$h$a;-><init>(Ljava/lang/Object;)V

    iget-object v3, p0, Lio/github/sceneview/SceneView$h;->h:Lio/github/sceneview/SceneView;

    invoke-direct {v0, v1, v2, v3}, LiC1;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function2;LiC1$b;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lio/github/sceneview/SceneView$h;->b()LiC1;

    move-result-object v0

    return-object v0
.end method
