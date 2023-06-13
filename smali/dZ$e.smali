.class public final LdZ$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LdZ;->l(Le80;Lkt4;La30;LMz3$a;ZF)LH61;
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
        "SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt$drawGenericBorder$3\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,459:1\n120#2,4:460\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt$drawGenericBorder$3\n*L\n317#1:460,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LOs4;

.field public final synthetic h:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "LMW1;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:J

.field public final synthetic j:Lsm0;


# direct methods
.method public constructor <init>(LOs4;Lkotlin/jvm/internal/Ref$ObjectRef;JLsm0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LOs4;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "LMW1;",
            ">;J",
            "Lsm0;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LdZ$e;->g:LOs4;

    iput-object p2, p0, LdZ$e;->h:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-wide p3, p0, LdZ$e;->i:J

    iput-object p5, p0, LdZ$e;->j:Lsm0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LiA0;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "$this$onDrawWithContent"

    move-object/from16 v15, p1

    invoke-static {v15, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p1 .. p1}, LiA0;->n0()V

    iget-object v2, v0, LdZ$e;->g:LOs4;

    invoke-virtual {v2}, LOs4;->i()F

    move-result v14

    iget-object v2, v0, LdZ$e;->g:LOs4;

    invoke-virtual {v2}, LOs4;->l()F

    move-result v12

    iget-object v2, v0, LdZ$e;->h:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-wide v5, v0, LdZ$e;->i:J

    iget-object v13, v0, LdZ$e;->j:Lsm0;

    invoke-interface/range {p1 .. p1}, LI61;->d0()LC61;

    move-result-object v3

    invoke-interface {v3}, LC61;->c()LL61;

    move-result-object v3

    invoke-interface {v3, v14, v12}, LL61;->b(FF)V

    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v2, LMW1;

    const-wide/16 v3, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/16 v16, 0x0

    move/from16 v18, v12

    move-object/from16 v12, v16

    const/16 v16, 0x0

    move/from16 v19, v14

    move/from16 v14, v16

    move/from16 v15, v16

    const/16 v16, 0x37a

    const/16 v17, 0x0

    invoke-static/range {v1 .. v17}, LI61;->K0(LI61;LMW1;JJJJFLJ61;Lsm0;IIILjava/lang/Object;)V

    invoke-interface/range {p1 .. p1}, LI61;->d0()LC61;

    move-result-object v1

    invoke-interface {v1}, LC61;->c()LL61;

    move-result-object v1

    move/from16 v2, v19

    neg-float v2, v2

    move/from16 v3, v18

    neg-float v3, v3

    invoke-interface {v1, v2, v3}, LL61;->b(FF)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LiA0;

    invoke-virtual {p0, p1}, LdZ$e;->a(LiA0;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
