.class public final Lcom/stripe/android/uicore/elements/SectionElementUIKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u001aQ\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u000f"
    }
    d2 = {
        "",
        "enabled",
        "Lcom/stripe/android/uicore/elements/SectionElement;",
        "element",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "hiddenIdentifiers",
        "lastTextFieldIdentifier",
        "Landroidx/compose/ui/focus/c;",
        "nextFocusDirection",
        "previousFocusDirection",
        "",
        "SectionElementUI-rgidl0k",
        "(ZLcom/stripe/android/uicore/elements/SectionElement;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;II)V",
        "SectionElementUI",
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
        "SMAP\nSectionElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SectionElementUI.kt\ncom/stripe/android/uicore/elements/SectionElementUIKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,88:1\n766#2:89\n857#2,2:90\n766#2:92\n857#2,2:93\n76#3:95\n*S KotlinDebug\n*F\n+ 1 SectionElementUI.kt\ncom/stripe/android/uicore/elements/SectionElementUIKt\n*L\n42#1:89\n42#1:90,2\n45#1:92\n45#1:93,2\n32#1:95\n*E\n"
    }
.end annotation


# direct methods
.method public static final SectionElementUI-rgidl0k(ZLcom/stripe/android/uicore/elements/SectionElement;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/stripe/android/uicore/elements/SectionElement;",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "II",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v8, p2

    const-string v0, "element"

    move-object/from16 v9, p1

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hiddenIdentifiers"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x3803a4e8

    move-object/from16 v1, p6

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v10

    and-int/lit8 v1, p8, 0x10

    if-eqz v1, :cond_0

    sget-object v1, Landroidx/compose/ui/focus/c;->b:Landroidx/compose/ui/focus/c$a;

    invoke-virtual {v1}, Landroidx/compose/ui/focus/c$a;->a()I

    move-result v1

    const v2, -0xe001

    and-int v2, p7, v2

    move v11, v1

    goto :goto_0

    :cond_0
    move/from16 v11, p4

    move/from16 v2, p7

    :goto_0
    and-int/lit8 v1, p8, 0x20

    if-eqz v1, :cond_1

    sget-object v1, Landroidx/compose/ui/focus/c;->b:Landroidx/compose/ui/focus/c$a;

    invoke-virtual {v1}, Landroidx/compose/ui/focus/c$a;->h()I

    move-result v1

    const v3, -0x70001

    and-int/2addr v2, v3

    move v12, v1

    goto :goto_1

    :cond_1
    move/from16 v12, p5

    :goto_1
    move v13, v2

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.uicore.elements.SectionElementUI (SectionElementUI.kt:20)"

    invoke-static {v0, v13, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/uicore/elements/SectionElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/uicore/elements/SectionElement;->getController()Lcom/stripe/android/uicore/elements/SectionController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/SectionController;->getError()LEu1;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v5, 0x38

    const/4 v6, 0x2

    move-object v4, v10

    invoke-static/range {v1 .. v6}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v1

    invoke-static {v1}, Lcom/stripe/android/uicore/elements/SectionElementUIKt;->SectionElementUI_rgidl0k$lambda$0(LsP5;)Lcom/stripe/android/uicore/elements/FieldError;

    move-result-object v1

    const v2, 0x2048aae0

    invoke-interface {v10, v2}, LEt0;->F(I)V

    const/4 v2, 0x0

    if-nez v1, :cond_4

    :cond_3
    :goto_2
    move-object v14, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/FieldError;->getFormatArgs()[Ljava/lang/Object;

    move-result-object v3

    const v4, 0x2048ab01

    invoke-interface {v10, v4}, LEt0;->F(I)V

    if-nez v3, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/FieldError;->getErrorMessage()I

    move-result v2

    array-length v4, v3

    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    const/16 v4, 0x40

    invoke-static {v2, v3, v10, v4}, LfS5;->d(I[Ljava/lang/Object;LEt0;I)Ljava/lang/String;

    move-result-object v2

    :goto_3
    invoke-interface {v10}, LEt0;->Q()V

    if-nez v2, :cond_3

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/FieldError;->getErrorMessage()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v1, v10, v2}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :goto_4
    invoke-interface {v10}, LEt0;->Q()V

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/uicore/elements/SectionElement;->getFields()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v7, 0x1

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/uicore/elements/SectionFieldElement;

    invoke-interface {v3}, Lcom/stripe/android/uicore/elements/SectionFieldElement;->getShouldRenderOutsideCard()Z

    move-result v3

    xor-int/2addr v3, v7

    if-eqz v3, :cond_6

    invoke-interface {v15, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_7
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/uicore/elements/SectionElement;->getFields()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_8
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/stripe/android/uicore/elements/SectionFieldElement;

    invoke-interface {v4}, Lcom/stripe/android/uicore/elements/SectionFieldElement;->getShouldRenderOutsideCard()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_9
    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/SectionController;->getLabel()Ljava/lang/Integer;

    move-result-object v16

    new-instance v6, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$1;

    move-object v0, v6

    move-object v1, v2

    move/from16 v2, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move v5, v11

    move-object v8, v6

    move v6, v12

    move v9, v7

    move v7, v13

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$1;-><init>(Ljava/util/List;ZLjava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;III)V

    const v0, -0x599d8615

    invoke-static {v10, v0, v9, v8}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v8

    new-instance v7, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$2;

    move-object v0, v7

    move-object v1, v15

    move-object v15, v7

    move v7, v13

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$2;-><init>(Ljava/util/List;ZLjava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;III)V

    const v0, 0x1efea10a

    invoke-static {v10, v0, v9, v15}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v4

    const/16 v6, 0xd80

    const/4 v7, 0x0

    move-object/from16 v1, v16

    move-object v2, v14

    move-object v3, v8

    move-object v5, v10

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/uicore/elements/SectionUIKt;->Section(Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LEt0;II)V

    :cond_a
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LQt0;->Y()V

    :cond_b
    invoke-interface {v10}, LEt0;->w()LWm5;

    move-result-object v9

    if-nez v9, :cond_c

    goto :goto_7

    :cond_c
    new-instance v10, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$3;

    move-object v0, v10

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move v5, v11

    move v6, v12

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$3;-><init>(ZLcom/stripe/android/uicore/elements/SectionElement;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IIII)V

    invoke-interface {v9, v10}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_7
    return-void
.end method

.method private static final SectionElementUI_rgidl0k$lambda$0(LsP5;)Lcom/stripe/android/uicore/elements/FieldError;
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
