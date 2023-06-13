.class public final Lco/bird/android/app/feature/merchant/MerchantLocationEditActivity;
.super Lco/bird/android/core/map/BaseMapActivity;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0014X\u0094\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168TX\u0094\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001e"
    }
    d2 = {
        "Lco/bird/android/app/feature/merchant/MerchantLocationEditActivity;",
        "Lco/bird/android/core/map/BaseMapActivity;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "LcD1;",
        "map",
        "A0",
        "LUQ2;",
        "H",
        "LUQ2;",
        "B0",
        "()LUQ2;",
        "setLocationEditPresenter",
        "(LUQ2;)V",
        "locationEditPresenter",
        "",
        "I",
        "o0",
        "()I",
        "layoutResource",
        "Lcom/google/android/gms/maps/MapView;",
        "J",
        "Lkotlin/Lazy;",
        "n0",
        "()Lcom/google/android/gms/maps/MapView;",
        "googleMapView",
        "<init>",
        "()V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public H:LUQ2;

.field public final I:I

.field public final J:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lco/bird/android/core/map/BaseMapActivity;-><init>(Z)V

    sget v0, Lcj4;->activity_merchant_location_edit:I

    iput v0, p0, Lco/bird/android/app/feature/merchant/MerchantLocationEditActivity;->I:I

    sget-object v0, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    new-instance v1, Lco/bird/android/app/feature/merchant/MerchantLocationEditActivity$a;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/merchant/MerchantLocationEditActivity$a;-><init>(Lco/bird/android/app/feature/merchant/MerchantLocationEditActivity;)V

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/app/feature/merchant/MerchantLocationEditActivity;->J:Lkotlin/Lazy;

    return-void
.end method


# virtual methods
.method public A0(LcD1;)V
    .locals 1

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lco/bird/android/core/map/BaseMapActivity;->A0(LcD1;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/merchant/MerchantLocationEditActivity;->B0()LUQ2;

    move-result-object p1

    invoke-interface {p1}, LUQ2;->onResume()V

    return-void
.end method

.method public final B0()LUQ2;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/merchant/MerchantLocationEditActivity;->H:LUQ2;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "locationEditPresenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public n0()Lcom/google/android/gms/maps/MapView;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/merchant/MerchantLocationEditActivity;->J:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-googleMapView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/google/android/gms/maps/MapView;

    return-object v0
.end method

.method public o0()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/merchant/MerchantLocationEditActivity;->I:I

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Lco/bird/android/core/map/BaseMapActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->D()V

    invoke-static {}, Lco/bird/android/app/feature/merchant/a;->a()Lco/bird/android/app/feature/merchant/b$a;

    move-result-object p1

    sget-object v0, LoG2;->a:LoG2;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "applicationContext"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v0

    invoke-interface {p1, v0, p0}, Lco/bird/android/app/feature/merchant/b$a;->a(LlG2;Lco/bird/android/core/mvp/BaseActivity;)Lco/bird/android/app/feature/merchant/b;

    move-result-object p1

    invoke-interface {p1, p0}, Lco/bird/android/app/feature/merchant/b;->a(Lco/bird/android/app/feature/merchant/MerchantLocationEditActivity;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/merchant/MerchantLocationEditActivity;->B0()LUQ2;

    move-result-object p1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "merchant_site_id"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "merchant_id"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "location"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v2, Lco/bird/android/model/wire/WireLocation;

    invoke-interface {p1, v0, v1, v2}, LUQ2;->a(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;)V

    return-void
.end method
