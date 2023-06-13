.class public final Lcom/stripe/android/uicore/elements/AddressTextFieldController;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/uicore/elements/TextFieldController;
.implements Lcom/stripe/android/uicore/elements/InputController;
.implements Lcom/stripe/android/uicore/elements/SectionFieldErrorController;
.implements Lcom/stripe/android/uicore/elements/SectionFieldComposable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B-\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0010\u0008\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\"\u0012\n\u0008\u0002\u0010c\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008d\u0010eJ\u0012\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005H\u0016JU\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0017\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0006\u0010\u001e\u001a\u00020\u000bR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u001c\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\"\u0010\'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0%8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*R#\u0010,\u001a\u00020+8\u0016X\u0096\u0004\u00f8\u0001\u0001\u00f8\u0001\u0000\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008,\u0010-\u001a\u0004\u0008.\u0010/R#\u00101\u001a\u0002008\u0016X\u0096\u0004\u00f8\u0001\u0001\u00f8\u0001\u0000\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u00081\u0010-\u001a\u0004\u00082\u0010/R\u001a\u00104\u001a\u0002038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00084\u00105\u001a\u0004\u00086\u00107R\u001a\u00108\u001a\u00020\t8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u00088\u00109\u001a\u0004\u0008:\u0010;R\"\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=0<8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008>\u0010?\u001a\u0004\u0008@\u0010AR\u001a\u0010B\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008B\u0010C\u001a\u0004\u0008D\u0010ER\"\u0010G\u001a\u0004\u0018\u00010F8\u0016X\u0097\u0004\u00a2\u0006\u0012\n\u0004\u0008G\u0010H\u0012\u0004\u0008K\u0010L\u001a\u0004\u0008I\u0010JR\u001a\u0010M\u001a\u0008\u0012\u0004\u0012\u00020\u00050<8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008M\u0010?R \u0010N\u001a\u0008\u0012\u0004\u0012\u00020\u00050%8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008N\u0010(\u001a\u0004\u0008O\u0010*R \u0010P\u001a\u0008\u0012\u0004\u0012\u00020\u00050%8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008P\u0010(\u001a\u0004\u0008Q\u0010*R \u0010R\u001a\u0008\u0012\u0004\u0012\u00020\u00050%8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008R\u0010(\u001a\u0004\u0008S\u0010*R\u001a\u0010T\u001a\u0008\u0012\u0004\u0012\u00020\u00070<8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008T\u0010?R \u0010U\u001a\u0008\u0012\u0004\u0012\u00020\u00070%8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008U\u0010(\u001a\u0004\u0008V\u0010*R \u0010W\u001a\u0008\u0012\u0004\u0012\u00020\t0%8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008W\u0010(\u001a\u0004\u0008X\u0010*R\u001a\u0010Y\u001a\u0008\u0012\u0004\u0012\u00020\t0<8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Y\u0010?R \u0010Z\u001a\u0008\u0012\u0004\u0012\u00020\t0%8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008Z\u0010(\u001a\u0004\u0008[\u0010*R\"\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\\0%8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008]\u0010(\u001a\u0004\u0008^\u0010*R \u0010_\u001a\u0008\u0012\u0004\u0012\u00020\t0%8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008_\u0010(\u001a\u0004\u0008_\u0010*R \u0010a\u001a\u0008\u0012\u0004\u0012\u00020`0%8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008a\u0010(\u001a\u0004\u0008b\u0010*\u0082\u0002\u000f\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\n\u0002\u0008!\u00a8\u0006f"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/AddressTextFieldController;",
        "Lcom/stripe/android/uicore/elements/TextFieldController;",
        "Lcom/stripe/android/uicore/elements/InputController;",
        "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;",
        "Lcom/stripe/android/uicore/elements/SectionFieldComposable;",
        "",
        "displayFormatted",
        "Lcom/stripe/android/uicore/elements/TextFieldState;",
        "onValueChange",
        "",
        "newHasFocus",
        "",
        "onFocusChange",
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
        "launchAutocompleteScreen",
        "Lcom/stripe/android/uicore/elements/TextFieldConfig;",
        "config",
        "Lcom/stripe/android/uicore/elements/TextFieldConfig;",
        "Lkotlin/Function0;",
        "onNavigation",
        "Lkotlin/jvm/functions/Function0;",
        "LEu1;",
        "Lcom/stripe/android/uicore/elements/TextFieldIcon;",
        "trailingIcon",
        "LEu1;",
        "getTrailingIcon",
        "()LEu1;",
        "Lal2;",
        "capitalization",
        "I",
        "getCapitalization-IUNYP9k",
        "()I",
        "Lcl2;",
        "keyboardType",
        "getKeyboardType-PjHm6EE",
        "LEu6;",
        "visualTransformation",
        "LEu6;",
        "getVisualTransformation",
        "()LEu6;",
        "showOptionalLabel",
        "Z",
        "getShowOptionalLabel",
        "()Z",
        "LGX2;",
        "",
        "label",
        "LGX2;",
        "getLabel",
        "()LGX2;",
        "debugLabel",
        "Ljava/lang/String;",
        "getDebugLabel",
        "()Ljava/lang/String;",
        "LRu;",
        "autofillType",
        "LRu;",
        "getAutofillType",
        "()LRu;",
        "getAutofillType$annotations",
        "()V",
        "_fieldValue",
        "fieldValue",
        "getFieldValue",
        "rawFieldValue",
        "getRawFieldValue",
        "contentDescription",
        "getContentDescription",
        "_fieldState",
        "fieldState",
        "getFieldState",
        "loading",
        "getLoading",
        "_hasFocus",
        "visibleError",
        "getVisibleError",
        "Lcom/stripe/android/uicore/elements/FieldError;",
        "error",
        "getError",
        "isComplete",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "formFieldValue",
        "getFormFieldValue",
        "initialValue",
        "<init>",
        "(Lcom/stripe/android/uicore/elements/TextFieldConfig;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V",
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
        "SMAP\nAddressTextFieldController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressTextFieldController.kt\ncom/stripe/android/uicore/elements/AddressTextFieldController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,120:1\n1#2:121\n47#3:122\n49#3:126\n47#3:127\n49#3:131\n47#3:132\n49#3:136\n50#4:123\n55#4:125\n50#4:128\n55#4:130\n50#4:133\n55#4:135\n106#5:124\n106#5:129\n106#5:134\n*S KotlinDebug\n*F\n+ 1 AddressTextFieldController.kt\ncom/stripe/android/uicore/elements/AddressTextFieldController\n*L\n46#1:122\n46#1:126\n65#1:127\n65#1:131\n69#1:132\n69#1:136\n46#1:123\n46#1:125\n65#1:128\n65#1:130\n69#1:133\n69#1:135\n46#1:124\n65#1:129\n69#1:134\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final _fieldState:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Lcom/stripe/android/uicore/elements/TextFieldState;",
            ">;"
        }
    .end annotation
.end field

.field private final _fieldValue:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final _hasFocus:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final autofillType:LRu;

.field private final capitalization:I

.field private final config:Lcom/stripe/android/uicore/elements/TextFieldConfig;

.field private final contentDescription:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final debugLabel:Ljava/lang/String;

.field private final error:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Lcom/stripe/android/uicore/elements/FieldError;",
            ">;"
        }
    .end annotation
.end field

.field private final fieldState:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Lcom/stripe/android/uicore/elements/TextFieldState;",
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

.field private final keyboardType:I

.field private final label:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final loading:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final onNavigation:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
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

.field private final trailingIcon:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon;",
            ">;"
        }
    .end annotation
.end field

.field private final visibleError:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final visualTransformation:LEu6;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/TextFieldConfig;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->config:Lcom/stripe/android/uicore/elements/TextFieldConfig;

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->onNavigation:Lkotlin/jvm/functions/Function0;

    if-eqz p3, :cond_0

    invoke-virtual {p0, p3}, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->onRawValueChange(Ljava/lang/String;)V

    :cond_0
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getTrailingIcon()LtP5;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->trailingIcon:LEu1;

    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getCapitalization-IUNYP9k()I

    move-result p2

    iput p2, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->capitalization:I

    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getKeyboard-PjHm6EE()I

    move-result p2

    iput p2, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->keyboardType:I

    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getVisualTransformation()LEu6;

    move-result-object p2

    if-nez p2, :cond_1

    sget-object p2, LEu6;->a:LEu6$a;

    invoke-virtual {p2}, LEu6$a;->a()LEu6;

    move-result-object p2

    :cond_1
    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->visualTransformation:LEu6;

    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getLabel()Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p2}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->label:LGX2;

    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getDebugLabel()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->debugLabel:Ljava/lang/String;

    const-string p2, ""

    invoke-static {p2}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->_fieldValue:LGX2;

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->fieldValue:LEu1;

    new-instance p3, Lcom/stripe/android/uicore/elements/AddressTextFieldController$special$$inlined$map$1;

    invoke-direct {p3, p2, p0}, Lcom/stripe/android/uicore/elements/AddressTextFieldController$special$$inlined$map$1;-><init>(LEu1;Lcom/stripe/android/uicore/elements/AddressTextFieldController;)V

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->rawFieldValue:LEu1;

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->contentDescription:LEu1;

    sget-object p2, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;->INSTANCE:Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;

    invoke-static {p2}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->_fieldState:LGX2;

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->fieldState:LEu1;

    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getLoading()LtP5;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->loading:LEu1;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->_hasFocus:LGX2;

    new-instance p3, Lcom/stripe/android/uicore/elements/AddressTextFieldController$visibleError$1;

    const/4 v0, 0x0

    invoke-direct {p3, v0}, Lcom/stripe/android/uicore/elements/AddressTextFieldController$visibleError$1;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {p2, p1, p3}, LVu1;->n(LEu1;LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->visibleError:LEu1;

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->getVisibleError()LEu1;

    move-result-object p1

    new-instance p3, Lcom/stripe/android/uicore/elements/AddressTextFieldController$special$$inlined$map$2;

    invoke-direct {p3, p1, p0}, Lcom/stripe/android/uicore/elements/AddressTextFieldController$special$$inlined$map$2;-><init>(LEu1;Lcom/stripe/android/uicore/elements/AddressTextFieldController;)V

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->error:LEu1;

    new-instance p1, Lcom/stripe/android/uicore/elements/AddressTextFieldController$special$$inlined$map$3;

    invoke-direct {p1, p2, p0}, Lcom/stripe/android/uicore/elements/AddressTextFieldController$special$$inlined$map$3;-><init>(LEu1;Lcom/stripe/android/uicore/elements/AddressTextFieldController;)V

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->isComplete:LEu1;

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->isComplete()LEu1;

    move-result-object p1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->getRawFieldValue()LEu1;

    move-result-object p2

    new-instance p3, Lcom/stripe/android/uicore/elements/AddressTextFieldController$formFieldValue$1;

    invoke-direct {p3, v0}, Lcom/stripe/android/uicore/elements/AddressTextFieldController$formFieldValue$1;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {p1, p2, p3}, LVu1;->n(LEu1;LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->formFieldValue:LEu1;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/uicore/elements/AddressTextFieldController;-><init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$getConfig$p(Lcom/stripe/android/uicore/elements/AddressTextFieldController;)Lcom/stripe/android/uicore/elements/TextFieldConfig;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->config:Lcom/stripe/android/uicore/elements/TextFieldConfig;

    return-object p0
.end method

.method public static final synthetic access$get_fieldState$p(Lcom/stripe/android/uicore/elements/AddressTextFieldController;)LGX2;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->_fieldState:LGX2;

    return-object p0
.end method

.method public static synthetic getAutofillType$annotations()V
    .locals 0

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

    const v0, -0x7e87a0d9

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.uicore.elements.AddressTextFieldController.ComposeUI (AddressTextFieldController.kt:103)"

    move/from16 v10, p9

    invoke-static {v0, v10, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    goto :goto_0

    :cond_0
    move/from16 v10, p9

    :goto_0
    const/16 v0, 0x8

    const/4 v2, 0x2

    const/4 v3, 0x0

    move-object v11, p0

    invoke-static {p0, v3, v1, v0, v2}, Lcom/stripe/android/uicore/elements/AddressTextFieldUIKt;->AddressTextFieldUI(Lcom/stripe/android/uicore/elements/AddressTextFieldController;Lkotlin/jvm/functions/Function0;LEt0;II)V

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
    new-instance v12, Lcom/stripe/android/uicore/elements/AddressTextFieldController$ComposeUI$1;

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

    invoke-direct/range {v1 .. v10}, Lcom/stripe/android/uicore/elements/AddressTextFieldController$ComposeUI$1;-><init>(Lcom/stripe/android/uicore/elements/AddressTextFieldController;ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;III)V

    invoke-interface {v0, v12}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1
    return-void
.end method

.method public getAutofillType()LRu;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->autofillType:LRu;

    return-object v0
.end method

.method public getCapitalization-IUNYP9k()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->capitalization:I

    return v0
.end method

.method public getContentDescription()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->contentDescription:LEu1;

    return-object v0
.end method

.method public getDebugLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->debugLabel:Ljava/lang/String;

    return-object v0
.end method

.method public getEnabled()Z
    .locals 1

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/TextFieldController$DefaultImpls;->getEnabled(Lcom/stripe/android/uicore/elements/TextFieldController;)Z

    move-result v0

    return v0
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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->error:LEu1;

    return-object v0
.end method

.method public getFieldState()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Lcom/stripe/android/uicore/elements/TextFieldState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->fieldState:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->fieldValue:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->formFieldValue:LEu1;

    return-object v0
.end method

.method public getKeyboardType-PjHm6EE()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->keyboardType:I

    return v0
.end method

.method public bridge synthetic getLabel()LEu1;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->getLabel()LGX2;

    move-result-object v0

    return-object v0
.end method

.method public getLabel()LGX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LGX2<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->label:LGX2;

    return-object v0
.end method

.method public getLoading()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->loading:LEu1;

    return-object v0
.end method

.method public getPlaceHolder()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/TextFieldController$DefaultImpls;->getPlaceHolder(Lcom/stripe/android/uicore/elements/TextFieldController;)LEu1;

    move-result-object v0

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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->rawFieldValue:LEu1;

    return-object v0
.end method

.method public getShowOptionalLabel()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->showOptionalLabel:Z

    return v0
.end method

.method public getTrailingIcon()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->trailingIcon:LEu1;

    return-object v0
.end method

.method public getVisibleError()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->visibleError:LEu1;

    return-object v0
.end method

.method public getVisualTransformation()LEu6;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->visualTransformation:LEu6;

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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->isComplete:LEu1;

    return-object v0
.end method

.method public final launchAutocompleteScreen()V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->onNavigation:Lkotlin/jvm/functions/Function0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public onFocusChange(Z)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->_hasFocus:LGX2;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public onRawValueChange(Ljava/lang/String;)V
    .locals 1

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->config:Lcom/stripe/android/uicore/elements/TextFieldConfig;

    invoke-interface {v0, p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->convertFromRaw(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->onValueChange(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;

    return-void
.end method

.method public onValueChange(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;
    .locals 3

    const-string v0, "displayFormatted"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->_fieldState:LGX2;

    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/uicore/elements/TextFieldState;

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->_fieldValue:LGX2;

    iget-object v2, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->config:Lcom/stripe/android/uicore/elements/TextFieldConfig;

    invoke-interface {v2, p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->filter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, LGX2;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->_fieldState:LGX2;

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->config:Lcom/stripe/android/uicore/elements/TextFieldConfig;

    iget-object v2, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->_fieldValue:LGX2;

    invoke-interface {v2}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1, v2}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->determineState(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;

    move-result-object v1

    invoke-interface {p1, v1}, LGX2;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->_fieldState:LGX2;

    invoke-interface {p1}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->_fieldState:LGX2;

    invoke-interface {p1}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/uicore/elements/TextFieldState;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
