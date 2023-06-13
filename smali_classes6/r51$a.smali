.class public Lr51$a;
.super Lio/reactivex/observers/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr51;->b(Lio/reactivex/H;)Lio/reactivex/observers/e;
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
.field public final synthetic c:Lio/reactivex/H;


# direct methods
.method public constructor <init>(Lio/reactivex/H;)V
    .locals 0

    iput-object p1, p0, Lr51$a;->c:Lio/reactivex/H;

    invoke-direct {p0}, Lio/reactivex/observers/e;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lr51$a;->c:Lio/reactivex/H;

    invoke-interface {v0, p1}, Lio/reactivex/H;->c(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lr51$a;->c:Lio/reactivex/H;

    invoke-interface {v0, p1}, Lio/reactivex/H;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method
