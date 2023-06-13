.class public final Lio/reactivex/internal/operators/flowable/u;
.super Lio/reactivex/c;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/internal/fuseable/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/u$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/c;",
        "Lio/reactivex/internal/fuseable/b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/k<",
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

.field public final d:I

.field public final e:Z


# direct methods
.method public constructor <init>(Lio/reactivex/k;Lio/reactivex/functions/o;ZI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/k<",
            "TT;>;",
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lio/reactivex/h;",
            ">;ZI)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/c;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/u;->b:Lio/reactivex/k;

    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/u;->c:Lio/reactivex/functions/o;

    iput-boolean p3, p0, Lio/reactivex/internal/operators/flowable/u;->e:Z

    iput p4, p0, Lio/reactivex/internal/operators/flowable/u;->d:I

    return-void
.end method


# virtual methods
.method public W(Lio/reactivex/f;)V
    .locals 5

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/u;->b:Lio/reactivex/k;

    new-instance v1, Lio/reactivex/internal/operators/flowable/u$a;

    iget-object v2, p0, Lio/reactivex/internal/operators/flowable/u;->c:Lio/reactivex/functions/o;

    iget-boolean v3, p0, Lio/reactivex/internal/operators/flowable/u;->e:Z

    iget v4, p0, Lio/reactivex/internal/operators/flowable/u;->d:I

    invoke-direct {v1, p1, v2, v3, v4}, Lio/reactivex/internal/operators/flowable/u$a;-><init>(Lio/reactivex/f;Lio/reactivex/functions/o;ZI)V

    invoke-virtual {v0, v1}, Lio/reactivex/k;->W0(Lio/reactivex/o;)V

    return-void
.end method

.method public d()Lio/reactivex/k;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/k<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/flowable/t;

    iget-object v1, p0, Lio/reactivex/internal/operators/flowable/u;->b:Lio/reactivex/k;

    iget-object v2, p0, Lio/reactivex/internal/operators/flowable/u;->c:Lio/reactivex/functions/o;

    iget-boolean v3, p0, Lio/reactivex/internal/operators/flowable/u;->e:Z

    iget v4, p0, Lio/reactivex/internal/operators/flowable/u;->d:I

    invoke-direct {v0, v1, v2, v3, v4}, Lio/reactivex/internal/operators/flowable/t;-><init>(Lio/reactivex/k;Lio/reactivex/functions/o;ZI)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->m(Lio/reactivex/k;)Lio/reactivex/k;

    move-result-object v0

    return-object v0
.end method
