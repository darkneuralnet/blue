.class public final LyV5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J>\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0008J\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\u0003H\u0002R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0011\u00a8\u0006\u0015"
    }
    d2 = {
        "LyV5;",
        "",
        "",
        "Lco/bird/android/model/constant/PaymentMethod;",
        "paymentMethods",
        "",
        "googlePayAvailable",
        "paypalAvailable",
        "",
        "",
        "paymentMethodExclusion",
        "",
        "LH6;",
        "a",
        "LzV5;",
        "b",
        "Landroid/content/Context;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "co.bird.android.feature.payment"
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
        "SMAP\nSupportedPaymentMethodConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportedPaymentMethodConverter.kt\nco/bird/android/feature/payment/converters/SupportedPaymentMethodConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n65#1,6:99\n1603#2,9:76\n1855#2:85\n1856#2:87\n1612#2:88\n1603#2,9:89\n1855#2:98\n1856#2:106\n1612#2:107\n1#3:86\n1#3:105\n*S KotlinDebug\n*F\n+ 1 SupportedPaymentMethodConverter.kt\nco/bird/android/feature/payment/converters/SupportedPaymentMethodConverter\n*L\n41#1:99,6\n23#1:76,9\n23#1:85\n23#1:87\n23#1:88\n36#1:89,9\n36#1:98\n36#1:106\n36#1:107\n23#1:86\n36#1:105\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LyV5;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Collection;ZZLjava/util/Map;)Ljava/util/List;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lco/bird/android/model/constant/PaymentMethod;",
            ">;ZZ",
            "Ljava/util/Map<",
            "Lco/bird/android/model/constant/PaymentMethod;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "LH6;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p4

    const-string v3, "paymentMethods"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "paymentMethodExclusion"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/constant/PaymentMethod;

    invoke-interface {v2, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    sget-object v7, Lco/bird/android/model/constant/PaymentMethod;->GOOGLE_PAY:Lco/bird/android/model/constant/PaymentMethod;

    if-ne v5, v7, :cond_1

    if-eqz p2, :cond_3

    :cond_1
    sget-object v7, Lco/bird/android/model/constant/PaymentMethod;->PAYPAL:Lco/bird/android/model/constant/PaymentMethod;

    if-ne v5, v7, :cond_2

    if-nez p3, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0, v5}, LyV5;->b(Lco/bird/android/model/constant/PaymentMethod;)LzV5;

    move-result-object v9

    if-eqz v9, :cond_3

    new-instance v6, LG6;

    sget v10, LBj4;->item_payment_method:I

    const/4 v11, 0x0

    const/4 v12, 0x4

    const/4 v13, 0x0

    move-object v8, v6

    invoke-direct/range {v8 .. v13}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_3
    :goto_1
    if-eqz v6, :cond_0

    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/constant/PaymentMethod;

    sget-object v7, Lco/bird/android/model/constant/PaymentMethod;->GOOGLE_PAY:Lco/bird/android/model/constant/PaymentMethod;

    if-ne v5, v7, :cond_6

    if-eqz p2, :cond_7

    :cond_6
    sget-object v7, Lco/bird/android/model/constant/PaymentMethod;->PAYPAL:Lco/bird/android/model/constant/PaymentMethod;

    if-ne v5, v7, :cond_8

    if-nez p3, :cond_8

    :cond_7
    move-object v5, v6

    goto :goto_4

    :cond_8
    invoke-interface {v2, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-static {v5}, LpO3;->a(Lco/bird/android/model/constant/PaymentMethod;)Ljava/lang/Integer;

    move-result-object v8

    if-eqz v8, :cond_9

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    new-instance v9, LzV5;

    iget-object v10, v0, LyV5;->a:Landroid/content/Context;

    invoke-static {v5, v10}, LpO3;->b(Lco/bird/android/model/constant/PaymentMethod;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v10

    invoke-direct {v9, v5, v8, v10, v7}, LzV5;-><init>(Lco/bird/android/model/constant/PaymentMethod;ILjava/lang/String;Ljava/lang/String;)V

    move-object v12, v9

    goto :goto_3

    :cond_9
    move-object v12, v6

    :goto_3
    if-eqz v12, :cond_7

    new-instance v5, LG6;

    sget v13, LBj4;->item_payment_method:I

    const/4 v14, 0x0

    const/4 v15, 0x4

    const/16 v16, 0x0

    move-object v11, v5

    invoke-direct/range {v11 .. v16}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_4
    if-eqz v5, :cond_5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_a
    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    new-instance v8, LH6;

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    return-object v1
.end method

.method public final b(Lco/bird/android/model/constant/PaymentMethod;)LzV5;
    .locals 8

    invoke-static {p1}, LpO3;->a(Lco/bird/android/model/constant/PaymentMethod;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v3

    new-instance v0, LzV5;

    iget-object v1, p0, LyV5;->a:Landroid/content/Context;

    invoke-static {p1, v1}, LpO3;->b(Lco/bird/android/model/constant/PaymentMethod;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, LzV5;-><init>(Lco/bird/android/model/constant/PaymentMethod;ILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
