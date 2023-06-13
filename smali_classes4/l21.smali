.class public final Ll21;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll21$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0008\u0005\u0018\u0000 \u00062\u00020\u0001:\u0001\u000fB\u0019\u0008\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u0010\u0010\u0008\u001a\u00020\u00052\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0002J(\u0010\u000f\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e0\r0\u000cH\u0002R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0014R\"\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0017\u00a8\u0006\u001b"
    }
    d2 = {
        "Ll21;",
        "",
        "",
        "b",
        "action",
        "",
        "d",
        "siteKey",
        "e",
        "token",
        "f",
        "c",
        "",
        "",
        "Lkotlin/Pair;",
        "a",
        "Lgl;",
        "Lgl;",
        "appPreference",
        "LTq4;",
        "LTq4;",
        "reactiveConfig",
        "",
        "Ljava/util/Map;",
        "verificationMap",
        "<init>",
        "(Lgl;LTq4;)V",
        "device-check_release"
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
        "SMAP\nDeviceCheckDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceCheckDelegate.kt\nco/bird/android/manager/devicecheck/DeviceCheckDelegate\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n1747#2,3:122\n766#2:125\n857#2:126\n1726#2,3:127\n858#2:130\n1855#2:131\n1855#2,2:132\n1856#2:134\n1747#2,3:135\n1747#2,3:138\n1747#2,3:141\n*S KotlinDebug\n*F\n+ 1 DeviceCheckDelegate.kt\nco/bird/android/manager/devicecheck/DeviceCheckDelegate\n*L\n41#1:122,3\n44#1:125\n44#1:126\n44#1:127,3\n44#1:130\n45#1:131\n47#1:132,2\n45#1:134\n87#1:135,3\n97#1:138,3\n107#1:141,3\n*E\n"
    }
.end annotation


# static fields
.field public static final d:Ll21$a;


# instance fields
.field public final a:Lgl;

.field public final b:LTq4;

.field public final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll21$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll21$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ll21;->d:Ll21$a;

    return-void
.end method

.method public constructor <init>(Lgl;LTq4;)V
    .locals 1

    const-string v0, "appPreference"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll21;->a:Lgl;

    iput-object p2, p0, Ll21;->b:LTq4;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Ll21;->c:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;>;"
        }
    .end annotation

    iget-object v0, p0, Ll21;->b:LTq4;

    invoke-virtual {v0}, LTq4;->h8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/config/tweaks/dsl/Tweaks;

    const-string v1, "enableExcludeDeviceCheckTokenValue"

    invoke-virtual {v0, v1}, Lco/bird/android/config/tweaks/dsl/Tweaks;->getTweak(Ljava/lang/String;)LRa6;

    move-result-object v0

    invoke-virtual {v0}, LRa6;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object v2, p0, Ll21;->b:LTq4;

    invoke-virtual {v2}, LTq4;->f8()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/Config;->getSecurityConfig()Lco/bird/android/model/wire/configs/SecurityConfig;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/SecurityConfig;->getDeviceVerificationConfig()Lco/bird/android/model/wire/configs/DeviceVerificationConfig;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/DeviceVerificationConfig;->getEndpoints()Ljava/util/Map;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_7

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    if-eqz v2, :cond_7

    check-cast v2, Ljava/lang/Iterable;

    move-object v4, v2

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_3

    :cond_2
    move v2, v1

    goto :goto_3

    :cond_3
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/configs/DeviceVerificationEndpointConfig;

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/DeviceVerificationEndpointConfig;->getEnabled()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/DeviceVerificationEndpointConfig;->getVerificationMethods()Ljava/util/Set;

    move-result-object v4

    if-eqz v4, :cond_5

    sget-object v5, Lco/bird/android/model/wire/configs/VerificationMethod;->BIRD_PUSH_TOKEN:Lco/bird/android/model/wire/configs/VerificationMethod;

    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-ne v4, v3, :cond_5

    move v4, v3

    goto :goto_1

    :cond_5
    move v4, v1

    :goto_1
    if-eqz v4, :cond_6

    move v4, v3

    goto :goto_2

    :cond_6
    move v4, v1

    :goto_2
    if-eqz v4, :cond_4

    move v2, v3

    :goto_3
    if-ne v2, v3, :cond_7

    move v2, v3

    goto :goto_4

    :cond_7
    move v2, v1

    :goto_4
    const-string v4, "value"

    if-eqz v2, :cond_8

    new-instance v2, Lkotlin/Pair;

    iget-object v5, p0, Ll21;->a:Lgl;

    invoke-virtual {v5}, Lgl;->p0()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v4, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOfNotNull(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v5, "bird_push_token"

    invoke-interface {v0, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    iget-object v2, p0, Ll21;->b:LTq4;

    invoke-virtual {v2}, LTq4;->f8()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/Config;->getSecurityConfig()Lco/bird/android/model/wire/configs/SecurityConfig;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/SecurityConfig;->getDeviceVerificationConfig()Lco/bird/android/model/wire/configs/DeviceVerificationConfig;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/DeviceVerificationConfig;->getEndpoints()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_e

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    if-eqz v2, :cond_e

    check-cast v2, Ljava/lang/Iterable;

    move-object v5, v2

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_a

    :cond_9
    move v2, v1

    goto :goto_7

    :cond_a
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/wire/configs/DeviceVerificationEndpointConfig;

    invoke-virtual {v5}, Lco/bird/android/model/wire/configs/DeviceVerificationEndpointConfig;->getEnabled()Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-virtual {v5}, Lco/bird/android/model/wire/configs/DeviceVerificationEndpointConfig;->getVerificationMethods()Ljava/util/Set;

    move-result-object v5

    if-eqz v5, :cond_c

    sget-object v6, Lco/bird/android/model/wire/configs/VerificationMethod;->FIREBASE_APPCHECK:Lco/bird/android/model/wire/configs/VerificationMethod;

    invoke-interface {v5, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-ne v5, v3, :cond_c

    move v5, v3

    goto :goto_5

    :cond_c
    move v5, v1

    :goto_5
    if-eqz v5, :cond_d

    move v5, v3

    goto :goto_6

    :cond_d
    move v5, v1

    :goto_6
    if-eqz v5, :cond_b

    move v2, v3

    :goto_7
    if-ne v2, v3, :cond_e

    move v2, v3

    goto :goto_8

    :cond_e
    move v2, v1

    :goto_8
    if-eqz v2, :cond_f

    new-instance v2, Lkotlin/Pair;

    iget-object v5, p0, Ll21;->c:Ljava/util/Map;

    const-string v6, "key_app_check_token"

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-direct {v2, v4, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOfNotNull(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v5, "firebase_appcheck"

    invoke-interface {v0, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_f
    iget-object v2, p0, Ll21;->b:LTq4;

    invoke-virtual {v2}, LTq4;->f8()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/Config;->getSecurityConfig()Lco/bird/android/model/wire/configs/SecurityConfig;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/SecurityConfig;->getDeviceVerificationConfig()Lco/bird/android/model/wire/configs/DeviceVerificationConfig;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/DeviceVerificationConfig;->getEndpoints()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_15

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    if-eqz v2, :cond_15

    check-cast v2, Ljava/lang/Iterable;

    move-object v5, v2

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_11

    :cond_10
    move v2, v1

    goto :goto_b

    :cond_11
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_12
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/wire/configs/DeviceVerificationEndpointConfig;

    invoke-virtual {v5}, Lco/bird/android/model/wire/configs/DeviceVerificationEndpointConfig;->getEnabled()Z

    move-result v6

    if-eqz v6, :cond_14

    invoke-virtual {v5}, Lco/bird/android/model/wire/configs/DeviceVerificationEndpointConfig;->getVerificationMethods()Ljava/util/Set;

    move-result-object v5

    if-eqz v5, :cond_13

    sget-object v6, Lco/bird/android/model/wire/configs/VerificationMethod;->RECAPTCHA_ENTERPRISE:Lco/bird/android/model/wire/configs/VerificationMethod;

    invoke-interface {v5, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-ne v5, v3, :cond_13

    move v5, v3

    goto :goto_9

    :cond_13
    move v5, v1

    :goto_9
    if-eqz v5, :cond_14

    move v5, v3

    goto :goto_a

    :cond_14
    move v5, v1

    :goto_a
    if-eqz v5, :cond_12

    move v2, v3

    :goto_b
    if-ne v2, v3, :cond_15

    move v2, v3

    goto :goto_c

    :cond_15
    move v2, v1

    :goto_c
    if-eqz v2, :cond_16

    const/4 v2, 0x4

    new-array v2, v2, [Lkotlin/Pair;

    new-instance v5, Lkotlin/Pair;

    iget-object v6, p0, Ll21;->c:Ljava/util/Map;

    const-string v7, "key_recaptcha_enterprise_token"

    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-direct {v5, v4, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v5, v2, v1

    new-instance v1, Lkotlin/Pair;

    iget-object v4, p0, Ll21;->c:Ljava/util/Map;

    const-string v5, "key_recaptcha_enterprise_action"

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "action"

    invoke-direct {v1, v5, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v1, v2, v3

    new-instance v1, Lkotlin/Pair;

    iget-object v3, p0, Ll21;->c:Ljava/util/Map;

    const-string v4, "key_recaptcha_enterprise_site_key"

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "site_key"

    invoke-direct {v1, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v3, 0x2

    aput-object v1, v2, v3

    new-instance v1, Lkotlin/Pair;

    const-string v3, "platform"

    const-string v4, "android"

    invoke-direct {v1, v3, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v3, 0x3

    aput-object v1, v2, v3

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v2, "recaptcha_enterprise"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_16
    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 9

    invoke-virtual {p0}, Ll21;->a()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    instance-of v2, v1, Ljava/util/Collection;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    move v1, v4

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    xor-int/2addr v2, v3

    if-eqz v2, :cond_2

    move v1, v3

    :goto_0
    const/4 v2, 0x0

    if-eqz v1, :cond_b

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    check-cast v7, Ljava/lang/Iterable;

    instance-of v8, v7, Ljava/util/Collection;

    if-eqz v8, :cond_5

    move-object v8, v7

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_5

    :cond_4
    move v7, v3

    goto :goto_3

    :cond_5
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lkotlin/Pair;

    invoke-virtual {v8}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_7

    move v8, v3

    goto :goto_2

    :cond_7
    move v8, v4

    :goto_2
    if-nez v8, :cond_6

    move v7, v4

    :goto_3
    if-eqz v7, :cond_3

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_8
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lkotlin/Pair;

    invoke-virtual {v7}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v7}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v6, v8, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_5

    :cond_9
    invoke-virtual {v1, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move v4, v3

    goto :goto_4

    :cond_a
    if-eqz v4, :cond_b

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_b
    return-object v2
.end method

.method public final c(Ljava/lang/String;)V
    .locals 2

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ll21;->c:Ljava/util/Map;

    const-string v1, "key_app_check_token"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 2

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ll21;->c:Ljava/util/Map;

    const-string v1, "key_recaptcha_enterprise_action"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final e(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Ll21;->c:Ljava/util/Map;

    const-string v1, "key_recaptcha_enterprise_site_key"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final f(Ljava/lang/String;)V
    .locals 2

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ll21;->c:Ljava/util/Map;

    const-string v1, "key_recaptcha_enterprise_token"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
