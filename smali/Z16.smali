.class public final LZ16;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a\u000c\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a\u000c\u0010\n\u001a\u00020\t*\u00020\u0008H\u0000\u001a\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002\u00a8\u0006\u0010"
    }
    d2 = {
        "Landroid/view/inputmethod/EditorInfo;",
        "",
        "i",
        "LGY1;",
        "imeOptions",
        "LF16;",
        "textFieldValue",
        "h",
        "Landroid/view/Choreographer;",
        "Ljava/util/concurrent/Executor;",
        "d",
        "",
        "bits",
        "flag",
        "",
        "g",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static synthetic a(Ljava/lang/Runnable;J)V
    .locals 0

    invoke-static {p0, p1, p2}, LZ16;->f(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public static synthetic b(Landroid/view/Choreographer;Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p0, p1}, LZ16;->e(Landroid/view/Choreographer;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static final synthetic c(Landroid/view/inputmethod/EditorInfo;)V
    .locals 0

    invoke-static {p0}, LZ16;->i(Landroid/view/inputmethod/EditorInfo;)V

    return-void
.end method

.method public static final d(Landroid/view/Choreographer;)Ljava/util/concurrent/Executor;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LX16;

    invoke-direct {v0, p0}, LX16;-><init>(Landroid/view/Choreographer;)V

    return-object v0
.end method

.method public static final e(Landroid/view/Choreographer;Ljava/lang/Runnable;)V
    .locals 1

    const-string v0, "$this_asExecutor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LY16;

    invoke-direct {v0, p1}, LY16;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p0, v0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    return-void
.end method

.method public static final f(Ljava/lang/Runnable;J)V
    .locals 0

    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public static final g(II)Z
    .locals 0

    and-int/2addr p0, p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final h(Landroid/view/inputmethod/EditorInfo;LGY1;LF16;)V
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imeOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textFieldValue"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LGY1;->d()I

    move-result v0

    sget-object v1, LFY1;->b:LFY1$a;

    invoke-virtual {v1}, LFY1$a;->a()I

    move-result v2

    invoke-static {v0, v2}, LFY1;->l(II)Z

    move-result v2

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x6

    const/4 v6, 0x1

    if-eqz v2, :cond_1

    invoke-virtual {p1}, LGY1;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, LFY1$a;->e()I

    move-result v2

    invoke-static {v0, v2}, LFY1;->l(II)Z

    move-result v2

    if-eqz v2, :cond_2

    move v5, v6

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, LFY1$a;->c()I

    move-result v2

    invoke-static {v0, v2}, LFY1;->l(II)Z

    move-result v2

    if-eqz v2, :cond_3

    move v5, v4

    goto :goto_0

    :cond_3
    invoke-virtual {v1}, LFY1$a;->d()I

    move-result v2

    invoke-static {v0, v2}, LFY1;->l(II)Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v5, 0x5

    goto :goto_0

    :cond_4
    invoke-virtual {v1}, LFY1$a;->f()I

    move-result v2

    invoke-static {v0, v2}, LFY1;->l(II)Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v5, 0x7

    goto :goto_0

    :cond_5
    invoke-virtual {v1}, LFY1$a;->g()I

    move-result v2

    invoke-static {v0, v2}, LFY1;->l(II)Z

    move-result v2

    if-eqz v2, :cond_6

    move v5, v3

    goto :goto_0

    :cond_6
    invoke-virtual {v1}, LFY1$a;->h()I

    move-result v2

    invoke-static {v0, v2}, LFY1;->l(II)Z

    move-result v2

    if-eqz v2, :cond_7

    const/4 v5, 0x4

    goto :goto_0

    :cond_7
    invoke-virtual {v1}, LFY1$a;->b()I

    move-result v2

    invoke-static {v0, v2}, LFY1;->l(II)Z

    move-result v0

    if-eqz v0, :cond_16

    :goto_0
    iput v5, p0, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    invoke-virtual {p1}, LGY1;->e()I

    move-result v0

    sget-object v2, Lcl2;->b:Lcl2$a;

    invoke-virtual {v2}, Lcl2$a;->h()I

    move-result v5

    invoke-static {v0, v5}, Lcl2;->m(II)Z

    move-result v5

    if-eqz v5, :cond_8

    iput v6, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    goto/16 :goto_1

    :cond_8
    invoke-virtual {v2}, Lcl2$a;->a()I

    move-result v5

    invoke-static {v0, v5}, Lcl2;->m(II)Z

    move-result v5

    if-eqz v5, :cond_9

    iput v6, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    iget v0, p0, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    const/high16 v2, -0x80000000

    or-int/2addr v0, v2

    iput v0, p0, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    goto :goto_1

    :cond_9
    invoke-virtual {v2}, Lcl2$a;->d()I

    move-result v5

    invoke-static {v0, v5}, Lcl2;->m(II)Z

    move-result v5

    if-eqz v5, :cond_a

    iput v4, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    goto :goto_1

    :cond_a
    invoke-virtual {v2}, Lcl2$a;->g()I

    move-result v4

    invoke-static {v0, v4}, Lcl2;->m(II)Z

    move-result v4

    if-eqz v4, :cond_b

    iput v3, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    goto :goto_1

    :cond_b
    invoke-virtual {v2}, Lcl2$a;->i()I

    move-result v3

    invoke-static {v0, v3}, Lcl2;->m(II)Z

    move-result v3

    if-eqz v3, :cond_c

    const/16 v0, 0x11

    iput v0, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    goto :goto_1

    :cond_c
    invoke-virtual {v2}, Lcl2$a;->c()I

    move-result v3

    invoke-static {v0, v3}, Lcl2;->m(II)Z

    move-result v3

    if-eqz v3, :cond_d

    const/16 v0, 0x21

    iput v0, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    goto :goto_1

    :cond_d
    invoke-virtual {v2}, Lcl2$a;->f()I

    move-result v3

    invoke-static {v0, v3}, Lcl2;->m(II)Z

    move-result v3

    if-eqz v3, :cond_e

    const/16 v0, 0x81

    iput v0, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    goto :goto_1

    :cond_e
    invoke-virtual {v2}, Lcl2$a;->e()I

    move-result v3

    invoke-static {v0, v3}, Lcl2;->m(II)Z

    move-result v3

    if-eqz v3, :cond_f

    const/16 v0, 0x12

    iput v0, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    goto :goto_1

    :cond_f
    invoke-virtual {v2}, Lcl2$a;->b()I

    move-result v2

    invoke-static {v0, v2}, Lcl2;->m(II)Z

    move-result v0

    if-eqz v0, :cond_15

    const/16 v0, 0x2002

    iput v0, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    :goto_1
    invoke-virtual {p1}, LGY1;->f()Z

    move-result v0

    if-nez v0, :cond_10

    iget v0, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    invoke-static {v0, v6}, LZ16;->g(II)Z

    move-result v0

    if-eqz v0, :cond_10

    iget v0, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    const/high16 v2, 0x20000

    or-int/2addr v0, v2

    iput v0, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    invoke-virtual {p1}, LGY1;->d()I

    move-result v0

    invoke-virtual {v1}, LFY1$a;->a()I

    move-result v1

    invoke-static {v0, v1}, LFY1;->l(II)Z

    move-result v0

    if-eqz v0, :cond_10

    iget v0, p0, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    const/high16 v1, 0x40000000    # 2.0f

    or-int/2addr v0, v1

    iput v0, p0, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    :cond_10
    iget v0, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    invoke-static {v0, v6}, LZ16;->g(II)Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-virtual {p1}, LGY1;->c()I

    move-result v0

    sget-object v1, Lal2;->a:Lal2$a;

    invoke-virtual {v1}, Lal2$a;->a()I

    move-result v2

    invoke-static {v0, v2}, Lal2;->f(II)Z

    move-result v2

    if-eqz v2, :cond_11

    iget v0, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    or-int/lit16 v0, v0, 0x1000

    iput v0, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    goto :goto_2

    :cond_11
    invoke-virtual {v1}, Lal2$a;->d()I

    move-result v2

    invoke-static {v0, v2}, Lal2;->f(II)Z

    move-result v2

    if-eqz v2, :cond_12

    iget v0, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    or-int/lit16 v0, v0, 0x2000

    iput v0, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    goto :goto_2

    :cond_12
    invoke-virtual {v1}, Lal2$a;->c()I

    move-result v1

    invoke-static {v0, v1}, Lal2;->f(II)Z

    move-result v0

    if-eqz v0, :cond_13

    iget v0, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    or-int/lit16 v0, v0, 0x4000

    iput v0, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    :cond_13
    :goto_2
    invoke-virtual {p1}, LGY1;->b()Z

    move-result p1

    if-eqz p1, :cond_14

    iget p1, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    const v0, 0x8000

    or-int/2addr p1, v0

    iput p1, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    :cond_14
    invoke-virtual {p2}, LF16;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Ls26;->n(J)I

    move-result p1

    iput p1, p0, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    invoke-virtual {p2}, LF16;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Ls26;->i(J)I

    move-result p1

    iput p1, p0, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    invoke-virtual {p2}, LF16;->h()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, LX91;->f(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    iget p1, p0, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    const/high16 p2, 0x2000000

    or-int/2addr p1, p2

    iput p1, p0, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    return-void

    :cond_15
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Invalid Keyboard Type"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_16
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "invalid ImeAction"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final i(Landroid/view/inputmethod/EditorInfo;)V
    .locals 1

    invoke-static {}, Landroidx/emoji2/text/c;->k()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Landroidx/emoji2/text/c;->c()Landroidx/emoji2/text/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/emoji2/text/c;->x(Landroid/view/inputmethod/EditorInfo;)V

    return-void
.end method
