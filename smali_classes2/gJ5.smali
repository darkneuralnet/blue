.class public final synthetic LgJ5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lco/bird/android/app/manager/SmartlockManagerImpl;

.field public final synthetic c:Lco/bird/android/model/wire/WireSmartlock;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LgJ5;->b:Lco/bird/android/app/manager/SmartlockManagerImpl;

    iput-object p2, p0, LgJ5;->c:Lco/bird/android/model/wire/WireSmartlock;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LgJ5;->b:Lco/bird/android/app/manager/SmartlockManagerImpl;

    iget-object v1, p0, LgJ5;->c:Lco/bird/android/model/wire/WireSmartlock;

    invoke-static {v0, v1}, Lco/bird/android/app/manager/SmartlockManagerImpl$n;->c(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;)Lio/reactivex/B;

    move-result-object v0

    return-object v0
.end method
