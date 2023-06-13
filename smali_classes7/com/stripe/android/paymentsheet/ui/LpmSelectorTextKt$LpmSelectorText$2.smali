.class final Lcom/stripe/android/paymentsheet/ui/LpmSelectorTextKt$LpmSelectorText$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/LpmSelectorTextKt;->LpmSelectorText-T042LqI(Ljava/lang/Integer;Ljava/lang/String;JLgV2;ZLEt0;II)V
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

.field final synthetic $icon:Ljava/lang/Integer;

.field final synthetic $isEnabled:Z

.field final synthetic $modifier:LgV2;

.field final synthetic $text:Ljava/lang/String;

.field final synthetic $textColor:J


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/String;JLgV2;ZII)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/LpmSelectorTextKt$LpmSelectorText$2;->$icon:Ljava/lang/Integer;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/LpmSelectorTextKt$LpmSelectorText$2;->$text:Ljava/lang/String;

    iput-wide p3, p0, Lcom/stripe/android/paymentsheet/ui/LpmSelectorTextKt$LpmSelectorText$2;->$textColor:J

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/ui/LpmSelectorTextKt$LpmSelectorText$2;->$modifier:LgV2;

    iput-boolean p6, p0, Lcom/stripe/android/paymentsheet/ui/LpmSelectorTextKt$LpmSelectorText$2;->$isEnabled:Z

    iput p7, p0, Lcom/stripe/android/paymentsheet/ui/LpmSelectorTextKt$LpmSelectorText$2;->$$changed:I

    iput p8, p0, Lcom/stripe/android/paymentsheet/ui/LpmSelectorTextKt$LpmSelectorText$2;->$$default:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/LpmSelectorTextKt$LpmSelectorText$2;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 9

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/LpmSelectorTextKt$LpmSelectorText$2;->$icon:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/LpmSelectorTextKt$LpmSelectorText$2;->$text:Ljava/lang/String;

    iget-wide v2, p0, Lcom/stripe/android/paymentsheet/ui/LpmSelectorTextKt$LpmSelectorText$2;->$textColor:J

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/ui/LpmSelectorTextKt$LpmSelectorText$2;->$modifier:LgV2;

    iget-boolean v5, p0, Lcom/stripe/android/paymentsheet/ui/LpmSelectorTextKt$LpmSelectorText$2;->$isEnabled:Z

    iget p2, p0, Lcom/stripe/android/paymentsheet/ui/LpmSelectorTextKt$LpmSelectorText$2;->$$changed:I

    or-int/lit8 v7, p2, 0x1

    iget v8, p0, Lcom/stripe/android/paymentsheet/ui/LpmSelectorTextKt$LpmSelectorText$2;->$$default:I

    move-object v6, p1

    invoke-static/range {v0 .. v8}, Lcom/stripe/android/paymentsheet/ui/LpmSelectorTextKt;->LpmSelectorText-T042LqI(Ljava/lang/Integer;Ljava/lang/String;JLgV2;ZLEt0;II)V

    return-void
.end method
