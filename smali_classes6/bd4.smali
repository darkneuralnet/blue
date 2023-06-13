.class public abstract Lbd4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYh3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LYh3<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public Q()LO24;
    .locals 1

    sget-object v0, LO24;->c:LO24;

    return-object v0
.end method

.method public a(LYh3;)I
    .locals 1

    invoke-interface {p1}, LYh3;->Q()LO24;

    move-result-object p1

    iget p1, p1, LO24;->a:I

    invoke-virtual {p0}, Lbd4;->Q()LO24;

    move-result-object v0

    iget v0, v0, LO24;->a:I

    sub-int/2addr p1, v0

    return p1
.end method

.method public abstract b(Lio/reactivex/y;Ldd4;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/y<",
            "TT;>;",
            "Ldd4;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation
.end method

.method public abstract c(Landroid/os/DeadObjectException;)Lcom/polidea/rxandroidble2/exceptions/BleException;
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LYh3;

    invoke-virtual {p0, p1}, Lbd4;->a(LYh3;)I

    move-result p1

    return p1
.end method

.method public final y0(Ldd4;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldd4;",
            ")",
            "Lio/reactivex/Observable<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lbd4$a;

    invoke-direct {v0, p0, p1}, Lbd4$a;-><init>(Lbd4;Ldd4;)V

    invoke-static {v0}, Lio/reactivex/Observable;->create(Lio/reactivex/z;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
