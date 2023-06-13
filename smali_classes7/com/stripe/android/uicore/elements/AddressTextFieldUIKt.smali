.class public final Lcom/stripe/android/uicore/elements/AddressTextFieldUIKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u001a\'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/AddressTextFieldController;",
        "controller",
        "Lkotlin/Function0;",
        "",
        "onClick",
        "AddressTextFieldUI",
        "(Lcom/stripe/android/uicore/elements/AddressTextFieldController;Lkotlin/jvm/functions/Function0;LEt0;II)V",
        "stripe-ui-core_release"
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
        "SMAP\nAddressTextFieldUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressTextFieldUI.kt\ncom/stripe/android/uicore/elements/AddressTextFieldUIKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,26:1\n36#2:27\n1057#3,6:28\n*S KotlinDebug\n*F\n+ 1 AddressTextFieldUI.kt\ncom/stripe/android/uicore/elements/AddressTextFieldUIKt\n*L\n21#1:27\n21#1:28,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final AddressTextFieldUI(Lcom/stripe/android/uicore/elements/AddressTextFieldController;Lkotlin/jvm/functions/Function0;LEt0;II)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/AddressTextFieldController;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    const-string v0, "controller"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x7e3e5428

    invoke-interface {p2, v0}, LEt0;->u(I)LEt0;

    move-result-object p2

    and-int/lit8 v1, p4, 0x2

    if-eqz v1, :cond_0

    new-instance p1, Lcom/stripe/android/uicore/elements/AddressTextFieldUIKt$AddressTextFieldUI$1;

    invoke-direct {p1, p0}, Lcom/stripe/android/uicore/elements/AddressTextFieldUIKt$AddressTextFieldUI$1;-><init>(Lcom/stripe/android/uicore/elements/AddressTextFieldController;)V

    and-int/lit8 v1, p3, -0x71

    goto :goto_0

    :cond_0
    move v1, p3

    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.uicore.elements.AddressTextFieldUI (AddressTextFieldUI.kt:10)"

    invoke-static {v0, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_1
    sget-object v0, LFY1;->b:LFY1$a;

    invoke-virtual {v0}, LFY1$a;->d()I

    move-result v3

    sget-object v4, LgV2;->b0:LgV2$a;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v0, 0x44faf204

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-interface {p2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_2

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_3

    :cond_2
    new-instance v1, Lcom/stripe/android/uicore/elements/AddressTextFieldUIKt$AddressTextFieldUI$2$1;

    invoke-direct {v1, p1}, Lcom/stripe/android/uicore/elements/AddressTextFieldUIKt$AddressTextFieldUI$2$1;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-interface {p2, v1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_3
    invoke-interface {p2}, LEt0;->Q()V

    move-object v8, v1

    check-cast v8, Lkotlin/jvm/functions/Function0;

    const/4 v9, 0x7

    const/4 v10, 0x0

    invoke-static/range {v4 .. v10}, Lak0;->e(LgV2;ZLjava/lang/String;LCb5;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)LgV2;

    move-result-object v4

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v9, 0x38

    const/16 v10, 0x70

    move-object v1, p0

    move-object v8, p2

    invoke-static/range {v1 .. v10}, Lcom/stripe/android/uicore/elements/TextFieldUIKt;->TextField-ndPIYpw(Lcom/stripe/android/uicore/elements/TextFieldController;ZILgV2;Lkotlin/jvm/functions/Function1;IILEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    invoke-interface {p2}, LEt0;->w()LWm5;

    move-result-object p2

    if-nez p2, :cond_5

    goto :goto_1

    :cond_5
    new-instance v0, Lcom/stripe/android/uicore/elements/AddressTextFieldUIKt$AddressTextFieldUI$3;

    invoke-direct {v0, p0, p1, p3, p4}, Lcom/stripe/android/uicore/elements/AddressTextFieldUIKt$AddressTextFieldUI$3;-><init>(Lcom/stripe/android/uicore/elements/AddressTextFieldController;Lkotlin/jvm/functions/Function0;II)V

    invoke-interface {p2, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1
    return-void
.end method
