.class public final Lco/bird/android/feature/rider/birdpay/input/d$l$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/rider/birdpay/input/d$l;->b(Lkotlin/Triple;)Lio/reactivex/K;
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
        "LuL3;",
        ">;",
        "Lwb4<",
        "+",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "+",
        "Lco/bird/android/model/Balance;",
        "+",
        "Ljava/lang/Integer;",
        "+",
        "LHM4<",
        "LuL3;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0010\u0008\u001aF\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u0000 \u0007*\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "LHM4;",
        "LuL3;",
        "it",
        "Lwb4;",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "Lco/bird/android/model/Balance;",
        "",
        "kotlin.jvm.PlatformType",
        "a",
        "(LHM4;)Lwb4;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/wire/WireMerchantSite;

.field public final synthetic h:Lco/bird/android/model/Balance;

.field public final synthetic i:I


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireMerchantSite;Lco/bird/android/model/Balance;I)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/rider/birdpay/input/d$l$a;->g:Lco/bird/android/model/wire/WireMerchantSite;

    iput-object p2, p0, Lco/bird/android/feature/rider/birdpay/input/d$l$a;->h:Lco/bird/android/model/Balance;

    iput p3, p0, Lco/bird/android/feature/rider/birdpay/input/d$l$a;->i:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)Lwb4;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "LuL3;",
            ">;)",
            "Lwb4<",
            "Lco/bird/android/model/wire/WireMerchantSite;",
            "Lco/bird/android/model/Balance;",
            "Ljava/lang/Integer;",
            "LHM4<",
            "LuL3;",
            ">;>;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwb4;

    iget-object v1, p0, Lco/bird/android/feature/rider/birdpay/input/d$l$a;->g:Lco/bird/android/model/wire/WireMerchantSite;

    iget-object v2, p0, Lco/bird/android/feature/rider/birdpay/input/d$l$a;->h:Lco/bird/android/model/Balance;

    iget v3, p0, Lco/bird/android/feature/rider/birdpay/input/d$l$a;->i:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3, p1}, Lwb4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/rider/birdpay/input/d$l$a;->a(LHM4;)Lwb4;

    move-result-object p1

    return-object p1
.end method
