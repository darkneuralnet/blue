.class public final Lco/bird/android/app/manager/SmartlockManagerImpl$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/manager/SmartlockManagerImpl;-><init>(Landroid/content/Context;Lde5;LhI5;LMD;LEa;LYR4;LTq4;Lgl;LMc2;LDX;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "enabledV2",
        "",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Boolean;)V"
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
.field public final synthetic g:Lco/bird/android/app/manager/SmartlockManagerImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/app/manager/SmartlockManagerImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$f;->g:Lco/bird/android/app/manager/SmartlockManagerImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl$f;->invoke(Ljava/lang/Boolean;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Boolean;)V
    .locals 1

    const-string v0, "enabledV2"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string p1, "disabling legacy smart lock manager flow"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$f;->g:Lco/bird/android/app/manager/SmartlockManagerImpl;

    invoke-static {p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->access$getDisposables$p(Lco/bird/android/app/manager/SmartlockManagerImpl;)Lio/reactivex/disposables/b;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/disposables/b;->d()V

    goto :goto_0

    :cond_0
    const-string p1, "enabling legacy smart lock manager flow"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$f;->g:Lco/bird/android/app/manager/SmartlockManagerImpl;

    invoke-static {p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->access$restartLastRideLockAvailabilityIfNeeded(Lco/bird/android/app/manager/SmartlockManagerImpl;)Lio/reactivex/disposables/c;

    iget-object p1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$f;->g:Lco/bird/android/app/manager/SmartlockManagerImpl;

    invoke-static {p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->access$listenForRideStateChanges(Lco/bird/android/app/manager/SmartlockManagerImpl;)Lio/reactivex/disposables/c;

    :goto_0
    return-void
.end method
