.class public final Lmp8;
.super LpU8;
.source "SourceFile"

# interfaces
.implements LA19;


# static fields
.field private static final zza:Lmp8;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:LCV8;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lmp8;

    invoke-direct {v0}, Lmp8;-><init>()V

    sput-object v0, Lmp8;->zza:Lmp8;

    const-class v1, Lmp8;

    invoke-static {v1, v0}, LpU8;->w(Ljava/lang/Class;LpU8;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, LpU8;-><init>()V

    invoke-static {}, LpU8;->o()LCV8;

    move-result-object v0

    iput-object v0, p0, Lmp8;->zzf:LCV8;

    return-void
.end method

.method public static E()Lap8;
    .locals 1

    sget-object v0, Lmp8;->zza:Lmp8;

    invoke-virtual {v0}, LpU8;->i()LUS8;

    move-result-object v0

    check-cast v0, Lap8;

    return-object v0
.end method

.method public static synthetic F()Lmp8;
    .locals 1

    sget-object v0, Lmp8;->zza:Lmp8;

    return-object v0
.end method

.method public static synthetic H(Lmp8;I)V
    .locals 1

    iget v0, p0, Lmp8;->zzd:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lmp8;->zzd:I

    iput p1, p0, Lmp8;->zze:I

    return-void
.end method

.method public static synthetic I(Lmp8;Ljava/lang/Iterable;)V
    .locals 2

    iget-object v0, p0, Lmp8;->zzf:LCV8;

    invoke-interface {v0}, LNV8;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, LpU8;->p(LCV8;)LCV8;

    move-result-object v0

    iput-object v0, p0, Lmp8;->zzf:LCV8;

    :cond_0
    iget-object p0, p0, Lmp8;->zzf:LCV8;

    invoke-static {p1, p0}, LQJ8;->b(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final A(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    if-eq p1, p3, :cond_2

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, Lmp8;->zza:Lmp8;

    return-object p1

    :cond_1
    new-instance p1, Lap8;

    invoke-direct {p1, p3}, Lap8;-><init>(LXh8;)V

    return-object p1

    :cond_2
    new-instance p1, Lmp8;

    invoke-direct {p1}, Lmp8;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v1, "zzd"

    aput-object v1, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, v0

    sget-object p2, Lmp8;->zza:Lmp8;

    const-string p3, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u0014"

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

    iget-object v0, p0, Lmp8;->zzf:LCV8;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final C()I
    .locals 1

    iget v0, p0, Lmp8;->zze:I

    return v0
.end method

.method public final D(I)J
    .locals 2

    iget-object v0, p0, Lmp8;->zzf:LCV8;

    invoke-interface {v0, p1}, LCV8;->zza(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public final G()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lmp8;->zzf:LCV8;

    return-object v0
.end method

.method public final J()Z
    .locals 2

    iget v0, p0, Lmp8;->zzd:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
