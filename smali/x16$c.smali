.class public final Lx16$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LgW2;


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
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001d\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\u0006J%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ%\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000c\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u000e"
    }
    d2 = {
        "x16$c",
        "LgW2;",
        "LCe3;",
        "downPosition",
        "",
        "d",
        "(J)Z",
        "dragPosition",
        "c",
        "LPr5;",
        "adjustment",
        "a",
        "(JLPr5;)Z",
        "b",
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

    iput-object p1, p0, Lx16$c;->a:Lx16;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(JLPr5;)Z
    .locals 8

    const-string v0, "adjustment"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx16$c;->a:Lx16;

    invoke-virtual {v0}, Lx16;->y()Landroidx/compose/ui/focus/h;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/focus/h;->e()V

    :cond_0
    iget-object v0, p0, Lx16$c;->a:Lx16;

    invoke-static {v0, p1, p2}, Lx16;->g(Lx16;J)V

    iget-object v0, p0, Lx16$c;->a:Lx16;

    invoke-virtual {v0}, Lx16;->E()LC16;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LC16;->g()Lj26;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v7, p0, Lx16$c;->a:Lx16;

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v1, v0

    move-wide v2, p1

    invoke-static/range {v1 .. v6}, Lj26;->h(Lj26;JZILjava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v7, p1}, Lx16;->f(Lx16;Ljava/lang/Integer;)V

    invoke-static {v7}, Lx16;->c(Lx16;)J

    move-result-wide v2

    invoke-static/range {v1 .. v6}, Lj26;->h(Lj26;JZILjava/lang/Object;)I

    move-result v4

    invoke-virtual {v7}, Lx16;->H()LF16;

    move-result-object v2

    const/4 v5, 0x0

    move-object v1, v7

    move v3, v4

    move-object v6, p3

    invoke-static/range {v1 .. v6}, Lx16;->j(Lx16;LF16;IIZLPr5;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public b(JLPr5;)Z
    .locals 9

    const-string v0, "adjustment"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx16$c;->a:Lx16;

    invoke-virtual {v0}, Lx16;->H()LF16;

    move-result-object v0

    invoke-virtual {v0}, LF16;->h()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_1

    return v2

    :cond_1
    iget-object v0, p0, Lx16$c;->a:Lx16;

    invoke-virtual {v0}, Lx16;->E()LC16;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LC16;->g()Lj26;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v3, p0, Lx16$c;->a:Lx16;

    invoke-virtual {v0, p1, p2, v2}, Lj26;->g(JZ)I

    move-result v6

    invoke-virtual {v3}, Lx16;->H()LF16;

    move-result-object v4

    invoke-static {v3}, Lx16;->b(Lx16;)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v7, 0x0

    move-object v8, p3

    invoke-static/range {v3 .. v8}, Lx16;->j(Lx16;LF16;IIZLPr5;)V

    return v1

    :cond_2
    return v2
.end method

.method public c(J)Z
    .locals 9

    iget-object v0, p0, Lx16$c;->a:Lx16;

    invoke-virtual {v0}, Lx16;->H()LF16;

    move-result-object v0

    invoke-virtual {v0}, LF16;->h()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_1

    return v2

    :cond_1
    iget-object v0, p0, Lx16$c;->a:Lx16;

    invoke-virtual {v0}, Lx16;->E()LC16;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LC16;->g()Lj26;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v3, p0, Lx16$c;->a:Lx16;

    invoke-virtual {v3}, Lx16;->C()LHe3;

    move-result-object v4

    invoke-virtual {v3}, Lx16;->H()LF16;

    move-result-object v5

    invoke-virtual {v5}, LF16;->g()J

    move-result-wide v5

    invoke-static {v5, v6}, Ls26;->n(J)I

    move-result v5

    invoke-interface {v4, v5}, LHe3;->originalToTransformed(I)I

    move-result v5

    invoke-virtual {v0, p1, p2, v2}, Lj26;->g(JZ)I

    move-result v6

    invoke-virtual {v3}, Lx16;->H()LF16;

    move-result-object v4

    const/4 v7, 0x0

    sget-object p1, LPr5;->a:LPr5$a;

    invoke-virtual {p1}, LPr5$a;->e()LPr5;

    move-result-object v8

    invoke-static/range {v3 .. v8}, Lx16;->j(Lx16;LF16;IIZLPr5;)V

    return v1

    :cond_2
    return v2
.end method

.method public d(J)Z
    .locals 8

    iget-object v0, p0, Lx16$c;->a:Lx16;

    invoke-virtual {v0}, Lx16;->E()LC16;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LC16;->g()Lj26;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lx16$c;->a:Lx16;

    invoke-virtual {v0}, Lx16;->C()LHe3;

    move-result-object v2

    invoke-virtual {v0}, Lx16;->H()LF16;

    move-result-object v3

    invoke-virtual {v3}, LF16;->g()J

    move-result-wide v3

    invoke-static {v3, v4}, Ls26;->n(J)I

    move-result v3

    invoke-interface {v2, v3}, LHe3;->originalToTransformed(I)I

    move-result v7

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-wide v2, p1

    invoke-static/range {v1 .. v6}, Lj26;->h(Lj26;JZILjava/lang/Object;)I

    move-result v5

    invoke-virtual {v0}, Lx16;->H()LF16;

    move-result-object v3

    const/4 v6, 0x0

    sget-object p1, LPr5;->a:LPr5$a;

    invoke-virtual {p1}, LPr5$a;->e()LPr5;

    move-result-object p1

    move-object v2, v0

    move v4, v7

    move-object v7, p1

    invoke-static/range {v2 .. v7}, Lx16;->j(Lx16;LF16;IIZLPr5;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
