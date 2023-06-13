.class public final Lcom/stripe/android/ui/core/elements/StaticTextElementUIKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/StaticTextElement;",
        "element",
        "",
        "StaticTextElementUI",
        "(Lcom/stripe/android/ui/core/elements/StaticTextElement;LEt0;I)V",
        "payments-ui-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nStaticTextElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StaticTextElementUI.kt\ncom/stripe/android/ui/core/elements/StaticTextElementUIKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,24:1\n154#2:25\n*S KotlinDebug\n*F\n+ 1 StaticTextElementUI.kt\ncom/stripe/android/ui/core/elements/StaticTextElementUIKt\n*L\n20#1:25\n*E\n"
    }
.end annotation


# direct methods
.method public static final StaticTextElementUI(Lcom/stripe/android/ui/core/elements/StaticTextElement;LEt0;I)V
    .locals 7

    const-string v0, "element"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x1bc93a80

    invoke-interface {p1, v0}, LEt0;->u(I)LEt0;

    move-result-object p1

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.ui.core.elements.StaticTextElementUI (StaticTextElementUI.kt:13)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/StaticTextElement;->getStringResId()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v0

    sget-object v2, LgV2;->b0:LgV2$a;

    const/16 v3, 0x8

    int-to-float v3, v3

    invoke-static {v3}, Lk61;->g(F)F

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-static {v2, v5, v3, v6, v4}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v2

    sget-object v3, Lcom/stripe/android/ui/core/elements/StaticTextElementUIKt$StaticTextElementUI$1;->INSTANCE:Lcom/stripe/android/ui/core/elements/StaticTextElementUIKt$StaticTextElementUI$1;

    invoke-static {v2, v6, v3}, Lfs5;->a(LgV2;ZLkotlin/jvm/functions/Function1;)LgV2;

    move-result-object v2

    invoke-static {v0, v2, p1, v1, v1}, Lcom/stripe/android/uicore/elements/H6TextKt;->H6Text(Ljava/lang/String;LgV2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p1}, LEt0;->w()LWm5;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/stripe/android/ui/core/elements/StaticTextElementUIKt$StaticTextElementUI$2;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/ui/core/elements/StaticTextElementUIKt$StaticTextElementUI$2;-><init>(Lcom/stripe/android/ui/core/elements/StaticTextElement;I)V

    invoke-interface {p1, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method
