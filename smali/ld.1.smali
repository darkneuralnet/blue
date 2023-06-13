.class public final Lld;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001a-\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001aP\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u000c0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u000c0\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000\"\u0018\u0010\u001a\u001a\u00020\u0017*\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "LW06;",
        "textDirection",
        "Luv2;",
        "localeList",
        "",
        "d",
        "(LW06;Luv2;)I",
        "",
        "text",
        "LG26;",
        "style",
        "",
        "LDf$b;",
        "LGN5;",
        "spanStyles",
        "LTU3;",
        "placeholders",
        "Lg01;",
        "density",
        "Lkw1$b;",
        "fontFamilyResolver",
        "LAE3;",
        "a",
        "",
        "c",
        "(LG26;)Z",
        "hasEmojiCompat",
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
.method public static final a(Ljava/lang/String;LG26;Ljava/util/List;Ljava/util/List;Lg01;Lkw1$b;)LAE3;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LG26;",
            "Ljava/util/List<",
            "LDf$b<",
            "LGN5;",
            ">;>;",
            "Ljava/util/List<",
            "LDf$b<",
            "LTU3;",
            ">;>;",
            "Lg01;",
            "Lkw1$b;",
            ")",
            "LAE3;"
        }
    .end annotation

    const-string v0, "text"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "spanStyles"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "placeholders"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "density"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fontFamilyResolver"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkd;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p5

    move-object v7, p4

    invoke-direct/range {v1 .. v7}, Lkd;-><init>(Ljava/lang/String;LG26;Ljava/util/List;Ljava/util/List;Lkw1$b;Lg01;)V

    return-object v0
.end method

.method public static final synthetic b(LG26;)Z
    .locals 0

    invoke-static {p0}, Lld;->c(LG26;)Z

    move-result p0

    return p0
.end method

.method public static final c(LG26;)Z
    .locals 1

    invoke-virtual {p0}, LG26;->y()LlW3;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LlW3;->a()LZV3;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LZV3;->b()I

    move-result p0

    invoke-static {p0}, LHa1;->c(I)LHa1;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    sget-object v0, LHa1;->b:LHa1$a;

    invoke-virtual {v0}, LHa1$a;->b()I

    move-result v0

    if-nez p0, :cond_1

    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LHa1;->i()I

    move-result p0

    invoke-static {p0, v0}, LHa1;->f(II)Z

    move-result p0

    :goto_1
    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static final d(LW06;Luv2;)I
    .locals 6

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LW06;->l()I

    move-result p0

    goto :goto_0

    :cond_0
    sget-object p0, LW06;->b:LW06$a;

    invoke-virtual {p0}, LW06$a;->a()I

    move-result p0

    :goto_0
    sget-object v0, LW06;->b:LW06$a;

    invoke-virtual {v0}, LW06$a;->b()I

    move-result v1

    invoke-static {p0, v1}, LW06;->i(II)Z

    move-result v1

    const/4 v2, 0x2

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, LW06$a;->c()I

    move-result v1

    invoke-static {p0, v1}, LW06;->i(II)Z

    move-result v1

    const/4 v3, 0x3

    if-eqz v1, :cond_3

    :cond_2
    move v2, v3

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, LW06$a;->d()I

    move-result v1

    invoke-static {p0, v1}, LW06;->i(II)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_4

    move v2, v4

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, LW06$a;->e()I

    move-result v1

    invoke-static {p0, v1}, LW06;->i(II)Z

    move-result v1

    const/4 v5, 0x1

    if-eqz v1, :cond_5

    move v2, v5

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, LW06$a;->a()I

    move-result v0

    invoke-static {p0, v0}, LW06;->i(II)Z

    move-result p0

    if-eqz p0, :cond_9

    if-eqz p1, :cond_6

    invoke-virtual {p1, v4}, Luv2;->b(I)Lqv2;

    move-result-object p0

    invoke-virtual {p0}, Lqv2;->b()LBV3;

    move-result-object p0

    const-string p1, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, LYc;

    invoke-virtual {p0}, LYc;->c()Ljava/util/Locale;

    move-result-object p0

    if-nez p0, :cond_7

    :cond_6
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p0

    :cond_7
    invoke-static {p0}, LP26;->a(Ljava/util/Locale;)I

    move-result p0

    if-eqz p0, :cond_8

    if-eq p0, v5, :cond_2

    :cond_8
    :goto_1
    return v2

    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Invalid TextDirection."

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
