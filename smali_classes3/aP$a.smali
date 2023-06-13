.class public final LaP$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LaP;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LaP$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LXa2;",
        "b",
        "LXa2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LaP;Landroid/view/View;)V",
        "bird-plus_release"
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
        "SMAP\nBirdPlusAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusAdapter.kt\nco/bird/android/feature/birdplus/v1/list/adapter/BirdPlusAdapter$BirdPlusHeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,79:1\n18#2:80\n9#3,4:81\n*S KotlinDebug\n*F\n+ 1 BirdPlusAdapter.kt\nco/bird/android/feature/birdplus/v1/list/adapter/BirdPlusAdapter$BirdPlusHeaderViewHolder\n*L\n49#1:80\n49#1:81,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LXa2;

.field public final synthetic c:LaP;


# direct methods
.method public constructor <init>(LaP;Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LaP$a;->c:LaP;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LXa2;->a(Landroid/view/View;)LXa2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LaP$a;->b:LXa2;

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 3

    invoke-super {p0, p1}, Lw1;->bind(I)V

    iget-object v0, p0, LaP$a;->c:LaP;

    invoke-static {v0}, LaP;->access$getAdapterData(LaP;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LnR;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, LnR;

    if-eqz p1, :cond_3

    iget-object v0, p0, LaP$a;->b:LXa2;

    iget-object v0, v0, LXa2;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, LnR;->d()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LaP$a;->b:LXa2;

    iget-object v0, v0, LXa2;->b:Lcom/airbnb/lottie/LottieAnimationView;

    const-string v2, "binding.heroImage"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LnR;->b()Lco/bird/android/model/persistence/BirdPlusView;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/persistence/BirdPlusView;->getDisplay()Lco/bird/android/model/persistence/BirdPlusDisplayView;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lco/bird/android/model/persistence/BirdPlusDisplayView;->getHeroAnimation()Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;->getMedia()Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    invoke-virtual {p1}, LnR;->b()Lco/bird/android/model/persistence/BirdPlusView;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdPlusView;->getDisplay()Lco/bird/android/model/persistence/BirdPlusDisplayView;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdPlusDisplayView;->getHeroImage()Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;->getMedia()Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    move-result-object v1

    :cond_2
    invoke-static {v0, v2, v1}, LqD2;->a(Lcom/airbnb/lottie/LottieAnimationView;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;)V

    :cond_3
    return-void
.end method
