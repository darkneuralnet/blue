.class public Landroidx/test/services/events/run/TestAssumptionFailureEvent;
.super Landroidx/test/services/events/run/TestFailureEvent;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/test/services/events/run/TestFailureEvent;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public a()Landroidx/test/services/events/run/TestRunEvent$EventType;
    .locals 1

    sget-object v0, Landroidx/test/services/events/run/TestRunEvent$EventType;->e:Landroidx/test/services/events/run/TestRunEvent$EventType;

    return-object v0
.end method
