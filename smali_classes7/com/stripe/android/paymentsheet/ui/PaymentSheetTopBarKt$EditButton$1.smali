.class final Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$EditButton$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt;->EditButton-FNF3uiM(IZJLkotlin/jvm/functions/Function0;LEt0;I)V
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


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $editButtonFontSize:J

.field final synthetic $editButtonTypeface:Landroid/graphics/Typeface;

.field final synthetic $labelResourceId:I

.field final synthetic $tintColor:J


# direct methods
.method public constructor <init>(IIJJLandroid/graphics/Typeface;)V
    .locals 0

    iput p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$EditButton$1;->$labelResourceId:I

    iput p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$EditButton$1;->$$dirty:I

    iput-wide p3, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$EditButton$1;->$tintColor:J

    iput-wide p5, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$EditButton$1;->$editButtonFontSize:J

    iput-object p7, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$EditButton$1;->$editButtonTypeface:Landroid/graphics/Typeface;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$EditButton$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 27

    move-object/from16 v0, p0

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

    const-string v3, "com.stripe.android.paymentsheet.ui.EditButton.<anonymous> (PaymentSheetTopBar.kt:139)"

    const v4, 0x763be611

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget v1, v0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$EditButton$1;->$labelResourceId:I

    iget v2, v0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$EditButton$1;->$$dirty:I

    and-int/lit8 v2, v2, 0xe

    move-object/from16 v15, p1

    invoke-static {v1, v15, v2}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    move-object v3, v1

    const-string v2, "this as java.lang.String).toUpperCase(Locale.ROOT)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    iget-wide v5, v0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$EditButton$1;->$tintColor:J

    iget-wide v7, v0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$EditButton$1;->$editButtonFontSize:J

    const/4 v9, 0x0

    const/4 v10, 0x0

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$EditButton$1;->$editButtonTypeface:Landroid/graphics/Typeface;

    const-string v2, "editButtonTypeface"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, LXd;->a(Landroid/graphics/Typeface;)Lkw1;

    move-result-object v11

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v1, 0x0

    move-object v15, v1

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    iget v1, v0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$EditButton$1;->$$dirty:I

    and-int/lit16 v1, v1, 0x380

    move/from16 v24, v1

    const/16 v25, 0x0

    const v26, 0xffb2

    move-object/from16 v23, p1

    invoke-static/range {v3 .. v26}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    return-void
.end method
