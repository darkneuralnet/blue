.class public final Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryInputValidator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0000\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\nJ\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000c\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\rJ\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000c\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\rJ\u000c\u0010\u000f\u001a\u00020\u0010*\u00020\u0008H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryInputValidator;",
        "",
        "()V",
        "ACCOUNT_NUMBER_MAX_LENGTH",
        "",
        "ROUTING_NUMBER_LENGTH",
        "getAccountConfirmIdOrNull",
        "accountInput",
        "",
        "accountConfirmInput",
        "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;",
        "getAccountErrorIdOrNull",
        "input",
        "(Ljava/lang/String;)Ljava/lang/Integer;",
        "getRoutingErrorIdOrNull",
        "isUSRoutingNumber",
        "",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nManualEntryInputValidator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManualEntryInputValidator.kt\ncom/stripe/android/financialconnections/features/manualentry/ManualEntryInputValidator\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,51:1\n1128#2,4:52\n*S KotlinDebug\n*F\n+ 1 ManualEntryInputValidator.kt\ncom/stripe/android/financialconnections/features/manualentry/ManualEntryInputValidator\n*L\n39#1:52,4\n*E\n"
    }
.end annotation


# static fields
.field private static final ACCOUNT_NUMBER_MAX_LENGTH:I = 0x11

.field public static final INSTANCE:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryInputValidator;

.field private static final ROUTING_NUMBER_LENGTH:I = 0x9


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryInputValidator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryInputValidator;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryInputValidator;->INSTANCE:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryInputValidator;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final isUSRoutingNumber(Ljava/lang/String;)Z
    .locals 8

    sget-object v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryInputValidator$isUSRoutingNumber$usRoutingFactor$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryInputValidator$isUSRoutingNumber$usRoutingFactor$1;

    new-instance v1, Lkotlin/text/Regex;

    const-string v2, "^\\d{9}$"

    invoke-direct {v1, v2}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move v1, v2

    move v3, v1

    move v4, v3

    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    const/16 v6, 0xa

    if-ge v1, v5, :cond_0

    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    add-int/lit8 v7, v4, 0x1

    invoke-static {v5, v6}, Lkotlin/text/CharsKt;->digitToInt(CI)I

    move-result v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    mul-int/2addr v5, v4

    add-int/2addr v3, v5

    add-int/lit8 v1, v1, 0x1

    move v4, v7

    goto :goto_0

    :cond_0
    rem-int/2addr v3, v6

    if-nez v3, :cond_1

    const/4 v2, 0x1

    :cond_1
    return v2
.end method


# virtual methods
.method public final getAccountConfirmIdOrNull(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "accountInput"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accountConfirmInput"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryInputValidator;->getAccountErrorIdOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    sget p1, Lcom/stripe/android/financialconnections/R$string;->stripe_validation_account_confirm_mismatch:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final getAccountErrorIdOrNull(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    sget p1, Lcom/stripe/android/financialconnections/R$string;->stripe_validation_account_required:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/16 v0, 0x11

    if-le p1, v0, :cond_2

    sget p1, Lcom/stripe/android/financialconnections/R$string;->stripe_validation_account_too_long:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    return-object p1
.end method

.method public final getRoutingErrorIdOrNull(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 2

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    sget p1, Lcom/stripe/android/financialconnections/R$string;->stripe_validation_routing_required:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_2

    sget p1, Lcom/stripe/android/financialconnections/R$string;->stripe_validation_routing_too_short:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    :cond_2
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryInputValidator;->isUSRoutingNumber(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_3

    sget p1, Lcom/stripe/android/financialconnections/R$string;->stripe_validation_no_us_routing:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    return-object p1
.end method
