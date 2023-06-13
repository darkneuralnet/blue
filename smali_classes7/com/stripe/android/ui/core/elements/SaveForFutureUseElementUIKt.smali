.class public final Lcom/stripe/android/ui/core/elements/SaveForFutureUseElementUIKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\"\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "",
        "enabled",
        "Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;",
        "element",
        "LgV2;",
        "modifier",
        "",
        "SaveForFutureUseElementUI",
        "(ZLcom/stripe/android/ui/core/elements/SaveForFutureUseElement;LgV2;LEt0;II)V",
        "",
        "SAVE_FOR_FUTURE_CHECKBOX_TEST_TAG",
        "Ljava/lang/String;",
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
        "SMAP\nSaveForFutureUseElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveForFutureUseElementUI.kt\ncom/stripe/android/ui/core/elements/SaveForFutureUseElementUIKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,36:1\n76#2:37\n1#3:38\n76#4:39\n76#4:40\n*S KotlinDebug\n*F\n+ 1 SaveForFutureUseElementUI.kt\ncom/stripe/android/ui/core/elements/SaveForFutureUseElementUIKt\n*L\n23#1:37\n21#1:39\n22#1:40\n*E\n"
    }
.end annotation


# static fields
.field public static final SAVE_FOR_FUTURE_CHECKBOX_TEST_TAG:Ljava/lang/String; = "SAVE_FOR_FUTURE_CHECKBOX_TEST_TAG"


# direct methods
.method public static final SaveForFutureUseElementUI(ZLcom/stripe/android/ui/core/elements/SaveForFutureUseElement;LgV2;LEt0;II)V
    .locals 10

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3f3ea4fc

    invoke-interface {p3, v0}, LEt0;->u(I)LEt0;

    move-result-object p3

    and-int/lit8 v1, p5, 0x4

    if-eqz v1, :cond_0

    sget-object p2, LgV2;->b0:LgV2$a;

    :cond_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.ui.core.elements.SaveForFutureUseElementUI (SaveForFutureUseElementUI.kt:14)"

    invoke-static {v0, p4, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_1
    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->getController()Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;->getSaveForFutureUse()LEu1;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v3, 0x0

    const/16 v5, 0x38

    const/4 v6, 0x2

    move-object v4, p3

    invoke-static/range {v1 .. v6}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v7

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;->getLabel()LEu1;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v1

    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v2

    invoke-interface {p3, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-static {v7}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElementUIKt;->SaveForFutureUseElementUI$lambda$0(LsP5;)Z

    move-result v3

    invoke-static {v1}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElementUIKt;->SaveForFutureUseElementUI$lambda$1(LsP5;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->getMerchantName()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-virtual {v2, v1, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    move-object v4, v1

    const-string v2, "SAVE_FOR_FUTURE_CHECKBOX_TEST_TAG"

    new-instance v6, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElementUIKt$SaveForFutureUseElementUI$2;

    invoke-direct {v6, v0, v7}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElementUIKt$SaveForFutureUseElementUI$2;-><init>(Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;LsP5;)V

    shr-int/lit8 v0, p4, 0x6

    and-int/lit8 v0, v0, 0xe

    or-int/lit8 v0, v0, 0x30

    shl-int/lit8 v1, p4, 0xc

    const v5, 0xe000

    and-int/2addr v1, v5

    or-int v8, v0, v1

    const/4 v9, 0x0

    move-object v1, p2

    move v5, p0

    move-object v7, p3

    invoke-static/range {v1 .. v9}, Lcom/stripe/android/uicore/elements/CheckboxElementUIKt;->CheckboxElementUI(LgV2;Ljava/lang/String;ZLjava/lang/String;ZLkotlin/jvm/functions/Function1;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    invoke-interface {p3}, LEt0;->w()LWm5;

    move-result-object p3

    if-nez p3, :cond_4

    goto :goto_1

    :cond_4
    new-instance v0, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElementUIKt$SaveForFutureUseElementUI$3;

    move-object v1, v0

    move v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElementUIKt$SaveForFutureUseElementUI$3;-><init>(ZLcom/stripe/android/ui/core/elements/SaveForFutureUseElement;LgV2;II)V

    invoke-interface {p3, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1
    return-void
.end method

.method private static final SaveForFutureUseElementUI$lambda$0(LsP5;)Z
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

.method private static final SaveForFutureUseElementUI$lambda$1(LsP5;)Ljava/lang/Integer;
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

.method public static final synthetic access$SaveForFutureUseElementUI$lambda$0(LsP5;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElementUIKt;->SaveForFutureUseElementUI$lambda$0(LsP5;)Z

    move-result p0

    return p0
.end method
