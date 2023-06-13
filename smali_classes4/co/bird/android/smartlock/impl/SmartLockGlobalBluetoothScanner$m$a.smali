.class public final Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$m$a;
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
        "Lio/reactivex/disposables/c;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lio/reactivex/disposables/c;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lio/reactivex/disposables/c;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LsE5;

.field public final synthetic h:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;


# direct methods
.method public constructor <init>(LsE5;Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$m$a;->g:LsE5;

    iput-object p2, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$m$a;->h:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lio/reactivex/disposables/c;)V
    .locals 3

    iget-object p1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$m$a;->g:LsE5;

    invoke-virtual {p1}, LsE5;->e()Ljava/lang/Boolean;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$m$a;->h:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;

    iget-object v0, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$m$a;->g:LsE5;

    invoke-virtual {v0}, LsE5;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v1

    const-string v2, "now()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$a;->c:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$a;

    invoke-static {p1, v0, v1, v2}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->access$recordAction(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$a;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/disposables/c;

    invoke-virtual {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$m$a;->a(Lio/reactivex/disposables/c;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
