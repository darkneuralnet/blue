.class public final Lio/github/sceneview/SceneView$l;
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
        "Lio/github/sceneview/node/ModelNode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lio/github/sceneview/node/ModelNode;",
        "b",
        "()Lio/github/sceneview/node/ModelNode;"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final g:Lio/github/sceneview/SceneView$l;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/github/sceneview/SceneView$l;

    invoke-direct {v0}, Lio/github/sceneview/SceneView$l;-><init>()V

    sput-object v0, Lio/github/sceneview/SceneView$l;->g:Lio/github/sceneview/SceneView$l;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Lio/github/sceneview/node/ModelNode;
    .locals 10

    new-instance v9, Lio/github/sceneview/node/ModelNode;

    const-string v1, "sceneview/models/node_selector.glb"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x3e

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lio/github/sceneview/node/ModelNode;-><init>(Ljava/lang/String;ZLjava/lang/Float;Lhu1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lio/github/sceneview/node/Node;->E0(Z)V

    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lio/github/sceneview/node/Node;->w0(Lnm0;)V

    return-object v9
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lio/github/sceneview/SceneView$l;->b()Lio/github/sceneview/node/ModelNode;

    move-result-object v0

    return-object v0
.end method
