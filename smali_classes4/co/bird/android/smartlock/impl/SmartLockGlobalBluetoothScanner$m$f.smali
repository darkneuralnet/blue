.class public final Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$m$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$m;->h(LsE5;)Lio/reactivex/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
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


# instance fields
.field public final synthetic g:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;

.field public final synthetic h:LsE5;


# direct methods
.method public constructor <init>(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;LsE5;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$m$f;->g:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;

    iput-object p2, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$m$f;->h:LsE5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$m$f;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Error on in smart lock connect step: "

    invoke-static {p1, v1, v0}, Lg46;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$m$f;->g:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;

    invoke-static {v0}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->access$getSmartLockManager$p(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;)LhF5;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$m$f;->h:LsE5;

    const-string v2, "smartLock"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "it"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1, p1}, LhF5;->b(LsE5;Ljava/lang/Throwable;)V

    return-void
.end method