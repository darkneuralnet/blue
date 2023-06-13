.class public Lm91;
.super Lj91;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public final g:I

.field public final h:I

.field public final i:F

.field public final j:J

.field public final k:J

.field public transient l:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 3

    const/16 v0, 0x10

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/16 v1, 0x11

    const/16 v2, 0x16

    invoke-direct {p0, v1, v2, v0}, Lm91;-><init>(II[B)V

    return-void

    nop

    :array_0
    .array-data 1
        -0x56t
        -0x2t
        0x20t
        0x0t
        0x0t
        0x0t
        -0x80t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(II[B)V
    .locals 1

    sget-object v0, Lj91$a;->d:Lj91$a;

    invoke-direct {p0, p1, p2, p3, v0}, Lj91;-><init>(II[BLj91$a;)V

    invoke-virtual {p0, p3}, Lm91;->i([B)I

    move-result p1

    iput p1, p0, Lm91;->g:I

    invoke-virtual {p0, p3}, Lm91;->f([B)I

    move-result p1

    iput p1, p0, Lm91;->h:I

    invoke-virtual {p0, p3}, Lm91;->g([B)F

    move-result p1

    iput p1, p0, Lm91;->i:F

    invoke-virtual {p0, p3}, Lm91;->e([B)J

    move-result-wide p1

    iput-wide p1, p0, Lm91;->j:J

    invoke-virtual {p0, p3}, Lm91;->h([B)J

    move-result-wide p1

    iput-wide p1, p0, Lm91;->k:J

    return-void
.end method


# virtual methods
.method public final e([B)J
    .locals 2

    array-length v0, p1

    const/16 v1, 0xc

    if-ge v0, v1, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    const/16 v0, 0x8

    invoke-static {p1, v0}, LR70;->d([BI)J

    move-result-wide v0

    return-wide v0
.end method

.method public final f([B)I
    .locals 2

    array-length v0, p1

    const/4 v1, 0x6

    if-ge v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v0, 0x4

    invoke-static {p1, v0}, LR70;->c([BI)I

    move-result p1

    return p1
.end method

.method public final g([B)F
    .locals 2

    array-length v0, p1

    const/16 v1, 0x8

    if-ge v0, v1, :cond_0

    const/high16 p1, -0x3d000000    # -128.0f

    return p1

    :cond_0
    const/4 v0, 0x6

    invoke-static {p1, v0}, LR70;->a([BI)F

    move-result p1

    return p1
.end method

.method public final h([B)J
    .locals 4

    array-length v0, p1

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    const/16 v0, 0xc

    invoke-static {p1, v0}, LR70;->d([BI)J

    move-result-wide v0

    const-wide/16 v2, 0x64

    mul-long/2addr v0, v2

    return-wide v0
.end method

.method public final i([B)I
    .locals 2

    array-length v0, p1

    const/4 v1, 0x4

    if-ge v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v0, 0x3

    aget-byte p1, p1, v0

    and-int/lit16 p1, p1, 0xff

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lm91;->l:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Lm91;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Lm91;->h:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget v1, p0, Lm91;->i:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-wide v1, p0, Lm91;->j:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-wide v1, p0, Lm91;->k:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "EddystoneTLM(Version=%d,BatteryVoltage=%d,BeaconTemperature=%f,AdvertisementCount=%d,ElapsedTime=%d)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lm91;->l:Ljava/lang/String;

    return-object v0
.end method
