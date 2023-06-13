.class public final Lno/nordicsemi/android/support/v18/scanner/ScanSettings;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lno/nordicsemi/android/support/v18/scanner/ScanSettings$b;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lno/nordicsemi/android/support/v18/scanner/ScanSettings;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final b:J

.field public final c:J

.field public final d:I

.field public final e:I

.field public final f:J

.field public final g:I

.field public final h:I

.field public final i:Z

.field public final j:Z

.field public k:Z

.field public final l:J

.field public final m:J

.field public final n:Z

.field public final o:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings$a;

    invoke-direct {v0}, Lno/nordicsemi/android/support/v18/scanner/ScanSettings$a;-><init>()V

    sput-object v0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IIJIIZIZZZJJJJ)V
    .locals 3

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move v1, p1

    iput v1, v0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->d:I

    move v1, p2

    iput v1, v0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->e:I

    move-wide v1, p3

    iput-wide v1, v0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->f:J

    move v1, p6

    iput v1, v0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->h:I

    move v1, p5

    iput v1, v0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->g:I

    move v1, p7

    iput-boolean v1, v0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->n:Z

    move v1, p8

    iput v1, v0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->o:I

    move v1, p9

    iput-boolean v1, v0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->i:Z

    move v1, p10

    iput-boolean v1, v0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->j:Z

    move v1, p11

    iput-boolean v1, v0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->k:Z

    const-wide/32 v1, 0xf4240

    mul-long/2addr v1, p12

    iput-wide v1, v0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->l:J

    move-wide/from16 v1, p14

    iput-wide v1, v0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->m:J

    move-wide/from16 v1, p16

    iput-wide v1, v0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->b:J

    move-wide/from16 v1, p18

    iput-wide v1, v0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->c:J

    return-void
.end method

.method public synthetic constructor <init>(IIJIIZIZZZJJJJLno/nordicsemi/android/support/v18/scanner/ScanSettings$a;)V
    .locals 0

    invoke-direct/range {p0 .. p19}, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;-><init>(IIJIIZIZZZJJJJ)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->d:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->e:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->f:J

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->g:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->h:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->n:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->o:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v2, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    iput-boolean v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->i:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v2, :cond_2

    move v1, v2

    :cond_2
    iput-boolean v1, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->j:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->l:J

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->m:J

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->b:J

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->c:J

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Parcel;Lno/nordicsemi/android/support/v18/scanner/ScanSettings$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->k:Z

    return-void
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->e:I

    return v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->n:Z

    return v0
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->l:J

    return-wide v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->m:J

    return-wide v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->g:I

    return v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->h:I

    return v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->o:I

    return v0
.end method

.method public j()J
    .locals 2

    iget-wide v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->f:J

    return-wide v0
.end method

.method public k()I
    .locals 1

    iget v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->d:I

    return v0
.end method

.method public l()Z
    .locals 1

    iget-boolean v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->j:Z

    return v0
.end method

.method public m()Z
    .locals 1

    iget-boolean v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->k:Z

    return v0
.end method

.method public n()Z
    .locals 1

    iget-boolean v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->i:Z

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget p2, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->d:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->e:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->f:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget p2, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->g:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->h:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->n:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->o:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->i:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->j:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->l:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->m:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->b:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lno/nordicsemi/android/support/v18/scanner/ScanSettings;->c:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    return-void
.end method
