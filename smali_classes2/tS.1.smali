.class public final LtS;
.super LxE;
.source "SourceFile"

# interfaces
.implements LsS;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u001c\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001a\u0010\u0008\u001a\u00020\u00072\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00070\tH\u0016J(\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016R\u0017\u0010\u0016\u001a\u00020\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00178\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001f"
    }
    d2 = {
        "LtS;",
        "LsS;",
        "LxE;",
        "Lco/bird/android/model/wire/WireRidePrice;",
        "ridePrice",
        "",
        "maxLines",
        "",
        "Ji",
        "Lio/reactivex/Observable;",
        "G1",
        "",
        "promotionText",
        "holdString",
        "Lio/reactivex/F;",
        "Lco/bird/android/model/DialogResponse;",
        "af",
        "LuS;",
        "b",
        "LuS;",
        "getBanner",
        "()LuS;",
        "banner",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "c",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "getActivity",
        "()Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(LuS;Lco/bird/android/core/mvp/BaseActivity;)V",
        "app_birdRelease"
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
        "SMAP\nBirdRidePriceBannerUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdRidePriceBannerUi.kt\nco/bird/android/app/feature/banners/ui/BirdRidePriceBannerUiImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n1#2:44\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LuS;

.field public final c:Lco/bird/android/core/mvp/BaseActivity;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LuS;Lco/bird/android/core/mvp/BaseActivity;)V
    .locals 1

    const-string v0, "banner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p1, p0, LtS;->b:LuS;

    iput-object p2, p0, LtS;->c:Lco/bird/android/core/mvp/BaseActivity;

    return-void
.end method


# virtual methods
.method public G1()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LtS;->b:LuS;

    invoke-interface {v0}, LuS;->G1()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public Ji(Lco/bird/android/model/wire/WireRidePrice;I)V
    .locals 2

    if-eqz p1, :cond_0

    sget-object v0, Lr24;->a:Lr24;

    iget-object v1, p0, LtS;->b:LuS;

    invoke-interface {v1}, LuS;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lr24;->a(Landroid/content/Context;Lco/bird/android/model/wire/WireRidePrice;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, LtS;->b:LuS;

    invoke-interface {v0, p1, p2}, LuS;->setPriceString(Ljava/lang/String;I)V

    return-void
.end method

.method public af(Lco/bird/android/model/wire/WireRidePrice;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireRidePrice;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "ridePrice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promotionText"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lw24;

    sget-object v1, Lr24;->a:Lr24;

    iget-object v2, p0, LtS;->b:LuS;

    invoke-interface {v2}, LuS;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Lr24;->a(Landroid/content/Context;Lco/bird/android/model/wire/WireRidePrice;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p3}, Lw24;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-virtual {p0, v0, p1, p1}, LXC;->dialog(LNy;ZZ)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getActivity()Landroidx/appcompat/app/AppCompatActivity;
    .locals 1

    invoke-virtual {p0}, LtS;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v0

    return-object v0
.end method

.method public getActivity()Lco/bird/android/core/mvp/BaseActivity;
    .locals 1

    iget-object v0, p0, LtS;->c:Lco/bird/android/core/mvp/BaseActivity;

    return-object v0
.end method
