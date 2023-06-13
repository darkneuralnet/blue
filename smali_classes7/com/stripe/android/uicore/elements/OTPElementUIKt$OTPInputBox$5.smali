.class final Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$5;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/OTPElementUIKt;->OTPInputBox(Ljava/lang/String;ZLcom/stripe/android/uicore/elements/OTPElement;ILBv1;LgV2;ZLcom/stripe/android/uicore/elements/OTPElementColors;LEt0;I)V
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

.field final synthetic $colors:Lcom/stripe/android/uicore/elements/OTPElementColors;

.field final synthetic $element:Lcom/stripe/android/uicore/elements/OTPElement;

.field final synthetic $enabled:Z

.field final synthetic $focusManager:LBv1;

.field final synthetic $index:I

.field final synthetic $isSelected:Z

.field final synthetic $modifier:LgV2;

.field final synthetic $value:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLcom/stripe/android/uicore/elements/OTPElement;ILBv1;LgV2;ZLcom/stripe/android/uicore/elements/OTPElementColors;I)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$5;->$value:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$5;->$isSelected:Z

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$5;->$element:Lcom/stripe/android/uicore/elements/OTPElement;

    iput p4, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$5;->$index:I

    iput-object p5, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$5;->$focusManager:LBv1;

    iput-object p6, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$5;->$modifier:LgV2;

    iput-boolean p7, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$5;->$enabled:Z

    iput-object p8, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$5;->$colors:Lcom/stripe/android/uicore/elements/OTPElementColors;

    iput p9, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$5;->$$changed:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$5;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 10

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$5;->$value:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$5;->$isSelected:Z

    iget-object v2, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$5;->$element:Lcom/stripe/android/uicore/elements/OTPElement;

    iget v3, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$5;->$index:I

    iget-object v4, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$5;->$focusManager:LBv1;

    iget-object v5, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$5;->$modifier:LgV2;

    iget-boolean v6, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$5;->$enabled:Z

    iget-object v7, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$5;->$colors:Lcom/stripe/android/uicore/elements/OTPElementColors;

    iget p2, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$5;->$$changed:I

    or-int/lit8 v9, p2, 0x1

    move-object v8, p1

    invoke-static/range {v0 .. v9}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->access$OTPInputBox(Ljava/lang/String;ZLcom/stripe/android/uicore/elements/OTPElement;ILBv1;LgV2;ZLcom/stripe/android/uicore/elements/OTPElementColors;LEt0;I)V

    return-void
.end method
