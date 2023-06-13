.class public final Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactoryKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0010\u0008\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000\u001a\u001a\u0010\u0006\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0008H\u0002\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\u0008*\u00020\u0003H\u0000\u00a8\u0006\n"
    }
    d2 = {
        "findInitialSelectedPosition",
        "",
        "",
        "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
        "savedSelection",
        "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
        "findSelectedPosition",
        "paymentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "toPaymentSelection",
        "paymentsheet_release"
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
        "SMAP\nPaymentOptionsStateFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentOptionsStateFactory.kt\ncom/stripe/android/paymentsheet/PaymentOptionsStateFactoryKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n350#2,7:145\n350#2,7:153\n350#2,7:160\n350#2,7:167\n350#2,7:174\n1#3:152\n*S KotlinDebug\n*F\n+ 1 PaymentOptionsStateFactory.kt\ncom/stripe/android/paymentsheet/PaymentOptionsStateFactoryKt\n*L\n86#1:145,7\n105#1:153,7\n108#1:160,7\n111#1:167,7\n119#1:174,7\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic access$findSelectedPosition(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)I
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactoryKt;->findSelectedPosition(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)I

    move-result p0

    return p0
.end method

.method public static final findInitialSelectedPosition(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/SavedSelection;)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
            ">;",
            "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
            ")I"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Integer;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, -0x1

    if-eqz v4, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    sget-object v6, Lcom/stripe/android/paymentsheet/model/SavedSelection$GooglePay;->INSTANCE:Lcom/stripe/android/paymentsheet/model/SavedSelection$GooglePay;

    invoke-static {p1, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    instance-of v4, v4, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$GooglePay;

    goto :goto_1

    :cond_0
    sget-object v6, Lcom/stripe/android/paymentsheet/model/SavedSelection$Link;->INSTANCE:Lcom/stripe/android/paymentsheet/model/SavedSelection$Link;

    invoke-static {p1, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    instance-of v4, v4, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$Link;

    goto :goto_1

    :cond_1
    instance-of v6, p1, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;

    if-eqz v6, :cond_2

    instance-of v6, v4, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;

    if-eqz v6, :cond_3

    move-object v6, p1

    check-cast v6, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;

    invoke-virtual {v6}, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;->getId()Ljava/lang/String;

    move-result-object v6

    check-cast v4, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v4

    iget-object v4, v4, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    goto :goto_1

    :cond_2
    sget-object v4, Lcom/stripe/android/paymentsheet/model/SavedSelection$None;->INSTANCE:Lcom/stripe/android/paymentsheet/model/SavedSelection$None;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_3
    move v4, v2

    :goto_1
    if-eqz v4, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    move v3, v5

    :goto_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v1

    const/4 v3, 0x1

    if-eq v1, v5, :cond_6

    move v1, v3

    goto :goto_3

    :cond_6
    move v1, v2

    :goto_3
    const/4 v4, 0x0

    if-eqz v1, :cond_7

    goto :goto_4

    :cond_7
    move-object p1, v4

    :goto_4
    aput-object p1, v0, v2

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move v1, v2

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    instance-of v6, v6, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$GooglePay;

    if-eqz v6, :cond_8

    goto :goto_6

    :cond_8
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_9
    move v1, v5

    :goto_6
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-eq v1, v5, :cond_a

    move v1, v3

    goto :goto_7

    :cond_a
    move v1, v2

    :goto_7
    if-eqz v1, :cond_b

    goto :goto_8

    :cond_b
    move-object p1, v4

    :goto_8
    aput-object p1, v0, v3

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move v1, v2

    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    instance-of v6, v6, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$Link;

    if-eqz v6, :cond_c

    goto :goto_a

    :cond_c
    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_d
    move v1, v5

    :goto_a
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-eq v1, v5, :cond_e

    move v1, v3

    goto :goto_b

    :cond_e
    move v1, v2

    :goto_b
    if-eqz v1, :cond_f

    goto :goto_c

    :cond_f
    move-object p1, v4

    :goto_c
    const/4 v1, 0x2

    aput-object p1, v0, v1

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    move p1, v2

    :goto_d
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    instance-of v1, v1, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;

    if-eqz v1, :cond_10

    goto :goto_e

    :cond_10
    add-int/lit8 p1, p1, 0x1

    goto :goto_d

    :cond_11
    move p1, v5

    :goto_e
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p1

    if-eq p1, v5, :cond_12

    move v2, v3

    :cond_12
    if-eqz v2, :cond_13

    move-object v4, p0

    :cond_13
    const/4 p0, 0x3

    aput-object v4, v0, p0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-eqz p0, :cond_14

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    :cond_14
    return v5
.end method

.method private static final findSelectedPosition(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
            ">;",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    instance-of v3, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    if-eqz v3, :cond_0

    instance-of v2, v2, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$GooglePay;

    goto :goto_1

    :cond_0
    instance-of v3, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;

    if-eqz v3, :cond_1

    instance-of v2, v2, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$Link;

    goto :goto_1

    :cond_1
    instance-of v3, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    if-eqz v3, :cond_2

    instance-of v3, v2, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;

    if-eqz v3, :cond_3

    move-object v3, p1

    check-cast v3, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v3

    iget-object v3, v3, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    check-cast v2, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v2

    iget-object v2, v2, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    goto :goto_1

    :cond_2
    instance-of v2, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    if-eqz v2, :cond_5

    :cond_3
    move v2, v0

    :goto_1
    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_6
    const/4 v1, -0x1

    :goto_2
    return v1
.end method

.method public static final toPaymentSelection(Lcom/stripe/android/paymentsheet/PaymentOptionsItem;)Lcom/stripe/android/paymentsheet/model/PaymentSelection;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$AddCard;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$GooglePay;

    if-eqz v0, :cond_1

    sget-object v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;->INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    goto :goto_0

    :cond_1
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$Link;

    if-eqz v0, :cond_2

    sget-object v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;->INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;

    goto :goto_0

    :cond_2
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;

    if-eqz v0, :cond_3

    new-instance v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    check-cast p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p0

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, p0, v2, v3, v1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;-><init>(Lcom/stripe/android/model/PaymentMethod;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v0

    :goto_0
    return-object v1

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
