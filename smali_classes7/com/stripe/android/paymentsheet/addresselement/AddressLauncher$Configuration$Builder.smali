.class public final Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u0014\u0010\u000c\u001a\u00020\u00002\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008J\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\r\u001a\u00020\u00002\u0008\u0010\r\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000e\u001a\u00020\u00002\u0008\u0010\u000e\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000f\u001a\u00020\u00002\u0008\u0010\u000f\u001a\u0004\u0018\u00010\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;",
        "",
        "()V",
        "additionalFields",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration;",
        "address",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
        "allowedCountries",
        "",
        "",
        "appearance",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;",
        "autocompleteCountries",
        "buttonTitle",
        "googlePlacesApiKey",
        "title",
        "build",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAddressLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressLauncher.kt\ncom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,221:1\n1#2:222\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private additionalFields:Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration;

.field private address:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

.field private allowedCountries:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private appearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

.field private autocompleteCountries:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private buttonTitle:Ljava/lang/String;

.field private googlePlacesApiKey:Ljava/lang/String;

.field private title:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v8, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1f

    const/4 v7, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v8, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->appearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->allowedCountries:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final additionalFields(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration;)Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;
    .locals 1

    const-string v0, "additionalFields"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->additionalFields:Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration;

    return-object p0
.end method

.method public final address(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->address:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    return-object p0
.end method

.method public final allowedCountries(Ljava/util/Set;)Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;"
        }
    .end annotation

    const-string v0, "allowedCountries"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->allowedCountries:Ljava/util/Set;

    return-object p0
.end method

.method public final appearance(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;)Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;
    .locals 1

    const-string v0, "appearance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->appearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    return-object p0
.end method

.method public final autocompleteCountries(Ljava/util/Set;)Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;"
        }
    .end annotation

    const-string v0, "autocompleteCountries"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->autocompleteCountries:Ljava/util/Set;

    return-object p0
.end method

.method public final build()Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;
    .locals 12

    new-instance v11, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->appearance:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->address:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->allowedCountries:Ljava/util/Set;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->buttonTitle:Ljava/lang/String;

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->additionalFields:Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration;

    iget-object v6, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->title:Ljava/lang/String;

    iget-object v7, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->googlePlacesApiKey:Ljava/lang/String;

    const/4 v8, 0x0

    const/16 v9, 0x80

    const/4 v10, 0x0

    move-object v0, v11

    invoke-direct/range {v0 .. v10}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v11
.end method

.method public final buttonTitle(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->buttonTitle:Ljava/lang/String;

    return-object p0
.end method

.method public final googlePlacesApiKey(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->googlePlacesApiKey:Ljava/lang/String;

    return-object p0
.end method

.method public final title(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;->title:Ljava/lang/String;

    return-object p0
.end method
