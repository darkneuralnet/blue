.class public final Lfv6$k;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfv6;->P()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/buava/Optional<",
        "Lcom/google/ar/core/Anchor;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/buava/Optional;",
        "Lcom/google/ar/core/Anchor;",
        "kotlin.jvm.PlatformType",
        "optionalAnchor",
        "",
        "a",
        "(Lco/bird/android/buava/Optional;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lfv6;


# direct methods
.method public constructor <init>(Lfv6;)V
    .locals 0

    iput-object p1, p0, Lfv6$k;->g:Lfv6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/buava/Optional;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "Lcom/google/ar/core/Anchor;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/ar/core/Anchor;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "clearing node model and anchor now"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lfv6$k;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getNestArModelNode(Lfv6;)Lio/github/sceneview/ar/node/ArModelNode;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lio/github/sceneview/ar/node/ArNode;->s1(Lcom/google/ar/core/Anchor;)V

    goto :goto_0

    :cond_0
    const-string v1, "setting node model and anchor now"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lfv6$k;->g:Lfv6;

    invoke-static {v0}, Lfv6;->access$getNestArModelNode(Lfv6;)Lio/github/sceneview/ar/node/ArModelNode;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/github/sceneview/ar/node/ArNode;->s1(Lcom/google/ar/core/Anchor;)V

    iget-object p1, p0, Lfv6$k;->g:Lfv6;

    invoke-static {p1}, Lfv6;->access$getUi$p(Lfv6;)Lrv6;

    move-result-object p1

    invoke-virtual {p1}, Lrv6;->Tl()Lco/bird/android/feature/ar/view/VpsView;

    move-result-object p1

    iget-object v0, p0, Lfv6$k;->g:Lfv6;

    invoke-static {v0}, Lfv6;->access$getNestArModelNode(Lfv6;)Lio/github/sceneview/ar/node/ArModelNode;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/github/sceneview/SceneView;->setSelectedNode(Lio/github/sceneview/node/Node;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p0, p1}, Lfv6$k;->a(Lco/bird/android/buava/Optional;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method