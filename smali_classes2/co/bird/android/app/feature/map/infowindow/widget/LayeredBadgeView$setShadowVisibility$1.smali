.class final Lco/bird/android/app/feature/map/infowindow/widget/LayeredBadgeView$setShadowVisibility$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/infowindow/widget/LayeredBadgeView;->setShadowVisibility$default(Lco/bird/android/app/feature/map/infowindow/widget/LayeredBadgeView;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/widget/ImageView;",
        "Lco/bird/android/app/feature/map/renderer/ShadowInitParams;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "Lco/bird/android/app/feature/map/renderer/ShadowInitParams;",
        "it",
        "Landroid/widget/ImageView;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lco/bird/android/app/feature/map/infowindow/widget/LayeredBadgeView;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/infowindow/widget/LayeredBadgeView;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/infowindow/widget/LayeredBadgeView$setShadowVisibility$1;->this$0:Lco/bird/android/app/feature/map/infowindow/widget/LayeredBadgeView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroid/widget/ImageView;)Lco/bird/android/app/feature/map/renderer/ShadowInitParams;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/infowindow/widget/LayeredBadgeView$setShadowVisibility$1;->this$0:Lco/bird/android/app/feature/map/infowindow/widget/LayeredBadgeView;

    invoke-static {v0, p1}, Lco/bird/android/app/feature/map/infowindow/widget/LayeredBadgeView;->access$computeShadowParams(Lco/bird/android/app/feature/map/infowindow/widget/LayeredBadgeView;Landroid/widget/ImageView;)Lco/bird/android/app/feature/map/renderer/ShadowInitParams;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/infowindow/widget/LayeredBadgeView$setShadowVisibility$1;->invoke(Landroid/widget/ImageView;)Lco/bird/android/app/feature/map/renderer/ShadowInitParams;

    move-result-object p1

    return-object p1
.end method
