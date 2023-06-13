.class public LId;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LId;->a:I

    return-void
.end method

.method public static a(Lcom/polidea/rxandroidble2/scan/ScanSettings;Landroid/bluetooth/le/ScanSettings$Builder;)V
    .locals 1

    invoke-virtual {p0}, Lcom/polidea/rxandroidble2/scan/ScanSettings;->b()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/bluetooth/le/ScanSettings$Builder;->setCallbackType(I)Landroid/bluetooth/le/ScanSettings$Builder;

    move-result-object p1

    invoke-virtual {p0}, Lcom/polidea/rxandroidble2/scan/ScanSettings;->d()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/bluetooth/le/ScanSettings$Builder;->setMatchMode(I)Landroid/bluetooth/le/ScanSettings$Builder;

    move-result-object p1

    invoke-virtual {p0}, Lcom/polidea/rxandroidble2/scan/ScanSettings;->e()I

    move-result p0

    invoke-virtual {p1, p0}, Landroid/bluetooth/le/ScanSettings$Builder;->setNumOfMatches(I)Landroid/bluetooth/le/ScanSettings$Builder;

    return-void
.end method

.method public static b(Lcom/polidea/rxandroidble2/scan/ScanFilter;)Landroid/bluetooth/le/ScanFilter;
    .locals 4

    new-instance v0, Landroid/bluetooth/le/ScanFilter$Builder;

    invoke-direct {v0}, Landroid/bluetooth/le/ScanFilter$Builder;-><init>()V

    invoke-virtual {p0}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->m()Landroid/os/ParcelUuid;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->m()Landroid/os/ParcelUuid;

    move-result-object v1

    invoke-virtual {p0}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->k()[B

    move-result-object v2

    invoke-virtual {p0}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->l()[B

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Landroid/bluetooth/le/ScanFilter$Builder;->setServiceData(Landroid/os/ParcelUuid;[B[B)Landroid/bluetooth/le/ScanFilter$Builder;

    :cond_0
    invoke-virtual {p0}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->e()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/le/ScanFilter$Builder;->setDeviceAddress(Ljava/lang/String;)Landroid/bluetooth/le/ScanFilter$Builder;

    :cond_1
    invoke-virtual {p0}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/le/ScanFilter$Builder;->setDeviceName(Ljava/lang/String;)Landroid/bluetooth/le/ScanFilter$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->j()I

    move-result v1

    invoke-virtual {p0}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->h()[B

    move-result-object v2

    invoke-virtual {p0}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->i()[B

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Landroid/bluetooth/le/ScanFilter$Builder;->setManufacturerData(I[B[B)Landroid/bluetooth/le/ScanFilter$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->n()Landroid/os/ParcelUuid;

    move-result-object v1

    invoke-virtual {p0}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->o()Landroid/os/ParcelUuid;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Landroid/bluetooth/le/ScanFilter$Builder;->setServiceUuid(Landroid/os/ParcelUuid;Landroid/os/ParcelUuid;)Landroid/bluetooth/le/ScanFilter$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/bluetooth/le/ScanFilter$Builder;->build()Landroid/bluetooth/le/ScanFilter;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public varargs c([Lcom/polidea/rxandroidble2/scan/ScanFilter;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/polidea/rxandroidble2/scan/ScanFilter;",
            ")",
            "Ljava/util/List<",
            "Landroid/bluetooth/le/ScanFilter;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    array-length v1, p1

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    if-eqz v1, :cond_1

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, p1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, p1

    :goto_1
    if-ge v0, v2, :cond_2

    aget-object v3, p1, v0

    invoke-static {v3}, LId;->b(Lcom/polidea/rxandroidble2/scan/ScanFilter;)Landroid/bluetooth/le/ScanFilter;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :cond_2
    return-object v1
.end method

.method public d(Lcom/polidea/rxandroidble2/scan/ScanSettings;)Landroid/bluetooth/le/ScanSettings;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    new-instance v0, Landroid/bluetooth/le/ScanSettings$Builder;

    invoke-direct {v0}, Landroid/bluetooth/le/ScanSettings$Builder;-><init>()V

    iget v1, p0, LId;->a:I

    const/16 v2, 0x17

    if-lt v1, v2, :cond_0

    invoke-static {p1, v0}, LId;->a(Lcom/polidea/rxandroidble2/scan/ScanSettings;Landroid/bluetooth/le/ScanSettings$Builder;)V

    iget v1, p0, LId;->a:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_0

    invoke-virtual {p1}, Lcom/polidea/rxandroidble2/scan/ScanSettings;->c()Z

    move-result v1

    invoke-static {v0, v1}, LHd;->a(Landroid/bluetooth/le/ScanSettings$Builder;Z)Landroid/bluetooth/le/ScanSettings$Builder;

    :cond_0
    invoke-virtual {p1}, Lcom/polidea/rxandroidble2/scan/ScanSettings;->g()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/bluetooth/le/ScanSettings$Builder;->setReportDelay(J)Landroid/bluetooth/le/ScanSettings$Builder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/polidea/rxandroidble2/scan/ScanSettings;->h()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/bluetooth/le/ScanSettings$Builder;->setScanMode(I)Landroid/bluetooth/le/ScanSettings$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanSettings$Builder;->build()Landroid/bluetooth/le/ScanSettings;

    move-result-object p1

    return-object p1
.end method
