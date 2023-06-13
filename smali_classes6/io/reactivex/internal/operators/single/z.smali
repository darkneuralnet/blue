.class public final Lio/reactivex/internal/operators/single/z;
.super Lio/reactivex/F;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/single/z$a;
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
.field public final b:Lio/reactivex/K;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/K<",
            "+TT;>;"
        }
    .end annotation
.end field

.field public final c:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "-",
            "Ljava/lang/Throwable;",
            "+TT;>;"
        }
    .end annotation
.end field

.field public final d:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/K;Lio/reactivex/functions/o;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/K<",
            "+TT;>;",
            "Lio/reactivex/functions/o<",
            "-",
            "Ljava/lang/Throwable;",
            "+TT;>;TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/F;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/single/z;->b:Lio/reactivex/K;

    iput-object p2, p0, Lio/reactivex/internal/operators/single/z;->c:Lio/reactivex/functions/o;

    iput-object p3, p0, Lio/reactivex/internal/operators/single/z;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public X(Lio/reactivex/I;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/I<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/single/z;->b:Lio/reactivex/K;

    new-instance v1, Lio/reactivex/internal/operators/single/z$a;

    invoke-direct {v1, p0, p1}, Lio/reactivex/internal/operators/single/z$a;-><init>(Lio/reactivex/internal/operators/single/z;Lio/reactivex/I;)V

    invoke-interface {v0, v1}, Lio/reactivex/K;->a(Lio/reactivex/I;)V

    return-void
.end method
