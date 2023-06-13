.class public final LQr5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a:\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u000b"
    }
    d2 = {
        "",
        "text",
        "",
        "offset",
        "lastOffset",
        "",
        "isStartHandle",
        "previousHandlesCrossed",
        "Ls26;",
        "a",
        "(Ljava/lang/String;IIZZ)J",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Ljava/lang/String;IIZZ)J
    .locals 1

    const-string v0, "text"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    invoke-static {p1, p1}, Lt26;->b(II)J

    move-result-wide p0

    return-wide p0

    :cond_0
    if-nez p1, :cond_2

    const/4 p1, 0x0

    if-eqz p3, :cond_1

    invoke-static {p0, p1}, LUR5;->a(Ljava/lang/String;I)I

    move-result p0

    invoke-static {p0, p1}, Lt26;->b(II)J

    move-result-wide p0

    goto :goto_0

    :cond_1
    invoke-static {p0, p1}, LUR5;->a(Ljava/lang/String;I)I

    move-result p0

    invoke-static {p1, p0}, Lt26;->b(II)J

    move-result-wide p0

    :goto_0
    return-wide p0

    :cond_2
    if-ne p1, p2, :cond_4

    if-eqz p3, :cond_3

    invoke-static {p0, p2}, LUR5;->b(Ljava/lang/String;I)I

    move-result p0

    invoke-static {p0, p2}, Lt26;->b(II)J

    move-result-wide p0

    goto :goto_1

    :cond_3
    invoke-static {p0, p2}, LUR5;->b(Ljava/lang/String;I)I

    move-result p0

    invoke-static {p2, p0}, Lt26;->b(II)J

    move-result-wide p0

    :goto_1
    return-wide p0

    :cond_4
    if-eqz p3, :cond_6

    if-nez p4, :cond_5

    invoke-static {p0, p1}, LUR5;->b(Ljava/lang/String;I)I

    move-result p0

    invoke-static {p0, p1}, Lt26;->b(II)J

    move-result-wide p0

    goto :goto_2

    :cond_5
    invoke-static {p0, p1}, LUR5;->a(Ljava/lang/String;I)I

    move-result p0

    invoke-static {p0, p1}, Lt26;->b(II)J

    move-result-wide p0

    goto :goto_2

    :cond_6
    if-nez p4, :cond_7

    invoke-static {p0, p1}, LUR5;->a(Ljava/lang/String;I)I

    move-result p0

    invoke-static {p1, p0}, Lt26;->b(II)J

    move-result-wide p0

    goto :goto_2

    :cond_7
    invoke-static {p0, p1}, LUR5;->b(Ljava/lang/String;I)I

    move-result p0

    invoke-static {p1, p0}, Lt26;->b(II)J

    move-result-wide p0

    :goto_2
    return-wide p0
.end method
