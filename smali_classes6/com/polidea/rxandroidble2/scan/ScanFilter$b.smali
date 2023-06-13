.class public final Lcom/polidea/rxandroidble2/scan/ScanFilter$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/polidea/rxandroidble2/scan/ScanFilter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Landroid/os/ParcelUuid;

.field public d:Landroid/os/ParcelUuid;

.field public e:Landroid/os/ParcelUuid;

.field public f:Landroid/os/ParcelUuid;

.field public g:Landroid/os/ParcelUuid;

.field public h:[B

.field public i:[B

.field public j:I

.field public k:[B

.field public l:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->j:I

    return-void
.end method


# virtual methods
.method public a()Lcom/polidea/rxandroidble2/scan/ScanFilter;
    .locals 14

    new-instance v13, Lcom/polidea/rxandroidble2/scan/ScanFilter;

    iget-object v1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->c:Landroid/os/ParcelUuid;

    iget-object v4, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->d:Landroid/os/ParcelUuid;

    iget-object v5, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->e:Landroid/os/ParcelUuid;

    iget-object v6, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->f:Landroid/os/ParcelUuid;

    iget-object v7, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->g:Landroid/os/ParcelUuid;

    iget-object v8, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->h:[B

    iget-object v9, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->i:[B

    iget v10, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->j:I

    iget-object v11, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->k:[B

    iget-object v12, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->l:[B

    move-object v0, v13

    invoke-direct/range {v0 .. v12}, Lcom/polidea/rxandroidble2/scan/ScanFilter;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/ParcelUuid;Landroid/os/ParcelUuid;Landroid/os/ParcelUuid;Landroid/os/ParcelUuid;Landroid/os/ParcelUuid;[B[BI[B[B)V

    return-object v13
.end method

.method public b(Ljava/lang/String;)Lcom/polidea/rxandroidble2/scan/ScanFilter$b;
    .locals 3

    if-eqz p1, :cond_1

    invoke-static {p1}, Landroid/bluetooth/BluetoothAdapter;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invalid device address "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iput-object p1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/polidea/rxandroidble2/scan/ScanFilter$b;
    .locals 0

    iput-object p1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public d(I[B)Lcom/polidea/rxandroidble2/scan/ScanFilter$b;
    .locals 0

    if-eqz p2, :cond_1

    if-ltz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "invalid manufacture id"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput p1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->j:I

    iput-object p2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->k:[B

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->l:[B

    return-object p0
.end method

.method public e(I[B[B)Lcom/polidea/rxandroidble2/scan/ScanFilter$b;
    .locals 2

    if-eqz p2, :cond_1

    if-ltz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "invalid manufacture id"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->l:[B

    if-eqz v0, :cond_4

    iget-object v1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->k:[B

    if-eqz v1, :cond_3

    array-length v1, v1

    array-length v0, v0

    if-ne v1, v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "size mismatch for manufacturerData and manufacturerDataMask"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "manufacturerData is null while manufacturerDataMask is not null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_1
    iput p1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->j:I

    iput-object p2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->k:[B

    iput-object p3, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->l:[B

    return-object p0
.end method

.method public f(Landroid/os/ParcelUuid;[B)Lcom/polidea/rxandroidble2/scan/ScanFilter$b;
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->g:Landroid/os/ParcelUuid;

    iput-object p2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->h:[B

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->i:[B

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "serviceDataUuid is null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public g(Landroid/os/ParcelUuid;[B[B)Lcom/polidea/rxandroidble2/scan/ScanFilter$b;
    .locals 2

    if-eqz p1, :cond_3

    iget-object v0, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->i:[B

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->h:[B

    if-eqz v1, :cond_1

    array-length v1, v1

    array-length v0, v0

    if-ne v1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "size mismatch for service data and service data mask"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "serviceData is null while serviceDataMask is not null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    iput-object p1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->g:Landroid/os/ParcelUuid;

    iput-object p2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->h:[B

    iput-object p3, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->i:[B

    return-object p0

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "serviceDataUuid is null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public h(Landroid/os/ParcelUuid;)Lcom/polidea/rxandroidble2/scan/ScanFilter$b;
    .locals 0

    iput-object p1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->e:Landroid/os/ParcelUuid;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->f:Landroid/os/ParcelUuid;

    return-object p0
.end method

.method public i(Landroid/os/ParcelUuid;Landroid/os/ParcelUuid;)Lcom/polidea/rxandroidble2/scan/ScanFilter$b;
    .locals 0

    if-eqz p2, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "SolicitationUuid is null while SolicitationUuidMask is not null!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-object p1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->e:Landroid/os/ParcelUuid;

    iput-object p2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->f:Landroid/os/ParcelUuid;

    return-object p0
.end method

.method public j(Landroid/os/ParcelUuid;)Lcom/polidea/rxandroidble2/scan/ScanFilter$b;
    .locals 0

    iput-object p1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->c:Landroid/os/ParcelUuid;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->d:Landroid/os/ParcelUuid;

    return-object p0
.end method

.method public k(Landroid/os/ParcelUuid;Landroid/os/ParcelUuid;)Lcom/polidea/rxandroidble2/scan/ScanFilter$b;
    .locals 1

    iget-object v0, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->d:Landroid/os/ParcelUuid;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->c:Landroid/os/ParcelUuid;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "uuid is null while uuidMask is not null!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-object p1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->c:Landroid/os/ParcelUuid;

    iput-object p2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->d:Landroid/os/ParcelUuid;

    return-object p0
.end method
