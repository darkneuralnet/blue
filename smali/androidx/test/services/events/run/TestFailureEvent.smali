.class public Landroidx/test/services/events/run/TestFailureEvent;
.super Landroidx/test/services/events/run/TestRunEventWithTestCase;
.source "SourceFile"


# instance fields
.field public final c:Landroidx/test/services/events/FailureInfo;


# direct methods
.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0, p1}, Landroidx/test/services/events/run/TestRunEventWithTestCase;-><init>(Landroid/os/Parcel;)V

    new-instance v0, Landroidx/test/services/events/FailureInfo;

    invoke-direct {v0, p1}, Landroidx/test/services/events/FailureInfo;-><init>(Landroid/os/Parcel;)V

    iput-object v0, p0, Landroidx/test/services/events/run/TestFailureEvent;->c:Landroidx/test/services/events/FailureInfo;

    return-void
.end method


# virtual methods
.method public a()Landroidx/test/services/events/run/TestRunEvent$EventType;
    .locals 1

    sget-object v0, Landroidx/test/services/events/run/TestRunEvent$EventType;->f:Landroidx/test/services/events/run/TestRunEvent$EventType;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const/4 p2, 0x0

    invoke-super {p0, p1, p2}, Landroidx/test/services/events/run/TestRunEventWithTestCase;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Landroidx/test/services/events/run/TestFailureEvent;->c:Landroidx/test/services/events/FailureInfo;

    invoke-virtual {v0, p1, p2}, Landroidx/test/services/events/FailureInfo;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
