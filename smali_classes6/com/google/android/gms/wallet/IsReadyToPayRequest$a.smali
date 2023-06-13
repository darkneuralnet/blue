.class public final Lcom/google/android/gms/wallet/IsReadyToPayRequest$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wallet/IsReadyToPayRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final synthetic a:Lcom/google/android/gms/wallet/IsReadyToPayRequest;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/wallet/IsReadyToPayRequest;Lqd9;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wallet/IsReadyToPayRequest$a;->a:Lcom/google/android/gms/wallet/IsReadyToPayRequest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Lcom/google/android/gms/wallet/IsReadyToPayRequest$a;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/IsReadyToPayRequest$a;->a:Lcom/google/android/gms/wallet/IsReadyToPayRequest;

    iget-object v1, v0, Lcom/google/android/gms/wallet/IsReadyToPayRequest;->e:Ljava/util/ArrayList;

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/google/android/gms/wallet/IsReadyToPayRequest;->e:Ljava/util/ArrayList;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/wallet/IsReadyToPayRequest$a;->a:Lcom/google/android/gms/wallet/IsReadyToPayRequest;

    iget-object v0, v0, Lcom/google/android/gms/wallet/IsReadyToPayRequest;->e:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b()Lcom/google/android/gms/wallet/IsReadyToPayRequest;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/IsReadyToPayRequest$a;->a:Lcom/google/android/gms/wallet/IsReadyToPayRequest;

    return-object v0
.end method
