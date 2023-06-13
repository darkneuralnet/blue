.class public Lar5;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(ILyB0;LyB0;)I
    .locals 6

    invoke-virtual {p1, p2}, LyB0;->g(LyB0;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-wide v2, p1, LyB0;->b:D

    iget-wide v4, p2, LyB0;->b:D

    invoke-static {v2, v3, v4, v5}, Lar5;->c(DD)I

    move-result v0

    iget-wide v2, p1, LyB0;->c:D

    iget-wide p1, p2, LyB0;->c:D

    invoke-static {v2, v3, p1, p2}, Lar5;->c(DD)I

    move-result p1

    packed-switch p0, :pswitch_data_0

    const-string p0, "invalid octant value"

    invoke-static {p0}, LKo;->f(Ljava/lang/String;)V

    return v1

    :pswitch_0
    neg-int p0, p1

    invoke-static {v0, p0}, Lar5;->b(II)I

    move-result p0

    return p0

    :pswitch_1
    neg-int p0, p1

    invoke-static {p0, v0}, Lar5;->b(II)I

    move-result p0

    return p0

    :pswitch_2
    neg-int p0, p1

    neg-int p1, v0

    invoke-static {p0, p1}, Lar5;->b(II)I

    move-result p0

    return p0

    :pswitch_3
    neg-int p0, v0

    neg-int p1, p1

    invoke-static {p0, p1}, Lar5;->b(II)I

    move-result p0

    return p0

    :pswitch_4
    neg-int p0, v0

    invoke-static {p0, p1}, Lar5;->b(II)I

    move-result p0

    return p0

    :pswitch_5
    neg-int p0, v0

    invoke-static {p1, p0}, Lar5;->b(II)I

    move-result p0

    return p0

    :pswitch_6
    invoke-static {p1, v0}, Lar5;->b(II)I

    move-result p0

    return p0

    :pswitch_7
    invoke-static {v0, p1}, Lar5;->b(II)I

    move-result p0

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static b(II)I
    .locals 2

    const/4 v0, -0x1

    if-gez p0, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x1

    if-lez p0, :cond_1

    return v1

    :cond_1
    if-gez p1, :cond_2

    return v0

    :cond_2
    if-lez p1, :cond_3

    return v1

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method public static c(DD)I
    .locals 1

    cmpg-double v0, p0, p2

    if-gez v0, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    cmpl-double p0, p0, p2

    if-lez p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method
