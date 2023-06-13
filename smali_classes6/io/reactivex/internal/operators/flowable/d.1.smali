.class public final Lio/reactivex/internal/operators/flowable/d;
.super Lio/reactivex/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/k<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final c:[Lna4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lna4<",
            "+TT;>;"
        }
    .end annotation
.end field

.field public final d:Z


# direct methods
.method public constructor <init>([Lna4;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lna4<",
            "+TT;>;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/k;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/d;->c:[Lna4;

    iput-boolean p2, p0, Lio/reactivex/internal/operators/flowable/d;->d:Z

    return-void
.end method


# virtual methods
.method public X0(LhT5;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TT;>;)V"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/operators/flowable/d$a;

    iget-object v1, p0, Lio/reactivex/internal/operators/flowable/d;->c:[Lna4;

    iget-boolean v2, p0, Lio/reactivex/internal/operators/flowable/d;->d:Z

    invoke-direct {v0, v1, v2, p1}, Lio/reactivex/internal/operators/flowable/d$a;-><init>([Lna4;ZLhT5;)V

    invoke-interface {p1, v0}, LhT5;->a(LoT5;)V

    invoke-virtual {v0}, Lio/reactivex/internal/operators/flowable/d$a;->onComplete()V

    return-void
.end method
