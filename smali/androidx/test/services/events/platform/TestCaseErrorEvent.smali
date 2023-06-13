.class public Landroidx/test/services/events/platform/TestCaseErrorEvent;
.super Landroidx/test/services/events/platform/TestPlatformEvent;
.source "SourceFile"


# instance fields
.field public final b:Landroidx/test/services/events/TestCaseInfo;

.field public final c:Landroidx/test/services/events/ErrorInfo;

.field public final d:Landroidx/test/services/events/TimeStamp;


# direct methods
.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0}, Landroidx/test/services/events/platform/TestPlatformEvent;-><init>()V

    new-instance v0, Landroidx/test/services/events/TestCaseInfo;

    invoke-direct {v0, p1}, Landroidx/test/services/events/TestCaseInfo;-><init>(Landroid/os/Parcel;)V

    iput-object v0, p0, Landroidx/test/services/events/platform/TestCaseErrorEvent;->b:Landroidx/test/services/events/TestCaseInfo;

    new-instance v0, Landroidx/test/services/events/ErrorInfo;

    invoke-direct {v0, p1}, Landroidx/test/services/events/ErrorInfo;-><init>(Landroid/os/Parcel;)V

    iput-object v0, p0, Landroidx/test/services/events/platform/TestCaseErrorEvent;->c:Landroidx/test/services/events/ErrorInfo;

    new-instance v0, Landroidx/test/services/events/TimeStamp;

    invoke-direct {v0, p1}, Landroidx/test/services/events/TimeStamp;-><init>(Landroid/os/Parcel;)V

    iput-object v0, p0, Landroidx/test/services/events/platform/TestCaseErrorEvent;->d:Landroidx/test/services/events/TimeStamp;

    return-void
.end method


# virtual methods
.method public a()Landroidx/test/services/events/platform/TestPlatformEvent$EventType;
    .locals 1

    sget-object v0, Landroidx/test/services/events/platform/TestPlatformEvent$EventType;->f:Landroidx/test/services/events/platform/TestPlatformEvent$EventType;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroidx/test/services/events/platform/TestPlatformEvent;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Landroidx/test/services/events/platform/TestCaseErrorEvent;->b:Landroidx/test/services/events/TestCaseInfo;

    invoke-virtual {v0, p1, p2}, Landroidx/test/services/events/TestCaseInfo;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Landroidx/test/services/events/platform/TestCaseErrorEvent;->c:Landroidx/test/services/events/ErrorInfo;

    invoke-virtual {v0, p1, p2}, Landroidx/test/services/events/ErrorInfo;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Landroidx/test/services/events/platform/TestCaseErrorEvent;->d:Landroidx/test/services/events/TimeStamp;

    invoke-virtual {v0, p1, p2}, Landroidx/test/services/events/TimeStamp;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
