.class public final Lio/github/sceneview/ar/ArSceneView$b$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/github/sceneview/ar/ArSceneView$b;->a(Lio/github/sceneview/ar/arcore/ArSession;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/google/ar/core/Config;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/google/ar/core/Config;",
        "config",
        "",
        "a",
        "(Lcom/google/ar/core/Config;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic g:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Lio/github/sceneview/ar/arcore/ArSession;",
            "Lcom/google/ar/core/Config;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:Lio/github/sceneview/ar/arcore/ArSession;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function2;Lio/github/sceneview/ar/arcore/ArSession;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lio/github/sceneview/ar/arcore/ArSession;",
            "-",
            "Lcom/google/ar/core/Config;",
            "Lkotlin/Unit;",
            ">;",
            "Lio/github/sceneview/ar/arcore/ArSession;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lio/github/sceneview/ar/ArSceneView$b$a;->g:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Lio/github/sceneview/ar/ArSceneView$b$a;->h:Lio/github/sceneview/ar/arcore/ArSession;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/ar/core/Config;)V
    .locals 2

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/ar/ArSceneView$b$a;->g:Lkotlin/jvm/functions/Function2;

    iget-object v1, p0, Lio/github/sceneview/ar/ArSceneView$b$a;->h:Lio/github/sceneview/ar/arcore/ArSession;

    invoke-interface {v0, v1, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/ar/core/Config;

    invoke-virtual {p0, p1}, Lio/github/sceneview/ar/ArSceneView$b$a;->a(Lcom/google/ar/core/Config;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
