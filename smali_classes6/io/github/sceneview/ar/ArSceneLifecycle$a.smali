.class public final Lio/github/sceneview/ar/ArSceneLifecycle$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/github/sceneview/ar/ArSceneLifecycle;->u(Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lxm;",
        "Lio/github/sceneview/ar/arcore/ArSession;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lxm;",
        "Lio/github/sceneview/ar/arcore/ArSession;",
        "it",
        "",
        "a",
        "(Lxm;Lio/github/sceneview/ar/arcore/ArSession;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic g:Lio/github/sceneview/ar/ArSceneLifecycle;

.field public final synthetic h:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lio/github/sceneview/ar/arcore/ArSession;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/github/sceneview/ar/ArSceneLifecycle;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/github/sceneview/ar/ArSceneLifecycle;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lio/github/sceneview/ar/arcore/ArSession;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/github/sceneview/ar/ArSceneLifecycle$a;->g:Lio/github/sceneview/ar/ArSceneLifecycle;

    iput-object p2, p0, Lio/github/sceneview/ar/ArSceneLifecycle$a;->h:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lxm;Lio/github/sceneview/ar/arcore/ArSession;)V
    .locals 1

    const-string v0, "$this$addObserver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/ar/ArSceneLifecycle$a;->g:Lio/github/sceneview/ar/ArSceneLifecycle;

    invoke-virtual {v0, p1}, LTX0;->d(LFq2;)V

    iget-object p1, p0, Lio/github/sceneview/ar/ArSceneLifecycle$a;->h:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lxm;

    check-cast p2, Lio/github/sceneview/ar/arcore/ArSession;

    invoke-virtual {p0, p1, p2}, Lio/github/sceneview/ar/ArSceneLifecycle$a;->a(Lxm;Lio/github/sceneview/ar/arcore/ArSession;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
