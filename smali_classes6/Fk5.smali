.class public LFk5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCk5;


# instance fields
.field public final a:Landroid/bluetooth/le/ScanRecord;

.field public final b:LGk5;


# direct methods
.method public constructor <init>(Landroid/bluetooth/le/ScanRecord;LGk5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFk5;->a:Landroid/bluetooth/le/ScanRecord;

    iput-object p2, p0, LFk5;->b:LGk5;

    return-void
.end method


# virtual methods
.method public a()[B
    .locals 1

    iget-object v0, p0, LFk5;->a:Landroid/bluetooth/le/ScanRecord;

    invoke-virtual {v0}, Landroid/bluetooth/le/ScanRecord;->getBytes()[B

    move-result-object v0

    return-object v0
.end method

.method public b(I)[B
    .locals 1

    iget-object v0, p0, LFk5;->a:Landroid/bluetooth/le/ScanRecord;

    invoke-virtual {v0, p1}, Landroid/bluetooth/le/ScanRecord;->getManufacturerSpecificData(I)[B

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/os/ParcelUuid;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LFk5;->a:Landroid/bluetooth/le/ScanRecord;

    invoke-virtual {v0}, Landroid/bluetooth/le/ScanRecord;->getServiceUuids()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/os/ParcelUuid;",
            ">;"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    iget-object v0, p0, LFk5;->a:Landroid/bluetooth/le/ScanRecord;

    invoke-static {v0}, LEk5;->a(Landroid/bluetooth/le/ScanRecord;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, LFk5;->b:LGk5;

    iget-object v1, p0, LFk5;->a:Landroid/bluetooth/le/ScanRecord;

    invoke-virtual {v1}, Landroid/bluetooth/le/ScanRecord;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, LGk5;->c([B)LCk5;

    move-result-object v0

    invoke-interface {v0}, LCk5;->d()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public e(Landroid/os/ParcelUuid;)[B
    .locals 1

    iget-object v0, p0, LFk5;->a:Landroid/bluetooth/le/ScanRecord;

    invoke-virtual {v0, p1}, Landroid/bluetooth/le/ScanRecord;->getServiceData(Landroid/os/ParcelUuid;)[B

    move-result-object p1

    return-object p1
.end method

.method public getDeviceName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LFk5;->a:Landroid/bluetooth/le/ScanRecord;

    invoke-virtual {v0}, Landroid/bluetooth/le/ScanRecord;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
