.class public final LFF7;
.super Leu7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# static fields
.field private static final zzb:LFF7;


# instance fields
.field private zze:I

.field private zzf:Ljava/lang/String;

.field private zzg:Lkt7;

.field private zzh:LHF7;

.field private zzi:Ljava/lang/String;

.field private zzj:Lkt7;

.field private zzk:LHF7;

.field private zzl:Ljava/lang/String;

.field private zzm:Lkt7;

.field private zzn:LHF7;

.field private zzo:Ljava/lang/String;

.field private zzp:Ljava/lang/String;

.field private zzq:LHF7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LFF7;

    invoke-direct {v0}, LFF7;-><init>()V

    sput-object v0, LFF7;->zzb:LFF7;

    const-class v1, LFF7;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Leu7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LFF7;->zzf:Ljava/lang/String;

    sget-object v1, Lkt7;->c:Lkt7;

    iput-object v1, p0, LFF7;->zzg:Lkt7;

    iput-object v0, p0, LFF7;->zzi:Ljava/lang/String;

    iput-object v1, p0, LFF7;->zzj:Lkt7;

    iput-object v0, p0, LFF7;->zzl:Ljava/lang/String;

    iput-object v1, p0, LFF7;->zzm:Lkt7;

    iput-object v0, p0, LFF7;->zzo:Ljava/lang/String;

    iput-object v0, p0, LFF7;->zzp:Ljava/lang/String;

    return-void
.end method

.method public static D()LEF7;
    .locals 1

    sget-object v0, LFF7;->zzb:LFF7;

    invoke-virtual {v0}, Leu7;->f()LZt7;

    move-result-object v0

    check-cast v0, LEF7;

    return-object v0
.end method

.method public static synthetic E()LFF7;
    .locals 1

    sget-object v0, LFF7;->zzb:LFF7;

    return-object v0
.end method

.method public static F()LFF7;
    .locals 1

    sget-object v0, LFF7;->zzb:LFF7;

    return-object v0
.end method

.method public static synthetic G(LFF7;Lkt7;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, LFF7;->zze:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, LFF7;->zze:I

    iput-object p1, p0, LFF7;->zzj:Lkt7;

    return-void
.end method

.method public static synthetic H(LFF7;Lkt7;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, LFF7;->zze:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, LFF7;->zze:I

    iput-object p1, p0, LFF7;->zzm:Lkt7;

    return-void
.end method

.method public static synthetic I(LFF7;LHF7;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LFF7;->zzh:LHF7;

    iget p1, p0, LFF7;->zze:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, LFF7;->zze:I

    return-void
.end method


# virtual methods
.method public final B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    sget-object p1, LFF7;->zzb:LFF7;

    return-object p1

    :cond_1
    new-instance p1, LEF7;

    invoke-direct {p1, p2}, LEF7;-><init>(LCF7;)V

    return-object p1

    :cond_2
    new-instance p1, LFF7;

    invoke-direct {p1}, LFF7;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0xd

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zze"

    aput-object v4, p1, v3

    const-string v3, "zzf"

    aput-object v3, p1, p2

    const-string p2, "zzg"

    aput-object p2, p1, v2

    const-string p2, "zzj"

    aput-object p2, p1, v1

    const-string p2, "zzi"

    aput-object p2, p1, v0

    const-string p2, "zzl"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzo"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzp"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzh"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zzk"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zzn"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zzq"

    aput-object p3, p1, p2

    sget-object p2, LFF7;->zzb:LFF7;

    const-string p3, "\u0001\u000c\u0000\u0001\u0001\u000c\u000c\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100a\u0001\u0003\u100a\u0004\u0004\u1008\u0003\u0005\u1008\u0006\u0006\u100a\u0007\u0007\u1008\t\u0008\u1008\n\t\u1009\u0002\n\u1009\u0005\u000b\u1009\u0008\u000c\u1009\u000b"

    invoke-static {p2, p3, p1}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
