.class public final Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/view/ActivityStarter$Result;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Result"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0008\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\u0008\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;",
        "Lcom/stripe/android/view/ActivityStarter$Result;",
        "addressOptionsResult",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;",
        "(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V",
        "getAddressOptionsResult",
        "()Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;",
        "component1",
        "copy",
        "describeContents",
        "",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toBundle",
        "Landroid/os/Bundle;",
        "toString",
        "",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
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


# static fields
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final addressOptionsResult:Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result$Creator;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V
    .locals 1

    const-string v0, "addressOptionsResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;->addressOptionsResult:Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;->addressOptionsResult:Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;->copy(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;->addressOptionsResult:Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;
    .locals 1

    const-string v0, "addressOptionsResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;->addressOptionsResult:Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;->addressOptionsResult:Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getAddressOptionsResult()Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;->addressOptionsResult:Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;->addressOptionsResult:Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toBundle()Landroid/os/Bundle;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract.extra_result"

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Ld70;->a([Lkotlin/Pair;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;->addressOptionsResult:Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Result(addressOptionsResult="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;->addressOptionsResult:Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
