.class public final Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;
    .locals 4

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    sget-object v2, Lcom/stripe/android/financialconnections/model/TextUpdate;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    :goto_0
    check-cast v2, Lcom/stripe/android/financialconnections/model/TextUpdate;

    sget-object v3, Lcom/stripe/android/financialconnections/model/VisualUpdate;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/model/VisualUpdate;

    invoke-direct {v0, v1, v2, p1}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/model/TextUpdate;Lcom/stripe/android/financialconnections/model/VisualUpdate;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;
    .locals 0

    new-array p1, p1, [Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse$Creator;->newArray(I)[Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    move-result-object p1

    return-object p1
.end method
