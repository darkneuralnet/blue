.class public final LJZ3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJZ3$c;,
        LJZ3$d;,
        LJZ3$e;,
        LJZ3$f;,
        LJZ3$b;,
        LJZ3$g;,
        LJZ3$h;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Ljava/lang/Iterable;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, LJZ3;->j(Ljava/lang/String;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b(LIZ3;LIZ3;)LIZ3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LIZ3<",
            "-TT;>;",
            "LIZ3<",
            "-TT;>;)",
            "LIZ3<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LJZ3$b;

    invoke-static {p0}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LIZ3;

    invoke-static {p1}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LIZ3;

    invoke-static {p0, p1}, LJZ3;->c(LIZ3;LIZ3;)Ljava/util/List;

    move-result-object p0

    const/4 p1, 0x0

    invoke-direct {v0, p0, p1}, LJZ3$b;-><init>(Ljava/util/List;LJZ3$a;)V

    return-object v0
.end method

.method public static c(LIZ3;LIZ3;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LIZ3<",
            "-TT;>;",
            "LIZ3<",
            "-TT;>;)",
            "Ljava/util/List<",
            "LIZ3<",
            "-TT;>;>;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [LIZ3;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static d(LIZ3;LwA1;)LIZ3;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            ">(",
            "LIZ3<",
            "TB;>;",
            "LwA1<",
            "TA;+TB;>;)",
            "LIZ3<",
            "TA;>;"
        }
    .end annotation

    new-instance v0, LJZ3$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LJZ3$c;-><init>(LIZ3;LwA1;LJZ3$a;)V

    return-object v0
.end method

.method public static e(Ljava/lang/Object;)LIZ3;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "LIZ3<",
            "TT;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    invoke-static {}, LJZ3;->h()LIZ3;

    move-result-object p0

    goto :goto_0

    :cond_0
    new-instance v0, LJZ3$f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LJZ3$f;-><init>(Ljava/lang/Object;LJZ3$a;)V

    invoke-virtual {v0}, LJZ3$f;->a()LIZ3;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static f(Ljava/util/Collection;)LIZ3;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "+TT;>;)",
            "LIZ3<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LJZ3$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LJZ3$d;-><init>(Ljava/util/Collection;LJZ3$a;)V

    return-object v0
.end method

.method public static g(Ljava/lang/Class;)LIZ3;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "*>;)",
            "LIZ3<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LJZ3$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LJZ3$e;-><init>(Ljava/lang/Class;LJZ3$a;)V

    return-object v0
.end method

.method public static h()LIZ3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "LIZ3<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, LJZ3$h;->d:LJZ3$h;

    invoke-virtual {v0}, LJZ3$h;->b()LIZ3;

    move-result-object v0

    return-object v0
.end method

.method public static i(LIZ3;)LIZ3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LIZ3<",
            "TT;>;)",
            "LIZ3<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LJZ3$g;

    invoke-direct {v0, p0}, LJZ3$g;-><init>(LIZ3;)V

    return-object v0
.end method

.method public static j(Ljava/lang/String;Ljava/lang/Iterable;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Iterable<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Predicates."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x28

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 p1, 0x1

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    if-nez p1, :cond_0

    const/16 p1, 0x2c

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
