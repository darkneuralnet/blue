.class public final LDn7;
.super Leu7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# static fields
.field private static final zzb:LDn7;


# instance fields
.field private zze:I

.field private zzf:Lrw7;

.field private zzg:Lfx7;

.field private zzh:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LDn7;

    invoke-direct {v0}, LDn7;-><init>()V

    sput-object v0, LDn7;->zzb:LDn7;

    const-class v1, LDn7;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Leu7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LDn7;->zzh:Ljava/lang/String;

    return-void
.end method

.method public static D()LCn7;
    .locals 1

    sget-object v0, LDn7;->zzb:LDn7;

    invoke-virtual {v0}, Leu7;->f()LZt7;

    move-result-object v0

    check-cast v0, LCn7;

    return-object v0
.end method

.method public static synthetic E()LDn7;
    .locals 1

    sget-object v0, LDn7;->zzb:LDn7;

    return-object v0
.end method

.method public static F([BLzt7;)LDn7;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;
        }
    .end annotation

    sget-object v0, LDn7;->zzb:LDn7;

    invoke-static {v0, p0, p1}, Leu7;->m(Leu7;[BLzt7;)Leu7;

    move-result-object p0

    check-cast p0, LDn7;

    return-object p0
.end method

.method public static synthetic J(LDn7;Lrw7;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LDn7;->zzf:Lrw7;

    iget p1, p0, LDn7;->zze:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, LDn7;->zze:I

    return-void
.end method

.method public static synthetic K(LDn7;Lfx7;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LDn7;->zzg:Lfx7;

    iget p1, p0, LDn7;->zze:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, LDn7;->zze:I

    return-void
.end method

.method public static synthetic L(LDn7;Ljava/lang/String;)V
    .locals 1

    iget v0, p0, LDn7;->zze:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, LDn7;->zze:I

    iput-object p1, p0, LDn7;->zzh:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x4

    const/4 v0, 0x3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_3

    if-eq p1, v0, :cond_2

    const/4 p2, 0x0

    if-eq p1, p3, :cond_1

    const/4 p3, 0x5

    if-eq p1, p3, :cond_0

    return-object p2

    :cond_0
    sget-object p1, LDn7;->zzb:LDn7;

    return-object p1

    :cond_1
    new-instance p1, LCn7;

    invoke-direct {p1, p2}, LCn7;-><init>(LBn7;)V

    return-object p1

    :cond_2
    new-instance p1, LDn7;

    invoke-direct {p1}, LDn7;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v2, "zze"

    aput-object v2, p1, p3

    const-string p3, "zzf"

    aput-object p3, p1, p2

    const-string p2, "zzg"

    aput-object p2, p1, v1

    const-string p2, "zzh"

    aput-object p2, p1, v0

    sget-object p2, LDn7;->zzb:LDn7;

    const-string p3, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1008\u0002"

    invoke-static {p2, p3, p1}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final G()Lrw7;
    .locals 1

    iget-object v0, p0, LDn7;->zzf:Lrw7;

    if-nez v0, :cond_0

    invoke-static {}, Lrw7;->G()Lrw7;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final H()Lfx7;
    .locals 1

    iget-object v0, p0, LDn7;->zzg:Lfx7;

    if-nez v0, :cond_0

    invoke-static {}, Lfx7;->E()Lfx7;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final I()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LDn7;->zzh:Ljava/lang/String;

    return-object v0
.end method

.method public final M()Z
    .locals 2

    iget v0, p0, LDn7;->zze:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
