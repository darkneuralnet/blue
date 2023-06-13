.class public final LCg8;
.super LpU8;
.source "SourceFile"

# interfaces
.implements LA19;


# static fields
.field private static final zza:LCg8;


# instance fields
.field private zzd:I

.field private zze:J

.field private zzf:Ljava/lang/String;

.field private zzg:I

.field private zzh:LNV8;

.field private zzi:LNV8;

.field private zzj:LNV8;

.field private zzk:Ljava/lang/String;

.field private zzl:Z

.field private zzm:LNV8;

.field private zzn:LNV8;

.field private zzo:Ljava/lang/String;

.field private zzp:Ljava/lang/String;

.field private zzq:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LCg8;

    invoke-direct {v0}, LCg8;-><init>()V

    sput-object v0, LCg8;->zza:LCg8;

    const-class v1, LCg8;

    invoke-static {v1, v0}, LpU8;->w(Ljava/lang/Class;LpU8;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, LpU8;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LCg8;->zzf:Ljava/lang/String;

    invoke-static {}, LpU8;->q()LNV8;

    move-result-object v1

    iput-object v1, p0, LCg8;->zzh:LNV8;

    invoke-static {}, LpU8;->q()LNV8;

    move-result-object v1

    iput-object v1, p0, LCg8;->zzi:LNV8;

    invoke-static {}, LpU8;->q()LNV8;

    move-result-object v1

    iput-object v1, p0, LCg8;->zzj:LNV8;

    iput-object v0, p0, LCg8;->zzk:Ljava/lang/String;

    invoke-static {}, LpU8;->q()LNV8;

    move-result-object v1

    iput-object v1, p0, LCg8;->zzm:LNV8;

    invoke-static {}, LpU8;->q()LNV8;

    move-result-object v1

    iput-object v1, p0, LCg8;->zzn:LNV8;

    iput-object v0, p0, LCg8;->zzo:Ljava/lang/String;

    iput-object v0, p0, LCg8;->zzp:Ljava/lang/String;

    iput-object v0, p0, LCg8;->zzq:Ljava/lang/String;

    return-void
.end method

.method public static F()Lmg8;
    .locals 1

    sget-object v0, LCg8;->zza:LCg8;

    invoke-virtual {v0}, LpU8;->i()LUS8;

    move-result-object v0

    check-cast v0, Lmg8;

    return-object v0
.end method

.method public static synthetic G()LCg8;
    .locals 1

    sget-object v0, LCg8;->zza:LCg8;

    return-object v0
.end method

.method public static H()LCg8;
    .locals 1

    sget-object v0, LCg8;->zza:LCg8;

    return-object v0
.end method

.method public static synthetic R(LCg8;ILXf8;)V
    .locals 2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, LCg8;->zzi:LNV8;

    invoke-interface {v0}, LNV8;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, LpU8;->r(LNV8;)LNV8;

    move-result-object v0

    iput-object v0, p0, LCg8;->zzi:LNV8;

    :cond_0
    iget-object p0, p0, LCg8;->zzi:LNV8;

    invoke-interface {p0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic S(LCg8;)V
    .locals 1

    invoke-static {}, LpU8;->q()LNV8;

    move-result-object v0

    iput-object v0, p0, LCg8;->zzj:LNV8;

    return-void
.end method


# virtual methods
.method public final A(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    sget-object p1, LCg8;->zza:LCg8;

    return-object p1

    :cond_1
    new-instance p1, Lmg8;

    invoke-direct {p1, p2}, Lmg8;-><init>(LWd8;)V

    return-object p1

    :cond_2
    new-instance p1, LCg8;

    invoke-direct {p1}, LCg8;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0x13

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

    const-class p2, LKh8;

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zzi"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-class p3, LXf8;

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzj"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-class p3, Lt98;

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zzk"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zzl"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-class p3, Lsr8;

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zzn"

    aput-object p3, p1, p2

    const/16 p2, 0xf

    const-class p3, Ltf8;

    aput-object p3, p1, p2

    const/16 p2, 0x10

    const-string p3, "zzo"

    aput-object p3, p1, p2

    const/16 p2, 0x11

    const-string p3, "zzp"

    aput-object p3, p1, p2

    const/16 p2, 0x12

    const-string p3, "zzq"

    aput-object p3, p1, p2

    sget-object p2, LCg8;->zza:LCg8;

    const-string p3, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0005\u0000\u0001\u1002\u0000\u0002\u1008\u0001\u0003\u1004\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u1008\u0003\u0008\u1007\u0004\t\u001b\n\u001b\u000b\u1008\u0005\u000c\u1008\u0006\r\u1008\u0007"

    invoke-static {p2, p3, p1}, LpU8;->t(Lr19;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final B()I
    .locals 1

    iget-object v0, p0, LCg8;->zzm:LNV8;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final C()I
    .locals 1

    iget-object v0, p0, LCg8;->zzi:LNV8;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final D()J
    .locals 2

    iget-wide v0, p0, LCg8;->zze:J

    return-wide v0
.end method

.method public final E(I)LXf8;
    .locals 1

    iget-object v0, p0, LCg8;->zzi:LNV8;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXf8;

    return-object p1
.end method

.method public final I()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LCg8;->zzf:Ljava/lang/String;

    return-object v0
.end method

.method public final J()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LCg8;->zzq:Ljava/lang/String;

    return-object v0
.end method

.method public final K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LCg8;->zzp:Ljava/lang/String;

    return-object v0
.end method

.method public final M()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LCg8;->zzo:Ljava/lang/String;

    return-object v0
.end method

.method public final N()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LCg8;->zzj:LNV8;

    return-object v0
.end method

.method public final O()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LCg8;->zzn:LNV8;

    return-object v0
.end method

.method public final P()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LCg8;->zzm:LNV8;

    return-object v0
.end method

.method public final Q()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LCg8;->zzh:LNV8;

    return-object v0
.end method

.method public final T()Z
    .locals 1

    iget-boolean v0, p0, LCg8;->zzl:Z

    return v0
.end method

.method public final U()Z
    .locals 1

    iget v0, p0, LCg8;->zzd:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final V()Z
    .locals 2

    iget v0, p0, LCg8;->zzd:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
