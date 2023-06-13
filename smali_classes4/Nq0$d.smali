.class public LNq0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNq0;->h(ILjava/util/List;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:I

.field public final synthetic d:LNq0;


# direct methods
.method public constructor <init>(LNq0;Ljava/util/List;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LNq0$d;->d:LNq0;

    iput-object p2, p0, LNq0$d;->b:Ljava/util/List;

    iput p3, p0, LNq0$d;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LNq0$d;->d:LNq0;

    invoke-static {v0}, LNq0;->r(LNq0;)Lgz5;

    move-result-object v0

    invoke-virtual {v0}, Lgz5;->b()LqV5;

    move-result-object v0

    sget-object v1, Lco/bird/android/persistence/common/impl/Converters;->a:Lco/bird/android/persistence/common/impl/Converters;

    iget-object v1, p0, LNq0$d;->b:Ljava/util/List;

    invoke-static {v1}, Lco/bird/android/persistence/common/impl/Converters;->o(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    invoke-interface {v0, v2}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-interface {v0, v2, v1}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    iget v1, p0, LNq0$d;->c:I

    int-to-long v1, v1

    const/4 v3, 0x2

    invoke-interface {v0, v3, v1, v2}, LoV5;->S0(IJ)V

    iget-object v1, p0, LNq0$d;->d:LNq0;

    invoke-static {v1}, LNq0;->k(LNq0;)LEb5;

    move-result-object v1

    invoke-virtual {v1}, LEb5;->c()V

    :try_start_0
    invoke-interface {v0}, LqV5;->M()I

    iget-object v1, p0, LNq0$d;->d:LNq0;

    invoke-static {v1}, LNq0;->k(LNq0;)LEb5;

    move-result-object v1

    invoke-virtual {v1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, LNq0$d;->d:LNq0;

    invoke-static {v1}, LNq0;->k(LNq0;)LEb5;

    move-result-object v1

    invoke-virtual {v1}, LEb5;->g()V

    iget-object v1, p0, LNq0$d;->d:LNq0;

    invoke-static {v1}, LNq0;->r(LNq0;)Lgz5;

    move-result-object v1

    invoke-virtual {v1, v0}, Lgz5;->h(LqV5;)V

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v1

    iget-object v2, p0, LNq0$d;->d:LNq0;

    invoke-static {v2}, LNq0;->k(LNq0;)LEb5;

    move-result-object v2

    invoke-virtual {v2}, LEb5;->g()V

    iget-object v2, p0, LNq0$d;->d:LNq0;

    invoke-static {v2}, LNq0;->r(LNq0;)Lgz5;

    move-result-object v2

    invoke-virtual {v2, v0}, Lgz5;->h(LqV5;)V

    throw v1
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, LNq0$d;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
