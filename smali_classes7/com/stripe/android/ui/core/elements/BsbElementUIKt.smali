.class public final Lcom/stripe/android/ui/core/elements/BsbElementUIKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "",
        "enabled",
        "Lcom/stripe/android/ui/core/elements/BsbElement;",
        "element",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "lastTextFieldIdentifier",
        "",
        "BsbElementUI",
        "(ZLcom/stripe/android/ui/core/elements/BsbElement;Lcom/stripe/android/uicore/elements/IdentifierSpec;LEt0;I)V",
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
        "SMAP\nBsbElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BsbElementUI.kt\ncom/stripe/android/ui/core/elements/BsbElementUIKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,60:1\n73#2,7:61\n80#2:94\n84#2:99\n75#3:68\n76#3,11:70\n89#3:98\n76#4:69\n460#5,13:81\n473#5,3:95\n76#6:100\n76#6:101\n*S KotlinDebug\n*F\n+ 1 BsbElementUI.kt\ncom/stripe/android/ui/core/elements/BsbElementUIKt\n*L\n34#1:61,7\n34#1:94\n34#1:99\n34#1:68\n34#1:70,11\n34#1:98\n34#1:69\n34#1:81,13\n34#1:95,3\n24#1:100\n25#1:101\n*E\n"
    }
.end annotation


# direct methods
.method public static final BsbElementUI(ZLcom/stripe/android/ui/core/elements/BsbElement;Lcom/stripe/android/uicore/elements/IdentifierSpec;LEt0;I)V
    .locals 11

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x3f4d4920

    invoke-interface {p3, v0}, LEt0;->u(I)LEt0;

    move-result-object p3

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.ui.core.elements.BsbElementUI (BsbElementUI.kt:18)"

    invoke-static {v0, p4, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/BsbElement;->getTextElement$payments_ui_core_release()Lcom/stripe/android/uicore/elements/SimpleTextElement;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/SimpleTextElement;->getController()Lcom/stripe/android/uicore/elements/TextFieldController;

    move-result-object v0

    invoke-interface {v0}, Lcom/stripe/android/uicore/elements/SectionFieldErrorController;->getError()LEu1;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v5, 0x38

    const/4 v6, 0x2

    move-object v4, p3

    invoke-static/range {v1 .. v6}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v0

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/BsbElement;->getBankName()LEu1;

    move-result-object v1

    invoke-static/range {v1 .. v6}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v1

    invoke-static {v0}, Lcom/stripe/android/ui/core/elements/BsbElementUIKt;->BsbElementUI$lambda$0(LsP5;)Lcom/stripe/android/uicore/elements/FieldError;

    move-result-object v0

    const v2, 0x200fa0cd

    invoke-interface {p3, v2}, LEt0;->F(I)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/FieldError;->getFormatArgs()[Ljava/lang/Object;

    move-result-object v4

    const v5, 0x200fa0ea

    invoke-interface {p3, v5}, LEt0;->F(I)V

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/FieldError;->getErrorMessage()I

    move-result v2

    array-length v5, v4

    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    const/16 v5, 0x40

    invoke-static {v2, v4, p3, v5}, LfS5;->d(I[Ljava/lang/Object;LEt0;I)Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-interface {p3}, LEt0;->Q()V

    if-nez v2, :cond_3

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/FieldError;->getErrorMessage()I

    move-result v0

    invoke-static {v0, p3, v3}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {p3}, LEt0;->Q()V

    const v0, -0x1cd0f17e

    invoke-interface {p3, v0}, LEt0;->F(I)V

    sget-object v0, LgV2;->b0:LgV2$a;

    sget-object v4, Llo;->a:Llo;

    invoke-virtual {v4}, Llo;->g()Llo$l;

    move-result-object v4

    sget-object v5, LK9;->a:LK9$a;

    invoke-virtual {v5}, LK9$a;->j()LK9$b;

    move-result-object v5

    invoke-static {v4, v5, p3, v3}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v4

    const v5, -0x4ee9b9da

    invoke-interface {p3, v5}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v5

    invoke-interface {p3, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v6

    invoke-interface {p3, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v7

    invoke-interface {p3, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LJq6;

    sget-object v8, LBt0;->M:LBt0$a;

    invoke-virtual {v8}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v9

    invoke-static {v0}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-interface {p3}, LEt0;->v()Llm;

    move-result-object v10

    instance-of v10, v10, Llm;

    if-nez v10, :cond_4

    invoke-static {}, Lyt0;->c()V

    :cond_4
    invoke-interface {p3}, LEt0;->h()V

    invoke-interface {p3}, LEt0;->t()Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-interface {p3, v9}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_2

    :cond_5
    invoke-interface {p3}, LEt0;->e()V

    :goto_2
    invoke-interface {p3}, LEt0;->L()V

    invoke-static {p3}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v9

    invoke-virtual {v8}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v9, v4, v10}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v8}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v9, v5, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v8}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v9, v6, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v8}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v9, v7, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {p3}, LEt0;->q()V

    invoke-static {p3}, LMB5;->b(LEt0;)LEt0;

    move-result-object v4

    invoke-static {v4}, LMB5;->a(LEt0;)LMB5;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v4, p3, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {p3, v0}, LEt0;->F(I)V

    const v0, -0x455f09d5

    invoke-interface {p3, v0}, LEt0;->F(I)V

    sget-object v0, LQm0;->a:LQm0;

    const v0, 0x6af0f3aa

    invoke-interface {p3, v0}, LEt0;->F(I)V

    const/4 v0, 0x0

    new-instance v3, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$BsbElementUI$1$1;

    invoke-direct {v3, v1}, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$BsbElementUI$1$1;-><init>(LsP5;)V

    const v1, -0x5d44c44e

    const/4 v4, 0x1

    invoke-static {p3, v1, v4, v3}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v3

    new-instance v1, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$BsbElementUI$1$2;

    invoke-direct {v1, p1, p0, p2, p4}, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$BsbElementUI$1$2;-><init>(Lcom/stripe/android/ui/core/elements/BsbElement;ZLcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    const v5, -0x3ac57f0d

    invoke-static {p3, v5, v4, v1}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v4

    const/16 v6, 0xd86

    const/4 v7, 0x0

    move-object v1, v0

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/uicore/elements/SectionUIKt;->Section(Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-interface {p3}, LEt0;->Q()V

    invoke-interface {p3}, LEt0;->Q()V

    invoke-interface {p3}, LEt0;->Q()V

    invoke-interface {p3}, LEt0;->f()V

    invoke-interface {p3}, LEt0;->Q()V

    invoke-interface {p3}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    invoke-interface {p3}, LEt0;->w()LWm5;

    move-result-object p3

    if-nez p3, :cond_7

    goto :goto_3

    :cond_7
    new-instance v0, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$BsbElementUI$2;

    invoke-direct {v0, p0, p1, p2, p4}, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$BsbElementUI$2;-><init>(ZLcom/stripe/android/ui/core/elements/BsbElement;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    invoke-interface {p3, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_3
    return-void
.end method

.method private static final BsbElementUI$lambda$0(LsP5;)Lcom/stripe/android/uicore/elements/FieldError;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Lcom/stripe/android/uicore/elements/FieldError;",
            ">;)",
            "Lcom/stripe/android/uicore/elements/FieldError;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/uicore/elements/FieldError;

    return-object p0
.end method

.method private static final BsbElementUI$lambda$1(LsP5;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$BsbElementUI$lambda$1(LsP5;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/ui/core/elements/BsbElementUIKt;->BsbElementUI$lambda$1(LsP5;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
