.class public final synthetic LHX;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDj1;


# instance fields
.field public final synthetic a:Ln74;

.field public final synthetic b:Lvy0;


# direct methods
.method public synthetic constructor <init>(Ln74;Lvy0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHX;->a:Ln74;

    iput-object p2, p0, LHX;->b:Lvy0;

    return-void
.end method


# virtual methods
.method public final a(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 2

    iget-object v0, p0, LHX;->a:Ln74;

    iget-object v1, p0, LHX;->b:Lvy0;

    invoke-static {v0, v1, p1, p2}, LFX$b;->e(Ln74;Lvy0;Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method
