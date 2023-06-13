.class public final Lcom/stripe/android/ui/core/elements/CvcController;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/uicore/elements/TextFieldController;
.implements Lcom/stripe/android/uicore/elements/SectionFieldErrorController;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r\u0012\u000c\u0010O\u001a\u0008\u0012\u0004\u0012\u00020N0!\u0012\n\u0008\u0002\u0010P\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\n\u00a2\u0006\u0004\u0008Q\u0010RJ\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\n8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R#\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R#\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0016\u001a\u0004\u0008\u001b\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u001a\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R \u0010%\u001a\u0008\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008%\u0010$\u001a\u0004\u0008&\u0010\'R\u001a\u0010(\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+R \u0010-\u001a\u00020,8\u0016X\u0096\u0004\u00a2\u0006\u0012\n\u0004\u0008-\u0010.\u0012\u0004\u00081\u00102\u001a\u0004\u0008/\u00100R\u001a\u00104\u001a\u0008\u0012\u0004\u0012\u00020\u0003038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u00105R \u00106\u001a\u0008\u0012\u0004\u0012\u00020\u00030!8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00086\u0010$\u001a\u0004\u00087\u0010\'R \u00108\u001a\u0008\u0012\u0004\u0012\u00020\u00030!8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00088\u0010$\u001a\u0004\u00089\u0010\'R \u0010:\u001a\u0008\u0012\u0004\u0012\u00020\u00030!8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008:\u0010$\u001a\u0004\u0008;\u0010\'R\u001a\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u00050!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010$R \u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u00050!8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008=\u0010$\u001a\u0004\u0008>\u0010\'R\u001a\u0010?\u001a\u0008\u0012\u0004\u0012\u00020\n038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008?\u00105R \u0010@\u001a\u0008\u0012\u0004\u0012\u00020\n0!8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008@\u0010$\u001a\u0004\u0008A\u0010\'R\"\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0!8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008C\u0010$\u001a\u0004\u0008D\u0010\'R \u0010E\u001a\u0008\u0012\u0004\u0012\u00020\n0!8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008E\u0010$\u001a\u0004\u0008E\u0010\'R \u0010G\u001a\u0008\u0012\u0004\u0012\u00020F0!8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008G\u0010$\u001a\u0004\u0008H\u0010\'R\"\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010I0!8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008J\u0010$\u001a\u0004\u0008K\u0010\'R \u0010L\u001a\u0008\u0012\u0004\u0012\u00020\n0!8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008L\u0010$\u001a\u0004\u0008M\u0010\'\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006S"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/CvcController;",
        "Lcom/stripe/android/uicore/elements/TextFieldController;",
        "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;",
        "",
        "displayFormatted",
        "Lcom/stripe/android/uicore/elements/TextFieldState;",
        "onValueChange",
        "rawValue",
        "",
        "onRawValueChange",
        "",
        "newHasFocus",
        "onFocusChange",
        "Lcom/stripe/android/ui/core/elements/CvcConfig;",
        "cvcTextFieldConfig",
        "Lcom/stripe/android/ui/core/elements/CvcConfig;",
        "showOptionalLabel",
        "Z",
        "getShowOptionalLabel",
        "()Z",
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
        "LEu1;",
        "",
        "_label",
        "LEu1;",
        "label",
        "getLabel",
        "()LEu1;",
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
        "LGX2;",
        "_fieldValue",
        "LGX2;",
        "fieldValue",
        "getFieldValue",
        "rawFieldValue",
        "getRawFieldValue",
        "contentDescription",
        "getContentDescription",
        "_fieldState",
        "fieldState",
        "getFieldState",
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
        "Lcom/stripe/android/uicore/elements/TextFieldIcon;",
        "trailingIcon",
        "getTrailingIcon",
        "loading",
        "getLoading",
        "Lcom/stripe/android/model/CardBrand;",
        "cardBrandFlow",
        "initialValue",
        "<init>",
        "(Lcom/stripe/android/ui/core/elements/CvcConfig;LEu1;Ljava/lang/String;Z)V",
        "payments-ui-core_release"
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
        "SMAP\nCvcController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CvcController.kt\ncom/stripe/android/ui/core/elements/CvcController\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,112:1\n47#2:113\n49#2:117\n47#2:118\n49#2:122\n47#2:123\n49#2:127\n47#2:128\n49#2:132\n47#2:133\n49#2:137\n50#3:114\n55#3:116\n50#3:119\n55#3:121\n50#3:124\n55#3:126\n50#3:129\n55#3:131\n50#3:134\n55#3:136\n106#4:115\n106#4:120\n106#4:125\n106#4:130\n106#4:135\n*S KotlinDebug\n*F\n+ 1 CvcController.kt\ncom/stripe/android/ui/core/elements/CvcController\n*L\n32#1:113\n32#1:117\n50#1:118\n50#1:122\n53#1:123\n53#1:127\n75#1:128\n75#1:132\n82#1:133\n82#1:137\n32#1:114\n32#1:116\n50#1:119\n50#1:121\n53#1:124\n53#1:126\n75#1:129\n75#1:131\n82#1:134\n82#1:136\n32#1:115\n50#1:120\n53#1:125\n75#1:130\n82#1:135\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final _fieldState:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
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

.field private final _label:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final autofillType:LRu;

.field private final capitalization:I

.field private final contentDescription:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final cvcTextFieldConfig:Lcom/stripe/android/ui/core/elements/CvcConfig;

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

.field private final label:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
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

.method public constructor <init>(Lcom/stripe/android/ui/core/elements/CvcConfig;LEu1;Ljava/lang/String;Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/ui/core/elements/CvcConfig;",
            "LEu1<",
            "+",
            "Lcom/stripe/android/model/CardBrand;",
            ">;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    const-string v0, "cvcTextFieldConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardBrandFlow"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/CvcController;->cvcTextFieldConfig:Lcom/stripe/android/ui/core/elements/CvcConfig;

    iput-boolean p4, p0, Lcom/stripe/android/ui/core/elements/CvcController;->showOptionalLabel:Z

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CvcConfig;->getCapitalization-IUNYP9k()I

    move-result p4

    iput p4, p0, Lcom/stripe/android/ui/core/elements/CvcController;->capitalization:I

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CvcConfig;->getKeyboard-PjHm6EE()I

    move-result p4

    iput p4, p0, Lcom/stripe/android/ui/core/elements/CvcController;->keyboardType:I

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CvcConfig;->getVisualTransformation()LEu6;

    move-result-object p4

    iput-object p4, p0, Lcom/stripe/android/ui/core/elements/CvcController;->visualTransformation:LEu6;

    new-instance p4, Lcom/stripe/android/ui/core/elements/CvcController$special$$inlined$map$1;

    invoke-direct {p4, p2}, Lcom/stripe/android/ui/core/elements/CvcController$special$$inlined$map$1;-><init>(LEu1;)V

    iput-object p4, p0, Lcom/stripe/android/ui/core/elements/CvcController;->_label:LEu1;

    iput-object p4, p0, Lcom/stripe/android/ui/core/elements/CvcController;->label:LEu1;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CvcConfig;->getDebugLabel()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/CvcController;->debugLabel:Ljava/lang/String;

    sget-object p1, LRu;->j:LRu;

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/CvcController;->autofillType:LRu;

    const-string p1, ""

    invoke-static {p1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p4

    iput-object p4, p0, Lcom/stripe/android/ui/core/elements/CvcController;->_fieldValue:LGX2;

    iput-object p4, p0, Lcom/stripe/android/ui/core/elements/CvcController;->fieldValue:LEu1;

    new-instance v0, Lcom/stripe/android/ui/core/elements/CvcController$special$$inlined$map$2;

    invoke-direct {v0, p4, p0}, Lcom/stripe/android/ui/core/elements/CvcController$special$$inlined$map$2;-><init>(LEu1;Lcom/stripe/android/ui/core/elements/CvcController;)V

    iput-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->rawFieldValue:LEu1;

    new-instance v0, Lcom/stripe/android/ui/core/elements/CvcController$special$$inlined$map$3;

    invoke-direct {v0, p4}, Lcom/stripe/android/ui/core/elements/CvcController$special$$inlined$map$3;-><init>(LEu1;)V

    iput-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->contentDescription:LEu1;

    new-instance v0, Lcom/stripe/android/ui/core/elements/CvcController$_fieldState$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/stripe/android/ui/core/elements/CvcController$_fieldState$1;-><init>(Lcom/stripe/android/ui/core/elements/CvcController;Lkotlin/coroutines/Continuation;)V

    invoke-static {p2, p4, v0}, LVu1;->n(LEu1;LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object p4

    iput-object p4, p0, Lcom/stripe/android/ui/core/elements/CvcController;->_fieldState:LEu1;

    iput-object p4, p0, Lcom/stripe/android/ui/core/elements/CvcController;->fieldState:LEu1;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v2

    iput-object v2, p0, Lcom/stripe/android/ui/core/elements/CvcController;->_hasFocus:LGX2;

    new-instance v3, Lcom/stripe/android/ui/core/elements/CvcController$visibleError$1;

    invoke-direct {v3, v1}, Lcom/stripe/android/ui/core/elements/CvcController$visibleError$1;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {p4, v2, v3}, LVu1;->n(LEu1;LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object v2

    iput-object v2, p0, Lcom/stripe/android/ui/core/elements/CvcController;->visibleError:LEu1;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/CvcController;->getVisibleError()LEu1;

    move-result-object v2

    new-instance v3, Lcom/stripe/android/ui/core/elements/CvcController$error$1;

    invoke-direct {v3, v1}, Lcom/stripe/android/ui/core/elements/CvcController$error$1;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {v2, p4, v3}, LVu1;->n(LEu1;LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object v2

    iput-object v2, p0, Lcom/stripe/android/ui/core/elements/CvcController;->error:LEu1;

    new-instance v2, Lcom/stripe/android/ui/core/elements/CvcController$special$$inlined$map$4;

    invoke-direct {v2, p4}, Lcom/stripe/android/ui/core/elements/CvcController$special$$inlined$map$4;-><init>(LEu1;)V

    iput-object v2, p0, Lcom/stripe/android/ui/core/elements/CvcController;->isComplete:LEu1;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/CvcController;->isComplete()LEu1;

    move-result-object p4

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/CvcController;->getRawFieldValue()LEu1;

    move-result-object v2

    new-instance v3, Lcom/stripe/android/ui/core/elements/CvcController$formFieldValue$1;

    invoke-direct {v3, v1}, Lcom/stripe/android/ui/core/elements/CvcController$formFieldValue$1;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {p4, v2, v3}, LVu1;->n(LEu1;LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object p4

    iput-object p4, p0, Lcom/stripe/android/ui/core/elements/CvcController;->formFieldValue:LEu1;

    new-instance p4, Lcom/stripe/android/ui/core/elements/CvcController$special$$inlined$map$5;

    invoke-direct {p4, p2}, Lcom/stripe/android/ui/core/elements/CvcController$special$$inlined$map$5;-><init>(LEu1;)V

    iput-object p4, p0, Lcom/stripe/android/ui/core/elements/CvcController;->trailingIcon:LEu1;

    invoke-static {v0}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/CvcController;->loading:LEu1;

    if-nez p3, :cond_0

    move-object p3, p1

    :cond_0
    invoke-virtual {p0, p3}, Lcom/stripe/android/ui/core/elements/CvcController;->onRawValueChange(Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/ui/core/elements/CvcConfig;LEu1;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    new-instance p1, Lcom/stripe/android/ui/core/elements/CvcConfig;

    invoke-direct {p1}, Lcom/stripe/android/ui/core/elements/CvcConfig;-><init>()V

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    const/4 p4, 0x0

    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/ui/core/elements/CvcController;-><init>(Lcom/stripe/android/ui/core/elements/CvcConfig;LEu1;Ljava/lang/String;Z)V

    return-void
.end method

.method public static final synthetic access$getCvcTextFieldConfig$p(Lcom/stripe/android/ui/core/elements/CvcController;)Lcom/stripe/android/ui/core/elements/CvcConfig;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->cvcTextFieldConfig:Lcom/stripe/android/ui/core/elements/CvcConfig;

    return-object p0
.end method

.method public static synthetic getAutofillType$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public ComposeUI-MxjM1cc(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;I)V
    .locals 0
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

    invoke-static/range {p0 .. p9}, Lcom/stripe/android/uicore/elements/TextFieldController$DefaultImpls;->ComposeUI-MxjM1cc(Lcom/stripe/android/uicore/elements/TextFieldController;ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;I)V

    return-void
.end method

.method public getAutofillType()LRu;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->autofillType:LRu;

    return-object v0
.end method

.method public getCapitalization-IUNYP9k()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->capitalization:I

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->contentDescription:LEu1;

    return-object v0
.end method

.method public getDebugLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->debugLabel:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->error:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->fieldState:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->fieldValue:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->formFieldValue:LEu1;

    return-object v0
.end method

.method public getKeyboardType-PjHm6EE()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->keyboardType:I

    return v0
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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->label:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->loading:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->rawFieldValue:LEu1;

    return-object v0
.end method

.method public getShowOptionalLabel()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->showOptionalLabel:Z

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->trailingIcon:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->visibleError:LEu1;

    return-object v0
.end method

.method public getVisualTransformation()LEu6;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->visualTransformation:LEu6;

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->isComplete:LEu1;

    return-object v0
.end method

.method public onFocusChange(Z)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->_hasFocus:LGX2;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public onRawValueChange(Ljava/lang/String;)V
    .locals 1

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->cvcTextFieldConfig:Lcom/stripe/android/ui/core/elements/CvcConfig;

    invoke-virtual {v0, p1}, Lcom/stripe/android/ui/core/elements/CvcConfig;->convertFromRaw(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/ui/core/elements/CvcController;->onValueChange(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;

    return-void
.end method

.method public onValueChange(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;
    .locals 2

    const-string v0, "displayFormatted"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CvcController;->_fieldValue:LGX2;

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/CvcController;->cvcTextFieldConfig:Lcom/stripe/android/ui/core/elements/CvcConfig;

    invoke-virtual {v1, p1}, Lcom/stripe/android/ui/core/elements/CvcConfig;->filter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, LGX2;->setValue(Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method
