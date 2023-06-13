.class public Landroidx/test/services/events/discovery/TestDiscoveryErrorEvent;
.super Landroidx/test/services/events/discovery/TestDiscoveryEvent;
.source "SourceFile"


# instance fields
.field public final b:Landroidx/test/services/events/ErrorInfo;

.field public final c:Landroidx/test/services/events/TimeStamp;


# direct methods
.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0}, Landroidx/test/services/events/discovery/TestDiscoveryEvent;-><init>()V

    new-instance v0, Landroidx/test/services/events/ErrorInfo;

    invoke-direct {v0, p1}, Landroidx/test/services/events/ErrorInfo;-><init>(Landroid/os/Parcel;)V

    iput-object v0, p0, Landroidx/test/services/events/discovery/TestDiscoveryErrorEvent;->b:Landroidx/test/services/events/ErrorInfo;

    new-instance v0, Landroidx/test/services/events/TimeStamp;

    invoke-direct {v0, p1}, Landroidx/test/services/events/TimeStamp;-><init>(Landroid/os/Parcel;)V

    iput-object v0, p0, Landroidx/test/services/events/discovery/TestDiscoveryErrorEvent;->c:Landroidx/test/services/events/TimeStamp;

    return-void
.end method


# virtual methods
.method public a()Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;
    .locals 1

    sget-object v0, Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;->d:Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroidx/test/services/events/discovery/TestDiscoveryEvent;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Landroidx/test/services/events/discovery/TestDiscoveryErrorEvent;->b:Landroidx/test/services/events/ErrorInfo;

    invoke-virtual {v0, p1, p2}, Landroidx/test/services/events/ErrorInfo;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Landroidx/test/services/events/discovery/TestDiscoveryErrorEvent;->c:Landroidx/test/services/events/TimeStamp;

    invoke-virtual {v0, p1, p2}, Landroidx/test/services/events/TimeStamp;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
