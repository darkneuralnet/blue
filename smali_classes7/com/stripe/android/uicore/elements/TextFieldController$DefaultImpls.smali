.class public final Lcom/stripe/android/uicore/elements/TextFieldController$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/TextFieldController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
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


# direct methods
.method public static ComposeUI-MxjM1cc(Lcom/stripe/android/uicore/elements/TextFieldController;ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;I)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/TextFieldController;",
            "Z",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            "LgV2;",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "II",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move-object/from16 v3, p2

    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v2, p9

    const-string v0, "field"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modifier"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hiddenIdentifiers"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x78e16ec9

    move-object/from16 v4, p8

    invoke-interface {v4, v0}, LEt0;->u(I)LEt0;

    move-result-object v13

    and-int/lit8 v4, v2, 0xe

    move/from16 v12, p1

    if-nez v4, :cond_1

    invoke-interface {v13, v12}, LEt0;->o(Z)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v5, v2, 0x70

    if-nez v5, :cond_3

    invoke-interface {v13, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    and-int/lit16 v5, v2, 0x380

    if-nez v5, :cond_5

    invoke-interface {v13, v14}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v4, v5

    :cond_5
    const v5, 0xe000

    and-int/2addr v5, v2

    if-nez v5, :cond_7

    invoke-interface {v13, v15}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x4000

    goto :goto_4

    :cond_6
    const/16 v5, 0x2000

    :goto_4
    or-int/2addr v4, v5

    :cond_7
    const/high16 v5, 0x70000

    and-int v6, v2, v5

    move/from16 v11, p6

    if-nez v6, :cond_9

    invoke-interface {v13, v11}, LEt0;->r(I)Z

    move-result v6

    if-eqz v6, :cond_8

    const/high16 v6, 0x20000

    goto :goto_5

    :cond_8
    const/high16 v6, 0x10000

    :goto_5
    or-int/2addr v4, v6

    :cond_9
    const/high16 v6, 0x380000

    and-int v7, v2, v6

    move/from16 v10, p7

    if-nez v7, :cond_b

    invoke-interface {v13, v10}, LEt0;->r(I)Z

    move-result v7

    if-eqz v7, :cond_a

    const/high16 v7, 0x100000

    goto :goto_6

    :cond_a
    const/high16 v7, 0x80000

    :goto_6
    or-int/2addr v4, v7

    :cond_b
    const/high16 v7, 0x1c00000

    and-int/2addr v7, v2

    move-object/from16 v9, p0

    if-nez v7, :cond_d

    invoke-interface {v13, v9}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    const/high16 v7, 0x800000

    goto :goto_7

    :cond_c
    const/high16 v7, 0x400000

    :goto_7
    or-int/2addr v4, v7

    :cond_d
    const v7, 0x16da2db

    and-int/2addr v7, v4

    const v8, 0x492092

    if-ne v7, v8, :cond_f

    invoke-interface {v13}, LEt0;->b()Z

    move-result v7

    if-nez v7, :cond_e

    goto :goto_8

    :cond_e
    invoke-interface {v13}, LEt0;->k()V

    move-object v0, v13

    goto :goto_a

    :cond_f
    :goto_8
    invoke-static {}, LQt0;->O()Z

    move-result v7

    if-eqz v7, :cond_10

    const/4 v7, -0x1

    const-string v8, "com.stripe.android.uicore.elements.TextFieldController.ComposeUI (TextFieldController.kt:52)"

    invoke-static {v0, v4, v7, v8}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_10
    invoke-interface/range {p2 .. p2}, Lcom/stripe/android/uicore/elements/SectionFieldElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    sget-object v0, LFY1;->b:LFY1$a;

    invoke-virtual {v0}, LFY1$a;->b()I

    move-result v0

    goto :goto_9

    :cond_11
    sget-object v0, LFY1;->b:LFY1$a;

    invoke-virtual {v0}, LFY1$a;->d()I

    move-result v0

    :goto_9
    shr-int/lit8 v7, v4, 0x15

    and-int/lit8 v7, v7, 0xe

    shl-int/lit8 v8, v4, 0x3

    and-int/lit8 v16, v8, 0x70

    or-int v7, v7, v16

    and-int/lit16 v8, v8, 0x1c00

    or-int/2addr v7, v8

    and-int/2addr v5, v4

    or-int/2addr v5, v7

    and-int/2addr v4, v6

    or-int v16, v5, v4

    const/16 v17, 0x10

    move-object/from16 v4, p0

    move/from16 v5, p1

    move v6, v0

    move-object/from16 v7, p3

    const/4 v0, 0x0

    move-object v8, v0

    move/from16 v9, p6

    move/from16 v10, p7

    move-object v11, v13

    move/from16 v12, v16

    move-object v0, v13

    move/from16 v13, v17

    invoke-static/range {v4 .. v13}, Lcom/stripe/android/uicore/elements/TextFieldUIKt;->TextField-ndPIYpw(Lcom/stripe/android/uicore/elements/TextFieldController;ZILgV2;Lkotlin/jvm/functions/Function1;IILEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v4

    if-eqz v4, :cond_12

    invoke-static {}, LQt0;->Y()V

    :cond_12
    :goto_a
    invoke-interface {v0}, LEt0;->w()LWm5;

    move-result-object v10

    if-nez v10, :cond_13

    goto :goto_b

    :cond_13
    new-instance v11, Lcom/stripe/android/uicore/elements/TextFieldController$ComposeUI$1;

    move-object v0, v11

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/uicore/elements/TextFieldController$ComposeUI$1;-><init>(Lcom/stripe/android/uicore/elements/TextFieldController;ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;III)V

    invoke-interface {v10, v11}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_b
    return-void
.end method

.method public static getEnabled(Lcom/stripe/android/uicore/elements/TextFieldController;)Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public static getPlaceHolder(Lcom/stripe/android/uicore/elements/TextFieldController;)LEu1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/TextFieldController;",
            ")",
            "LEu1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 p0, 0x0

    invoke-static {p0}, LVu1;->G(Ljava/lang/Object;)LEu1;

    move-result-object p0

    return-object p0
.end method
