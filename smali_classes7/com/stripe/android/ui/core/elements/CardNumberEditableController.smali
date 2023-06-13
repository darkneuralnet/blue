.class public final Lcom/stripe/android/ui/core/elements/CardNumberEditableController;
.super Lcom/stripe/android/ui/core/elements/CardNumberController;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010R\u001a\u00020Q\u0012\u0006\u0010T\u001a\u00020S\u0012\u0008\u0008\u0002\u0010V\u001a\u00020U\u0012\u0008\u0010W\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\t\u00a2\u0006\u0004\u0008X\u0010YB#\u0008\u0016\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010[\u001a\u00020Z\u0012\u0008\u0010W\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008X\u0010\\J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\t8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R#\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R#\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0015\u001a\u0004\u0008\u001a\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R \u0010&\u001a\u0008\u0012\u0004\u0012\u00020%0$8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)R\u001a\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R \u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00020$8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008-\u0010\'\u001a\u0004\u0008.\u0010)R \u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u00020$8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008/\u0010\'\u001a\u0004\u00080\u0010)R \u00101\u001a\u0008\u0012\u0004\u0012\u00020\u00020$8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00081\u0010\'\u001a\u0004\u00082\u0010)R \u00104\u001a\u0008\u0012\u0004\u0012\u0002030$8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00084\u0010\'\u001a\u0004\u00085\u0010)R\u001a\u00106\u001a\u00020\t8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u00086\u0010\u0010\u001a\u0004\u00087\u0010\u0012R\"\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080$8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00089\u0010\'\u001a\u0004\u0008:\u0010)R\u001a\u0010;\u001a\u0008\u0012\u0004\u0012\u00020\u00040$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008;\u0010\'R \u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u00040$8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008<\u0010\'\u001a\u0004\u0008=\u0010)R\u001a\u0010>\u001a\u0008\u0012\u0004\u0012\u00020\t0*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u0010,R \u0010@\u001a\u00020?8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008@\u0010A\u0012\u0004\u0008D\u0010E\u001a\u0004\u0008B\u0010CR \u0010F\u001a\u0008\u0012\u0004\u0012\u00020\t0$8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008F\u0010\'\u001a\u0004\u0008G\u0010)R \u0010H\u001a\u0008\u0012\u0004\u0012\u00020\t0$8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008H\u0010\'\u001a\u0004\u0008I\u0010)R\"\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010J0$8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008K\u0010\'\u001a\u0004\u0008L\u0010)R \u0010M\u001a\u0008\u0012\u0004\u0012\u00020\t0$8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008M\u0010\'\u001a\u0004\u0008M\u0010)R \u0010O\u001a\u0008\u0012\u0004\u0012\u00020N0$8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008O\u0010\'\u001a\u0004\u0008P\u0010)\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006]"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/CardNumberEditableController;",
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
        "Lcom/stripe/android/ui/core/elements/CardNumberConfig;",
        "cardTextFieldConfig",
        "Lcom/stripe/android/ui/core/elements/CardNumberConfig;",
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
        "debugLabel",
        "Ljava/lang/String;",
        "getDebugLabel",
        "()Ljava/lang/String;",
        "LEu1;",
        "",
        "label",
        "LEu1;",
        "getLabel",
        "()LEu1;",
        "LGX2;",
        "_fieldValue",
        "LGX2;",
        "fieldValue",
        "getFieldValue",
        "rawFieldValue",
        "getRawFieldValue",
        "contentDescription",
        "getContentDescription",
        "Lcom/stripe/android/model/CardBrand;",
        "cardBrandFlow",
        "getCardBrandFlow",
        "cardScanEnabled",
        "getCardScanEnabled",
        "Lcom/stripe/android/uicore/elements/TextFieldIcon;",
        "trailingIcon",
        "getTrailingIcon",
        "_fieldState",
        "fieldState",
        "getFieldState",
        "_hasFocus",
        "Lcom/stripe/android/cards/CardAccountRangeService;",
        "accountRangeService",
        "Lcom/stripe/android/cards/CardAccountRangeService;",
        "getAccountRangeService",
        "()Lcom/stripe/android/cards/CardAccountRangeService;",
        "getAccountRangeService$annotations",
        "()V",
        "loading",
        "getLoading",
        "visibleError",
        "getVisibleError",
        "Lcom/stripe/android/uicore/elements/FieldError;",
        "error",
        "getError",
        "isComplete",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "formFieldValue",
        "getFormFieldValue",
        "Lcom/stripe/android/cards/CardAccountRangeRepository;",
        "cardAccountRangeRepository",
        "Lkotlin/coroutines/CoroutineContext;",
        "workContext",
        "Lcom/stripe/android/cards/StaticCardAccountRanges;",
        "staticCardAccountRanges",
        "initialValue",
        "<init>",
        "(Lcom/stripe/android/ui/core/elements/CardNumberConfig;Lcom/stripe/android/cards/CardAccountRangeRepository;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/StaticCardAccountRanges;Ljava/lang/String;Z)V",
        "Landroid/content/Context;",
        "context",
        "(Lcom/stripe/android/ui/core/elements/CardNumberConfig;Landroid/content/Context;Ljava/lang/String;)V",
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
        "SMAP\nCardNumberController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardNumberController.kt\ncom/stripe/android/ui/core/elements/CardNumberEditableController\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,185:1\n47#2:186\n49#2:190\n47#2:191\n49#2:195\n47#2:196\n49#2:200\n47#2:201\n49#2:205\n50#3:187\n55#3:189\n50#3:192\n55#3:194\n50#3:197\n55#3:199\n50#3:202\n55#3:204\n106#4:188\n106#4:193\n106#4:198\n106#4:203\n*S KotlinDebug\n*F\n+ 1 CardNumberController.kt\ncom/stripe/android/ui/core/elements/CardNumberEditableController\n*L\n78#1:186\n78#1:190\n82#1:191\n82#1:195\n89#1:196\n89#1:200\n152#1:201\n152#1:205\n78#1:187\n78#1:189\n82#1:192\n82#1:194\n89#1:197\n89#1:199\n152#1:202\n152#1:204\n78#1:188\n82#1:193\n89#1:198\n152#1:203\n*E\n"
    }
.end annotation


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

.field private final accountRangeService:Lcom/stripe/android/cards/CardAccountRangeService;

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

.field private final cardTextFieldConfig:Lcom/stripe/android/ui/core/elements/CardNumberConfig;

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
.method public constructor <init>(Lcom/stripe/android/ui/core/elements/CardNumberConfig;Landroid/content/Context;Ljava/lang/String;)V
    .locals 10

    const-string v0, "cardTextFieldConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;

    invoke-direct {v0, p2}, Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;->create()Lcom/stripe/android/cards/CardAccountRangeRepository;

    move-result-object v3

    invoke-static {}, LT41;->b()LSC0;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x28

    const/4 v9, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v6, p3

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;-><init>(Lcom/stripe/android/ui/core/elements/CardNumberConfig;Lcom/stripe/android/cards/CardAccountRangeRepository;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/StaticCardAccountRanges;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/ui/core/elements/CardNumberConfig;Lcom/stripe/android/cards/CardAccountRangeRepository;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/StaticCardAccountRanges;Ljava/lang/String;Z)V
    .locals 4

    const-string v0, "cardTextFieldConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardAccountRangeRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "staticCardAccountRanges"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/ui/core/elements/CardNumberController;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->cardTextFieldConfig:Lcom/stripe/android/ui/core/elements/CardNumberConfig;

    iput-boolean p6, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->showOptionalLabel:Z

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->getCapitalization-IUNYP9k()I

    move-result p6

    iput p6, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->capitalization:I

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->getKeyboard-PjHm6EE()I

    move-result p6

    iput p6, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->keyboardType:I

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->getVisualTransformation()LEu6;

    move-result-object p6

    iput-object p6, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->visualTransformation:LEu6;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->getDebugLabel()Ljava/lang/String;

    move-result-object p6

    iput-object p6, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->debugLabel:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->getLabel()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->label:LEu1;

    const-string p1, ""

    invoke-static {p1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p6

    iput-object p6, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->_fieldValue:LGX2;

    iput-object p6, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->fieldValue:LEu1;

    new-instance v1, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$special$$inlined$map$1;

    invoke-direct {v1, p6, p0}, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$special$$inlined$map$1;-><init>(LEu1;Lcom/stripe/android/ui/core/elements/CardNumberEditableController;)V

    iput-object v1, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->rawFieldValue:LEu1;

    iput-object p6, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->contentDescription:LEu1;

    new-instance v1, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$special$$inlined$map$2;

    invoke-direct {v1, p6, p0}, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$special$$inlined$map$2;-><init>(LEu1;Lcom/stripe/android/ui/core/elements/CardNumberEditableController;)V

    iput-object v1, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->cardBrandFlow:LEu1;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->cardScanEnabled:Z

    new-instance v1, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$special$$inlined$map$3;

    invoke-direct {v1, p6, p0}, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$special$$inlined$map$3;-><init>(LEu1;Lcom/stripe/android/ui/core/elements/CardNumberEditableController;)V

    iput-object v1, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->trailingIcon:LEu1;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->getCardBrandFlow()LEu1;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$_fieldState$1;

    invoke-direct {v2, p0, v0}, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$_fieldState$1;-><init>(Lcom/stripe/android/ui/core/elements/CardNumberEditableController;Lkotlin/coroutines/Continuation;)V

    invoke-static {v1, p6, v2}, LVu1;->n(LEu1;LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object p6

    iput-object p6, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->_fieldState:LEu1;

    iput-object p6, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->fieldState:LEu1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v1

    iput-object v1, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->_hasFocus:LGX2;

    new-instance v2, Lcom/stripe/android/cards/CardAccountRangeService;

    new-instance v3, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$accountRangeService$1;

    invoke-direct {v3, p0}, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$accountRangeService$1;-><init>(Lcom/stripe/android/ui/core/elements/CardNumberEditableController;)V

    invoke-direct {v2, p2, p3, p4, v3}, Lcom/stripe/android/cards/CardAccountRangeService;-><init>(Lcom/stripe/android/cards/CardAccountRangeRepository;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/StaticCardAccountRanges;Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;)V

    iput-object v2, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->accountRangeService:Lcom/stripe/android/cards/CardAccountRangeService;

    invoke-virtual {v2}, Lcom/stripe/android/cards/CardAccountRangeService;->isLoading()LEu1;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->loading:LEu1;

    new-instance p2, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$visibleError$1;

    invoke-direct {p2, v0}, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$visibleError$1;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {p6, v1, p2}, LVu1;->n(LEu1;LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->visibleError:LEu1;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->getVisibleError()LEu1;

    move-result-object p2

    new-instance p3, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$error$1;

    invoke-direct {p3, v0}, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$error$1;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {p2, p6, p3}, LVu1;->n(LEu1;LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->error:LEu1;

    new-instance p2, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$special$$inlined$map$4;

    invoke-direct {p2, p6}, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$special$$inlined$map$4;-><init>(LEu1;)V

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->isComplete:LEu1;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->isComplete()LEu1;

    move-result-object p2

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->getRawFieldValue()LEu1;

    move-result-object p3

    new-instance p4, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$formFieldValue$1;

    invoke-direct {p4, v0}, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$formFieldValue$1;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {p2, p3, p4}, LVu1;->n(LEu1;LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->formFieldValue:LEu1;

    if-nez p5, :cond_0

    move-object p5, p1

    :cond_0
    invoke-virtual {p0, p5}, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->onRawValueChange(Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/ui/core/elements/CardNumberConfig;Lcom/stripe/android/cards/CardAccountRangeRepository;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/StaticCardAccountRanges;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_0

    new-instance p4, Lcom/stripe/android/cards/DefaultStaticCardAccountRanges;

    invoke-direct {p4}, Lcom/stripe/android/cards/DefaultStaticCardAccountRanges;-><init>()V

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p7, 0x20

    if-eqz p4, :cond_1

    const/4 p6, 0x0

    :cond_1
    move v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;-><init>(Lcom/stripe/android/ui/core/elements/CardNumberConfig;Lcom/stripe/android/cards/CardAccountRangeRepository;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/StaticCardAccountRanges;Ljava/lang/String;Z)V

    return-void
.end method

.method public static final synthetic access$getCardTextFieldConfig$p(Lcom/stripe/android/ui/core/elements/CardNumberEditableController;)Lcom/stripe/android/ui/core/elements/CardNumberConfig;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->cardTextFieldConfig:Lcom/stripe/android/ui/core/elements/CardNumberConfig;

    return-object p0
.end method

.method public static synthetic getAccountRangeService$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final getAccountRangeService()Lcom/stripe/android/cards/CardAccountRangeService;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->accountRangeService:Lcom/stripe/android/cards/CardAccountRangeService;

    return-object v0
.end method

.method public getCapitalization-IUNYP9k()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->capitalization:I

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->cardBrandFlow:LEu1;

    return-object v0
.end method

.method public getCardScanEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->cardScanEnabled:Z

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->contentDescription:LEu1;

    return-object v0
.end method

.method public getDebugLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->debugLabel:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->error:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->fieldState:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->fieldValue:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->formFieldValue:LEu1;

    return-object v0
.end method

.method public getKeyboardType-PjHm6EE()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->keyboardType:I

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->label:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->loading:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->rawFieldValue:LEu1;

    return-object v0
.end method

.method public getShowOptionalLabel()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->showOptionalLabel:Z

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->trailingIcon:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->visibleError:LEu1;

    return-object v0
.end method

.method public getVisualTransformation()LEu6;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->visualTransformation:LEu6;

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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->isComplete:LEu1;

    return-object v0
.end method

.method public onFocusChange(Z)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->_hasFocus:LGX2;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public onRawValueChange(Ljava/lang/String;)V
    .locals 1

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->cardTextFieldConfig:Lcom/stripe/android/ui/core/elements/CardNumberConfig;

    invoke-virtual {v0, p1}, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->convertFromRaw(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->onValueChange(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;

    return-void
.end method

.method public onValueChange(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;
    .locals 2

    const-string v0, "displayFormatted"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->_fieldValue:LGX2;

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->cardTextFieldConfig:Lcom/stripe/android/ui/core/elements/CardNumberConfig;

    invoke-virtual {v1, p1}, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->filter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, LGX2;->setValue(Ljava/lang/Object;)V

    new-instance v0, Lcom/stripe/android/cards/CardNumber$Unvalidated;

    invoke-direct {v0, p1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->accountRangeService:Lcom/stripe/android/cards/CardAccountRangeService;

    invoke-virtual {p1, v0}, Lcom/stripe/android/cards/CardAccountRangeService;->onCardNumberChanged(Lcom/stripe/android/cards/CardNumber$Unvalidated;)V

    const/4 p1, 0x0

    return-object p1
.end method
