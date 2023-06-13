.class public final Lcom/stripe/android/model/LuxeNextActionRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;,
        Lcom/stripe/android/model/LuxeNextActionRepository$Result;,
        Lcom/stripe/android/model/LuxeNextActionRepository$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 !2\u00020\u0001:\u0003!\"#B\u0005\u00a2\u0006\u0002\u0010\u0002J/\u0010\u0007\u001a\u00020\u00082\u000e\u0010\t\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0000\u00a2\u0006\u0002\u0008\u000fJ$\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\u0010\t\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u0002J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00192\n\u0010\u001a\u001a\u00060\u0005j\u0002`\nH\u0001\u00a2\u0006\u0002\u0008\u001bJ!\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u001fH\u0000\u00a2\u0006\u0002\u0008 R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"
    }
    d2 = {
        "Lcom/stripe/android/model/LuxeNextActionRepository;",
        "",
        "()V",
        "codeToNextActionSpec",
        "",
        "",
        "Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;",
        "getAction",
        "Lcom/stripe/android/model/LuxeNextActionRepository$Result;",
        "lpmCode",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "status",
        "Lcom/stripe/android/model/StripeIntent$Status;",
        "stripeIntentJson",
        "Lorg/json/JSONObject;",
        "getAction$payments_core_release",
        "getActionCreator",
        "Lcom/stripe/android/model/LuxeActionCreatorForStatus;",
        "getPostAuthorizeIntentOutcome",
        "",
        "stripeIntent",
        "Lcom/stripe/android/model/StripeIntent;",
        "getPostAuthorizeIntentOutcome$payments_core_release",
        "(Lcom/stripe/android/model/StripeIntent;)Ljava/lang/Integer;",
        "isPresent",
        "",
        "code",
        "isPresent$payments_core_release",
        "update",
        "",
        "additionalData",
        "",
        "update$payments_core_release",
        "Companion",
        "LuxeAction",
        "Result",
        "payments-core_release"
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
        "SMAP\nLuxeNextActionRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LuxeNextActionRepository.kt\ncom/stripe/android/model/LuxeNextActionRepository\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/model/LuxeNextActionRepository$Companion;

.field private static final Instance:Lcom/stripe/android/model/LuxeNextActionRepository;


# instance fields
.field private final codeToNextActionSpec:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/model/LuxeNextActionRepository$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/model/LuxeNextActionRepository$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/model/LuxeNextActionRepository;->Companion:Lcom/stripe/android/model/LuxeNextActionRepository$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/model/LuxeNextActionRepository;->$stable:I

    new-instance v0, Lcom/stripe/android/model/LuxeNextActionRepository;

    invoke-direct {v0}, Lcom/stripe/android/model/LuxeNextActionRepository;-><init>()V

    sput-object v0, Lcom/stripe/android/model/LuxeNextActionRepository;->Instance:Lcom/stripe/android/model/LuxeNextActionRepository;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/stripe/android/model/LuxeNextActionRepository;->codeToNextActionSpec:Ljava/util/Map;

    return-void
.end method

.method public static final synthetic access$getInstance$cp()Lcom/stripe/android/model/LuxeNextActionRepository;
    .locals 1

    sget-object v0, Lcom/stripe/android/model/LuxeNextActionRepository;->Instance:Lcom/stripe/android/model/LuxeNextActionRepository;

    return-object v0
.end method

.method private final getActionCreator(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$Status;)Lcom/stripe/android/model/LuxeActionCreatorForStatus;
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/model/LuxeNextActionRepository;->codeToNextActionSpec:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;->getPostConfirmStatusNextStatus()Lcom/stripe/android/model/LuxeActionCreatorForStatus;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/stripe/android/model/LuxeActionCreatorForStatus;->getStatus()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v0

    :goto_1
    if-ne v1, p2, :cond_2

    const/4 p2, 0x1

    goto :goto_2

    :cond_2
    const/4 p2, 0x0

    :goto_2
    if-eqz p2, :cond_3

    move-object v0, p1

    :cond_3
    return-object v0
.end method


# virtual methods
.method public final getAction$payments_core_release(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$Status;Lorg/json/JSONObject;)Lcom/stripe/android/model/LuxeNextActionRepository$Result;
    .locals 1

    const-string v0, "stripeIntentJson"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/model/LuxeNextActionRepository;->getActionCreator(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$Status;)Lcom/stripe/android/model/LuxeActionCreatorForStatus;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/model/LuxeActionCreatorForStatus;->getActionCreator()Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1, p3}, Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator;->create$payments_core_release(Lorg/json/JSONObject;)Lcom/stripe/android/model/LuxeNextActionRepository$Result;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/stripe/android/model/LuxeNextActionRepository$Result$NotSupported;->INSTANCE:Lcom/stripe/android/model/LuxeNextActionRepository$Result$NotSupported;

    :goto_0
    return-object p1
.end method

.method public final getPostAuthorizeIntentOutcome$payments_core_release(Lcom/stripe/android/model/StripeIntent;)Ljava/lang/Integer;
    .locals 3

    const-string v0, "stripeIntent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->requiresAction()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getNextActionData()Lcom/stripe/android/model/StripeIntent$NextActionData;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/model/LuxeNextActionRepository;->codeToNextActionSpec:Ljava/util/Map;

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod;->code:Ljava/lang/String;

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;->getPostAuthorizeIntentStatus()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getStatus()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    goto :goto_1

    :cond_2
    move-object p1, v2

    :goto_1
    return-object p1
.end method

.method public final isPresent$payments_core_release(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/LuxeNextActionRepository;->codeToNextActionSpec:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final update$payments_core_release(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/LuxeNextActionRepository$LuxeAction;",
            ">;)V"
        }
    .end annotation

    const-string v0, "additionalData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/LuxeNextActionRepository;->codeToNextActionSpec:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method
