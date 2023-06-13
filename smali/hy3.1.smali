.class public Lhy3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:[Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [Z

    sput-object v0, Lhy3;->a:[Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljz0;LLr2;Liz0;)V
    .locals 6

    const/4 v0, -0x1

    iput v0, p2, Liz0;->t:I

    iput v0, p2, Liz0;->u:I

    iget-object v0, p0, Liz0;->b0:[Liz0$b;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    sget-object v2, Liz0$b;->c:Liz0$b;

    const/4 v3, 0x2

    if-eq v0, v2, :cond_0

    iget-object v0, p2, Liz0;->b0:[Liz0$b;

    aget-object v0, v0, v1

    sget-object v1, Liz0$b;->e:Liz0$b;

    if-ne v0, v1, :cond_0

    iget-object v0, p2, Liz0;->Q:LXy0;

    iget v0, v0, LXy0;->g:I

    invoke-virtual {p0}, Liz0;->Y()I

    move-result v1

    iget-object v4, p2, Liz0;->S:LXy0;

    iget v4, v4, LXy0;->g:I

    sub-int/2addr v1, v4

    iget-object v4, p2, Liz0;->Q:LXy0;

    invoke-virtual {p1, v4}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v5

    iput-object v5, v4, LXy0;->i:LrN5;

    iget-object v4, p2, Liz0;->S:LXy0;

    invoke-virtual {p1, v4}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v5

    iput-object v5, v4, LXy0;->i:LrN5;

    iget-object v4, p2, Liz0;->Q:LXy0;

    iget-object v4, v4, LXy0;->i:LrN5;

    invoke-virtual {p1, v4, v0}, LLr2;->f(LrN5;I)V

    iget-object v4, p2, Liz0;->S:LXy0;

    iget-object v4, v4, LXy0;->i:LrN5;

    invoke-virtual {p1, v4, v1}, LLr2;->f(LrN5;I)V

    iput v3, p2, Liz0;->t:I

    invoke-virtual {p2, v0, v1}, Liz0;->S0(II)V

    :cond_0
    iget-object v0, p0, Liz0;->b0:[Liz0$b;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    if-eq v0, v2, :cond_3

    iget-object v0, p2, Liz0;->b0:[Liz0$b;

    aget-object v0, v0, v1

    sget-object v1, Liz0$b;->e:Liz0$b;

    if-ne v0, v1, :cond_3

    iget-object v0, p2, Liz0;->R:LXy0;

    iget v0, v0, LXy0;->g:I

    invoke-virtual {p0}, Liz0;->z()I

    move-result p0

    iget-object v1, p2, Liz0;->T:LXy0;

    iget v1, v1, LXy0;->g:I

    sub-int/2addr p0, v1

    iget-object v1, p2, Liz0;->R:LXy0;

    invoke-virtual {p1, v1}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v2

    iput-object v2, v1, LXy0;->i:LrN5;

    iget-object v1, p2, Liz0;->T:LXy0;

    invoke-virtual {p1, v1}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v2

    iput-object v2, v1, LXy0;->i:LrN5;

    iget-object v1, p2, Liz0;->R:LXy0;

    iget-object v1, v1, LXy0;->i:LrN5;

    invoke-virtual {p1, v1, v0}, LLr2;->f(LrN5;I)V

    iget-object v1, p2, Liz0;->T:LXy0;

    iget-object v1, v1, LXy0;->i:LrN5;

    invoke-virtual {p1, v1, p0}, LLr2;->f(LrN5;I)V

    iget v1, p2, Liz0;->n0:I

    if-gtz v1, :cond_1

    invoke-virtual {p2}, Liz0;->X()I

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_2

    :cond_1
    iget-object v1, p2, Liz0;->U:LXy0;

    invoke-virtual {p1, v1}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v2

    iput-object v2, v1, LXy0;->i:LrN5;

    iget-object v1, p2, Liz0;->U:LXy0;

    iget-object v1, v1, LXy0;->i:LrN5;

    iget v2, p2, Liz0;->n0:I

    add-int/2addr v2, v0

    invoke-virtual {p1, v1, v2}, LLr2;->f(LrN5;I)V

    :cond_2
    iput v3, p2, Liz0;->u:I

    invoke-virtual {p2, v0, p0}, Liz0;->j1(II)V

    :cond_3
    return-void
.end method

.method public static final b(II)Z
    .locals 0

    and-int/2addr p0, p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
