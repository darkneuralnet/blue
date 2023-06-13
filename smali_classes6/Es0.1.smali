.class public final LEs0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LEs0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lyb4<",
            "-TT;>;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lk01;",
            ">;"
        }
    .end annotation
.end field

.field public final d:I

.field public final e:I

.field public final f:LUs0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LUs0<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final g:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILUs0;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Lyb4<",
            "-TT;>;>;",
            "Ljava/util/Set<",
            "Lk01;",
            ">;II",
            "LUs0<",
            "TT;>;",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEs0;->a:Ljava/lang/String;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, LEs0;->b:Ljava/util/Set;

    invoke-static {p3}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, LEs0;->c:Ljava/util/Set;

    iput p4, p0, LEs0;->d:I

    iput p5, p0, LEs0;->e:I

    iput-object p6, p0, LEs0;->f:LUs0;

    invoke-static {p7}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, LEs0;->g:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILUs0;Ljava/util/Set;LEs0$a;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, LEs0;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILUs0;Ljava/util/Set;)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;LOs0;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LEs0;->q(Ljava/lang/Object;LOs0;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;LOs0;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LEs0;->r(Ljava/lang/Object;LOs0;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lyb4;)LEs0$b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lyb4<",
            "TT;>;)",
            "LEs0$b<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LEs0$b;

    const/4 v1, 0x0

    new-array v1, v1, [Lyb4;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, LEs0$b;-><init>(Lyb4;[Lyb4;LEs0$a;)V

    return-object v0
.end method

.method public static varargs d(Lyb4;[Lyb4;)LEs0$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lyb4<",
            "TT;>;[",
            "Lyb4<",
            "-TT;>;)",
            "LEs0$b<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    new-instance v0, LEs0$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LEs0$b;-><init>(Lyb4;[Lyb4;LEs0$a;)V

    return-object v0
.end method

.method public static e(Ljava/lang/Class;)LEs0$b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "LEs0$b<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LEs0$b;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, LEs0$b;-><init>(Ljava/lang/Class;[Ljava/lang/Class;LEs0$a;)V

    return-object v0
.end method

.method public static varargs f(Ljava/lang/Class;[Ljava/lang/Class;)LEs0$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Ljava/lang/Class<",
            "-TT;>;)",
            "LEs0$b<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    new-instance v0, LEs0$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LEs0$b;-><init>(Ljava/lang/Class;[Ljava/lang/Class;LEs0$a;)V

    return-object v0
.end method

.method public static l(Ljava/lang/Object;Ljava/lang/Class;)LEs0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/lang/Class<",
            "TT;>;)",
            "LEs0<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, LEs0;->m(Ljava/lang/Class;)LEs0$b;

    move-result-object p1

    new-instance v0, LDs0;

    invoke-direct {v0, p0}, LDs0;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object p0

    invoke-virtual {p0}, LEs0$b;->d()LEs0;

    move-result-object p0

    return-object p0
.end method

.method public static m(Ljava/lang/Class;)LEs0$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "LEs0$b<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0}, LEs0;->e(Ljava/lang/Class;)LEs0$b;

    move-result-object p0

    invoke-static {p0}, LEs0$b;->a(LEs0$b;)LEs0$b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Ljava/lang/Object;LOs0;)Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method public static synthetic r(Ljava/lang/Object;LOs0;)Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method public static varargs s(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)LEs0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Ljava/lang/Class<",
            "-TT;>;)",
            "LEs0<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    invoke-static {p1, p2}, LEs0;->f(Ljava/lang/Class;[Ljava/lang/Class;)LEs0$b;

    move-result-object p1

    new-instance p2, LCs0;

    invoke-direct {p2, p0}, LCs0;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object p0

    invoke-virtual {p0}, LEs0$b;->d()LEs0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public g()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lk01;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LEs0;->c:Ljava/util/Set;

    return-object v0
.end method

.method public h()LUs0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LUs0<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, LEs0;->f:LUs0;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LEs0;->a:Ljava/lang/String;

    return-object v0
.end method

.method public j()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lyb4<",
            "-TT;>;>;"
        }
    .end annotation

    iget-object v0, p0, LEs0;->b:Ljava/util/Set;

    return-object v0
.end method

.method public k()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, LEs0;->g:Ljava/util/Set;

    return-object v0
.end method

.method public n()Z
    .locals 2

    iget v0, p0, LEs0;->d:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public o()Z
    .locals 2

    iget v0, p0, LEs0;->d:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public p()Z
    .locals 1

    iget v0, p0, LEs0;->e:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public t(LUs0;)LEs0;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LUs0<",
            "TT;>;)",
            "LEs0<",
            "TT;>;"
        }
    .end annotation

    new-instance v8, LEs0;

    iget-object v1, p0, LEs0;->a:Ljava/lang/String;

    iget-object v2, p0, LEs0;->b:Ljava/util/Set;

    iget-object v3, p0, LEs0;->c:Ljava/util/Set;

    iget v4, p0, LEs0;->d:I

    iget v5, p0, LEs0;->e:I

    iget-object v7, p0, LEs0;->g:Ljava/util/Set;

    move-object v0, v8

    move-object v6, p1

    invoke-direct/range {v0 .. v7}, LEs0;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILUs0;Ljava/util/Set;)V

    return-object v8
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Component<"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LEs0;->b:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ">{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LEs0;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LEs0;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", deps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LEs0;->c:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
