.class final Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->invoke(LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LWv1;",
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
.field final synthetic $focusedElementIndex$delegate:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $index:I

.field final synthetic $isSelected:Z


# direct methods
.method public constructor <init>(IZLEX2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ",
            "LEX2<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$1$1;->$index:I

    iput-boolean p2, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$1$1;->$isSelected:Z

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$1$1;->$focusedElementIndex$delegate:LEX2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWv1;

    invoke-virtual {p0, p1}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$1$1;->invoke(LWv1;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LWv1;)V
    .locals 1

    const-string v0, "focusState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LWv1;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$1$1;->$focusedElementIndex$delegate:LEX2;

    iget v0, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$1$1;->$index:I

    invoke-static {p1, v0}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->access$OTPElementUI$lambda$5$lambda$3(LEX2;I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LWv1;->a()Z

    move-result p1

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$1$1;->$isSelected:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$1$1;->$focusedElementIndex$delegate:LEX2;

    const/4 v0, -0x1

    invoke-static {p1, v0}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->access$OTPElementUI$lambda$5$lambda$3(LEX2;I)V

    :cond_1
    :goto_0
    return-void
.end method
