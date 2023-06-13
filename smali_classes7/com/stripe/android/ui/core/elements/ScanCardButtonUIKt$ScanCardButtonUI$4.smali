.class final Lcom/stripe/android/ui/core/elements/ScanCardButtonUIKt$ScanCardButtonUI$4;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/ui/core/elements/ScanCardButtonUIKt;->ScanCardButtonUI(ZLkotlin/jvm/functions/Function1;LEt0;I)V
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

.field final synthetic $enabled:Z

.field final synthetic $onResult:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroid/content/Intent;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLkotlin/jvm/functions/Function1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/content/Intent;",
            "Lkotlin/Unit;",
            ">;I)V"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/stripe/android/ui/core/elements/ScanCardButtonUIKt$ScanCardButtonUI$4;->$enabled:Z

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/ScanCardButtonUIKt$ScanCardButtonUI$4;->$onResult:Lkotlin/jvm/functions/Function1;

    iput p3, p0, Lcom/stripe/android/ui/core/elements/ScanCardButtonUIKt$ScanCardButtonUI$4;->$$changed:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/ui/core/elements/ScanCardButtonUIKt$ScanCardButtonUI$4;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 2

    iget-boolean p2, p0, Lcom/stripe/android/ui/core/elements/ScanCardButtonUIKt$ScanCardButtonUI$4;->$enabled:Z

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/ScanCardButtonUIKt$ScanCardButtonUI$4;->$onResult:Lkotlin/jvm/functions/Function1;

    iget v1, p0, Lcom/stripe/android/ui/core/elements/ScanCardButtonUIKt$ScanCardButtonUI$4;->$$changed:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {p2, v0, p1, v1}, Lcom/stripe/android/ui/core/elements/ScanCardButtonUIKt;->ScanCardButtonUI(ZLkotlin/jvm/functions/Function1;LEt0;I)V

    return-void
.end method
