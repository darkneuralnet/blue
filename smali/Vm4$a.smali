.class public final LVm4$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LVm4;->a(ZLkotlin/jvm/functions/Function0;LgV2;ZLrX2;LTm4;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LI61;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonKt$RadioButton$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,233:1\n154#2:234\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonKt$RadioButton$2$1\n*L\n124#1:234\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Lpm0;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Lk61;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LsP5;LsP5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Lpm0;",
            ">;",
            "LsP5<",
            "Lk61;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LVm4$a;->g:LsP5;

    iput-object p2, p0, LVm4$a;->h:LsP5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LI61;

    invoke-virtual {p0, p1}, LVm4$a;->invoke(LI61;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LI61;)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v13, p1

    const-string v1, "$this$Canvas"

    invoke-static {v13, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LVm4;->c()F

    move-result v1

    invoke-interface {v13, v1}, Lg01;->T0(F)F

    move-result v3

    iget-object v1, v0, LVm4$a;->g:LsP5;

    invoke-interface {v1}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpm0;

    invoke-virtual {v1}, Lpm0;->w()J

    move-result-wide v10

    invoke-static {}, LVm4;->b()F

    move-result v1

    invoke-interface {v13, v1}, Lg01;->T0(F)F

    move-result v1

    const/4 v2, 0x2

    int-to-float v2, v2

    div-float v14, v3, v2

    sub-float v12, v1, v14

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    new-instance v18, LKS5;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x1e

    const/4 v9, 0x0

    move-object/from16 v2, v18

    invoke-direct/range {v2 .. v9}, LKS5;-><init>(FFIILiJ3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v19, 0x0

    const/16 v20, 0x6c

    const/16 v21, 0x0

    move-object/from16 v1, p1

    move-wide v2, v10

    move v4, v12

    move-wide v5, v15

    move/from16 v7, v17

    move-object/from16 v8, v18

    move/from16 v10, v19

    move/from16 v11, v20

    move-object/from16 v12, v21

    invoke-static/range {v1 .. v12}, LI61;->J(LI61;JFJFLJ61;Lsm0;IILjava/lang/Object;)V

    iget-object v1, v0, LVm4$a;->h:LsP5;

    invoke-interface {v1}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk61;

    invoke-virtual {v1}, Lk61;->l()F

    move-result v1

    const/4 v2, 0x0

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v1, v2}, Lk61;->f(FF)I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, v0, LVm4$a;->g:LsP5;

    invoke-interface {v1}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpm0;

    invoke-virtual {v1}, Lpm0;->w()J

    move-result-wide v2

    iget-object v1, v0, LVm4$a;->h:LsP5;

    invoke-interface {v1}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk61;

    invoke-virtual {v1}, Lk61;->l()F

    move-result v1

    invoke-interface {v13, v1}, Lg01;->T0(F)F

    move-result v1

    sub-float v4, v1, v14

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    sget-object v8, Lzl1;->a:Lzl1;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x6c

    const/4 v12, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v12}, LI61;->J(LI61;JFJFLJ61;Lsm0;IILjava/lang/Object;)V

    :cond_0
    return-void
.end method
