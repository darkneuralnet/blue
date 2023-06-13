.class public Lr51$b;
.super Lio/reactivex/observers/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr51;->a(Lio/reactivex/y;)Lio/reactivex/observers/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/reactivex/observers/e<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic c:Lio/reactivex/y;


# direct methods
.method public constructor <init>(Lio/reactivex/y;)V
    .locals 0

    iput-object p1, p0, Lr51$b;->c:Lio/reactivex/y;

    invoke-direct {p0}, Lio/reactivex/observers/e;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lr51$b;->c:Lio/reactivex/y;

    invoke-interface {v0, p1}, Lio/reactivex/y;->c(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lr51$b;->c:Lio/reactivex/y;

    invoke-interface {v0, p1}, Lio/reactivex/j;->onNext(Ljava/lang/Object;)V

    iget-object p1, p0, Lr51$b;->c:Lio/reactivex/y;

    invoke-interface {p1}, Lio/reactivex/j;->onComplete()V

    return-void
.end method
