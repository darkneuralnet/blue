.class public final Lq74;
.super Lu1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq74$c;,
        Lq74$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Q:",
        "Ljava/lang/Object;",
        ">",
        "Lu1<",
        "TQ;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0xd5d34780c1bea4dL


# instance fields
.field public final f:[Lq74$b;

.field public transient g:LZm2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZm2<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, ""

    invoke-direct {p0, v0}, Lu1;-><init>(Ljava/lang/String;)V

    new-instance v0, LZm2;

    new-instance v1, Lp74;

    invoke-direct {v1, p0}, Lp74;-><init>(Lq74;)V

    invoke-direct {v0, v1}, LZm2;-><init>(Ljava/util/function/Supplier;)V

    iput-object v0, p0, Lq74;->g:LZm2;

    const/4 v0, 0x0

    new-array v0, v0, [Lq74$b;

    iput-object v0, p0, Lq74;->f:[Lq74$b;

    return-void
.end method

.method public constructor <init>(LSd6;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSd6<",
            "*>;)V"
        }
    .end annotation

    invoke-interface {p1}, LSd6;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lu1;-><init>(Ljava/lang/String;)V

    new-instance v0, LZm2;

    new-instance v1, Lp74;

    invoke-direct {v1, p0}, Lp74;-><init>(Lq74;)V

    invoke-direct {v0, v1}, LZm2;-><init>(Ljava/util/function/Supplier;)V

    iput-object v0, p0, Lq74;->g:LZm2;

    check-cast p1, Lq74;

    iget-object p1, p1, Lq74;->f:[Lq74$b;

    iput-object p1, p0, Lq74;->f:[Lq74$b;

    return-void
.end method

.method public constructor <init>([Lq74$b;)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lu1;-><init>(Ljava/lang/String;)V

    new-instance v0, LZm2;

    new-instance v1, Lp74;

    invoke-direct {v1, p0}, Lp74;-><init>(Lq74;)V

    invoke-direct {v0, v1}, LZm2;-><init>(Ljava/util/function/Supplier;)V

    iput-object v0, p0, Lq74;->g:LZm2;

    iput-object p1, p0, Lq74;->f:[Lq74$b;

    return-void
.end method

.method public static synthetic L(Lq74;)I
    .locals 0

    invoke-virtual {p0}, Lq74;->M()I

    move-result p0

    return p0
.end method

.method public static N(II)I
    .locals 0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    rem-int/2addr p0, p1

    invoke-static {p1, p0}, Lq74;->N(II)I

    move-result p0

    :goto_0
    return p0
.end method

.method public static P([Lq74$b;[Lq74$b;)LSd6;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lq74$b;",
            "[",
            "Lq74$b;",
            ")",
            "LSd6<",
            "*>;"
        }
    .end annotation

    array-length v0, p0

    array-length v1, p1

    add-int/2addr v0, v1

    new-array v0, v0, [Lq74$b;

    array-length v1, p0

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    const/4 v5, 0x1

    if-ge v3, v1, :cond_3

    aget-object v6, p0, v3

    invoke-static {v6}, Lq74$b;->a(Lq74$b;)LSd6;

    move-result-object v7

    invoke-static {v6}, Lq74$b;->b(Lq74$b;)I

    move-result v8

    invoke-static {v6}, Lq74$b;->c(Lq74$b;)I

    move-result v6

    array-length v9, p1

    move v10, v2

    :goto_1
    if-ge v10, v9, :cond_1

    aget-object v11, p1, v10

    invoke-static {v11}, Lq74$b;->a(Lq74$b;)LSd6;

    move-result-object v12

    invoke-virtual {v7, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_0

    invoke-static {v11}, Lq74$b;->b(Lq74$b;)I

    move-result v5

    invoke-static {v11}, Lq74$b;->c(Lq74$b;)I

    move-result v9

    move v13, v9

    move v9, v5

    move v5, v13

    goto :goto_2

    :cond_0
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_1
    move v9, v2

    :goto_2
    mul-int/2addr v8, v5

    mul-int/2addr v9, v6

    add-int/2addr v8, v9

    mul-int/2addr v6, v5

    if-eqz v8, :cond_2

    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    move-result v5

    invoke-static {v5, v6}, Lq74;->N(II)I

    move-result v5

    add-int/lit8 v9, v4, 0x1

    new-instance v10, Lq74$b;

    div-int/2addr v8, v5

    div-int/2addr v6, v5

    const/4 v5, 0x0

    invoke-direct {v10, v7, v8, v6, v5}, Lq74$b;-><init>(LSd6;IILq74$a;)V

    aput-object v10, v0, v4

    move v4, v9

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    array-length v1, p1

    move v3, v2

    :goto_3
    if-ge v3, v1, :cond_7

    aget-object v6, p1, v3

    invoke-static {v6}, Lq74$b;->a(Lq74$b;)LSd6;

    move-result-object v7

    array-length v8, p0

    move v9, v2

    :goto_4
    if-ge v9, v8, :cond_5

    aget-object v10, p0, v9

    invoke-static {v10}, Lq74$b;->a(Lq74$b;)LSd6;

    move-result-object v10

    invoke-virtual {v7, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    move v7, v5

    goto :goto_5

    :cond_4
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_5
    move v7, v2

    :goto_5
    if-nez v7, :cond_6

    add-int/lit8 v7, v4, 0x1

    aput-object v6, v0, v4

    move v4, v7

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_7
    if-nez v4, :cond_8

    sget-object p0, Lu1;->d:LSd6;

    return-object p0

    :cond_8
    if-ne v4, v5, :cond_9

    aget-object p0, v0, v2

    invoke-static {p0}, Lq74$b;->b(Lq74$b;)I

    move-result p0

    aget-object p1, v0, v2

    invoke-static {p1}, Lq74$b;->c(Lq74$b;)I

    move-result p1

    if-ne p0, p1, :cond_9

    aget-object p0, v0, v2

    invoke-static {p0}, Lq74$b;->a(Lq74$b;)LSd6;

    move-result-object p0

    return-object p0

    :cond_9
    new-array p0, v4, [Lq74$b;

    invoke-static {v0, v2, p0, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance p1, Lq74;

    invoke-direct {p1, p0}, Lq74;-><init>([Lq74$b;)V

    return-object p1
.end method

.method public static Y(LSd6;I)LSd6;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSd6<",
            "*>;I)",
            "LSd6<",
            "*>;"
        }
    .end annotation

    instance-of v0, p0, Lq74;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Lq74;

    iget-object p0, p0, Lq74;->f:[Lq74$b;

    array-length v0, p0

    new-array v0, v0, [Lq74$b;

    move v3, v2

    :goto_0
    array-length v4, p0

    if-ge v3, v4, :cond_1

    aget-object v4, p0, v3

    invoke-static {v4}, Lq74$b;->b(Lq74$b;)I

    move-result v4

    mul-int/2addr v4, p1

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    aget-object v5, p0, v3

    invoke-static {v5}, Lq74$b;->c(Lq74$b;)I

    move-result v5

    invoke-static {v4, v5}, Lq74;->N(II)I

    move-result v4

    new-instance v5, Lq74$b;

    aget-object v6, p0, v3

    invoke-static {v6}, Lq74$b;->a(Lq74$b;)LSd6;

    move-result-object v6

    aget-object v7, p0, v3

    invoke-static {v7}, Lq74$b;->b(Lq74$b;)I

    move-result v7

    mul-int/2addr v7, p1

    div-int/2addr v7, v4

    aget-object v8, p0, v3

    invoke-static {v8}, Lq74$b;->c(Lq74$b;)I

    move-result v8

    div-int/2addr v8, v4

    invoke-direct {v5, v6, v7, v8, v1}, Lq74$b;-><init>(LSd6;IILq74$a;)V

    aput-object v5, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    new-array v3, v0, [Lq74$b;

    new-instance v4, Lq74$b;

    invoke-direct {v4, p0, p1, v0, v1}, Lq74$b;-><init>(LSd6;IILq74$a;)V

    aput-object v4, v3, v2

    move-object v0, v3

    :cond_1
    new-array p0, v2, [Lq74$b;

    invoke-static {v0, p0}, Lq74;->P([Lq74$b;[Lq74$b;)LSd6;

    move-result-object p0

    return-object p0
.end method

.method public static Z(LSd6;LSd6;)LSd6;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSd6<",
            "*>;",
            "LSd6<",
            "*>;)",
            "LSd6<",
            "*>;"
        }
    .end annotation

    instance-of v0, p0, Lq74;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    check-cast p0, Lq74;

    iget-object p0, p0, Lq74;->f:[Lq74$b;

    goto :goto_0

    :cond_0
    new-array v0, v3, [Lq74$b;

    new-instance v4, Lq74$b;

    invoke-direct {v4, p0, v3, v3, v1}, Lq74$b;-><init>(LSd6;IILq74$a;)V

    aput-object v4, v0, v2

    move-object p0, v0

    :goto_0
    instance-of v0, p1, Lq74;

    if-eqz v0, :cond_1

    check-cast p1, Lq74;

    iget-object p1, p1, Lq74;->f:[Lq74$b;

    goto :goto_1

    :cond_1
    new-array v0, v3, [Lq74$b;

    new-instance v4, Lq74$b;

    invoke-direct {v4, p1, v3, v3, v1}, Lq74$b;-><init>(LSd6;IILq74$a;)V

    aput-object v4, v0, v2

    move-object p1, v0

    :goto_1
    invoke-static {p0, p1}, Lq74;->P([Lq74$b;[Lq74$b;)LSd6;

    move-result-object p0

    return-object p0
.end method

.method public static c0(LSd6;LSd6;)LSd6;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSd6<",
            "*>;",
            "LSd6<",
            "*>;)",
            "LSd6<",
            "*>;"
        }
    .end annotation

    instance-of v0, p0, Lq74;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    check-cast p0, Lq74;

    iget-object p0, p0, Lq74;->f:[Lq74$b;

    goto :goto_0

    :cond_0
    new-array v0, v3, [Lq74$b;

    new-instance v4, Lq74$b;

    invoke-direct {v4, p0, v3, v3, v1}, Lq74$b;-><init>(LSd6;IILq74$a;)V

    aput-object v4, v0, v2

    move-object p0, v0

    :goto_0
    instance-of v0, p1, Lq74;

    if-eqz v0, :cond_1

    check-cast p1, Lq74;

    iget-object p1, p1, Lq74;->f:[Lq74$b;

    array-length v0, p1

    new-array v0, v0, [Lq74$b;

    :goto_1
    array-length v3, p1

    if-ge v2, v3, :cond_2

    new-instance v3, Lq74$b;

    aget-object v4, p1, v2

    invoke-static {v4}, Lq74$b;->a(Lq74$b;)LSd6;

    move-result-object v4

    aget-object v5, p1, v2

    invoke-static {v5}, Lq74$b;->b(Lq74$b;)I

    move-result v5

    neg-int v5, v5

    aget-object v6, p1, v2

    invoke-static {v6}, Lq74$b;->c(Lq74$b;)I

    move-result v6

    invoke-direct {v3, v4, v5, v6, v1}, Lq74$b;-><init>(LSd6;IILq74$a;)V

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    new-array v0, v3, [Lq74$b;

    new-instance v4, Lq74$b;

    const/4 v5, -0x1

    invoke-direct {v4, p1, v5, v3, v1}, Lq74$b;-><init>(LSd6;IILq74$a;)V

    aput-object v4, v0, v2

    :cond_2
    invoke-static {p0, v0}, Lq74;->P([Lq74$b;[Lq74$b;)LSd6;

    move-result-object p0

    return-object p0
.end method

.method public static d0(LSd6;I)LSd6;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSd6<",
            "*>;I)",
            "LSd6<",
            "*>;"
        }
    .end annotation

    instance-of v0, p0, Lq74;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Lq74;

    iget-object p0, p0, Lq74;->f:[Lq74$b;

    array-length v0, p0

    new-array v0, v0, [Lq74$b;

    move v3, v2

    :goto_0
    array-length v4, p0

    if-ge v3, v4, :cond_1

    aget-object v4, p0, v3

    invoke-static {v4}, Lq74$b;->b(Lq74$b;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    aget-object v5, p0, v3

    invoke-static {v5}, Lq74$b;->c(Lq74$b;)I

    move-result v5

    mul-int/2addr v5, p1

    invoke-static {v4, v5}, Lq74;->N(II)I

    move-result v4

    new-instance v5, Lq74$b;

    aget-object v6, p0, v3

    invoke-static {v6}, Lq74$b;->a(Lq74$b;)LSd6;

    move-result-object v6

    aget-object v7, p0, v3

    invoke-static {v7}, Lq74$b;->b(Lq74$b;)I

    move-result v7

    div-int/2addr v7, v4

    aget-object v8, p0, v3

    invoke-static {v8}, Lq74$b;->c(Lq74$b;)I

    move-result v8

    mul-int/2addr v8, p1

    div-int/2addr v8, v4

    invoke-direct {v5, v6, v7, v8, v1}, Lq74$b;-><init>(LSd6;IILq74$a;)V

    aput-object v5, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    new-array v3, v0, [Lq74$b;

    new-instance v4, Lq74$b;

    invoke-direct {v4, p0, v0, p1, v1}, Lq74$b;-><init>(LSd6;IILq74$a;)V

    aput-object v4, v3, v2

    move-object v0, v3

    :cond_1
    new-array p0, v2, [Lq74$b;

    invoke-static {v0, p0}, Lq74;->P([Lq74$b;[Lq74$b;)LSd6;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public F()LV31;
    .locals 4

    sget-object v0, Lbe6;->d:LV31;

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lq74;->T()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {p0, v1}, Lq74;->R(I)LSd6;

    move-result-object v2

    iget-object v3, p0, Lq74;->f:[Lq74$b;

    if-eqz v3, :cond_0

    invoke-interface {v2}, LSd6;->F()LV31;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, LSd6;->F()LV31;

    move-result-object v2

    invoke-virtual {p0, v1}, Lq74;->U(I)I

    move-result v3

    invoke-interface {v2, v3}, LV31;->d(I)LV31;

    move-result-object v2

    invoke-virtual {p0, v1}, Lq74;->W(I)I

    move-result v3

    invoke-interface {v2, v3}, LV31;->c(I)LV31;

    move-result-object v2

    invoke-interface {v0, v2}, LV31;->f(LV31;)LV31;

    move-result-object v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public J()LSd6;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LSd6<",
            "TQ;>;"
        }
    .end annotation

    sget-object v0, Lu1;->d:LSd6;

    iget-object v1, p0, Lq74;->f:[Lq74$b;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    invoke-static {v4}, Lq74$b;->a(Lq74$b;)LSd6;

    move-result-object v5

    invoke-interface {v5}, LSd6;->G()LSd6;

    move-result-object v5

    invoke-static {v4}, Lq74$b;->b(Lq74$b;)I

    move-result v6

    invoke-interface {v5, v6}, LSd6;->d(I)LSd6;

    move-result-object v5

    invoke-static {v4}, Lq74$b;->c(Lq74$b;)I

    move-result v4

    invoke-interface {v5, v4}, LSd6;->c(I)LSd6;

    move-result-object v4

    invoke-interface {v0, v4}, LSd6;->j(LSd6;)LSd6;

    move-result-object v0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    check-cast v0, Lu1;

    return-object v0
.end method

.method public final M()I
    .locals 1

    iget-object v0, p0, Lq74;->f:[Lq74$b;

    invoke-static {v0}, Lq74$c;->c([Lq74$b;)[Lq74$b;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public R(I)LSd6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "LSd6<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lq74;->f:[Lq74$b;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Lq74$b;->f()LSd6;

    move-result-object p1

    return-object p1
.end method

.method public T()I
    .locals 1

    iget-object v0, p0, Lq74;->f:[Lq74$b;

    array-length v0, v0

    return v0
.end method

.method public U(I)I
    .locals 1

    iget-object v0, p0, Lq74;->f:[Lq74$b;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Lq74$b;->d()I

    move-result p1

    return p1
.end method

.method public W(I)I
    .locals 1

    iget-object v0, p0, Lq74;->f:[Lq74$b;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Lq74$b;->e()I

    move-result p1

    return p1
.end method

.method public b0()Lae6;
    .locals 9

    sget-object v0, Lo0;->c:Lo0;

    iget-object v1, p0, Lq74;->f:[Lq74$b;

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_4

    aget-object v5, v1, v4

    invoke-static {v5}, Lq74$b;->a(Lq74$b;)LSd6;

    move-result-object v6

    instance-of v6, v6, Lu1;

    if-eqz v6, :cond_3

    invoke-static {v5}, Lq74$b;->a(Lq74$b;)LSd6;

    move-result-object v6

    check-cast v6, Lu1;

    invoke-interface {v6}, LRp0;->b0()Lae6;

    move-result-object v6

    invoke-interface {v6}, Lae6;->D()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-static {v5}, Lq74$b;->c(Lq74$b;)I

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v8, :cond_1

    invoke-static {v5}, Lq74$b;->b(Lq74$b;)I

    move-result v5

    if-gez v5, :cond_0

    neg-int v5, v5

    invoke-interface {v6}, Lae6;->b()Lae6;

    move-result-object v6

    :cond_0
    move v7, v3

    :goto_1
    if-ge v7, v5, :cond_3

    invoke-interface {v0, v6}, Lae6;->c(Lae6;)Lae6;

    move-result-object v0

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v5}, Lq74$b;->a(Lq74$b;)LSd6;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " holds a base unit with fractional exponent"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v5}, Lq74$b;->a(Lq74$b;)LSd6;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is non-linear, cannot convert"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    return-object v0
.end method

.method public d(I)LSd6;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "LSd6<",
            "*>;"
        }
    .end annotation

    invoke-static {p0, p1}, Lq74;->Y(LSd6;I)LSd6;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lq74;

    if-eqz v0, :cond_1

    check-cast p1, Lq74;

    iget-object v0, p0, Lq74;->f:[Lq74$b;

    iget-object p1, p1, Lq74;->f:[Lq74$b;

    invoke-static {v0, p1}, Lq74$c;->b([Lq74$b;[Lq74$b;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lq74;->g:LZm2;

    invoke-virtual {v0}, LZm2;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public l()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "LSd6<",
            "*>;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lq74;->T()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-virtual {p0, v1}, Lq74;->R(I)LSd6;

    move-result-object v2

    invoke-virtual {p0, v1}, Lq74;->U(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method
