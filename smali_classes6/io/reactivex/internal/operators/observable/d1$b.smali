.class public final Lio/reactivex/internal/operators/observable/d1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/D;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/observable/d1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/D<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/internal/operators/observable/d1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/operators/observable/d1$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Lio/reactivex/internal/queue/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/internal/queue/c<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final d:I

.field public volatile e:Z

.field public f:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Lio/reactivex/internal/operators/observable/d1$a;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/internal/operators/observable/d1$a<",
            "TT;>;II)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/d1$b;->b:Lio/reactivex/internal/operators/observable/d1$a;

    iput p2, p0, Lio/reactivex/internal/operators/observable/d1$b;->d:I

    new-instance p1, Lio/reactivex/internal/queue/c;

    invoke-direct {p1, p3}, Lio/reactivex/internal/queue/c;-><init>(I)V

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/d1$b;->c:Lio/reactivex/internal/queue/c;

    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/reactivex/internal/operators/observable/d1$b;->e:Z

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/d1$b;->b:Lio/reactivex/internal/operators/observable/d1$a;

    invoke-virtual {v0}, Lio/reactivex/internal/operators/observable/d1$a;->b()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/d1$b;->f:Ljava/lang/Throwable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/reactivex/internal/operators/observable/d1$b;->e:Z

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/d1$b;->b:Lio/reactivex/internal/operators/observable/d1$a;

    invoke-virtual {p1}, Lio/reactivex/internal/operators/observable/d1$a;->b()V

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/d1$b;->c:Lio/reactivex/internal/queue/c;

    invoke-virtual {v0, p1}, Lio/reactivex/internal/queue/c;->offer(Ljava/lang/Object;)Z

    iget-object p1, p0, Lio/reactivex/internal/operators/observable/d1$b;->b:Lio/reactivex/internal/operators/observable/d1$a;

    invoke-virtual {p1}, Lio/reactivex/internal/operators/observable/d1$a;->b()V

    return-void
.end method

.method public onSubscribe(Lio/reactivex/disposables/c;)V
    .locals 2

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/d1$b;->b:Lio/reactivex/internal/operators/observable/d1$a;

    iget v1, p0, Lio/reactivex/internal/operators/observable/d1$b;->d:I

    invoke-virtual {v0, p1, v1}, Lio/reactivex/internal/operators/observable/d1$a;->c(Lio/reactivex/disposables/c;I)Z

    return-void
.end method
