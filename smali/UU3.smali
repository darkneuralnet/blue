.class public final LUU3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a(\u0010\u0008\u001a\u00020\u0007*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a,\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\"!\u0010\u0013\u001a\u00020\n*\u00020\u000e8BX\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u000c\u0012\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u000f\u0010\u0010\"!\u0010\u0019\u001a\u00020\n*\u00020\u00148BX\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u000c\u0012\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Landroid/text/Spannable;",
        "",
        "LDf$b;",
        "LTU3;",
        "placeholders",
        "Lg01;",
        "density",
        "",
        "d",
        "placeholder",
        "",
        "start",
        "end",
        "c",
        "LM26;",
        "a",
        "(J)I",
        "getSpanUnit--R2X_6o$annotations",
        "(J)V",
        "spanUnit",
        "LXU3;",
        "b",
        "(I)I",
        "getSpanVerticalAlign-do9X-Gg$annotations",
        "(I)V",
        "spanVerticalAlign",
        "ui-text_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPlaceholderExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/PlaceholderExtensions_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,93:1\n33#2,6:94\n13579#3,2:100\n*S KotlinDebug\n*F\n+ 1 PlaceholderExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/PlaceholderExtensions_androidKt\n*L\n35#1:94,6\n48#1:100,2\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(J)I
    .locals 3

    invoke-static {p0, p1}, LM26;->g(J)J

    move-result-wide p0

    sget-object v0, LO26;->b:LO26$a;

    invoke-virtual {v0}, LO26$a;->b()J

    move-result-wide v1

    invoke-static {p0, p1, v1, v2}, LO26;->g(JJ)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LO26$a;->a()J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, LO26;->g(JJ)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x2

    :goto_0
    return p0
.end method

.method public static final b(I)I
    .locals 2

    sget-object v0, LXU3;->a:LXU3$a;

    invoke-virtual {v0}, LXU3$a;->a()I

    move-result v1

    invoke-static {p0, v1}, LXU3;->i(II)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LXU3$a;->g()I

    move-result v1

    invoke-static {p0, v1}, LXU3;->i(II)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, LXU3$a;->b()I

    move-result v1

    invoke-static {p0, v1}, LXU3;->i(II)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 p0, 0x2

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, LXU3$a;->c()I

    move-result v1

    invoke-static {p0, v1}, LXU3;->i(II)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 p0, 0x3

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, LXU3$a;->f()I

    move-result v1

    invoke-static {p0, v1}, LXU3;->i(II)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 p0, 0x4

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, LXU3$a;->d()I

    move-result v1

    invoke-static {p0, v1}, LXU3;->i(II)Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 p0, 0x5

    goto :goto_0

    :cond_5
    invoke-virtual {v0}, LXU3$a;->e()I

    move-result v0

    invoke-static {p0, v0}, LXU3;->i(II)Z

    move-result p0

    if-eqz p0, :cond_6

    const/4 p0, 0x6

    :goto_0
    return p0

    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Invalid PlaceholderVerticalAlign"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final c(Landroid/text/Spannable;LTU3;IILg01;)V
    .locals 10

    const-class v0, LGa1;

    invoke-interface {p0, p2, p3, v0}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getSpans(start, end, EmojiSpan::class.java)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    check-cast v3, LGa1;

    invoke-interface {p0, v3}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, LVU3;

    invoke-virtual {p1}, LTU3;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, LM26;->h(J)F

    move-result v4

    invoke-virtual {p1}, LTU3;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, LUU3;->a(J)I

    move-result v5

    invoke-virtual {p1}, LTU3;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, LM26;->h(J)F

    move-result v6

    invoke-virtual {p1}, LTU3;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, LUU3;->a(J)I

    move-result v7

    invoke-interface {p4}, Lg01;->R0()F

    move-result v1

    invoke-interface {p4}, Lg01;->b()F

    move-result p4

    mul-float v8, v1, p4

    invoke-virtual {p1}, LTU3;->b()I

    move-result p1

    invoke-static {p1}, LUU3;->b(I)I

    move-result v9

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, LVU3;-><init>(FIFIFI)V

    invoke-static {p0, v0, p2, p3}, LJN5;->t(Landroid/text/Spannable;Ljava/lang/Object;II)V

    return-void
.end method

.method public static final d(Landroid/text/Spannable;Ljava/util/List;Lg01;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/text/Spannable;",
            "Ljava/util/List<",
            "LDf$b<",
            "LTU3;",
            ">;>;",
            "Lg01;",
            ")V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "placeholders"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "density"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LDf$b;

    invoke-virtual {v2}, LDf$b;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LTU3;

    invoke-virtual {v2}, LDf$b;->b()I

    move-result v4

    invoke-virtual {v2}, LDf$b;->c()I

    move-result v2

    invoke-static {p0, v3, v4, v2, p2}, LUU3;->c(Landroid/text/Spannable;LTU3;IILg01;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
