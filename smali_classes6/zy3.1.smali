.class public abstract Lzy3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/Comparator;)Lzy3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "TT;>;)",
            "Lzy3<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lzy3;

    if-eqz v0, :cond_0

    check-cast p0, Lzy3;

    goto :goto_0

    :cond_0
    new-instance v0, LSp0;

    invoke-direct {v0, p0}, LSp0;-><init>(Ljava/util/Comparator;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static c()Lzy3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C::",
            "Ljava/lang/Comparable;",
            ">()",
            "Lzy3<",
            "TC;>;"
        }
    .end annotation

    sget-object v0, LwY2;->b:LwY2;

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/Iterable;)LVY1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:TT;>(",
            "Ljava/lang/Iterable<",
            "TE;>;)",
            "LVY1<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p0, p1}, LVY1;->M(Ljava/util/Comparator;Ljava/lang/Iterable;)LVY1;

    move-result-object p1

    return-object p1
.end method

.method public abstract compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation
.end method

.method public d()Lzy3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T2:TT;>()",
            "Lzy3<",
            "Ljava/util/Map$Entry<",
            "TT2;*>;>;"
        }
    .end annotation

    invoke-static {}, LaM2;->h()LwA1;

    move-result-object v0

    invoke-virtual {p0, v0}, Lzy3;->e(LwA1;)Lzy3;

    move-result-object v0

    return-object v0
.end method

.method public e(LwA1;)Lzy3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<F:",
            "Ljava/lang/Object;",
            ">(",
            "LwA1<",
            "TF;+TT;>;)",
            "Lzy3<",
            "TF;>;"
        }
    .end annotation

    new-instance v0, Ll70;

    invoke-direct {v0, p1, p0}, Ll70;-><init>(LwA1;Lzy3;)V

    return-object v0
.end method

.method public f()Lzy3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:TT;>()",
            "Lzy3<",
            "TS;>;"
        }
    .end annotation

    new-instance v0, LzO4;

    invoke-direct {v0, p0}, LzO4;-><init>(Lzy3;)V

    return-object v0
.end method

.method public g(Ljava/lang/Iterable;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:TT;>(",
            "Ljava/lang/Iterable<",
            "TE;>;)",
            "Ljava/util/List<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p1}, Lyg2;->h(Ljava/lang/Iterable;)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, p0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LNs2;->h(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method
