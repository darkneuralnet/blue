.class Lzendesk/commonui/AlmostRealProgressBar$Step;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/commonui/AlmostRealProgressBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Step"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable;",
        "Ljava/lang/Comparable<",
        "Lzendesk/commonui/AlmostRealProgressBar$Step;",
        ">;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lzendesk/commonui/AlmostRealProgressBar$Step;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final b:I

.field public final c:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzendesk/commonui/AlmostRealProgressBar$Step$a;

    invoke-direct {v0}, Lzendesk/commonui/AlmostRealProgressBar$Step$a;-><init>()V

    sput-object v0, Lzendesk/commonui/AlmostRealProgressBar$Step;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lzendesk/commonui/AlmostRealProgressBar$Step;->b:I

    iput-wide p2, p0, Lzendesk/commonui/AlmostRealProgressBar$Step;->c:J

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lzendesk/commonui/AlmostRealProgressBar$Step;->b:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lzendesk/commonui/AlmostRealProgressBar$Step;->c:J

    return-void
.end method

.method public static synthetic a(Lzendesk/commonui/AlmostRealProgressBar$Step;)I
    .locals 0

    iget p0, p0, Lzendesk/commonui/AlmostRealProgressBar$Step;->b:I

    return p0
.end method

.method public static synthetic b(Lzendesk/commonui/AlmostRealProgressBar$Step;)J
    .locals 2

    iget-wide v0, p0, Lzendesk/commonui/AlmostRealProgressBar$Step;->c:J

    return-wide v0
.end method


# virtual methods
.method public c(Lzendesk/commonui/AlmostRealProgressBar$Step;)I
    .locals 1

    iget v0, p0, Lzendesk/commonui/AlmostRealProgressBar$Step;->b:I

    iget p1, p1, Lzendesk/commonui/AlmostRealProgressBar$Step;->b:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lzendesk/commonui/AlmostRealProgressBar$Step;

    invoke-virtual {p0, p1}, Lzendesk/commonui/AlmostRealProgressBar$Step;->c(Lzendesk/commonui/AlmostRealProgressBar$Step;)I

    move-result p1

    return p1
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget p2, p0, Lzendesk/commonui/AlmostRealProgressBar$Step;->b:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, Lzendesk/commonui/AlmostRealProgressBar$Step;->c:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    return-void
.end method
