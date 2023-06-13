.class public final LAG6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LzG6;


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "LyG6;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lgz5;

.field public final d:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAG6;->a:LEb5;

    new-instance v0, LAG6$a;

    invoke-direct {v0, p0, p1}, LAG6$a;-><init>(LAG6;LEb5;)V

    iput-object v0, p0, LAG6;->b:Lcf1;

    new-instance v0, LAG6$b;

    invoke-direct {v0, p0, p1}, LAG6$b;-><init>(LAG6;LEb5;)V

    iput-object v0, p0, LAG6;->c:Lgz5;

    new-instance v0, LAG6$c;

    invoke-direct {v0, p0, p1}, LAG6$c;-><init>(LAG6;LEb5;)V

    iput-object v0, p0, LAG6;->d:Lgz5;

    return-void
.end method

.method public static b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, LAG6;->a:LEb5;

    invoke-virtual {v0}, LEb5;->b()V

    iget-object v0, p0, LAG6;->d:Lgz5;

    invoke-virtual {v0}, Lgz5;->b()LqV5;

    move-result-object v0

    iget-object v1, p0, LAG6;->a:LEb5;

    invoke-virtual {v1}, LEb5;->c()V

    :try_start_0
    invoke-interface {v0}, LqV5;->M()I

    iget-object v1, p0, LAG6;->a:LEb5;

    invoke-virtual {v1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, LAG6;->a:LEb5;

    invoke-virtual {v1}, LEb5;->g()V

    iget-object v1, p0, LAG6;->d:Lgz5;

    invoke-virtual {v1, v0}, Lgz5;->h(LqV5;)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, LAG6;->a:LEb5;

    invoke-virtual {v2}, LEb5;->g()V

    iget-object v2, p0, LAG6;->d:Lgz5;

    invoke-virtual {v2, v0}, Lgz5;->h(LqV5;)V

    throw v1
.end method

.method public delete(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, LAG6;->a:LEb5;

    invoke-virtual {v0}, LEb5;->b()V

    iget-object v0, p0, LAG6;->c:Lgz5;

    invoke-virtual {v0}, Lgz5;->b()LqV5;

    move-result-object v0

    const/4 v1, 0x1

    if-nez p1, :cond_0

    invoke-interface {v0, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-interface {v0, v1, p1}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, LAG6;->a:LEb5;

    invoke-virtual {p1}, LEb5;->c()V

    :try_start_0
    invoke-interface {v0}, LqV5;->M()I

    iget-object p1, p0, LAG6;->a:LEb5;

    invoke-virtual {p1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LAG6;->a:LEb5;

    invoke-virtual {p1}, LEb5;->g()V

    iget-object p1, p0, LAG6;->c:Lgz5;

    invoke-virtual {p1, v0}, Lgz5;->h(LqV5;)V

    return-void

    :catchall_0
    move-exception p1

    iget-object v1, p0, LAG6;->a:LEb5;

    invoke-virtual {v1}, LEb5;->g()V

    iget-object v1, p0, LAG6;->c:Lgz5;

    invoke-virtual {v1, v0}, Lgz5;->h(LqV5;)V

    throw p1
.end method
