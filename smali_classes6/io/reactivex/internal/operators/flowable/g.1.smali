.class public final Lio/reactivex/internal/operators/flowable/g;
.super Lio/reactivex/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/g$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/k<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final c:Lna4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lna4<",
            "+TT;>;"
        }
    .end annotation
.end field

.field public final d:Lna4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lna4<",
            "TU;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lna4;Lna4;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lna4<",
            "+TT;>;",
            "Lna4<",
            "TU;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/k;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/g;->c:Lna4;

    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/g;->d:Lna4;

    return-void
.end method


# virtual methods
.method public X0(LhT5;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TT;>;)V"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/flowable/g$a;

    iget-object v1, p0, Lio/reactivex/internal/operators/flowable/g;->c:Lna4;

    invoke-direct {v0, p1, v1}, Lio/reactivex/internal/operators/flowable/g$a;-><init>(LhT5;Lna4;)V

    invoke-interface {p1, v0}, LhT5;->a(LoT5;)V

    iget-object p1, p0, Lio/reactivex/internal/operators/flowable/g;->d:Lna4;

    iget-object v0, v0, Lio/reactivex/internal/operators/flowable/g$a;->d:Lio/reactivex/internal/operators/flowable/g$a$a;

    invoke-interface {p1, v0}, Lna4;->c(LhT5;)V

    return-void
.end method
