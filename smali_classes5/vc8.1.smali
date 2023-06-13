.class public final Lvc8;
.super LpU8;
.source "SourceFile"

# interfaces
.implements LA19;


# static fields
.field private static final zza:Lvc8;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:Ljava/lang/String;

.field private zzg:LDa8;

.field private zzh:Z

.field private zzi:Z

.field private zzj:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvc8;

    invoke-direct {v0}, Lvc8;-><init>()V

    sput-object v0, Lvc8;->zza:Lvc8;

    const-class v1, Lvc8;

    invoke-static {v1, v0}, LpU8;->w(Ljava/lang/Class;LpU8;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, LpU8;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lvc8;->zzf:Ljava/lang/String;

    return-void
.end method

.method public static D()Lgc8;
    .locals 1

    sget-object v0, Lvc8;->zza:Lvc8;

    invoke-virtual {v0}, LpU8;->i()LUS8;

    move-result-object v0

    check-cast v0, Lgc8;

    return-object v0
.end method

.method public static synthetic E()Lvc8;
    .locals 1

    sget-object v0, Lvc8;->zza:Lvc8;

    return-object v0
.end method

.method public static synthetic G(Lvc8;Ljava/lang/String;)V
    .locals 1

    iget v0, p0, Lvc8;->zzd:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lvc8;->zzd:I

    iput-object p1, p0, Lvc8;->zzf:Ljava/lang/String;

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
    sget-object p1, Lvc8;->zza:Lvc8;

    return-object p1

    :cond_1
    new-instance p1, Lgc8;

    invoke-direct {p1, p2}, Lgc8;-><init>(LO88;)V

    return-object p1

    :cond_2
    new-instance p1, Lvc8;

    invoke-direct {p1}, Lvc8;-><init>()V

    return-object p1

    :cond_3
    const/4 p1, 0x7

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

    sget-object p2, Lvc8;->zza:Lvc8;

    const-string p3, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u1009\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u1007\u0005"

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

    iget v0, p0, Lvc8;->zze:I

    return v0
.end method

.method public final C()LDa8;
    .locals 1

    iget-object v0, p0, Lvc8;->zzg:LDa8;

    if-nez v0, :cond_0

    invoke-static {}, LDa8;->C()LDa8;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final F()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvc8;->zzf:Ljava/lang/String;

    return-object v0
.end method

.method public final H()Z
    .locals 1

    iget-boolean v0, p0, Lvc8;->zzh:Z

    return v0
.end method

.method public final I()Z
    .locals 1

    iget-boolean v0, p0, Lvc8;->zzi:Z

    return v0
.end method

.method public final J()Z
    .locals 1

    iget-boolean v0, p0, Lvc8;->zzj:Z

    return v0
.end method

.method public final K()Z
    .locals 2

    iget v0, p0, Lvc8;->zzd:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final M()Z
    .locals 1

    iget v0, p0, Lvc8;->zzd:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
