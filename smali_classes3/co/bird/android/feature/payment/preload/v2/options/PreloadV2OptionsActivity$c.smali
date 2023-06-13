.class public final Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LTx0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->Y(Ljava/util/Map;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\"\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "co/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity$c",
        "LTx0;",
        "",
        "",
        "",
        "metadata",
        "Lio/reactivex/p;",
        "",
        "b",
        "",
        "success",
        "c",
        "co.bird.android.feature.payment"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic b:Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity$c;->b:Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/util/Map;)Lio/reactivex/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/reactivex/p<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    const-string v0, "metadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity$c;->b:Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;

    invoke-virtual {v0}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->d0()LJ14;

    move-result-object v0

    invoke-virtual {v0, p1}, LJ14;->b(Ljava/util/Map;)Lio/reactivex/p;

    move-result-object p1

    return-object p1
.end method

.method public c(Z)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity$c;->b:Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;

    invoke-virtual {v0}, Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;->d0()LJ14;

    move-result-object v0

    invoke-virtual {v0, p1}, LJ14;->c(Z)V

    return-void
.end method
