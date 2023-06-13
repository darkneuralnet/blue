.class public final Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002JT\u0010\u0003\u001a\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u001a\u0010\u000f\u001a\u0016\u0012\u000c\u0012\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012\u0012\u0004\u0012\u00020\u00110\u0010J$\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0014\u001a\u00020\u000cH\u0002\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;",
        "",
        "()V",
        "create",
        "Lcom/stripe/android/paymentsheet/PaymentOptionsState;",
        "paymentMethods",
        "",
        "Lcom/stripe/android/model/PaymentMethod;",
        "showGooglePay",
        "",
        "showLink",
        "initialSelection",
        "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
        "currentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "nameProvider",
        "Lkotlin/Function1;",
        "",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "sortedPaymentMethods",
        "savedSelection",
        "paymentsheet_release"
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
        "SMAP\nPaymentOptionsStateFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentOptionsStateFactory.kt\ncom/stripe/android/paymentsheet/PaymentOptionsStateFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,144:1\n1#2:145\n1549#3:146\n1620#3,3:147\n350#3,7:150\n*S KotlinDebug\n*F\n+ 1 PaymentOptionsStateFactory.kt\ncom/stripe/android/paymentsheet/PaymentOptionsStateFactory\n*L\n30#1:146\n30#1:147,3\n55#1:150,7\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;->INSTANCE:Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic create$default(Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;Ljava/util/List;ZZLcom/stripe/android/paymentsheet/model/SavedSelection;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/PaymentOptionsState;
    .locals 7

    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;->create(Ljava/util/List;ZZLcom/stripe/android/paymentsheet/model/SavedSelection;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/paymentsheet/PaymentOptionsState;

    move-result-object p0

    return-object p0
.end method

.method private final sortedPaymentMethods(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/SavedSelection;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;",
            "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
            ")",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v3, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/model/PaymentMethod;

    iget-object v4, v4, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    move-object v5, p2

    check-cast v5, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    move v3, v2

    :goto_1
    if-eq v3, v2, :cond_2

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/model/PaymentMethod;

    invoke-interface {p1, v1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_2
    return-object p1
.end method


# virtual methods
.method public final create(Ljava/util/List;ZZLcom/stripe/android/paymentsheet/model/SavedSelection;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/paymentsheet/PaymentOptionsState;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;ZZ",
            "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsState;"
        }
    .end annotation

    const-string v0, "paymentMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialSelection"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameProvider"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/stripe/android/paymentsheet/PaymentOptionsItem;

    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$AddCard;->INSTANCE:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$AddCard;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$GooglePay;->INSTANCE:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$GooglePay;

    const/4 v3, 0x0

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    const/4 p2, 0x1

    aput-object v1, v0, p2

    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$Link;->INSTANCE:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$Link;

    if-eqz p3, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v3

    :goto_1
    const/4 p3, 0x2

    aput-object v1, v0, p3

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    check-cast p3, Ljava/util/Collection;

    invoke-direct {p0, p1, p4}, Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;->sortedPaymentMethods(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/SavedSelection;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/model/PaymentMethod;

    new-instance v4, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;

    iget-object v5, v1, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    if-eqz v5, :cond_2

    iget-object v5, v5, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    goto :goto_3

    :cond_2
    move-object v5, v3

    :goto_3
    invoke-interface {p6, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-direct {v4, v5, v1}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;-><init>(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod;)V

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-static {p3, v0}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    if-eqz p5, :cond_4

    invoke-static {p1, p5}, Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactoryKt;->access$findSelectedPosition(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    goto :goto_4

    :cond_4
    move-object p3, v3

    :goto_4
    if-nez p3, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p5

    const/4 p6, -0x1

    if-eq p5, p6, :cond_6

    :goto_5
    move v2, p2

    :cond_6
    if-eqz v2, :cond_7

    move-object v3, p3

    :cond_7
    invoke-static {p1, p4}, Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactoryKt;->findInitialSelectedPosition(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/SavedSelection;)I

    move-result p2

    new-instance p3, Lcom/stripe/android/paymentsheet/PaymentOptionsState;

    if-eqz v3, :cond_8

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result p2

    :cond_8
    invoke-direct {p3, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentOptionsState;-><init>(Ljava/util/List;I)V

    return-object p3
.end method
