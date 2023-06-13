.class public LWq5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z

.field public d:LyB0;

.field public e:Lsr2;

.field public f:Z

.field public g:Z

.field public h:I

.field public i:I

.field public j:[Ljava/util/Collection;


# direct methods
.method public constructor <init>(Lsr2;ZZ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LWq5;->a:Z

    iput-boolean v0, p0, LWq5;->b:Z

    iput-boolean v0, p0, LWq5;->c:Z

    const/4 v1, 0x0

    iput-object v1, p0, LWq5;->d:LyB0;

    iput v0, p0, LWq5;->h:I

    iput v0, p0, LWq5;->i:I

    iput-object p1, p0, LWq5;->e:Lsr2;

    iput-boolean p2, p0, LWq5;->f:Z

    iput-boolean p3, p0, LWq5;->g:Z

    return-void
.end method

.method public static d(II)Z
    .locals 0

    sub-int/2addr p0, p1

    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    move-result p0

    const/4 p1, 0x1

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public a(Lq91;ILq91;I)V
    .locals 6

    if-ne p1, p3, :cond_0

    if-ne p2, p4, :cond_0

    return-void

    :cond_0
    iget v0, p0, LWq5;->i:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, LWq5;->i:I

    invoke-virtual {p1, p2}, Lq91;->m(I)LyB0;

    move-result-object v0

    add-int/lit8 v2, p2, 0x1

    invoke-virtual {p1, v2}, Lq91;->m(I)LyB0;

    move-result-object v2

    invoke-virtual {p3, p4}, Lq91;->m(I)LyB0;

    move-result-object v3

    add-int/lit8 v4, p4, 0x1

    invoke-virtual {p3, v4}, Lq91;->m(I)LyB0;

    move-result-object v4

    iget-object v5, p0, LWq5;->e:Lsr2;

    invoke-virtual {v5, v0, v2, v3, v4}, Lsr2;->d(LyB0;LyB0;LyB0;LyB0;)V

    iget-object v0, p0, LWq5;->e:Lsr2;

    invoke-virtual {v0}, Lsr2;->i()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-boolean v0, p0, LWq5;->g:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1, v2}, Lq91;->w(Z)V

    invoke-virtual {p3, v2}, Lq91;->w(Z)V

    :cond_1
    iget v0, p0, LWq5;->h:I

    add-int/2addr v0, v1

    iput v0, p0, LWq5;->h:I

    invoke-virtual {p0, p1, p2, p3, p4}, LWq5;->h(Lq91;ILq91;I)Z

    move-result v0

    if-nez v0, :cond_6

    iput-boolean v1, p0, LWq5;->a:Z

    iget-object v0, p0, LWq5;->e:Lsr2;

    iget-object v3, p0, LWq5;->j:[Ljava/util/Collection;

    invoke-virtual {p0, v0, v3}, LWq5;->e(Lsr2;[Ljava/util/Collection;)Z

    move-result v0

    iget-object v3, p0, LWq5;->e:Lsr2;

    invoke-virtual {v3}, Lsr2;->o()Z

    move-result v3

    if-eqz v3, :cond_3

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    move v3, v2

    goto :goto_1

    :cond_3
    :goto_0
    move v3, v1

    :goto_1
    iget-boolean v4, p0, LWq5;->f:Z

    if-nez v4, :cond_4

    if-eqz v3, :cond_5

    :cond_4
    iget-object v3, p0, LWq5;->e:Lsr2;

    invoke-virtual {p1, v3, p2, v2}, Lq91;->j(Lsr2;II)V

    iget-object p1, p0, LWq5;->e:Lsr2;

    invoke-virtual {p3, p1, p4, v1}, Lq91;->j(Lsr2;II)V

    :cond_5
    iget-object p1, p0, LWq5;->e:Lsr2;

    invoke-virtual {p1}, Lsr2;->o()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, LWq5;->e:Lsr2;

    invoke-virtual {p1, v2}, Lsr2;->f(I)LyB0;

    move-result-object p1

    invoke-virtual {p1}, LyB0;->e()LyB0;

    move-result-object p1

    iput-object p1, p0, LWq5;->d:LyB0;

    iput-boolean v1, p0, LWq5;->b:Z

    if-nez v0, :cond_6

    iput-boolean v1, p0, LWq5;->c:Z

    :cond_6
    return-void
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, LWq5;->c:Z

    return v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, LWq5;->b:Z

    return v0
.end method

.method public final e(Lsr2;[Ljava/util/Collection;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return v0

    :cond_0
    aget-object v1, p2, v0

    invoke-virtual {p0, p1, v1}, LWq5;->f(Lsr2;Ljava/util/Collection;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    return v2

    :cond_1
    aget-object p2, p2, v2

    invoke-virtual {p0, p1, p2}, LWq5;->f(Lsr2;Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final f(Lsr2;Ljava/util/Collection;)Z
    .locals 1

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD83;

    invoke-virtual {v0}, LD83;->j()LyB0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lsr2;->n(LyB0;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public g()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final h(Lq91;ILq91;I)Z
    .locals 1

    if-ne p1, p3, :cond_3

    iget-object p3, p0, LWq5;->e:Lsr2;

    invoke-virtual {p3}, Lsr2;->g()I

    move-result p3

    const/4 v0, 0x1

    if-ne p3, v0, :cond_3

    invoke-static {p2, p4}, LWq5;->d(II)Z

    move-result p3

    if-eqz p3, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Lq91;->s()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-virtual {p1}, Lq91;->r()I

    move-result p1

    sub-int/2addr p1, v0

    if-nez p2, :cond_1

    if-eq p4, p1, :cond_2

    :cond_1
    if-nez p4, :cond_3

    if-ne p2, p1, :cond_3

    :cond_2
    return v0

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public i(Ljava/util/Collection;Ljava/util/Collection;)V
    .locals 2

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/util/Collection;

    iput-object v0, p0, LWq5;->j:[Ljava/util/Collection;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    aput-object p2, v0, p1

    return-void
.end method
