.class public Lcom/polidea/rxandroidble2/scan/ScanFilter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;
.implements Lek5;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/polidea/rxandroidble2/scan/ScanFilter$b;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/polidea/rxandroidble2/scan/ScanFilter;",
            ">;"
        }
    .end annotation
.end field

.field public static final n:Lcom/polidea/rxandroidble2/scan/ScanFilter;


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Landroid/os/ParcelUuid;

.field public final e:Landroid/os/ParcelUuid;

.field public final f:Landroid/os/ParcelUuid;

.field public final g:Landroid/os/ParcelUuid;

.field public final h:Landroid/os/ParcelUuid;

.field public final i:[B

.field public final j:[B

.field public final k:I

.field public final l:[B

.field public final m:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;

    invoke-direct {v0}, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;-><init>()V

    invoke-virtual {v0}, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->a()Lcom/polidea/rxandroidble2/scan/ScanFilter;

    move-result-object v0

    sput-object v0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->n:Lcom/polidea/rxandroidble2/scan/ScanFilter;

    new-instance v0, Lcom/polidea/rxandroidble2/scan/ScanFilter$a;

    invoke-direct {v0}, Lcom/polidea/rxandroidble2/scan/ScanFilter$a;-><init>()V

    sput-object v0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/ParcelUuid;Landroid/os/ParcelUuid;Landroid/os/ParcelUuid;Landroid/os/ParcelUuid;Landroid/os/ParcelUuid;[B[BI[B[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->d:Landroid/os/ParcelUuid;

    iput-object p4, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->e:Landroid/os/ParcelUuid;

    iput-object p5, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->f:Landroid/os/ParcelUuid;

    iput-object p6, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->g:Landroid/os/ParcelUuid;

    iput-object p2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->c:Ljava/lang/String;

    iput-object p7, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->h:Landroid/os/ParcelUuid;

    iput-object p8, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->i:[B

    iput-object p9, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->j:[B

    iput p10, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->k:I

    iput-object p11, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->l:[B

    iput-object p12, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->m:[B

    return-void
.end method

.method public static c([B[B)Z
    .locals 0

    if-eq p0, p1, :cond_1

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static d(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    if-eq p0, p1, :cond_1

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static p([B[B[B)Z
    .locals 6

    const/4 v0, 0x0

    if-eqz p2, :cond_6

    array-length v1, p2

    array-length v2, p0

    if-ge v1, v2, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x1

    if-nez p1, :cond_3

    move p1, v0

    :goto_0
    array-length v2, p0

    if-ge p1, v2, :cond_2

    aget-byte v2, p2, p1

    aget-byte v3, p0, p1

    if-eq v2, v3, :cond_1

    return v0

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    return v1

    :cond_3
    move v2, v0

    :goto_1
    array-length v3, p0

    if-ge v2, v3, :cond_5

    aget-byte v3, p1, v2

    aget-byte v4, p2, v2

    and-int/2addr v4, v3

    aget-byte v5, p0, v2

    and-int/2addr v3, v5

    if-eq v4, v3, :cond_4

    return v0

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    return v1

    :cond_6
    :goto_2
    return v0
.end method

.method public static q(Landroid/os/ParcelUuid;Landroid/os/ParcelUuid;Ljava/util/List;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/ParcelUuid;",
            "Landroid/os/ParcelUuid;",
            "Ljava/util/List<",
            "Landroid/os/ParcelUuid;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p2, :cond_1

    return v1

    :cond_1
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/ParcelUuid;

    if-nez p1, :cond_3

    const/4 v3, 0x0

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Landroid/os/ParcelUuid;->getUuid()Ljava/util/UUID;

    move-result-object v3

    :goto_0
    invoke-virtual {p0}, Landroid/os/ParcelUuid;->getUuid()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v2}, Landroid/os/ParcelUuid;->getUuid()Ljava/util/UUID;

    move-result-object v2

    invoke-static {v4, v3, v2}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->r(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;)Z

    move-result v2

    if-eqz v2, :cond_2

    return v0

    :cond_4
    return v1
.end method

.method public static r(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;)Z
    .locals 6

    if-nez p1, :cond_0

    invoke-virtual {p0, p2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_0
    invoke-virtual {p0}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v0

    invoke-virtual {p1}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v2

    and-long/2addr v0, v2

    invoke-virtual {p2}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v2

    invoke-virtual {p1}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v4

    and-long/2addr v2, v4

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v2

    invoke-virtual {p1}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v4

    and-long/2addr v2, v4

    invoke-virtual {p2}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v4

    invoke-virtual {p1}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide p0

    and-long/2addr p0, v4

    cmp-long p0, v2, p0

    if-nez p0, :cond_2

    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public static s(Landroid/os/ParcelUuid;Landroid/os/ParcelUuid;Ljava/util/List;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/ParcelUuid;",
            "Landroid/os/ParcelUuid;",
            "Ljava/util/List<",
            "Landroid/os/ParcelUuid;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p2, :cond_1

    return v1

    :cond_1
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/ParcelUuid;

    if-nez p1, :cond_3

    const/4 v3, 0x0

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Landroid/os/ParcelUuid;->getUuid()Ljava/util/UUID;

    move-result-object v3

    :goto_0
    invoke-virtual {p0}, Landroid/os/ParcelUuid;->getUuid()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v2}, Landroid/os/ParcelUuid;->getUuid()Ljava/util/UUID;

    move-result-object v2

    invoke-static {v4, v3, v2}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->r(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;)Z

    move-result v2

    if-eqz v2, :cond_2

    return v0

    :cond_4
    return v1
.end method


# virtual methods
.method public a()Z
    .locals 1

    sget-object v0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->n:Lcom/polidea/rxandroidble2/scan/ScanFilter;

    invoke-virtual {p0, v0}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public b(LVk5;)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-interface {p1}, LVk5;->getAddress()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->c:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    return v0

    :cond_1
    invoke-interface {p1}, LVk5;->getScanRecord()LCk5;

    move-result-object v1

    iget-object v2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->b:Ljava/lang/String;

    if-eqz v2, :cond_3

    invoke-interface {p1}, LVk5;->getDeviceName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    if-eqz v1, :cond_2

    iget-object p1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->b:Ljava/lang/String;

    invoke-interface {v1}, LCk5;->getDeviceName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    :cond_2
    return v0

    :cond_3
    const/4 p1, 0x1

    if-nez v1, :cond_5

    iget-object v1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->d:Landroid/os/ParcelUuid;

    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->l:[B

    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->i:[B

    if-nez v1, :cond_4

    move v0, p1

    :cond_4
    return v0

    :cond_5
    iget-object v2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->d:Landroid/os/ParcelUuid;

    if-eqz v2, :cond_6

    iget-object v3, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->e:Landroid/os/ParcelUuid;

    invoke-interface {v1}, LCk5;->c()Ljava/util/List;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->s(Landroid/os/ParcelUuid;Landroid/os/ParcelUuid;Ljava/util/List;)Z

    move-result v2

    if-nez v2, :cond_6

    return v0

    :cond_6
    iget-object v2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->f:Landroid/os/ParcelUuid;

    if-eqz v2, :cond_7

    iget-object v3, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->g:Landroid/os/ParcelUuid;

    invoke-interface {v1}, LCk5;->d()Ljava/util/List;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->q(Landroid/os/ParcelUuid;Landroid/os/ParcelUuid;Ljava/util/List;)Z

    move-result v2

    if-nez v2, :cond_7

    return v0

    :cond_7
    iget-object v2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->h:Landroid/os/ParcelUuid;

    if-eqz v2, :cond_8

    iget-object v3, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->i:[B

    iget-object v4, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->j:[B

    invoke-interface {v1, v2}, LCk5;->e(Landroid/os/ParcelUuid;)[B

    move-result-object v2

    invoke-static {v3, v4, v2}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->p([B[B[B)Z

    move-result v2

    if-nez v2, :cond_8

    return v0

    :cond_8
    iget v2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->k:I

    if-ltz v2, :cond_9

    iget-object v3, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->l:[B

    iget-object v4, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->m:[B

    invoke-interface {v1, v2}, LCk5;->b(I)[B

    move-result-object v1

    invoke-static {v3, v4, v1}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->p([B[B[B)Z

    move-result v1

    if-nez v1, :cond_9

    return v0

    :cond_9
    return p1
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->c:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_1

    :cond_1
    check-cast p1, Lcom/polidea/rxandroidble2/scan/ScanFilter;

    iget-object v2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/polidea/rxandroidble2/scan/ScanFilter;->b:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/polidea/rxandroidble2/scan/ScanFilter;->c:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->k:I

    iget v3, p1, Lcom/polidea/rxandroidble2/scan/ScanFilter;->k:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->l:[B

    iget-object v3, p1, Lcom/polidea/rxandroidble2/scan/ScanFilter;->l:[B

    invoke-static {v2, v3}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->c([B[B)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->m:[B

    iget-object v3, p1, Lcom/polidea/rxandroidble2/scan/ScanFilter;->m:[B

    invoke-static {v2, v3}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->c([B[B)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->h:Landroid/os/ParcelUuid;

    iget-object v3, p1, Lcom/polidea/rxandroidble2/scan/ScanFilter;->h:Landroid/os/ParcelUuid;

    invoke-static {v2, v3}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->i:[B

    iget-object v3, p1, Lcom/polidea/rxandroidble2/scan/ScanFilter;->i:[B

    invoke-static {v2, v3}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->c([B[B)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->j:[B

    iget-object v3, p1, Lcom/polidea/rxandroidble2/scan/ScanFilter;->j:[B

    invoke-static {v2, v3}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->c([B[B)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->d:Landroid/os/ParcelUuid;

    iget-object v3, p1, Lcom/polidea/rxandroidble2/scan/ScanFilter;->d:Landroid/os/ParcelUuid;

    invoke-static {v2, v3}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->e:Landroid/os/ParcelUuid;

    iget-object v3, p1, Lcom/polidea/rxandroidble2/scan/ScanFilter;->e:Landroid/os/ParcelUuid;

    invoke-static {v2, v3}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->f:Landroid/os/ParcelUuid;

    iget-object v3, p1, Lcom/polidea/rxandroidble2/scan/ScanFilter;->f:Landroid/os/ParcelUuid;

    invoke-static {v2, v3}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->g:Landroid/os/ParcelUuid;

    iget-object p1, p1, Lcom/polidea/rxandroidble2/scan/ScanFilter;->g:Landroid/os/ParcelUuid;

    invoke-static {v2, p1}, Lcom/polidea/rxandroidble2/scan/ScanFilter;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->b:Ljava/lang/String;

    return-object v0
.end method

.method public h()[B
    .locals 1

    iget-object v0, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->l:[B

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    const/16 v0, 0xc

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->b:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->c:Ljava/lang/String;

    aput-object v2, v0, v1

    iget v1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->k:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->l:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->m:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->h:Landroid/os/ParcelUuid;

    aput-object v2, v0, v1

    iget-object v1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->i:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->j:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->d:Landroid/os/ParcelUuid;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    iget-object v2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->e:Landroid/os/ParcelUuid;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    iget-object v2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->f:Landroid/os/ParcelUuid;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    iget-object v2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->g:Landroid/os/ParcelUuid;

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public i()[B
    .locals 1

    iget-object v0, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->m:[B

    return-object v0
.end method

.method public j()I
    .locals 1

    iget v0, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->k:I

    return v0
.end method

.method public k()[B
    .locals 1

    iget-object v0, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->i:[B

    return-object v0
.end method

.method public l()[B
    .locals 1

    iget-object v0, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->j:[B

    return-object v0
.end method

.method public m()Landroid/os/ParcelUuid;
    .locals 1

    iget-object v0, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->h:Landroid/os/ParcelUuid;

    return-object v0
.end method

.method public n()Landroid/os/ParcelUuid;
    .locals 1

    iget-object v0, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->d:Landroid/os/ParcelUuid;

    return-object v0
.end method

.method public o()Landroid/os/ParcelUuid;
    .locals 1

    iget-object v0, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->e:Landroid/os/ParcelUuid;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BluetoothLeScanFilter [mDeviceName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->c:Ljava/lang/String;

    invoke-static {v1}, LOx2;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mUuid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->d:Landroid/os/ParcelUuid;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/os/ParcelUuid;->getUuid()Ljava/util/UUID;

    move-result-object v1

    invoke-static {v1}, LOx2;->g(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mUuidMask="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->e:Landroid/os/ParcelUuid;

    if-nez v1, :cond_1

    move-object v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Landroid/os/ParcelUuid;->getUuid()Ljava/util/UUID;

    move-result-object v1

    invoke-static {v1}, LOx2;->g(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mSolicitedUuid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->f:Landroid/os/ParcelUuid;

    if-nez v1, :cond_2

    move-object v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Landroid/os/ParcelUuid;->getUuid()Ljava/util/UUID;

    move-result-object v1

    invoke-static {v1}, LOx2;->g(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v1

    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mSolicitedUuidMask="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->g:Landroid/os/ParcelUuid;

    if-nez v1, :cond_3

    move-object v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Landroid/os/ParcelUuid;->getUuid()Ljava/util/UUID;

    move-result-object v1

    invoke-static {v1}, LOx2;->g(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v1

    :goto_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mServiceDataUuid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->h:Landroid/os/ParcelUuid;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Landroid/os/ParcelUuid;->getUuid()Ljava/util/UUID;

    move-result-object v1

    invoke-static {v1}, LOx2;->g(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v2

    :goto_4
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mServiceData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->i:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mServiceDataMask="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->j:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mManufacturerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->k:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mManufacturerData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->l:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mManufacturerDataMask="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->m:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget-object v0, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->b:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->c:Ljava/lang/String;

    if-nez v0, :cond_2

    move v0, v1

    goto :goto_1

    :cond_2
    move v0, v2

    :goto_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->c:Ljava/lang/String;

    if-eqz v0, :cond_3

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :cond_3
    iget-object v0, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->d:Landroid/os/ParcelUuid;

    if-nez v0, :cond_4

    move v0, v1

    goto :goto_2

    :cond_4
    move v0, v2

    :goto_2
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->d:Landroid/os/ParcelUuid;

    if-eqz v0, :cond_6

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->e:Landroid/os/ParcelUuid;

    if-nez v0, :cond_5

    move v0, v1

    goto :goto_3

    :cond_5
    move v0, v2

    :goto_3
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->e:Landroid/os/ParcelUuid;

    if-eqz v0, :cond_6

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    :cond_6
    iget-object v0, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->f:Landroid/os/ParcelUuid;

    if-nez v0, :cond_7

    move v0, v1

    goto :goto_4

    :cond_7
    move v0, v2

    :goto_4
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->f:Landroid/os/ParcelUuid;

    if-eqz v0, :cond_9

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->g:Landroid/os/ParcelUuid;

    if-nez v0, :cond_8

    move v0, v1

    goto :goto_5

    :cond_8
    move v0, v2

    :goto_5
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->g:Landroid/os/ParcelUuid;

    if-eqz v0, :cond_9

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    :cond_9
    iget-object v0, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->h:Landroid/os/ParcelUuid;

    if-nez v0, :cond_a

    move v0, v1

    goto :goto_6

    :cond_a
    move v0, v2

    :goto_6
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->h:Landroid/os/ParcelUuid;

    if-eqz v0, :cond_d

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->i:[B

    if-nez p2, :cond_b

    move p2, v1

    goto :goto_7

    :cond_b
    move p2, v2

    :goto_7
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->i:[B

    if-eqz p2, :cond_d

    array-length p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->i:[B

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    iget-object p2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->j:[B

    if-nez p2, :cond_c

    move p2, v1

    goto :goto_8

    :cond_c
    move p2, v2

    :goto_8
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->j:[B

    if-eqz p2, :cond_d

    array-length p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->j:[B

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    :cond_d
    iget p2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->k:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->l:[B

    if-nez p2, :cond_e

    move p2, v1

    goto :goto_9

    :cond_e
    move p2, v2

    :goto_9
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->l:[B

    if-eqz p2, :cond_10

    array-length p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->l:[B

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    iget-object p2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->m:[B

    if-nez p2, :cond_f

    goto :goto_a

    :cond_f
    move v1, v2

    :goto_a
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->m:[B

    if-eqz p2, :cond_10

    array-length p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/polidea/rxandroidble2/scan/ScanFilter;->m:[B

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    :cond_10
    return-void
.end method
