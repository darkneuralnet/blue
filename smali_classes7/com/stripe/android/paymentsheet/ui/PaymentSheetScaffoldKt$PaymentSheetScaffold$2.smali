.class final Lcom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt$PaymentSheetScaffold$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt;->PaymentSheetScaffold(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;LgV2;LEt0;II)V
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
.field final synthetic $$changed:I

.field final synthetic $$default:I

.field final synthetic $content:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "LgV2;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $modifier:LgV2;

.field final synthetic $topBar:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;LgV2;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LgV2;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "II)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt$PaymentSheetScaffold$2;->$topBar:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt$PaymentSheetScaffold$2;->$content:Lkotlin/jvm/functions/Function3;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt$PaymentSheetScaffold$2;->$modifier:LgV2;

    iput p4, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt$PaymentSheetScaffold$2;->$$changed:I

    iput p5, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt$PaymentSheetScaffold$2;->$$default:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt$PaymentSheetScaffold$2;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 6

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt$PaymentSheetScaffold$2;->$topBar:Lkotlin/jvm/functions/Function2;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt$PaymentSheetScaffold$2;->$content:Lkotlin/jvm/functions/Function3;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt$PaymentSheetScaffold$2;->$modifier:LgV2;

    iget p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt$PaymentSheetScaffold$2;->$$changed:I

    or-int/lit8 v4, p2, 0x1

    iget v5, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt$PaymentSheetScaffold$2;->$$default:I

    move-object v3, p1

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt;->PaymentSheetScaffold(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;LgV2;LEt0;II)V

    return-void
.end method
