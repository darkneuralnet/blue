.class public final Lio/reactivex/internal/operators/flowable/o;
.super Lio/reactivex/F;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/internal/fuseable/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/o$a;
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

.field public final c:J

.field public final d:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/k;JLjava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/k<",
            "TT;>;JTT;)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/F;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/o;->b:Lio/reactivex/k;

    iput-wide p2, p0, Lio/reactivex/internal/operators/flowable/o;->c:J

    iput-object p4, p0, Lio/reactivex/internal/operators/flowable/o;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public X(Lio/reactivex/I;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/I<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/o;->b:Lio/reactivex/k;

    new-instance v1, Lio/reactivex/internal/operators/flowable/o$a;

    iget-wide v2, p0, Lio/reactivex/internal/operators/flowable/o;->c:J

    iget-object v4, p0, Lio/reactivex/internal/operators/flowable/o;->d:Ljava/lang/Object;

    invoke-direct {v1, p1, v2, v3, v4}, Lio/reactivex/internal/operators/flowable/o$a;-><init>(Lio/reactivex/I;JLjava/lang/Object;)V

    invoke-virtual {v0, v1}, Lio/reactivex/k;->W0(Lio/reactivex/o;)V

    return-void
.end method

.method public d()Lio/reactivex/k;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/k<",
            "TT;>;"
        }
    .end annotation

    new-instance v6, Lio/reactivex/internal/operators/flowable/m;

    iget-object v1, p0, Lio/reactivex/internal/operators/flowable/o;->b:Lio/reactivex/k;

    iget-wide v2, p0, Lio/reactivex/internal/operators/flowable/o;->c:J

    iget-object v4, p0, Lio/reactivex/internal/operators/flowable/o;->d:Ljava/lang/Object;

    const/4 v5, 0x1

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lio/reactivex/internal/operators/flowable/m;-><init>(Lio/reactivex/k;JLjava/lang/Object;Z)V

    invoke-static {v6}, Lio/reactivex/plugins/a;->m(Lio/reactivex/k;)Lio/reactivex/k;

    move-result-object v0

    return-object v0
.end method
