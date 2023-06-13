.class final Lcom/stripe/android/ui/core/elements/BsbElementUIKt$BsbElementUI$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/ui/core/elements/BsbElementUIKt;->BsbElementUI(ZLcom/stripe/android/ui/core/elements/BsbElement;Lcom/stripe/android/uicore/elements/IdentifierSpec;LEt0;I)V
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
.field final synthetic $bankName$delegate:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LsP5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$BsbElementUI$1$1;->$bankName$delegate:LsP5;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$BsbElementUI$1$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 26

    move/from16 v0, p2

    and-int/lit8 v1, v0, 0xb

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    invoke-interface/range {p1 .. p1}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LEt0;->k()V

    move-object/from16 v0, p0

    goto :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.ui.core.elements.BsbElementUI.<anonymous>.<anonymous> (BsbElementUI.kt:48)"

    const v3, -0x5d44c44e

    invoke-static {v3, v0, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$BsbElementUI$1$1;->$bankName$delegate:LsP5;

    invoke-static {v1}, Lcom/stripe/android/ui/core/elements/BsbElementUIKt;->access$BsbElementUI$lambda$1(LsP5;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    sget-object v1, LTM2;->a:LTM2;

    sget v4, LTM2;->b:I

    move-object/from16 v15, p1

    invoke-static {v1, v15, v4}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeColors;->getSubtitle-0d7_KjU()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v16, 0x0

    move-wide/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const v25, 0xfffa

    move-object/from16 v22, p1

    invoke-static/range {v2 .. v25}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    :goto_1
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    :goto_2
    return-void
.end method
