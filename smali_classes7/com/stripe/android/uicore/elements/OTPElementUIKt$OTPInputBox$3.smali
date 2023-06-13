.class final Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


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
        "Lkotlin/jvm/functions/Function1<",
        "LF16;",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOTPElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OTPElementUI.kt\ncom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,257:1\n1855#2,2:258\n*S KotlinDebug\n*F\n+ 1 OTPElementUI.kt\ncom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$3\n*L\n200#1:258,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $element:Lcom/stripe/android/uicore/elements/OTPElement;

.field final synthetic $focusManager:LBv1;

.field final synthetic $index:I


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/OTPElement;ILBv1;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$3;->$element:Lcom/stripe/android/uicore/elements/OTPElement;

    iput p2, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$3;->$index:I

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$3;->$focusManager:LBv1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF16;

    invoke-virtual {p0, p1}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$3;->invoke(LF16;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LF16;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$3;->$element:Lcom/stripe/android/uicore/elements/OTPElement;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/OTPElement;->getController()Lcom/stripe/android/uicore/elements/OTPController;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$3;->$index:I

    invoke-virtual {p1}, LF16;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/stripe/android/uicore/elements/OTPController;->onValueChanged(ILjava/lang/String;)I

    move-result p1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$3;->$focusManager:LBv1;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Lkotlin/collections/IntIterator;

    invoke-virtual {v1}, Lkotlin/collections/IntIterator;->nextInt()I

    sget-object v1, Landroidx/compose/ui/focus/c;->b:Landroidx/compose/ui/focus/c$a;

    invoke-virtual {v1}, Landroidx/compose/ui/focus/c$a;->e()I

    move-result v1

    invoke-interface {v0, v1}, LBv1;->i(I)Z

    goto :goto_0

    :cond_0
    return-void
.end method
