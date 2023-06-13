.class public final Lx16$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ06;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx16;->n()LZ06;
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
        "x16$a",
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

    iput-object p1, p0, Lx16$a;->a:Lx16;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(J)V
    .locals 2

    iget-object p1, p0, Lx16$a;->a:Lx16;

    sget-object p2, LHE1;->b:LHE1;

    invoke-static {p1, p2}, Lx16;->i(Lx16;LHE1;)V

    iget-object p1, p0, Lx16$a;->a:Lx16;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lx16;->z(Z)J

    move-result-wide v0

    invoke-static {v0, v1}, LSr5;->a(J)J

    move-result-wide v0

    invoke-static {v0, v1}, LCe3;->d(J)LCe3;

    move-result-object p2

    invoke-static {p1, p2}, Lx16;->e(Lx16;LCe3;)V

    return-void
.end method

.method public c(J)V
    .locals 4

    iget-object v0, p0, Lx16$a;->a:Lx16;

    invoke-static {v0}, Lx16;->d(Lx16;)J

    move-result-wide v1

    invoke-static {v1, v2, p1, p2}, LCe3;->t(JJ)J

    move-result-wide p1

    invoke-static {v0, p1, p2}, Lx16;->h(Lx16;J)V

    iget-object p1, p0, Lx16$a;->a:Lx16;

    invoke-virtual {p1}, Lx16;->E()LC16;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, LC16;->g()Lj26;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lj26;->i()Li26;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p2, p0, Lx16$a;->a:Lx16;

    invoke-static {p2}, Lx16;->c(Lx16;)J

    move-result-wide v0

    invoke-static {p2}, Lx16;->d(Lx16;)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LCe3;->t(JJ)J

    move-result-wide v0

    invoke-static {v0, v1}, LCe3;->d(J)LCe3;

    move-result-object v0

    invoke-static {p2, v0}, Lx16;->e(Lx16;LCe3;)V

    invoke-virtual {p2}, Lx16;->C()LHe3;

    move-result-object v0

    invoke-virtual {p2}, Lx16;->u()LCe3;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, LCe3;->x()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Li26;->w(J)I

    move-result p1

    invoke-interface {v0, p1}, LHe3;->transformedToOriginal(I)I

    move-result p1

    invoke-static {p1, p1}, Lt26;->b(II)J

    move-result-wide v0

    invoke-virtual {p2}, Lx16;->H()LF16;

    move-result-object p1

    invoke-virtual {p1}, LF16;->g()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ls26;->g(JJ)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Lx16;->A()LWE1;

    move-result-object p1

    if-eqz p1, :cond_1

    sget-object v2, LXE1;->a:LXE1$a;

    invoke-virtual {v2}, LXE1$a;->b()I

    move-result v2

    invoke-interface {p1, v2}, LWE1;->a(I)V

    :cond_1
    invoke-virtual {p2}, Lx16;->D()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    invoke-virtual {p2}, Lx16;->H()LF16;

    move-result-object v2

    invoke-virtual {v2}, LF16;->e()LDf;

    move-result-object v2

    invoke-static {p2, v2, v0, v1}, Lx16;->a(Lx16;LDf;J)LF16;

    move-result-object p2

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public d(J)V
    .locals 2

    iget-object p1, p0, Lx16$a;->a:Lx16;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lx16;->z(Z)J

    move-result-wide v0

    invoke-static {v0, v1}, LSr5;->a(J)J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lx16;->g(Lx16;J)V

    iget-object p1, p0, Lx16$a;->a:Lx16;

    invoke-static {p1}, Lx16;->c(Lx16;)J

    move-result-wide v0

    invoke-static {v0, v1}, LCe3;->d(J)LCe3;

    move-result-object p2

    invoke-static {p1, p2}, Lx16;->e(Lx16;LCe3;)V

    iget-object p1, p0, Lx16$a;->a:Lx16;

    sget-object p2, LCe3;->b:LCe3$a;

    invoke-virtual {p2}, LCe3$a;->c()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lx16;->h(Lx16;J)V

    iget-object p1, p0, Lx16$a;->a:Lx16;

    sget-object p2, LHE1;->b:LHE1;

    invoke-static {p1, p2}, Lx16;->i(Lx16;LHE1;)V

    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lx16$a;->a:Lx16;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lx16;->i(Lx16;LHE1;)V

    iget-object v0, p0, Lx16$a;->a:Lx16;

    invoke-static {v0, v1}, Lx16;->e(Lx16;LCe3;)V

    return-void
.end method

.method public onStop()V
    .locals 2

    iget-object v0, p0, Lx16$a;->a:Lx16;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lx16;->i(Lx16;LHE1;)V

    iget-object v0, p0, Lx16$a;->a:Lx16;

    invoke-static {v0, v1}, Lx16;->e(Lx16;LCe3;)V

    return-void
.end method
