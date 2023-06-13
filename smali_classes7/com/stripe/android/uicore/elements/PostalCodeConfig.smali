.class public final Lcom/stripe/android/uicore/elements/PostalCodeConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/uicore/elements/TextFieldConfig;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001:\u00010BB\u0012\u0008\u0008\u0001\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0015\u0012\u0010\u0008\u0002\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008.\u0010/J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u001a\u0010\r\u001a\u00020\u000c8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R#\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u000e\u001a\u0004\u0008\u0013\u0010\u0014R#\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u000e\u001a\u0004\u0008\u0017\u0010\u0014R\"\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u001a\u0010#\u001a\u00020\u00028\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u001f\u001a\u0004\u0008$\u0010%R\u001a\u0010\'\u001a\u00020&8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*R \u0010,\u001a\u0008\u0012\u0004\u0012\u00020+0\u00188\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008,\u0010\u001b\u001a\u0004\u0008-\u0010\u001d\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u00061"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/PostalCodeConfig;",
        "Lcom/stripe/android/uicore/elements/TextFieldConfig;",
        "",
        "input",
        "Lcom/stripe/android/uicore/elements/TextFieldState;",
        "determineState",
        "userTyped",
        "filter",
        "displayName",
        "convertToRaw",
        "rawValue",
        "convertFromRaw",
        "",
        "label",
        "I",
        "getLabel",
        "()Ljava/lang/Integer;",
        "Lal2;",
        "capitalization",
        "getCapitalization-IUNYP9k",
        "()I",
        "Lcl2;",
        "keyboard",
        "getKeyboard-PjHm6EE",
        "LGX2;",
        "Lcom/stripe/android/uicore/elements/TextFieldIcon;",
        "trailingIcon",
        "LGX2;",
        "getTrailingIcon",
        "()LGX2;",
        "country",
        "Ljava/lang/String;",
        "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;",
        "format",
        "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;",
        "debugLabel",
        "getDebugLabel",
        "()Ljava/lang/String;",
        "LEu6;",
        "visualTransformation",
        "LEu6;",
        "getVisualTransformation",
        "()LEu6;",
        "",
        "loading",
        "getLoading",
        "<init>",
        "(IIILGX2;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "CountryPostalFormat",
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
        "SMAP\nPostalCodeConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostalCodeConfig.kt\ncom/stripe/android/uicore/elements/PostalCodeConfig\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,110:1\n429#2:111\n502#2,5:112\n*S KotlinDebug\n*F\n+ 1 PostalCodeConfig.kt\ncom/stripe/android/uicore/elements/PostalCodeConfig\n*L\n61#1:111\n61#1:112,5\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final capitalization:I

.field private final country:Ljava/lang/String;

.field private final debugLabel:Ljava/lang/String;

.field private final format:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;

.field private final keyboard:I

.field private final label:I

.field private final loading:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final trailingIcon:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon;",
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

.method private constructor <init>(IIILGX2;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "LGX2<",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->label:I

    iput p2, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->capitalization:I

    iput p3, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->keyboard:I

    iput-object p4, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->trailingIcon:LGX2;

    iput-object p5, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->country:Ljava/lang/String;

    sget-object p1, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;->Companion:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$Companion;

    invoke-virtual {p1, p5}, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$Companion;->forCountry(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->format:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;

    const-string p2, "postal_code_text"

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->debugLabel:Ljava/lang/String;

    new-instance p2, Lcom/stripe/android/uicore/elements/PostalCodeVisualTransformation;

    invoke-direct {p2, p1}, Lcom/stripe/android/uicore/elements/PostalCodeVisualTransformation;-><init>(Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;)V

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->visualTransformation:LEu6;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->loading:LGX2;

    return-void
.end method

.method public synthetic constructor <init>(IIILGX2;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    sget-object p2, Lal2;->a:Lal2$a;

    invoke-virtual {p2}, Lal2$a;->d()I

    move-result p2

    :cond_0
    move v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    sget-object p2, Lcl2;->b:Lcl2$a;

    invoke-virtual {p2}, Lcl2$a;->h()I

    move-result p3

    :cond_1
    move v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    const/4 p2, 0x0

    invoke-static {p2}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p4

    :cond_2
    move-object v4, p4

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/uicore/elements/PostalCodeConfig;-><init>(IIILGX2;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(IIILGX2;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/stripe/android/uicore/elements/PostalCodeConfig;-><init>(IIILGX2;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$getCountry$p(Lcom/stripe/android/uicore/elements/PostalCodeConfig;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->country:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getFormat$p(Lcom/stripe/android/uicore/elements/PostalCodeConfig;)Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->format:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;

    return-object p0
.end method


# virtual methods
.method public convertFromRaw(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "\\s+"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    const-string v1, ""

    invoke-virtual {v0, p1, v1}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public convertToRaw(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "displayName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public determineState(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;
    .locals 1

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/uicore/elements/PostalCodeConfig$determineState$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/uicore/elements/PostalCodeConfig$determineState$1;-><init>(Lcom/stripe/android/uicore/elements/PostalCodeConfig;Ljava/lang/String;)V

    return-object v0
.end method

.method public filter(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    const-string v0, "userTyped"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    new-array v0, v0, [Lcl2;

    sget-object v1, Lcl2;->b:Lcl2$a;

    invoke-virtual {v1}, Lcl2$a;->d()I

    move-result v2

    invoke-static {v2}, Lcl2;->j(I)Lcl2;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v0, v3

    invoke-virtual {v1}, Lcl2$a;->e()I

    move-result v1

    invoke-static {v1}, Lcl2;->j(I)Lcl2;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->getKeyboard-PjHm6EE()I

    move-result v1

    invoke-static {v1}, Lcl2;->j(I)Lcl2;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    move v2, v3

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ljava/lang/Character;->isDigit(C)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v0, v4}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "filterTo(StringBuilder(), predicate).toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    move-object v0, p1

    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->format:Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;->getMaximumLength()I

    move-result v1

    sub-int/2addr p1, v1

    invoke-static {v3, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {v0, p1}, Lkotlin/text/StringsKt;->dropLast(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getCapitalization-IUNYP9k()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->capitalization:I

    return v0
.end method

.method public getDebugLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->debugLabel:Ljava/lang/String;

    return-object v0
.end method

.method public getKeyboard-PjHm6EE()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->keyboard:I

    return v0
.end method

.method public getLabel()Ljava/lang/Integer;
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->label:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getLoading()LGX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LGX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->loading:LGX2;

    return-object v0
.end method

.method public bridge synthetic getLoading()LtP5;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->getLoading()LGX2;

    move-result-object v0

    return-object v0
.end method

.method public getPlaceHolder()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/TextFieldConfig$DefaultImpls;->getPlaceHolder(Lcom/stripe/android/uicore/elements/TextFieldConfig;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTrailingIcon()LGX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LGX2<",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->trailingIcon:LGX2;

    return-object v0
.end method

.method public bridge synthetic getTrailingIcon()LtP5;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->getTrailingIcon()LGX2;

    move-result-object v0

    return-object v0
.end method

.method public getVisualTransformation()LEu6;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;->visualTransformation:LEu6;

    return-object v0
.end method
