.class public final Lrv6$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrv6;-><init>(Lco/bird/android/core/mvp/BaseActivity;Ls6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lco/bird/android/feature/ar/view/SemiCircleMapView;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lco/bird/android/feature/ar/view/SemiCircleMapView;",
        "b",
        "()Lco/bird/android/feature/ar/view/SemiCircleMapView;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lrv6;


# direct methods
.method public constructor <init>(Lrv6;)V
    .locals 0

    iput-object p1, p0, Lrv6$b;->g:Lrv6;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Lco/bird/android/feature/ar/view/SemiCircleMapView;
    .locals 1

    iget-object v0, p0, Lrv6$b;->g:Lrv6;

    invoke-static {v0}, Lrv6;->access$getBinding$p(Lrv6;)Ls6;

    move-result-object v0

    iget-object v0, v0, Ls6;->f:Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;

    invoke-virtual {v0}, Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;->i()Lco/bird/android/feature/ar/view/SemiCircleMapView;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lrv6$b;->b()Lco/bird/android/feature/ar/view/SemiCircleMapView;

    move-result-object v0

    return-object v0
.end method
