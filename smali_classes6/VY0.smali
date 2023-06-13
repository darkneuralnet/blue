.class public LVY0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhg6;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:LRC1;


# direct methods
.method public constructor <init>(Ljava/util/Set;LRC1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ltq2;",
            ">;",
            "LRC1;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LVY0;->e(Ljava/util/Set;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LVY0;->a:Ljava/lang/String;

    iput-object p2, p0, LVY0;->b:LRC1;

    return-void
.end method

.method public static synthetic b(LOs0;)Lhg6;
    .locals 0

    invoke-static {p0}, LVY0;->d(LOs0;)Lhg6;

    move-result-object p0

    return-object p0
.end method

.method public static c()LEs0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEs0<",
            "Lhg6;",
            ">;"
        }
    .end annotation

    const-class v0, Lhg6;

    invoke-static {v0}, LEs0;->e(Ljava/lang/Class;)LEs0$b;

    move-result-object v0

    const-class v1, Ltq2;

    invoke-static {v1}, Lk01;->m(Ljava/lang/Class;)Lk01;

    move-result-object v1

    invoke-virtual {v0, v1}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v0

    new-instance v1, LUY0;

    invoke-direct {v1}, LUY0;-><init>()V

    invoke-virtual {v0, v1}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object v0

    invoke-virtual {v0}, LEs0$b;->d()LEs0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(LOs0;)Lhg6;
    .locals 2

    new-instance v0, LVY0;

    const-class v1, Ltq2;

    invoke-interface {p0, v1}, LOs0;->b(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object p0

    invoke-static {}, LRC1;->a()LRC1;

    move-result-object v1

    invoke-direct {v0, p0, v1}, LVY0;-><init>(Ljava/util/Set;LRC1;)V

    return-object v0
.end method

.method public static e(Ljava/util/Set;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ltq2;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltq2;

    invoke-virtual {v1}, Ltq2;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2f

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ltq2;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LVY0;->b:LRC1;

    invoke-virtual {v0}, LRC1;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LVY0;->a:Ljava/lang/String;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LVY0;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, LVY0;->b:LRC1;

    invoke-virtual {v1}, LRC1;->b()Ljava/util/Set;

    move-result-object v1

    invoke-static {v1}, LVY0;->e(Ljava/util/Set;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
