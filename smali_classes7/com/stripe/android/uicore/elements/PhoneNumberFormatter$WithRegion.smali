.class public final Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;
.super Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "WithRegion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u000c\u001a\u0004\u0008\u0010\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u000c\u001a\u0004\u0008\u0012\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;",
        "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;",
        "",
        "input",
        "userInputFilter",
        "toE164Format",
        "filteredInput",
        "formatNumberNational",
        "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;",
        "metadata",
        "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;",
        "prefix",
        "Ljava/lang/String;",
        "getPrefix",
        "()Ljava/lang/String;",
        "placeholder",
        "getPlaceholder",
        "countryCode",
        "getCountryCode",
        "",
        "maxSubscriberDigits",
        "I",
        "LEu6;",
        "visualTransformation",
        "LEu6;",
        "getVisualTransformation",
        "()LEu6;",
        "<init>",
        "(Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;)V",
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
        "SMAP\nPhoneNumberFormatter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneNumberFormatter.kt\ncom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,489:1\n429#2:490\n502#2,5:491\n1174#2,2:496\n*S KotlinDebug\n*F\n+ 1 PhoneNumberFormatter.kt\ncom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion\n*L\n63#1:490\n63#1:491,5\n130#1:496,2\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final countryCode:Ljava/lang/String;

.field private final maxSubscriberDigits:I

.field private final metadata:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

.field private final placeholder:Ljava/lang/String;

.field private final prefix:Ljava/lang/String;

.field private final visualTransformation:LEu6;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;)V
    .locals 7

    const-string v0, "metadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->metadata:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;->getPrefix()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->prefix:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;->getPattern()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x23

    const/16 v3, 0x35

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->placeholder:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;->getRegionCode()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->countryCode:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->getPrefix()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    rsub-int/lit8 p1, p1, 0xf

    iput p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->maxSubscriberDigits:I

    new-instance p1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion$visualTransformation$1;

    invoke-direct {p1, p0}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion$visualTransformation$1;-><init>(Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;)V

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->visualTransformation:LEu6;

    return-void
.end method

.method public static final synthetic access$getMetadata$p(Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;)Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->metadata:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    return-object p0
.end method


# virtual methods
.method public final formatNumberNational(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    const-string v0, "filteredInput"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->metadata:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;->getPattern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-ge v2, v4, :cond_2

    invoke-interface {v1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v3, v5, :cond_1

    const/16 v5, 0x23

    if-ne v4, v5, :cond_0

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    add-int/lit8 v3, v3, 0x1

    :cond_0
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v3, v1, :cond_3

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "this as java.lang.String).substring(startIndex)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    const-string v1, "this as java.lang.String).toCharArray()"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append([C)Ljava/lang/StringBuilder;

    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "formatted.toString()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getCountryCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->countryCode:Ljava/lang/String;

    return-object v0
.end method

.method public getPlaceholder()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->placeholder:Ljava/lang/String;

    return-object v0
.end method

.method public getPrefix()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->prefix:Ljava/lang/String;

    return-object v0
.end method

.method public getVisualTransformation()LEu6;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->visualTransformation:LEu6;

    return-object v0
.end method

.method public toE164Format(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->getPrefix()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->userInputFilter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public userInputFilter(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-interface {p1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    sget-object v5, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->Companion:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;

    invoke-virtual {v5}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;->getVALID_INPUT_RANGE()Lkotlin/ranges/CharRange;

    move-result-object v5

    invoke-virtual {v5, v4}, Lkotlin/ranges/CharRange;->contains(C)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v0, v4}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "filterTo(StringBuilder(), predicate).toString()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    iget v1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->maxSubscriberDigits:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const-string v0, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
