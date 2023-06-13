.class public final Lcom/stripe/android/ui/core/FormUIKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0008\u001a_\u0010\r\u001a\u00020\u000c2\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00002\u0012\u0010\u0008\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u00002\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00002\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001aG\u0010\r\u001a\u00020\u000c2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00042\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "LEu1;",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "hiddenIdentifiersFlow",
        "",
        "enabledFlow",
        "",
        "Lcom/stripe/android/uicore/elements/FormElement;",
        "elementsFlow",
        "lastTextFieldIdentifierFlow",
        "LgV2;",
        "modifier",
        "",
        "FormUI",
        "(LEu1;LEu1;LEu1;LEu1;LgV2;LEt0;II)V",
        "hiddenIdentifiers",
        "enabled",
        "elements",
        "lastTextFieldIdentifier",
        "(Ljava/util/Set;ZLjava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;LgV2;LEt0;II)V",
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
        "SMAP\nFormUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormUI.kt\ncom/stripe/android/ui/core/FormUIKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,102:1\n74#2,6:103\n80#2:135\n84#2:143\n75#3:109\n76#3,11:111\n89#3:142\n76#4:110\n460#5,13:122\n473#5,3:139\n1864#6,3:136\n76#7:144\n76#7:145\n76#7:146\n76#7:147\n*S KotlinDebug\n*F\n+ 1 FormUI.kt\ncom/stripe/android/ui/core/FormUIKt\n*L\n67#1:103,6\n67#1:135\n67#1:143\n67#1:109\n67#1:111,11\n67#1:142\n67#1:110\n67#1:122,13\n67#1:139,3\n70#1:136,3\n44#1:144\n45#1:145\n46#1:146\n47#1:147\n*E\n"
    }
.end annotation


# direct methods
.method public static final FormUI(LEu1;LEu1;LEu1;LEu1;LgV2;LEt0;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEu1<",
            "+",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;",
            "LEu1<",
            "+",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;>;",
            "LEu1<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;",
            "LgV2;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move/from16 v6, p6

    const-string v0, "hiddenIdentifiersFlow"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enabledFlow"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "elementsFlow"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastTextFieldIdentifierFlow"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x643bfc9b

    move-object/from16 v5, p5

    invoke-interface {v5, v0}, LEt0;->u(I)LEt0;

    move-result-object v5

    and-int/lit8 v7, p7, 0x10

    if-eqz v7, :cond_0

    sget-object v7, LgV2;->b0:LgV2$a;

    move-object v15, v7

    goto :goto_0

    :cond_0
    move-object/from16 v15, p4

    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, -0x1

    const-string v8, "com.stripe.android.ui.core.FormUI (FormUI.kt:36)"

    invoke-static {v0, v6, v7, v8}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_1
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v8

    const/4 v9, 0x0

    const/16 v11, 0x38

    const/4 v12, 0x2

    move-object/from16 v7, p0

    move-object v10, v5

    invoke-static/range {v7 .. v12}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v0

    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move-object/from16 v7, p1

    invoke-static/range {v7 .. v12}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v13

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v8

    move-object/from16 v7, p2

    invoke-static/range {v7 .. v12}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v14

    const/4 v8, 0x0

    move-object/from16 v7, p3

    invoke-static/range {v7 .. v12}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v7

    invoke-static {v0}, Lcom/stripe/android/ui/core/FormUIKt;->FormUI$lambda$0(LsP5;)Ljava/util/Set;

    move-result-object v0

    invoke-static {v13}, Lcom/stripe/android/ui/core/FormUIKt;->FormUI$lambda$1(LsP5;)Z

    move-result v8

    invoke-static {v14}, Lcom/stripe/android/ui/core/FormUIKt;->FormUI$lambda$2(LsP5;)Ljava/util/List;

    move-result-object v9

    invoke-static {v7}, Lcom/stripe/android/ui/core/FormUIKt;->FormUI$lambda$3(LsP5;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v10

    sget v7, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v7, v7, 0x9

    or-int/lit16 v7, v7, 0x208

    const v11, 0xe000

    and-int/2addr v11, v6

    or-int v13, v7, v11

    const/4 v14, 0x0

    move-object v7, v0

    move-object v11, v15

    move-object v12, v5

    invoke-static/range {v7 .. v14}, Lcom/stripe/android/ui/core/FormUIKt;->FormUI(Ljava/util/Set;ZLjava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;LgV2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
    invoke-interface {v5}, LEt0;->w()LWm5;

    move-result-object v8

    if-nez v8, :cond_3

    goto :goto_1

    :cond_3
    new-instance v9, Lcom/stripe/android/ui/core/FormUIKt$FormUI$1;

    move-object v0, v9

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object v5, v15

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/ui/core/FormUIKt$FormUI$1;-><init>(LEu1;LEu1;LEu1;LEu1;LgV2;II)V

    invoke-interface {v8, v9}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1
    return-void
.end method

.method public static final FormUI(Ljava/util/Set;ZLjava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;LgV2;LEt0;II)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;Z",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "LgV2;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v9, p0

    move/from16 v10, p1

    move-object/from16 v11, p2

    move/from16 v12, p6

    const-string v0, "hiddenIdentifiers"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "elements"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x5b08c833

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v13

    and-int/lit8 v1, p7, 0x10

    if-eqz v1, :cond_0

    sget-object v1, LgV2;->b0:LgV2$a;

    move-object v14, v1

    goto :goto_0

    :cond_0
    move-object/from16 v14, p4

    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.ui.core.FormUI (FormUI.kt:59)"

    invoke-static {v0, v12, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v14, v0}, LBB5;->m(LgV2;F)LgV2;

    move-result-object v0

    const v1, -0x1cd0f17e

    invoke-interface {v13, v1}, LEt0;->F(I)V

    sget-object v1, Llo;->a:Llo;

    invoke-virtual {v1}, Llo;->g()Llo$l;

    move-result-object v1

    sget-object v2, LK9;->a:LK9$a;

    invoke-virtual {v2}, LK9$a;->j()LK9$b;

    move-result-object v2

    const/4 v15, 0x0

    invoke-static {v1, v2, v13, v15}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v1

    const v2, -0x4ee9b9da

    invoke-interface {v13, v2}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v2

    invoke-interface {v13, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v3

    invoke-interface {v13, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v4

    invoke-interface {v13, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LJq6;

    sget-object v5, LBt0;->M:LBt0$a;

    invoke-virtual {v5}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v6

    invoke-static {v0}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-interface {v13}, LEt0;->v()Llm;

    move-result-object v7

    instance-of v7, v7, Llm;

    if-nez v7, :cond_2

    invoke-static {}, Lyt0;->c()V

    :cond_2
    invoke-interface {v13}, LEt0;->h()V

    invoke-interface {v13}, LEt0;->t()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v13, v6}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_3
    invoke-interface {v13}, LEt0;->e()V

    :goto_1
    invoke-interface {v13}, LEt0;->L()V

    invoke-static {v13}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v6

    invoke-virtual {v5}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, v1, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v5}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v2, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v5}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v3, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v5}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v4, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v13}, LEt0;->q()V

    invoke-static {v13}, LMB5;->b(LEt0;)LEt0;

    move-result-object v1

    invoke-static {v1}, LMB5;->a(LEt0;)LMB5;

    move-result-object v1

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v13, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v13, v0}, LEt0;->F(I)V

    const v0, -0x455f09d5

    invoke-interface {v13, v0}, LEt0;->F(I)V

    sget-object v0, LQm0;->a:LQm0;

    const v0, 0x4a5cce7d    # 3617695.2f

    invoke-interface {v13, v0}, LEt0;->F(I)V

    move-object v0, v11

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    move v0, v15

    :goto_2
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v17, v0, 0x1

    if-gez v0, :cond_4

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_4
    check-cast v1, Lcom/stripe/android/uicore/elements/FormElement;

    invoke-interface {v1}, Lcom/stripe/android/uicore/elements/FormElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-interface {v9, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    instance-of v0, v1, Lcom/stripe/android/uicore/elements/SectionElement;

    if-eqz v0, :cond_5

    const v0, 0x204ac71b

    invoke-interface {v13, v0}, LEt0;->F(I)V

    check-cast v1, Lcom/stripe/android/uicore/elements/SectionElement;

    const/4 v4, 0x0

    const/4 v5, 0x0

    shr-int/lit8 v0, v12, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int/lit16 v0, v0, 0x200

    sget v2, Lcom/stripe/android/uicore/elements/SectionElement;->$stable:I

    shl-int/lit8 v2, v2, 0x3

    or-int/2addr v0, v2

    sget v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v2, v2, 0x9

    or-int/2addr v0, v2

    and-int/lit16 v2, v12, 0x1c00

    or-int v7, v0, v2

    const/16 v8, 0x30

    move/from16 v0, p1

    move-object/from16 v2, p0

    move-object/from16 v3, p3

    move-object v6, v13

    invoke-static/range {v0 .. v8}, Lcom/stripe/android/uicore/elements/SectionElementUIKt;->SectionElementUI-rgidl0k(ZLcom/stripe/android/uicore/elements/SectionElement;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;II)V

    invoke-interface {v13}, LEt0;->Q()V

    goto/16 :goto_3

    :cond_5
    instance-of v0, v1, Lcom/stripe/android/ui/core/elements/StaticTextElement;

    const/16 v2, 0x8

    if-eqz v0, :cond_6

    const v0, 0x204ac80c

    invoke-interface {v13, v0}, LEt0;->F(I)V

    check-cast v1, Lcom/stripe/android/ui/core/elements/StaticTextElement;

    invoke-static {v1, v13, v2}, Lcom/stripe/android/ui/core/elements/StaticTextElementUIKt;->StaticTextElementUI(Lcom/stripe/android/ui/core/elements/StaticTextElement;LEt0;I)V

    invoke-interface {v13}, LEt0;->Q()V

    goto/16 :goto_3

    :cond_6
    instance-of v0, v1, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;

    if-eqz v0, :cond_7

    const v0, 0x204ac85b

    invoke-interface {v13, v0}, LEt0;->F(I)V

    check-cast v1, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;

    const/4 v2, 0x0

    shr-int/lit8 v0, v12, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int/lit8 v4, v0, 0x40

    const/4 v5, 0x4

    move/from16 v0, p1

    move-object v3, v13

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElementUIKt;->SaveForFutureUseElementUI(ZLcom/stripe/android/ui/core/elements/SaveForFutureUseElement;LgV2;LEt0;II)V

    invoke-interface {v13}, LEt0;->Q()V

    goto/16 :goto_3

    :cond_7
    instance-of v0, v1, Lcom/stripe/android/ui/core/elements/AfterpayClearpayHeaderElement;

    if-eqz v0, :cond_8

    const v0, 0x204ac8bf

    invoke-interface {v13, v0}, LEt0;->F(I)V

    check-cast v1, Lcom/stripe/android/ui/core/elements/AfterpayClearpayHeaderElement;

    shr-int/lit8 v0, v12, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int/lit8 v0, v0, 0x40

    invoke-static {v10, v1, v13, v0}, Lcom/stripe/android/ui/core/elements/AfterpayClearpayElementUIKt;->AfterpayClearpayElementUI(ZLcom/stripe/android/ui/core/elements/AfterpayClearpayHeaderElement;LEt0;I)V

    invoke-interface {v13}, LEt0;->Q()V

    goto/16 :goto_3

    :cond_8
    instance-of v0, v1, Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextElement;

    if-eqz v0, :cond_9

    const v0, 0x204ac969

    invoke-interface {v13, v0}, LEt0;->F(I)V

    check-cast v1, Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextElement;

    invoke-static {v1, v13, v2}, Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateElementUIKt;->AuBecsDebitMandateElementUI(Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextElement;LEt0;I)V

    invoke-interface {v13}, LEt0;->Q()V

    goto/16 :goto_3

    :cond_9
    instance-of v0, v1, Lcom/stripe/android/ui/core/elements/AffirmHeaderElement;

    if-eqz v0, :cond_a

    const v0, 0x204ac9bc

    invoke-interface {v13, v0}, LEt0;->F(I)V

    invoke-static {v13, v15}, Lcom/stripe/android/ui/core/elements/AffirmElementUIKt;->AffirmElementUI(LEt0;I)V

    invoke-interface {v13}, LEt0;->Q()V

    goto/16 :goto_3

    :cond_a
    instance-of v0, v1, Lcom/stripe/android/ui/core/elements/MandateTextElement;

    if-eqz v0, :cond_b

    const v0, 0x204ac9fb

    invoke-interface {v13, v0}, LEt0;->F(I)V

    check-cast v1, Lcom/stripe/android/ui/core/elements/MandateTextElement;

    invoke-static {v1, v13, v2}, Lcom/stripe/android/ui/core/elements/MandateTextUIKt;->MandateTextUI(Lcom/stripe/android/ui/core/elements/MandateTextElement;LEt0;I)V

    invoke-interface {v13}, LEt0;->Q()V

    goto/16 :goto_3

    :cond_b
    instance-of v0, v1, Lcom/stripe/android/ui/core/elements/CardDetailsSectionElement;

    if-eqz v0, :cond_c

    const v0, 0x204aca46

    invoke-interface {v13, v0}, LEt0;->F(I)V

    check-cast v1, Lcom/stripe/android/ui/core/elements/CardDetailsSectionElement;

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CardDetailsSectionElement;->getController()Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;

    move-result-object v1

    shr-int/lit8 v0, v12, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int/lit16 v0, v0, 0x240

    sget v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v2, v2, 0x9

    or-int/2addr v0, v2

    and-int/lit16 v2, v12, 0x1c00

    or-int v5, v0, v2

    move/from16 v0, p1

    move-object/from16 v2, p0

    move-object/from16 v3, p3

    move-object v4, v13

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/ui/core/elements/CardDetailsSectionElementUIKt;->CardDetailsSectionElementUI(ZLcom/stripe/android/ui/core/elements/CardDetailsSectionController;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;LEt0;I)V

    invoke-interface {v13}, LEt0;->Q()V

    goto :goto_3

    :cond_c
    instance-of v0, v1, Lcom/stripe/android/ui/core/elements/BsbElement;

    if-eqz v0, :cond_d

    const v0, 0x204acb46

    invoke-interface {v13, v0}, LEt0;->F(I)V

    check-cast v1, Lcom/stripe/android/ui/core/elements/BsbElement;

    shr-int/lit8 v0, v12, 0x3

    and-int/lit8 v2, v0, 0xe

    or-int/lit8 v2, v2, 0x40

    sget v3, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v3, v3, 0x6

    or-int/2addr v2, v3

    and-int/lit16 v0, v0, 0x380

    or-int/2addr v0, v2

    move-object/from16 v8, p3

    invoke-static {v10, v1, v8, v13, v0}, Lcom/stripe/android/ui/core/elements/BsbElementUIKt;->BsbElementUI(ZLcom/stripe/android/ui/core/elements/BsbElement;Lcom/stripe/android/uicore/elements/IdentifierSpec;LEt0;I)V

    invoke-interface {v13}, LEt0;->Q()V

    goto :goto_4

    :cond_d
    move-object/from16 v8, p3

    instance-of v0, v1, Lcom/stripe/android/uicore/elements/OTPElement;

    if-eqz v0, :cond_e

    const v0, 0x204acba3

    invoke-interface {v13, v0}, LEt0;->F(I)V

    check-cast v1, Lcom/stripe/android/uicore/elements/OTPElement;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    shr-int/lit8 v0, v12, 0x3

    and-int/lit8 v0, v0, 0xe

    sget v5, Lcom/stripe/android/uicore/elements/OTPElement;->$stable:I

    shl-int/lit8 v5, v5, 0x3

    or-int v6, v0, v5

    const/16 v7, 0x1c

    move/from16 v0, p1

    move-object v5, v13

    invoke-static/range {v0 .. v7}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->OTPElementUI(ZLcom/stripe/android/uicore/elements/OTPElement;LgV2;Lcom/stripe/android/uicore/elements/OTPElementColors;Landroidx/compose/ui/focus/h;LEt0;II)V

    invoke-interface {v13}, LEt0;->Q()V

    goto :goto_4

    :cond_e
    instance-of v0, v1, Lcom/stripe/android/ui/core/elements/EmptyFormElement;

    if-eqz v0, :cond_f

    const v0, 0x204acbed

    invoke-interface {v13, v0}, LEt0;->F(I)V

    invoke-interface {v13}, LEt0;->Q()V

    goto :goto_4

    :cond_f
    const v0, 0x204acc01

    invoke-interface {v13, v0}, LEt0;->F(I)V

    invoke-interface {v13}, LEt0;->Q()V

    goto :goto_4

    :cond_10
    :goto_3
    move-object/from16 v8, p3

    :goto_4
    move/from16 v0, v17

    goto/16 :goto_2

    :cond_11
    move-object/from16 v8, p3

    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->f()V

    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-static {}, LQt0;->Y()V

    :cond_12
    invoke-interface {v13}, LEt0;->w()LWm5;

    move-result-object v13

    if-nez v13, :cond_13

    goto :goto_5

    :cond_13
    new-instance v15, Lcom/stripe/android/ui/core/FormUIKt$FormUI$3;

    move-object v0, v15

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object v5, v14

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/ui/core/FormUIKt$FormUI$3;-><init>(Ljava/util/Set;ZLjava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;LgV2;II)V

    invoke-interface {v13, v15}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_5
    return-void
.end method

.method private static final FormUI$lambda$0(LsP5;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "+",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;)",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    return-object p0
.end method

.method private static final FormUI$lambda$1(LsP5;)Z
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

.method private static final FormUI$lambda$2(LsP5;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "+",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;>;)",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method private static final FormUI$lambda$3(LsP5;)Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;)",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object p0
.end method
