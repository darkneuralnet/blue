.class public LpG0;
.super LW;
.source "SourceFile"


# instance fields
.field public d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LW;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LpG0;->d:I

    return-void
.end method

.method public constructor <init>(LE;)V
    .locals 0

    invoke-direct {p0, p1}, LW;-><init>(LE;)V

    const/4 p1, -0x1

    iput p1, p0, LpG0;->d:I

    return-void
.end method

.method public constructor <init>(LF;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LW;-><init>(LF;Z)V

    const/4 p1, -0x1

    iput p1, p0, LpG0;->d:I

    return-void
.end method

.method public constructor <init>(Z[LE;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LW;-><init>(Z[LE;)V

    const/4 p1, -0x1

    iput p1, p0, LpG0;->d:I

    return-void
.end method


# virtual methods
.method public final H()I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LpG0;->d:I

    if-gez v0, :cond_1

    iget-object v0, p0, LW;->b:[LE;

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v3, p0, LW;->b:[LE;

    aget-object v3, v3, v1

    invoke-interface {v3}, LE;->c()LS;

    move-result-object v3

    invoke-virtual {v3}, LS;->y()LS;

    move-result-object v3

    invoke-virtual {v3}, LS;->s()I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput v2, p0, LpG0;->d:I

    :cond_1
    iget v0, p0, LpG0;->d:I

    return v0
.end method

.method public o(LQ;Z)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p2, :cond_0

    const/16 p2, 0x31

    invoke-virtual {p1, p2}, LQ;->f(I)V

    :cond_0
    invoke-virtual {p1}, LQ;->e()LQ;

    move-result-object p2

    iget-object v0, p0, LW;->b:[LE;

    array-length v0, v0

    iget v1, p0, LpG0;->d:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-gez v1, :cond_3

    const/16 v1, 0x10

    if-le v0, v1, :cond_1

    goto :goto_2

    :cond_1
    new-array v1, v0, [LS;

    move v4, v2

    move v5, v4

    :goto_0
    if-ge v4, v0, :cond_2

    iget-object v6, p0, LW;->b:[LE;

    aget-object v6, v6, v4

    invoke-interface {v6}, LE;->c()LS;

    move-result-object v6

    invoke-virtual {v6}, LS;->y()LS;

    move-result-object v6

    aput-object v6, v1, v4

    invoke-virtual {v6}, LS;->s()I

    move-result v6

    add-int/2addr v5, v6

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    iput v5, p0, LpG0;->d:I

    invoke-virtual {p1, v5}, LQ;->r(I)V

    :goto_1
    if-ge v2, v0, :cond_4

    aget-object p1, v1, v2

    invoke-virtual {p2, p1, v3}, LQ;->u(LS;Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    invoke-virtual {p0}, LpG0;->H()I

    move-result v1

    invoke-virtual {p1, v1}, LQ;->r(I)V

    :goto_3
    if-ge v2, v0, :cond_4

    iget-object p1, p0, LW;->b:[LE;

    aget-object p1, p1, v2

    invoke-interface {p1}, LE;->c()LS;

    move-result-object p1

    invoke-virtual {p2, p1, v3}, LQ;->u(LS;Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_4
    return-void
.end method

.method public s()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, LpG0;->H()I

    move-result v0

    invoke-static {v0}, LER5;->a(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    add-int/2addr v1, v0

    return v1
.end method

.method public y()LS;
    .locals 0

    return-object p0
.end method
