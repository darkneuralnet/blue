.class final Lcom/stripe/android/ui/core/elements/SaveForFutureUseElementUIKt$SaveForFutureUseElementUI$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/ui/core/elements/SaveForFutureUseElementUIKt;->SaveForFutureUseElementUI(ZLcom/stripe/android/ui/core/elements/SaveForFutureUseElement;LgV2;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
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
.field final synthetic $checked$delegate:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $controller:Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;


# direct methods
.method public constructor <init>(Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;LsP5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;",
            "LsP5<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElementUIKt$SaveForFutureUseElementUI$2;->$controller:Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElementUIKt$SaveForFutureUseElementUI$2;->$checked$delegate:LsP5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElementUIKt$SaveForFutureUseElementUI$2;->invoke(Z)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Z)V
    .locals 1

    iget-object p1, p0, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElementUIKt$SaveForFutureUseElementUI$2;->$controller:Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElementUIKt$SaveForFutureUseElementUI$2;->$checked$delegate:LsP5;

    invoke-static {v0}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElementUIKt;->access$SaveForFutureUseElementUI$lambda$0(LsP5;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;->onValueChange(Z)V

    return-void
.end method
