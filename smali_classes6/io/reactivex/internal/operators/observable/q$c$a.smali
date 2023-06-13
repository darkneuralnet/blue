.class public final Lio/reactivex/internal/operators/observable/q$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/observable/q$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final b:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TU;"
        }
    .end annotation
.end field

.field public final synthetic c:Lio/reactivex/internal/operators/observable/q$c;


# direct methods
.method public constructor <init>(Lio/reactivex/internal/operators/observable/q$c;Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/q$c$a;->c:Lio/reactivex/internal/operators/observable/q$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/q$c$a;->b:Ljava/util/Collection;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/q$c$a;->c:Lio/reactivex/internal/operators/observable/q$c;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lio/reactivex/internal/operators/observable/q$c$a;->c:Lio/reactivex/internal/operators/observable/q$c;

    iget-object v1, v1, Lio/reactivex/internal/operators/observable/q$c;->m:Ljava/util/List;

    iget-object v2, p0, Lio/reactivex/internal/operators/observable/q$c$a;->b:Ljava/util/Collection;

    invoke-interface {v1, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/q$c$a;->c:Lio/reactivex/internal/operators/observable/q$c;

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/q$c$a;->b:Ljava/util/Collection;

    const/4 v2, 0x0

    iget-object v3, v0, Lio/reactivex/internal/operators/observable/q$c;->l:Lio/reactivex/E$c;

    invoke-static {v0, v1, v2, v3}, Lio/reactivex/internal/operators/observable/q$c;->l(Lio/reactivex/internal/operators/observable/q$c;Ljava/lang/Object;ZLio/reactivex/disposables/c;)V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
