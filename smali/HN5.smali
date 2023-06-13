.class public final LHN5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a-\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a-\u0010\t\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00072\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0008\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u001e\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u0003\u001a&\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0008\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0000\"\u0017\u0010\u0013\u001a\u00020\u00008\u0002X\u0082\u0004\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u0012\"\u0017\u0010\u0014\u001a\u00020\u00008\u0002X\u0082\u0004\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\u0008\u0002\u0010\u0012\"\u0017\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0012\"\u0017\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0012\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0018"
    }
    d2 = {
        "LM26;",
        "a",
        "b",
        "",
        "t",
        "e",
        "(JJF)J",
        "T",
        "fraction",
        "c",
        "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;",
        "LGN5;",
        "start",
        "stop",
        "LdW3;",
        "d",
        "style",
        "f",
        "J",
        "DefaultFontSize",
        "DefaultLetterSpacing",
        "Lpm0;",
        "DefaultBackgroundColor",
        "DefaultColor",
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
        "SMAP\nSpanStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,856:1\n658#2:857\n646#2:858\n*S KotlinDebug\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n*L\n851#1:857\n851#1:858\n*E\n"
    }
.end annotation


# static fields
.field public static final a:J

.field public static final b:J

.field public static final c:J

.field public static final d:J


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/16 v0, 0xe

    invoke-static {v0}, LN26;->f(I)J

    move-result-wide v0

    sput-wide v0, LHN5;->a:J

    const/4 v0, 0x0

    invoke-static {v0}, LN26;->f(I)J

    move-result-wide v0

    sput-wide v0, LHN5;->b:J

    sget-object v0, Lpm0;->b:Lpm0$a;

    invoke-virtual {v0}, Lpm0$a;->f()J

    move-result-wide v1

    sput-wide v1, LHN5;->c:J

    invoke-virtual {v0}, Lpm0$a;->a()J

    move-result-wide v0

    sput-wide v0, LHN5;->d:J

    return-void
.end method

.method public static final synthetic a()J
    .locals 2

    sget-wide v0, LHN5;->d:J

    return-wide v0
.end method

.method public static final b(LGN5;LGN5;F)LGN5;
    .locals 30

    move/from16 v0, p2

    const-string v1, "start"

    move-object/from16 v2, p0

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "stop"

    move-object/from16 v3, p1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, LGN5;->t()LH16;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, LGN5;->t()LH16;

    move-result-object v4

    invoke-static {v1, v4, v0}, La16;->b(LH16;LH16;F)LH16;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, LGN5;->i()Lkw1;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, LGN5;->i()Lkw1;

    move-result-object v4

    invoke-static {v1, v4, v0}, LHN5;->c(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lkw1;

    invoke-virtual/range {p0 .. p0}, LGN5;->k()J

    move-result-wide v4

    invoke-virtual/range {p1 .. p1}, LGN5;->k()J

    move-result-wide v7

    invoke-static {v4, v5, v7, v8, v0}, LHN5;->e(JJF)J

    move-result-wide v7

    invoke-virtual/range {p0 .. p0}, LGN5;->n()LJw1;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object v1, LJw1;->c:LJw1$a;

    invoke-virtual {v1}, LJw1$a;->d()LJw1;

    move-result-object v1

    :cond_0
    invoke-virtual/range {p1 .. p1}, LGN5;->n()LJw1;

    move-result-object v4

    if-nez v4, :cond_1

    sget-object v4, LJw1;->c:LJw1$a;

    invoke-virtual {v4}, LJw1$a;->d()LJw1;

    move-result-object v4

    :cond_1
    invoke-static {v1, v4, v0}, LKw1;->a(LJw1;LJw1;F)LJw1;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, LGN5;->l()LEw1;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, LGN5;->l()LEw1;

    move-result-object v4

    invoke-static {v1, v4, v0}, LHN5;->c(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, LEw1;

    invoke-virtual/range {p0 .. p0}, LGN5;->m()LFw1;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, LGN5;->m()LFw1;

    move-result-object v4

    invoke-static {v1, v4, v0}, LHN5;->c(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, LFw1;

    invoke-virtual/range {p0 .. p0}, LGN5;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, LGN5;->j()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4, v0}, LHN5;->c(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, LGN5;->o()J

    move-result-wide v4

    invoke-virtual/range {p1 .. p1}, LGN5;->o()J

    move-result-wide v14

    invoke-static {v4, v5, v14, v15, v0}, LHN5;->e(JJF)J

    move-result-wide v14

    invoke-virtual/range {p0 .. p0}, LGN5;->e()LHE;

    move-result-object v1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LHE;->h()F

    move-result v1

    goto :goto_0

    :cond_2
    invoke-static {v4}, LHE;->c(F)F

    move-result v1

    :goto_0
    invoke-virtual/range {p1 .. p1}, LGN5;->e()LHE;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {v5}, LHE;->h()F

    move-result v4

    goto :goto_1

    :cond_3
    invoke-static {v4}, LHE;->c(F)F

    move-result v4

    :goto_1
    invoke-static {v1, v4, v0}, LIE;->a(FFF)F

    move-result v1

    invoke-virtual/range {p0 .. p0}, LGN5;->u()LL16;

    move-result-object v4

    if-nez v4, :cond_4

    sget-object v4, LL16;->c:LL16$a;

    invoke-virtual {v4}, LL16$a;->a()LL16;

    move-result-object v4

    :cond_4
    invoke-virtual/range {p1 .. p1}, LGN5;->u()LL16;

    move-result-object v5

    if-nez v5, :cond_5

    sget-object v5, LL16;->c:LL16$a;

    invoke-virtual {v5}, LL16$a;->a()LL16;

    move-result-object v5

    :cond_5
    invoke-static {v4, v5, v0}, LM16;->a(LL16;LL16;F)LL16;

    move-result-object v17

    invoke-virtual/range {p0 .. p0}, LGN5;->p()Luv2;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, LGN5;->p()Luv2;

    move-result-object v5

    invoke-static {v4, v5, v0}, LHN5;->c(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v18, v4

    check-cast v18, Luv2;

    invoke-virtual/range {p0 .. p0}, LGN5;->d()J

    move-result-wide v4

    invoke-virtual/range {p1 .. p1}, LGN5;->d()J

    move-result-wide v2

    invoke-static {v4, v5, v2, v3, v0}, Lvm0;->e(JJF)J

    move-result-wide v19

    invoke-virtual/range {p0 .. p0}, LGN5;->s()LR06;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, LGN5;->s()LR06;

    move-result-object v3

    invoke-static {v2, v3, v0}, LHN5;->c(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v21, v2

    check-cast v21, LR06;

    invoke-virtual/range {p0 .. p0}, LGN5;->r()LPx5;

    move-result-object v2

    if-nez v2, :cond_6

    new-instance v2, LPx5;

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x7

    const/16 v29, 0x0

    move-object/from16 v22, v2

    invoke-direct/range {v22 .. v29}, LPx5;-><init>(JJFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_6
    invoke-virtual/range {p1 .. p1}, LGN5;->r()LPx5;

    move-result-object v3

    if-nez v3, :cond_7

    new-instance v3, LPx5;

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x7

    const/16 v29, 0x0

    move-object/from16 v22, v3

    invoke-direct/range {v22 .. v29}, LPx5;-><init>(JJFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_7
    invoke-static {v2, v3, v0}, LRx5;->a(LPx5;LPx5;F)LPx5;

    move-result-object v22

    invoke-virtual/range {p0 .. p0}, LGN5;->q()LdW3;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, LGN5;->q()LdW3;

    move-result-object v3

    invoke-static {v2, v3, v0}, LHN5;->d(LdW3;LdW3;F)LdW3;

    move-result-object v23

    invoke-virtual/range {p0 .. p0}, LGN5;->h()LJ61;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, LGN5;->h()LJ61;

    move-result-object v3

    invoke-static {v2, v3, v0}, LHN5;->c(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v24, v0

    check-cast v24, LJ61;

    new-instance v0, LGN5;

    move-object v5, v0

    invoke-static {v1}, LHE;->b(F)LHE;

    move-result-object v16

    const/16 v25, 0x0

    invoke-direct/range {v5 .. v25}, LGN5;-><init>(LH16;JLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;LdW3;LJ61;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final c(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;TT;F)TT;"
        }
    .end annotation

    float-to-double v0, p2

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpg-double p2, v0, v2

    if-gez p2, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, p1

    :goto_0
    return-object p0
.end method

.method public static final d(LdW3;LdW3;F)LdW3;
    .locals 0

    if-nez p0, :cond_0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-nez p0, :cond_1

    sget-object p0, LdW3;->a:LdW3$a;

    invoke-virtual {p0}, LdW3$a;->a()LdW3;

    move-result-object p0

    :cond_1
    if-nez p1, :cond_2

    sget-object p1, LdW3;->a:LdW3$a;

    invoke-virtual {p1}, LdW3$a;->a()LdW3;

    move-result-object p1

    :cond_2
    invoke-static {p0, p1, p2}, LSd;->c(LdW3;LdW3;F)LdW3;

    move-result-object p0

    return-object p0
.end method

.method public static final e(JJF)J
    .locals 1

    invoke-static {p0, p1}, LN26;->g(J)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p2, p3}, LN26;->g(J)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, LN26;->h(JJF)J

    move-result-wide p0

    return-wide p0

    :cond_1
    :goto_0
    invoke-static {p0, p1}, LM26;->b(J)LM26;

    move-result-object p0

    invoke-static {p2, p3}, LM26;->b(J)LM26;

    move-result-object p1

    invoke-static {p0, p1, p4}, LHN5;->c(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LM26;

    invoke-virtual {p0}, LM26;->k()J

    move-result-wide p0

    return-wide p0
.end method

.method public static final f(LGN5;)LGN5;
    .locals 24

    const-string v0, "style"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, LGN5;->t()LH16;

    move-result-object v0

    sget-object v2, LHN5$a;->g:LHN5$a;

    invoke-interface {v0, v2}, LH16;->b(Lkotlin/jvm/functions/Function0;)LH16;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, LGN5;->k()J

    move-result-wide v2

    invoke-static {v2, v3}, LN26;->g(J)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-wide v2, LHN5;->a:J

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, LGN5;->k()J

    move-result-wide v2

    :goto_0
    move-wide v5, v2

    invoke-virtual/range {p0 .. p0}, LGN5;->n()LJw1;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, LJw1;->c:LJw1$a;

    invoke-virtual {v0}, LJw1$a;->d()LJw1;

    move-result-object v0

    :cond_1
    move-object v7, v0

    invoke-virtual/range {p0 .. p0}, LGN5;->l()LEw1;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LEw1;->i()I

    move-result v0

    goto :goto_1

    :cond_2
    sget-object v0, LEw1;->b:LEw1$a;

    invoke-virtual {v0}, LEw1$a;->b()I

    move-result v0

    :goto_1
    invoke-static {v0}, LEw1;->c(I)LEw1;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, LGN5;->m()LFw1;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LFw1;->m()I

    move-result v0

    goto :goto_2

    :cond_3
    sget-object v0, LFw1;->b:LFw1$a;

    invoke-virtual {v0}, LFw1$a;->a()I

    move-result v0

    :goto_2
    invoke-static {v0}, LFw1;->e(I)LFw1;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, LGN5;->i()Lkw1;

    move-result-object v0

    if-nez v0, :cond_4

    sget-object v0, Lkw1;->c:Lkw1$a;

    invoke-virtual {v0}, Lkw1$a;->a()LUX5;

    move-result-object v0

    :cond_4
    move-object v10, v0

    invoke-virtual/range {p0 .. p0}, LGN5;->j()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    const-string v0, ""

    :cond_5
    move-object v11, v0

    invoke-virtual/range {p0 .. p0}, LGN5;->o()J

    move-result-wide v2

    invoke-static {v2, v3}, LN26;->g(J)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-wide v2, LHN5;->b:J

    goto :goto_3

    :cond_6
    invoke-virtual/range {p0 .. p0}, LGN5;->o()J

    move-result-wide v2

    :goto_3
    move-wide v12, v2

    invoke-virtual/range {p0 .. p0}, LGN5;->e()LHE;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, LHE;->h()F

    move-result v0

    goto :goto_4

    :cond_7
    sget-object v0, LHE;->b:LHE$a;

    invoke-virtual {v0}, LHE$a;->a()F

    move-result v0

    :goto_4
    invoke-static {v0}, LHE;->b(F)LHE;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, LGN5;->u()LL16;

    move-result-object v0

    if-nez v0, :cond_8

    sget-object v0, LL16;->c:LL16$a;

    invoke-virtual {v0}, LL16$a;->a()LL16;

    move-result-object v0

    :cond_8
    move-object v15, v0

    invoke-virtual/range {p0 .. p0}, LGN5;->p()Luv2;

    move-result-object v0

    if-nez v0, :cond_9

    sget-object v0, Luv2;->d:Luv2$a;

    invoke-virtual {v0}, Luv2$a;->a()Luv2;

    move-result-object v0

    :cond_9
    move-object/from16 v16, v0

    invoke-virtual/range {p0 .. p0}, LGN5;->d()J

    move-result-wide v2

    sget-object v0, Lpm0;->b:Lpm0$a;

    invoke-virtual {v0}, Lpm0$a;->g()J

    move-result-wide v17

    cmp-long v0, v2, v17

    if-eqz v0, :cond_a

    const/4 v0, 0x1

    goto :goto_5

    :cond_a
    const/4 v0, 0x0

    :goto_5
    if-eqz v0, :cond_b

    goto :goto_6

    :cond_b
    sget-wide v2, LHN5;->c:J

    :goto_6
    move-wide/from16 v17, v2

    invoke-virtual/range {p0 .. p0}, LGN5;->s()LR06;

    move-result-object v0

    if-nez v0, :cond_c

    sget-object v0, LR06;->b:LR06$a;

    invoke-virtual {v0}, LR06$a;->c()LR06;

    move-result-object v0

    :cond_c
    move-object/from16 v19, v0

    invoke-virtual/range {p0 .. p0}, LGN5;->r()LPx5;

    move-result-object v0

    if-nez v0, :cond_d

    sget-object v0, LPx5;->d:LPx5$a;

    invoke-virtual {v0}, LPx5$a;->a()LPx5;

    move-result-object v0

    :cond_d
    move-object/from16 v20, v0

    invoke-virtual/range {p0 .. p0}, LGN5;->q()LdW3;

    move-result-object v21

    invoke-virtual/range {p0 .. p0}, LGN5;->h()LJ61;

    move-result-object v0

    if-nez v0, :cond_e

    sget-object v0, Lzl1;->a:Lzl1;

    :cond_e
    move-object/from16 v22, v0

    const/16 v23, 0x0

    new-instance v0, LGN5;

    move-object v3, v0

    invoke-direct/range {v3 .. v23}, LGN5;-><init>(LH16;JLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;LdW3;LJ61;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
