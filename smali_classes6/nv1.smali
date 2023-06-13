.class public abstract Lnv1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final b:Lky3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lky3<",
            "Ljava/lang/Iterable<",
            "TE;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lky3;->a()Lky3;

    move-result-object v0

    iput-object v0, p0, Lnv1;->b:Lky3;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Iterable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "TE;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lky3;->c(Ljava/lang/Object;)Lky3;

    move-result-object p1

    iput-object p1, p0, Lnv1;->b:Lky3;

    return-void
.end method

.method public static b(Ljava/lang/Iterable;Ljava/lang/Iterable;)Lnv1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "+TT;>;",
            "Ljava/lang/Iterable<",
            "+TT;>;)",
            "Lnv1<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Iterable;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    invoke-static {v0}, Lnv1;->c([Ljava/lang/Iterable;)Lnv1;

    move-result-object p0

    return-object p0
.end method

.method public static varargs c([Ljava/lang/Iterable;)Lnv1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Iterable<",
            "+TT;>;)",
            "Lnv1<",
            "TT;>;"
        }
    .end annotation

    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p0, v1

    invoke-static {v2}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Lnv1$b;

    invoke-direct {v0, p0}, Lnv1$b;-><init>([Ljava/lang/Iterable;)V

    return-object v0
.end method

.method public static e(Ljava/lang/Iterable;)Lnv1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "TE;>;)",
            "Lnv1<",
            "TE;>;"
        }
    .end annotation

    instance-of v0, p0, Lnv1;

    if-eqz v0, :cond_0

    check-cast p0, Lnv1;

    goto :goto_0

    :cond_0
    new-instance v0, Lnv1$a;

    invoke-direct {v0, p0, p0}, Lnv1$a;-><init>(Ljava/lang/Iterable;Ljava/lang/Iterable;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static varargs h(Ljava/lang/Object;[Ljava/lang/Object;)Lnv1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;[TE;)",
            "Lnv1<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p0, p1}, LNs2;->a(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lnv1;->e(Ljava/lang/Iterable;)Lnv1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final varargs a([Ljava/lang/Object;)Lnv1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TE;)",
            "Lnv1<",
            "TE;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lnv1;->f()Ljava/lang/Iterable;

    move-result-object v0

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {v0, p1}, Lnv1;->b(Ljava/lang/Iterable;Ljava/lang/Iterable;)Lnv1;

    move-result-object p1

    return-object p1
.end method

.method public final f()Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, Lnv1;->b:Lky3;

    invoke-virtual {v0, p0}, Lky3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    return-object v0
.end method

.method public final j()LVY1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LVY1<",
            "TE;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lnv1;->f()Ljava/lang/Iterable;

    move-result-object v0

    invoke-static {v0}, LVY1;->x(Ljava/lang/Iterable;)LVY1;

    move-result-object v0

    return-object v0
.end method

.method public final o(LwA1;)Lnv1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LwA1<",
            "-TE;TT;>;)",
            "Lnv1<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lnv1;->f()Ljava/lang/Iterable;

    move-result-object v0

    invoke-static {v0, p1}, Lyg2;->j(Ljava/lang/Iterable;LwA1;)Ljava/lang/Iterable;

    move-result-object p1

    invoke-static {p1}, Lnv1;->e(Ljava/lang/Iterable;)Lnv1;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lnv1;->f()Ljava/lang/Iterable;

    move-result-object v0

    invoke-static {v0}, Lyg2;->i(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
