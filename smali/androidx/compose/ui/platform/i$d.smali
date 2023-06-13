.class public final Landroidx/compose/ui/platform/i$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/i;-><init>(Landroid/view/Choreographer;Landroid/os/Handler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0008\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "androidx/compose/ui/platform/i$d",
        "Landroid/view/Choreographer$FrameCallback;",
        "Ljava/lang/Runnable;",
        "",
        "run",
        "",
        "frameTimeNanos",
        "doFrame",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAndroidUiDispatcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,191:1\n34#2:192\n*S KotlinDebug\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1\n*L\n58#1:192\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:Landroidx/compose/ui/platform/i;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/i;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/i$d;->b:Landroidx/compose/ui/platform/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public doFrame(J)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/i$d;->b:Landroidx/compose/ui/platform/i;

    invoke-static {v0}, Landroidx/compose/ui/platform/i;->L(Landroidx/compose/ui/platform/i;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/i$d;->b:Landroidx/compose/ui/platform/i;

    invoke-static {v0}, Landroidx/compose/ui/platform/i;->X(Landroidx/compose/ui/platform/i;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/i$d;->b:Landroidx/compose/ui/platform/i;

    invoke-static {v0, p1, p2}, Landroidx/compose/ui/platform/i;->W(Landroidx/compose/ui/platform/i;J)V

    return-void
.end method

.method public run()V
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/platform/i$d;->b:Landroidx/compose/ui/platform/i;

    invoke-static {v0}, Landroidx/compose/ui/platform/i;->X(Landroidx/compose/ui/platform/i;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/i$d;->b:Landroidx/compose/ui/platform/i;

    invoke-static {v0}, Landroidx/compose/ui/platform/i;->S(Landroidx/compose/ui/platform/i;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/i$d;->b:Landroidx/compose/ui/platform/i;

    monitor-enter v0

    :try_start_0
    invoke-static {v1}, Landroidx/compose/ui/platform/i;->V(Landroidx/compose/ui/platform/i;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Landroidx/compose/ui/platform/i;->b0()Landroid/view/Choreographer;

    move-result-object v2

    invoke-virtual {v2, p0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroidx/compose/ui/platform/i;->a0(Landroidx/compose/ui/platform/i;Z)V

    :cond_0
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
