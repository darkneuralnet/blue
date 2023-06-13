.class public final Lz80;
.super Lio/reactivex/Observable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz80$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/Observable<",
        "LHM4<",
        "TT;>;>;"
    }
.end annotation


# instance fields
.field public final b:Lx80;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx80<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lx80;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx80<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/Observable;-><init>()V

    iput-object p1, p0, Lz80;->b:Lx80;

    return-void
.end method


# virtual methods
.method public subscribeActual(Lio/reactivex/D;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-",
            "LHM4<",
            "TT;>;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lz80;->b:Lx80;

    invoke-interface {v0}, Lx80;->clone()Lx80;

    move-result-object v0

    new-instance v1, Lz80$a;

    invoke-direct {v1, v0, p1}, Lz80$a;-><init>(Lx80;Lio/reactivex/D;)V

    invoke-interface {p1, v1}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    invoke-virtual {v1}, Lz80$a;->e()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-interface {v0, v1}, Lx80;->E0(LH80;)V

    :cond_0
    return-void
.end method
