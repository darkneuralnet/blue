.class public final Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;
.super Lcom/stripe/android/ui/core/elements/CardNumberController;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0001\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010J\u001a\u00020I\u0012\u0014\u0010M\u001a\u0010\u0012\u0004\u0012\u00020L\u0012\u0006\u0012\u0004\u0018\u00010\u00020K\u00a2\u0006\u0004\u0008N\u0010OJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016R#\u0010\r\u001a\u00020\u000c8\u0016X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R#\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u000e\u001a\u0004\u0008\u0013\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR \u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R\u001a\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010 R \u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00020$8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(R \u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00020$8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008)\u0010&\u001a\u0004\u0008*\u0010(R \u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u00020$8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008+\u0010&\u001a\u0004\u0008,\u0010(R \u0010.\u001a\u0008\u0012\u0004\u0012\u00020-0$8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008.\u0010&\u001a\u0004\u0008/\u0010(R\u001a\u00100\u001a\u00020\t8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u00080\u00101\u001a\u0004\u00082\u00103R \u00105\u001a\u0008\u0012\u0004\u0012\u0002040$8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00085\u0010&\u001a\u0004\u00086\u0010(R \u00108\u001a\u0008\u0012\u0004\u0012\u0002070$8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00088\u0010&\u001a\u0004\u00089\u0010(R\u001a\u0010:\u001a\u00020\t8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008:\u00101\u001a\u0004\u0008;\u00103R\u001a\u0010<\u001a\u00020\t8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008<\u00101\u001a\u0004\u0008=\u00103R \u0010>\u001a\u0008\u0012\u0004\u0012\u00020\t0$8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008>\u0010&\u001a\u0004\u0008>\u0010(R \u0010@\u001a\u0008\u0012\u0004\u0012\u00020?0$8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008@\u0010&\u001a\u0004\u0008A\u0010(R\"\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0$8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008C\u0010&\u001a\u0004\u0008D\u0010(R \u0010E\u001a\u0008\u0012\u0004\u0012\u00020\t0$8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008E\u0010&\u001a\u0004\u0008F\u0010(R \u0010G\u001a\u0008\u0012\u0004\u0012\u00020\t0$8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008G\u0010&\u001a\u0004\u0008H\u0010(\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006P"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;",
        "Lcom/stripe/android/ui/core/elements/CardNumberController;",
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
        "debugLabel",
        "Ljava/lang/String;",
        "getDebugLabel",
        "()Ljava/lang/String;",
        "LGX2;",
        "",
        "label",
        "LGX2;",
        "getLabel",
        "()LGX2;",
        "_fieldValue",
        "LEu1;",
        "fieldValue",
        "LEu1;",
        "getFieldValue",
        "()LEu1;",
        "rawFieldValue",
        "getRawFieldValue",
        "contentDescription",
        "getContentDescription",
        "Lcom/stripe/android/model/CardBrand;",
        "cardBrandFlow",
        "getCardBrandFlow",
        "cardScanEnabled",
        "Z",
        "getCardScanEnabled",
        "()Z",
        "Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;",
        "trailingIcon",
        "getTrailingIcon",
        "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Full;",
        "fieldState",
        "getFieldState",
        "enabled",
        "getEnabled",
        "showOptionalLabel",
        "getShowOptionalLabel",
        "isComplete",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "formFieldValue",
        "getFormFieldValue",
        "",
        "error",
        "getError",
        "loading",
        "getLoading",
        "visibleError",
        "getVisibleError",
        "Lcom/stripe/android/ui/core/elements/CardNumberConfig;",
        "cardTextFieldConfig",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "initialValues",
        "<init>",
        "(Lcom/stripe/android/ui/core/elements/CardNumberConfig;Ljava/util/Map;)V",
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
        "SMAP\nCardNumberViewOnlyController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardNumberViewOnlyController.kt\ncom/stripe/android/ui/core/elements/CardNumberViewOnlyController\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,79:1\n47#2:80\n49#2:84\n50#3:81\n55#3:83\n106#4:82\n*S KotlinDebug\n*F\n+ 1 CardNumberViewOnlyController.kt\ncom/stripe/android/ui/core/elements/CardNumberViewOnlyController\n*L\n55#1:80\n55#1:84\n55#1:81\n55#1:83\n55#1:82\n*E\n"
    }
.end annotation


# instance fields
.field private final _fieldValue:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final capitalization:I

.field private final cardBrandFlow:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Lcom/stripe/android/model/CardBrand;",
            ">;"
        }
    .end annotation
.end field

.field private final cardScanEnabled:Z

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

.field private final enabled:Z

.field private final error:LEu1;

.field private final fieldState:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Full;",
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
            "Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;",
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
.method public constructor <init>(Lcom/stripe/android/ui/core/elements/CardNumberConfig;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/ui/core/elements/CardNumberConfig;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "cardTextFieldConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialValues"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/ui/core/elements/CardNumberController;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->getCapitalization-IUNYP9k()I

    move-result v1

    iput v1, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->capitalization:I

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->getKeyboard-PjHm6EE()I

    move-result v1

    iput v1, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->keyboardType:I

    sget-object v1, LEu6;->a:LEu6$a;

    invoke-virtual {v1}, LEu6$a;->a()LEu6;

    move-result-object v1

    iput-object v1, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->visualTransformation:LEu6;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->getDebugLabel()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->debugLabel:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->getLabel()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->label:LGX2;

    sget-object p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCardNumber()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_0

    const-string v1, ""

    :cond_0
    invoke-static {v1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v1

    iput-object v1, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->_fieldValue:LGX2;

    iput-object v1, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->fieldValue:LEu1;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->getFieldValue()LEu1;

    move-result-object v1

    iput-object v1, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->rawFieldValue:LEu1;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->getFieldValue()LEu1;

    move-result-object v1

    iput-object v1, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->contentDescription:LEu1;

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCardBrand()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_1

    sget-object p2, Lcom/stripe/android/model/CardBrand;->Companion:Lcom/stripe/android/model/CardBrand$Companion;

    invoke-virtual {p2, p1}, Lcom/stripe/android/model/CardBrand$Companion;->fromCode(Ljava/lang/String;)Lcom/stripe/android/model/CardBrand;

    move-result-object p1

    if-nez p1, :cond_2

    :cond_1
    sget-object p1, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    :cond_2
    invoke-static {p1}, LVu1;->G(Ljava/lang/Object;)LEu1;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->cardBrandFlow:LEu1;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->getCardBrandFlow()LEu1;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController$special$$inlined$map$1;

    invoke-direct {p2, p1}, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController$special$$inlined$map$1;-><init>(LEu1;)V

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->trailingIcon:LEu1;

    sget-object p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Full;->INSTANCE:Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Full;

    invoke-static {p1}, LVu1;->G(Ljava/lang/Object;)LEu1;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->fieldState:LEu1;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1}, LVu1;->G(Ljava/lang/Object;)LEu1;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->isComplete:LEu1;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->isComplete()LEu1;

    move-result-object p1

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->getRawFieldValue()LEu1;

    move-result-object p2

    new-instance v1, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController$formFieldValue$1;

    invoke-direct {v1, v0}, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController$formFieldValue$1;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {p1, p2, v1}, LVu1;->n(LEu1;LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->formFieldValue:LEu1;

    invoke-static {v0}, LVu1;->G(Ljava/lang/Object;)LEu1;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->error:LEu1;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, LVu1;->G(Ljava/lang/Object;)LEu1;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->loading:LEu1;

    invoke-static {p1}, LVu1;->G(Ljava/lang/Object;)LEu1;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->visibleError:LEu1;

    return-void
.end method


# virtual methods
.method public getCapitalization-IUNYP9k()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->capitalization:I

    return v0
.end method

.method public getCardBrandFlow()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Lcom/stripe/android/model/CardBrand;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->cardBrandFlow:LEu1;

    return-object v0
.end method

.method public getCardScanEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->cardScanEnabled:Z

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->contentDescription:LEu1;

    return-object v0
.end method

.method public getDebugLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->debugLabel:Ljava/lang/String;

    return-object v0
.end method

.method public getEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->enabled:Z

    return v0
.end method

.method public getError()LEu1;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->error:LEu1;

    return-object v0
.end method

.method public getFieldState()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Full;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->fieldState:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->fieldValue:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->formFieldValue:LEu1;

    return-object v0
.end method

.method public getKeyboardType-PjHm6EE()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->keyboardType:I

    return v0
.end method

.method public bridge synthetic getLabel()LEu1;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->getLabel()LGX2;

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->label:LGX2;

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->loading:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->rawFieldValue:LEu1;

    return-object v0
.end method

.method public getShowOptionalLabel()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->showOptionalLabel:Z

    return v0
.end method

.method public getTrailingIcon()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->trailingIcon:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->visibleError:LEu1;

    return-object v0
.end method

.method public getVisualTransformation()LEu6;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->visualTransformation:LEu6;

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;->isComplete:LEu1;

    return-object v0
.end method

.method public onFocusChange(Z)V
    .locals 0

    return-void
.end method

.method public onRawValueChange(Ljava/lang/String;)V
    .locals 1

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onValueChange(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;
    .locals 1

    const-string v0, "displayFormatted"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method
