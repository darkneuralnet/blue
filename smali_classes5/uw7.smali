.class public final Luw7;
.super Lsw7;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lsw7;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ltw7;

    invoke-virtual {p1}, Ltw7;->a()I

    move-result p1

    return p1
.end method

.method public final synthetic b(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ltw7;

    invoke-virtual {p1}, Ltw7;->b()I

    move-result p1

    return p1
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Leu7;

    iget-object v0, p1, Leu7;->zzc:Ltw7;

    invoke-static {}, Ltw7;->c()Ltw7;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Ltw7;->e()Ltw7;

    move-result-object v0

    iput-object v0, p1, Leu7;->zzc:Ltw7;

    :cond_0
    return-object v0
.end method

.method public final synthetic d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Leu7;

    iget-object p1, p1, Leu7;->zzc:Ltw7;

    return-object p1
.end method

.method public final bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Ltw7;->c()Ltw7;

    move-result-object v0

    check-cast p2, Ltw7;

    invoke-virtual {p2, v0}, Ltw7;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    check-cast p1, Ltw7;

    invoke-static {p1, p2}, Ltw7;->d(Ltw7;Ltw7;)Ltw7;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Ltw7;->e()Ltw7;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    move-object v0, p1

    check-cast v0, Ltw7;

    invoke-virtual {v0}, Ltw7;->f()V

    return-object p1
.end method

.method public final bridge synthetic h(Ljava/lang/Object;II)V
    .locals 0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    check-cast p1, Ltw7;

    shl-int/lit8 p2, p2, 0x3

    or-int/lit8 p2, p2, 0x5

    invoke-virtual {p1, p2, p3}, Ltw7;->h(ILjava/lang/Object;)V

    return-void
.end method

.method public final bridge synthetic i(Ljava/lang/Object;IJ)V
    .locals 0

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    check-cast p1, Ltw7;

    shl-int/lit8 p2, p2, 0x3

    or-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2, p3}, Ltw7;->h(ILjava/lang/Object;)V

    return-void
.end method

.method public final bridge synthetic j(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    check-cast p1, Ltw7;

    shl-int/lit8 p2, p2, 0x3

    or-int/lit8 p2, p2, 0x3

    invoke-virtual {p1, p2, p3}, Ltw7;->h(ILjava/lang/Object;)V

    return-void
.end method

.method public final bridge synthetic k(Ljava/lang/Object;ILkt7;)V
    .locals 0

    check-cast p1, Ltw7;

    shl-int/lit8 p2, p2, 0x3

    or-int/lit8 p2, p2, 0x2

    invoke-virtual {p1, p2, p3}, Ltw7;->h(ILjava/lang/Object;)V

    return-void
.end method

.method public final bridge synthetic l(Ljava/lang/Object;IJ)V
    .locals 0

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    check-cast p1, Ltw7;

    shl-int/lit8 p2, p2, 0x3

    invoke-virtual {p1, p2, p3}, Ltw7;->h(ILjava/lang/Object;)V

    return-void
.end method

.method public final m(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Leu7;

    iget-object p1, p1, Leu7;->zzc:Ltw7;

    invoke-virtual {p1}, Ltw7;->f()V

    return-void
.end method

.method public final synthetic n(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Leu7;

    check-cast p2, Ltw7;

    iput-object p2, p1, Leu7;->zzc:Ltw7;

    return-void
.end method

.method public final synthetic o(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ltw7;

    check-cast p1, Leu7;

    iput-object p2, p1, Leu7;->zzc:Ltw7;

    return-void
.end method

.method public final synthetic p(Ljava/lang/Object;LKw7;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, Ltw7;

    invoke-virtual {p1, p2}, Ltw7;->i(LKw7;)V

    return-void
.end method

.method public final synthetic q(Ljava/lang/Object;LKw7;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, Ltw7;

    invoke-virtual {p1, p2}, Ltw7;->j(LKw7;)V

    return-void
.end method

.method public final s(LIv7;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
