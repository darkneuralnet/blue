.class public final LFQ2$a;
.super Landroidx/recyclerview/widget/h$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LFQ2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/h$f<",
        "Lco/bird/android/model/wire/WireMerchantTransaction;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "FQ2$a",
        "Landroidx/recyclerview/widget/h$f;",
        "Lco/bird/android/model/wire/WireMerchantTransaction;",
        "oldItem",
        "newItem",
        "",
        "b",
        "a",
        "co.bird.android.feature.merchant"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/recyclerview/widget/h$f;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/model/wire/WireMerchantTransaction;Lco/bird/android/model/wire/WireMerchantTransaction;)Z
    .locals 4

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireMerchantTransaction;->getTransaction()Lco/bird/android/model/wire/WireTransaction;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireTransaction;->getBilledAmount()J

    move-result-wide v0

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireMerchantTransaction;->getTransaction()Lco/bird/android/model/wire/WireTransaction;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireTransaction;->getBilledAmount()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireMerchantTransaction;->getTransaction()Lco/bird/android/model/wire/WireTransaction;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireTransaction;->getTransactionDate()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireMerchantTransaction;->getTransaction()Lco/bird/android/model/wire/WireTransaction;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireTransaction;->getTransactionDate()Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireMerchantTransaction;->getTransaction()Lco/bird/android/model/wire/WireTransaction;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireTransaction;->getMerchantSiteId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireMerchantTransaction;->getTransaction()Lco/bird/android/model/wire/WireTransaction;

    move-result-object p2

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireTransaction;->getMerchantSiteId()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireMerchantTransaction;

    check-cast p2, Lco/bird/android/model/wire/WireMerchantTransaction;

    invoke-virtual {p0, p1, p2}, LFQ2$a;->a(Lco/bird/android/model/wire/WireMerchantTransaction;Lco/bird/android/model/wire/WireMerchantTransaction;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireMerchantTransaction;

    check-cast p2, Lco/bird/android/model/wire/WireMerchantTransaction;

    invoke-virtual {p0, p1, p2}, LFQ2$a;->b(Lco/bird/android/model/wire/WireMerchantTransaction;Lco/bird/android/model/wire/WireMerchantTransaction;)Z

    move-result p1

    return p1
.end method

.method public b(Lco/bird/android/model/wire/WireMerchantTransaction;Lco/bird/android/model/wire/WireMerchantTransaction;)Z
    .locals 1

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireMerchantTransaction;->getTransaction()Lco/bird/android/model/wire/WireTransaction;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireTransaction;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireMerchantTransaction;->getTransaction()Lco/bird/android/model/wire/WireTransaction;

    move-result-object p2

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireTransaction;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
