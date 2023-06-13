.class final Lcom/uber/autodispose/AutoDisposeSingle;
.super Lio/reactivex/F;
.source "SourceFile"

# interfaces
.implements Lcom/uber/autodispose/SingleSubscribeProxy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/F<",
        "TT;>;",
        "Lcom/uber/autodispose/SingleSubscribeProxy<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final b:Lio/reactivex/K;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/K<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Lio/reactivex/h;


# direct methods
.method public constructor <init>(Lio/reactivex/K;Lio/reactivex/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/K<",
            "TT;>;",
            "Lio/reactivex/h;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/F;-><init>()V

    iput-object p1, p0, Lcom/uber/autodispose/AutoDisposeSingle;->b:Lio/reactivex/K;

    iput-object p2, p0, Lcom/uber/autodispose/AutoDisposeSingle;->c:Lio/reactivex/h;

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

    iget-object v0, p0, Lcom/uber/autodispose/AutoDisposeSingle;->b:Lio/reactivex/K;

    new-instance v1, Lcom/uber/autodispose/AutoDisposingSingleObserverImpl;

    iget-object v2, p0, Lcom/uber/autodispose/AutoDisposeSingle;->c:Lio/reactivex/h;

    invoke-direct {v1, v2, p1}, Lcom/uber/autodispose/AutoDisposingSingleObserverImpl;-><init>(Lio/reactivex/h;Lio/reactivex/I;)V

    invoke-interface {v0, v1}, Lio/reactivex/K;->a(Lio/reactivex/I;)V

    return-void
.end method
