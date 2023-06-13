.class public final Lcom/stripe/android/uicore/elements/DropdownFieldController;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/uicore/elements/InputController;
.implements Lcom/stripe/android/uicore/elements/SectionFieldErrorController;
.implements Lcom/stripe/android/uicore/elements/SectionFieldComposable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\u0008\u0002\u0010D\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008E\u0010FJ\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u000b\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0006H\u0016JU\u0010\u001b\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0017\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u001d\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00060\u001f8\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R\u0017\u0010$\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'R\u001a\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00040(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u001d\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u00040+8\u0006\u00a2\u0006\u000c\n\u0004\u0008,\u0010-\u001a\u0004\u0008.\u0010/R \u00101\u001a\u0008\u0012\u0004\u0012\u00020\u0004008\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00081\u00102\u001a\u0004\u00083\u00104R \u00105\u001a\u0008\u0012\u0004\u0012\u00020\u0006008\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00085\u00102\u001a\u0004\u00086\u00104R\"\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0006008\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00087\u00102\u001a\u0004\u00088\u00104R\"\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u000109008\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008:\u00102\u001a\u0004\u0008;\u00104R\u001a\u0010<\u001a\u00020\u000c8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008<\u0010%\u001a\u0004\u0008=\u0010\'R \u0010>\u001a\u0008\u0012\u0004\u0012\u00020\u000c008\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008>\u00102\u001a\u0004\u0008>\u00104R \u0010@\u001a\u0008\u0012\u0004\u0012\u00020?008\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008@\u00102\u001a\u0004\u0008A\u00104R\u0017\u0010B\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008B\u0010%\u001a\u0004\u0008C\u0010\'\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006G"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/DropdownFieldController;",
        "Lcom/stripe/android/uicore/elements/InputController;",
        "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;",
        "Lcom/stripe/android/uicore/elements/SectionFieldComposable;",
        "",
        "index",
        "",
        "getSelectedItemLabel",
        "",
        "onValueChange",
        "rawValue",
        "onRawValueChange",
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
        "ComposeUI-MxjM1cc",
        "(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;I)V",
        "ComposeUI",
        "Lcom/stripe/android/uicore/elements/DropdownConfig;",
        "config",
        "Lcom/stripe/android/uicore/elements/DropdownConfig;",
        "",
        "displayItems",
        "Ljava/util/List;",
        "getDisplayItems",
        "()Ljava/util/List;",
        "disableDropdownWithSingleElement",
        "Z",
        "getDisableDropdownWithSingleElement",
        "()Z",
        "LGX2;",
        "_selectedIndex",
        "LGX2;",
        "LtP5;",
        "selectedIndex",
        "LtP5;",
        "getSelectedIndex",
        "()LtP5;",
        "LEu1;",
        "label",
        "LEu1;",
        "getLabel",
        "()LEu1;",
        "fieldValue",
        "getFieldValue",
        "rawFieldValue",
        "getRawFieldValue",
        "Lcom/stripe/android/uicore/elements/FieldError;",
        "error",
        "getError",
        "showOptionalLabel",
        "getShowOptionalLabel",
        "isComplete",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "formFieldValue",
        "getFormFieldValue",
        "tinyMode",
        "getTinyMode",
        "initialValue",
        "<init>",
        "(Lcom/stripe/android/uicore/elements/DropdownConfig;Ljava/lang/String;)V",
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
        "SMAP\nDropdownFieldController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DropdownFieldController.kt\ncom/stripe/android/uicore/elements/DropdownFieldController\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n47#2:82\n49#2:86\n47#2:87\n49#2:91\n50#3:83\n55#3:85\n50#3:88\n55#3:90\n106#4:84\n106#4:89\n1#5:92\n*S KotlinDebug\n*F\n+ 1 DropdownFieldController.kt\ncom/stripe/android/uicore/elements/DropdownFieldController\n*L\n29#1:82\n29#1:86\n30#1:87\n30#1:91\n29#1:83\n29#1:85\n30#1:88\n30#1:90\n29#1:84\n30#1:89\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final _selectedIndex:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final config:Lcom/stripe/android/uicore/elements/DropdownConfig;

.field private final disableDropdownWithSingleElement:Z

.field private final displayItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
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

.field private final selectedIndex:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final showOptionalLabel:Z

.field private final tinyMode:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/DropdownConfig;Ljava/lang/String;)V
    .locals 4

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->config:Lcom/stripe/android/uicore/elements/DropdownConfig;

    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/DropdownConfig;->getDisplayItems()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->displayItems:Ljava/util/List;

    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/DropdownConfig;->getDisableDropdownWithSingleElement()Z

    move-result v0

    iput-boolean v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->disableDropdownWithSingleElement:Z

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->_selectedIndex:LGX2;

    iput-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->selectedIndex:LtP5;

    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/DropdownConfig;->getLabel()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v1

    iput-object v1, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->label:LEu1;

    new-instance v1, Lcom/stripe/android/uicore/elements/DropdownFieldController$special$$inlined$map$1;

    invoke-direct {v1, v0, p0}, Lcom/stripe/android/uicore/elements/DropdownFieldController$special$$inlined$map$1;-><init>(LEu1;Lcom/stripe/android/uicore/elements/DropdownFieldController;)V

    iput-object v1, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->fieldValue:LEu1;

    new-instance v1, Lcom/stripe/android/uicore/elements/DropdownFieldController$special$$inlined$map$2;

    invoke-direct {v1, v0, p0}, Lcom/stripe/android/uicore/elements/DropdownFieldController$special$$inlined$map$2;-><init>(LEu1;Lcom/stripe/android/uicore/elements/DropdownFieldController;)V

    iput-object v1, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->rawFieldValue:LEu1;

    const/4 v0, 0x0

    invoke-static {v0}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v1

    iput-object v1, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->error:LEu1;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v1

    iput-object v1, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->isComplete:LEu1;

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->isComplete()LEu1;

    move-result-object v1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->getRawFieldValue()LEu1;

    move-result-object v2

    new-instance v3, Lcom/stripe/android/uicore/elements/DropdownFieldController$formFieldValue$1;

    invoke-direct {v3, v0}, Lcom/stripe/android/uicore/elements/DropdownFieldController$formFieldValue$1;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {v1, v2, v3}, LVu1;->n(LEu1;LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->formFieldValue:LEu1;

    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/DropdownConfig;->getTinyMode()Z

    move-result p1

    iput-boolean p1, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->tinyMode:Z

    if-eqz p2, :cond_0

    invoke-virtual {p0, p2}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->onRawValueChange(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/uicore/elements/DropdownConfig;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/uicore/elements/DropdownFieldController;-><init>(Lcom/stripe/android/uicore/elements/DropdownConfig;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$getConfig$p(Lcom/stripe/android/uicore/elements/DropdownFieldController;)Lcom/stripe/android/uicore/elements/DropdownConfig;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->config:Lcom/stripe/android/uicore/elements/DropdownConfig;

    return-object p0
.end method


# virtual methods
.method public ComposeUI-MxjM1cc(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;I)V
    .locals 16
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

    move/from16 v9, p9

    const-string v0, "field"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modifier"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hiddenIdentifiers"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0xb21aa01

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v6, "com.stripe.android.uicore.elements.DropdownFieldController.ComposeUI (DropdownFieldController.kt:65)"

    invoke-static {v0, v9, v2, v6}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    const/4 v12, 0x0

    shl-int/lit8 v0, v9, 0x3

    and-int/lit8 v0, v0, 0x70

    or-int/lit8 v14, v0, 0x8

    const/4 v15, 0x4

    move-object/from16 v10, p0

    move/from16 v11, p1

    move-object v13, v1

    invoke-static/range {v10 .. v15}, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt;->DropDown(Lcom/stripe/android/uicore/elements/DropdownFieldController;ZLgV2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v10

    if-nez v10, :cond_2

    goto :goto_0

    :cond_2
    new-instance v11, Lcom/stripe/android/uicore/elements/DropdownFieldController$ComposeUI$1;

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

    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/uicore/elements/DropdownFieldController$ComposeUI$1;-><init>(Lcom/stripe/android/uicore/elements/DropdownFieldController;ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;III)V

    invoke-interface {v10, v11}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method

.method public final getDisableDropdownWithSingleElement()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->disableDropdownWithSingleElement:Z

    return v0
.end method

.method public final getDisplayItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->displayItems:Ljava/util/List;

    return-object v0
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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->error:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->fieldValue:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->formFieldValue:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->label:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->rawFieldValue:LEu1;

    return-object v0
.end method

.method public final getSelectedIndex()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->selectedIndex:LtP5;

    return-object v0
.end method

.method public final getSelectedItemLabel(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->config:Lcom/stripe/android/uicore/elements/DropdownConfig;

    invoke-interface {v0, p1}, Lcom/stripe/android/uicore/elements/DropdownConfig;->getSelectedItemLabel(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getShowOptionalLabel()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->showOptionalLabel:Z

    return v0
.end method

.method public final getTinyMode()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->tinyMode:Z

    return v0
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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->isComplete:LEu1;

    return-object v0
.end method

.method public onRawValueChange(Ljava/lang/String;)V
    .locals 4

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->_selectedIndex:LGX2;

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->displayItems:Ljava/util/List;

    iget-object v2, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->config:Lcom/stripe/android/uicore/elements/DropdownConfig;

    invoke-interface {v2, p1}, Lcom/stripe/android/uicore/elements/DropdownConfig;->convertFromRaw(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v1

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    :cond_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final onValueChange(I)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/DropdownFieldController;->_selectedIndex:LGX2;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method
