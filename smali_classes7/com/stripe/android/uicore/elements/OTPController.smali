.class public final Lcom/stripe/android/uicore/elements/OTPController;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/uicore/elements/Controller;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/elements/OTPController$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0011\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR#\u0010\u000e\u001a\u00020\r8\u0000X\u0080\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\n\u001a\u0004\u0008\u000f\u0010\u000cR&\u0010\u0012\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00110\u00108\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001d\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/OTPController;",
        "Lcom/stripe/android/uicore/elements/Controller;",
        "",
        "userTyped",
        "filter",
        "",
        "index",
        "text",
        "onValueChanged",
        "otpLength",
        "I",
        "getOtpLength",
        "()I",
        "Lcl2;",
        "keyboardType",
        "getKeyboardType-PjHm6EE$stripe_ui_core_release",
        "",
        "LGX2;",
        "fieldValues",
        "Ljava/util/List;",
        "getFieldValues$stripe_ui_core_release",
        "()Ljava/util/List;",
        "LEu1;",
        "fieldValue",
        "LEu1;",
        "getFieldValue",
        "()LEu1;",
        "<init>",
        "(I)V",
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
        "SMAP\nOTPController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OTPController.kt\ncom/stripe/android/uicore/elements/OTPController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,60:1\n1549#2:61\n1620#2,3:62\n1855#2,2:72\n287#3:65\n288#3:70\n37#4:66\n36#4,3:67\n106#5:71\n429#6:74\n502#6,5:75\n*S KotlinDebug\n*F\n+ 1 OTPController.kt\ncom/stripe/android/uicore/elements/OTPController\n*L\n14#1:61\n14#1:62,3\n47#1:72,2\n18#1:65\n18#1:70\n18#1:66\n18#1:67,3\n18#1:71\n54#1:74\n54#1:75,5\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I

.field private static final Companion:Lcom/stripe/android/uicore/elements/OTPController$Companion;

.field private static final VALID_INPUT_RANGES:Lkotlin/ranges/CharRange;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final fieldValue:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final fieldValues:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LGX2<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final keyboardType:I

.field private final otpLength:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/uicore/elements/OTPController$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/uicore/elements/OTPController$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/elements/OTPController;->Companion:Lcom/stripe/android/uicore/elements/OTPController$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/uicore/elements/OTPController;->$stable:I

    new-instance v0, Lkotlin/ranges/CharRange;

    const/16 v1, 0x30

    const/16 v2, 0x39

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/CharRange;-><init>(CC)V

    sput-object v0, Lcom/stripe/android/uicore/elements/OTPController;->VALID_INPUT_RANGES:Lkotlin/ranges/CharRange;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lcom/stripe/android/uicore/elements/OTPController;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/stripe/android/uicore/elements/OTPController;->otpLength:I

    sget-object v0, Lcl2;->b:Lcl2$a;

    invoke-virtual {v0}, Lcl2$a;->e()I

    move-result v0

    iput v0, p0, Lcom/stripe/android/uicore/elements/OTPController;->keyboardType:I

    const/4 v0, 0x0

    invoke-static {v0, p1}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object p1

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, p1

    check-cast v2, Lkotlin/collections/IntIterator;

    invoke-virtual {v2}, Lkotlin/collections/IntIterator;->nextInt()I

    const-string v2, ""

    invoke-static {v2}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iput-object v1, p0, Lcom/stripe/android/uicore/elements/OTPController;->fieldValues:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    new-array v0, v0, [LEu1;

    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    check-cast p1, [LEu1;

    new-instance v0, Lcom/stripe/android/uicore/elements/OTPController$special$$inlined$combine$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/uicore/elements/OTPController$special$$inlined$combine$1;-><init>([LEu1;)V

    invoke-static {v0}, LVu1;->p(LEu1;)LEu1;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/OTPController;->fieldValue:LEu1;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x6

    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/uicore/elements/OTPController;-><init>(I)V

    return-void
.end method

.method public static final synthetic access$getVALID_INPUT_RANGES$cp()Lkotlin/ranges/CharRange;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/OTPController;->VALID_INPUT_RANGES:Lkotlin/ranges/CharRange;

    return-object v0
.end method

.method private final filter(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    sget-object v4, Lcom/stripe/android/uicore/elements/OTPController;->VALID_INPUT_RANGES:Lkotlin/ranges/CharRange;

    invoke-virtual {v4, v3}, Lkotlin/ranges/CharRange;->contains(C)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0, v3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "filterTo(StringBuilder(), predicate).toString()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public final getFieldValue()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/OTPController;->fieldValue:LEu1;

    return-object v0
.end method

.method public final getFieldValues$stripe_ui_core_release()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LGX2<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/OTPController;->fieldValues:Ljava/util/List;

    return-object v0
.end method

.method public final getKeyboardType-PjHm6EE$stripe_ui_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/elements/OTPController;->keyboardType:I

    return v0
.end method

.method public final getOtpLength()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/elements/OTPController;->otpLength:I

    return v0
.end method

.method public final onValueChanged(ILjava/lang/String;)I
    .locals 5

    const-string v0, "text"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/OTPController;->fieldValues:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LGX2;

    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    if-eqz v0, :cond_2

    iget-object p2, p0, Lcom/stripe/android/uicore/elements/OTPController;->fieldValues:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LGX2;

    const-string p2, ""

    invoke-interface {p1, p2}, LGX2;->setValue(Ljava/lang/Object;)V

    return v1

    :cond_2
    invoke-direct {p0, p2}, Lcom/stripe/android/uicore/elements/OTPController;->filter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    iget v2, p0, Lcom/stripe/android/uicore/elements/OTPController;->otpLength:I

    if-ne v0, v2, :cond_3

    move p1, v1

    :cond_3
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v1, v0}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    move-object v2, v1

    check-cast v2, Lkotlin/collections/IntIterator;

    invoke-virtual {v2}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v2

    iget-object v3, p0, Lcom/stripe/android/uicore/elements/OTPController;->fieldValues:Ljava/util/List;

    add-int v4, p1, v2

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LGX2;

    invoke-virtual {p2, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, LGX2;->setValue(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    return v0
.end method
