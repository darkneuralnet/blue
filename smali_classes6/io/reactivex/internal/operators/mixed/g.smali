.class public final Lio/reactivex/internal/operators/mixed/g;
.super Lio/reactivex/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/mixed/g$a;
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
.field public final b:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
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

.field public final d:Lio/reactivex/internal/util/j;

.field public final e:I


# direct methods
.method public constructor <init>(Lio/reactivex/Observable;Lio/reactivex/functions/o;Lio/reactivex/internal/util/j;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/Observable<",
            "TT;>;",
            "Lio/reactivex/functions/o<",
            "-TT;+",
            "Lio/reactivex/h;",
            ">;",
            "Lio/reactivex/internal/util/j;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/c;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/mixed/g;->b:Lio/reactivex/Observable;

    iput-object p2, p0, Lio/reactivex/internal/operators/mixed/g;->c:Lio/reactivex/functions/o;

    iput-object p3, p0, Lio/reactivex/internal/operators/mixed/g;->d:Lio/reactivex/internal/util/j;

    iput p4, p0, Lio/reactivex/internal/operators/mixed/g;->e:I

    return-void
.end method


# virtual methods
.method public W(Lio/reactivex/f;)V
    .locals 5

    iget-object v0, p0, Lio/reactivex/internal/operators/mixed/g;->b:Lio/reactivex/Observable;

    iget-object v1, p0, Lio/reactivex/internal/operators/mixed/g;->c:Lio/reactivex/functions/o;

    invoke-static {v0, v1, p1}, Lio/reactivex/internal/operators/mixed/m;->a(Ljava/lang/Object;Lio/reactivex/functions/o;Lio/reactivex/f;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/reactivex/internal/operators/mixed/g;->b:Lio/reactivex/Observable;

    new-instance v1, Lio/reactivex/internal/operators/mixed/g$a;

    iget-object v2, p0, Lio/reactivex/internal/operators/mixed/g;->c:Lio/reactivex/functions/o;

    iget-object v3, p0, Lio/reactivex/internal/operators/mixed/g;->d:Lio/reactivex/internal/util/j;

    iget v4, p0, Lio/reactivex/internal/operators/mixed/g;->e:I

    invoke-direct {v1, p1, v2, v3, v4}, Lio/reactivex/internal/operators/mixed/g$a;-><init>(Lio/reactivex/f;Lio/reactivex/functions/o;Lio/reactivex/internal/util/j;I)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/D;)V

    :cond_0
    return-void
.end method
