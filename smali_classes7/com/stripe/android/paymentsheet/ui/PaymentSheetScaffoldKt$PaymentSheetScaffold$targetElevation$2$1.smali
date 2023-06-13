.class final Lcom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt$PaymentSheetScaffold$targetElevation$2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


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
        "Lkotlin/jvm/functions/Function0<",
        "Lk61;",
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
        "SMAP\nPaymentSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheetScaffold.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt$PaymentSheetScaffold$targetElevation$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,46:1\n154#2:47\n154#2:48\n*S KotlinDebug\n*F\n+ 1 PaymentSheetScaffold.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt$PaymentSheetScaffold$targetElevation$2$1\n*L\n27#1:47\n29#1:48\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $scrollState:LXp5;


# direct methods
.method public constructor <init>(LXp5;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt$PaymentSheetScaffold$targetElevation$2$1;->$scrollState:LXp5;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt$PaymentSheetScaffold$targetElevation$2$1;->invoke-D9Ej5fM()F

    move-result v0

    invoke-static {v0}, Lk61;->d(F)Lk61;

    move-result-object v0

    return-object v0
.end method

.method public final invoke-D9Ej5fM()F
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt$PaymentSheetScaffold$targetElevation$2$1;->$scrollState:LXp5;

    invoke-virtual {v0}, LXp5;->m()I

    move-result v0

    if-lez v0, :cond_0

    const/16 v0, 0x8

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    :goto_0
    return v0
.end method
