.class public final LOi8;
.super LpU8;
.source "SourceFile"

# interfaces
.implements LA19;


# static fields
.field private static final zza:LOi8;


# instance fields
.field private zzd:I

.field private zze:Ljava/lang/String;

.field private zzf:Ljava/lang/String;

.field private zzg:Ljava/lang/String;

.field private zzh:Ljava/lang/String;

.field private zzi:Ljava/lang/String;

.field private zzj:Ljava/lang/String;

.field private zzk:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LOi8;

    invoke-direct {v0}, LOi8;-><init>()V

    sput-object v0, LOi8;->zza:LOi8;

    const-class v1, LOi8;

    invoke-static {v1, v0}, LpU8;->w(Ljava/lang/Class;LpU8;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, LpU8;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LOi8;->zze:Ljava/lang/String;

    iput-object v0, p0, LOi8;->zzf:Ljava/lang/String;

    iput-object v0, p0, LOi8;->zzg:Ljava/lang/String;

    iput-object v0, p0, LOi8;->zzh:Ljava/lang/String;

    iput-object v0, p0, LOi8;->zzi:Ljava/lang/String;

    iput-object v0, p0, LOi8;->zzj:Ljava/lang/String;

    iput-object v0, p0, LOi8;->zzk:Ljava/lang/String;

    return-void
.end method

.method public static synthetic B()LOi8;
    .locals 1

    sget-object v0, LOi8;->zza:LOi8;

    return-object v0
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
    sget-object p1, LOi8;->zza:LOi8;

    return-object p1

    :cond_1
    new-instance p1, Lzi8;

    invoke-direct {p1, p2}, Lzi8;-><init>(LXh8;)V

    return-object p1

    :cond_2
    new-instance p1, LOi8;

    invoke-direct {p1}, LOi8;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0x8

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

    sget-object p2, LOi8;->zza:LOi8;

    const-string p3, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1008\u0006"

    invoke-static {p2, p3, p1}, LpU8;->t(Lr19;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
