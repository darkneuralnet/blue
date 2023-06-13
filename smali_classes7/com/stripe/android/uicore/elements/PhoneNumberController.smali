.class public final Lcom/stripe/android/uicore/elements/PhoneNumberController;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/uicore/elements/InputController;
.implements Lcom/stripe/android/uicore/elements/SectionFieldComposable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0001RB7\u0012\u0008\u0008\u0002\u0010\"\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010N\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0008\u0002\u0010O\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0018\u0012\u0008\u0008\u0002\u0010&\u001a\u00020\u0010\u00a2\u0006\u0004\u0008P\u0010QJ\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003J\u0017\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u0003J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010JU\u0010!\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00182\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0017\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 R\u0017\u0010\"\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010%R\u001a\u0010&\u001a\u00020\u00108\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)R \u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u00070*8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008+\u0010,\u001a\u0004\u0008-\u0010.R\u001a\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u00030/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u00101R \u00102\u001a\u0008\u0012\u0004\u0012\u00020\u00030*8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00082\u0010,\u001a\u0004\u00083\u0010.R\u001a\u00104\u001a\u0008\u0012\u0004\u0012\u00020\u00100/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u00101R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u00107R\u0017\u00109\u001a\u0002088\u0006\u00a2\u0006\u000c\n\u0004\u00089\u0010:\u001a\u0004\u0008;\u0010<R\u001a\u0010>\u001a\u0008\u0012\u0004\u0012\u00020=0/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u00101R\u001c\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008?\u0010,R \u0010@\u001a\u0008\u0012\u0004\u0012\u00020\u00030*8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008@\u0010,\u001a\u0004\u0008A\u0010.R \u0010B\u001a\u0008\u0012\u0004\u0012\u00020\u00100*8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008B\u0010,\u001a\u0004\u0008B\u0010.R \u0010D\u001a\u0008\u0012\u0004\u0012\u00020C0*8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008D\u0010,\u001a\u0004\u0008E\u0010.R\"\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F0*8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008G\u0010,\u001a\u0004\u0008H\u0010.R\u001d\u0010I\u001a\u0008\u0012\u0004\u0012\u00020\u00030*8\u0006\u00a2\u0006\u000c\n\u0004\u0008I\u0010,\u001a\u0004\u0008J\u0010.R\u001d\u0010L\u001a\u0008\u0012\u0004\u0012\u00020K0*8\u0006\u00a2\u0006\u000c\n\u0004\u0008L\u0010,\u001a\u0004\u0008M\u0010.\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006S"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/PhoneNumberController;",
        "Lcom/stripe/android/uicore/elements/InputController;",
        "Lcom/stripe/android/uicore/elements/SectionFieldComposable;",
        "",
        "getCountryCode",
        "phoneNumber",
        "getE164PhoneNumber",
        "",
        "index",
        "",
        "onSelectedCountryIndex",
        "(I)Lkotlin/Unit;",
        "displayFormatted",
        "onValueChange",
        "rawValue",
        "onRawValueChange",
        "",
        "newHasFocus",
        "onFocusChange",
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
        "initialPhoneNumber",
        "Ljava/lang/String;",
        "getInitialPhoneNumber",
        "()Ljava/lang/String;",
        "showOptionalLabel",
        "Z",
        "getShowOptionalLabel",
        "()Z",
        "LEu1;",
        "label",
        "LEu1;",
        "getLabel",
        "()LEu1;",
        "LGX2;",
        "_fieldValue",
        "LGX2;",
        "fieldValue",
        "getFieldValue",
        "_hasFocus",
        "Lcom/stripe/android/uicore/elements/CountryConfig;",
        "countryConfig",
        "Lcom/stripe/android/uicore/elements/CountryConfig;",
        "Lcom/stripe/android/uicore/elements/DropdownFieldController;",
        "countryDropdownController",
        "Lcom/stripe/android/uicore/elements/DropdownFieldController;",
        "getCountryDropdownController",
        "()Lcom/stripe/android/uicore/elements/DropdownFieldController;",
        "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;",
        "phoneNumberFormatter",
        "phoneNumberMinimumLength",
        "rawFieldValue",
        "getRawFieldValue",
        "isComplete",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "formFieldValue",
        "getFormFieldValue",
        "Lcom/stripe/android/uicore/elements/FieldError;",
        "error",
        "getError",
        "placeholder",
        "getPlaceholder",
        "LEu6;",
        "visualTransformation",
        "getVisualTransformation",
        "initiallySelectedCountryCode",
        "overrideCountryCodes",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Z)V",
        "Companion",
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
        "SMAP\nPhoneNumberController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneNumberController.kt\ncom/stripe/android/uicore/elements/PhoneNumberController\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,180:1\n47#2:181\n49#2:185\n47#2:186\n49#2:190\n47#2:191\n49#2:195\n50#3:182\n55#3:184\n50#3:187\n55#3:189\n50#3:192\n55#3:194\n106#4:183\n106#4:188\n106#4:193\n*S KotlinDebug\n*F\n+ 1 PhoneNumberController.kt\ncom/stripe/android/uicore/elements/PhoneNumberController\n*L\n61#1:181\n61#1:185\n92#1:186\n92#1:190\n94#1:191\n94#1:195\n61#1:182\n61#1:184\n92#1:187\n92#1:189\n94#1:192\n94#1:194\n61#1:183\n92#1:188\n94#1:193\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;


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

.field private final _hasFocus:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final countryConfig:Lcom/stripe/android/uicore/elements/CountryConfig;

.field private final countryDropdownController:Lcom/stripe/android/uicore/elements/DropdownFieldController;

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

.field private final initialPhoneNumber:Ljava/lang/String;

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

.field private final phoneNumberFormatter:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;",
            ">;"
        }
    .end annotation
.end field

.field private final phoneNumberMinimumLength:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final placeholder:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
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

.field private final visualTransformation:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "LEu6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->Companion:Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xf

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/uicore/elements/PhoneNumberController;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Z)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "initialPhoneNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "overrideCountryCodes"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->initialPhoneNumber:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->showOptionalLabel:Z

    sget p4, Lcom/stripe/android/uicore/R$string;->address_label_phone_number:I

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-static {p4}, LVu1;->G(Ljava/lang/Object;)LEu1;

    move-result-object p4

    iput-object p4, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->label:LEu1;

    invoke-static {p1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->_fieldValue:LGX2;

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->fieldValue:LEu1;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->_hasFocus:LGX2;

    new-instance p4, Lcom/stripe/android/uicore/elements/CountryConfig;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    sget-object v5, Lcom/stripe/android/uicore/elements/PhoneNumberController$countryConfig$1;->INSTANCE:Lcom/stripe/android/uicore/elements/PhoneNumberController$countryConfig$1;

    sget-object v6, Lcom/stripe/android/uicore/elements/PhoneNumberController$countryConfig$2;->INSTANCE:Lcom/stripe/android/uicore/elements/PhoneNumberController$countryConfig$2;

    const/16 v7, 0xa

    const/4 v8, 0x0

    move-object v0, p4

    move-object v1, p3

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/uicore/elements/CountryConfig;-><init>(Ljava/util/Set;Ljava/util/Locale;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p4, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->countryConfig:Lcom/stripe/android/uicore/elements/CountryConfig;

    new-instance p3, Lcom/stripe/android/uicore/elements/DropdownFieldController;

    invoke-direct {p3, p4, p2}, Lcom/stripe/android/uicore/elements/DropdownFieldController;-><init>(Lcom/stripe/android/uicore/elements/DropdownConfig;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->countryDropdownController:Lcom/stripe/android/uicore/elements/DropdownFieldController;

    sget-object p2, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->Companion:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;

    invoke-virtual {p4}, Lcom/stripe/android/uicore/elements/CountryConfig;->getCountries$stripe_ui_core_release()Ljava/util/List;

    move-result-object p4

    invoke-virtual {p3}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->getSelectedIndex()LtP5;

    move-result-object v0

    invoke-interface {v0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-interface {p4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/stripe/android/core/model/Country;

    invoke-virtual {p4}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object p4

    invoke-virtual {p4}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;->forCountry(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;

    move-result-object p2

    invoke-static {p2}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->phoneNumberFormatter:LGX2;

    invoke-virtual {p3}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->getSelectedIndex()LtP5;

    move-result-object p3

    new-instance p4, Lcom/stripe/android/uicore/elements/PhoneNumberController$special$$inlined$map$1;

    invoke-direct {p4, p3, p0}, Lcom/stripe/android/uicore/elements/PhoneNumberController$special$$inlined$map$1;-><init>(LEu1;Lcom/stripe/android/uicore/elements/PhoneNumberController;)V

    iput-object p4, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->phoneNumberMinimumLength:LEu1;

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getFieldValue()LEu1;

    move-result-object p3

    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberController$rawFieldValue$1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/uicore/elements/PhoneNumberController$rawFieldValue$1;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {p3, p2, v0}, LVu1;->n(LEu1;LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->rawFieldValue:LEu1;

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getFieldValue()LEu1;

    move-result-object p3

    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberController$isComplete$1;

    invoke-direct {v0, p0, v1}, Lcom/stripe/android/uicore/elements/PhoneNumberController$isComplete$1;-><init>(Lcom/stripe/android/uicore/elements/PhoneNumberController;Lkotlin/coroutines/Continuation;)V

    invoke-static {p3, p4, v0}, LVu1;->n(LEu1;LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->isComplete:LEu1;

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getFieldValue()LEu1;

    move-result-object p3

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->isComplete()LEu1;

    move-result-object p4

    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberController$formFieldValue$1;

    invoke-direct {v0, v1}, Lcom/stripe/android/uicore/elements/PhoneNumberController$formFieldValue$1;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {p3, p4, v0}, LVu1;->F(LEu1;LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->formFieldValue:LEu1;

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getFieldValue()LEu1;

    move-result-object p3

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->isComplete()LEu1;

    move-result-object p4

    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberController$error$1;

    invoke-direct {v0, v1}, Lcom/stripe/android/uicore/elements/PhoneNumberController$error$1;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {p3, p4, p1, v0}, LVu1;->m(LEu1;LEu1;LEu1;Lkotlin/jvm/functions/Function4;)LEu1;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->error:LEu1;

    new-instance p1, Lcom/stripe/android/uicore/elements/PhoneNumberController$special$$inlined$map$2;

    invoke-direct {p1, p2}, Lcom/stripe/android/uicore/elements/PhoneNumberController$special$$inlined$map$2;-><init>(LEu1;)V

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->placeholder:LEu1;

    new-instance p1, Lcom/stripe/android/uicore/elements/PhoneNumberController$special$$inlined$map$3;

    invoke-direct {p1, p2}, Lcom/stripe/android/uicore/elements/PhoneNumberController$special$$inlined$map$3;-><init>(LEu1;)V

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->visualTransformation:LEu1;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const-string p1, ""

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p3

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    const/4 p4, 0x0

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/uicore/elements/PhoneNumberController;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Z)V

    return-void
.end method

.method public static final synthetic access$getCountryConfig$p(Lcom/stripe/android/uicore/elements/PhoneNumberController;)Lcom/stripe/android/uicore/elements/CountryConfig;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->countryConfig:Lcom/stripe/android/uicore/elements/CountryConfig;

    return-object p0
.end method


# virtual methods
.method public ComposeUI-MxjM1cc(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;I)V
    .locals 17
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

    const v0, -0x578dbb5d

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v6, "com.stripe.android.uicore.elements.PhoneNumberController.ComposeUI (PhoneNumberController.kt:164)"

    invoke-static {v0, v9, v2, v6}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    const/4 v12, 0x0

    const/4 v13, 0x0

    and-int/lit8 v0, v9, 0xe

    or-int/lit8 v15, v0, 0x40

    const/16 v16, 0xc

    move/from16 v10, p1

    move-object/from16 v11, p0

    move-object v14, v1

    invoke-static/range {v10 .. v16}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt;->PhoneNumberElementUI-rvJmuoc(ZLcom/stripe/android/uicore/elements/PhoneNumberController;ZILEt0;II)V

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
    new-instance v11, Lcom/stripe/android/uicore/elements/PhoneNumberController$ComposeUI$1;

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

    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/uicore/elements/PhoneNumberController$ComposeUI$1;-><init>(Lcom/stripe/android/uicore/elements/PhoneNumberController;ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;III)V

    invoke-interface {v10, v11}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method

.method public final getCountryCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->phoneNumberFormatter:LGX2;

    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->getCountryCode()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getCountryDropdownController()Lcom/stripe/android/uicore/elements/DropdownFieldController;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->countryDropdownController:Lcom/stripe/android/uicore/elements/DropdownFieldController;

    return-object v0
.end method

.method public final getE164PhoneNumber(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "phoneNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->phoneNumberFormatter:LGX2;

    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;

    invoke-virtual {v0, p1}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->toE164Format(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->error:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->fieldValue:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->formFieldValue:LEu1;

    return-object v0
.end method

.method public final getInitialPhoneNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->initialPhoneNumber:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->label:LEu1;

    return-object v0
.end method

.method public final getPlaceholder()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->placeholder:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->rawFieldValue:LEu1;

    return-object v0
.end method

.method public getShowOptionalLabel()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->showOptionalLabel:Z

    return v0
.end method

.method public final getVisualTransformation()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "LEu6;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->visualTransformation:LEu1;

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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->isComplete:LEu1;

    return-object v0
.end method

.method public final onFocusChange(Z)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->_hasFocus:LGX2;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public onRawValueChange(Ljava/lang/String;)V
    .locals 1

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->onValueChange(Ljava/lang/String;)V

    return-void
.end method

.method public final onSelectedCountryIndex(I)Lkotlin/Unit;
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->countryConfig:Lcom/stripe/android/uicore/elements/CountryConfig;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/CountryConfig;->getCountries$stripe_ui_core_release()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/core/model/Country;

    invoke-virtual {v0}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->phoneNumberFormatter:LGX2;

    invoke-interface {v1}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->getCountryCode()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lcom/stripe/android/core/model/Country;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->phoneNumberFormatter:LGX2;

    sget-object v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->Companion:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;->forCountry(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;

    move-result-object p1

    invoke-interface {v0, p1}, LGX2;->setValue(Ljava/lang/Object;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_1
    return-object v1
.end method

.method public final onValueChange(Ljava/lang/String;)V
    .locals 2

    const-string v0, "displayFormatted"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->_fieldValue:LGX2;

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->phoneNumberFormatter:LGX2;

    invoke-interface {v1}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;

    invoke-virtual {v1, p1}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->userInputFilter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method
