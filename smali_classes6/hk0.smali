.class public final Lhk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhk0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Landroid/bluetooth/BluetoothAdapter;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lhk0;
    .locals 1

    invoke-static {}, Lhk0$a;->a()Lhk0;

    move-result-object v0

    return-object v0
.end method

.method public static c()Landroid/bluetooth/BluetoothAdapter;
    .locals 1

    invoke-static {}, Lgk0$c;->a()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b()Landroid/bluetooth/BluetoothAdapter;
    .locals 1

    invoke-static {}, Lhk0;->c()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lhk0;->b()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    return-object v0
.end method
