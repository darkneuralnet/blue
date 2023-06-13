.class public final synthetic LXE5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;

.field public final synthetic c:LsE5;

.field public final synthetic d:Lcy0;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;LsE5;Lcy0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXE5;->b:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;

    iput-object p2, p0, LXE5;->c:LsE5;

    iput-object p3, p0, LXE5;->d:Lcy0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LXE5;->b:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;

    iget-object v1, p0, LXE5;->c:LsE5;

    iget-object v2, p0, LXE5;->d:Lcy0;

    invoke-static {v0, v1, v2}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$n;->a(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;LsE5;Lcy0;)V

    return-void
.end method
