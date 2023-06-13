.class public final Lio/reactivex/internal/operators/observable/l1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/D;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/observable/l1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/D<",
        "TU;>;"
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/internal/disposables/a;

.field public final c:Lio/reactivex/internal/operators/observable/l1$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/operators/observable/l1$b<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final d:Lio/reactivex/observers/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/observers/h<",
            "TT;>;"
        }
    .end annotation
.end field

.field public e:Lio/reactivex/disposables/c;

.field public final synthetic f:Lio/reactivex/internal/operators/observable/l1;


# direct methods
.method public constructor <init>(Lio/reactivex/internal/operators/observable/l1;Lio/reactivex/internal/disposables/a;Lio/reactivex/internal/operators/observable/l1$b;Lio/reactivex/observers/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/internal/disposables/a;",
            "Lio/reactivex/internal/operators/observable/l1$b<",
            "TT;>;",
            "Lio/reactivex/observers/h<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/l1$a;->f:Lio/reactivex/internal/operators/observable/l1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/l1$a;->b:Lio/reactivex/internal/disposables/a;

    iput-object p3, p0, Lio/reactivex/internal/operators/observable/l1$a;->c:Lio/reactivex/internal/operators/observable/l1$b;

    iput-object p4, p0, Lio/reactivex/internal/operators/observable/l1$a;->d:Lio/reactivex/observers/h;

    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 2

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/l1$a;->c:Lio/reactivex/internal/operators/observable/l1$b;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lio/reactivex/internal/operators/observable/l1$b;->e:Z

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/l1$a;->b:Lio/reactivex/internal/disposables/a;

    invoke-virtual {v0}, Lio/reactivex/internal/disposables/a;->dispose()V

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/l1$a;->d:Lio/reactivex/observers/h;

    invoke-virtual {v0, p1}, Lio/reactivex/observers/h;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;)V"
        }
    .end annotation

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/l1$a;->e:Lio/reactivex/disposables/c;

    invoke-interface {p1}, Lio/reactivex/disposables/c;->dispose()V

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/l1$a;->c:Lio/reactivex/internal/operators/observable/l1$b;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lio/reactivex/internal/operators/observable/l1$b;->e:Z

    return-void
.end method

.method public onSubscribe(Lio/reactivex/disposables/c;)V
    .locals 2

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/l1$a;->e:Lio/reactivex/disposables/c;

    invoke-static {v0, p1}, Lio/reactivex/internal/disposables/d;->j(Lio/reactivex/disposables/c;Lio/reactivex/disposables/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/l1$a;->e:Lio/reactivex/disposables/c;

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/l1$a;->b:Lio/reactivex/internal/disposables/a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1}, Lio/reactivex/internal/disposables/a;->a(ILio/reactivex/disposables/c;)Z

    :cond_0
    return-void
.end method
