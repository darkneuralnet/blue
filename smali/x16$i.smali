.class public final Lx16$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ06;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx16;-><init>(LId6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\n*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0008\u0010\u0007\u001a\u00020\u0004H\u0016J\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0002H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\t\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u0006J\u0008\u0010\u000c\u001a\u00020\u0004H\u0016J\u0008\u0010\r\u001a\u00020\u0004H\u0016\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u000e"
    }
    d2 = {
        "x16$i",
        "LZ06;",
        "LCe3;",
        "point",
        "",
        "b",
        "(J)V",
        "e",
        "startPoint",
        "d",
        "delta",
        "c",
        "onStop",
        "a",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:Lx16;


# direct methods
.method public constructor <init>(Lx16;)V
    .locals 0

    iput-object p1, p0, Lx16$i;->a:Lx16;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(J)V
    .locals 0

    return-void
.end method

.method public c(J)V
    .locals 8

    iget-object v0, p0, Lx16$i;->a:Lx16;

    invoke-virtual {v0}, Lx16;->H()LF16;

    move-result-object v0

    invoke-virtual {v0}, LF16;->h()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lx16$i;->a:Lx16;

    invoke-static {v0}, Lx16;->d(Lx16;)J

    move-result-wide v2

    invoke-static {v2, v3, p1, p2}, LCe3;->t(JJ)J

    move-result-wide p1

    invoke-static {v0, p1, p2}, Lx16;->h(Lx16;J)V

    iget-object p1, p0, Lx16$i;->a:Lx16;

    invoke-virtual {p1}, Lx16;->E()LC16;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LC16;->g()Lj26;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v2, p0, Lx16$i;->a:Lx16;

    invoke-static {v2}, Lx16;->c(Lx16;)J

    move-result-wide v3

    invoke-static {v2}, Lx16;->d(Lx16;)J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, LCe3;->t(JJ)J

    move-result-wide v3

    invoke-static {v3, v4}, LCe3;->d(J)LCe3;

    move-result-object p2

    invoke-static {v2, p2}, Lx16;->e(Lx16;LCe3;)V

    invoke-static {v2}, Lx16;->b(Lx16;)Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_1

    :cond_2
    invoke-static {v2}, Lx16;->c(Lx16;)J

    move-result-wide v3

    invoke-virtual {p1, v3, v4, v1}, Lj26;->g(JZ)I

    move-result p2

    :goto_1
    move v4, p2

    invoke-virtual {v2}, Lx16;->u()LCe3;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p2}, LCe3;->x()J

    move-result-wide v5

    invoke-virtual {p1, v5, v6, v1}, Lj26;->g(JZ)I

    move-result v5

    invoke-virtual {v2}, Lx16;->H()LF16;

    move-result-object v3

    const/4 v6, 0x0

    sget-object p1, LPr5;->a:LPr5$a;

    invoke-virtual {p1}, LPr5$a;->g()LPr5;

    move-result-object v7

    invoke-static/range {v2 .. v7}, Lx16;->j(Lx16;LF16;IIZLPr5;)V

    :cond_3
    iget-object p1, p0, Lx16$i;->a:Lx16;

    invoke-virtual {p1}, Lx16;->E()LC16;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p1, v1}, LC16;->B(Z)V

    :goto_2
    return-void
.end method

.method public d(J)V
    .locals 8

    iget-object v0, p0, Lx16$i;->a:Lx16;

    invoke-virtual {v0}, Lx16;->w()LHE1;

    move-result-object v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lx16$i;->a:Lx16;

    sget-object v1, LHE1;->d:LHE1;

    invoke-static {v0, v1}, Lx16;->i(Lx16;LHE1;)V

    iget-object v0, p0, Lx16$i;->a:Lx16;

    invoke-virtual {v0}, Lx16;->J()V

    iget-object v0, p0, Lx16$i;->a:Lx16;

    invoke-virtual {v0}, Lx16;->E()LC16;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LC16;->g()Lj26;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2}, Lj26;->j(J)Z

    move-result v0

    if-ne v0, v1, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    if-nez v0, :cond_3

    iget-object v0, p0, Lx16$i;->a:Lx16;

    invoke-virtual {v0}, Lx16;->E()LC16;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LC16;->g()Lj26;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v1, p0, Lx16$i;->a:Lx16;

    invoke-virtual {v1}, Lx16;->C()LHe3;

    move-result-object v3

    invoke-static {p1, p2}, LCe3;->p(J)F

    move-result p1

    invoke-virtual {v0, p1}, Lj26;->f(F)I

    move-result p1

    const/4 p2, 0x2

    const/4 v4, 0x0

    invoke-static {v0, p1, v2, p2, v4}, Lj26;->e(Lj26;IZILjava/lang/Object;)I

    move-result p1

    invoke-interface {v3, p1}, LHe3;->transformedToOriginal(I)I

    move-result p1

    invoke-virtual {v1}, Lx16;->A()LWE1;

    move-result-object p2

    if-eqz p2, :cond_2

    sget-object v0, LXE1;->a:LXE1$a;

    invoke-virtual {v0}, LXE1$a;->b()I

    move-result v0

    invoke-interface {p2, v0}, LWE1;->a(I)V

    :cond_2
    invoke-virtual {v1}, Lx16;->H()LF16;

    move-result-object p2

    invoke-virtual {p2}, LF16;->e()LDf;

    move-result-object p2

    invoke-static {p1, p1}, Lt26;->b(II)J

    move-result-wide v2

    invoke-static {v1, p2, v2, v3}, Lx16;->a(Lx16;LDf;J)LF16;

    move-result-object p1

    invoke-virtual {v1}, Lx16;->r()V

    invoke-virtual {v1}, Lx16;->D()Lkotlin/jvm/functions/Function1;

    move-result-object p2

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_3
    iget-object v0, p0, Lx16$i;->a:Lx16;

    invoke-virtual {v0}, Lx16;->H()LF16;

    move-result-object v0

    invoke-virtual {v0}, LF16;->h()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    move v1, v2

    :goto_1
    if-eqz v1, :cond_5

    return-void

    :cond_5
    iget-object v0, p0, Lx16$i;->a:Lx16;

    invoke-virtual {v0}, Lx16;->r()V

    iget-object v0, p0, Lx16$i;->a:Lx16;

    invoke-virtual {v0}, Lx16;->E()LC16;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, LC16;->g()Lj26;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v0, p0, Lx16$i;->a:Lx16;

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-wide v2, p1

    invoke-static/range {v1 .. v6}, Lj26;->h(Lj26;JZILjava/lang/Object;)I

    move-result v1

    invoke-virtual {v0}, Lx16;->H()LF16;

    move-result-object v3

    const/4 v6, 0x0

    sget-object v2, LPr5;->a:LPr5$a;

    invoke-virtual {v2}, LPr5$a;->g()LPr5;

    move-result-object v7

    move-object v2, v0

    move v4, v1

    move v5, v1

    invoke-static/range {v2 .. v7}, Lx16;->j(Lx16;LF16;IIZLPr5;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lx16;->f(Lx16;Ljava/lang/Integer;)V

    :cond_6
    iget-object v0, p0, Lx16$i;->a:Lx16;

    invoke-static {v0, p1, p2}, Lx16;->g(Lx16;J)V

    iget-object p1, p0, Lx16$i;->a:Lx16;

    invoke-static {p1}, Lx16;->c(Lx16;)J

    move-result-wide v0

    invoke-static {v0, v1}, LCe3;->d(J)LCe3;

    move-result-object p2

    invoke-static {p1, p2}, Lx16;->e(Lx16;LCe3;)V

    iget-object p1, p0, Lx16$i;->a:Lx16;

    sget-object p2, LCe3;->b:LCe3$a;

    invoke-virtual {p2}, LCe3$a;->c()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lx16;->h(Lx16;J)V

    return-void
.end method

.method public e()V
    .locals 0

    return-void
.end method

.method public onStop()V
    .locals 3

    iget-object v0, p0, Lx16$i;->a:Lx16;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lx16;->i(Lx16;LHE1;)V

    iget-object v0, p0, Lx16$i;->a:Lx16;

    invoke-static {v0, v1}, Lx16;->e(Lx16;LCe3;)V

    iget-object v0, p0, Lx16$i;->a:Lx16;

    invoke-virtual {v0}, Lx16;->E()LC16;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, LC16;->B(Z)V

    :goto_0
    iget-object v0, p0, Lx16$i;->a:Lx16;

    invoke-virtual {v0}, Lx16;->F()LI26;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, LI26;->getStatus()LK26;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    sget-object v2, LK26;->c:LK26;

    if-ne v0, v2, :cond_2

    iget-object v0, p0, Lx16$i;->a:Lx16;

    invoke-virtual {v0}, Lx16;->a0()V

    :cond_2
    iget-object v0, p0, Lx16$i;->a:Lx16;

    invoke-static {v0, v1}, Lx16;->f(Lx16;Ljava/lang/Integer;)V

    return-void
.end method
