.class public final Lfv6$q;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfv6;-><init>(Landroid/content/Context;Landroid/os/Handler;Lcom/uber/autodispose/ScopeProvider;Lrv6;Le13;Lgl;LTq4;Ldr4;Landroid/hardware/SensorManager;LEa;LDQ3;LYR4;LoF3;Ltm;Lbn;LcD1;Lco/bird/android/model/wire/WireRide;Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LZ84<",
        "Lkotlin/Triple<",
        "+",
        "Ljava/lang/Boolean;",
        "+",
        "LFH3;",
        "+",
        "Ljava/lang/Boolean;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001ad\u0012`\u0012^\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*.\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LZ84;",
        "Lkotlin/Triple;",
        "",
        "kotlin.jvm.PlatformType",
        "LFH3;",
        "invoke",
        "()LZ84;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nVpsParkingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VpsParkingPresenter.kt\nco/bird/android/feature/ar/parking/VpsParkingPresenter$scanModePropertyObservable$2\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n*L\n1#1,1138:1\n61#2,2:1139\n*S KotlinDebug\n*F\n+ 1 VpsParkingPresenter.kt\nco/bird/android/feature/ar/parking/VpsParkingPresenter$scanModePropertyObservable$2\n*L\n213#1:1139,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lfv6;


# direct methods
.method public constructor <init>(Lfv6;)V
    .locals 0

    iput-object p1, p0, Lfv6$q;->g:Lfv6;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()LZ84;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Lkotlin/Triple<",
            "Ljava/lang/Boolean;",
            "LFH3;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    sget-object v0, Lee3;->a:Lee3;

    iget-object v0, p0, Lfv6$q;->g:Lfv6;

    invoke-static {v0}, Lfv6;->access$getHasMetAccuracyRequirementRelay$p(Lfv6;)La94;

    move-result-object v0

    iget-object v1, p0, Lfv6$q;->g:Lfv6;

    invoke-static {v1}, Lfv6;->access$getParkingStateRelay$p(Lfv6;)La94;

    move-result-object v1

    iget-object v2, p0, Lfv6$q;->g:Lfv6;

    invoke-static {v2}, Lfv6;->access$getHasScannedBarcodeRelay$p(Lfv6;)La94;

    move-result-object v2

    sget-object v3, Lfv6$q$a;->a:Lfv6$q$a;

    invoke-static {v0, v1, v2, v3}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/h;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "combineLatest(source1, s\u2026 -> Triple(t1, t2, t3) })"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LZ84;->d:LZ84$a;

    new-instance v2, Lkotlin/Triple;

    iget-object v3, p0, Lfv6$q;->g:Lfv6;

    invoke-static {v3}, Lfv6;->access$getHasMetAccuracyRequirementRelay$p(Lfv6;)La94;

    move-result-object v3

    invoke-virtual {v3}, La94;->getValue()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lfv6$q;->g:Lfv6;

    invoke-static {v4}, Lfv6;->access$getParkingStateRelay$p(Lfv6;)La94;

    move-result-object v4

    invoke-virtual {v4}, La94;->getValue()Ljava/lang/Object;

    move-result-object v4

    iget-object v5, p0, Lfv6$q;->g:Lfv6;

    invoke-static {v5}, Lfv6;->access$getHasScannedBarcodeRelay$p(Lfv6;)La94;

    move-result-object v5

    invoke-virtual {v5}, La94;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v0, v2}, LZ84$a;->c(Lio/reactivex/Observable;Ljava/lang/Object;)LZ84;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lfv6$q;->invoke()LZ84;

    move-result-object v0

    return-object v0
.end method
