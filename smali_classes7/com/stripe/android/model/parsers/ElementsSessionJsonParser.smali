.class public final Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/core/model/parsers/ModelJsonParser;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/parsers/ElementsSessionJsonParser$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
        "Lcom/stripe/android/model/ElementsSession;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u00182\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000c\u001a\u00020\rH\u0016JH\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u0006H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser;",
        "Lcom/stripe/android/model/ElementsSession;",
        "params",
        "Lcom/stripe/android/model/ElementsSessionParams;",
        "apiKey",
        "",
        "timeProvider",
        "Lkotlin/Function0;",
        "",
        "(Lcom/stripe/android/model/ElementsSessionParams;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V",
        "parse",
        "json",
        "Lorg/json/JSONObject;",
        "parseStripeIntent",
        "Lcom/stripe/android/model/StripeIntent;",
        "elementsSessionId",
        "paymentMethodPreference",
        "orderedPaymentMethodTypes",
        "Lorg/json/JSONArray;",
        "unactivatedPaymentMethodTypes",
        "",
        "linkFundingSources",
        "countryCode",
        "Companion",
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
        "SMAP\nElementsSessionJsonParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElementsSessionJsonParser.kt\ncom/stripe/android/model/parsers/ElementsSessionJsonParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n1549#2:139\n1620#2,3:140\n*S KotlinDebug\n*F\n+ 1 ElementsSessionJsonParser.kt\ncom/stripe/android/model/parsers/ElementsSessionJsonParser\n*L\n34#1:139\n34#1:140,3\n*E\n"
    }
.end annotation


# static fields
.field private static final Companion:Lcom/stripe/android/model/parsers/ElementsSessionJsonParser$Companion;

.field private static final FIELD_COUNTRY_CODE:Ljava/lang/String; = "country_code"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final FIELD_ELEMENTS_SESSION_ID:Ljava/lang/String; = "session_id"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final FIELD_LINK_FUNDING_SOURCES:Ljava/lang/String; = "link_funding_sources"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final FIELD_LINK_SETTINGS:Ljava/lang/String; = "link_settings"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final FIELD_OBJECT:Ljava/lang/String; = "object"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final FIELD_ORDERED_PAYMENT_METHOD_TYPES:Ljava/lang/String; = "ordered_payment_method_types"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final FIELD_PAYMENT_METHOD_PREFERENCE:Ljava/lang/String; = "payment_method_preference"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final FIELD_PAYMENT_METHOD_SPECS:Ljava/lang/String; = "payment_method_specs"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final FIELD_PAYMENT_METHOD_TYPES:Ljava/lang/String; = "payment_method_types"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final FIELD_UNACTIVATED_PAYMENT_METHOD_TYPES:Ljava/lang/String; = "unactivated_payment_method_types"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final apiKey:Ljava/lang/String;

.field private final params:Lcom/stripe/android/model/ElementsSessionParams;

.field private final timeProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->Companion:Lcom/stripe/android/model/parsers/ElementsSessionJsonParser$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/model/ElementsSessionParams;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ElementsSessionParams;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->params:Lcom/stripe/android/model/ElementsSessionParams;

    iput-object p2, p0, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->apiKey:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->timeProvider:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/model/ElementsSessionParams;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    sget-object p3, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser$1;->INSTANCE:Lcom/stripe/android/model/parsers/ElementsSessionJsonParser$1;

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;-><init>(Lcom/stripe/android/model/ElementsSessionParams;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method private final parseStripeIntent(Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONArray;Ljava/util/List;Lorg/json/JSONArray;Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            "Lorg/json/JSONArray;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/json/JSONArray;",
            "Ljava/lang/String;",
            ")",
            "Lcom/stripe/android/model/StripeIntent;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    iget-object v1, p0, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->params:Lcom/stripe/android/model/ElementsSessionParams;

    invoke-interface {v1}, Lcom/stripe/android/model/ElementsSessionParams;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p2, v0

    :goto_0
    if-nez p2, :cond_1

    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    :cond_1
    if-eqz p3, :cond_2

    const-string v1, "payment_method_types"

    invoke-virtual {p2, v1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_2
    const-string p3, "unactivated_payment_method_types"

    invoke-virtual {p2, p3, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p3, "link_funding_sources"

    invoke-virtual {p2, p3, p5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p3, "country_code"

    invoke-virtual {p2, p3, p6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object p3, p0, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->params:Lcom/stripe/android/model/ElementsSessionParams;

    instance-of p4, p3, Lcom/stripe/android/model/ElementsSessionParams$PaymentIntentType;

    if-eqz p4, :cond_3

    new-instance p1, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;

    const/4 p3, 0x1

    invoke-direct {p1, v0, p3, v0}, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;-><init>(Lcom/stripe/android/model/LuxePostConfirmActionRepository;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, p2}, Lcom/stripe/android/model/parsers/PaymentIntentJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentIntent;

    move-result-object p1

    goto :goto_1

    :cond_3
    instance-of p4, p3, Lcom/stripe/android/model/ElementsSessionParams$SetupIntentType;

    if-eqz p4, :cond_4

    new-instance p1, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;

    invoke-direct {p1}, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;-><init>()V

    invoke-virtual {p1, p2}, Lcom/stripe/android/model/parsers/SetupIntentJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/SetupIntent;

    move-result-object p1

    goto :goto_1

    :cond_4
    instance-of p4, p3, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;

    if-eqz p4, :cond_7

    check-cast p3, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;

    invoke-virtual {p3}, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->getDeferredIntentParams()Lcom/stripe/android/model/DeferredIntentParams;

    move-result-object p3

    invoke-virtual {p3}, Lcom/stripe/android/model/DeferredIntentParams;->getMode()Lcom/stripe/android/model/DeferredIntentParams$Mode;

    move-result-object p3

    instance-of p4, p3, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;

    if-eqz p4, :cond_5

    new-instance p3, Lcom/stripe/android/model/parsers/DeferredPaymentIntentJsonParser;

    iget-object p4, p0, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->params:Lcom/stripe/android/model/ElementsSessionParams;

    check-cast p4, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;

    invoke-virtual {p4}, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->getDeferredIntentParams()Lcom/stripe/android/model/DeferredIntentParams;

    move-result-object p4

    iget-object p5, p0, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->apiKey:Ljava/lang/String;

    iget-object p6, p0, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->timeProvider:Lkotlin/jvm/functions/Function0;

    invoke-direct {p3, p1, p4, p5, p6}, Lcom/stripe/android/model/parsers/DeferredPaymentIntentJsonParser;-><init>(Ljava/lang/String;Lcom/stripe/android/model/DeferredIntentParams;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {p3, p2}, Lcom/stripe/android/model/parsers/DeferredPaymentIntentJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentIntent;

    move-result-object p1

    goto :goto_1

    :cond_5
    instance-of p3, p3, Lcom/stripe/android/model/DeferredIntentParams$Mode$Setup;

    if-eqz p3, :cond_6

    new-instance p3, Lcom/stripe/android/model/parsers/DeferredSetupIntentJsonParser;

    iget-object p4, p0, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->params:Lcom/stripe/android/model/ElementsSessionParams;

    check-cast p4, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;

    invoke-virtual {p4}, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->getDeferredIntentParams()Lcom/stripe/android/model/DeferredIntentParams;

    move-result-object p4

    iget-object p5, p0, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->apiKey:Ljava/lang/String;

    iget-object p6, p0, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->timeProvider:Lkotlin/jvm/functions/Function0;

    invoke-direct {p3, p1, p4, p5, p6}, Lcom/stripe/android/model/parsers/DeferredSetupIntentJsonParser;-><init>(Ljava/lang/String;Lcom/stripe/android/model/DeferredIntentParams;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {p3, p2}, Lcom/stripe/android/model/parsers/DeferredSetupIntentJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/SetupIntent;

    move-result-object p1

    :goto_1
    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public bridge synthetic parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/model/StripeModel;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/ElementsSession;

    move-result-object p1

    return-object p1
.end method

.method public parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/ElementsSession;
    .locals 10

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/core/model/StripeJsonUtils;->INSTANCE:Lcom/stripe/android/core/model/StripeJsonUtils;

    const-string v1, "payment_method_preference"

    invoke-virtual {v0, p1, v1}, Lcom/stripe/android/core/model/StripeJsonUtils;->optMap(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/stripe/android/core/model/StripeJsonUtils;->mapToJsonObject(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v5

    const-string v0, "object"

    invoke-static {v5, v0}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v5, :cond_4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v0, "country_code"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    sget-object v0, Lcom/stripe/android/core/model/parsers/ModelJsonParser;->Companion:Lcom/stripe/android/core/model/parsers/ModelJsonParser$Companion;

    const-string v1, "unactivated_payment_method_types"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/core/model/parsers/ModelJsonParser$Companion;->jsonArrayToList(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v7, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "this as java.lang.String).toLowerCase(Locale.ROOT)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v7, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const-string v0, "payment_method_specs"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v2

    :goto_1
    const-string v1, "link_settings"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_3

    const-string v3, "link_funding_sources"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    goto :goto_2

    :cond_3
    move-object v1, v2

    :goto_2
    const-string v3, "ordered_payment_method_types"

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    const-string v3, "session_id"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string p1, "countryCode"

    invoke-static {v9, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, p0

    move-object v8, v1

    invoke-direct/range {v3 .. v9}, Lcom/stripe/android/model/parsers/ElementsSessionJsonParser;->parseStripeIntent(Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONArray;Ljava/util/List;Lorg/json/JSONArray;Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance v2, Lcom/stripe/android/model/ElementsSession;

    new-instance v3, Lcom/stripe/android/model/ElementsSession$LinkSettings;

    sget-object v4, Lcom/stripe/android/core/model/parsers/ModelJsonParser;->Companion:Lcom/stripe/android/core/model/parsers/ModelJsonParser$Companion;

    invoke-virtual {v4, v1}, Lcom/stripe/android/core/model/parsers/ModelJsonParser$Companion;->jsonArrayToList(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v3, v1}, Lcom/stripe/android/model/ElementsSession$LinkSettings;-><init>(Ljava/util/List;)V

    invoke-direct {v2, v3, v0, p1}, Lcom/stripe/android/model/ElementsSession;-><init>(Lcom/stripe/android/model/ElementsSession$LinkSettings;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;)V

    :cond_4
    :goto_3
    return-object v2
.end method
