.class public final LQM5$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQM5;->r()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$sendNotifications$1\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,549:1\n460#2,11:550\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$sendNotifications$1\n*L\n84#1:550,11\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LQM5;


# direct methods
.method public constructor <init>(LQM5;)V
    .locals 0

    iput-object p1, p0, LQM5$e;->g:LQM5;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LQM5$e;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 7

    :cond_0
    iget-object v0, p0, LQM5$e;->g:LQM5;

    invoke-static {v0}, LQM5;->d(LQM5;)LLX2;

    move-result-object v0

    iget-object v1, p0, LQM5$e;->g:LQM5;

    monitor-enter v0

    :try_start_0
    invoke-static {v1}, LQM5;->f(LQM5;)Z

    move-result v2

    if-nez v2, :cond_3

    const/4 v2, 0x1

    invoke-static {v1, v2}, LQM5;->i(LQM5;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v2, 0x0

    :try_start_1
    invoke-static {v1}, LQM5;->d(LQM5;)LLX2;

    move-result-object v3

    invoke-virtual {v3}, LLX2;->u()I

    move-result v4

    if-lez v4, :cond_2

    invoke-virtual {v3}, LLX2;->s()[Ljava/lang/Object;

    move-result-object v3

    move v5, v2

    :cond_1
    aget-object v6, v3, v5

    check-cast v6, LQM5$a;

    invoke-virtual {v6}, LQM5$a;->p()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v5, v5, 0x1

    if-lt v5, v4, :cond_1

    :cond_2
    :try_start_2
    invoke-static {v1, v2}, LQM5;->i(LQM5;Z)V

    goto :goto_0

    :catchall_0
    move-exception v3

    invoke-static {v1, v2}, LQM5;->i(LQM5;Z)V

    throw v3

    :cond_3
    :goto_0
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    iget-object v0, p0, LQM5$e;->g:LQM5;

    invoke-static {v0}, LQM5;->b(LQM5;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1
.end method
