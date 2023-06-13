.class public final Lio/reactivex/internal/operators/completable/x;
.super Lio/reactivex/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/completable/x$a;
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/h;

.field public final c:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "-",
            "Ljava/lang/Throwable;",
            "+",
            "Lio/reactivex/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/h;Lio/reactivex/functions/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/h;",
            "Lio/reactivex/functions/o<",
            "-",
            "Ljava/lang/Throwable;",
            "+",
            "Lio/reactivex/h;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/c;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/completable/x;->b:Lio/reactivex/h;

    iput-object p2, p0, Lio/reactivex/internal/operators/completable/x;->c:Lio/reactivex/functions/o;

    return-void
.end method


# virtual methods
.method public W(Lio/reactivex/f;)V
    .locals 2

    new-instance v0, Lio/reactivex/internal/operators/completable/x$a;

    iget-object v1, p0, Lio/reactivex/internal/operators/completable/x;->c:Lio/reactivex/functions/o;

    invoke-direct {v0, p1, v1}, Lio/reactivex/internal/operators/completable/x$a;-><init>(Lio/reactivex/f;Lio/reactivex/functions/o;)V

    invoke-interface {p1, v0}, Lio/reactivex/f;->onSubscribe(Lio/reactivex/disposables/c;)V

    iget-object p1, p0, Lio/reactivex/internal/operators/completable/x;->b:Lio/reactivex/h;

    invoke-interface {p1, v0}, Lio/reactivex/h;->g(Lio/reactivex/f;)V

    return-void
.end method
