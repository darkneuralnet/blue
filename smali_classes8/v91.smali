.class public Lv91;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public b:Lq91;

.field public c:LSl2;

.field public d:LD83;

.field public e:LyB0;

.field public f:LyB0;

.field public g:D

.field public h:D

.field public i:I


# direct methods
.method public constructor <init>(Lq91;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv91;->b:Lq91;

    return-void
.end method

.method public constructor <init>(Lq91;LyB0;LyB0;LSl2;)V
    .locals 0

    invoke-direct {p0, p1}, Lv91;-><init>(Lq91;)V

    invoke-virtual {p0, p2, p3}, Lv91;->h(LyB0;LyB0;)V

    iput-object p4, p0, Lv91;->c:LSl2;

    return-void
.end method


# virtual methods
.method public a(Lv91;)I
    .locals 4

    iget-wide v0, p0, Lv91;->g:D

    iget-wide v2, p1, Lv91;->g:D

    cmpl-double v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, Lv91;->h:D

    iget-wide v2, p1, Lv91;->h:D

    cmpl-double v0, v0, v2

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget v0, p0, Lv91;->i:I

    iget v1, p1, Lv91;->i:I

    if-le v0, v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    if-ge v0, v1, :cond_2

    const/4 p1, -0x1

    return p1

    :cond_2
    iget-object v0, p1, Lv91;->e:LyB0;

    iget-object p1, p1, Lv91;->f:LyB0;

    iget-object v1, p0, Lv91;->f:LyB0;

    invoke-static {v0, p1, v1}, LDy3;->a(LyB0;LyB0;LyB0;)I

    move-result p1

    return p1
.end method

.method public b(Lu00;)V
    .locals 0

    return-void
.end method

.method public c()LyB0;
    .locals 1

    iget-object v0, p0, Lv91;->e:LyB0;

    return-object v0
.end method

.method public compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lv91;

    invoke-virtual {p0, p1}, Lv91;->a(Lv91;)I

    move-result p1

    return p1
.end method

.method public d()LyB0;
    .locals 1

    iget-object v0, p0, Lv91;->f:LyB0;

    return-object v0
.end method

.method public e()Lq91;
    .locals 1

    iget-object v0, p0, Lv91;->b:Lq91;

    return-object v0
.end method

.method public f()LSl2;
    .locals 1

    iget-object v0, p0, Lv91;->c:LSl2;

    return-object v0
.end method

.method public g()LD83;
    .locals 1

    iget-object v0, p0, Lv91;->d:LD83;

    return-object v0
.end method

.method public h(LyB0;LyB0;)V
    .locals 4

    iput-object p1, p0, Lv91;->e:LyB0;

    iput-object p2, p0, Lv91;->f:LyB0;

    iget-wide v0, p2, LyB0;->b:D

    iget-wide v2, p1, LyB0;->b:D

    sub-double/2addr v0, v2

    iput-wide v0, p0, Lv91;->g:D

    iget-wide v2, p2, LyB0;->c:D

    iget-wide p1, p1, LyB0;->c:D

    sub-double/2addr v2, p1

    iput-wide v2, p0, Lv91;->h:D

    invoke-static {v0, v1, v2, v3}, Lxb4;->a(DD)I

    move-result p1

    iput p1, p0, Lv91;->i:I

    iget-wide p1, p0, Lv91;->g:D

    const-wide/16 v0, 0x0

    cmpl-double p1, p1, v0

    if-nez p1, :cond_1

    iget-wide p1, p0, Lv91;->h:D

    cmpl-double p1, p1, v0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    const-string p2, "EdgeEnd with identical endpoints found"

    invoke-static {p1, p2}, LKo;->d(ZLjava/lang/String;)V

    return-void
.end method

.method public i(LD83;)V
    .locals 0

    iput-object p1, p0, Lv91;->d:LD83;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-wide v0, p0, Lv91;->h:D

    iget-wide v2, p0, Lv91;->g:D

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x2e

    invoke-virtual {v2, v3}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "  "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lv91;->e:LyB0;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " - "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lv91;->f:LyB0;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lv91;->i:I

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, "   "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lv91;->c:LSl2;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
