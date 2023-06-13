.class public final Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Failure;
.super Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Failure"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0008H\u00d6\u0001J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u0008H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Failure;",
        "Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult;",
        "error",
        "Lcom/stripe/android/link/ui/ErrorMessage;",
        "(Lcom/stripe/android/link/ui/ErrorMessage;)V",
        "getError",
        "()Lcom/stripe/android/link/ui/ErrorMessage;",
        "describeContents",
        "",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "link_release"
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
            "Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Failure;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final error:Lcom/stripe/android/link/ui/ErrorMessage;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Failure$Creator;

    invoke-direct {v0}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Failure$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Failure;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/ui/ErrorMessage;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Failure;->error:Lcom/stripe/android/link/ui/ErrorMessage;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getError()Lcom/stripe/android/link/ui/ErrorMessage;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Failure;->error:Lcom/stripe/android/link/ui/ErrorMessage;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Failure;->error:Lcom/stripe/android/link/ui/ErrorMessage;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
