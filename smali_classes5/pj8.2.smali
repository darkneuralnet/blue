.class public final Lpj8;
.super LpU8;
.source "SourceFile"

# interfaces
.implements LA19;


# static fields
.field private static final zza:Lpj8;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:LNo8;

.field private zzg:LNo8;

.field private zzh:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpj8;

    invoke-direct {v0}, Lpj8;-><init>()V

    sput-object v0, Lpj8;->zza:Lpj8;

    const-class v1, Lpj8;

    invoke-static {v1, v0}, LpU8;->w(Ljava/lang/Class;LpU8;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LpU8;-><init>()V

    return-void
.end method

.method public static C()Lbj8;
    .locals 1

    sget-object v0, Lpj8;->zza:Lpj8;

    invoke-virtual {v0}, LpU8;->i()LUS8;

    move-result-object v0

    check-cast v0, Lbj8;

    return-object v0
.end method

.method public static synthetic D()Lpj8;
    .locals 1

    sget-object v0, Lpj8;->zza:Lpj8;

    return-object v0
.end method

.method public static synthetic G(Lpj8;I)V
    .locals 1

    iget v0, p0, Lpj8;->zzd:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lpj8;->zzd:I

    iput p1, p0, Lpj8;->zze:I

    return-void
.end method

.method public static synthetic H(Lpj8;LNo8;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lpj8;->zzf:LNo8;

    iget p1, p0, Lpj8;->zzd:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lpj8;->zzd:I

    return-void
.end method

.method public static synthetic I(Lpj8;LNo8;)V
    .locals 0

    iput-object p1, p0, Lpj8;->zzg:LNo8;

    iget p1, p0, Lpj8;->zzd:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Lpj8;->zzd:I

    return-void
.end method

.method public static synthetic J(Lpj8;Z)V
    .locals 1

    iget v0, p0, Lpj8;->zzd:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lpj8;->zzd:I

    iput-boolean p1, p0, Lpj8;->zzh:Z

    return-void
.end method


# virtual methods
.method public final A(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

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
    sget-object p1, Lpj8;->zza:Lpj8;

    return-object p1

    :cond_1
    new-instance p1, Lbj8;

    invoke-direct {p1, p2}, Lbj8;-><init>(LXh8;)V

    return-object p1

    :cond_2
    new-instance p1, Lpj8;

    invoke-direct {p1}, Lpj8;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v3, "zzd"

    aput-object v3, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, v2

    const-string p2, "zzg"

    aput-object p2, p1, v1

    const-string p2, "zzh"

    aput-object p2, p1, v0

    sget-object p2, Lpj8;->zza:Lpj8;

    const-string p3, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1007\u0003"

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

    iget v0, p0, Lpj8;->zze:I

    return v0
.end method

.method public final E()LNo8;
    .locals 1

    iget-object v0, p0, Lpj8;->zzf:LNo8;

    if-nez v0, :cond_0

    invoke-static {}, LNo8;->H()LNo8;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final F()LNo8;
    .locals 1

    iget-object v0, p0, Lpj8;->zzg:LNo8;

    if-nez v0, :cond_0

    invoke-static {}, LNo8;->H()LNo8;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final K()Z
    .locals 1

    iget-boolean v0, p0, Lpj8;->zzh:Z

    return v0
.end method

.method public final M()Z
    .locals 2

    iget v0, p0, Lpj8;->zzd:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final N()Z
    .locals 1

    iget v0, p0, Lpj8;->zzd:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final O()Z
    .locals 1

    iget v0, p0, Lpj8;->zzd:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
