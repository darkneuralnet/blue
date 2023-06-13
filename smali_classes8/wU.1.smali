.class public final synthetic LwU;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LyT5;


# instance fields
.field public final synthetic a:LxU;


# direct methods
.method public synthetic constructor <init>(LxU;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LwU;->a:LxU;

    return-void
.end method


# virtual methods
.method public final c(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    iget-object v0, p0, LwU;->a:LxU;

    invoke-static {v0, p1}, LxU;->u(LxU;Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method
