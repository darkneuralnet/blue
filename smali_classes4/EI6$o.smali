.class public LEI6$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LEI6;->i(Lorg/joda/time/DateTime;)Lio/reactivex/c;
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
.field public final synthetic b:Lorg/joda/time/DateTime;

.field public final synthetic c:LEI6;


# direct methods
.method public constructor <init>(LEI6;Lorg/joda/time/DateTime;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LEI6$o;->c:LEI6;

    iput-object p2, p0, LEI6$o;->b:Lorg/joda/time/DateTime;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LEI6$o;->c:LEI6;

    invoke-static {v0}, LEI6;->w(LEI6;)Lgz5;

    move-result-object v0

    invoke-virtual {v0}, Lgz5;->b()LqV5;

    move-result-object v0

    sget-object v1, Lco/bird/android/persistence/common/impl/Converters;->a:Lco/bird/android/persistence/common/impl/Converters;

    iget-object v1, p0, LEI6$o;->b:Lorg/joda/time/DateTime;

    invoke-static {v1}, Lco/bird/android/persistence/common/impl/Converters;->e(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    invoke-interface {v0, v2}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-interface {v0, v2, v1}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    iget-object v1, p0, LEI6$o;->c:LEI6;

    invoke-static {v1}, LEI6;->t(LEI6;)LEb5;

    move-result-object v1

    invoke-virtual {v1}, LEb5;->c()V

    :try_start_0
    invoke-interface {v0}, LqV5;->M()I

    iget-object v1, p0, LEI6$o;->c:LEI6;

    invoke-static {v1}, LEI6;->t(LEI6;)LEb5;

    move-result-object v1

    invoke-virtual {v1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, LEI6$o;->c:LEI6;

    invoke-static {v1}, LEI6;->t(LEI6;)LEb5;

    move-result-object v1

    invoke-virtual {v1}, LEb5;->g()V

    iget-object v1, p0, LEI6$o;->c:LEI6;

    invoke-static {v1}, LEI6;->w(LEI6;)Lgz5;

    move-result-object v1

    invoke-virtual {v1, v0}, Lgz5;->h(LqV5;)V

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v1

    iget-object v2, p0, LEI6$o;->c:LEI6;

    invoke-static {v2}, LEI6;->t(LEI6;)LEb5;

    move-result-object v2

    invoke-virtual {v2}, LEb5;->g()V

    iget-object v2, p0, LEI6$o;->c:LEI6;

    invoke-static {v2}, LEI6;->w(LEI6;)Lgz5;

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

    invoke-virtual {p0}, LEI6$o;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method