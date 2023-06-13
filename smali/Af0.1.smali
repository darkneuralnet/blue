.class public final LAf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LkR5;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LkR5<",
        "Lyf0;",
        "Lcom/adyen/checkout/card/CardConfiguration;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0003H\u0096\u0002J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0003H\u0002\u00a8\u0006\u000e"
    }
    d2 = {
        "LAf0;",
        "LkR5;",
        "Lyf0;",
        "Lcom/adyen/checkout/card/CardConfiguration;",
        "LXr6;",
        "viewModelStoreOwner",
        "Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;",
        "paymentMethod",
        "configuration",
        "c",
        "cardConfiguration",
        "b",
        "<init>",
        "()V",
        "card_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(LXr6;Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;Lcom/adyen/checkout/components/base/Configuration;)LNL3;
    .locals 0

    check-cast p3, Lcom/adyen/checkout/card/CardConfiguration;

    invoke-virtual {p0, p1, p2, p3}, LAf0;->c(LXr6;Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;Lcom/adyen/checkout/card/CardConfiguration;)Lyf0;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;Lcom/adyen/checkout/card/CardConfiguration;)Lcom/adyen/checkout/card/CardConfiguration;
    .locals 5

    invoke-virtual {p2}, Lcom/adyen/checkout/card/CardConfiguration;->j()Ljava/util/List;

    move-result-object v0

    const-string v1, "cardConfiguration.supportedCardTypes"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_0

    return-object p2

    :cond_0
    invoke-virtual {p1}, Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;->getBrands()Ljava/util/List;

    move-result-object p1

    sget-object v0, Lcom/adyen/checkout/card/CardConfiguration;->p:Ljava/util/List;

    move-object v2, p1

    check-cast v2, Ljava/util/Collection;

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    move v1, v3

    :cond_2
    :goto_0
    if-nez v1, :cond_4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, LXf0;->b(Ljava/lang/String;)LXf0;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-static {}, LBf0;->a()Ljava/lang/String;

    move-result-object v2

    const-string v4, "Failed to get card type for brand: "

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, LCx2;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    invoke-static {}, LBf0;->a()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Falling back to DEFAULT_SUPPORTED_CARDS_LIST"

    invoke-static {p1, v1}, LCx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    invoke-virtual {p2}, Lcom/adyen/checkout/card/CardConfiguration;->o()Lcom/adyen/checkout/card/CardConfiguration$b;

    move-result-object p1

    const-string p2, "supportedCardTypes"

    invoke-static {v0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Collection;

    new-array p2, v3, [LXf0;

    invoke-interface {v0, p2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_6

    check-cast p2, [LXf0;

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [LXf0;

    invoke-virtual {p1, p2}, Lcom/adyen/checkout/card/CardConfiguration$b;->s([LXf0;)Lcom/adyen/checkout/card/CardConfiguration$b;

    move-result-object p1

    invoke-virtual {p1}, LuA;->a()Lcom/adyen/checkout/components/base/Configuration;

    move-result-object p1

    const-string p2, "cardConfiguration.newBuilder()\n            .setSupportedCardTypes(*supportedCardTypes.toTypedArray())\n            .build()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/adyen/checkout/card/CardConfiguration;

    return-object p1

    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type kotlin.Array<T>"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c(LXr6;Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;Lcom/adyen/checkout/card/CardConfiguration;)Lyf0;
    .locals 3

    const-string v0, "viewModelStoreOwner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethod"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2, p3}, LAf0;->b(Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;Lcom/adyen/checkout/card/CardConfiguration;)Lcom/adyen/checkout/card/CardConfiguration;

    move-result-object p3

    new-instance v0, LQG;

    invoke-direct {v0}, LQG;-><init>()V

    new-instance v1, Lka4;

    invoke-direct {v1}, Lka4;-><init>()V

    new-instance v2, LAf0$a;

    invoke-direct {v2, p2, p3, v0, v1}, LAf0$a;-><init>(Lcom/adyen/checkout/components/model/paymentmethods/PaymentMethod;Lcom/adyen/checkout/card/CardConfiguration;LQG;Lka4;)V

    new-instance p2, Landroidx/lifecycle/u;

    invoke-direct {p2, p1, v2}, Landroidx/lifecycle/u;-><init>(LXr6;Landroidx/lifecycle/u$b;)V

    const-class p1, Lyf0;

    invoke-virtual {p2, p1}, Landroidx/lifecycle/u;->a(Ljava/lang/Class;)LOr6;

    move-result-object p1

    const-string p2, "ViewModelProvider(viewModelStoreOwner, factory).get(CardComponent::class.java)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lyf0;

    return-object p1
.end method
