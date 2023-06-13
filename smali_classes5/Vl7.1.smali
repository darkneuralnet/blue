.class public final LVl7;
.super Lub9;
.source "SourceFile"

# interfaces
.implements Lwg9;


# static fields
.field private static final zzb:LVl7;


# instance fields
.field private zze:I

.field private zzf:F

.field private zzg:I

.field private zzh:I

.field private zzi:I

.field private zzj:Z

.field private zzk:Z

.field private zzl:F

.field private zzm:F

.field private zzn:Z

.field private zzo:LKn7;

.field private zzp:LAq9;

.field private zzq:Lls7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LVl7;

    invoke-direct {v0}, LVl7;-><init>()V

    sput-object v0, LVl7;->zzb:LVl7;

    const-class v1, LVl7;

    invoke-static {v1, v0}, Lub9;->k(Ljava/lang/Class;Lub9;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lub9;-><init>()V

    const v0, 0x3dcccccd    # 0.1f

    iput v0, p0, LVl7;->zzf:F

    const/4 v0, 0x1

    iput v0, p0, LVl7;->zzg:I

    iput v0, p0, LVl7;->zzh:I

    iput v0, p0, LVl7;->zzi:I

    const/high16 v0, 0x42340000    # 45.0f

    iput v0, p0, LVl7;->zzl:F

    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, LVl7;->zzm:F

    return-void
.end method

.method public static synthetic A(LVl7;LAq9;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LVl7;->zzp:LAq9;

    iget p1, p0, LVl7;->zze:I

    or-int/lit16 p1, p1, 0x400

    iput p1, p0, LVl7;->zze:I

    return-void
.end method

.method public static synthetic B(LVl7;Lls7;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LVl7;->zzq:Lls7;

    iget p1, p0, LVl7;->zze:I

    or-int/lit16 p1, p1, 0x800

    iput p1, p0, LVl7;->zze:I

    return-void
.end method

.method public static synthetic C(LVl7;Z)V
    .locals 1

    iget v0, p0, LVl7;->zze:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, LVl7;->zze:I

    iput-boolean p1, p0, LVl7;->zzj:Z

    return-void
.end method

.method public static synthetic F(LVl7;I)V
    .locals 0

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, LVl7;->zzg:I

    iget p1, p0, LVl7;->zze:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, LVl7;->zze:I

    return-void
.end method

.method public static synthetic G(LVl7;I)V
    .locals 0

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, LVl7;->zzh:I

    iget p1, p0, LVl7;->zze:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, LVl7;->zze:I

    return-void
.end method

.method public static synthetic H(LVl7;I)V
    .locals 0

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, LVl7;->zzi:I

    iget p1, p0, LVl7;->zze:I

    or-int/lit8 p1, p1, 0x8

    iput p1, p0, LVl7;->zze:I

    return-void
.end method

.method public static u()LZk7;
    .locals 1

    sget-object v0, LVl7;->zzb:LVl7;

    invoke-virtual {v0}, Lub9;->o()LFa9;

    move-result-object v0

    check-cast v0, LZk7;

    return-object v0
.end method

.method public static synthetic v()LVl7;
    .locals 1

    sget-object v0, LVl7;->zzb:LVl7;

    return-object v0
.end method

.method public static synthetic w(LVl7;F)V
    .locals 1

    iget v0, p0, LVl7;->zze:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, LVl7;->zze:I

    iput p1, p0, LVl7;->zzf:F

    return-void
.end method

.method public static synthetic x(LVl7;Z)V
    .locals 1

    iget v0, p0, LVl7;->zze:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, LVl7;->zze:I

    iput-boolean p1, p0, LVl7;->zzk:Z

    return-void
.end method

.method public static synthetic y(LVl7;Z)V
    .locals 0

    iget p1, p0, LVl7;->zze:I

    or-int/lit16 p1, p1, 0x100

    iput p1, p0, LVl7;->zze:I

    const/4 p1, 0x1

    iput-boolean p1, p0, LVl7;->zzn:Z

    return-void
.end method

.method public static synthetic z(LVl7;LKn7;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LVl7;->zzo:LKn7;

    iget p1, p0, LVl7;->zze:I

    or-int/lit16 p1, p1, 0x200

    iput p1, p0, LVl7;->zze:I

    return-void
.end method


# virtual methods
.method public final D()I
    .locals 1

    iget v0, p0, LVl7;->zzh:I

    invoke-static {v0}, Lev9;->a(I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x2

    :cond_0
    return v0
.end method

.method public final E()I
    .locals 1

    iget v0, p0, LVl7;->zzg:I

    invoke-static {v0}, LFq7;->a(I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x2

    :cond_0
    return v0
.end method

.method public final n(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x5

    const/4 v0, 0x4

    const/4 v1, 0x3

    const/4 v2, 0x2

    if-eq p1, v2, :cond_3

    if-eq p1, v1, :cond_2

    const/4 p2, 0x0

    if-eq p1, v0, :cond_1

    if-eq p1, p3, :cond_0

    return-object p2

    :cond_0
    sget-object p1, LVl7;->zzb:LVl7;

    return-object p1

    :cond_1
    new-instance p1, LZk7;

    invoke-direct {p1, p2}, LZk7;-><init>(Lrl9;)V

    return-object p1

    :cond_2
    new-instance p1, LVl7;

    invoke-direct {p1}, LVl7;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0x10

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zze"

    aput-object v4, p1, v3

    const-string v3, "zzf"

    aput-object v3, p1, p2

    const-string p2, "zzg"

    aput-object p2, p1, v2

    sget-object p2, LLp7;->a:LWb9;

    aput-object p2, p1, v1

    const-string p2, "zzh"

    aput-object p2, p1, v0

    sget-object p2, LIt9;->a:LWb9;

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zzi"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    sget-object p3, Lct7;->a:LWb9;

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzj"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzk"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zzl"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zzn"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zzo"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zzp"

    aput-object p3, p1, p2

    const/16 p2, 0xf

    const-string p3, "zzq"

    aput-object p3, p1, p2

    sget-object p2, LVl7;->zzb:LVl7;

    const-string p3, "\u0001\u000c\u0000\u0001\u0001\u000c\u000c\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u100c\u0001\u0003\u100c\u0002\u0004\u100c\u0003\u0005\u1007\u0004\u0006\u1007\u0005\u0007\u1001\u0006\u0008\u1001\u0007\t\u1007\u0008\n\u1009\t\u000b\u1009\n\u000c\u1009\u000b"

    invoke-static {p2, p3, p1}, Lub9;->j(Lpg9;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
