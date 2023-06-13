.class final Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


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
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;",
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
.field final synthetic $coroutineScope:LZC0;

.field final synthetic $modalBottomSheetState:LGU2;

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;LZC0;LGU2;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2$3;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2$3;->$coroutineScope:LZC0;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2$3;->$modalBottomSheetState:LGU2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2$3;->invoke(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2$3;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;

    invoke-static {v0, p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->access$setResult(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2$3;->$coroutineScope:LZC0;

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2$3$1;

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2$3;->$modalBottomSheetState:LGU2;

    const/4 v0, 0x0

    invoke-direct {v4, p1, v0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2$3$1;-><init>(LGU2;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method
