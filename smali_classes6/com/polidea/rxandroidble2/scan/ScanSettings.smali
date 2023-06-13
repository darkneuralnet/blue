.class public Lcom/polidea/rxandroidble2/scan/ScanSettings;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/polidea/rxandroidble2/scan/ScanSettings$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/polidea/rxandroidble2/scan/ScanSettings;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public b:I

.field public c:I

.field public d:J

.field public e:I

.field public f:I

.field public g:Z

.field public h:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/polidea/rxandroidble2/scan/ScanSettings$a;

    invoke-direct {v0}, Lcom/polidea/rxandroidble2/scan/ScanSettings$a;-><init>()V

    sput-object v0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IIJIIZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->b:I

    iput p2, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->c:I

    iput-wide p3, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->d:J

    iput p6, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->f:I

    iput p5, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->e:I

    iput-boolean p7, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->g:Z

    iput-boolean p8, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->h:Z

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->b:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->c:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->d:J

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->e:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->f:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iput-boolean v0, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->g:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    iput-boolean v1, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->h:Z

    return-void
.end method


# virtual methods
.method public a(I)Lcom/polidea/rxandroidble2/scan/ScanSettings;
    .locals 10

    new-instance v9, Lcom/polidea/rxandroidble2/scan/ScanSettings;

    iget v1, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->b:I

    iget-wide v3, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->d:J

    iget v5, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->e:I

    iget v6, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->f:I

    iget-boolean v7, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->g:Z

    iget-boolean v8, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->h:Z

    move-object v0, v9

    move v2, p1

    invoke-direct/range {v0 .. v8}, Lcom/polidea/rxandroidble2/scan/ScanSettings;-><init>(IIJIIZZ)V

    return-object v9
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->c:I

    return v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->g:Z

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->e:I

    return v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->f:I

    return v0
.end method

.method public g()J
    .locals 2

    iget-wide v0, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->d:J

    return-wide v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->b:I

    return v0
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->h:Z

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget p2, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->b:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->c:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->d:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget p2, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->e:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->f:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->g:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/polidea/rxandroidble2/scan/ScanSettings;->h:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
