.class public final Lio/github/sceneview/SceneView$i;
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
        "Lqm5;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lqm5;",
        "b",
        "()Lqm5;"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic g:Lio/github/sceneview/SceneView;


# direct methods
.method public constructor <init>(Lio/github/sceneview/SceneView;)V
    .locals 0

    iput-object p1, p0, Lio/github/sceneview/SceneView$i;->g:Lio/github/sceneview/SceneView;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Lqm5;
    .locals 2

    new-instance v0, Lqm5;

    iget-object v1, p0, Lio/github/sceneview/SceneView$i;->g:Lio/github/sceneview/SceneView;

    invoke-direct {v0, v1}, Lqm5;-><init>(Lio/github/sceneview/SceneView;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lio/github/sceneview/SceneView$i;->b()Lqm5;

    move-result-object v0

    return-object v0
.end method
