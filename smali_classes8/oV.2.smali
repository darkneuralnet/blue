.class public final synthetic LoV;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lno/nordicsemi/android/ble/BleManagerHandler$g;


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LoV;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LoV;->a:Ljava/lang/String;

    invoke-static {v0}, Lno/nordicsemi/android/ble/BleManagerHandler;->H0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
