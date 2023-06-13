.class public final LYk9;
.super LMk9;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LMk9;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LSk9;

    invoke-virtual {p1}, LSk9;->a()I

    move-result p1

    return p1
.end method

.method public final synthetic b(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LSk9;

    invoke-virtual {p1}, LSk9;->b()I

    move-result p1

    return p1
.end method

.method public final synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lub9;

    iget-object p1, p1, Lub9;->zzc:LSk9;

    return-object p1
.end method

.method public final bridge synthetic d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, LSk9;->c()LSk9;

    move-result-object v0

    check-cast p2, LSk9;

    invoke-virtual {p2, v0}, LSk9;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    check-cast p1, LSk9;

    invoke-static {p1, p2}, LSk9;->d(LSk9;LSk9;)LSk9;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic e()Ljava/lang/Object;
    .locals 1

    invoke-static {}, LSk9;->e()LSk9;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic f(Ljava/lang/Object;IJ)V
    .locals 0

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    check-cast p1, LSk9;

    shl-int/lit8 p2, p2, 0x3

    invoke-virtual {p1, p2, p3}, LSk9;->h(ILjava/lang/Object;)V

    return-void
.end method

.method public final g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lub9;

    iget-object p1, p1, Lub9;->zzc:LSk9;

    invoke-virtual {p1}, LSk9;->f()V

    return-void
.end method

.method public final synthetic h(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LSk9;

    check-cast p1, Lub9;

    iput-object p2, p1, Lub9;->zzc:LSk9;

    return-void
.end method

.method public final synthetic i(Ljava/lang/Object;Lh89;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, LSk9;

    invoke-virtual {p1, p2}, LSk9;->i(Lh89;)V

    return-void
.end method

.method public final synthetic j(Ljava/lang/Object;Lh89;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, LSk9;

    invoke-virtual {p1, p2}, LSk9;->j(Lh89;)V

    return-void
.end method
