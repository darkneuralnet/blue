.class public LJy3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public b:[LyB0;

.field public c:Z


# direct methods
.method public constructor <init>([LyB0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJy3;->b:[LyB0;

    invoke-static {p1}, LJy3;->b([LyB0;)Z

    move-result p1

    iput-boolean p1, p0, LJy3;->c:Z

    return-void
.end method

.method public static a([LyB0;Z[LyB0;Z)I
    .locals 9

    const/4 v0, -0x1

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    if-eqz p3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    if-eqz p1, :cond_2

    array-length v4, p0

    goto :goto_2

    :cond_2
    move v4, v0

    :goto_2
    if-eqz p3, :cond_3

    array-length v5, p2

    goto :goto_3

    :cond_3
    move v5, v0

    :goto_3
    const/4 v6, 0x0

    if-eqz p1, :cond_4

    move p1, v6

    goto :goto_4

    :cond_4
    array-length p1, p0

    sub-int/2addr p1, v1

    :goto_4
    if-eqz p3, :cond_5

    move p3, v6

    goto :goto_5

    :cond_5
    array-length p3, p2

    sub-int/2addr p3, v1

    :cond_6
    :goto_5
    aget-object v7, p0, p1

    aget-object v8, p2, p3

    invoke-virtual {v7, v8}, LyB0;->d(LyB0;)I

    move-result v7

    if-eqz v7, :cond_7

    return v7

    :cond_7
    add-int/2addr p1, v2

    add-int/2addr p3, v3

    if-ne p1, v4, :cond_8

    move v7, v1

    goto :goto_6

    :cond_8
    move v7, v6

    :goto_6
    if-ne p3, v5, :cond_9

    move v8, v1

    goto :goto_7

    :cond_9
    move v8, v6

    :goto_7
    if-eqz v7, :cond_a

    if-nez v8, :cond_a

    return v0

    :cond_a
    if-nez v7, :cond_b

    if-eqz v8, :cond_b

    return v1

    :cond_b
    if-eqz v7, :cond_6

    if-eqz v8, :cond_6

    return v6
.end method

.method public static b([LyB0;)Z
    .locals 1

    invoke-static {p0}, LBB0;->c([LyB0;)I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public compareTo(Ljava/lang/Object;)I
    .locals 3

    check-cast p1, LJy3;

    iget-object v0, p0, LJy3;->b:[LyB0;

    iget-boolean v1, p0, LJy3;->c:Z

    iget-object v2, p1, LJy3;->b:[LyB0;

    iget-boolean p1, p1, LJy3;->c:Z

    invoke-static {v0, v1, v2, p1}, LJy3;->a([LyB0;Z[LyB0;Z)I

    move-result p1

    return p1
.end method
