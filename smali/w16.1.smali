.class public final Lw16;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aI\u0010\u000b\u001a\u00020\u00052\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\r"
    }
    d2 = {
        "Li26;",
        "textLayoutResult",
        "",
        "rawStartOffset",
        "rawEndOffset",
        "Ls26;",
        "previousSelection",
        "",
        "isStartHandle",
        "LPr5;",
        "adjustment",
        "a",
        "(Li26;IILs26;ZLPr5;)J",
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
.method public static final a(Li26;IILs26;ZLPr5;)J
    .locals 8

    const-string v0, "adjustment"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_1

    invoke-static {p1, p2}, Lt26;->b(II)J

    move-result-wide v3

    if-nez p3, :cond_0

    sget-object p1, LPr5;->a:LPr5$a;

    invoke-virtual {p1}, LPr5$a;->c()LPr5;

    move-result-object p1

    invoke-static {p5, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-wide v3

    :cond_0
    const/4 v5, -0x1

    move-object v1, p5

    move-object v2, p0

    move v6, p4

    move-object v7, p3

    invoke-interface/range {v1 .. v7}, LPr5;->a(Li26;JIZLs26;)J

    move-result-wide p0

    return-wide p0

    :cond_1
    const/4 p0, 0x0

    invoke-static {p0, p0}, Lt26;->b(II)J

    move-result-wide p0

    return-wide p0
.end method
