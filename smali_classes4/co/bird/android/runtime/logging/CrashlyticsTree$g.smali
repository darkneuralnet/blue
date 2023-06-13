.class public final Lco/bird/android/runtime/logging/CrashlyticsTree$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/runtime/logging/CrashlyticsTree;-><init>(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;Ldr4;LTq4;LBc;LRh6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/location/Location;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Landroid/location/Location;",
        "kotlin.jvm.PlatformType",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCrashlyticsTree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashlyticsTree.kt\nco/bird/android/runtime/logging/CrashlyticsTree$7\n+ 2 Location.kt\nandroidx/core/location/LocationKt\n*L\n1#1,112:1\n32#2:113\n43#2:114\n*S KotlinDebug\n*F\n+ 1 CrashlyticsTree.kt\nco/bird/android/runtime/logging/CrashlyticsTree$7\n*L\n67#1:113\n67#1:114\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/runtime/logging/CrashlyticsTree;


# direct methods
.method public constructor <init>(Lco/bird/android/runtime/logging/CrashlyticsTree;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/runtime/logging/CrashlyticsTree$g;->g:Lco/bird/android/runtime/logging/CrashlyticsTree;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/location/Location;

    invoke-virtual {p0, p1}, Lco/bird/android/runtime/logging/CrashlyticsTree$g;->invoke(Landroid/location/Location;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/location/Location;)V
    .locals 5

    const-string v0, "(latitude, longitude)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    iget-object p1, p0, Lco/bird/android/runtime/logging/CrashlyticsTree$g;->g:Lco/bird/android/runtime/logging/CrashlyticsTree;

    invoke-static {p1}, Lco/bird/android/runtime/logging/CrashlyticsTree;->access$getCrashlytics$p(Lco/bird/android/runtime/logging/CrashlyticsTree;)Lcom/google/firebase/crashlytics/FirebaseCrashlytics;

    move-result-object p1

    const-string v4, "location_latitude"

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v4, v0}, Lcom/google/firebase/crashlytics/FirebaseCrashlytics;->setCustomKey(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/runtime/logging/CrashlyticsTree$g;->g:Lco/bird/android/runtime/logging/CrashlyticsTree;

    invoke-static {p1}, Lco/bird/android/runtime/logging/CrashlyticsTree;->access$getCrashlytics$p(Lco/bird/android/runtime/logging/CrashlyticsTree;)Lcom/google/firebase/crashlytics/FirebaseCrashlytics;

    move-result-object p1

    const-string v0, "location_longitude"

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/google/firebase/crashlytics/FirebaseCrashlytics;->setCustomKey(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
