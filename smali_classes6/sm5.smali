.class public final synthetic Lsm5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/filament/View$OnPickCallback;


# instance fields
.field public final synthetic a:Lio/github/sceneview/SceneView;

.field public final synthetic b:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(Lio/github/sceneview/SceneView;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsm5;->a:Lio/github/sceneview/SceneView;

    iput-object p2, p0, Lsm5;->b:Lkotlin/jvm/functions/Function2;

    return-void
.end method


# virtual methods
.method public final onPick(Lcom/google/android/filament/View$PickingQueryResult;)V
    .locals 2

    iget-object v0, p0, Lsm5;->a:Lio/github/sceneview/SceneView;

    iget-object v1, p0, Lsm5;->b:Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p1}, Lio/github/sceneview/SceneView;->y(Lio/github/sceneview/SceneView;Lkotlin/jvm/functions/Function2;Lcom/google/android/filament/View$PickingQueryResult;)V

    return-void
.end method
