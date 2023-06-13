.class public abstract Landroidx/test/services/events/run/TestRunEventWithTestCase;
.super Landroidx/test/services/events/run/TestRunEvent;
.source "SourceFile"


# instance fields
.field public final b:Landroidx/test/services/events/TestCaseInfo;


# direct methods
.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0}, Landroidx/test/services/events/run/TestRunEvent;-><init>()V

    new-instance v0, Landroidx/test/services/events/TestCaseInfo;

    invoke-direct {v0, p1}, Landroidx/test/services/events/TestCaseInfo;-><init>(Landroid/os/Parcel;)V

    iput-object v0, p0, Landroidx/test/services/events/run/TestRunEventWithTestCase;->b:Landroidx/test/services/events/TestCaseInfo;

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroidx/test/services/events/run/TestRunEvent;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Landroidx/test/services/events/run/TestRunEventWithTestCase;->b:Landroidx/test/services/events/TestCaseInfo;

    invoke-virtual {v0, p1, p2}, Landroidx/test/services/events/TestCaseInfo;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
