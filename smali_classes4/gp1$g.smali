.class public Lgp1$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgp1;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lio/reactivex/c;
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

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lgp1;


# direct methods
.method public constructor <init>(Lgp1;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lgp1$g;->f:Lgp1;

    iput-object p2, p0, Lgp1$g;->b:Ljava/util/List;

    iput-object p3, p0, Lgp1$g;->c:Ljava/util/List;

    iput-object p4, p0, Lgp1$g;->d:Ljava/lang/String;

    iput-object p5, p0, Lgp1$g;->e:Ljava/lang/String;

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

    const-string v1, "DELETE FROM fleet_list_vehicle WHERE list = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " AND fleet_id = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " AND (vehicle_id NOT IN ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lgp1$g;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v0, v1}, LiS5;->a(Ljava/lang/StringBuilder;I)V

    const-string v2, ") OR section NOT IN ("

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lgp1$g;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v0, v2}, LiS5;->a(Ljava/lang/StringBuilder;I)V

    const-string v2, "))"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lgp1$g;->f:Lgp1;

    invoke-static {v2}, Lgp1;->f(Lgp1;)LEb5;

    move-result-object v2

    invoke-virtual {v2, v0}, LEb5;->d(Ljava/lang/String;)LqV5;

    move-result-object v0

    iget-object v2, p0, Lgp1$g;->d:Ljava/lang/String;

    const/4 v3, 0x1

    if-nez v2, :cond_0

    invoke-interface {v0, v3}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-interface {v0, v3, v2}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    iget-object v2, p0, Lgp1$g;->e:Ljava/lang/String;

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-interface {v0, v3}, LoV5;->m1(I)V

    goto :goto_1

    :cond_1
    invoke-interface {v0, v3, v2}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1
    iget-object v2, p0, Lgp1$g;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x3

    move v4, v3

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-nez v5, :cond_2

    invoke-interface {v0, v4}, LoV5;->m1(I)V

    goto :goto_3

    :cond_2
    invoke-interface {v0, v4, v5}, LoV5;->G0(ILjava/lang/String;)V

    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_3
    add-int/2addr v1, v3

    iget-object v2, p0, Lgp1$g;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_4

    invoke-interface {v0, v1}, LoV5;->m1(I)V

    goto :goto_5

    :cond_4
    invoke-interface {v0, v1, v3}, LoV5;->G0(ILjava/lang/String;)V

    :goto_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_5
    iget-object v1, p0, Lgp1$g;->f:Lgp1;

    invoke-static {v1}, Lgp1;->f(Lgp1;)LEb5;

    move-result-object v1

    invoke-virtual {v1}, LEb5;->c()V

    :try_start_0
    invoke-interface {v0}, LqV5;->M()I

    iget-object v0, p0, Lgp1$g;->f:Lgp1;

    invoke-static {v0}, Lgp1;->f(Lgp1;)LEb5;

    move-result-object v0

    invoke-virtual {v0}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lgp1$g;->f:Lgp1;

    invoke-static {v0}, Lgp1;->f(Lgp1;)LEb5;

    move-result-object v0

    invoke-virtual {v0}, LEb5;->g()V

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lgp1$g;->f:Lgp1;

    invoke-static {v1}, Lgp1;->f(Lgp1;)LEb5;

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

    invoke-virtual {p0}, Lgp1$g;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
