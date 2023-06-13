.class final Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/SectionElementUIKt;->SectionElementUI-rgidl0k(ZLcom/stripe/android/uicore/elements/SectionElement;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
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
        "SMAP\nSectionElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SectionElementUI.kt\ncom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,88:1\n1864#2,2:89\n1866#2:93\n174#3:91\n174#3:92\n*S KotlinDebug\n*F\n+ 1 SectionElementUI.kt\ncom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$2\n*L\n65#1:89,2\n65#1:93\n77#1:91\n79#1:92\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $elementsInsideCard:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $enabled:Z

.field final synthetic $hiddenIdentifiers:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $lastTextFieldIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field final synthetic $nextFocusDirection:I

.field final synthetic $previousFocusDirection:I


# direct methods
.method public constructor <init>(Ljava/util/List;ZLjava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            ">;Z",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "III)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$2;->$elementsInsideCard:Ljava/util/List;

    iput-boolean p2, p0, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$2;->$enabled:Z

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$2;->$hiddenIdentifiers:Ljava/util/Set;

    iput-object p4, p0, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$2;->$lastTextFieldIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iput p5, p0, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$2;->$nextFocusDirection:I

    iput p6, p0, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$2;->$previousFocusDirection:I

    iput p7, p0, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$2;->$$dirty:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$2;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v11, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0xb

    const/4 v12, 0x2

    if-ne v2, v12, :cond_1

    invoke-interface/range {p1 .. p1}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LEt0;->k()V

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.uicore.elements.SectionElementUI.<anonymous> (SectionElementUI.kt:63)"

    const v4, 0x1efea10a

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object v13, v0, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$2;->$elementsInsideCard:Ljava/util/List;

    move-object v1, v13

    check-cast v1, Ljava/lang/Iterable;

    iget-boolean v14, v0, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$2;->$enabled:Z

    iget-object v15, v0, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$2;->$hiddenIdentifiers:Ljava/util/Set;

    iget-object v10, v0, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$2;->$lastTextFieldIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iget v9, v0, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$2;->$nextFocusDirection:I

    iget v8, v0, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$2;->$previousFocusDirection:I

    iget v7, v0, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$2;->$$dirty:I

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    const/4 v1, 0x0

    move v6, v1

    :goto_1
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v17, v6, 0x1

    if-gez v6, :cond_3

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_3
    move-object v2, v1

    check-cast v2, Lcom/stripe/android/uicore/elements/SectionFieldElement;

    const/4 v3, 0x0

    and-int/lit8 v1, v7, 0xe

    or-int/lit16 v1, v1, 0x1000

    shl-int/lit8 v4, v7, 0x3

    const v5, 0xe000

    and-int/2addr v5, v4

    or-int/2addr v1, v5

    const/high16 v5, 0x70000

    and-int/2addr v5, v4

    or-int/2addr v1, v5

    const/high16 v5, 0x380000

    and-int/2addr v4, v5

    or-int v18, v1, v4

    const/16 v19, 0x4

    move v1, v14

    move-object v4, v15

    move-object v5, v10

    move v12, v6

    move v6, v9

    move/from16 v20, v7

    move v7, v8

    move/from16 v21, v8

    move-object/from16 v8, p1

    move/from16 v22, v9

    move/from16 v9, v18

    move-object/from16 v18, v10

    move/from16 v10, v19

    invoke-static/range {v1 .. v10}, Lcom/stripe/android/uicore/elements/SectionFieldElementUIKt;->SectionFieldElementUI-0uKR9Ig(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;II)V

    invoke-static {v13}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v1

    if-eq v12, v1, :cond_4

    sget-object v1, LTM2;->a:LTM2;

    sget v2, LTM2;->b:I

    invoke-static {v1, v11, v2}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/uicore/StripeColors;->getComponentDivider-0d7_KjU()J

    move-result-wide v3

    invoke-static {v1, v11, v2}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeShapes(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeShapes;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/uicore/StripeShapes;->getBorderStrokeWidth()F

    move-result v5

    invoke-static {v5}, Lk61;->g(F)F

    move-result v5

    sget-object v6, LgV2;->b0:LgV2$a;

    invoke-static {v1, v11, v2}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeShapes(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeShapes;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeShapes;->getBorderStrokeWidth()F

    move-result v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v1

    const/4 v2, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x2

    invoke-static {v6, v1, v2, v9, v7}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x8

    move-wide v2, v3

    move v4, v5

    move v5, v6

    move-object/from16 v6, p1

    invoke-static/range {v1 .. v8}, LL51;->a(LgV2;JFFLEt0;II)V

    goto :goto_2

    :cond_4
    const/4 v9, 0x2

    :goto_2
    move v12, v9

    move/from16 v6, v17

    move-object/from16 v10, v18

    move/from16 v7, v20

    move/from16 v8, v21

    move/from16 v9, v22

    goto/16 :goto_1

    :cond_5
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    :goto_3
    return-void
.end method
