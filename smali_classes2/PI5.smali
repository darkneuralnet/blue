.class public final synthetic LPI5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Lco/bird/android/app/manager/SmartlockManagerImpl;

.field public final synthetic c:Lco/bird/android/model/wire/WireSmartlock;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPI5;->b:Lco/bird/android/app/manager/SmartlockManagerImpl;

    iput-object p2, p0, LPI5;->c:Lco/bird/android/model/wire/WireSmartlock;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LPI5;->b:Lco/bird/android/app/manager/SmartlockManagerImpl;

    iget-object v1, p0, LPI5;->c:Lco/bird/android/model/wire/WireSmartlock;

    invoke-static {v0, v1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->L(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;)V

    return-void
.end method
