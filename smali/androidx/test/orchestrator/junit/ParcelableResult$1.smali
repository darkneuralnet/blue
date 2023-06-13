.class Landroidx/test/orchestrator/junit/ParcelableResult$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/test/orchestrator/junit/ParcelableResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/test/orchestrator/junit/ParcelableResult;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Landroidx/test/orchestrator/junit/ParcelableResult;
    .locals 2

    new-instance v0, Landroidx/test/orchestrator/junit/ParcelableResult;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Landroidx/test/orchestrator/junit/ParcelableResult;-><init>(Landroid/os/Parcel;Landroidx/test/orchestrator/junit/ParcelableResult-IA;)V

    return-object v0
.end method

.method public b(I)[Landroidx/test/orchestrator/junit/ParcelableResult;
    .locals 0

    new-array p1, p1, [Landroidx/test/orchestrator/junit/ParcelableResult;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/test/orchestrator/junit/ParcelableResult$1;->a(Landroid/os/Parcel;)Landroidx/test/orchestrator/junit/ParcelableResult;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/test/orchestrator/junit/ParcelableResult$1;->b(I)[Landroidx/test/orchestrator/junit/ParcelableResult;

    move-result-object p1

    return-object p1
.end method
