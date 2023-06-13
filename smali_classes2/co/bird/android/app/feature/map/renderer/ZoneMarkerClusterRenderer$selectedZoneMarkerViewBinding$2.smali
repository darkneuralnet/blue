.class final Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer$selectedZoneMarkerViewBinding$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;-><init>(LGl0;LcD1;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lrs6;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lrs6;",
        "invoke",
        "()Lrs6;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic this$0:Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer$selectedZoneMarkerViewBinding$2;->this$0:Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer$selectedZoneMarkerViewBinding$2;->invoke()Lrs6;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lrs6;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer$selectedZoneMarkerViewBinding$2;->this$0:Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;

    invoke-static {v0}, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;->access$getContext$p(Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-static {v0}, Lss6;->c(Landroid/view/LayoutInflater;)Lss6;

    move-result-object v0

    invoke-virtual {v0}, Lss6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-static {v0}, Lrs6;->a(Landroid/view/View;)Lrs6;

    move-result-object v0

    return-object v0
.end method
