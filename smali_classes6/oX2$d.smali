.class public final LoX2$d;
.super LoX2$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LoX2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LoX2$g<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final d:LmX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LmX2<",
            "TE;>;"
        }
    .end annotation
.end field

.field public final e:LIZ3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LIZ3<",
            "-TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LmX2;LIZ3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LmX2<",
            "TE;>;",
            "LIZ3<",
            "-TE;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LoX2$g;-><init>(LnX2;)V

    invoke-static {p1}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LmX2;

    iput-object p1, p0, LoX2$d;->d:LmX2;

    invoke-static {p2}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LIZ3;

    iput-object p1, p0, LoX2$d;->e:LIZ3;

    return-void
.end method


# virtual methods
.method public A2(Ljava/lang/Object;I)I
    .locals 1

    const-string v0, "occurrences"

    invoke-static {p2, v0}, Ldm0;->b(ILjava/lang/String;)I

    if-nez p2, :cond_0

    invoke-virtual {p0, p1}, LoX2$d;->d3(Ljava/lang/Object;)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0, p1}, LY0;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LoX2$d;->d:LmX2;

    invoke-interface {v0, p1, p2}, LmX2;->A2(Ljava/lang/Object;I)I

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public H0(Ljava/lang/Object;I)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;I)I"
        }
    .end annotation

    iget-object v0, p0, LoX2$d;->e:LIZ3;

    invoke-interface {v0, p1}, LIZ3;->apply(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "Element %s does not match predicate %s"

    iget-object v2, p0, LoX2$d;->e:LIZ3;

    invoke-static {v0, v1, p1, v2}, LEZ3;->k(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, LoX2$d;->d:LmX2;

    invoke-interface {v0, p1, p2}, LmX2;->H0(Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public a()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, LoX2$d;->d:LmX2;

    invoke-interface {v0}, LmX2;->F2()Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, LoX2$d;->e:LIZ3;

    invoke-static {v0, v1}, Ldw5;->b(Ljava/util/Set;LIZ3;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "LmX2$a<",
            "TE;>;>;"
        }
    .end annotation

    iget-object v0, p0, LoX2$d;->d:LmX2;

    invoke-interface {v0}, LmX2;->entrySet()Ljava/util/Set;

    move-result-object v0

    new-instance v1, LoX2$d$a;

    invoke-direct {v1, p0}, LoX2$d$a;-><init>(LoX2$d;)V

    invoke-static {v0, v1}, Ldw5;->b(Ljava/util/Set;LIZ3;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public d3(Ljava/lang/Object;)I
    .locals 3

    iget-object v0, p0, LoX2$d;->d:LmX2;

    invoke-interface {v0, p1}, LmX2;->d3(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_1

    iget-object v2, p0, LoX2$d;->e:LIZ3;

    invoke-interface {v2, p1}, LIZ3;->apply(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    return v0

    :cond_1
    return v1
.end method

.method public e()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "should never be called"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public f()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "LmX2$a<",
            "TE;>;>;"
        }
    .end annotation

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "should never be called"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public h()Lre6;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lre6<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, LoX2$d;->d:LmX2;

    invoke-interface {v0}, LmX2;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iget-object v1, p0, LoX2$d;->e:LIZ3;

    invoke-static {v0, v1}, Lzg2;->j(Ljava/util/Iterator;LIZ3;)Lre6;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, LoX2$d;->h()Lre6;

    move-result-object v0

    return-object v0
.end method
