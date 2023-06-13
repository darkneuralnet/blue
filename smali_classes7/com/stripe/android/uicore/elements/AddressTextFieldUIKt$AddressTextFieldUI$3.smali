.class final Lcom/stripe/android/uicore/elements/AddressTextFieldUIKt$AddressTextFieldUI$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/AddressTextFieldUIKt;->AddressTextFieldUI(Lcom/stripe/android/uicore/elements/AddressTextFieldController;Lkotlin/jvm/functions/Function0;LEt0;II)V
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

.field final synthetic $controller:Lcom/stripe/android/uicore/elements/AddressTextFieldController;

.field final synthetic $onClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/AddressTextFieldController;Lkotlin/jvm/functions/Function0;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/AddressTextFieldController;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;II)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldUIKt$AddressTextFieldUI$3;->$controller:Lcom/stripe/android/uicore/elements/AddressTextFieldController;

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldUIKt$AddressTextFieldUI$3;->$onClick:Lkotlin/jvm/functions/Function0;

    iput p3, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldUIKt$AddressTextFieldUI$3;->$$changed:I

    iput p4, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldUIKt$AddressTextFieldUI$3;->$$default:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/elements/AddressTextFieldUIKt$AddressTextFieldUI$3;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 3

    iget-object p2, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldUIKt$AddressTextFieldUI$3;->$controller:Lcom/stripe/android/uicore/elements/AddressTextFieldController;

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldUIKt$AddressTextFieldUI$3;->$onClick:Lkotlin/jvm/functions/Function0;

    iget v1, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldUIKt$AddressTextFieldUI$3;->$$changed:I

    or-int/lit8 v1, v1, 0x1

    iget v2, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldUIKt$AddressTextFieldUI$3;->$$default:I

    invoke-static {p2, v0, p1, v1, v2}, Lcom/stripe/android/uicore/elements/AddressTextFieldUIKt;->AddressTextFieldUI(Lcom/stripe/android/uicore/elements/AddressTextFieldController;Lkotlin/jvm/functions/Function0;LEt0;II)V

    return-void
.end method
