.class public final Lco/bird/android/manager/analytics/AnalyticsManagerImpl$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/analytics/AnalyticsManagerImpl;-><init>(LOh;LZ9;Lab;Lgl;Ll20;Lde5;LBc;LLifecycleOwner;LTq4;LuQ3;LGI3;Landroid/net/ConnectivityManager;Lo21;Landroid/app/admin/DevicePolicyManager;Landroid/net/wifi/WifiManager;Landroid/telephony/TelephonyManager;Lco/bird/android/manager/analytics/persistence/AnalyticsDatabase;Li66;LRh6;Llj1;Lwm1;Lcom/google/firebase/crashlytics/FirebaseCrashlytics;Ldagger/Lazy;Ldr4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/User;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/User;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/android/model/User;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/manager/analytics/AnalyticsManagerImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$a;->g:Lco/bird/android/manager/analytics/AnalyticsManagerImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/User;)V
    .locals 2

    iget-object v0, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$a;->g:Lco/bird/android/manager/analytics/AnalyticsManagerImpl;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->access$handleLogin(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;Lco/bird/android/model/User;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/User;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$a;->a(Lco/bird/android/model/User;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
