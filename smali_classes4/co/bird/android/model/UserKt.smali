.class public final Lco/bird/android/model/UserKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a!\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008*\u00020\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u000c\u001a\n\u0010\r\u001a\u00020\u000b*\u00020\u0002\u001a\n\u0010\u000e\u001a\u00020\u000b*\u00020\u0002\u001a\n\u0010\u000f\u001a\u00020\u000b*\u00020\u0002\u001a\n\u0010\u0010\u001a\u00020\u000b*\u00020\u0002\u001a\u000c\u0010\u0011\u001a\u00020\u000b*\u0004\u0018\u00010\u0002\u001a\n\u0010\u0012\u001a\u00020\u000b*\u00020\u0002\u001a\u0014\u0010\u0013\u001a\u00020\u0002*\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0002\u001a\n\u0010\u0015\u001a\u00020\u0006*\u00020\u0002\u00a8\u0006\u0016"
    }
    d2 = {
        "balance",
        "",
        "Lco/bird/android/model/User;",
        "currency",
        "",
        "getFreeRides",
        "",
        "getRoles",
        "",
        "Lco/bird/android/model/UserRoleItem;",
        "isMerchant",
        "",
        "(Lco/bird/android/model/User;Ljava/lang/Boolean;)Ljava/util/List;",
        "hasOperatorRole",
        "isAdminDomain",
        "isCharger",
        "isContractor",
        "isInRegistration",
        "isOperator",
        "maybeMergeWith",
        "newUser",
        "missingInfoCount",
        "model_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nUser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 User.kt\nco/bird/android/model/UserKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n1855#2,2:208\n1#3:210\n*S KotlinDebug\n*F\n+ 1 User.kt\nco/bird/android/model/UserKt\n*L\n153#1:208,2\n*E\n"
    }
.end annotation


# direct methods
.method public static final balance(Lco/bird/android/model/User;Ljava/lang/String;)J
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currency"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/User;->getBalances()Ljava/util/Map;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const-string v0, "this as java.lang.String).toLowerCase()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    goto :goto_0

    :cond_0
    const-wide/16 p0, 0x0

    :goto_0
    return-wide p0
.end method

.method public static final getFreeRides(Lco/bird/android/model/User;Ljava/lang/String;)I
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currency"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/User;->getFreeRidesByCurrency()Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lco/bird/android/model/User;->getFreeRidesByCurrency()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_0

    :cond_0
    const-string v0, "usd"

    const/4 v2, 0x1

    invoke-static {p1, v0, v2}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lco/bird/android/model/User;->getFreeRides()I

    move-result v1

    :cond_1
    :goto_0
    return v1
.end method

.method public static final getRoles(Lco/bird/android/model/User;Ljava/lang/Boolean;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/User;",
            "Ljava/lang/Boolean;",
            ")",
            "Ljava/util/List<",
            "Lco/bird/android/model/UserRoleItem;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    new-array v0, v0, [Lco/bird/android/model/UserRoleItem;

    sget-object v1, Lco/bird/android/model/constant/UserRole;->RIDER:Lco/bird/android/model/constant/UserRole;

    invoke-static {v1}, Lco/bird/android/model/UserRoleItemKt;->toUserRoleItem(Lco/bird/android/model/constant/UserRole;)Lco/bird/android/model/UserRoleItem;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/model/User;->getOperatorRoles()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/OperatorRole;

    invoke-virtual {v1}, Lco/bird/android/model/OperatorRole;->toUserRoleItem()Lco/bird/android/model/UserRoleItem;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lco/bird/android/model/constant/UserRole;->MERCHANT:Lco/bird/android/model/constant/UserRole;

    invoke-static {p0}, Lco/bird/android/model/UserRoleItemKt;->toUserRoleItem(Lco/bird/android/model/constant/UserRole;)Lco/bird/android/model/UserRoleItem;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    return-object v0
.end method

.method public static synthetic getRoles$default(Lco/bird/android/model/User;Ljava/lang/Boolean;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :cond_0
    invoke-static {p0, p1}, Lco/bird/android/model/UserKt;->getRoles(Lco/bird/android/model/User;Ljava/lang/Boolean;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final hasOperatorRole(Lco/bird/android/model/User;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/User;->getOperatorRoles()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_0

    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isAdminDomain(Lco/bird/android/model/User;)Z
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/User;->getEmail()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string p0, "@"

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    const-string v0, "bird.co"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isCharger(Lco/bird/android/model/User;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/User;->getCanCharge()Ljava/lang/Boolean;

    move-result-object p0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final isContractor(Lco/bird/android/model/User;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/User;->getCanCharge()Ljava/lang/Boolean;

    move-result-object p0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final isInRegistration(Lco/bird/android/model/User;)Z
    .locals 1

    const/4 v0, 0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/model/User;->getRideCount()I

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static final isOperator(Lco/bird/android/model/User;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/User;->getOperatorRoles()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_0

    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final maybeMergeWith(Lco/bird/android/model/User;Lco/bird/android/model/User;)Lco/bird/android/model/User;
    .locals 32

    const-string v0, "newUser"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/User;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/User;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object/from16 v2, p0

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/User;->getBalances()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v4

    const/4 v5, 0x1

    xor-int/2addr v4, v5

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    move-object v3, v0

    :goto_1
    if-nez v3, :cond_3

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lco/bird/android/model/User;->getBalances()Ljava/util/Map;

    move-result-object v3

    goto :goto_2

    :cond_2
    move-object v3, v0

    :goto_2
    if-nez v3, :cond_3

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v3

    :cond_3
    move-object v8, v3

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/User;->getRideCount()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v4

    const/4 v6, 0x0

    if-eqz v4, :cond_4

    move v4, v5

    goto :goto_3

    :cond_4
    move v4, v6

    :goto_3
    if-eqz v4, :cond_5

    goto :goto_4

    :cond_5
    move-object v3, v0

    :goto_4
    if-eqz v3, :cond_6

    :goto_5
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    move v13, v3

    goto :goto_7

    :cond_6
    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lco/bird/android/model/User;->getRideCount()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_6

    :cond_7
    move-object v3, v0

    :goto_6
    if-eqz v3, :cond_8

    goto :goto_5

    :cond_8
    move v13, v6

    :goto_7
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/User;->getFreeRidesByCurrency()Ljava/util/Map;

    move-result-object v3

    if-nez v3, :cond_a

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lco/bird/android/model/User;->getFreeRidesByCurrency()Ljava/util/Map;

    move-result-object v3

    goto :goto_8

    :cond_9
    move-object v12, v0

    goto :goto_9

    :cond_a
    :goto_8
    move-object v12, v3

    :goto_9
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/User;->getStripePublicKey()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_c

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Lco/bird/android/model/User;->getStripePublicKey()Ljava/lang/String;

    move-result-object v0

    :cond_b
    move-object/from16 v26, v0

    goto :goto_a

    :cond_c
    move-object/from16 v26, v3

    :goto_a
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/User;->getReceivedSignupCoupon()Z

    move-result v0

    if-nez v0, :cond_f

    if-eqz v2, :cond_d

    invoke-virtual {v2}, Lco/bird/android/model/User;->getReceivedSignupCoupon()Z

    move-result v0

    goto :goto_b

    :cond_d
    move v0, v6

    :goto_b
    if-eqz v0, :cond_e

    goto :goto_c

    :cond_e
    move/from16 v16, v6

    goto :goto_d

    :cond_f
    :goto_c
    move/from16 v16, v5

    :goto_d
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const v30, 0xeffb3bf

    const/16 v31, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v31}, Lco/bird/android/model/User;->copy$default(Lco/bird/android/model/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;IZZZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lorg/joda/time/LocalDateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lco/bird/android/model/User;

    move-result-object v0

    return-object v0
.end method

.method public static final missingInfoCount(Lco/bird/android/model/User;)I
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/User;->getEmailVerifiedAt()Lorg/joda/time/DateTime;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lco/bird/android/model/User;->getPhone()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    add-int/lit8 v0, v0, 0x1

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/model/User;->getName()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_2

    add-int/lit8 v0, v0, 0x1

    :cond_2
    return v0
.end method
