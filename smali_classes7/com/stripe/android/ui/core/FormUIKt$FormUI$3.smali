.class final Lcom/stripe/android/ui/core/FormUIKt$FormUI$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/ui/core/FormUIKt;->FormUI(Ljava/util/Set;ZLjava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;LgV2;LEt0;II)V
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


# instance fields
.field final synthetic $$changed:I

.field final synthetic $$default:I

.field final synthetic $elements:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/FormElement;",
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

.field final synthetic $modifier:LgV2;


# direct methods
.method public constructor <init>(Ljava/util/Set;ZLjava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;LgV2;II)V
    .locals 0
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
            "II)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/ui/core/FormUIKt$FormUI$3;->$hiddenIdentifiers:Ljava/util/Set;

    iput-boolean p2, p0, Lcom/stripe/android/ui/core/FormUIKt$FormUI$3;->$enabled:Z

    iput-object p3, p0, Lcom/stripe/android/ui/core/FormUIKt$FormUI$3;->$elements:Ljava/util/List;

    iput-object p4, p0, Lcom/stripe/android/ui/core/FormUIKt$FormUI$3;->$lastTextFieldIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iput-object p5, p0, Lcom/stripe/android/ui/core/FormUIKt$FormUI$3;->$modifier:LgV2;

    iput p6, p0, Lcom/stripe/android/ui/core/FormUIKt$FormUI$3;->$$changed:I

    iput p7, p0, Lcom/stripe/android/ui/core/FormUIKt$FormUI$3;->$$default:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/ui/core/FormUIKt$FormUI$3;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 8

    iget-object v0, p0, Lcom/stripe/android/ui/core/FormUIKt$FormUI$3;->$hiddenIdentifiers:Ljava/util/Set;

    iget-boolean v1, p0, Lcom/stripe/android/ui/core/FormUIKt$FormUI$3;->$enabled:Z

    iget-object v2, p0, Lcom/stripe/android/ui/core/FormUIKt$FormUI$3;->$elements:Ljava/util/List;

    iget-object v3, p0, Lcom/stripe/android/ui/core/FormUIKt$FormUI$3;->$lastTextFieldIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iget-object v4, p0, Lcom/stripe/android/ui/core/FormUIKt$FormUI$3;->$modifier:LgV2;

    iget p2, p0, Lcom/stripe/android/ui/core/FormUIKt$FormUI$3;->$$changed:I

    or-int/lit8 v6, p2, 0x1

    iget v7, p0, Lcom/stripe/android/ui/core/FormUIKt$FormUI$3;->$$default:I

    move-object v5, p1

    invoke-static/range {v0 .. v7}, Lcom/stripe/android/ui/core/FormUIKt;->FormUI(Ljava/util/Set;ZLjava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;LgV2;LEt0;II)V

    return-void
.end method
