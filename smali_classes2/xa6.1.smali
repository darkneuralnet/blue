.class public Lxa6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVz0;
.implements LoB$b;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LoB$b;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LAy5$a;

.field public final e:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LqB;LAy5;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lxa6;->c:Ljava/util/List;

    invoke-virtual {p2}, LAy5;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lxa6;->a:Ljava/lang/String;

    invoke-virtual {p2}, LAy5;->g()Z

    move-result v0

    iput-boolean v0, p0, Lxa6;->b:Z

    invoke-virtual {p2}, LAy5;->f()LAy5$a;

    move-result-object v0

    iput-object v0, p0, Lxa6;->d:LAy5$a;

    invoke-virtual {p2}, LAy5;->e()Lqe;

    move-result-object v0

    invoke-virtual {v0}, Lqe;->a()LoB;

    move-result-object v0

    iput-object v0, p0, Lxa6;->e:LoB;

    invoke-virtual {p2}, LAy5;->b()Lqe;

    move-result-object v1

    invoke-virtual {v1}, Lqe;->a()LoB;

    move-result-object v1

    iput-object v1, p0, Lxa6;->f:LoB;

    invoke-virtual {p2}, LAy5;->d()Lqe;

    move-result-object p2

    invoke-virtual {p2}, Lqe;->a()LoB;

    move-result-object p2

    iput-object p2, p0, Lxa6;->g:LoB;

    invoke-virtual {p1, v0}, LqB;->i(LoB;)V

    invoke-virtual {p1, v1}, LqB;->i(LoB;)V

    invoke-virtual {p1, p2}, LqB;->i(LoB;)V

    invoke-virtual {v0, p0}, LoB;->a(LoB$b;)V

    invoke-virtual {v1, p0}, LoB;->a(LoB$b;)V

    invoke-virtual {p2, p0}, LoB;->a(LoB$b;)V

    return-void
.end method


# virtual methods
.method public b(LoB$b;)V
    .locals 1

    iget-object v0, p0, Lxa6;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public c()LoB;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LoB<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lxa6;->f:LoB;

    return-object v0
.end method

.method public e()V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lxa6;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lxa6;->c:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LoB$b;

    invoke-interface {v1}, LoB$b;->e()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public f(Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LVz0;",
            ">;",
            "Ljava/util/List<",
            "LVz0;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public h()LoB;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LoB<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lxa6;->g:LoB;

    return-object v0
.end method

.method public i()LoB;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LoB<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lxa6;->e:LoB;

    return-object v0
.end method

.method public j()LAy5$a;
    .locals 1

    iget-object v0, p0, Lxa6;->d:LAy5$a;

    return-object v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Lxa6;->b:Z

    return v0
.end method
