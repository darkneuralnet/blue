.class public final LdU;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a9\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u000b"
    }
    d2 = {
        "LMW1;",
        "image",
        "LA52;",
        "srcOffset",
        "LG52;",
        "srcSize",
        "LRl1;",
        "filterQuality",
        "LcU;",
        "a",
        "(LMW1;JJI)LcU;",
        "ui-graphics_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(LMW1;JJI)LcU;
    .locals 8

    const-string v0, "image"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LcU;

    const/4 v7, 0x0

    move-object v1, v0

    move-object v2, p0

    move-wide v3, p1

    move-wide v5, p3

    invoke-direct/range {v1 .. v7}, LcU;-><init>(LMW1;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, p5}, LcU;->a(I)V

    return-object v0
.end method

.method public static synthetic b(LMW1;JJIILjava/lang/Object;)LcU;
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    sget-object p1, LA52;->b:LA52$a;

    invoke-virtual {p1}, LA52$a;->a()J

    move-result-wide p1

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_1

    invoke-interface {p0}, LMW1;->getWidth()I

    move-result p1

    invoke-interface {p0}, LMW1;->getHeight()I

    move-result p2

    invoke-static {p1, p2}, LH52;->a(II)J

    move-result-wide p3

    :cond_1
    move-wide v3, p3

    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_2

    sget-object p1, LRl1;->a:LRl1$a;

    invoke-virtual {p1}, LRl1$a;->a()I

    move-result p5

    :cond_2
    move v5, p5

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LdU;->a(LMW1;JJI)LcU;

    move-result-object p0

    return-object p0
.end method
