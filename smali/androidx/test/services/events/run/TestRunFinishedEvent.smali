.class public Landroidx/test/services/events/run/TestRunFinishedEvent;
.super Landroidx/test/services/events/run/TestRunEvent;
.source "SourceFile"


# instance fields
.field public final b:I

.field public final c:I

.field public final d:J

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/test/services/events/FailureInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 4

    invoke-direct {p0}, Landroidx/test/services/events/run/TestRunEvent;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/test/services/events/run/TestRunFinishedEvent;->b:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/test/services/events/run/TestRunFinishedEvent;->c:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/test/services/events/run/TestRunFinishedEvent;->d:J

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/test/services/events/run/TestRunFinishedEvent;->e:Ljava/util/List;

    const-class v0, [Landroidx/test/services/events/FailureInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelableArray(Ljava/lang/ClassLoader;)[Landroid/os/Parcelable;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    iget-object v3, p0, Landroidx/test/services/events/run/TestRunFinishedEvent;->e:Ljava/util/List;

    check-cast v2, Landroidx/test/services/events/FailureInfo;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public a()Landroidx/test/services/events/run/TestRunEvent$EventType;
    .locals 1

    sget-object v0, Landroidx/test/services/events/run/TestRunEvent$EventType;->h:Landroidx/test/services/events/run/TestRunEvent$EventType;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-super {p0, p1, p2}, Landroidx/test/services/events/run/TestRunEvent;->writeToParcel(Landroid/os/Parcel;I)V

    iget v0, p0, Landroidx/test/services/events/run/TestRunFinishedEvent;->b:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Landroidx/test/services/events/run/TestRunFinishedEvent;->c:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, Landroidx/test/services/events/run/TestRunFinishedEvent;->d:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object v0, p0, Landroidx/test/services/events/run/TestRunFinishedEvent;->e:Ljava/util/List;

    const/4 v1, 0x0

    new-array v1, v1, [Landroidx/test/services/events/FailureInfo;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/test/services/events/FailureInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelableArray([Landroid/os/Parcelable;I)V

    return-void
.end method
