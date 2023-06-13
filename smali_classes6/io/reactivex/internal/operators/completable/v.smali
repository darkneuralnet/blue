.class public final Lio/reactivex/internal/operators/completable/v;
.super Lio/reactivex/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/completable/v$a;
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/h;

.field public final c:Lio/reactivex/functions/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/q<",
            "-",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/h;Lio/reactivex/functions/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/h;",
            "Lio/reactivex/functions/q<",
            "-",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/c;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/completable/v;->b:Lio/reactivex/h;

    iput-object p2, p0, Lio/reactivex/internal/operators/completable/v;->c:Lio/reactivex/functions/q;

    return-void
.end method


# virtual methods
.method public W(Lio/reactivex/f;)V
    .locals 2

    iget-object v0, p0, Lio/reactivex/internal/operators/completable/v;->b:Lio/reactivex/h;

    new-instance v1, Lio/reactivex/internal/operators/completable/v$a;

    invoke-direct {v1, p0, p1}, Lio/reactivex/internal/operators/completable/v$a;-><init>(Lio/reactivex/internal/operators/completable/v;Lio/reactivex/f;)V

    invoke-interface {v0, v1}, Lio/reactivex/h;->g(Lio/reactivex/f;)V

    return-void
.end method
