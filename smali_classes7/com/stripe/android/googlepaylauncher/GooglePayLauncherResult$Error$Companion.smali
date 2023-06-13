.class public final Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error$Companion;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LRE3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LRE3<",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\t\u001a\u00020\u0008*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error$Companion;",
        "LRE3;",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error;",
        "Landroid/os/Parcel;",
        "parcel",
        "create",
        "",
        "flags",
        "",
        "write",
        "<init>",
        "()V",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Landroid/os/Parcel;)Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error;
    .locals 8

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error;

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.Throwable"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v1

    check-cast v2, Ljava/lang/Throwable;

    const-class v1, Lcom/google/android/gms/common/api/Status;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lcom/google/android/gms/common/api/Status;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error;-><init>(Ljava/lang/Throwable;Lcom/google/android/gms/common/api/Status;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ShippingInformation;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public bridge synthetic create(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error$Companion;->create(Landroid/os/Parcel;)Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error;
    .locals 0

    invoke-static {p0, p1}, LRE3$a;->a(LRE3;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error$Companion;->newArray(I)[Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error;

    move-result-object p1

    return-object p1
.end method

.method public write(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error;Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parcel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error;->getException()Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    invoke-virtual {p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error;->getGooglePayStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p2, p1, p3}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method

.method public bridge synthetic write(Ljava/lang/Object;Landroid/os/Parcel;I)V
    .locals 0

    check-cast p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error;

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error$Companion;->write(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error;Landroid/os/Parcel;I)V

    return-void
.end method
