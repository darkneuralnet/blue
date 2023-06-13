.class public final Lcom/stripe/android/uicore/elements/SameAsShippingController;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/uicore/elements/InputController;
.implements Lcom/stripe/android/uicore/elements/SectionFieldComposable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u00102\u001a\u00020\u0003\u00a2\u0006\u0004\u00083\u00104J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016JU\u0010\u0018\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0017\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R \u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00030\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00198\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u001c\u001a\u0004\u0008\"\u0010\u001eR \u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00198\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u001c\u001a\u0004\u0008$\u0010\u001eR\"\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00198\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008%\u0010\u001c\u001a\u0004\u0008&\u0010\u001eR\"\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\'0\u00198\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008(\u0010\u001c\u001a\u0004\u0008)\u0010\u001eR\u001a\u0010*\u001a\u00020\u00038\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008*\u0010+\u001a\u0004\u0008,\u0010-R \u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00198\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008.\u0010\u001c\u001a\u0004\u0008.\u0010\u001eR \u00100\u001a\u0008\u0012\u0004\u0012\u00020/0\u00198\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00080\u0010\u001c\u001a\u0004\u00081\u0010\u001e\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u00065"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/SameAsShippingController;",
        "Lcom/stripe/android/uicore/elements/InputController;",
        "Lcom/stripe/android/uicore/elements/SectionFieldComposable;",
        "",
        "value",
        "",
        "onValueChange",
        "",
        "rawValue",
        "onRawValueChange",
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
        "ComposeUI-MxjM1cc",
        "(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;I)V",
        "ComposeUI",
        "LEu1;",
        "",
        "label",
        "LEu1;",
        "getLabel",
        "()LEu1;",
        "LGX2;",
        "_value",
        "LGX2;",
        "getValue",
        "fieldValue",
        "getFieldValue",
        "rawFieldValue",
        "getRawFieldValue",
        "Lcom/stripe/android/uicore/elements/FieldError;",
        "error",
        "getError",
        "showOptionalLabel",
        "Z",
        "getShowOptionalLabel",
        "()Z",
        "isComplete",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "formFieldValue",
        "getFormFieldValue",
        "initialValue",
        "<init>",
        "(Z)V",
        "stripe-ui-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSameAsShippingController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SameAsShippingController.kt\ncom/stripe/android/uicore/elements/SameAsShippingController\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,54:1\n47#2:55\n49#2:59\n47#2:60\n49#2:64\n50#3:56\n55#3:58\n50#3:61\n55#3:63\n106#4:57\n106#4:62\n*S KotlinDebug\n*F\n+ 1 SameAsShippingController.kt\ncom/stripe/android/uicore/elements/SameAsShippingController\n*L\n22#1:55\n22#1:59\n29#1:60\n29#1:64\n22#1:56\n22#1:58\n29#1:61\n29#1:63\n22#1:57\n29#1:62\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final _value:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final error:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Lcom/stripe/android/uicore/elements/FieldError;",
            ">;"
        }
    .end annotation
.end field

.field private final fieldValue:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final formFieldValue:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;"
        }
    .end annotation
.end field

.field private final isComplete:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final label:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final rawFieldValue:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final showOptionalLabel:Z

.field private final value:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Lcom/stripe/android/uicore/R$string;->stripe_paymentsheet_address_element_same_as_shipping:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController;->label:LEu1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController;->_value:LGX2;

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController;->value:LEu1;

    new-instance v0, Lcom/stripe/android/uicore/elements/SameAsShippingController$special$$inlined$map$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/uicore/elements/SameAsShippingController$special$$inlined$map$1;-><init>(LEu1;)V

    iput-object v0, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController;->fieldValue:LEu1;

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SameAsShippingController;->getFieldValue()LEu1;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController;->rawFieldValue:LEu1;

    const/4 p1, 0x0

    invoke-static {p1}, LVu1;->G(Ljava/lang/Object;)LEu1;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController;->error:LEu1;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1}, LVu1;->G(Ljava/lang/Object;)LEu1;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController;->isComplete:LEu1;

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SameAsShippingController;->getRawFieldValue()LEu1;

    move-result-object p1

    new-instance v0, Lcom/stripe/android/uicore/elements/SameAsShippingController$special$$inlined$map$2;

    invoke-direct {v0, p1}, Lcom/stripe/android/uicore/elements/SameAsShippingController$special$$inlined$map$2;-><init>(LEu1;)V

    iput-object v0, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController;->formFieldValue:LEu1;

    return-void
.end method


# virtual methods
.method public ComposeUI-MxjM1cc(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;I)V
    .locals 13
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
            "I)V"
        }
    .end annotation

    const-string v0, "field"

    move-object v4, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modifier"

    move-object/from16 v5, p3

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hiddenIdentifiers"

    move-object/from16 v6, p4

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x4c947c87    # 7.7849656E7f

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.uicore.elements.SameAsShippingController.ComposeUI (SameAsShippingController.kt:41)"

    move/from16 v10, p9

    invoke-static {v0, v10, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    goto :goto_0

    :cond_0
    move/from16 v10, p9

    :goto_0
    const/16 v0, 0x8

    move-object v11, p0

    invoke-static {p0, v1, v0}, Lcom/stripe/android/uicore/elements/SameAsShippingElementUIKt;->SameAsShippingElementUI(Lcom/stripe/android/uicore/elements/SameAsShippingController;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v12, Lcom/stripe/android/uicore/elements/SameAsShippingController$ComposeUI$1;

    move-object v1, v12

    move-object v2, p0

    move v3, p1

    move-object v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/stripe/android/uicore/elements/SameAsShippingController$ComposeUI$1;-><init>(Lcom/stripe/android/uicore/elements/SameAsShippingController;ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;III)V

    invoke-interface {v0, v12}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1
    return-void
.end method

.method public getError()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Lcom/stripe/android/uicore/elements/FieldError;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController;->error:LEu1;

    return-object v0
.end method

.method public getFieldValue()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController;->fieldValue:LEu1;

    return-object v0
.end method

.method public getFormFieldValue()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController;->formFieldValue:LEu1;

    return-object v0
.end method

.method public getLabel()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController;->label:LEu1;

    return-object v0
.end method

.method public getRawFieldValue()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController;->rawFieldValue:LEu1;

    return-object v0
.end method

.method public getShowOptionalLabel()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController;->showOptionalLabel:Z

    return v0
.end method

.method public final getValue()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController;->value:LEu1;

    return-object v0
.end method

.method public isComplete()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController;->isComplete:LEu1;

    return-object v0
.end method

.method public onRawValueChange(Ljava/lang/String;)V
    .locals 1

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/text/StringsKt;->toBooleanStrictOrNull(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/uicore/elements/SameAsShippingController;->onValueChange(Z)V

    return-void
.end method

.method public final onValueChange(Z)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController;->_value:LGX2;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method
