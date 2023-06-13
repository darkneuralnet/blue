.class public final LRr9;
.super LNr9;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LNr9<",
        "LPr9;",
        "LPr9;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LNr9;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LPr9;

    invoke-virtual {p1}, LPr9;->a()I

    move-result p1

    return p1
.end method

.method public final bridge synthetic b(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LPr9;

    invoke-virtual {p1}, LPr9;->b()I

    move-result p1

    return p1
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LEm9;

    iget-object v0, p1, LEm9;->zzc:LPr9;

    invoke-static {}, LPr9;->c()LPr9;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, LPr9;->e()LPr9;

    move-result-object v0

    iput-object v0, p1, LEm9;->zzc:LPr9;

    :cond_0
    return-object v0
.end method

.method public final bridge synthetic d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEm9;

    iget-object p1, p1, LEm9;->zzc:LPr9;

    return-object p1
.end method

.method public final bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, LPr9;->c()LPr9;

    move-result-object v0

    check-cast p2, LPr9;

    invoke-virtual {p2, v0}, LPr9;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    check-cast p1, LPr9;

    invoke-static {p1, p2}, LPr9;->d(LPr9;LPr9;)LPr9;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-static {}, LPr9;->e()LPr9;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LPr9;

    invoke-virtual {p1}, LPr9;->f()V

    return-object p1
.end method

.method public final bridge synthetic h(Ljava/lang/Object;II)V
    .locals 0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    check-cast p1, LPr9;

    shl-int/lit8 p2, p2, 0x3

    or-int/lit8 p2, p2, 0x5

    invoke-virtual {p1, p2, p3}, LPr9;->h(ILjava/lang/Object;)V

    return-void
.end method

.method public final bridge synthetic i(Ljava/lang/Object;IJ)V
    .locals 0

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    check-cast p1, LPr9;

    shl-int/lit8 p2, p2, 0x3

    or-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2, p3}, LPr9;->h(ILjava/lang/Object;)V

    return-void
.end method

.method public final bridge synthetic j(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    check-cast p1, LPr9;

    shl-int/lit8 p2, p2, 0x3

    or-int/lit8 p2, p2, 0x3

    invoke-virtual {p1, p2, p3}, LPr9;->h(ILjava/lang/Object;)V

    return-void
.end method

.method public final bridge synthetic k(Ljava/lang/Object;ILnh9;)V
    .locals 0

    check-cast p1, LPr9;

    shl-int/lit8 p2, p2, 0x3

    or-int/lit8 p2, p2, 0x2

    invoke-virtual {p1, p2, p3}, LPr9;->h(ILjava/lang/Object;)V

    return-void
.end method

.method public final bridge synthetic l(Ljava/lang/Object;IJ)V
    .locals 0

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    check-cast p1, LPr9;

    shl-int/lit8 p2, p2, 0x3

    invoke-virtual {p1, p2, p3}, LPr9;->h(ILjava/lang/Object;)V

    return-void
.end method

.method public final m(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LEm9;

    iget-object p1, p1, LEm9;->zzc:LPr9;

    invoke-virtual {p1}, LPr9;->f()V

    return-void
.end method

.method public final bridge synthetic n(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LEm9;

    check-cast p2, LPr9;

    iput-object p2, p1, LEm9;->zzc:LPr9;

    return-void
.end method

.method public final bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LPr9;

    check-cast p1, LEm9;

    iput-object p2, p1, LEm9;->zzc:LPr9;

    return-void
.end method

.method public final bridge synthetic p(Ljava/lang/Object;LVs9;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, LPr9;

    invoke-virtual {p1, p2}, LPr9;->i(LVs9;)V

    return-void
.end method

.method public final r(Lwq9;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
