.class public final Lio/reactivex/internal/operators/flowable/j0;
.super Lio/reactivex/F;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/internal/fuseable/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/j0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/F<",
        "TT;>;",
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

.field public final c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/k;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/k<",
            "TT;>;TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/F;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/j0;->b:Lio/reactivex/k;

    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/j0;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public X(Lio/reactivex/I;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/I<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/j0;->b:Lio/reactivex/k;

    new-instance v1, Lio/reactivex/internal/operators/flowable/j0$a;

    iget-object v2, p0, Lio/reactivex/internal/operators/flowable/j0;->c:Ljava/lang/Object;

    invoke-direct {v1, p1, v2}, Lio/reactivex/internal/operators/flowable/j0$a;-><init>(Lio/reactivex/I;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lio/reactivex/k;->W0(Lio/reactivex/o;)V

    return-void
.end method

.method public d()Lio/reactivex/k;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/k<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/flowable/h0;

    iget-object v1, p0, Lio/reactivex/internal/operators/flowable/j0;->b:Lio/reactivex/k;

    iget-object v2, p0, Lio/reactivex/internal/operators/flowable/j0;->c:Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lio/reactivex/internal/operators/flowable/h0;-><init>(Lio/reactivex/k;Ljava/lang/Object;Z)V

    invoke-static {v0}, Lio/reactivex/plugins/a;->m(Lio/reactivex/k;)Lio/reactivex/k;

    move-result-object v0

    return-object v0
.end method
