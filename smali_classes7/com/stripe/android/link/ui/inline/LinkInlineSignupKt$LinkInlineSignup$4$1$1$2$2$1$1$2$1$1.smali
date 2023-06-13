.class final Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2;->invoke(LTe;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LTe;",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLinkInlineSignup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkInlineSignup.kt\ncom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2$1$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,299:1\n76#2:300\n*S KotlinDebug\n*F\n+ 1 LinkInlineSignup.kt\ncom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2$1$1\n*L\n264#1:300\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/ui/ErrorMessage;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2$1$1;->$errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LTe;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2$1$1;->invoke(LTe;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LTe;LEt0;I)V
    .locals 6

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.stripe.android.link.ui.inline.LinkInlineSignup.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LinkInlineSignup.kt:260)"

    const v1, -0x3e1e46e6

    invoke-static {v1, p3, p1, v0}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupKt$LinkInlineSignup$4$1$1$2$2$1$1$2$1$1;->$errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    const/4 p3, 0x0

    if-eqz p1, :cond_1

    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v0

    invoke-interface {p2, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "LocalContext.current.resources"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/stripe/android/link/ui/ErrorMessage;->getMessage(Landroid/content/res/Resources;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, p3

    :goto_0
    if-nez p1, :cond_2

    const-string p1, ""

    :cond_2
    move-object v0, p1

    sget-object p1, LgV2;->b0:LgV2$a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p1, v1, v2, p3}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v1

    const/4 v2, 0x0

    const/16 v4, 0x30

    const/4 v5, 0x4

    move-object v3, p2

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/link/ui/ErrorTextKt;->ErrorText(Ljava/lang/String;LgV2;Lcom/stripe/android/link/ui/ErrorTextStyle;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    return-void
.end method
