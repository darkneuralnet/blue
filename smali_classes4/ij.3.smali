.class public final Lij;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Landroid/bluetooth/BluetoothAdapter;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lhj;


# direct methods
.method public constructor <init>(Lhj;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lij;->a:Lhj;

    return-void
.end method

.method public static a(Lhj;)Landroid/bluetooth/BluetoothAdapter;
    .locals 0

    invoke-virtual {p0}, Lhj;->a()Landroid/bluetooth/BluetoothAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lhj;)Lij;
    .locals 1

    new-instance v0, Lij;

    invoke-direct {v0, p0}, Lij;-><init>(Lhj;)V

    return-object v0
.end method


# virtual methods
.method public c()Landroid/bluetooth/BluetoothAdapter;
    .locals 1

    iget-object v0, p0, Lij;->a:Lhj;

    invoke-static {v0}, Lij;->a(Lhj;)Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lij;->c()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    return-object v0
.end method
