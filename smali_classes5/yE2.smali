.class public LyE2;
.super LuE2;
.source "SourceFile"

# interfaces
.implements LOP2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LuE2<",
        "Lak2;",
        "LVL4<",
        "*>;>;",
        "LOP2;"
    }
.end annotation


# instance fields
.field public e:LOP2$a;


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0, p1, p2}, LuE2;-><init>(J)V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    const/16 v0, 0x28

    if-lt p1, v0, :cond_0

    invoke-virtual {p0}, LuE2;->b()V

    goto :goto_0

    :cond_0
    const/16 v0, 0x14

    if-ge p1, v0, :cond_1

    const/16 v0, 0xf

    if-ne p1, v0, :cond_2

    :cond_1
    invoke-virtual {p0}, LuE2;->h()J

    move-result-wide v0

    const-wide/16 v2, 0x2

    div-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, LuE2;->m(J)V

    :cond_2
    :goto_0
    return-void
.end method

.method public c(LOP2$a;)V
    .locals 0

    iput-object p1, p0, LyE2;->e:LOP2$a;

    return-void
.end method

.method public bridge synthetic d(Lak2;)LVL4;
    .locals 0

    invoke-super {p0, p1}, LuE2;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LVL4;

    return-object p1
.end method

.method public bridge synthetic e(Lak2;LVL4;)LVL4;
    .locals 0

    invoke-super {p0, p1, p2}, LuE2;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LVL4;

    return-object p1
.end method

.method public bridge synthetic i(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LVL4;

    invoke-virtual {p0, p1}, LyE2;->n(LVL4;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lak2;

    check-cast p2, LVL4;

    invoke-virtual {p0, p1, p2}, LyE2;->o(Lak2;LVL4;)V

    return-void
.end method

.method public n(LVL4;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVL4<",
            "*>;)I"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-super {p0, p1}, LuE2;->i(Ljava/lang/Object;)I

    move-result p1

    return p1

    :cond_0
    invoke-interface {p1}, LVL4;->a()I

    move-result p1

    return p1
.end method

.method public o(Lak2;LVL4;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lak2;",
            "LVL4<",
            "*>;)V"
        }
    .end annotation

    iget-object p1, p0, LyE2;->e:LOP2$a;

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    invoke-interface {p1, p2}, LOP2$a;->d(LVL4;)V

    :cond_0
    return-void
.end method
