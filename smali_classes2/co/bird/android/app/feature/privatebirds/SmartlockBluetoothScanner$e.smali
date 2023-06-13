.class public final Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;->onStart(LLifecycleOwner;)V
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
        "enabled",
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
.field public final synthetic g:Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner$e;->g:Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner$e;->invoke(Ljava/lang/Boolean;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Boolean;)V
    .locals 2

    const-string v0, "enabled"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner$e;->g:Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;

    invoke-static {p1}, Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;->access$getLogger(Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;)Lg46$b;

    move-result-object p1

    const-string v1, "Starting legacy private physical lock bluetooth scanning due to FF enabled"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p1, v1, v0}, Lg46$b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner$e;->g:Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;

    invoke-static {p1}, Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;->access$getDisposables$p(Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;)Lio/reactivex/disposables/b;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner$e;->g:Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;

    invoke-static {v0}, Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;->access$start(Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;)Lio/reactivex/disposables/c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/disposables/b;->c(Lio/reactivex/disposables/c;)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner$e;->g:Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;

    invoke-static {p1}, Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;->access$getLogger(Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;)Lg46$b;

    move-result-object p1

    const-string v1, "Stopping legacy private physical lock bluetooth scanning due to FF disabled"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p1, v1, v0}, Lg46$b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner$e;->g:Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;

    invoke-static {p1}, Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;->access$getDisposables$p(Lco/bird/android/app/feature/privatebirds/SmartlockBluetoothScanner;)Lio/reactivex/disposables/b;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/disposables/b;->d()V

    :goto_0
    return-void
.end method
