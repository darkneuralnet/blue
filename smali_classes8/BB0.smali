.class public LBB0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[LyB0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [LyB0;

    sput-object v0, LBB0;->a:[LyB0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([LyB0;)I
    .locals 4

    if-eqz p0, :cond_2

    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v3, p0, v1

    invoke-static {v3}, LMB0;->c(LyB0;)I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v2

    :cond_2
    :goto_1
    const/4 p0, 0x3

    return p0
.end method

.method public static b([LyB0;)Z
    .locals 4

    const/4 v0, 0x1

    move v1, v0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    add-int/lit8 v2, v1, -0x1

    aget-object v2, p0, v2

    aget-object v3, p0, v1

    invoke-virtual {v2, v3}, LyB0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static c([LyB0;)I
    .locals 3

    const/4 v0, 0x0

    :goto_0
    array-length v1, p0

    div-int/lit8 v1, v1, 0x2

    const/4 v2, 0x1

    if-ge v0, v1, :cond_1

    array-length v1, p0

    sub-int/2addr v1, v2

    sub-int/2addr v1, v0

    aget-object v2, p0, v0

    aget-object v1, p0, v1

    invoke-virtual {v2, v1}, LyB0;->d(LyB0;)I

    move-result v1

    if-eqz v1, :cond_0

    return v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public static d(LyB0;[LyB0;)I
    .locals 2

    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_1

    aget-object v1, p1, v0

    invoke-virtual {p0, v1}, LyB0;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static e([LyB0;)I
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    array-length v1, p0

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    array-length v1, p0

    move v2, v0

    :goto_0
    if-ge v0, v1, :cond_1

    aget-object v3, p0, v0

    invoke-static {v3}, LMB0;->d(LyB0;)I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return v2

    :cond_2
    :goto_1
    return v0
.end method

.method public static f([LyB0;[LyB0;)LyB0;
    .locals 3

    const/4 v0, 0x0

    :goto_0
    array-length v1, p0

    if-ge v0, v1, :cond_1

    aget-object v1, p0, v0

    invoke-static {v1, p1}, LBB0;->d(LyB0;[LyB0;)I

    move-result v2

    if-gez v2, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static g([LyB0;)[LyB0;
    .locals 2

    invoke-static {p0}, LBB0;->b([LyB0;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, LDB0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LDB0;-><init>([LyB0;Z)V

    invoke-virtual {v0}, LDB0;->b2()[LyB0;

    move-result-object p0

    return-object p0
.end method

.method public static h([LyB0;)V
    .locals 6

    array-length v0, p0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    return-void

    :cond_0
    array-length v0, p0

    sub-int/2addr v0, v1

    div-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    :goto_0
    if-gt v2, v1, :cond_1

    aget-object v3, p0, v2

    sub-int v4, v0, v2

    aget-object v5, p0, v4

    aput-object v5, p0, v2

    aput-object v3, p0, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static i(Ljava/util/Collection;)[LyB0;
    .locals 1

    sget-object v0, LBB0;->a:[LyB0;

    invoke-interface {p0, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [LyB0;

    return-object p0
.end method
