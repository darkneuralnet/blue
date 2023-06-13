.class public final synthetic LlI4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lno/nordicsemi/android/ble/u0;


# direct methods
.method public synthetic constructor <init>(Lno/nordicsemi/android/ble/u0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LlI4;->b:Lno/nordicsemi/android/ble/u0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LlI4;->b:Lno/nordicsemi/android/ble/u0;

    invoke-static {v0}, Lno/nordicsemi/android/ble/u0;->b(Lno/nordicsemi/android/ble/u0;)V

    return-void
.end method
