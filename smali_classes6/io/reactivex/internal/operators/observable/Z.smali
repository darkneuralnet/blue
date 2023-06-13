.class public final Lio/reactivex/internal/operators/observable/Z;
.super Lio/reactivex/c;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/internal/fuseable/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/observable/Z$a;
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

.field public final c:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lio/reactivex/h;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Z


# direct methods
.method public constructor <init>(Lio/reactivex/B;Lio/reactivex/functions/o;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/B<",
            "TT;>;",
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lio/reactivex/h;",
            ">;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/c;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/Z;->b:Lio/reactivex/B;

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/Z;->c:Lio/reactivex/functions/o;

    iput-boolean p3, p0, Lio/reactivex/internal/operators/observable/Z;->d:Z

    return-void
.end method


# virtual methods
.method public W(Lio/reactivex/f;)V
    .locals 4

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/Z;->b:Lio/reactivex/B;

    new-instance v1, Lio/reactivex/internal/operators/observable/Z$a;

    iget-object v2, p0, Lio/reactivex/internal/operators/observable/Z;->c:Lio/reactivex/functions/o;

    iget-boolean v3, p0, Lio/reactivex/internal/operators/observable/Z;->d:Z

    invoke-direct {v1, p1, v2, v3}, Lio/reactivex/internal/operators/observable/Z$a;-><init>(Lio/reactivex/f;Lio/reactivex/functions/o;Z)V

    invoke-interface {v0, v1}, Lio/reactivex/B;->subscribe(Lio/reactivex/D;)V

    return-void
.end method

.method public c()Lio/reactivex/Observable;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/observable/Y;

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/Z;->b:Lio/reactivex/B;

    iget-object v2, p0, Lio/reactivex/internal/operators/observable/Z;->c:Lio/reactivex/functions/o;

    iget-boolean v3, p0, Lio/reactivex/internal/operators/observable/Z;->d:Z

    invoke-direct {v0, v1, v2, v3}, Lio/reactivex/internal/operators/observable/Y;-><init>(Lio/reactivex/B;Lio/reactivex/functions/o;Z)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->o(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
