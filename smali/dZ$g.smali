.class public final LdZ$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LdZ;->n(Le80;Lkt4;La30;LMz3$c;JJZF)LH61;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LiA0;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LiA0;",
        "",
        "a",
        "(LiA0;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt$drawRoundRectBorder$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,459:1\n221#2:460\n261#2,11:461\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt$drawRoundRectBorder$1\n*L\n353#1:460\n353#1:461,11\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:La30;

.field public final synthetic i:J

.field public final synthetic j:F

.field public final synthetic k:F

.field public final synthetic l:J

.field public final synthetic m:J

.field public final synthetic n:LKS5;


# direct methods
.method public constructor <init>(ZLa30;JFFJJLKS5;)V
    .locals 0

    iput-boolean p1, p0, LdZ$g;->g:Z

    iput-object p2, p0, LdZ$g;->h:La30;

    iput-wide p3, p0, LdZ$g;->i:J

    iput p5, p0, LdZ$g;->j:F

    iput p6, p0, LdZ$g;->k:F

    iput-wide p7, p0, LdZ$g;->l:J

    iput-wide p9, p0, LdZ$g;->m:J

    iput-object p11, p0, LdZ$g;->n:LKS5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LiA0;)V
    .locals 22

    move-object/from16 v0, p0

    const-string v1, "$this$onDrawWithContent"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p1 .. p1}, LiA0;->n0()V

    iget-boolean v1, v0, LdZ$g;->g:Z

    if-eqz v1, :cond_0

    iget-object v3, v0, LdZ$g;->h:La30;

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    iget-wide v8, v0, LdZ$g;->i:J

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v14, 0xf6

    const/4 v15, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v15}, LI61;->W(LI61;La30;JJJFLJ61;Lsm0;IILjava/lang/Object;)V

    goto/16 :goto_0

    :cond_0
    iget-wide v3, v0, LdZ$g;->i:J

    invoke-static {v3, v4}, LLC0;->d(J)F

    move-result v1

    iget v3, v0, LdZ$g;->j:F

    cmpg-float v1, v1, v3

    if-gez v1, :cond_1

    iget v6, v0, LdZ$g;->k:F

    invoke-interface/range {p1 .. p1}, LI61;->h()J

    move-result-wide v3

    invoke-static {v3, v4}, LxB5;->i(J)F

    move-result v1

    iget v3, v0, LdZ$g;->k:F

    sub-float v7, v1, v3

    invoke-interface/range {p1 .. p1}, LI61;->h()J

    move-result-wide v3

    invoke-static {v3, v4}, LxB5;->g(J)F

    move-result v1

    iget v3, v0, LdZ$g;->k:F

    sub-float v8, v1, v3

    sget-object v1, LRk0;->a:LRk0$a;

    invoke-virtual {v1}, LRk0$a;->a()I

    move-result v9

    iget-object v3, v0, LdZ$g;->h:La30;

    iget-wide v10, v0, LdZ$g;->i:J

    invoke-interface/range {p1 .. p1}, LI61;->d0()LC61;

    move-result-object v1

    invoke-interface {v1}, LC61;->h()J

    move-result-wide v14

    invoke-interface {v1}, LC61;->a()Lme0;

    move-result-object v4

    invoke-interface {v4}, Lme0;->v()V

    invoke-interface {v1}, LC61;->c()LL61;

    move-result-object v4

    move v5, v6

    invoke-interface/range {v4 .. v9}, LL61;->a(FFFFI)V

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0xf6

    const/16 v19, 0x0

    move-object/from16 v2, p1

    move-wide v8, v10

    move v10, v12

    move-object v11, v13

    move-object/from16 v12, v16

    move/from16 v13, v17

    move-wide/from16 v20, v14

    move/from16 v14, v18

    move-object/from16 v15, v19

    invoke-static/range {v2 .. v15}, LI61;->W(LI61;La30;JJJFLJ61;Lsm0;IILjava/lang/Object;)V

    invoke-interface {v1}, LC61;->a()Lme0;

    move-result-object v2

    invoke-interface {v2}, Lme0;->p()V

    move-wide/from16 v2, v20

    invoke-interface {v1, v2, v3}, LC61;->b(J)V

    goto :goto_0

    :cond_1
    iget-object v1, v0, LdZ$g;->h:La30;

    iget-wide v4, v0, LdZ$g;->l:J

    iget-wide v6, v0, LdZ$g;->m:J

    iget-wide v8, v0, LdZ$g;->i:J

    invoke-static {v8, v9, v3}, LdZ;->e(JF)J

    move-result-wide v8

    const/4 v10, 0x0

    iget-object v11, v0, LdZ$g;->n:LKS5;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v14, 0xd0

    const/4 v15, 0x0

    move-object/from16 v2, p1

    move-object v3, v1

    invoke-static/range {v2 .. v15}, LI61;->W(LI61;La30;JJJFLJ61;Lsm0;IILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LiA0;

    invoke-virtual {p0, p1}, LdZ$g;->a(LiA0;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
