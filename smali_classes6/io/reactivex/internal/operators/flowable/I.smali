.class public final Lio/reactivex/internal/operators/flowable/I;
.super Lio/reactivex/F;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/I$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/F<",
        "TT;>;"
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

.field public final c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lna4;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lna4<",
            "TT;>;TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/F;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/flowable/I;->b:Lna4;

    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/I;->c:Ljava/lang/Object;

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

    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/I;->b:Lna4;

    new-instance v1, Lio/reactivex/internal/operators/flowable/I$a;

    iget-object v2, p0, Lio/reactivex/internal/operators/flowable/I;->c:Ljava/lang/Object;

    invoke-direct {v1, p1, v2}, Lio/reactivex/internal/operators/flowable/I$a;-><init>(Lio/reactivex/I;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lna4;->c(LhT5;)V

    return-void
.end method
