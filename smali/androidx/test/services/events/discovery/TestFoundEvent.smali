.class public Landroidx/test/services/events/discovery/TestFoundEvent;
.super Landroidx/test/services/events/discovery/TestDiscoveryEvent;
.source "SourceFile"


# instance fields
.field public final b:Landroidx/test/services/events/TestCaseInfo;


# direct methods
.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0}, Landroidx/test/services/events/discovery/TestDiscoveryEvent;-><init>()V

    new-instance v0, Landroidx/test/services/events/TestCaseInfo;

    invoke-direct {v0, p1}, Landroidx/test/services/events/TestCaseInfo;-><init>(Landroid/os/Parcel;)V

    iput-object v0, p0, Landroidx/test/services/events/discovery/TestFoundEvent;->b:Landroidx/test/services/events/TestCaseInfo;

    return-void
.end method


# virtual methods
.method public a()Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;
    .locals 1

    sget-object v0, Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;->c:Landroidx/test/services/events/discovery/TestDiscoveryEvent$EventType;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroidx/test/services/events/discovery/TestDiscoveryEvent;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Landroidx/test/services/events/discovery/TestFoundEvent;->b:Landroidx/test/services/events/TestCaseInfo;

    invoke-virtual {v0, p1, p2}, Landroidx/test/services/events/TestCaseInfo;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
