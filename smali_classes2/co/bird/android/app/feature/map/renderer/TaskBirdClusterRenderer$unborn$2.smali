.class final Lco/bird/android/app/feature/map/renderer/TaskBirdClusterRenderer$unborn$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/renderer/TaskBirdClusterRenderer;-><init>(Landroid/content/Context;LcD1;LGl0;ZLco/bird/android/model/constant/MapMode;LTq4;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LPT;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LPT;",
        "invoke",
        "()LPT;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic this$0:Lco/bird/android/app/feature/map/renderer/TaskBirdClusterRenderer;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/renderer/TaskBirdClusterRenderer;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/TaskBirdClusterRenderer$unborn$2;->this$0:Lco/bird/android/app/feature/map/renderer/TaskBirdClusterRenderer;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()LPT;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/TaskBirdClusterRenderer$unborn$2;->this$0:Lco/bird/android/app/feature/map/renderer/TaskBirdClusterRenderer;

    invoke-virtual {v0}, Lco/bird/android/app/feature/map/renderer/TaskBirdClusterRenderer;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, LMg4;->marker_unborn:I

    invoke-static {v0, v1}, LfB0;->e(Landroid/content/Context;I)LPT;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/renderer/TaskBirdClusterRenderer$unborn$2;->invoke()LPT;

    move-result-object v0

    return-object v0
.end method
