.class final Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FinancialConnectionsSearchRow$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt;->FinancialConnectionsSearchRow(LF16;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLEt0;I)V
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
.field final synthetic $focusManager:LBv1;

.field final synthetic $onCancelSearchClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;LBv1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LBv1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FinancialConnectionsSearchRow$1$1;->$onCancelSearchClick:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FinancialConnectionsSearchRow$1$1;->$focusManager:LBv1;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FinancialConnectionsSearchRow$1$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 12

    and-int/lit8 v0, p2, 0xb

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.financialconnections.features.institutionpicker.FinancialConnectionsSearchRow.<anonymous>.<anonymous> (InstitutionPickerScreen.kt:215)"

    const v2, 0x73907326

    invoke-static {v2, p2, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, LEP1$a;->a:LEP1$a;

    invoke-static {p2}, LCo;->a(LEP1$a;)LtY1;

    move-result-object v0

    sget-object p2, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    const/4 v1, 0x6

    invoke-virtual {p2, p1, v1}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextPrimary-0d7_KjU()J

    move-result-wide v3

    sget-object v5, LgV2;->b0:LgV2$a;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    new-instance v9, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FinancialConnectionsSearchRow$1$1$1;

    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FinancialConnectionsSearchRow$1$1;->$onCancelSearchClick:Lkotlin/jvm/functions/Function0;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FinancialConnectionsSearchRow$1$1;->$focusManager:LBv1;

    invoke-direct {v9, p2, v1}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FinancialConnectionsSearchRow$1$1$1;-><init>(Lkotlin/jvm/functions/Function0;LBv1;)V

    const/4 v10, 0x7

    const/4 v11, 0x0

    invoke-static/range {v5 .. v11}, Lak0;->e(LgV2;ZLjava/lang/String;LCb5;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)LgV2;

    move-result-object v2

    const-string v1, "Back button"

    const/16 v6, 0x30

    const/4 v7, 0x0

    move-object v5, p1

    invoke-static/range {v0 .. v7}, LDP1;->a(LtY1;Ljava/lang/String;LgV2;JLEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    return-void
.end method
