.class public final Landroidx/test/services/events/TestStatus;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/test/services/events/TestStatus$Status;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/test/services/events/TestStatus;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public b:Landroidx/test/services/events/TestStatus$Status;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/test/services/events/TestStatus$1;

    invoke-direct {v0}, Landroidx/test/services/events/TestStatus$1;-><init>()V

    sput-object v0, Landroidx/test/services/events/TestStatus;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "source cannot be null"

    invoke-static {p1, v0}, Landroidx/test/internal/util/Checks;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "status cannot be null"

    invoke-static {p1, v0}, Landroidx/test/internal/util/Checks;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Landroidx/test/services/events/TestStatus$Status;->valueOf(Ljava/lang/String;)Landroidx/test/services/events/TestStatus$Status;

    move-result-object p1

    iput-object p1, p0, Landroidx/test/services/events/TestStatus;->b:Landroidx/test/services/events/TestStatus$Status;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget-object p2, p0, Landroidx/test/services/events/TestStatus;->b:Landroidx/test/services/events/TestStatus$Status;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
