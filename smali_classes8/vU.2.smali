.class public final synthetic LvU;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LkG;


# instance fields
.field public final synthetic a:LxU;


# direct methods
.method public synthetic constructor <init>(LxU;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LvU;->a:LxU;

    return-void
.end method


# virtual methods
.method public final a(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    iget-object v0, p0, LvU;->a:LxU;

    invoke-static {v0, p1}, LxU;->t(LxU;Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method
