.class public final Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded;
.super Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Succeeded"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\r\u001a\u00020\u0008H\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0008H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0008H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00088PX\u0090\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded;",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;",
        "address",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
        "(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V",
        "getAddress",
        "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
        "resultCode",
        "",
        "getResultCode$paymentsheet_release",
        "()I",
        "component1",
        "copy",
        "describeContents",
        "equals",
        "",
        "other",
        "",
        "hashCode",
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
            "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final address:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded$Creator;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V
    .locals 1

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded;->address:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded;->address:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded;->copy(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded;->address:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded;
    .locals 1

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V

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
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded;->address:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded;->address:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getAddress()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded;->address:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    return-object v0
.end method

.method public getResultCode$paymentsheet_release()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded;->address:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded;->address:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Succeeded(address="

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

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Succeeded;->address:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
