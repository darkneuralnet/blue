.class public Lsi3$a;
.super Lcf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsi3;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcf1<",
        "Lco/bird/android/model/persistence/SkuOrder;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:Lsi3;


# direct methods
.method public constructor <init>(Lsi3;LEb5;)V
    .locals 0

    iput-object p1, p0, Lsi3$a;->d:Lsi3;

    invoke-direct {p0, p2}, Lcf1;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `sku_order` (`id`,`packaging_quantity`,`package_type`,`quantity`,`status`,`transfer_order_line_item_id`,`transfer_order_line_item`,`updated_at`) VALUES (?,?,?,?,?,?,?,?)"

    return-object v0
.end method

.method public bridge synthetic i(LqV5;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lco/bird/android/model/persistence/SkuOrder;

    invoke-virtual {p0, p1, p2}, Lsi3$a;->p(LqV5;Lco/bird/android/model/persistence/SkuOrder;)V

    return-void
.end method

.method public p(LqV5;Lco/bird/android/model/persistence/SkuOrder;)V
    .locals 4

    invoke-virtual {p2}, Lco/bird/android/model/persistence/SkuOrder;->getId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/SkuOrder;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/SkuOrder;->getPackagingQuantity()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lco/bird/android/model/persistence/SkuOrder;->getPackagingQuantity()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    :goto_1
    invoke-virtual {p2}, Lco/bird/android/model/persistence/SkuOrder;->getPackageType()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lco/bird/android/model/persistence/SkuOrder;->getPackageType()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, Lco/bird/android/model/persistence/SkuOrder;->getQuantity()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x4

    invoke-interface {p1, v2, v0, v1}, LoV5;->S0(IJ)V

    sget-object v0, Lqi3;->a:Lqi3;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/SkuOrder;->getStatus()Lco/bird/android/model/constant/SkuOrderStatus;

    move-result-object v0

    invoke-static {v0}, Lqi3;->a(Lco/bird/android/model/constant/SkuOrderStatus;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_3

    :cond_3
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_3
    invoke-virtual {p2}, Lco/bird/android/model/persistence/SkuOrder;->getTransferOrderLineItemId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p2}, Lco/bird/android/model/persistence/SkuOrder;->getTransferOrderLineItemId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_4
    invoke-virtual {p2}, Lco/bird/android/model/persistence/SkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;

    move-result-object v0

    invoke-static {v0}, Lqi3;->b(Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_5

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_5

    :cond_5
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_5
    sget-object v0, Lco/bird/android/persistence/common/impl/Converters;->a:Lco/bird/android/persistence/common/impl/Converters;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/SkuOrder;->getUpdatedAt()Lorg/joda/time/DateTime;

    move-result-object p2

    invoke-static {p2}, Lco/bird/android/persistence/common/impl/Converters;->e(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object p2

    const/16 v0, 0x8

    if-nez p2, :cond_6

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_6

    :cond_6
    invoke-interface {p1, v0, p2}, LoV5;->G0(ILjava/lang/String;)V

    :goto_6
    return-void
.end method
