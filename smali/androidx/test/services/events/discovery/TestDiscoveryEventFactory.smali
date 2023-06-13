.class final Landroidx/test/services/events/discovery/TestDiscoveryEventFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/test/services/events/discovery/TestDiscoveryEvent;",
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
.method public a(Landroid/os/Parcel;)Landroidx/test/services/events/discovery/TestDiscoveryEvent;
    .locals 3

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;->valueOf(Ljava/lang/String;)Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;

    move-result-object v0

    sget-object v1, Landroidx/test/services/events/discovery/TestDiscoveryEventFactory$1;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    const/4 p1, 0x4

    if-ne v1, p1, :cond_0

    new-instance p1, Landroidx/test/services/events/discovery/TestDiscoveryFinishedEvent;

    invoke-direct {p1}, Landroidx/test/services/events/discovery/TestDiscoveryFinishedEvent;-><init>()V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unhandled event type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance v0, Landroidx/test/services/events/discovery/TestDiscoveryErrorEvent;

    invoke-direct {v0, p1}, Landroidx/test/services/events/discovery/TestDiscoveryErrorEvent;-><init>(Landroid/os/Parcel;)V

    return-object v0

    :cond_2
    new-instance v0, Landroidx/test/services/events/discovery/TestFoundEvent;

    invoke-direct {v0, p1}, Landroidx/test/services/events/discovery/TestFoundEvent;-><init>(Landroid/os/Parcel;)V

    return-object v0

    :cond_3
    new-instance p1, Landroidx/test/services/events/discovery/TestDiscoveryStartedEvent;

    invoke-direct {p1}, Landroidx/test/services/events/discovery/TestDiscoveryStartedEvent;-><init>()V

    return-object p1
.end method

.method public b(I)[Landroidx/test/services/events/discovery/TestDiscoveryEvent;
    .locals 0

    new-array p1, p1, [Landroidx/test/services/events/discovery/TestDiscoveryEvent;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/test/services/events/discovery/TestDiscoveryEventFactory;->a(Landroid/os/Parcel;)Landroidx/test/services/events/discovery/TestDiscoveryEvent;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/test/services/events/discovery/TestDiscoveryEventFactory;->b(I)[Landroidx/test/services/events/discovery/TestDiscoveryEvent;

    move-result-object p1

    return-object p1
.end method
