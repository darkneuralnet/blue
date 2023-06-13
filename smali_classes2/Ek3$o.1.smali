.class public final LEk3$o;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LEk3;->Z()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/BountyFlightSheetButton;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/BountyFlightSheetButton;",
        "kotlin.jvm.PlatformType",
        "button",
        "",
        "a",
        "(Lco/bird/android/model/BountyFlightSheetButton;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LEk3;


# direct methods
.method public constructor <init>(LEk3;)V
    .locals 0

    iput-object p1, p0, LEk3$o;->g:LEk3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/BountyFlightSheetButton;)V
    .locals 8

    instance-of v0, p1, Lco/bird/android/model/DirectionsButton;

    if-eqz v0, :cond_0

    iget-object v0, p0, LEk3$o;->g:LEk3;

    invoke-static {v0}, LEk3;->access$getNavigator$p(LEk3;)Le13;

    move-result-object v0

    sget-object v1, LYw2;->a:LYw2;

    new-instance v2, Lcom/google/android/gms/maps/model/LatLng;

    check-cast p1, Lco/bird/android/model/DirectionsButton;

    invoke-virtual {p1}, Lco/bird/android/model/DirectionsButton;->getPoint()Lco/bird/android/model/Point;

    move-result-object v3

    iget-wide v3, v3, Lco/bird/android/model/Point;->y:D

    invoke-virtual {p1}, Lco/bird/android/model/DirectionsButton;->getPoint()Lco/bird/android/model/Point;

    move-result-object p1

    iget-wide v5, p1, Lco/bird/android/model/Point;->x:D

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v1, v2}, LYw2;->i(Lcom/google/android/gms/maps/model/LatLng;)Landroid/location/Location;

    move-result-object p1

    invoke-interface {v0, p1}, Le13;->u2(Landroid/location/Location;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lco/bird/android/model/CopyTextButton;

    if-eqz v0, :cond_1

    iget-object v0, p0, LEk3$o;->g:LEk3;

    invoke-static {v0}, LEk3;->access$getClipboardManager$p(LEk3;)LTk0;

    move-result-object v0

    check-cast p1, Lco/bird/android/model/CopyTextButton;

    invoke-virtual {p1}, Lco/bird/android/model/CopyTextButton;->getText()Ljava/lang/String;

    move-result-object v1

    const-string v2, "city_complaint"

    invoke-interface {v0, v2, v1}, LTk0;->a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    iget-object v0, p0, LEk3$o;->g:LEk3;

    invoke-static {v0}, LEk3;->access$getUi$p(LEk3;)LPk3;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/CopyTextButton;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, LaM5;->snackToast(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lco/bird/android/model/ExternalLinkButton;

    if-eqz v0, :cond_2

    iget-object v0, p0, LEk3$o;->g:LEk3;

    invoke-static {v0}, LEk3;->access$getNavigator$p(LEk3;)Le13;

    move-result-object v1

    check-cast p1, Lco/bird/android/model/ExternalLinkButton;

    invoke-virtual {p1}, Lco/bird/android/model/ExternalLinkButton;->getUrl()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xe

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Le13$a;->goToWebView$default(Le13;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZILjava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/BountyFlightSheetButton;

    invoke-virtual {p0, p1}, LEk3$o;->a(Lco/bird/android/model/BountyFlightSheetButton;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
