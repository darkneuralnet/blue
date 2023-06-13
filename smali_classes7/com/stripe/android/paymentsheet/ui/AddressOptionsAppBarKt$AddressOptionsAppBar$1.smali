.class final Lcom/stripe/android/paymentsheet/ui/AddressOptionsAppBarKt$AddressOptionsAppBar$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/AddressOptionsAppBarKt;->AddressOptionsAppBar(ZLkotlin/jvm/functions/Function0;LEt0;I)V
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
.field final synthetic $$dirty:I

.field final synthetic $isRootScreen:Z

.field final synthetic $onButtonClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;IZ)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/AddressOptionsAppBarKt$AddressOptionsAppBar$1;->$onButtonClick:Lkotlin/jvm/functions/Function0;

    iput p2, p0, Lcom/stripe/android/paymentsheet/ui/AddressOptionsAppBarKt$AddressOptionsAppBar$1;->$$dirty:I

    iput-boolean p3, p0, Lcom/stripe/android/paymentsheet/ui/AddressOptionsAppBarKt$AddressOptionsAppBar$1;->$isRootScreen:Z

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/ui/AddressOptionsAppBarKt$AddressOptionsAppBar$1;->invoke(LZc5;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LZc5;LEt0;I)V
    .locals 10

    const-string v0, "$this$TopAppBar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x51

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    invoke-interface {p2}, LEt0;->b()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.stripe.android.paymentsheet.ui.AddressOptionsAppBar.<anonymous> (AddressOptionsAppBar.kt:24)"

    const v1, 0x278ee8b9

    invoke-static {v1, p3, p1, v0}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/AddressOptionsAppBarKt$AddressOptionsAppBar$1;->$onButtonClick:Lkotlin/jvm/functions/Function0;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    new-instance p1, Lcom/stripe/android/paymentsheet/ui/AddressOptionsAppBarKt$AddressOptionsAppBar$1$1;

    iget-boolean p3, p0, Lcom/stripe/android/paymentsheet/ui/AddressOptionsAppBarKt$AddressOptionsAppBar$1;->$isRootScreen:Z

    invoke-direct {p1, p3}, Lcom/stripe/android/paymentsheet/ui/AddressOptionsAppBarKt$AddressOptionsAppBar$1$1;-><init>(Z)V

    const p3, 0x2ea02a55

    const/4 v0, 0x1

    invoke-static {p2, p3, v0, p1}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v6

    iget p1, p0, Lcom/stripe/android/paymentsheet/ui/AddressOptionsAppBarKt$AddressOptionsAppBar$1;->$$dirty:I

    shr-int/lit8 p1, p1, 0x3

    and-int/lit8 p1, p1, 0xe

    or-int/lit16 v8, p1, 0x6000

    const/16 v9, 0xe

    move-object v7, p2

    invoke-static/range {v2 .. v9}, LqP1;->a(Lkotlin/jvm/functions/Function0;LgV2;ZLrX2;Lkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    return-void
.end method
