.class public LYi1$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/D;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYi1$a;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/D<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:LYi1$a;


# direct methods
.method public constructor <init>(LYi1$a;)V
    .locals 0

    iput-object p1, p0, LYi1$a$a;->b:LYi1$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 1

    iget-object v0, p0, LYi1$a$a;->b:LYi1$a;

    iget-object v0, v0, LYi1$a;->d:LYi1;

    iget-object v0, v0, LYi1;->d:Lio/reactivex/y;

    invoke-interface {v0}, Lio/reactivex/j;->onComplete()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, LYi1$a$a;->b:LYi1$a;

    iget-object v0, v0, LYi1$a;->d:LYi1;

    iget-object v0, v0, LYi1;->d:Lio/reactivex/y;

    invoke-interface {v0, p1}, Lio/reactivex/y;->c(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, LYi1$a$a;->b:LYi1$a;

    iget-object v0, v0, LYi1$a;->d:LYi1;

    iget-object v0, v0, LYi1;->d:Lio/reactivex/y;

    invoke-interface {v0, p1}, Lio/reactivex/j;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public onSubscribe(Lio/reactivex/disposables/c;)V
    .locals 1

    iget-object v0, p0, LYi1$a$a;->b:LYi1$a;

    iget-object v0, v0, LYi1$a;->d:LYi1;

    iget-object v0, v0, LYi1;->d:Lio/reactivex/y;

    invoke-interface {v0, p1}, Lio/reactivex/y;->b(Lio/reactivex/disposables/c;)V

    return-void
.end method
