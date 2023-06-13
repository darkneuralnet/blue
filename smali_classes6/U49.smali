.class public final LU49;
.super LV78;
.source "SourceFile"

# interfaces
.implements Lrj8;


# static fields
.field private static final zza:LU49;


# instance fields
.field private zzd:I

.field private zze:Ljava/lang/String;

.field private zzf:LgZ7;

.field private zzg:Ljava/lang/String;

.field private zzh:LgZ7;

.field private zzi:F

.field private zzj:F

.field private zzk:F

.field private zzl:F

.field private zzm:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LU49;

    invoke-direct {v0}, LU49;-><init>()V

    sput-object v0, LU49;->zza:LU49;

    const-class v1, LU49;

    invoke-static {v1, v0}, LV78;->w(Ljava/lang/Class;LV78;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, LV78;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LU49;->zze:Ljava/lang/String;

    sget-object v1, LgZ7;->c:LgZ7;

    iput-object v1, p0, LU49;->zzf:LgZ7;

    iput-object v0, p0, LU49;->zzg:Ljava/lang/String;

    iput-object v1, p0, LU49;->zzh:LgZ7;

    const/high16 v0, 0x3e800000    # 0.25f

    iput v0, p0, LU49;->zzi:F

    iput v0, p0, LU49;->zzj:F

    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, LU49;->zzk:F

    const v0, 0x3f59999a    # 0.85f

    iput v0, p0, LU49;->zzl:F

    const/4 v0, 0x1

    iput v0, p0, LU49;->zzm:I

    return-void
.end method

.method public static H()LvZ8;
    .locals 1

    sget-object v0, LU49;->zza:LU49;

    invoke-virtual {v0}, LV78;->f()Lk58;

    move-result-object v0

    check-cast v0, LvZ8;

    return-object v0
.end method

.method public static synthetic I()LU49;
    .locals 1

    sget-object v0, LU49;->zza:LU49;

    return-object v0
.end method

.method public static synthetic J(LU49;LgZ7;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, LU49;->zzd:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, LU49;->zzd:I

    iput-object p1, p0, LU49;->zzf:LgZ7;

    return-void
.end method

.method public static synthetic K(LU49;LgZ7;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, LU49;->zzd:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, LU49;->zzd:I

    iput-object p1, p0, LU49;->zzh:LgZ7;

    return-void
.end method


# virtual methods
.method public final G(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    sget-object p1, LU49;->zza:LU49;

    return-object p1

    :cond_1
    new-instance p1, LvZ8;

    invoke-direct {p1, p2}, LvZ8;-><init>(LGT8;)V

    return-object p1

    :cond_2
    new-instance p1, LU49;

    invoke-direct {p1}, LU49;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0xa

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zzd"

    aput-object v4, p1, v3

    const-string v3, "zze"

    aput-object v3, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, v2

    const-string p2, "zzg"

    aput-object p2, p1, v1

    const-string p2, "zzh"

    aput-object p2, p1, v0

    const-string p2, "zzi"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zzj"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzk"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzl"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzm"

    aput-object p3, p1, p2

    sget-object p2, LU49;->zza:LU49;

    const-string p3, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100a\u0001\u0003\u1008\u0002\u0004\u100a\u0003\u0005\u1001\u0004\u0006\u1001\u0005\u0007\u1001\u0006\u0008\u1001\u0007\t\u1004\u0008"

    invoke-static {p2, p3, p1}, LV78;->t(Ldj8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
