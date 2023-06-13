.class final Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerLoaded$1$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt;->AccountPickerLoaded(ZZLjava/util/List;ZLcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;ZLcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/ui/TextResource;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LZc5;",
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
.field final synthetic $requiresSingleAccountConfirmation:Z

.field final synthetic $selectedIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLjava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerLoaded$1$3;->$requiresSingleAccountConfirmation:Z

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerLoaded$1$3;->$selectedIds:Ljava/util/Set;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZc5;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerLoaded$1$3;->invoke(LZc5;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LZc5;LEt0;I)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    const-string v3, "$this$FinancialConnectionsButton"

    move-object/from16 v4, p1

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, v2, 0x51

    const/16 v4, 0x10

    if-ne v3, v4, :cond_1

    invoke-interface/range {p2 .. p2}, LEt0;->b()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LEt0;->k()V

    goto :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.financialconnections.features.accountpicker.AccountPickerLoaded.<anonymous>.<anonymous> (AccountPickerScreen.kt:247)"

    const v5, -0x6de116ad

    invoke-static {v5, v2, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-boolean v2, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerLoaded$1$3;->$requiresSingleAccountConfirmation:Z

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v2, v3, :cond_3

    sget v2, Lcom/stripe/android/financialconnections/R$string;->stripe_account_picker_cta_confirm:I

    invoke-static {v2, v1, v4}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v2

    :goto_1
    move-object/from16 v21, v2

    goto :goto_2

    :cond_3
    if-nez v2, :cond_5

    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerScreenKt$AccountPickerLoaded$1$3;->$selectedIds:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v2

    sget v3, Lcom/stripe/android/financialconnections/R$plurals;->stripe_account_picker_cta_link:I

    invoke-static {v3, v2, v1, v4}, LfS5;->a(IILEt0;I)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :goto_2
    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const v24, 0xfffe

    move-object/from16 v1, v21

    move-object/from16 v21, p2

    invoke-static/range {v1 .. v24}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    :goto_3
    return-void

    :cond_5
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
