.class public final LSS8;
.super LRQ8;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LRQ8<",
        "TE;>;"
    }
.end annotation


# static fields
.field public static final i:[Ljava/lang/Object;

.field public static final j:LSS8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LSS8<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final transient d:[Ljava/lang/Object;

.field public final transient e:I

.field public final transient f:[Ljava/lang/Object;

.field public final transient g:I

.field public final transient h:I


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    const/4 v0, 0x0

    new-array v4, v0, [Ljava/lang/Object;

    sput-object v4, LSS8;->i:[Ljava/lang/Object;

    new-instance v0, LSS8;

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, v4

    invoke-direct/range {v1 .. v6}, LSS8;-><init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    sput-object v0, LSS8;->j:LSS8;

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, LRQ8;-><init>()V

    iput-object p1, p0, LSS8;->d:[Ljava/lang/Object;

    iput p2, p0, LSS8;->e:I

    iput-object p3, p0, LSS8;->f:[Ljava/lang/Object;

    iput p4, p0, LSS8;->g:I

    iput p5, p0, LSS8;->h:I

    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;I)I
    .locals 2

    iget-object p2, p0, LSS8;->d:[Ljava/lang/Object;

    const/4 v0, 0x0

    iget v1, p0, LSS8;->h:I

    invoke-static {p2, v0, p1, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, LSS8;->h:I

    return p1
.end method

.method public final b()I
    .locals 1

    iget v0, p0, LSS8;->h:I

    return v0
.end method

.method public final c()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 4

    iget-object v0, p0, LSS8;->f:[Ljava/lang/Object;

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    array-length v2, v0

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-static {v2}, LqO8;->a(I)I

    move-result v2

    :goto_0
    iget v3, p0, LSS8;->g:I

    and-int/2addr v2, v3

    aget-object v3, v0, v2

    if-nez v3, :cond_1

    return v1

    :cond_1
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return v1
.end method

.method public final f()LbU8;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LbU8<",
            "TE;>;"
        }
    .end annotation

    invoke-virtual {p0}, LXO8;->e()LZP8;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LZP8;->C(I)LnU8;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, LSS8;->e:I

    return v0
.end method

.method public final bridge synthetic iterator()Ljava/util/Iterator;
    .locals 2

    invoke-virtual {p0}, LXO8;->e()LZP8;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LZP8;->C(I)LnU8;

    move-result-object v0

    return-object v0
.end method

.method public final j()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LSS8;->d:[Ljava/lang/Object;

    return-object v0
.end method

.method public final s()LZP8;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZP8<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, LSS8;->d:[Ljava/lang/Object;

    iget v1, p0, LSS8;->h:I

    invoke-static {v0, v1}, LZP8;->w([Ljava/lang/Object;I)LZP8;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, LSS8;->h:I

    return v0
.end method

.method public final x()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
