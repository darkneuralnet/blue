.class public final Lio/reactivex/internal/operators/observable/d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/internal/operators/observable/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public b:Ljava/lang/Object;

.field public final synthetic c:Lio/reactivex/internal/operators/observable/d$a;


# direct methods
.method public constructor <init>(Lio/reactivex/internal/operators/observable/d$a;)V
    .locals 0

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/d$a$a;->c:Lio/reactivex/internal/operators/observable/d$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/d$a$a;->c:Lio/reactivex/internal/operators/observable/d$a;

    iget-object v0, v0, Lio/reactivex/internal/operators/observable/d$a;->c:Ljava/lang/Object;

    iput-object v0, p0, Lio/reactivex/internal/operators/observable/d$a$a;->b:Ljava/lang/Object;

    invoke-static {v0}, Lio/reactivex/internal/util/n;->j(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lio/reactivex/internal/operators/observable/d$a$a;->b:Ljava/lang/Object;

    if-nez v1, :cond_0

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/d$a$a;->c:Lio/reactivex/internal/operators/observable/d$a;

    iget-object v1, v1, Lio/reactivex/internal/operators/observable/d$a;->c:Ljava/lang/Object;

    iput-object v1, p0, Lio/reactivex/internal/operators/observable/d$a$a;->b:Ljava/lang/Object;

    :cond_0
    iget-object v1, p0, Lio/reactivex/internal/operators/observable/d$a$a;->b:Ljava/lang/Object;

    invoke-static {v1}, Lio/reactivex/internal/util/n;->j(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/d$a$a;->b:Ljava/lang/Object;

    invoke-static {v1}, Lio/reactivex/internal/util/n;->k(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lio/reactivex/internal/operators/observable/d$a$a;->b:Ljava/lang/Object;

    invoke-static {v1}, Lio/reactivex/internal/util/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v0, p0, Lio/reactivex/internal/operators/observable/d$a$a;->b:Ljava/lang/Object;

    return-object v1

    :cond_1
    :try_start_1
    iget-object v1, p0, Lio/reactivex/internal/operators/observable/d$a$a;->b:Ljava/lang/Object;

    invoke-static {v1}, Lio/reactivex/internal/util/n;->h(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    invoke-static {v1}, Lio/reactivex/internal/util/k;->e(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object v1

    throw v1

    :cond_2
    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v1

    iput-object v0, p0, Lio/reactivex/internal/operators/observable/d$a$a;->b:Ljava/lang/Object;

    throw v1
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Read only iterator"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
