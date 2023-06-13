.class public final LGw1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a9\u0010\t\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u000b"
    }
    d2 = {
        "LFw1;",
        "",
        "typeface",
        "Lew1;",
        "font",
        "LJw1;",
        "requestedWeight",
        "LEw1;",
        "requestedStyle",
        "a",
        "(ILjava/lang/Object;Lew1;LJw1;I)Ljava/lang/Object;",
        "ui-text_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(ILjava/lang/Object;Lew1;LJw1;I)Ljava/lang/Object;
    .locals 5

    const-string v0, "typeface"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "font"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestedWeight"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Landroid/graphics/Typeface;

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    invoke-static {p0}, LFw1;->k(I)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Lew1;->b()LJw1;

    move-result-object v0

    invoke-static {v0, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, LJw1;->c:LJw1$a;

    invoke-static {v0}, LMc;->a(LJw1$a;)LJw1;

    move-result-object v3

    invoke-virtual {p3, v3}, LJw1;->j(LJw1;)I

    move-result v3

    if-ltz v3, :cond_1

    invoke-interface {p2}, Lew1;->b()LJw1;

    move-result-object v3

    invoke-static {v0}, LMc;->a(LJw1$a;)LJw1;

    move-result-object v0

    invoke-virtual {v3, v0}, LJw1;->j(LJw1;)I

    move-result v0

    if-gez v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    invoke-static {p0}, LFw1;->j(I)Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-interface {p2}, Lew1;->c()I

    move-result p0

    invoke-static {p4, p0}, LEw1;->f(II)Z

    move-result p0

    if-nez p0, :cond_2

    move p0, v1

    goto :goto_1

    :cond_2
    move p0, v2

    :goto_1
    if-nez p0, :cond_3

    if-nez v0, :cond_3

    return-object p1

    :cond_3
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1c

    if-ge v3, v4, :cond_5

    if-eqz p0, :cond_4

    sget-object p0, LEw1;->b:LEw1$a;

    invoke-virtual {p0}, LEw1$a;->a()I

    move-result p0

    invoke-static {p4, p0}, LEw1;->f(II)Z

    move-result p0

    if-eqz p0, :cond_4

    goto :goto_2

    :cond_4
    move v1, v2

    :goto_2
    invoke-static {v0, v1}, LMc;->b(ZZ)I

    move-result p0

    check-cast p1, Landroid/graphics/Typeface;

    invoke-static {p1, p0}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p0

    goto :goto_5

    :cond_5
    if-eqz v0, :cond_6

    invoke-virtual {p3}, LJw1;->k()I

    move-result p3

    goto :goto_3

    :cond_6
    invoke-interface {p2}, Lew1;->b()LJw1;

    move-result-object p3

    invoke-virtual {p3}, LJw1;->k()I

    move-result p3

    :goto_3
    if-eqz p0, :cond_7

    sget-object p0, LEw1;->b:LEw1$a;

    invoke-virtual {p0}, LEw1$a;->a()I

    move-result p0

    invoke-static {p4, p0}, LEw1;->f(II)Z

    move-result p0

    goto :goto_4

    :cond_7
    invoke-interface {p2}, Lew1;->c()I

    move-result p0

    sget-object p2, LEw1;->b:LEw1$a;

    invoke-virtual {p2}, LEw1$a;->a()I

    move-result p2

    invoke-static {p0, p2}, LEw1;->f(II)Z

    move-result p0

    :goto_4
    sget-object p2, Lzc6;->a:Lzc6;

    check-cast p1, Landroid/graphics/Typeface;

    invoke-virtual {p2, p1, p3, p0}, Lzc6;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p0

    :goto_5
    const-string p1, "if (Build.VERSION.SDK_IN\u2026ht, finalFontStyle)\n    }"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
