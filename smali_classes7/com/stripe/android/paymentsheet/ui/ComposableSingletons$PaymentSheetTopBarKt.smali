.class public final Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt;

.field public static lambda-1:Lkotlin/jvm/functions/Function2;
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

.field public static lambda-2:Lkotlin/jvm/functions/Function2;
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
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt;

    sget-object v0, Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt$lambda-1$1;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt$lambda-1$1;

    const v1, 0xaec1dbd

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Ljt0;->c(IZLjava/lang/Object;)Lht0;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt;->lambda-1:Lkotlin/jvm/functions/Function2;

    const v0, -0x56e54d4c

    sget-object v1, Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt$lambda-2$1;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt$lambda-2$1;

    invoke-static {v0, v2, v1}, Ljt0;->c(IZLjava/lang/Object;)Lht0;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt;->lambda-2:Lkotlin/jvm/functions/Function2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getLambda-1$paymentsheet_release()Lkotlin/jvm/functions/Function2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt;->lambda-1:Lkotlin/jvm/functions/Function2;

    return-object v0
.end method

.method public final getLambda-2$paymentsheet_release()Lkotlin/jvm/functions/Function2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$PaymentSheetTopBarKt;->lambda-2:Lkotlin/jvm/functions/Function2;

    return-object v0
.end method
