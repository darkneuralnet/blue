.class final Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$5$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$5;->invoke(LPm0;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
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
.field final synthetic $controller:Lcom/stripe/android/uicore/elements/DropdownFieldController;

.field final synthetic $expanded$delegate:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $index:I


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/DropdownFieldController;ILEX2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/DropdownFieldController;",
            "I",
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$5$1$1;->$controller:Lcom/stripe/android/uicore/elements/DropdownFieldController;

    iput p2, p0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$5$1$1;->$index:I

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$5$1$1;->$expanded$delegate:LEX2;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$5$1$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$5$1$1;->$expanded$delegate:LEX2;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt;->access$DropDown$lambda$4(LEX2;Z)V

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$5$1$1;->$controller:Lcom/stripe/android/uicore/elements/DropdownFieldController;

    iget v1, p0, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt$DropDown$1$5$1$1;->$index:I

    invoke-virtual {v0, v1}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->onValueChange(I)V

    return-void
.end method
