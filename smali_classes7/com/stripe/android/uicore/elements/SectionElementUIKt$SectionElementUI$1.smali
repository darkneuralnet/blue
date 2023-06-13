.class final Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$1;
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
        "SMAP\nSectionElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SectionElementUI.kt\ncom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n1855#2,2:89\n*S KotlinDebug\n*F\n+ 1 SectionElementUI.kt\ncom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$1\n*L\n53#1:89,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $elementsOutsideCard:Ljava/util/List;
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

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$1;->$elementsOutsideCard:Ljava/util/List;

    iput-boolean p2, p0, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$1;->$enabled:Z

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$1;->$hiddenIdentifiers:Ljava/util/Set;

    iput-object p4, p0, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$1;->$lastTextFieldIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iput p5, p0, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$1;->$nextFocusDirection:I

    iput p6, p0, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$1;->$previousFocusDirection:I

    iput p7, p0, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$1;->$$dirty:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0xb

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface/range {p1 .. p1}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LEt0;->k()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.uicore.elements.SectionElementUI.<anonymous> (SectionElementUI.kt:51)"

    const v4, -0x599d8615

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$1;->$elementsOutsideCard:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    iget-boolean v12, v0, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$1;->$enabled:Z

    iget-object v13, v0, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$1;->$hiddenIdentifiers:Ljava/util/Set;

    iget-object v14, v0, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$1;->$lastTextFieldIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iget v15, v0, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$1;->$nextFocusDirection:I

    iget v11, v0, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$1;->$previousFocusDirection:I

    iget v10, v0, Lcom/stripe/android/uicore/elements/SectionElementUIKt$SectionElementUI$1;->$$dirty:I

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/uicore/elements/SectionFieldElement;

    const/4 v4, 0x0

    and-int/lit8 v2, v10, 0xe

    or-int/lit16 v2, v2, 0x1000

    shl-int/lit8 v5, v10, 0x3

    const v6, 0xe000

    and-int/2addr v6, v5

    or-int/2addr v2, v6

    const/high16 v6, 0x70000

    and-int/2addr v6, v5

    or-int/2addr v2, v6

    const/high16 v6, 0x380000

    and-int/2addr v5, v6

    or-int v16, v2, v5

    const/16 v17, 0x4

    move v2, v12

    move-object v5, v13

    move-object v6, v14

    move v7, v15

    move v8, v11

    move-object/from16 v9, p1

    move/from16 v18, v10

    move/from16 v10, v16

    move/from16 v16, v11

    move/from16 v11, v17

    invoke-static/range {v2 .. v11}, Lcom/stripe/android/uicore/elements/SectionFieldElementUIKt;->SectionFieldElementUI-0uKR9Ig(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;II)V

    move/from16 v11, v16

    move/from16 v10, v18

    goto :goto_1

    :cond_3
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    :goto_2
    return-void
.end method
