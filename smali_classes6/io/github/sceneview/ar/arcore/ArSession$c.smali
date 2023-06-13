.class public final Lio/github/sceneview/ar/arcore/ArSession$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/github/sceneview/ar/arcore/ArSession;-><init>(Lio/github/sceneview/ar/ArSceneLifecycle;Ljava/util/Set;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Landroid/view/Display;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroid/view/Display;",
        "kotlin.jvm.PlatformType",
        "b",
        "()Landroid/view/Display;"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic g:Lio/github/sceneview/ar/arcore/ArSession;


# direct methods
.method public constructor <init>(Lio/github/sceneview/ar/arcore/ArSession;)V
    .locals 0

    iput-object p1, p0, Lio/github/sceneview/ar/arcore/ArSession$c;->g:Lio/github/sceneview/ar/arcore/ArSession;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Landroid/view/Display;
    .locals 2

    iget-object v0, p0, Lio/github/sceneview/ar/arcore/ArSession$c;->g:Lio/github/sceneview/ar/arcore/ArSession;

    invoke-virtual {v0}, Lio/github/sceneview/ar/arcore/ArSession;->s()Lio/github/sceneview/ar/ArSceneLifecycle;

    move-result-object v0

    invoke-virtual {v0}, Lio/github/sceneview/ar/ArSceneLifecycle;->w()Landroid/content/Context;

    move-result-object v0

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.WindowManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lio/github/sceneview/ar/arcore/ArSession$c;->b()Landroid/view/Display;

    move-result-object v0

    return-object v0
.end method
