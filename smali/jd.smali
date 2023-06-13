.class public final Ljd;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000[\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\u0008\u0002\n\u0002\u0008\u0004*\u0001\u001a\u001a\u0083\u0001\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\u00070\u00062\u0006\u0010\r\u001a\u00020\u000c2&\u0010\u0014\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000\u00f8\u0001\u0000\u001a\u000c\u0010\u0019\u001a\u00020\u0015*\u00020\u0004H\u0000\"\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u001b\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u001d"
    }
    d2 = {
        "",
        "text",
        "",
        "contextFontSize",
        "LG26;",
        "contextTextStyle",
        "",
        "LDf$b;",
        "LGN5;",
        "spanStyles",
        "LTU3;",
        "placeholders",
        "Lg01;",
        "density",
        "Lkotlin/Function4;",
        "Lkw1;",
        "LJw1;",
        "LEw1;",
        "LFw1;",
        "Landroid/graphics/Typeface;",
        "resolveTypeface",
        "",
        "useEmojiCompat",
        "",
        "a",
        "b",
        "jd$a",
        "Ljd$a;",
        "NoopSpan",
        "ui-text_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Ljd$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljd$a;

    invoke-direct {v0}, Ljd$a;-><init>()V

    sput-object v0, Ljd;->a:Ljd$a;

    return-void
.end method

.method public static final a(Ljava/lang/String;FLG26;Ljava/util/List;Ljava/util/List;Lg01;Lkotlin/jvm/functions/Function4;Z)Ljava/lang/CharSequence;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "F",
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
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Lkw1;",
            "-",
            "LJw1;",
            "-",
            "LEw1;",
            "-",
            "LFw1;",
            "+",
            "Landroid/graphics/Typeface;",
            ">;Z)",
            "Ljava/lang/CharSequence;"
        }
    .end annotation

    const-string v0, "text"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contextTextStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "spanStyles"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "placeholders"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "density"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resolveTypeface"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p7, :cond_0

    invoke-static {}, Landroidx/emoji2/text/c;->k()Z

    move-result p7

    if-eqz p7, :cond_0

    invoke-static {}, Landroidx/emoji2/text/c;->c()Landroidx/emoji2/text/c;

    move-result-object p7

    invoke-virtual {p7, p0}, Landroidx/emoji2/text/c;->r(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p7

    invoke-static {p7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    move-object p7, p0

    :goto_0
    const-string v0, "if (useEmojiCompat && Em\u2026else {\n        text\n    }"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, LG26;->F()LN16;

    move-result-object v0

    sget-object v1, LN16;->c:LN16$a;

    invoke-virtual {v1}, LN16$a;->a()LN16;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, LG26;->u()J

    move-result-wide v0

    invoke-static {v0, v1}, LN26;->g(J)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p7

    :cond_1
    instance-of v0, p7, Landroid/text/Spannable;

    if-eqz v0, :cond_2

    check-cast p7, Landroid/text/Spannable;

    goto :goto_1

    :cond_2
    new-instance v0, Landroid/text/SpannableString;

    invoke-direct {v0, p7}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object p7, v0

    :goto_1
    invoke-virtual {p2}, LG26;->C()LR06;

    move-result-object v0

    sget-object v1, LR06;->b:LR06$a;

    invoke-virtual {v1}, LR06$a;->d()LR06;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Ljd;->a:Ljd$a;

    const/4 v1, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    invoke-static {p7, v0, v1, p0}, LJN5;->t(Landroid/text/Spannable;Ljava/lang/Object;II)V

    :cond_3
    invoke-static {p2}, Ljd;->b(LG26;)Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-virtual {p2}, LG26;->v()Lor2;

    move-result-object p0

    if-nez p0, :cond_4

    invoke-virtual {p2}, LG26;->u()J

    move-result-wide v0

    invoke-static {p7, v0, v1, p1, p5}, LJN5;->q(Landroid/text/Spannable;JFLg01;)V

    goto :goto_2

    :cond_4
    invoke-virtual {p2}, LG26;->v()Lor2;

    move-result-object p0

    if-nez p0, :cond_5

    sget-object p0, Lor2;->c:Lor2$b;

    invoke-virtual {p0}, Lor2$b;->a()Lor2;

    move-result-object p0

    :cond_5
    move-object v6, p0

    invoke-virtual {p2}, LG26;->u()J

    move-result-wide v2

    move-object v1, p7

    move v4, p1

    move-object v5, p5

    invoke-static/range {v1 .. v6}, LJN5;->p(Landroid/text/Spannable;JFLg01;Lor2;)V

    :goto_2
    invoke-virtual {p2}, LG26;->F()LN16;

    move-result-object p0

    invoke-static {p7, p0, p1, p5}, LJN5;->x(Landroid/text/Spannable;LN16;FLg01;)V

    invoke-static {p7, p2, p3, p5, p6}, LJN5;->v(Landroid/text/Spannable;LG26;Ljava/util/List;Lg01;Lkotlin/jvm/functions/Function4;)V

    invoke-static {p7, p4, p5}, LUU3;->d(Landroid/text/Spannable;Ljava/util/List;Lg01;)V

    return-object p7
.end method

.method public static final b(LG26;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LG26;->y()LlW3;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LlW3;->a()LZV3;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LZV3;->c()Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    :goto_0
    return p0
.end method
