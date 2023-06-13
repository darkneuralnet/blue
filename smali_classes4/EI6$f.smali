.class public LEI6$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LEI6;->h(Ljava/util/List;Lorg/joda/time/DateTime;)Lio/reactivex/c;
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

.field public final synthetic c:Lorg/joda/time/DateTime;

.field public final synthetic d:LEI6;


# direct methods
.method public constructor <init>(LEI6;Ljava/util/List;Lorg/joda/time/DateTime;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LEI6$f;->d:LEI6;

    iput-object p2, p0, LEI6$f;->b:Ljava/util/List;

    iput-object p3, p0, LEI6$f;->c:Lorg/joda/time/DateTime;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static {}, LiS5;->b()Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "DELETE FROM zone_data WHERE zone_id NOT IN ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LEI6$f;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v0, v1}, LiS5;->a(Ljava/lang/StringBuilder;I)V

    const-string v2, ") AND data_updated_at < "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "?"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, LEI6$f;->d:LEI6;

    invoke-static {v2}, LEI6;->t(LEI6;)LEb5;

    move-result-object v2

    invoke-virtual {v2, v0}, LEb5;->d(Ljava/lang/String;)LqV5;

    move-result-object v0

    iget-object v2, p0, LEI6$f;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x1

    move v4, v3

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-nez v5, :cond_0

    invoke-interface {v0, v4}, LoV5;->m1(I)V

    goto :goto_1

    :cond_0
    invoke-interface {v0, v4, v5}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    add-int/2addr v1, v3

    sget-object v2, Lco/bird/android/persistence/common/impl/Converters;->a:Lco/bird/android/persistence/common/impl/Converters;

    iget-object v2, p0, LEI6$f;->c:Lorg/joda/time/DateTime;

    invoke-static {v2}, Lco/bird/android/persistence/common/impl/Converters;->e(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    invoke-interface {v0, v1}, LoV5;->m1(I)V

    goto :goto_2

    :cond_2
    invoke-interface {v0, v1, v2}, LoV5;->G0(ILjava/lang/String;)V

    :goto_2
    iget-object v1, p0, LEI6$f;->d:LEI6;

    invoke-static {v1}, LEI6;->t(LEI6;)LEb5;

    move-result-object v1

    invoke-virtual {v1}, LEb5;->c()V

    :try_start_0
    invoke-interface {v0}, LqV5;->M()I

    iget-object v0, p0, LEI6$f;->d:LEI6;

    invoke-static {v0}, LEI6;->t(LEI6;)LEb5;

    move-result-object v0

    invoke-virtual {v0}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LEI6$f;->d:LEI6;

    invoke-static {v0}, LEI6;->t(LEI6;)LEb5;

    move-result-object v0

    invoke-virtual {v0}, LEb5;->g()V

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, LEI6$f;->d:LEI6;

    invoke-static {v1}, LEI6;->t(LEI6;)LEb5;

    move-result-object v1

    invoke-virtual {v1}, LEb5;->g()V

    throw v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, LEI6$f;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
