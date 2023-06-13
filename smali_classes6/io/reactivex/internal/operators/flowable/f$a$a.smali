.class public final Lio/reactivex/internal/operators/flowable/f$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/flowable/f$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final synthetic b:Lio/reactivex/internal/operators/flowable/f$a;


# direct methods
.method public constructor <init>(Lio/reactivex/internal/operators/flowable/f$a;)V
    .locals 0

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/f$a$a;->b:Lio/reactivex/internal/operators/flowable/f$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/f$a$a;->b:Lio/reactivex/internal/operators/flowable/f$a;

    iget-object v0, v0, Lio/reactivex/internal/operators/flowable/f$a;->b:LhT5;

    invoke-interface {v0}, LhT5;->onComplete()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/f$a$a;->b:Lio/reactivex/internal/operators/flowable/f$a;

    iget-object v0, v0, Lio/reactivex/internal/operators/flowable/f$a;->e:Lio/reactivex/E$c;

    invoke-interface {v0}, Lio/reactivex/disposables/c;->dispose()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lio/reactivex/internal/operators/flowable/f$a$a;->b:Lio/reactivex/internal/operators/flowable/f$a;

    iget-object v1, v1, Lio/reactivex/internal/operators/flowable/f$a;->e:Lio/reactivex/E$c;

    invoke-interface {v1}, Lio/reactivex/disposables/c;->dispose()V

    throw v0
.end method
