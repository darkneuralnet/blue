.class final Lcom/stripe/android/uicore/elements/CheckboxElementUIKt$CheckboxElementUI$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/CheckboxElementUIKt;->CheckboxElementUI(LgV2;Ljava/lang/String;ZLjava/lang/String;ZLkotlin/jvm/functions/Function1;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lss5;",
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
.field final synthetic $accessibilityDescription:Ljava/lang/String;

.field final synthetic $automationTestTag:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/CheckboxElementUIKt$CheckboxElementUI$1$1;->$automationTestTag:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/CheckboxElementUIKt$CheckboxElementUI$1$1;->$accessibilityDescription:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lss5;

    invoke-virtual {p0, p1}, Lcom/stripe/android/uicore/elements/CheckboxElementUIKt$CheckboxElementUI$1$1;->invoke(Lss5;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lss5;)V
    .locals 1

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/CheckboxElementUIKt$CheckboxElementUI$1$1;->$automationTestTag:Ljava/lang/String;

    invoke-static {p1, v0}, Lps5;->U(Lss5;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/CheckboxElementUIKt$CheckboxElementUI$1$1;->$accessibilityDescription:Ljava/lang/String;

    invoke-static {p1, v0}, Lps5;->T(Lss5;Ljava/lang/String;)V

    return-void
.end method
