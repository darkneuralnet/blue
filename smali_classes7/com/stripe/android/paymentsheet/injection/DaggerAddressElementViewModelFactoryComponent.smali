.class public final Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AddressElementViewModelFactoryComponentImpl;,
        Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$FormControllerSubcomponentImpl;,
        Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AutocompleteViewModelSubcomponentImpl;,
        Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$InputAddressViewModelSubcomponentImpl;,
        Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$FormControllerSubcomponentBuilder;,
        Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$AutocompleteViewModelSubcomponentBuilder;,
        Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$InputAddressViewModelSubcomponentBuilder;,
        Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$Builder;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelFactoryComponent$Builder;
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/injection/DaggerAddressElementViewModelFactoryComponent$Builder;-><init>(LzG0;)V

    return-object v0
.end method
