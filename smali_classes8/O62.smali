.class public LO62;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVq5;


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z

.field public d:Z

.field public e:LyB0;

.field public f:Lsr2;

.field public g:I

.field public h:I

.field public i:I

.field public j:I


# direct methods
.method public constructor <init>(Lsr2;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LO62;->a:Z

    iput-boolean v0, p0, LO62;->b:Z

    iput-boolean v0, p0, LO62;->c:Z

    iput-boolean v0, p0, LO62;->d:Z

    const/4 v1, 0x0

    iput-object v1, p0, LO62;->e:LyB0;

    iput v0, p0, LO62;->g:I

    iput v0, p0, LO62;->h:I

    iput v0, p0, LO62;->i:I

    iput v0, p0, LO62;->j:I

    iput-object p1, p0, LO62;->f:Lsr2;

    return-void
.end method

.method public static b(II)Z
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
.method public a(Lcr5;ILcr5;I)V
    .locals 6

    if-ne p1, p3, :cond_0

    if-ne p2, p4, :cond_0

    return-void

    :cond_0
    iget v0, p0, LO62;->j:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, LO62;->j:I

    invoke-interface {p1, p2}, Lcr5;->u(I)LyB0;

    move-result-object v0

    add-int/lit8 v2, p2, 0x1

    invoke-interface {p1, v2}, Lcr5;->u(I)LyB0;

    move-result-object v2

    invoke-interface {p3, p4}, Lcr5;->u(I)LyB0;

    move-result-object v3

    add-int/lit8 v4, p4, 0x1

    invoke-interface {p3, v4}, Lcr5;->u(I)LyB0;

    move-result-object v4

    iget-object v5, p0, LO62;->f:Lsr2;

    invoke-virtual {v5, v0, v2, v3, v4}, Lsr2;->d(LyB0;LyB0;LyB0;LyB0;)V

    iget-object v0, p0, LO62;->f:Lsr2;

    invoke-virtual {v0}, Lsr2;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, LO62;->g:I

    add-int/2addr v0, v1

    iput v0, p0, LO62;->g:I

    iget-object v0, p0, LO62;->f:Lsr2;

    invoke-virtual {v0}, Lsr2;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, LO62;->h:I

    add-int/2addr v0, v1

    iput v0, p0, LO62;->h:I

    iput-boolean v1, p0, LO62;->d:Z

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, LO62;->c(Lcr5;ILcr5;I)Z

    move-result v0

    if-nez v0, :cond_2

    iput-boolean v1, p0, LO62;->a:Z

    check-cast p1, LS83;

    iget-object v0, p0, LO62;->f:Lsr2;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, p2, v2}, LS83;->d(Lsr2;II)V

    check-cast p3, LS83;

    iget-object p1, p0, LO62;->f:Lsr2;

    invoke-virtual {p3, p1, p4, v1}, LS83;->d(Lsr2;II)V

    iget-object p1, p0, LO62;->f:Lsr2;

    invoke-virtual {p1}, Lsr2;->o()Z

    move-result p1

    if-eqz p1, :cond_2

    iget p1, p0, LO62;->i:I

    add-int/2addr p1, v1

    iput p1, p0, LO62;->i:I

    iput-boolean v1, p0, LO62;->b:Z

    iput-boolean v1, p0, LO62;->c:Z

    :cond_2
    return-void
.end method

.method public final c(Lcr5;ILcr5;I)Z
    .locals 1

    if-ne p1, p3, :cond_3

    iget-object p3, p0, LO62;->f:Lsr2;

    invoke-virtual {p3}, Lsr2;->g()I

    move-result p3

    const/4 v0, 0x1

    if-ne p3, v0, :cond_3

    invoke-static {p2, p4}, LO62;->b(II)Z

    move-result p3

    if-eqz p3, :cond_0

    return v0

    :cond_0
    invoke-interface {p1}, Lcr5;->isClosed()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p1}, Lcr5;->size()I

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

.method public isDone()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
