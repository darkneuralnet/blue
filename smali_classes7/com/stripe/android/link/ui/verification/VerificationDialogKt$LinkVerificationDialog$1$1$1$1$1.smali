.class final Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1$1$1;->invoke(LEt0;I)V
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
        "SMAP\nVerificationDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerificationDialog.kt\ncom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,124:1\n154#2:125\n*S KotlinDebug\n*F\n+ 1 VerificationDialog.kt\ncom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1\n*L\n82#1:125\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $account:Lcom/stripe/android/link/model/LinkAccount;

.field final synthetic $backStackEntry$delegate:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "LAY2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $component:Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;

.field final synthetic $onDismiss:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onResult:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $openDialog$delegate:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/model/LinkAccount;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;LEX2;Lkotlin/jvm/functions/Function1;ILsP5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/model/LinkAccount;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;",
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;I",
            "LsP5<",
            "LAY2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1;->$account:Lcom/stripe/android/link/model/LinkAccount;

    iput-object p2, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1;->$onDismiss:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1;->$component:Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;

    iput-object p4, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1;->$openDialog$delegate:LEX2;

    iput-object p5, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1;->$onResult:Lkotlin/jvm/functions/Function1;

    iput p6, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1;->$$dirty:I

    iput-object p7, p0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1;->$backStackEntry$delegate:LsP5;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v10, p1

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

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.link.ui.verification.LinkVerificationDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VerificationDialog.kt:77)"

    const v4, -0x9dd8ba

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, LgV2;->b0:LgV2$a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v1, v2, v4, v3}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v1

    const/16 v2, 0x10

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v1, v2}, LND3;->i(LgV2;F)LgV2;

    move-result-object v1

    sget-object v2, LTM2;->a:LTM2;

    sget v3, LTM2;->b:I

    invoke-static {v2, v10, v3}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkShapes(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkShapes;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/link/theme/LinkShapes;->getMedium()Lbc5;

    move-result-object v2

    const-wide/16 v5, 0x0

    new-instance v3, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1$1;

    iget-object v13, v0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1;->$account:Lcom/stripe/android/link/model/LinkAccount;

    iget-object v14, v0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1;->$onDismiss:Lkotlin/jvm/functions/Function0;

    iget-object v15, v0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1;->$component:Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;

    iget-object v12, v0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1;->$openDialog$delegate:LEX2;

    iget-object v11, v0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1;->$onResult:Lkotlin/jvm/functions/Function1;

    iget v9, v0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1;->$$dirty:I

    iget-object v7, v0, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1;->$backStackEntry$delegate:LsP5;

    move-object v8, v12

    move-object v12, v3

    move-object/from16 v16, v8

    move-object/from16 v17, v11

    move/from16 v18, v9

    move-object/from16 v19, v7

    invoke-direct/range {v12 .. v19}, Lcom/stripe/android/link/ui/verification/VerificationDialogKt$LinkVerificationDialog$1$1$1$1$1$1;-><init>(Lcom/stripe/android/link/model/LinkAccount;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;LEX2;Lkotlin/jvm/functions/Function1;ILsP5;)V

    const v7, 0x26143f8a

    invoke-static {v10, v7, v4, v3}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v9

    const v11, 0x180006

    const/16 v12, 0x3c

    move-wide v3, v5

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v10, p1

    invoke-static/range {v1 .. v12}, LNV5;->a(LgV2;Lhy5;JJLeZ;FLkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    return-void
.end method
