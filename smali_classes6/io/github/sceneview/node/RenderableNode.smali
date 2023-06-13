.class public Lio/github/sceneview/node/RenderableNode;
.super Lio/github/sceneview/node/Node;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0017\u0018\u00002\u00020\u0001B3\u0008\u0017\u0012\u000c\u0008\u0002\u0010\u000f\u001a\u00060\rj\u0002`\u000e\u0012\u000c\u0008\u0002\u0010\u0011\u001a\u00060\rj\u0002`\u0010\u0012\u000c\u0008\u0002\u0010\u0013\u001a\u00060\rj\u0002`\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R$\u0010\t\u001a\u000c\u0012\u0008\u0012\u00060\u0003j\u0002`\u00040\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u0008\u00a8\u0006\u0016"
    }
    d2 = {
        "Lio/github/sceneview/node/RenderableNode;",
        "Lio/github/sceneview/node/Node;",
        "",
        "",
        "Lio/github/sceneview/renderable/Renderable;",
        "K",
        "Ljava/util/List;",
        "P0",
        "()Ljava/util/List;",
        "renderables",
        "Lcom/google/android/filament/MaterialInstance;",
        "O0",
        "materialInstances",
        "Lhu1;",
        "Lio/github/sceneview/math/Position;",
        "position",
        "Lio/github/sceneview/math/Rotation;",
        "rotation",
        "Lio/github/sceneview/math/Scale;",
        "scale",
        "<init>",
        "(Lhu1;Lhu1;Lhu1;)V",
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
.field public final K:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lio/github/sceneview/node/RenderableNode;-><init>(Lhu1;Lhu1;Lhu1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lhu1;Lhu1;Lhu1;)V
    .locals 1
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "position"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rotation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scale"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Lio/github/sceneview/node/Node;-><init>(Lhu1;Lhu1;Lhu1;)V

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lio/github/sceneview/node/RenderableNode;->K:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lhu1;Lhu1;Lhu1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p1, Lio/github/sceneview/node/Node;->H:Lio/github/sceneview/node/Node$a;

    invoke-virtual {p1}, Lio/github/sceneview/node/Node$a;->a()Lhu1;

    move-result-object p1

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    sget-object p2, Lio/github/sceneview/node/Node;->H:Lio/github/sceneview/node/Node$a;

    invoke-virtual {p2}, Lio/github/sceneview/node/Node$a;->c()Lhu1;

    move-result-object p2

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    sget-object p3, Lio/github/sceneview/node/Node;->H:Lio/github/sceneview/node/Node$a;

    invoke-virtual {p3}, Lio/github/sceneview/node/Node$a;->d()Lhu1;

    move-result-object p3

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lio/github/sceneview/node/RenderableNode;-><init>(Lhu1;Lhu1;Lhu1;)V

    return-void
.end method


# virtual methods
.method public final O0()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/filament/MaterialInstance;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lio/github/sceneview/node/RenderableNode;->P0()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v2, v5, v3, v4}, Lpx4;->d(IIILjava/lang/Object;)Lcom/google/android/filament/MaterialInstance;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public P0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/sceneview/node/RenderableNode;->K:Ljava/util/List;

    return-object v0
.end method
