.class public Landroidx/test/services/events/platform/TestRunErrorEvent;
.super Landroidx/test/services/events/platform/TestPlatformEvent;
.source "SourceFile"


# instance fields
.field public final b:Landroidx/test/services/events/TestRunInfo;

.field public final c:Landroidx/test/services/events/ErrorInfo;

.field public final d:Landroidx/test/services/events/TimeStamp;


# direct methods
.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0}, Landroidx/test/services/events/platform/TestPlatformEvent;-><init>()V

    new-instance v0, Landroidx/test/services/events/TestRunInfo;

    invoke-direct {v0, p1}, Landroidx/test/services/events/TestRunInfo;-><init>(Landroid/os/Parcel;)V

    iput-object v0, p0, Landroidx/test/services/events/platform/TestRunErrorEvent;->b:Landroidx/test/services/events/TestRunInfo;

    new-instance v0, Landroidx/test/services/events/ErrorInfo;

    invoke-direct {v0, p1}, Landroidx/test/services/events/ErrorInfo;-><init>(Landroid/os/Parcel;)V

    iput-object v0, p0, Landroidx/test/services/events/platform/TestRunErrorEvent;->c:Landroidx/test/services/events/ErrorInfo;

    new-instance v0, Landroidx/test/services/events/TimeStamp;

    invoke-direct {v0, p1}, Landroidx/test/services/events/TimeStamp;-><init>(Landroid/os/Parcel;)V

    iput-object v0, p0, Landroidx/test/services/events/platform/TestRunErrorEvent;->d:Landroidx/test/services/events/TimeStamp;

    return-void
.end method


# virtual methods
.method public a()Landroidx/test/services/events/platform/TestPlatformEvent$EventType;
    .locals 1

    sget-object v0, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;->c:Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroidx/test/services/events/platform/TestPlatformEvent;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Landroidx/test/services/events/platform/TestRunErrorEvent;->b:Landroidx/test/services/events/TestRunInfo;

    invoke-virtual {v0, p1, p2}, Landroidx/test/services/events/TestRunInfo;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Landroidx/test/services/events/platform/TestRunErrorEvent;->c:Landroidx/test/services/events/ErrorInfo;

    invoke-virtual {v0, p1, p2}, Landroidx/test/services/events/ErrorInfo;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Landroidx/test/services/events/platform/TestRunErrorEvent;->d:Landroidx/test/services/events/TimeStamp;

    invoke-virtual {v0, p1, p2}, Landroidx/test/services/events/TimeStamp;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
