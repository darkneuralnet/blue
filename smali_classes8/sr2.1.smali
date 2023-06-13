.class public abstract Lsr2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:[[LyB0;

.field public c:[LyB0;

.field public d:Z

.field public e:LyB0;

.field public f:LyB0;

.field public g:LeZ3;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v1, v0, [I

    fill-array-data v1, :array_0

    const-class v2, LyB0;

    invoke-static {v2, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[LyB0;

    iput-object v1, p0, Lsr2;->b:[[LyB0;

    new-array v0, v0, [LyB0;

    iput-object v0, p0, Lsr2;->c:[LyB0;

    const/4 v1, 0x0

    iput-object v1, p0, Lsr2;->g:LeZ3;

    new-instance v1, LyB0;

    invoke-direct {v1}, LyB0;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v0, p0, Lsr2;->c:[LyB0;

    new-instance v1, LyB0;

    invoke-direct {v1}, LyB0;-><init>()V

    const/4 v3, 0x1

    aput-object v1, v0, v3

    iget-object v0, p0, Lsr2;->c:[LyB0;

    aget-object v1, v0, v2

    iput-object v1, p0, Lsr2;->e:LyB0;

    aget-object v0, v0, v3

    iput-object v0, p0, Lsr2;->f:LyB0;

    iput v2, p0, Lsr2;->a:I

    return-void

    nop

    :array_0
    .array-data 4
        0x2
        0x2
    .end array-data
.end method

.method public static a(LyB0;LyB0;LyB0;)D
    .locals 13

    iget-wide v0, p2, LyB0;->b:D

    iget-wide v2, p1, LyB0;->b:D

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    iget-wide v2, p2, LyB0;->c:D

    iget-wide v4, p1, LyB0;->c:D

    sub-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    invoke-virtual {p0, p1}, LyB0;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-wide/16 v5, 0x0

    if-eqz v4, :cond_0

    move-wide v0, v5

    goto :goto_1

    :cond_0
    invoke-virtual {p0, p2}, LyB0;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    cmpl-double p2, v0, v2

    if-lez p2, :cond_1

    goto :goto_1

    :cond_1
    move-wide v0, v2

    goto :goto_1

    :cond_2
    iget-wide v7, p0, LyB0;->b:D

    iget-wide v9, p1, LyB0;->b:D

    sub-double/2addr v7, v9

    invoke-static {v7, v8}, Ljava/lang/Math;->abs(D)D

    move-result-wide v7

    iget-wide v9, p0, LyB0;->c:D

    iget-wide v11, p1, LyB0;->c:D

    sub-double/2addr v9, v11

    invoke-static {v9, v10}, Ljava/lang/Math;->abs(D)D

    move-result-wide v9

    cmpl-double p2, v0, v2

    if-lez p2, :cond_3

    move-wide v0, v7

    goto :goto_0

    :cond_3
    move-wide v0, v9

    :goto_0
    cmpl-double p2, v0, v5

    if-nez p2, :cond_4

    invoke-virtual {p0, p1}, LyB0;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    :cond_4
    :goto_1
    cmpl-double p2, v0, v5

    if-nez p2, :cond_6

    invoke-virtual {p0, p1}, LyB0;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    goto :goto_2

    :cond_5
    const/4 p0, 0x0

    goto :goto_3

    :cond_6
    :goto_2
    const/4 p0, 0x1

    :goto_3
    const-string p1, "Bad distance calculation"

    invoke-static {p0, p1}, LKo;->d(ZLjava/lang/String;)V

    return-wide v0
.end method


# virtual methods
.method public abstract b(LyB0;LyB0;LyB0;LyB0;)I
.end method

.method public abstract c(LyB0;LyB0;LyB0;)V
.end method

.method public d(LyB0;LyB0;LyB0;LyB0;)V
    .locals 4

    iget-object v0, p0, Lsr2;->b:[[LyB0;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    aput-object p1, v2, v1

    aget-object v2, v0, v1

    const/4 v3, 0x1

    aput-object p2, v2, v3

    aget-object v0, v0, v3

    aput-object p3, v0, v1

    aput-object p4, v0, v3

    invoke-virtual {p0, p1, p2, p3, p4}, Lsr2;->b(LyB0;LyB0;LyB0;LyB0;)I

    move-result p1

    iput p1, p0, Lsr2;->a:I

    return-void
.end method

.method public e(II)D
    .locals 2

    iget-object v0, p0, Lsr2;->c:[LyB0;

    aget-object p2, v0, p2

    iget-object v0, p0, Lsr2;->b:[[LyB0;

    aget-object p1, v0, p1

    const/4 v0, 0x0

    aget-object v0, p1, v0

    const/4 v1, 0x1

    aget-object p1, p1, v1

    invoke-static {p2, v0, p1}, Lsr2;->a(LyB0;LyB0;LyB0;)D

    move-result-wide p1

    return-wide p1
.end method

.method public f(I)LyB0;
    .locals 1

    iget-object v0, p0, Lsr2;->c:[LyB0;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lsr2;->a:I

    return v0
.end method

.method public final h()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lsr2;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, " endpoint"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-boolean v1, p0, Lsr2;->d:Z

    if-eqz v1, :cond_1

    const-string v1, " proper"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {p0}, Lsr2;->j()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, " collinear"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public i()Z
    .locals 1

    iget v0, p0, Lsr2;->a:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j()Z
    .locals 2

    iget v0, p0, Lsr2;->a:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public k()Z
    .locals 1

    invoke-virtual {p0}, Lsr2;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lsr2;->d:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public l()Z
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lsr2;->m(I)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {p0, v2}, Lsr2;->m(I)Z

    move-result v1

    if-eqz v1, :cond_1

    return v2

    :cond_1
    return v0
.end method

.method public m(I)Z
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p0, Lsr2;->a:I

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lsr2;->c:[LyB0;

    aget-object v2, v2, v1

    iget-object v3, p0, Lsr2;->b:[[LyB0;

    aget-object v3, v3, p1

    aget-object v3, v3, v0

    invoke-virtual {v2, v3}, LyB0;->g(LyB0;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lsr2;->c:[LyB0;

    aget-object v2, v2, v1

    iget-object v3, p0, Lsr2;->b:[[LyB0;

    aget-object v3, v3, p1

    const/4 v4, 0x1

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, LyB0;->g(LyB0;)Z

    move-result v2

    if-nez v2, :cond_0

    return v4

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public n(LyB0;)Z
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p0, Lsr2;->a:I

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lsr2;->c:[LyB0;

    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, LyB0;->g(LyB0;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public o()Z
    .locals 1

    invoke-virtual {p0}, Lsr2;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lsr2;->d:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public p(LeZ3;)V
    .locals 0

    iput-object p1, p0, Lsr2;->g:LeZ3;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lsr2;->b:[[LyB0;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    aget-object v3, v1, v2

    const/4 v4, 0x1

    aget-object v1, v1, v4

    invoke-static {v3, v1}, Lkw6;->A(LyB0;LyB0;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lsr2;->b:[[LyB0;

    aget-object v1, v1, v4

    aget-object v2, v1, v2

    aget-object v1, v1, v4

    invoke-static {v2, v1}, Lkw6;->A(LyB0;LyB0;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lsr2;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
