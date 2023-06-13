.class public final Lcom/stripe/android/uicore/elements/SectionFieldElementUIKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u001a]\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\nH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0011"
    }
    d2 = {
        "",
        "enabled",
        "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
        "field",
        "LgV2;",
        "modifier",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "hiddenIdentifiers",
        "lastTextFieldIdentifier",
        "Landroidx/compose/ui/focus/c;",
        "nextFocusDirection",
        "previousFocusDirection",
        "",
        "SectionFieldElementUI-0uKR9Ig",
        "(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;II)V",
        "SectionFieldElementUI",
        "stripe-ui-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final SectionFieldElementUI-0uKR9Ig(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;II)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            "LgV2;",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "II",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v10, p1

    move/from16 v11, p8

    const-string v0, "field"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3ec2937f

    move-object/from16 v1, p7

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v12

    and-int/lit8 v1, p9, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v11, 0x6

    move/from16 v13, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v11, 0xe

    move/from16 v13, p0

    if-nez v1, :cond_2

    invoke-interface {v12, v13}, LEt0;->o(Z)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v11

    goto :goto_1

    :cond_2
    move v1, v11

    :goto_1
    and-int/lit8 v2, p9, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v2, v11, 0x70

    if-nez v2, :cond_5

    invoke-interface {v12, v10}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x20

    goto :goto_2

    :cond_4
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_5
    :goto_3
    and-int/lit8 v2, p9, 0x4

    if-eqz v2, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v3, v11, 0x380

    if-nez v3, :cond_8

    move-object/from16 v3, p2

    invoke-interface {v12, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x100

    goto :goto_4

    :cond_7
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v1, v4

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v3, p2

    :goto_6
    and-int/lit8 v4, p9, 0x8

    if-eqz v4, :cond_9

    or-int/lit16 v1, v1, 0x400

    :cond_9
    and-int/lit8 v5, p9, 0x10

    const v6, 0xe000

    if-eqz v5, :cond_a

    or-int/lit16 v1, v1, 0x6000

    move-object/from16 v14, p4

    goto :goto_8

    :cond_a
    and-int v5, v11, v6

    move-object/from16 v14, p4

    if-nez v5, :cond_c

    invoke-interface {v12, v14}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    const/16 v5, 0x4000

    goto :goto_7

    :cond_b
    const/16 v5, 0x2000

    :goto_7
    or-int/2addr v1, v5

    :cond_c
    :goto_8
    const/high16 v5, 0x70000

    and-int v7, v11, v5

    if-nez v7, :cond_f

    and-int/lit8 v7, p9, 0x20

    if-nez v7, :cond_d

    move/from16 v7, p5

    invoke-interface {v12, v7}, LEt0;->r(I)Z

    move-result v8

    if-eqz v8, :cond_e

    const/high16 v8, 0x20000

    goto :goto_9

    :cond_d
    move/from16 v7, p5

    :cond_e
    const/high16 v8, 0x10000

    :goto_9
    or-int/2addr v1, v8

    goto :goto_a

    :cond_f
    move/from16 v7, p5

    :goto_a
    const/high16 v8, 0x380000

    and-int v9, v11, v8

    if-nez v9, :cond_12

    and-int/lit8 v9, p9, 0x40

    if-nez v9, :cond_10

    move/from16 v9, p6

    invoke-interface {v12, v9}, LEt0;->r(I)Z

    move-result v15

    if-eqz v15, :cond_11

    const/high16 v15, 0x100000

    goto :goto_b

    :cond_10
    move/from16 v9, p6

    :cond_11
    const/high16 v15, 0x80000

    :goto_b
    or-int/2addr v1, v15

    goto :goto_c

    :cond_12
    move/from16 v9, p6

    :goto_c
    const/16 v15, 0x8

    if-ne v4, v15, :cond_14

    const v15, 0x2db6db

    and-int/2addr v15, v1

    const v8, 0x92492

    if-ne v15, v8, :cond_14

    invoke-interface {v12}, LEt0;->b()Z

    move-result v8

    if-nez v8, :cond_13

    goto :goto_d

    :cond_13
    invoke-interface {v12}, LEt0;->k()V

    move-object/from16 v4, p3

    move v6, v7

    move v7, v9

    goto/16 :goto_15

    :cond_14
    :goto_d
    invoke-interface {v12}, LEt0;->J()V

    and-int/lit8 v8, v11, 0x1

    const v15, -0x380001

    const v16, -0x70001

    if-eqz v8, :cond_18

    invoke-interface {v12}, LEt0;->l()Z

    move-result v8

    if-eqz v8, :cond_15

    goto :goto_e

    :cond_15
    invoke-interface {v12}, LEt0;->k()V

    and-int/lit8 v2, p9, 0x20

    if-eqz v2, :cond_16

    and-int v1, v1, v16

    :cond_16
    and-int/lit8 v2, p9, 0x40

    if-eqz v2, :cond_17

    and-int/2addr v1, v15

    :cond_17
    move-object v15, v3

    move/from16 v16, v7

    move/from16 v17, v9

    move-object/from16 v9, p3

    goto :goto_11

    :cond_18
    :goto_e
    if-eqz v2, :cond_19

    sget-object v2, LgV2;->b0:LgV2$a;

    goto :goto_f

    :cond_19
    move-object v2, v3

    :goto_f
    if-eqz v4, :cond_1a

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v3

    goto :goto_10

    :cond_1a
    move-object/from16 v3, p3

    :goto_10
    and-int/lit8 v4, p9, 0x20

    if-eqz v4, :cond_1b

    sget-object v4, Landroidx/compose/ui/focus/c;->b:Landroidx/compose/ui/focus/c$a;

    invoke-virtual {v4}, Landroidx/compose/ui/focus/c$a;->a()I

    move-result v4

    and-int v1, v1, v16

    move v7, v4

    :cond_1b
    and-int/lit8 v4, p9, 0x40

    if-eqz v4, :cond_1c

    sget-object v4, Landroidx/compose/ui/focus/c;->b:Landroidx/compose/ui/focus/c$a;

    invoke-virtual {v4}, Landroidx/compose/ui/focus/c$a;->h()I

    move-result v4

    and-int/2addr v1, v15

    move-object v15, v2

    move-object v9, v3

    move/from16 v17, v4

    move/from16 v16, v7

    goto :goto_11

    :cond_1c
    move-object v15, v2

    move/from16 v16, v7

    move/from16 v17, v9

    move-object v9, v3

    :goto_11
    invoke-interface {v12}, LEt0;->B()V

    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_1d

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.uicore.elements.SectionFieldElementUI (SectionFieldElementUI.kt:9)"

    invoke-static {v0, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_1d
    invoke-interface/range {p1 .. p1}, Lcom/stripe/android/uicore/elements/SectionFieldElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-interface {v9, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_20

    invoke-interface/range {p1 .. p1}, Lcom/stripe/android/uicore/elements/SectionFieldElement;->sectionFieldErrorController()Lcom/stripe/android/uicore/elements/SectionFieldErrorController;

    move-result-object v0

    instance-of v2, v0, Lcom/stripe/android/uicore/elements/SectionFieldComposable;

    if-eqz v2, :cond_1e

    check-cast v0, Lcom/stripe/android/uicore/elements/SectionFieldComposable;

    goto :goto_12

    :cond_1e
    const/4 v0, 0x0

    :goto_12
    if-nez v0, :cond_1f

    goto :goto_13

    :cond_1f
    and-int/lit8 v2, v1, 0xe

    or-int/lit16 v2, v2, 0x1000

    and-int/lit8 v3, v1, 0x70

    or-int/2addr v2, v3

    and-int/lit16 v3, v1, 0x380

    or-int/2addr v2, v3

    and-int v3, v1, v6

    or-int/2addr v2, v3

    and-int v3, v1, v5

    or-int/2addr v2, v3

    const/high16 v3, 0x380000

    and-int/2addr v1, v3

    or-int v18, v2, v1

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v15

    move-object v4, v9

    move-object/from16 v5, p4

    move/from16 v6, v16

    move/from16 v7, v17

    move-object v8, v12

    move-object/from16 v19, v9

    move/from16 v9, v18

    invoke-interface/range {v0 .. v9}, Lcom/stripe/android/uicore/elements/SectionFieldComposable;->ComposeUI-MxjM1cc(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;I)V

    goto :goto_14

    :cond_20
    :goto_13
    move-object/from16 v19, v9

    :goto_14
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_21

    invoke-static {}, LQt0;->Y()V

    :cond_21
    move-object v3, v15

    move/from16 v6, v16

    move/from16 v7, v17

    move-object/from16 v4, v19

    :goto_15
    invoke-interface {v12}, LEt0;->w()LWm5;

    move-result-object v12

    if-nez v12, :cond_22

    goto :goto_16

    :cond_22
    new-instance v15, Lcom/stripe/android/uicore/elements/SectionFieldElementUIKt$SectionFieldElementUI$1;

    move-object v0, v15

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v5, p4

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/uicore/elements/SectionFieldElementUIKt$SectionFieldElementUI$1;-><init>(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IIII)V

    invoke-interface {v12, v15}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_16
    return-void
.end method
