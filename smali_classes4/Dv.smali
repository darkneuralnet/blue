.class public final synthetic LDv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDj1;


# instance fields
.field public final synthetic a:Lco/bird/android/manager/bluetooth/internal/a;

.field public final synthetic b:Lco/bird/android/model/Vehicle;

.field public final synthetic c:Lco/bird/android/manager/bluetooth/internal/a$c;

.field public final synthetic d:Lio/reactivex/H;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/manager/bluetooth/internal/a;Lco/bird/android/model/Vehicle;Lco/bird/android/manager/bluetooth/internal/a$c;Lio/reactivex/H;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDv;->a:Lco/bird/android/manager/bluetooth/internal/a;

    iput-object p2, p0, LDv;->b:Lco/bird/android/model/Vehicle;

    iput-object p3, p0, LDv;->c:Lco/bird/android/manager/bluetooth/internal/a$c;

    iput-object p4, p0, LDv;->d:Lio/reactivex/H;

    return-void
.end method


# virtual methods
.method public final a(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 6

    iget-object v0, p0, LDv;->a:Lco/bird/android/manager/bluetooth/internal/a;

    iget-object v1, p0, LDv;->b:Lco/bird/android/model/Vehicle;

    iget-object v2, p0, LDv;->c:Lco/bird/android/manager/bluetooth/internal/a$c;

    iget-object v3, p0, LDv;->d:Lio/reactivex/H;

    move-object v4, p1

    move v5, p2

    invoke-static/range {v0 .. v5}, Lco/bird/android/manager/bluetooth/internal/a$h;->a(Lco/bird/android/manager/bluetooth/internal/a;Lco/bird/android/model/Vehicle;Lco/bird/android/manager/bluetooth/internal/a$c;Lio/reactivex/H;Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method
