.class public final Lio/reactivex/internal/operators/completable/m;
.super Lio/reactivex/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/completable/m$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/c;"
    }
.end annotation


# instance fields
.field public final b:Lna4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lna4<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lna4;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lna4<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/c;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/completable/m;->b:Lna4;

    return-void
.end method


# virtual methods
.method public W(Lio/reactivex/f;)V
    .locals 2

    iget-object v0, p0, Lio/reactivex/internal/operators/completable/m;->b:Lna4;

    new-instance v1, Lio/reactivex/internal/operators/completable/m$a;

    invoke-direct {v1, p1}, Lio/reactivex/internal/operators/completable/m$a;-><init>(Lio/reactivex/f;)V

    invoke-interface {v0, v1}, Lna4;->c(LhT5;)V

    return-void
.end method
