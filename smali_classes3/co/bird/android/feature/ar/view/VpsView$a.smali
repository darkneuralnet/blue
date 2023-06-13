.class public final Lco/bird/android/feature/ar/view/VpsView$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/ar/view/VpsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILjava/util/Set;Lcom/google/ar/sceneform/ArCameraNode;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/github/sceneview/ar/arcore/ArSession;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lio/github/sceneview/ar/arcore/ArSession;",
        "session",
        "",
        "a",
        "(Lio/github/sceneview/ar/arcore/ArSession;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/ar/view/VpsView;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/ar/view/VpsView;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/ar/view/VpsView$a;->g:Lco/bird/android/feature/ar/view/VpsView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lio/github/sceneview/ar/arcore/ArSession;)V
    .locals 2

    const-string v0, "session"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/feature/ar/view/VpsView$a;->g:Lco/bird/android/feature/ar/view/VpsView;

    invoke-static {v0}, Lco/bird/android/feature/ar/view/VpsView;->access$getSessionRelay$p(Lco/bird/android/feature/ar/view/VpsView;)La94;

    move-result-object v0

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v1, p1}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v1

    invoke-virtual {v0, v1}, La94;->accept(Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/feature/ar/view/VpsView$a;->g:Lco/bird/android/feature/ar/view/VpsView;

    invoke-virtual {v0}, Lco/bird/android/feature/ar/view/VpsView;->W0()Liw6;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Liw6;->m(Lio/github/sceneview/ar/arcore/ArSession;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/github/sceneview/ar/arcore/ArSession;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/ar/view/VpsView$a;->a(Lio/github/sceneview/ar/arcore/ArSession;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
