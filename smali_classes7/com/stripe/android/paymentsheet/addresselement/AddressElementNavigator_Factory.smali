.class public final Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator_Factory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator_Factory;
    .locals 1

    invoke-static {}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator_Factory$InstanceHolder;->a()Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator_Factory;

    move-result-object v0

    return-object v0
.end method

.method public static newInstance()Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;-><init>()V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;
    .locals 1

    invoke-static {}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator_Factory;->newInstance()Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator_Factory;->get()Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;

    move-result-object v0

    return-object v0
.end method
