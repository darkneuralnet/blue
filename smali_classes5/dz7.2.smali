.class public final Ldz7;
.super Leu7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# static fields
.field private static final zzb:Ldz7;


# instance fields
.field private zze:I

.field private zzf:I

.field private zzg:I

.field private zzh:Ljava/lang/String;

.field private zzi:Ljava/lang/String;

.field private zzj:LPy7;

.field private zzk:LZy7;

.field private zzl:I

.field private zzm:Lnu7;

.field private zzn:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldz7;

    invoke-direct {v0}, Ldz7;-><init>()V

    sput-object v0, Ldz7;->zzb:Ldz7;

    const-class v1, Ldz7;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Leu7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Ldz7;->zzh:Ljava/lang/String;

    iput-object v0, p0, Ldz7;->zzi:Ljava/lang/String;

    invoke-static {}, Leu7;->s()Lnu7;

    move-result-object v0

    iput-object v0, p0, Ldz7;->zzm:Lnu7;

    return-void
.end method

.method public static synthetic F()Ldz7;
    .locals 1

    sget-object v0, Ldz7;->zzb:Ldz7;

    return-object v0
.end method

.method public static G()Ldz7;
    .locals 1

    sget-object v0, Ldz7;->zzb:Ldz7;

    return-object v0
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
    sget-object p1, Ldz7;->zzb:Ldz7;

    return-object p1

    :cond_1
    new-instance p1, LVy7;

    invoke-direct {p1, p2}, LVy7;-><init>(LMy7;)V

    return-object p1

    :cond_2
    new-instance p1, Ldz7;

    invoke-direct {p1}, Ldz7;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0xd

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zze"

    aput-object v4, p1, v3

    const-string v3, "zzf"

    aput-object v3, p1, p2

    sget-object p2, LTy7;->a:Liu7;

    aput-object p2, p1, v2

    const-string p2, "zzg"

    aput-object p2, p1, v1

    sget-object p2, Lbz7;->a:Liu7;

    aput-object p2, p1, v0

    const-string p2, "zzh"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zzi"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzj"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzk"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzl"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-class p3, LBz7;

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zzn"

    aput-object p3, p1, p2

    sget-object p2, Ldz7;->zzb:Ldz7;

    const-string p3, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1009\u0004\u0006\u1009\u0005\u0007\u1004\u0006\u0008\u001b\t\u1004\u0007"

    invoke-static {p2, p3, p1}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final D()LPy7;
    .locals 1

    iget-object v0, p0, Ldz7;->zzj:LPy7;

    if-nez v0, :cond_0

    invoke-static {}, LPy7;->E()LPy7;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final E()LZy7;
    .locals 1

    iget-object v0, p0, Ldz7;->zzk:LZy7;

    if-nez v0, :cond_0

    invoke-static {}, LZy7;->F()LZy7;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final H()I
    .locals 1

    iget v0, p0, Ldz7;->zzf:I

    invoke-static {v0}, LUy7;->a(I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public final I()I
    .locals 1

    iget v0, p0, Ldz7;->zzg:I

    invoke-static {v0}, Lcz7;->a(I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method