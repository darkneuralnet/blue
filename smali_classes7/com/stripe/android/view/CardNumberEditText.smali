.class public final Lcom/stripe/android/view/CardNumberEditText;
.super Lcom/stripe/android/view/StripeEditText;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001:\u0001kBQ\u0008\u0000\u0012\u0006\u0010b\u001a\u00020a\u0012\n\u0008\u0002\u0010d\u001a\u0004\u0018\u00010c\u0012\u0008\u0008\u0002\u0010e\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010%\u001a\u00020$\u00a2\u0006\u0004\u0008f\u0010gB\'\u0008\u0017\u0012\u0006\u0010b\u001a\u00020a\u0012\n\u0008\u0002\u0010d\u001a\u0004\u0018\u00010c\u0012\u0008\u0008\u0002\u0010e\u001a\u00020\u0005\u00a2\u0006\u0004\u0008f\u0010hB9\u0008\u0012\u0012\u0006\u0010b\u001a\u00020a\u0012\u0008\u0010d\u001a\u0004\u0018\u00010c\u0012\u0006\u0010e\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u000c\u0010i\u001a\u0008\u0012\u0004\u0012\u00020]08\u00a2\u0006\u0004\u0008f\u0010jJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0014J\u0008\u0010\u0004\u001a\u00020\u0002H\u0014J\u0019\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J1\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u00052\u0008\u0008\u0002\u0010\r\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\"\u0010\u0015\u001a\u00020\u00148\u0007@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R0\u0010)\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'8\u0006@@X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008)\u0010*\u0012\u0004\u0008/\u0010\u0012\u001a\u0004\u0008+\u0010,\"\u0004\u0008-\u0010.RB\u00102\u001a\u000e\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u0002002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u0002008\u0000@@X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u00082\u00103\u001a\u0004\u00084\u00105\"\u0004\u00086\u00107R(\u00109\u001a\u0008\u0012\u0004\u0012\u00020\u0002088\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u00089\u0010:\u001a\u0004\u0008;\u0010<\"\u0004\u0008=\u0010>R$\u0010A\u001a\u00020?2\u0006\u0010@\u001a\u00020?8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008A\u0010B\u001a\u0004\u0008A\u0010CR \u0010E\u001a\u00020D8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008E\u0010F\u0012\u0004\u0008I\u0010\u0012\u001a\u0004\u0008G\u0010HR.\u0010J\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u0002008\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008J\u00103\u001a\u0004\u0008K\u00105\"\u0004\u0008L\u00107R\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008N\u0010OR\u0014\u0010R\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008P\u0010QR\u0014\u0010V\u001a\u00020S8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008T\u0010UR\u0014\u0010W\u001a\u00020?8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008W\u0010CR\u0014\u0010\r\u001a\u00020\u00058@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008X\u0010QR\u0016\u0010\\\u001a\u0004\u0018\u00010Y8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008Z\u0010[R\u0014\u0010`\u001a\u00020]8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008^\u0010_\u00a8\u0006l"
    }
    d2 = {
        "Lcom/stripe/android/view/CardNumberEditText;",
        "Lcom/stripe/android/view/StripeEditText;",
        "",
        "onAttachedToWindow",
        "onDetachedFromWindow",
        "",
        "maxLength",
        "updateLengthFilter$payments_core_release",
        "(I)V",
        "updateLengthFilter",
        "newFormattedLength",
        "start",
        "addedDigits",
        "panLength",
        "calculateCursorPosition$payments_core_release",
        "(IIII)I",
        "calculateCursorPosition",
        "onCardMetadataLoadedTooSlow$payments_core_release",
        "()V",
        "onCardMetadataLoadedTooSlow",
        "Lkotlin/coroutines/CoroutineContext;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "getWorkContext",
        "()Lkotlin/coroutines/CoroutineContext;",
        "setWorkContext",
        "(Lkotlin/coroutines/CoroutineContext;)V",
        "Lcom/stripe/android/cards/CardAccountRangeRepository;",
        "cardAccountRangeRepository",
        "Lcom/stripe/android/cards/CardAccountRangeRepository;",
        "Lcom/stripe/android/cards/StaticCardAccountRanges;",
        "staticCardAccountRanges",
        "Lcom/stripe/android/cards/StaticCardAccountRanges;",
        "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
        "analyticsRequestExecutor",
        "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
        "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
        "paymentAnalyticsRequestFactory",
        "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
        "Lcom/stripe/android/model/CardBrand;",
        "value",
        "cardBrand",
        "Lcom/stripe/android/model/CardBrand;",
        "getCardBrand",
        "()Lcom/stripe/android/model/CardBrand;",
        "setCardBrand$payments_core_release",
        "(Lcom/stripe/android/model/CardBrand;)V",
        "getCardBrand$annotations",
        "Lkotlin/Function1;",
        "callback",
        "brandChangeCallback",
        "Lkotlin/jvm/functions/Function1;",
        "getBrandChangeCallback$payments_core_release",
        "()Lkotlin/jvm/functions/Function1;",
        "setBrandChangeCallback$payments_core_release",
        "(Lkotlin/jvm/functions/Function1;)V",
        "Lkotlin/Function0;",
        "completionCallback",
        "Lkotlin/jvm/functions/Function0;",
        "getCompletionCallback$payments_core_release",
        "()Lkotlin/jvm/functions/Function0;",
        "setCompletionCallback$payments_core_release",
        "(Lkotlin/jvm/functions/Function0;)V",
        "",
        "<set-?>",
        "isCardNumberValid",
        "Z",
        "()Z",
        "Lcom/stripe/android/cards/CardAccountRangeService;",
        "accountRangeService",
        "Lcom/stripe/android/cards/CardAccountRangeService;",
        "getAccountRangeService",
        "()Lcom/stripe/android/cards/CardAccountRangeService;",
        "getAccountRangeService$annotations",
        "isLoadingCallback",
        "isLoadingCallback$payments_core_release",
        "setLoadingCallback$payments_core_release",
        "Lzh2;",
        "loadingJob",
        "Lzh2;",
        "getFormattedPanLength",
        "()I",
        "formattedPanLength",
        "Lcom/stripe/android/cards/CardNumber$Unvalidated;",
        "getUnvalidatedCardNumber",
        "()Lcom/stripe/android/cards/CardNumber$Unvalidated;",
        "unvalidatedCardNumber",
        "isValid",
        "getPanLength$payments_core_release",
        "Lcom/stripe/android/cards/CardNumber$Validated;",
        "getValidatedCardNumber$payments_core_release",
        "()Lcom/stripe/android/cards/CardNumber$Validated;",
        "validatedCardNumber",
        "",
        "getAccessibilityText",
        "()Ljava/lang/String;",
        "accessibilityText",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "defStyleAttr",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/CardAccountRangeRepository;Lcom/stripe/android/cards/StaticCardAccountRanges;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)V",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "publishableKeySupplier",
        "(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;)V",
        "CardNumberTextWatcher",
        "payments-core_release"
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
        "SMAP\nCardNumberEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardNumberEditText.kt\ncom/stripe/android/view/CardNumberEditText\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,367:1\n1774#2,4:368\n1747#2,3:372\n*S KotlinDebug\n*F\n+ 1 CardNumberEditText.kt\ncom/stripe/android/view/CardNumberEditText\n*L\n220#1:368,4\n224#1:372,3\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final accountRangeService:Lcom/stripe/android/cards/CardAccountRangeService;

.field private final analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

.field private synthetic brandChangeCallback:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/CardBrand;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final cardAccountRangeRepository:Lcom/stripe/android/cards/CardAccountRangeRepository;

.field private cardBrand:Lcom/stripe/android/model/CardBrand;

.field private synthetic completionCallback:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private isCardNumberValid:Z

.field private synthetic isLoadingCallback:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private loadingJob:Lzh2;

.field private final paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

.field private final staticCardAccountRanges:Lcom/stripe/android/cards/StaticCardAccountRanges;

.field private workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/CardNumberEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/CardNumberEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT41;->b()LSC0;

    move-result-object v5

    new-instance v6, Lcom/stripe/android/view/CardNumberEditText$1;

    invoke-direct {v6, p1}, Lcom/stripe/android/view/CardNumberEditText$1;-><init>(Landroid/content/Context;)V

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/CardNumberEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    sget p3, Lvf4;->editTextStyle:I

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/CardNumberEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/CardAccountRangeRepository;Lcom/stripe/android/cards/StaticCardAccountRanges;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardAccountRangeRepository"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "staticCardAccountRanges"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestExecutor"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentAnalyticsRequestFactory"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/StripeEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object p4, p0, Lcom/stripe/android/view/CardNumberEditText;->workContext:Lkotlin/coroutines/CoroutineContext;

    iput-object p5, p0, Lcom/stripe/android/view/CardNumberEditText;->cardAccountRangeRepository:Lcom/stripe/android/cards/CardAccountRangeRepository;

    iput-object p6, p0, Lcom/stripe/android/view/CardNumberEditText;->staticCardAccountRanges:Lcom/stripe/android/cards/StaticCardAccountRanges;

    iput-object p7, p0, Lcom/stripe/android/view/CardNumberEditText;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    iput-object p8, p0, Lcom/stripe/android/view/CardNumberEditText;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    sget-object p1, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->cardBrand:Lcom/stripe/android/model/CardBrand;

    sget-object p1, Lcom/stripe/android/view/CardNumberEditText$brandChangeCallback$1;->INSTANCE:Lcom/stripe/android/view/CardNumberEditText$brandChangeCallback$1;

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->brandChangeCallback:Lkotlin/jvm/functions/Function1;

    sget-object p1, Lcom/stripe/android/view/CardNumberEditText$completionCallback$1;->INSTANCE:Lcom/stripe/android/view/CardNumberEditText$completionCallback$1;

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->completionCallback:Lkotlin/jvm/functions/Function0;

    new-instance p1, Lcom/stripe/android/cards/CardAccountRangeService;

    iget-object p2, p0, Lcom/stripe/android/view/CardNumberEditText;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance p3, Lcom/stripe/android/view/CardNumberEditText$accountRangeService$1;

    invoke-direct {p3, p0}, Lcom/stripe/android/view/CardNumberEditText$accountRangeService$1;-><init>(Lcom/stripe/android/view/CardNumberEditText;)V

    invoke-direct {p1, p5, p2, p6, p3}, Lcom/stripe/android/cards/CardAccountRangeService;-><init>(Lcom/stripe/android/cards/CardAccountRangeRepository;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/StaticCardAccountRanges;Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;)V

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->accountRangeService:Lcom/stripe/android/cards/CardAccountRangeService;

    sget-object p1, Lcom/stripe/android/view/CardNumberEditText$isLoadingCallback$1;->INSTANCE:Lcom/stripe/android/view/CardNumberEditText$isLoadingCallback$1;

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->isLoadingCallback:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->setNumberOnlyInputType()V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lcom/stripe/android/R$string;->invalid_card_number:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessage(Ljava/lang/String;)V

    new-instance p1, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;

    invoke-direct {p1, p0}, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;-><init>(Lcom/stripe/android/view/CardNumberEditText;)V

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getInternalFocusChangeListeners()Ljava/util/List;

    move-result-object p1

    new-instance p2, LVf0;

    invoke-direct {p2, p0}, LVf0;-><init>(Lcom/stripe/android/view/CardNumberEditText;)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1a

    if-lt p1, p2, :cond_0

    const-string p1, "creditCardNumber"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setAutofillHints([Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x1

    const/4 p2, 0x0

    const/4 p3, 0x0

    invoke-static {p0, p3, p1, p2}, Lcom/stripe/android/view/CardNumberEditText;->updateLengthFilter$payments_core_release$default(Lcom/stripe/android/view/CardNumberEditText;IILjava/lang/Object;)V

    invoke-virtual {p0, p3}, Landroid/view/View;->setLayoutDirection(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/CardAccountRangeRepository;Lcom/stripe/android/cards/StaticCardAccountRanges;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    and-int/lit8 v0, p9, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, p2

    :goto_0
    and-int/lit8 v0, p9, 0x4

    if-eqz v0, :cond_1

    sget v0, Lvf4;->editTextStyle:I

    move v4, v0

    goto :goto_1

    :cond_1
    move v4, p3

    :goto_1
    and-int/lit8 v0, p9, 0x20

    if-eqz v0, :cond_2

    new-instance v0, Lcom/stripe/android/cards/DefaultStaticCardAccountRanges;

    invoke-direct {v0}, Lcom/stripe/android/cards/DefaultStaticCardAccountRanges;-><init>()V

    move-object v7, v0

    goto :goto_2

    :cond_2
    move-object/from16 v7, p6

    :goto_2
    move-object v1, p0

    move-object v2, p1

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/view/CardNumberEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/CardAccountRangeRepository;Lcom/stripe/android/cards/StaticCardAccountRanges;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/util/AttributeSet;",
            "I",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;

    invoke-direct {v0, p1}, Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;->create()Lcom/stripe/android/cards/CardAccountRangeRepository;

    move-result-object v6

    new-instance v7, Lcom/stripe/android/cards/DefaultStaticCardAccountRanges;

    invoke-direct {v7}, Lcom/stripe/android/cards/DefaultStaticCardAccountRanges;-><init>()V

    new-instance v8, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;

    invoke-direct {v8}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;-><init>()V

    new-instance v9, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    new-instance v0, LUf0;

    invoke-direct {v0, p5}, LUf0;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-direct {v9, p1, v0}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;-><init>(Landroid/content/Context;LY94;)V

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/view/CardNumberEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/CardAccountRangeRepository;Lcom/stripe/android/cards/StaticCardAccountRanges;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lkotlin/jvm/functions/Function0;)Ljava/lang/String;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final _init_$lambda$1(Lcom/stripe/android/view/CardNumberEditText;Landroid/view/View;Z)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/view/CardNumberEditText;->getUnvalidatedCardNumber()Lcom/stripe/android/cards/CardNumber$Unvalidated;

    move-result-object p1

    invoke-virtual {p0}, Lcom/stripe/android/view/CardNumberEditText;->getPanLength$payments_core_release()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->isPartialEntry(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    :cond_0
    return-void
.end method

.method public static final synthetic access$getCardAccountRangeRepository$p(Lcom/stripe/android/view/CardNumberEditText;)Lcom/stripe/android/cards/CardAccountRangeRepository;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/view/CardNumberEditText;->cardAccountRangeRepository:Lcom/stripe/android/cards/CardAccountRangeRepository;

    return-object p0
.end method

.method public static final synthetic access$getUnvalidatedCardNumber(Lcom/stripe/android/view/CardNumberEditText;)Lcom/stripe/android/cards/CardNumber$Unvalidated;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/CardNumberEditText;->getUnvalidatedCardNumber()Lcom/stripe/android/cards/CardNumber$Unvalidated;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$isValid(Lcom/stripe/android/view/CardNumberEditText;)Z
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/CardNumberEditText;->isValid()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$setCardNumberValid$p(Lcom/stripe/android/view/CardNumberEditText;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/stripe/android/view/CardNumberEditText;->isCardNumberValid:Z

    return-void
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function0;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/view/CardNumberEditText;->_init_$lambda$0(Lkotlin/jvm/functions/Function0;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic calculateCursorPosition$payments_core_release$default(Lcom/stripe/android/view/CardNumberEditText;IIIIILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/view/CardNumberEditText;->getPanLength$payments_core_release()I

    move-result p4

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/view/CardNumberEditText;->calculateCursorPosition$payments_core_release(IIII)I

    move-result p0

    return p0
.end method

.method public static synthetic d(Lcom/stripe/android/view/CardNumberEditText;Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/CardNumberEditText;->_init_$lambda$1(Lcom/stripe/android/view/CardNumberEditText;Landroid/view/View;Z)V

    return-void
.end method

.method public static synthetic getAccountRangeService$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getCardBrand$annotations()V
    .locals 0

    return-void
.end method

.method private final getFormattedPanLength()I
    .locals 3

    invoke-virtual {p0}, Lcom/stripe/android/view/CardNumberEditText;->getPanLength$payments_core_release()I

    move-result v0

    sget-object v1, Lcom/stripe/android/cards/CardNumber;->Companion:Lcom/stripe/android/cards/CardNumber$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardNumberEditText;->getPanLength$payments_core_release()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/stripe/android/cards/CardNumber$Companion;->getSpacePositions(I)Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method private final getUnvalidatedCardNumber()Lcom/stripe/android/cards/CardNumber$Unvalidated;
    .locals 2

    new-instance v0, Lcom/stripe/android/cards/CardNumber$Unvalidated;

    invoke-virtual {p0}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private final isValid()Z
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/view/CardNumberEditText;->getValidatedCardNumber$payments_core_release()Lcom/stripe/android/cards/CardNumber$Validated;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static synthetic updateLengthFilter$payments_core_release$default(Lcom/stripe/android/view/CardNumberEditText;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/view/CardNumberEditText;->getFormattedPanLength()I

    move-result p1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CardNumberEditText;->updateLengthFilter$payments_core_release(I)V

    return-void
.end method


# virtual methods
.method public final synthetic calculateCursorPosition$payments_core_release(IIII)I
    .locals 7

    sget-object v0, Lcom/stripe/android/cards/CardNumber;->Companion:Lcom/stripe/android/cards/CardNumber$Companion;

    invoke-virtual {v0, p4}, Lcom/stripe/android/cards/CardNumber$Companion;->getSpacePositions(I)Ljava/util/Set;

    move-result-object p4

    instance-of v0, p4, Ljava/util/Collection;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-interface {p4}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    move v4, v2

    goto :goto_2

    :cond_0
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v4, v2

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    if-gt p2, v5, :cond_2

    add-int v6, p2, p3

    if-lt v6, v5, :cond_2

    move v5, v1

    goto :goto_1

    :cond_2
    move v5, v2

    :goto_1
    if-eqz v5, :cond_1

    add-int/lit8 v4, v4, 0x1

    if-gez v4, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    goto :goto_0

    :cond_3
    :goto_2
    if-eqz v0, :cond_5

    invoke-interface {p4}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    move v1, v2

    goto :goto_4

    :cond_5
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :cond_6
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-nez p3, :cond_7

    add-int/2addr v0, v1

    if-ne p2, v0, :cond_7

    move v0, v1

    goto :goto_3

    :cond_7
    move v0, v2

    :goto_3
    if-eqz v0, :cond_6

    :goto_4
    add-int/2addr p2, p3

    add-int/2addr p2, v4

    if-eqz v1, :cond_8

    if-lez p2, :cond_8

    add-int/lit8 p2, p2, -0x1

    :cond_8
    if-gt p2, p1, :cond_9

    move p1, p2

    :cond_9
    return p1
.end method

.method public getAccessibilityText()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/stripe/android/R$string;->acc_label_card_number_node:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "resources.getString(R.st\u2026l_card_number_node, text)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getAccountRangeService()Lcom/stripe/android/cards/CardAccountRangeService;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->accountRangeService:Lcom/stripe/android/cards/CardAccountRangeService;

    return-object v0
.end method

.method public final getBrandChangeCallback$payments_core_release()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/model/CardBrand;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->brandChangeCallback:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getCardBrand()Lcom/stripe/android/model/CardBrand;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->cardBrand:Lcom/stripe/android/model/CardBrand;

    return-object v0
.end method

.method public final getCompletionCallback$payments_core_release()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->completionCallback:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final getPanLength$payments_core_release()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->accountRangeService:Lcom/stripe/android/cards/CardAccountRangeService;

    invoke-virtual {v0}, Lcom/stripe/android/cards/CardAccountRangeService;->getAccountRange()Lcom/stripe/android/model/AccountRange;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/model/AccountRange;->getPanLength()I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->accountRangeService:Lcom/stripe/android/cards/CardAccountRangeService;

    invoke-virtual {v0}, Lcom/stripe/android/cards/CardAccountRangeService;->getStaticCardAccountRanges()Lcom/stripe/android/cards/StaticCardAccountRanges;

    move-result-object v0

    invoke-direct {p0}, Lcom/stripe/android/view/CardNumberEditText;->getUnvalidatedCardNumber()Lcom/stripe/android/cards/CardNumber$Unvalidated;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/stripe/android/cards/StaticCardAccountRanges;->first(Lcom/stripe/android/cards/CardNumber$Unvalidated;)Lcom/stripe/android/model/AccountRange;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/model/AccountRange;->getPanLength()I

    move-result v0

    goto :goto_0

    :cond_1
    const/16 v0, 0x10

    :goto_0
    return v0
.end method

.method public final getValidatedCardNumber$payments_core_release()Lcom/stripe/android/cards/CardNumber$Validated;
    .locals 2

    invoke-direct {p0}, Lcom/stripe/android/view/CardNumberEditText;->getUnvalidatedCardNumber()Lcom/stripe/android/cards/CardNumber$Unvalidated;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/view/CardNumberEditText;->getPanLength$payments_core_release()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->validate(I)Lcom/stripe/android/cards/CardNumber$Validated;

    move-result-object v0

    return-object v0
.end method

.method public final getWorkContext()Lkotlin/coroutines/CoroutineContext;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->workContext:Lkotlin/coroutines/CoroutineContext;

    return-object v0
.end method

.method public final isCardNumberValid()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/view/CardNumberEditText;->isCardNumberValid:Z

    return v0
.end method

.method public final isLoadingCallback$payments_core_release()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->isLoadingCallback:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public onAttachedToWindow()V
    .locals 7

    invoke-super {p0}, Lcom/google/android/material/textfield/TextInputEditText;->onAttachedToWindow()V

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->workContext:Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0}, LaD0;->a(Lkotlin/coroutines/CoroutineContext;)LZC0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/view/CardNumberEditText$onAttachedToWindow$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Lcom/stripe/android/view/CardNumberEditText$onAttachedToWindow$1;-><init>(Lcom/stripe/android/view/CardNumberEditText;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->loadingJob:Lzh2;

    return-void
.end method

.method public final synthetic onCardMetadataLoadedTooSlow$payments_core_release()V
    .locals 9

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    iget-object v1, p0, Lcom/stripe/android/view/CardNumberEditText;->paymentAnalyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CardMetadataLoadedTooSlow:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x1e

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;->executeAsync(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->loadingJob:Lzh2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lzh2$a;->a(Lzh2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    iput-object v1, p0, Lcom/stripe/android/view/CardNumberEditText;->loadingJob:Lzh2;

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->accountRangeService:Lcom/stripe/android/cards/CardAccountRangeService;

    invoke-virtual {v0}, Lcom/stripe/android/cards/CardAccountRangeService;->cancelAccountRangeRepositoryJob()V

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    return-void
.end method

.method public final setBrandChangeCallback$payments_core_release(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/CardBrand;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->brandChangeCallback:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->cardBrand:Lcom/stripe/android/model/CardBrand;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final setCardBrand$payments_core_release(Lcom/stripe/android/model/CardBrand;)V
    .locals 2

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->cardBrand:Lcom/stripe/android/model/CardBrand;

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->cardBrand:Lcom/stripe/android/model/CardBrand;

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->brandChangeCallback:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v1, p1, v0}, Lcom/stripe/android/view/CardNumberEditText;->updateLengthFilter$payments_core_release$default(Lcom/stripe/android/view/CardNumberEditText;IILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final setCompletionCallback$payments_core_release(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->completionCallback:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public final setLoadingCallback$payments_core_release(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->isLoadingCallback:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setWorkContext(Lkotlin/coroutines/CoroutineContext;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->workContext:Lkotlin/coroutines/CoroutineContext;

    return-void
.end method

.method public final synthetic updateLengthFilter$payments_core_release(I)V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [Landroid/text/InputFilter;

    new-instance v1, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {v1, p1}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 p1, 0x0

    aput-object v1, v0, p1

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method
