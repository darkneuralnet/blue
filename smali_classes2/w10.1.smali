.class public interface abstract Lw10;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&JL\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u0007\u0012\u0004\u0012\u00020\u00020\u000e0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000cH&\u00a8\u0006\u0011"
    }
    d2 = {
        "Lw10;",
        "",
        "",
        "userId",
        "Lco/bird/android/model/constant/PaymentProvider;",
        "kind",
        "Lio/reactivex/F;",
        "LHM4;",
        "Lco/bird/api/request/BraintreeTokenResponse;",
        "d",
        "email",
        "nonce",
        "Lco/bird/android/model/PaymentAddSource;",
        "source",
        "Lkotlin/Pair;",
        "Lco/bird/api/request/SetDefaultProviderBody;",
        "c",
        "core-interface_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/PaymentProvider;Lco/bird/android/model/PaymentAddSource;)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/PaymentProvider;",
            "Lco/bird/android/model/PaymentAddSource;",
            ")",
            "Lio/reactivex/F<",
            "Lkotlin/Pair<",
            "LHM4<",
            "Lco/bird/api/request/SetDefaultProviderBody;",
            ">;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract d(Ljava/lang/String;Lco/bird/android/model/constant/PaymentProvider;)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/PaymentProvider;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/api/request/BraintreeTokenResponse;",
            ">;>;"
        }
    .end annotation
.end method
