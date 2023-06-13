.class public final LiT2$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LiT2;->c(LEc2$c;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LHM4<",
        "Lco/bird/api/response/CollectionResponse<",
        "Lco/bird/android/model/wire/WireMerchantTransaction;",
        ">;>;",
        "LbO4<",
        "Lco/bird/android/model/wire/WireMerchantTransaction;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0005*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "LHM4;",
        "Lco/bird/api/response/CollectionResponse;",
        "Lco/bird/android/model/wire/WireMerchantTransaction;",
        "response",
        "LbO4;",
        "kotlin.jvm.PlatformType",
        "a",
        "(LHM4;)LbO4;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMerchantTransactionDataSourceDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MerchantTransactionDataSourceDelegate.kt\nco/bird/android/manager/merchant/MerchantTransactionDataSourceDelegate$loadInitial$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LiT2;


# direct methods
.method public constructor <init>(LiT2;)V
    .locals 0

    iput-object p1, p0, LiT2$b;->g:LiT2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)LbO4;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/api/response/CollectionResponse<",
            "Lco/bird/android/model/wire/WireMerchantTransaction;",
            ">;>;)",
            "LbO4<",
            "Lco/bird/android/model/wire/WireMerchantTransaction;",
            ">;"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LiT2$b;->g:LiT2;

    invoke-static {v0, p1}, LiT2;->access$filterResponseByStore(LiT2;LHM4;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, LbO4$a;

    invoke-direct {v0, p1}, LbO4$a;-><init>(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    new-instance v0, LbO4$c;

    const/4 p1, 0x1

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1, v1}, LbO4$c;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, LiT2$b;->a(LHM4;)LbO4;

    move-result-object p1

    return-object p1
.end method
