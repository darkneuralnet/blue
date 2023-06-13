.class public final Lio/reactivex/internal/operators/mixed/b;
.super Lio/reactivex/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/mixed/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/k<",
        "TR;>;"
    }
.end annotation


# instance fields
.field public final c:Lio/reactivex/h;

.field public final d:Lna4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lna4<",
            "+TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/h;Lna4;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/h;",
            "Lna4<",
            "+TR;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/k;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/mixed/b;->c:Lio/reactivex/h;

    iput-object p2, p0, Lio/reactivex/internal/operators/mixed/b;->d:Lna4;

    return-void
.end method


# virtual methods
.method public X0(LhT5;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LhT5<",
            "-TR;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/mixed/b;->c:Lio/reactivex/h;

    new-instance v1, Lio/reactivex/internal/operators/mixed/b$a;

    iget-object v2, p0, Lio/reactivex/internal/operators/mixed/b;->d:Lna4;

    invoke-direct {v1, p1, v2}, Lio/reactivex/internal/operators/mixed/b$a;-><init>(LhT5;Lna4;)V

    invoke-interface {v0, v1}, Lio/reactivex/h;->g(Lio/reactivex/f;)V

    return-void
.end method
