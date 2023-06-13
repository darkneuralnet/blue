.class public final Lco/bird/android/runtime/logging/CrashlyticsTree$a;
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
.field public final synthetic g:Lco/bird/android/runtime/logging/CrashlyticsTree;


# direct methods
.method public constructor <init>(Lco/bird/android/runtime/logging/CrashlyticsTree;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/runtime/logging/CrashlyticsTree$a;->g:Lco/bird/android/runtime/logging/CrashlyticsTree;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/User;)V
    .locals 2

    iget-object v0, p0, Lco/bird/android/runtime/logging/CrashlyticsTree$a;->g:Lco/bird/android/runtime/logging/CrashlyticsTree;

    invoke-static {v0}, Lco/bird/android/runtime/logging/CrashlyticsTree;->access$getCrashlytics$p(Lco/bird/android/runtime/logging/CrashlyticsTree;)Lcom/google/firebase/crashlytics/FirebaseCrashlytics;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/User;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/firebase/crashlytics/FirebaseCrashlytics;->setUserId(Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/runtime/logging/CrashlyticsTree$a;->g:Lco/bird/android/runtime/logging/CrashlyticsTree;

    invoke-static {p1}, Lco/bird/android/runtime/logging/CrashlyticsTree;->access$getCrashlytics$p(Lco/bird/android/runtime/logging/CrashlyticsTree;)Lcom/google/firebase/crashlytics/FirebaseCrashlytics;

    move-result-object p1

    const-string v0, "is_logged_in"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/google/firebase/crashlytics/FirebaseCrashlytics;->setCustomKey(Ljava/lang/String;Z)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/User;

    invoke-virtual {p0, p1}, Lco/bird/android/runtime/logging/CrashlyticsTree$a;->a(Lco/bird/android/model/User;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
