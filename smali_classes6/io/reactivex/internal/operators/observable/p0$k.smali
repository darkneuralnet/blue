.class public final Lio/reactivex/internal/operators/observable/p0$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/observable/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "k"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/o<",
        "Lio/reactivex/Observable<",
        "TT;>;",
        "Lio/reactivex/B<",
        "TR;>;>;"
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "-",
            "Lio/reactivex/Observable<",
            "TT;>;+",
            "Lio/reactivex/B<",
            "TR;>;>;"
        }
    .end annotation
.end field

.field public final c:Lio/reactivex/E;


# direct methods
.method public constructor <init>(Lio/reactivex/functions/o;Lio/reactivex/E;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/o<",
            "-",
            "Lio/reactivex/Observable<",
            "TT;>;+",
            "Lio/reactivex/B<",
            "TR;>;>;",
            "Lio/reactivex/E;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/p0$k;->b:Lio/reactivex/functions/o;

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/p0$k;->c:Lio/reactivex/E;

    return-void
.end method


# virtual methods
.method public a(Lio/reactivex/Observable;)Lio/reactivex/B;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/Observable<",
            "TT;>;)",
            "Lio/reactivex/B<",
            "TR;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/p0$k;->b:Lio/reactivex/functions/o;

    invoke-interface {v0, p1}, Lio/reactivex/functions/o;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "The selector returned a null ObservableSource"

    invoke-static {p1, v0}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/reactivex/B;

    invoke-static {p1}, Lio/reactivex/Observable;->wrap(Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object p1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/p0$k;->c:Lio/reactivex/E;

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    check-cast p1, Lio/reactivex/Observable;

    invoke-virtual {p0, p1}, Lio/reactivex/internal/operators/observable/p0$k;->a(Lio/reactivex/Observable;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
