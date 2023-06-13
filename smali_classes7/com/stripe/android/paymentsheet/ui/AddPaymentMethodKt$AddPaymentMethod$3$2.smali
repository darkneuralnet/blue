.class final Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LgV2;LEt0;II)V
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
        "SMAP\nAddPaymentMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddPaymentMethod.kt\ncom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,178:1\n36#2:179\n1057#3,6:180\n*S KotlinDebug\n*F\n+ 1 AddPaymentMethod.kt\ncom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2\n*L\n106#1:179\n106#1:180,6\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $arguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

.field final synthetic $context:Landroid/content/Context;

.field final synthetic $linkHandler:Lcom/stripe/android/paymentsheet/LinkHandler;

.field final synthetic $linkSignupState$delegate:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $processing$delegate:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $selectedItem:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

.field final synthetic $selectedPaymentMethodCode$delegate:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $sheetViewModel:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

.field final synthetic $showCheckboxFlow:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $showLinkInlineSignup:Z


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;ZLcom/stripe/android/paymentsheet/LinkHandler;LGX2;LEX2;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;LsP5;LEX2;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
            "Z",
            "Lcom/stripe/android/paymentsheet/LinkHandler;",
            "LGX2<",
            "Ljava/lang/Boolean;",
            ">;",
            "LEX2<",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
            ">;",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
            "LsP5<",
            "Ljava/lang/Boolean;",
            ">;",
            "LEX2<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;->$sheetViewModel:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;->$selectedItem:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    iput-boolean p3, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;->$showLinkInlineSignup:Z

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;->$linkHandler:Lcom/stripe/android/paymentsheet/LinkHandler;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;->$showCheckboxFlow:LGX2;

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;->$linkSignupState$delegate:LEX2;

    iput-object p7, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;->$arguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    iput-object p8, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;->$processing$delegate:LsP5;

    iput-object p9, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;->$selectedPaymentMethodCode$delegate:LEX2;

    iput-object p10, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;->$context:Landroid/content/Context;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v12, p1

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

    const-string v3, "com.stripe.android.paymentsheet.ui.AddPaymentMethod.<anonymous>.<anonymous> (AddPaymentMethod.kt:91)"

    const v4, -0x2cfc1d8d

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;->$sheetViewModel:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    iget-object v2, v0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;->$processing$delegate:LsP5;

    invoke-static {v2}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->access$AddPaymentMethod$lambda$1(LsP5;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    iget-object v3, v0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;->$sheetViewModel:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getSupportedPaymentMethods$paymentsheet_release()Ljava/util/List;

    move-result-object v3

    iget-object v4, v0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;->$selectedItem:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    iget-boolean v5, v0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;->$showLinkInlineSignup:Z

    iget-object v6, v0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;->$linkHandler:Lcom/stripe/android/paymentsheet/LinkHandler;

    invoke-virtual {v6}, Lcom/stripe/android/paymentsheet/LinkHandler;->getLinkLauncher()Lcom/stripe/android/link/LinkPaymentLauncher;

    move-result-object v6

    iget-object v7, v0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;->$showCheckboxFlow:LGX2;

    new-instance v8, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2$1;

    iget-object v9, v0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;->$selectedItem:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    iget-object v10, v0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;->$selectedPaymentMethodCode$delegate:LEX2;

    invoke-direct {v8, v9, v10}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2$1;-><init>(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;LEX2;)V

    iget-object v9, v0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;->$linkSignupState$delegate:LEX2;

    const v10, 0x44faf204

    invoke-interface {v12, v10}, LEt0;->F(I)V

    invoke-interface {v12, v9}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v10

    invoke-interface/range {p1 .. p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_3

    sget-object v10, LEt0;->a:LEt0$a;

    invoke-virtual {v10}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v10

    if-ne v11, v10, :cond_4

    :cond_3
    new-instance v11, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2$2$1;

    invoke-direct {v11, v9}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2$2$1;-><init>(LEX2;)V

    invoke-interface {v12, v11}, LEt0;->z(Ljava/lang/Object;)V

    :cond_4
    invoke-interface/range {p1 .. p1}, LEt0;->Q()V

    move-object v9, v11

    check-cast v9, Lkotlin/jvm/functions/Function2;

    iget-object v10, v0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;->$arguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    new-instance v11, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2$3;

    iget-object v13, v0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;->$context:Landroid/content/Context;

    iget-object v14, v0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;->$selectedItem:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    iget-object v15, v0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;->$sheetViewModel:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    invoke-direct {v11, v13, v14, v15}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2$3;-><init>(Landroid/content/Context;Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;)V

    sget v13, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->$stable:I

    shl-int/lit8 v13, v13, 0x9

    const v14, 0x200208

    or-int/2addr v13, v14

    sget v14, Lcom/stripe/android/link/LinkPaymentLauncher;->$stable:I

    shl-int/lit8 v14, v14, 0xf

    or-int/2addr v13, v14

    sget v14, Lcom/stripe/android/ui/core/Amount;->$stable:I

    sget v15, Lcom/stripe/android/model/PaymentMethodCreateParams;->$stable:I

    or-int/2addr v14, v15

    shl-int/lit8 v14, v14, 0x1b

    or-int/2addr v13, v14

    const/4 v14, 0x0

    move-object/from16 v12, p1

    invoke-static/range {v1 .. v14}, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt;->PaymentElement(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;ZLjava/util/List;Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;ZLcom/stripe/android/link/LinkPaymentLauncher;LEu1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lkotlin/jvm/functions/Function1;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_1
    return-void
.end method
