.class final Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2$4;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2;->invoke(LEt0;I)V
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
.field final synthetic $modalBottomSheetState:LGU2;

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;


# direct methods
.method public constructor <init>(LGU2;Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2$4;->$modalBottomSheetState:LGU2;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2$4;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2$4;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 17

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

    const-string v3, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.onCreate.<anonymous>.<anonymous> (AddressElementActivity.kt:104)"

    const v4, 0x3e42f806

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, LgV2;->b0:LgV2$a;

    invoke-static {v1}, LqC6;->b(LgV2;)LgV2;

    move-result-object v1

    invoke-static {v1}, LqC6;->c(LgV2;)LgV2;

    move-result-object v3

    new-instance v1, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2$4$1;

    iget-object v2, v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2$4;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;

    invoke-direct {v1, v2}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2$4$1;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)V

    const v2, -0x7acea768

    const/4 v4, 0x1

    move-object/from16 v14, p1

    invoke-static {v14, v2, v4, v1}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v2

    iget-object v4, v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2$4;->$modalBottomSheetState:LGU2;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    sget-object v1, Lcom/stripe/android/paymentsheet/addresselement/ComposableSingletons$AddressElementActivityKt;->INSTANCE:Lcom/stripe/android/paymentsheet/addresselement/ComposableSingletons$AddressElementActivityKt;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/addresselement/ComposableSingletons$AddressElementActivityKt;->getLambda-1$paymentsheet_release()Lkotlin/jvm/functions/Function2;

    move-result-object v13

    const v15, 0x6000006

    const/16 v16, 0xf8

    invoke-static/range {v2 .. v16}, LFU2;->c(Lkotlin/jvm/functions/Function3;LgV2;LGU2;Lhy5;FJJJLkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    return-void
.end method
