.class public final Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$k;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->D(LsE5;Lco/bird/android/model/persistence/Bird;)Lio/reactivex/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/itemlease/LeaseStartResponse;",
        "Lio/reactivex/u<",
        "+",
        "Lcy0<",
        "LjI5;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lco/bird/android/model/itemlease/LeaseStartResponse;",
        "it",
        "Lio/reactivex/u;",
        "Lcy0;",
        "LjI5;",
        "kotlin.jvm.PlatformType",
        "c",
        "(Lco/bird/android/model/itemlease/LeaseStartResponse;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;

.field public final synthetic h:LsE5;


# direct methods
.method public constructor <init>(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;LsE5;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$k;->g:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;

    iput-object p2, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$k;->h:LsE5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$k;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$k;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Lco/bird/android/model/itemlease/LeaseStartResponse;)Lio/reactivex/u;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/itemlease/LeaseStartResponse;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "Lcy0<",
            "LjI5;",
            ">;>;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "lease started, connecting to lock now"

    invoke-static {v0, p1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$k;->g:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;

    invoke-static {p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->access$getSmartLockManager$p(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;)LhF5;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$k;->h:LsE5;

    sget-object v1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    invoke-virtual {v1}, Lkotlin/time/Duration$Companion;->getINFINITE-UwyO8pc()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, LhF5;->c(LsE5;J)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$k$a;

    iget-object v1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$k;->g:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;

    iget-object v2, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$k;->h:LsE5;

    invoke-direct {v0, v1, v2}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$k$a;-><init>(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;LsE5;)V

    new-instance v1, LOE5;

    invoke-direct {v1, v0}, LOE5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    sget-object v0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$k$b;->g:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$k$b;

    new-instance v1, LPE5;

    invoke-direct {v1, v0}, LPE5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->t(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->j0()Lio/reactivex/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/itemlease/LeaseStartResponse;

    invoke-virtual {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$k;->c(Lco/bird/android/model/itemlease/LeaseStartResponse;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
