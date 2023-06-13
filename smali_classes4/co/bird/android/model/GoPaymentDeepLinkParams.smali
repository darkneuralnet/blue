.class public final Lco/bird/android/model/GoPaymentDeepLinkParams;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/model/ParceableGoDeepLinkParams;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0008\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\nH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0016"
    }
    d2 = {
        "Lco/bird/android/model/GoPaymentDeepLinkParams;",
        "Lco/bird/android/model/ParceableGoDeepLinkParams;",
        "showPreloadAddMoneyScreen",
        "",
        "(Z)V",
        "getShowPreloadAddMoneyScreen",
        "()Z",
        "component1",
        "copy",
        "describeContents",
        "",
        "equals",
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
        "model_release"
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
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lco/bird/android/model/GoPaymentDeepLinkParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final showPreloadAddMoneyScreen:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/model/GoPaymentDeepLinkParams$Creator;

    invoke-direct {v0}, Lco/bird/android/model/GoPaymentDeepLinkParams$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/GoPaymentDeepLinkParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lco/bird/android/model/GoPaymentDeepLinkParams;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lco/bird/android/model/GoPaymentDeepLinkParams;->showPreloadAddMoneyScreen:Z

    return-void
.end method

.method public synthetic constructor <init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, Lco/bird/android/model/GoPaymentDeepLinkParams;-><init>(Z)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/GoPaymentDeepLinkParams;ZILjava/lang/Object;)Lco/bird/android/model/GoPaymentDeepLinkParams;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-boolean p1, p0, Lco/bird/android/model/GoPaymentDeepLinkParams;->showPreloadAddMoneyScreen:Z

    :cond_0
    invoke-virtual {p0, p1}, Lco/bird/android/model/GoPaymentDeepLinkParams;->copy(Z)Lco/bird/android/model/GoPaymentDeepLinkParams;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/GoPaymentDeepLinkParams;->showPreloadAddMoneyScreen:Z

    return v0
.end method

.method public final copy(Z)Lco/bird/android/model/GoPaymentDeepLinkParams;
    .locals 1

    new-instance v0, Lco/bird/android/model/GoPaymentDeepLinkParams;

    invoke-direct {v0, p1}, Lco/bird/android/model/GoPaymentDeepLinkParams;-><init>(Z)V

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
    instance-of v1, p1, Lco/bird/android/model/GoPaymentDeepLinkParams;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/GoPaymentDeepLinkParams;

    iget-boolean v1, p0, Lco/bird/android/model/GoPaymentDeepLinkParams;->showPreloadAddMoneyScreen:Z

    iget-boolean p1, p1, Lco/bird/android/model/GoPaymentDeepLinkParams;->showPreloadAddMoneyScreen:Z

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getShowPreloadAddMoneyScreen()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/GoPaymentDeepLinkParams;->showPreloadAddMoneyScreen:Z

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/GoPaymentDeepLinkParams;->showPreloadAddMoneyScreen:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-boolean v0, p0, Lco/bird/android/model/GoPaymentDeepLinkParams;->showPreloadAddMoneyScreen:Z

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "GoPaymentDeepLinkParams(showPreloadAddMoneyScreen="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "out"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p2, p0, Lco/bird/android/model/GoPaymentDeepLinkParams;->showPreloadAddMoneyScreen:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
