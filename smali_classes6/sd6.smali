.class public Lsd6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(II[B)Lg;
    .locals 2

    const/16 v0, 0x14

    if-eq p2, v0, :cond_2

    const/16 v0, 0x15

    if-eq p2, v0, :cond_1

    const/16 v0, 0x1f

    if-eq p2, v0, :cond_0

    packed-switch p2, :pswitch_data_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    :pswitch_0
    invoke-virtual {p0, p3}, Lsd6;->d([B)[Ljava/util/UUID;

    move-result-object v0

    goto :goto_0

    :cond_1
    :pswitch_1
    invoke-virtual {p0, p3}, Lsd6;->b([B)[Ljava/util/UUID;

    move-result-object v0

    goto :goto_0

    :cond_2
    :pswitch_2
    invoke-virtual {p0, p3}, Lsd6;->c([B)[Ljava/util/UUID;

    move-result-object v0

    :goto_0
    new-instance v1, Lrd6;

    invoke-direct {v1, p1, p2, p3, v0}, Lrd6;-><init>(II[B[Ljava/util/UUID;)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public final b([B)[Ljava/util/UUID;
    .locals 4

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    array-length v0, p1

    div-int/lit8 v0, v0, 0x10

    new-array v1, v0, [Ljava/util/UUID;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    mul-int/lit8 v3, v2, 0x10

    invoke-static {p1, v3}, Lpd6;->b([BI)Ljava/util/UUID;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public final c([B)[Ljava/util/UUID;
    .locals 4

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    array-length v0, p1

    div-int/lit8 v0, v0, 0x2

    new-array v1, v0, [Ljava/util/UUID;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    mul-int/lit8 v3, v2, 0x2

    invoke-static {p1, v3}, Lpd6;->e([BI)Ljava/util/UUID;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public final d([B)[Ljava/util/UUID;
    .locals 4

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    array-length v0, p1

    div-int/lit8 v0, v0, 0x4

    new-array v1, v0, [Ljava/util/UUID;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    mul-int/lit8 v3, v2, 0x4

    invoke-static {p1, v3}, Lpd6;->h([BI)Ljava/util/UUID;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method
