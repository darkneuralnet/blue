.class public final Lcom/stripe/android/uicore/elements/SameAsShippingElementUIKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/SameAsShippingController;",
        "controller",
        "",
        "SameAsShippingElementUI",
        "(Lcom/stripe/android/uicore/elements/SameAsShippingController;LEt0;I)V",
        "",
        "SAME_AS_SHIPPING_CHECKBOX_TEST_TAG",
        "Ljava/lang/String;",
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
        "SMAP\nSameAsShippingElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SameAsShippingElementUI.kt\ncom/stripe/android/uicore/elements/SameAsShippingElementUIKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,29:1\n1#2:30\n76#3:31\n76#3:32\n*S KotlinDebug\n*F\n+ 1 SameAsShippingElementUI.kt\ncom/stripe/android/uicore/elements/SameAsShippingElementUIKt\n*L\n16#1:31\n17#1:32\n*E\n"
    }
.end annotation


# static fields
.field public static final SAME_AS_SHIPPING_CHECKBOX_TEST_TAG:Ljava/lang/String; = "SAME_AS_SHIPPING_CHECKBOX_TEST_TAG"


# direct methods
.method public static final SameAsShippingElementUI(Lcom/stripe/android/uicore/elements/SameAsShippingController;LEt0;I)V
    .locals 10

    const-string v0, "controller"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7e6351df

    invoke-interface {p1, v0}, LEt0;->u(I)LEt0;

    move-result-object p1

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.uicore.elements.SameAsShippingElementUI (SameAsShippingElementUI.kt:12)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SameAsShippingController;->getValue()LEu1;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v3, 0x0

    const/16 v5, 0x38

    const/4 v6, 0x2

    move-object v4, p1

    invoke-static/range {v1 .. v6}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SameAsShippingController;->getLabel()LEu1;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v1

    const-string v3, "SAME_AS_SHIPPING_CHECKBOX_TEST_TAG"

    invoke-static {v0}, Lcom/stripe/android/uicore/elements/SameAsShippingElementUIKt;->SameAsShippingElementUI$lambda$0(LsP5;)Z

    move-result v4

    invoke-static {v1}, Lcom/stripe/android/uicore/elements/SameAsShippingElementUIKt;->SameAsShippingElementUI$lambda$1(LsP5;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    const/4 v5, 0x0

    invoke-static {v1, p1, v5}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    move-object v5, v1

    const/4 v6, 0x1

    new-instance v7, Lcom/stripe/android/uicore/elements/SameAsShippingElementUIKt$SameAsShippingElementUI$2;

    invoke-direct {v7, p0, v0}, Lcom/stripe/android/uicore/elements/SameAsShippingElementUIKt$SameAsShippingElementUI$2;-><init>(Lcom/stripe/android/uicore/elements/SameAsShippingController;LsP5;)V

    const/16 v8, 0x6030

    const/4 v9, 0x1

    move-object v1, v2

    move-object v2, v3

    move v3, v4

    move-object v4, v5

    move v5, v6

    move-object v6, v7

    move-object v7, p1

    invoke-static/range {v1 .. v9}, Lcom/stripe/android/uicore/elements/CheckboxElementUIKt;->CheckboxElementUI(LgV2;Ljava/lang/String;ZLjava/lang/String;ZLkotlin/jvm/functions/Function1;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
    invoke-interface {p1}, LEt0;->w()LWm5;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    new-instance v0, Lcom/stripe/android/uicore/elements/SameAsShippingElementUIKt$SameAsShippingElementUI$3;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/uicore/elements/SameAsShippingElementUIKt$SameAsShippingElementUI$3;-><init>(Lcom/stripe/android/uicore/elements/SameAsShippingController;I)V

    invoke-interface {p1, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1
    return-void
.end method

.method private static final SameAsShippingElementUI$lambda$0(LsP5;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final SameAsShippingElementUI$lambda$1(LsP5;)Ljava/lang/Integer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    return-object p0
.end method

.method public static final synthetic access$SameAsShippingElementUI$lambda$0(LsP5;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/SameAsShippingElementUIKt;->SameAsShippingElementUI$lambda$0(LsP5;)Z

    move-result p0

    return p0
.end method
