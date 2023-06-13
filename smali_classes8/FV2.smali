.class public LFV2;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a([LyB0;I)I
    .locals 3

    aget-object v0, p1, p2

    add-int/lit8 p2, p2, 0x1

    aget-object v1, p1, p2

    invoke-static {v0, v1}, Lxb4;->b(LyB0;LyB0;)I

    move-result v0

    :goto_0
    array-length v1, p1

    if-ge p2, v1, :cond_1

    add-int/lit8 v1, p2, -0x1

    aget-object v1, p1, v1

    aget-object v2, p1, p2

    invoke-static {v1, v2}, Lxb4;->b(LyB0;LyB0;)I

    move-result v1

    if-eq v1, v0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    add-int/lit8 p2, p2, -0x1

    return p2
.end method

.method public b([LyB0;)[I
    .locals 3

    new-instance v0, Lw52;

    array-length v1, p1

    div-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Lw52;-><init>(I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lw52;->a(I)V

    :cond_0
    invoke-virtual {p0, p1, v1}, LFV2;->a([LyB0;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lw52;->a(I)V

    array-length v2, p1

    add-int/lit8 v2, v2, -0x1

    if-lt v1, v2, :cond_0

    invoke-virtual {v0}, Lw52;->c()[I

    move-result-object p1

    return-object p1
.end method
