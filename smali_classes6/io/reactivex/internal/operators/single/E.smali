.class public final Lio/reactivex/internal/operators/single/E;
.super Lio/reactivex/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/single/E$a;
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
.field public final c:Lio/reactivex/K;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/K<",
            "+TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/K;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/K<",
            "+TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/k;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/single/E;->c:Lio/reactivex/K;

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

    iget-object v0, p0, Lio/reactivex/internal/operators/single/E;->c:Lio/reactivex/K;

    new-instance v1, Lio/reactivex/internal/operators/single/E$a;

    invoke-direct {v1, p1}, Lio/reactivex/internal/operators/single/E$a;-><init>(LhT5;)V

    invoke-interface {v0, v1}, Lio/reactivex/K;->a(Lio/reactivex/I;)V

    return-void
.end method
