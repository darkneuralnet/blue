.class public LYm$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYm;->j(Ljava/lang/String;Lorg/joda/time/DateTime;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lorg/joda/time/DateTime;

.field public final synthetic d:LYm;


# direct methods
.method public constructor <init>(LYm;Ljava/lang/String;Lorg/joda/time/DateTime;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LYm$l;->d:LYm;

    iput-object p2, p0, LYm$l;->b:Ljava/lang/String;

    iput-object p3, p0, LYm$l;->c:Lorg/joda/time/DateTime;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LYm$l;->d:LYm;

    invoke-static {v0}, LYm;->p(LYm;)Lgz5;

    move-result-object v0

    invoke-virtual {v0}, Lgz5;->b()LqV5;

    move-result-object v0

    iget-object v1, p0, LYm$l;->b:Ljava/lang/String;

    const/4 v2, 0x1

    if-nez v1, :cond_0

    invoke-interface {v0, v2}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-interface {v0, v2, v1}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    sget-object v1, Lco/bird/android/persistence/common/impl/Converters;->a:Lco/bird/android/persistence/common/impl/Converters;

    iget-object v1, p0, LYm$l;->c:Lorg/joda/time/DateTime;

    invoke-static {v1}, Lco/bird/android/persistence/common/impl/Converters;->e(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {v0, v2}, LoV5;->m1(I)V

    goto :goto_1

    :cond_1
    invoke-interface {v0, v2, v1}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1
    iget-object v1, p0, LYm$l;->d:LYm;

    invoke-static {v1}, LYm;->m(LYm;)LEb5;

    move-result-object v1

    invoke-virtual {v1}, LEb5;->c()V

    :try_start_0
    invoke-interface {v0}, LqV5;->M()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, LYm$l;->d:LYm;

    invoke-static {v2}, LYm;->m(LYm;)LEb5;

    move-result-object v2

    invoke-virtual {v2}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v2, p0, LYm$l;->d:LYm;

    invoke-static {v2}, LYm;->m(LYm;)LEb5;

    move-result-object v2

    invoke-virtual {v2}, LEb5;->g()V

    iget-object v2, p0, LYm$l;->d:LYm;

    invoke-static {v2}, LYm;->p(LYm;)Lgz5;

    move-result-object v2

    invoke-virtual {v2, v0}, Lgz5;->h(LqV5;)V

    return-object v1

    :catchall_0
    move-exception v1

    iget-object v2, p0, LYm$l;->d:LYm;

    invoke-static {v2}, LYm;->m(LYm;)LEb5;

    move-result-object v2

    invoke-virtual {v2}, LEb5;->g()V

    iget-object v2, p0, LYm$l;->d:LYm;

    invoke-static {v2}, LYm;->p(LYm;)Lgz5;

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

    invoke-virtual {p0}, LYm$l;->a()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
