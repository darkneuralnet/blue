.class public final Lio/reactivex/internal/operators/observable/Q0$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements Lio/reactivex/functions/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/observable/Q0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Lio/reactivex/disposables/c;",
        ">;",
        "Ljava/lang/Runnable;",
        "Lio/reactivex/functions/g<",
        "Lio/reactivex/disposables/c;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x3f2c4fd6dc101621L


# instance fields
.field public final b:Lio/reactivex/internal/operators/observable/Q0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/operators/observable/Q0<",
            "*>;"
        }
    .end annotation
.end field

.field public c:Lio/reactivex/disposables/c;

.field public d:J

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>(Lio/reactivex/internal/operators/observable/Q0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/internal/operators/observable/Q0<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/Q0$a;->b:Lio/reactivex/internal/operators/observable/Q0;

    return-void
.end method


# virtual methods
.method public a(Lio/reactivex/disposables/c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static {p0, p1}, Lio/reactivex/internal/disposables/d;->c(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/disposables/c;)Z

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/Q0$a;->b:Lio/reactivex/internal/operators/observable/Q0;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lio/reactivex/internal/operators/observable/Q0$a;->f:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/Q0$a;->b:Lio/reactivex/internal/operators/observable/Q0;

    iget-object v1, v1, Lio/reactivex/internal/operators/observable/Q0;->b:Lio/reactivex/observables/a;

    check-cast v1, Lio/reactivex/internal/disposables/g;

    invoke-interface {v1, p1}, Lio/reactivex/internal/disposables/g;->d(Lio/reactivex/disposables/c;)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    check-cast p1, Lio/reactivex/disposables/c;

    invoke-virtual {p0, p1}, Lio/reactivex/internal/operators/observable/Q0$a;->a(Lio/reactivex/disposables/c;)V

    return-void
.end method

.method public run()V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/Q0$a;->b:Lio/reactivex/internal/operators/observable/Q0;

    invoke-virtual {v0, p0}, Lio/reactivex/internal/operators/observable/Q0;->h(Lio/reactivex/internal/operators/observable/Q0$a;)V

    return-void
.end method
