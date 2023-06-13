.class final Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$5;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt;->CardEditBody(ZZZZLcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;LEt0;I)V
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

.field final synthetic $errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

.field final synthetic $formContent:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "LPm0;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $isDefault:Z

.field final synthetic $isProcessing:Z

.field final synthetic $onCancelClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onPrimaryButtonClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onSetAsDefaultClick:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $primaryButtonEnabled:Z

.field final synthetic $setAsDefaultChecked:Z


# direct methods
.method public constructor <init>(ZZZZLcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZZZ",
            "Lcom/stripe/android/link/ui/ErrorMessage;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LPm0;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;I)V"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$5;->$isProcessing:Z

    iput-boolean p2, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$5;->$isDefault:Z

    iput-boolean p3, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$5;->$setAsDefaultChecked:Z

    iput-boolean p4, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$5;->$primaryButtonEnabled:Z

    iput-object p5, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$5;->$errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    iput-object p6, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$5;->$onSetAsDefaultClick:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$5;->$onPrimaryButtonClick:Lkotlin/jvm/functions/Function0;

    iput-object p8, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$5;->$onCancelClick:Lkotlin/jvm/functions/Function0;

    iput-object p9, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$5;->$formContent:Lkotlin/jvm/functions/Function3;

    iput p10, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$5;->$$changed:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$5;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 11

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$5;->$isProcessing:Z

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$5;->$isDefault:Z

    iget-boolean v2, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$5;->$setAsDefaultChecked:Z

    iget-boolean v3, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$5;->$primaryButtonEnabled:Z

    iget-object v4, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$5;->$errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    iget-object v5, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$5;->$onSetAsDefaultClick:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$5;->$onPrimaryButtonClick:Lkotlin/jvm/functions/Function0;

    iget-object v7, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$5;->$onCancelClick:Lkotlin/jvm/functions/Function0;

    iget-object v8, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$5;->$formContent:Lkotlin/jvm/functions/Function3;

    iget p2, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$5;->$$changed:I

    or-int/lit8 v10, p2, 0x1

    move-object v9, p1

    invoke-static/range {v0 .. v10}, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt;->CardEditBody(ZZZZLcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;LEt0;I)V

    return-void
.end method
