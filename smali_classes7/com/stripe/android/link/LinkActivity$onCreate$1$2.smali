.class final Lcom/stripe/android/link/LinkActivity$onCreate$1$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/LinkActivity$onCreate$1;->invoke(LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LEt0;",
        "Ljava/lang/Integer;",
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
        "SMAP\nLinkActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkActivity.kt\ncom/stripe/android/link/LinkActivity$onCreate$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,276:1\n154#2:277\n154#2:278\n*S KotlinDebug\n*F\n+ 1 LinkActivity.kt\ncom/stripe/android/link/LinkActivity$onCreate$1$2\n*L\n103#1:277\n104#1:278\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $bottomSheetContent$delegate:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Lkotlin/jvm/functions/Function3<",
            "LPm0;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $coroutineScope:LZC0;

.field final synthetic $sheetState:LGU2;

.field final synthetic this$0:Lcom/stripe/android/link/LinkActivity;


# direct methods
.method public constructor <init>(LGU2;LEX2;Lcom/stripe/android/link/LinkActivity;LZC0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGU2;",
            "LEX2<",
            "Lkotlin/jvm/functions/Function3<",
            "LPm0;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;>;",
            "Lcom/stripe/android/link/LinkActivity;",
            "LZC0;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2;->$sheetState:LGU2;

    iput-object p2, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2;->$bottomSheetContent$delegate:LEX2;

    iput-object p3, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2;->this$0:Lcom/stripe/android/link/LinkActivity;

    iput-object p4, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2;->$coroutineScope:LZC0;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/LinkActivity$onCreate$1$2;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v13, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0xb

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface/range {p1 .. p1}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LEt0;->k()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.link.LinkActivity.onCreate.<anonymous>.<anonymous> (LinkActivity.kt:92)"

    const v4, -0x5403c9b3

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2;->$bottomSheetContent$delegate:LEX2;

    invoke-static {v1}, Lcom/stripe/android/link/LinkActivity$onCreate$1;->access$invoke$lambda$1(LEX2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    if-nez v1, :cond_3

    sget-object v1, Lcom/stripe/android/link/ComposableSingletons$LinkActivityKt;->INSTANCE:Lcom/stripe/android/link/ComposableSingletons$LinkActivityKt;

    invoke-virtual {v1}, Lcom/stripe/android/link/ComposableSingletons$LinkActivityKt;->getLambda-1$link_release()Lkotlin/jvm/functions/Function3;

    move-result-object v1

    :cond_3
    sget-object v2, LgV2;->b0:LgV2$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static {v2, v3, v5, v4}, LBB5;->j(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v2

    iget-object v3, v0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2;->$sheetState:LGU2;

    sget-object v4, LTM2;->a:LTM2;

    sget v6, LTM2;->b:I

    invoke-static {v4, v13, v6}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkShapes(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkShapes;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/link/theme/LinkShapes;->getLarge()Lbc5;

    move-result-object v14

    const/4 v7, 0x0

    int-to-float v7, v7

    invoke-static {v7}, Lk61;->g(F)F

    move-result v8

    invoke-static {v8}, LPC0;->c(F)LOC0;

    move-result-object v18

    invoke-static {v7}, Lk61;->g(F)F

    move-result v7

    invoke-static {v7}, LPC0;->c(F)LOC0;

    move-result-object v17

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x3

    const/16 v20, 0x0

    invoke-static/range {v14 .. v20}, LKC0;->c(LKC0;LOC0;LOC0;LOC0;LOC0;ILjava/lang/Object;)LKC0;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v4, v13, v6}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/link/theme/LinkColors;->getSheetScrim-0d7_KjU()J

    move-result-wide v14

    new-instance v4, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1;

    iget-object v6, v0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2;->this$0:Lcom/stripe/android/link/LinkActivity;

    iget-object v11, v0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2;->$coroutineScope:LZC0;

    iget-object v12, v0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2;->$sheetState:LGU2;

    iget-object v9, v0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2;->$bottomSheetContent$delegate:LEX2;

    invoke-direct {v4, v6, v11, v12, v9}, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1;-><init>(Lcom/stripe/android/link/LinkActivity;LZC0;LGU2;LEX2;)V

    const v6, 0xda4ce7

    invoke-static {v13, v6, v5, v4}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v12

    const v20, 0x6000030

    const/16 v21, 0x70

    move-object v4, v7

    move v5, v8

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    move-wide v10, v14

    move-object/from16 v13, p1

    move/from16 v14, v20

    move/from16 v15, v21

    invoke-static/range {v1 .. v15}, LFU2;->c(Lkotlin/jvm/functions/Function3;LgV2;LGU2;Lhy5;FJJJLkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    :goto_1
    return-void
.end method
