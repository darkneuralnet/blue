.class public final Lcom/stripe/android/uicore/elements/SimpleTextFieldController;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/uicore/elements/TextFieldController;
.implements Lcom/stripe/android/uicore/elements/SectionFieldErrorController;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\n\u0012\n\u0008\u0002\u0010R\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008S\u0010TJ\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u000e\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\n8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\"\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00168\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR#\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R#\u0010\"\u001a\u00020!8\u0016X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u001e\u001a\u0004\u0008#\u0010 R\u001a\u0010%\u001a\u00020$8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(R\"\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0)8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008+\u0010,\u001a\u0004\u0008-\u0010.R\u001a\u0010/\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008/\u00100\u001a\u0004\u00081\u00102R\"\u00104\u001a\u0004\u0018\u0001038\u0016X\u0096\u0004\u00a2\u0006\u0012\n\u0004\u00084\u00105\u0012\u0004\u00088\u00109\u001a\u0004\u00086\u00107R\"\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030)8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008:\u0010,\u001a\u0004\u0008;\u0010.R\u001a\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u00030)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010,R \u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00168\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008=\u0010\u0019\u001a\u0004\u0008>\u0010\u001bR \u0010?\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00168\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008?\u0010\u0019\u001a\u0004\u0008@\u0010\u001bR \u0010A\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00168\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008A\u0010\u0019\u001a\u0004\u0008B\u0010\u001bR\u001a\u0010C\u001a\u0008\u0012\u0004\u0012\u00020\u00050)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u0010,R \u0010D\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00168\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008D\u0010\u0019\u001a\u0004\u0008E\u0010\u001bR \u0010F\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00168\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008F\u0010\u0019\u001a\u0004\u0008G\u0010\u001bR\u001a\u0010H\u001a\u0008\u0012\u0004\u0012\u00020\n0)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008H\u0010,R \u0010I\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00168\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008I\u0010\u0019\u001a\u0004\u0008J\u0010\u001bR\"\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010K0\u00168\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008L\u0010\u0019\u001a\u0004\u0008M\u0010\u001bR \u0010N\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00168\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008N\u0010\u0019\u001a\u0004\u0008N\u0010\u001bR \u0010P\u001a\u0008\u0012\u0004\u0012\u00020O0\u00168\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008P\u0010\u0019\u001a\u0004\u0008Q\u0010\u001b\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006U"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;",
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
        "Lcom/stripe/android/uicore/elements/TextFieldConfig;",
        "textFieldConfig",
        "Lcom/stripe/android/uicore/elements/TextFieldConfig;",
        "getTextFieldConfig",
        "()Lcom/stripe/android/uicore/elements/TextFieldConfig;",
        "showOptionalLabel",
        "Z",
        "getShowOptionalLabel",
        "()Z",
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
        "placeHolder",
        "getPlaceHolder",
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
        "(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;)V",
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
        "SMAP\nTextFieldController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldController.kt\ncom/stripe/android/uicore/elements/SimpleTextFieldController\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,197:1\n47#2:198\n49#2:202\n47#2:203\n49#2:207\n47#2:208\n49#2:212\n50#3:199\n55#3:201\n50#3:204\n55#3:206\n50#3:209\n55#3:211\n106#4:200\n106#4:205\n106#4:210\n1#5:213\n*S KotlinDebug\n*F\n+ 1 TextFieldController.kt\ncom/stripe/android/uicore/elements/SimpleTextFieldController\n*L\n133#1:198\n133#1:202\n152#1:203\n152#1:207\n156#1:208\n156#1:212\n133#1:199\n133#1:201\n152#1:204\n152#1:206\n156#1:209\n156#1:211\n133#1:200\n152#1:205\n156#1:210\n*E\n"
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

.field private final placeHolder:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Ljava/lang/String;",
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

.field private final textFieldConfig:Lcom/stripe/android/uicore/elements/TextFieldConfig;

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

.method public constructor <init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;)V
    .locals 2

    const-string v0, "textFieldConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->textFieldConfig:Lcom/stripe/android/uicore/elements/TextFieldConfig;

    iput-boolean p2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->showOptionalLabel:Z

    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getTrailingIcon()LtP5;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->trailingIcon:LEu1;

    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getCapitalization-IUNYP9k()I

    move-result p2

    iput p2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->capitalization:I

    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getKeyboard-PjHm6EE()I

    move-result p2

    iput p2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->keyboardType:I

    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getVisualTransformation()LEu6;

    move-result-object p2

    if-nez p2, :cond_0

    sget-object p2, LEu6;->a:LEu6$a;

    invoke-virtual {p2}, LEu6$a;->a()LEu6;

    move-result-object p2

    :cond_0
    iput-object p2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->visualTransformation:LEu6;

    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getLabel()Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p2}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->label:LGX2;

    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getDebugLabel()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->debugLabel:Ljava/lang/String;

    instance-of p2, p1, Lcom/stripe/android/uicore/elements/DateConfig;

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    sget-object p2, LRu;->k:LRu;

    goto :goto_0

    :cond_1
    instance-of p2, p1, Lcom/stripe/android/uicore/elements/PostalCodeConfig;

    if-eqz p2, :cond_2

    sget-object p2, LRu;->h:LRu;

    goto :goto_0

    :cond_2
    instance-of p2, p1, Lcom/stripe/android/uicore/elements/EmailConfig;

    if-eqz p2, :cond_3

    sget-object p2, LRu;->b:LRu;

    goto :goto_0

    :cond_3
    instance-of p2, p1, Lcom/stripe/android/uicore/elements/NameConfig;

    if-eqz p2, :cond_4

    sget-object p2, LRu;->u:LRu;

    goto :goto_0

    :cond_4
    move-object p2, v0

    :goto_0
    iput-object p2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->autofillType:LRu;

    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getPlaceHolder()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->placeHolder:LGX2;

    const-string p2, ""

    invoke-static {p2}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->_fieldValue:LGX2;

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->fieldValue:LEu1;

    new-instance v1, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$special$$inlined$map$1;

    invoke-direct {v1, p2, p0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$special$$inlined$map$1;-><init>(LEu1;Lcom/stripe/android/uicore/elements/SimpleTextFieldController;)V

    iput-object v1, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->rawFieldValue:LEu1;

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->contentDescription:LEu1;

    sget-object p2, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;->INSTANCE:Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;

    invoke-static {p2}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->_fieldState:LGX2;

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->fieldState:LEu1;

    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->getLoading()LtP5;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->loading:LEu1;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->_hasFocus:LGX2;

    new-instance v1, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$visibleError$1;

    invoke-direct {v1, v0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$visibleError$1;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {p2, p1, v1}, LVu1;->n(LEu1;LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->visibleError:LEu1;

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->getVisibleError()LEu1;

    move-result-object p1

    new-instance v1, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$special$$inlined$map$2;

    invoke-direct {v1, p1, p0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$special$$inlined$map$2;-><init>(LEu1;Lcom/stripe/android/uicore/elements/SimpleTextFieldController;)V

    iput-object v1, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->error:LEu1;

    new-instance p1, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$special$$inlined$map$3;

    invoke-direct {p1, p2, p0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$special$$inlined$map$3;-><init>(LEu1;Lcom/stripe/android/uicore/elements/SimpleTextFieldController;)V

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->isComplete:LEu1;

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->isComplete()LEu1;

    move-result-object p1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->getRawFieldValue()LEu1;

    move-result-object p2

    new-instance v1, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$formFieldValue$1;

    invoke-direct {v1, v0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController$formFieldValue$1;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {p1, p2, v1}, LVu1;->n(LEu1;LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->formFieldValue:LEu1;

    if-eqz p3, :cond_5

    invoke-virtual {p0, p3}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->onRawValueChange(Ljava/lang/String;)V

    :cond_5
    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;-><init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$get_fieldState$p(Lcom/stripe/android/uicore/elements/SimpleTextFieldController;)LGX2;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->_fieldState:LGX2;

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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->autofillType:LRu;

    return-object v0
.end method

.method public getCapitalization-IUNYP9k()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->capitalization:I

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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->contentDescription:LEu1;

    return-object v0
.end method

.method public getDebugLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->debugLabel:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->error:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->fieldState:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->fieldValue:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->formFieldValue:LEu1;

    return-object v0
.end method

.method public getKeyboardType-PjHm6EE()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->keyboardType:I

    return v0
.end method

.method public bridge synthetic getLabel()LEu1;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->getLabel()LGX2;

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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->label:LGX2;

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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->loading:LEu1;

    return-object v0
.end method

.method public bridge synthetic getPlaceHolder()LEu1;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->getPlaceHolder()LGX2;

    move-result-object v0

    return-object v0
.end method

.method public getPlaceHolder()LGX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LGX2<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->placeHolder:LGX2;

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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->rawFieldValue:LEu1;

    return-object v0
.end method

.method public getShowOptionalLabel()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->showOptionalLabel:Z

    return v0
.end method

.method public final getTextFieldConfig()Lcom/stripe/android/uicore/elements/TextFieldConfig;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->textFieldConfig:Lcom/stripe/android/uicore/elements/TextFieldConfig;

    return-object v0
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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->trailingIcon:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->visibleError:LEu1;

    return-object v0
.end method

.method public getVisualTransformation()LEu6;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->visualTransformation:LEu6;

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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->isComplete:LEu1;

    return-object v0
.end method

.method public onFocusChange(Z)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->_hasFocus:LGX2;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public onRawValueChange(Ljava/lang/String;)V
    .locals 1

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->textFieldConfig:Lcom/stripe/android/uicore/elements/TextFieldConfig;

    invoke-interface {v0, p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->convertFromRaw(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->onValueChange(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;

    return-void
.end method

.method public onValueChange(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;
    .locals 3

    const-string v0, "displayFormatted"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->_fieldState:LGX2;

    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/uicore/elements/TextFieldState;

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->_fieldValue:LGX2;

    iget-object v2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->textFieldConfig:Lcom/stripe/android/uicore/elements/TextFieldConfig;

    invoke-interface {v2, p1}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->filter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, LGX2;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->_fieldState:LGX2;

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->textFieldConfig:Lcom/stripe/android/uicore/elements/TextFieldConfig;

    iget-object v2, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->_fieldValue:LGX2;

    invoke-interface {v2}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1, v2}, Lcom/stripe/android/uicore/elements/TextFieldConfig;->determineState(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;

    move-result-object v1

    invoke-interface {p1, v1}, LGX2;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->_fieldState:LGX2;

    invoke-interface {p1}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->_fieldState:LGX2;

    invoke-interface {p1}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/uicore/elements/TextFieldState;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
