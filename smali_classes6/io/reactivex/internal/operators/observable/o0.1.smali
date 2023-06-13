.class public final Lio/reactivex/internal/operators/observable/o0;
.super Lio/reactivex/c;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/internal/fuseable/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/o0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/c;",
        "Lio/reactivex/internal/fuseable/d<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/B;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/B<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/B;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/B<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/c;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/o0;->b:Lio/reactivex/B;

    return-void
.end method


# virtual methods
.method public W(Lio/reactivex/f;)V
    .locals 2

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/o0;->b:Lio/reactivex/B;

    new-instance v1, Lio/reactivex/internal/operators/observable/o0$a;

    invoke-direct {v1, p1}, Lio/reactivex/internal/operators/observable/o0$a;-><init>(Lio/reactivex/f;)V

    invoke-interface {v0, v1}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    return-void
.end method

.method public c()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/observable/n0;

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/o0;->b:Lio/reactivex/B;

    invoke-direct {v0, v1}, Lio/reactivex/internal/operators/observable/n0;-><init>(Lio/reactivex/B;)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->o(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
