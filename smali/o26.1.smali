.class public final Lo26;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u001aS\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012&\u0010\t\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cH\u0000\u00f8\u0001\u0000\u001a9\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a\u0016\u0010\u001a\u001a\u00020\u0019*\u00020\u00002\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000\u001a\u000c\u0010\u001b\u001a\u00020\u000c*\u00020\u0001H\u0000\u001a\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u001f"
    }
    d2 = {
        "LQd;",
        "LGN5;",
        "style",
        "Lkotlin/Function4;",
        "Lkw1;",
        "LJw1;",
        "LEw1;",
        "LFw1;",
        "Landroid/graphics/Typeface;",
        "resolveTypeface",
        "Lg01;",
        "density",
        "",
        "requiresLetterSpacing",
        "a",
        "LM26;",
        "letterSpacing",
        "Lpm0;",
        "background",
        "LHE;",
        "baselineShift",
        "c",
        "(JZJLHE;)LGN5;",
        "Ll26;",
        "textMotion",
        "",
        "e",
        "d",
        "",
        "blurRadius",
        "b",
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
.method public static final a(LQd;LGN5;Lkotlin/jvm/functions/Function4;Lg01;Z)LGN5;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LQd;",
            "LGN5;",
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
            ">;",
            "Lg01;",
            "Z)",
            "LGN5;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resolveTypeface"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "density"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LGN5;->k()J

    move-result-wide v0

    invoke-static {v0, v1}, LM26;->g(J)J

    move-result-wide v0

    sget-object v2, LO26;->b:LO26$a;

    invoke-virtual {v2}, LO26$a;->b()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, LO26;->g(JJ)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p1}, LGN5;->k()J

    move-result-wide v0

    invoke-interface {p3, v0, v1}, Lg01;->I0(J)F

    move-result v0

    invoke-virtual {p0, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, LO26$a;->a()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, LO26;->g(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/graphics/Paint;->getTextSize()F

    move-result v0

    invoke-virtual {p1}, LGN5;->k()J

    move-result-wide v3

    invoke-static {v3, v4}, LM26;->h(J)F

    move-result v1

    mul-float/2addr v0, v1

    invoke-virtual {p0, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    :cond_1
    :goto_0
    invoke-static {p1}, Lo26;->d(LGN5;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, LGN5;->i()Lkw1;

    move-result-object v0

    invoke-virtual {p1}, LGN5;->n()LJw1;

    move-result-object v1

    if-nez v1, :cond_2

    sget-object v1, LJw1;->c:LJw1$a;

    invoke-virtual {v1}, LJw1$a;->d()LJw1;

    move-result-object v1

    :cond_2
    invoke-virtual {p1}, LGN5;->l()LEw1;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, LEw1;->i()I

    move-result v3

    goto :goto_1

    :cond_3
    sget-object v3, LEw1;->b:LEw1$a;

    invoke-virtual {v3}, LEw1$a;->b()I

    move-result v3

    :goto_1
    invoke-static {v3}, LEw1;->c(I)LEw1;

    move-result-object v3

    invoke-virtual {p1}, LGN5;->m()LFw1;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, LFw1;->m()I

    move-result v4

    goto :goto_2

    :cond_4
    sget-object v4, LFw1;->b:LFw1$a;

    invoke-virtual {v4}, LFw1$a;->a()I

    move-result v4

    :goto_2
    invoke-static {v4}, LFw1;->e(I)LFw1;

    move-result-object v4

    invoke-interface {p2, v0, v1, v3, v4}, Lkotlin/jvm/functions/Function4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/graphics/Typeface;

    invoke-virtual {p0, p2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    :cond_5
    invoke-virtual {p1}, LGN5;->p()Luv2;

    move-result-object p2

    if-eqz p2, :cond_6

    invoke-virtual {p1}, LGN5;->p()Luv2;

    move-result-object p2

    sget-object v0, Luv2;->d:Luv2$a;

    invoke-virtual {v0}, Luv2$a;->a()Luv2;

    move-result-object v0

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_6

    sget-object p2, Lwv2;->a:Lwv2;

    invoke-virtual {p1}, LGN5;->p()Luv2;

    move-result-object v0

    invoke-virtual {p2, p0, v0}, Lwv2;->b(LQd;Luv2;)V

    :cond_6
    invoke-virtual {p1}, LGN5;->j()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_7

    invoke-virtual {p1}, LGN5;->j()Ljava/lang/String;

    move-result-object p2

    const-string v0, ""

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    invoke-virtual {p1}, LGN5;->j()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    :cond_7
    invoke-virtual {p1}, LGN5;->u()LL16;

    move-result-object p2

    if-eqz p2, :cond_8

    invoke-virtual {p1}, LGN5;->u()LL16;

    move-result-object p2

    sget-object v0, LL16;->c:LL16$a;

    invoke-virtual {v0}, LL16$a;->a()LL16;

    move-result-object v0

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_8

    invoke-virtual {p0}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result p2

    invoke-virtual {p1}, LGN5;->u()LL16;

    move-result-object v0

    invoke-virtual {v0}, LL16;->b()F

    move-result v0

    mul-float/2addr p2, v0

    invoke-virtual {p0, p2}, Landroid/graphics/Paint;->setTextScaleX(F)V

    invoke-virtual {p0}, Landroid/graphics/Paint;->getTextSkewX()F

    move-result p2

    invoke-virtual {p1}, LGN5;->u()LL16;

    move-result-object v0

    invoke-virtual {v0}, LL16;->c()F

    move-result v0

    add-float/2addr p2, v0

    invoke-virtual {p0, p2}, Landroid/graphics/Paint;->setTextSkewX(F)V

    :cond_8
    invoke-virtual {p1}, LGN5;->g()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LQd;->d(J)V

    invoke-virtual {p1}, LGN5;->f()La30;

    move-result-object p2

    sget-object v0, LxB5;->b:LxB5$a;

    invoke-virtual {v0}, LxB5$a;->a()J

    move-result-wide v0

    invoke-virtual {p1}, LGN5;->c()F

    move-result v3

    invoke-virtual {p0, p2, v0, v1, v3}, LQd;->c(La30;JF)V

    invoke-virtual {p1}, LGN5;->r()LPx5;

    move-result-object p2

    invoke-virtual {p0, p2}, LQd;->f(LPx5;)V

    invoke-virtual {p1}, LGN5;->s()LR06;

    move-result-object p2

    invoke-virtual {p0, p2}, LQd;->g(LR06;)V

    invoke-virtual {p1}, LGN5;->h()LJ61;

    move-result-object p2

    invoke-virtual {p0, p2}, LQd;->e(LJ61;)V

    invoke-virtual {p1}, LGN5;->o()J

    move-result-wide v0

    invoke-static {v0, v1}, LM26;->g(J)J

    move-result-wide v0

    invoke-virtual {v2}, LO26$a;->b()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, LO26;->g(JJ)Z

    move-result p2

    if-eqz p2, :cond_b

    invoke-virtual {p1}, LGN5;->o()J

    move-result-wide v0

    invoke-static {v0, v1}, LM26;->h(J)F

    move-result p2

    const/4 v0, 0x0

    cmpg-float p2, p2, v0

    const/4 v1, 0x1

    const/4 v3, 0x0

    if-nez p2, :cond_9

    move p2, v1

    goto :goto_3

    :cond_9
    move p2, v3

    :goto_3
    if-nez p2, :cond_b

    invoke-virtual {p0}, Landroid/graphics/Paint;->getTextSize()F

    move-result p2

    invoke-virtual {p0}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v2

    mul-float/2addr p2, v2

    invoke-virtual {p1}, LGN5;->o()J

    move-result-wide v4

    invoke-interface {p3, v4, v5}, Lg01;->I0(J)F

    move-result p3

    cmpg-float v0, p2, v0

    if-nez v0, :cond_a

    goto :goto_4

    :cond_a
    move v1, v3

    :goto_4
    if-nez v1, :cond_c

    div-float/2addr p3, p2

    invoke-virtual {p0, p3}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    goto :goto_5

    :cond_b
    invoke-virtual {p1}, LGN5;->o()J

    move-result-wide p2

    invoke-static {p2, p3}, LM26;->g(J)J

    move-result-wide p2

    invoke-virtual {v2}, LO26$a;->a()J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, LO26;->g(JJ)Z

    move-result p2

    if-eqz p2, :cond_c

    invoke-virtual {p1}, LGN5;->o()J

    move-result-wide p2

    invoke-static {p2, p3}, LM26;->h(J)F

    move-result p2

    invoke-virtual {p0, p2}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    :cond_c
    :goto_5
    invoke-virtual {p1}, LGN5;->o()J

    move-result-wide v0

    invoke-virtual {p1}, LGN5;->d()J

    move-result-wide v3

    invoke-virtual {p1}, LGN5;->e()LHE;

    move-result-object v5

    move v2, p4

    invoke-static/range {v0 .. v5}, Lo26;->c(JZJLHE;)LGN5;

    move-result-object p0

    return-object p0
.end method

.method public static final b(F)F
    .locals 1

    const/4 v0, 0x0

    cmpg-float v0, p0, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    const/4 p0, 0x1

    :cond_1
    return p0
.end method

.method public static final c(JZJLHE;)LGN5;
    .locals 30

    move-wide/from16 v0, p3

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p2, :cond_1

    invoke-static/range {p0 .. p1}, LM26;->g(J)J

    move-result-wide v4

    sget-object v6, LO26;->b:LO26$a;

    invoke-virtual {v6}, LO26$a;->b()J

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, LO26;->g(JJ)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static/range {p0 .. p1}, LM26;->h(J)F

    move-result v4

    const/4 v5, 0x0

    cmpg-float v4, v4, v5

    if-nez v4, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    if-nez v4, :cond_1

    move v4, v2

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_1
    sget-object v5, Lpm0;->b:Lpm0$a;

    invoke-virtual {v5}, Lpm0$a;->g()J

    move-result-wide v6

    invoke-static {v0, v1, v6, v7}, Lpm0;->o(JJ)Z

    move-result v6

    if-nez v6, :cond_2

    invoke-virtual {v5}, Lpm0$a;->f()J

    move-result-wide v6

    invoke-static {v0, v1, v6, v7}, Lpm0;->o(JJ)Z

    move-result v6

    if-nez v6, :cond_2

    move v6, v2

    goto :goto_2

    :cond_2
    move v6, v3

    :goto_2
    if-eqz p5, :cond_3

    sget-object v7, LHE;->b:LHE$a;

    invoke-virtual {v7}, LHE$a;->a()F

    move-result v7

    invoke-virtual/range {p5 .. p5}, LHE;->h()F

    move-result v8

    invoke-static {v8, v7}, LHE;->e(FF)Z

    move-result v7

    if-nez v7, :cond_3

    goto :goto_3

    :cond_3
    move v2, v3

    :goto_3
    const/4 v3, 0x0

    if-nez v4, :cond_4

    if-nez v6, :cond_4

    if-nez v2, :cond_4

    goto :goto_7

    :cond_4
    if-eqz v4, :cond_5

    move-wide/from16 v19, p0

    goto :goto_4

    :cond_5
    sget-object v4, LM26;->b:LM26$a;

    invoke-virtual {v4}, LM26$a;->a()J

    move-result-wide v7

    move-wide/from16 v19, v7

    :goto_4
    if-eqz v6, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {v5}, Lpm0$a;->g()J

    move-result-wide v0

    :goto_5
    move-wide/from16 v24, v0

    if-eqz v2, :cond_7

    move-object/from16 v21, p5

    goto :goto_6

    :cond_7
    move-object/from16 v21, v3

    :goto_6
    new-instance v3, LGN5;

    move-object v9, v3

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x367f

    const/16 v29, 0x0

    invoke-direct/range {v9 .. v29}, LGN5;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_7
    return-object v3
.end method

.method public static final d(LGN5;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LGN5;->i()Lkw1;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, LGN5;->l()LEw1;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, LGN5;->n()LJw1;

    move-result-object p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final e(LQd;Ll26;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    sget-object p1, Ll26;->c:Ll26$a;

    invoke-virtual {p1}, Ll26$a;->a()Ll26;

    move-result-object p1

    :cond_0
    invoke-virtual {p1}, Ll26;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/graphics/Paint;->getFlags()I

    move-result v0

    or-int/lit16 v0, v0, 0x80

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/graphics/Paint;->getFlags()I

    move-result v0

    and-int/lit16 v0, v0, -0x81

    :goto_0
    invoke-virtual {p0, v0}, Landroid/graphics/Paint;->setFlags(I)V

    invoke-virtual {p1}, Ll26;->b()I

    move-result p1

    sget-object v0, Ll26$b;->a:Ll26$b$a;

    invoke-virtual {v0}, Ll26$b$a;->b()I

    move-result v1

    invoke-static {p1, v1}, Ll26$b;->e(II)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Landroid/graphics/Paint;->getFlags()I

    move-result p1

    or-int/lit8 p1, p1, 0x40

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setFlags(I)V

    invoke-virtual {p0, v2}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Ll26$b$a;->a()I

    move-result v1

    invoke-static {p1, v1}, Ll26$b;->e(II)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Landroid/graphics/Paint;->getFlags()I

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Ll26$b$a;->c()I

    move-result v0

    invoke-static {p1, v0}, Ll26$b;->e(II)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Landroid/graphics/Paint;->getFlags()I

    invoke-virtual {p0, v2}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Landroid/graphics/Paint;->getFlags()I

    :goto_1
    return-void
.end method
