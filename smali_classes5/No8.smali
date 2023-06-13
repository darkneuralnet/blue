.class public final LNo8;
.super LpU8;
.source "SourceFile"

# interfaces
.implements LA19;


# static fields
.field private static final zza:LNo8;


# instance fields
.field private zzd:LCV8;

.field private zze:LCV8;

.field private zzf:LNV8;

.field private zzg:LNV8;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LNo8;

    invoke-direct {v0}, LNo8;-><init>()V

    sput-object v0, LNo8;->zza:LNo8;

    const-class v1, LNo8;

    invoke-static {v1, v0}, LpU8;->w(Ljava/lang/Class;LpU8;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, LpU8;-><init>()V

    invoke-static {}, LpU8;->o()LCV8;

    move-result-object v0

    iput-object v0, p0, LNo8;->zzd:LCV8;

    invoke-static {}, LpU8;->o()LCV8;

    move-result-object v0

    iput-object v0, p0, LNo8;->zze:LCV8;

    invoke-static {}, LpU8;->q()LNV8;

    move-result-object v0

    iput-object v0, p0, LNo8;->zzf:LNV8;

    invoke-static {}, LpU8;->q()LNV8;

    move-result-object v0

    iput-object v0, p0, LNo8;->zzg:LNV8;

    return-void
.end method

.method public static F()LBo8;
    .locals 1

    sget-object v0, LNo8;->zza:LNo8;

    invoke-virtual {v0}, LpU8;->i()LUS8;

    move-result-object v0

    check-cast v0, LBo8;

    return-object v0
.end method

.method public static synthetic G()LNo8;
    .locals 1

    sget-object v0, LNo8;->zza:LNo8;

    return-object v0
.end method

.method public static H()LNo8;
    .locals 1

    sget-object v0, LNo8;->zza:LNo8;

    return-object v0
.end method

.method public static synthetic N(LNo8;Ljava/lang/Iterable;)V
    .locals 2

    iget-object v0, p0, LNo8;->zzd:LCV8;

    invoke-interface {v0}, LNV8;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, LpU8;->p(LCV8;)LCV8;

    move-result-object v0

    iput-object v0, p0, LNo8;->zzd:LCV8;

    :cond_0
    iget-object p0, p0, LNo8;->zzd:LCV8;

    invoke-static {p1, p0}, LQJ8;->b(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic O(LNo8;)V
    .locals 1

    invoke-static {}, LpU8;->o()LCV8;

    move-result-object v0

    iput-object v0, p0, LNo8;->zzd:LCV8;

    return-void
.end method

.method public static synthetic P(LNo8;Ljava/lang/Iterable;)V
    .locals 2

    iget-object v0, p0, LNo8;->zze:LCV8;

    invoke-interface {v0}, LNV8;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, LpU8;->p(LCV8;)LCV8;

    move-result-object v0

    iput-object v0, p0, LNo8;->zze:LCV8;

    :cond_0
    iget-object p0, p0, LNo8;->zze:LCV8;

    invoke-static {p1, p0}, LQJ8;->b(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic Q(LNo8;)V
    .locals 1

    invoke-static {}, LpU8;->o()LCV8;

    move-result-object v0

    iput-object v0, p0, LNo8;->zze:LCV8;

    return-void
.end method

.method public static synthetic R(LNo8;Ljava/lang/Iterable;)V
    .locals 2

    iget-object v0, p0, LNo8;->zzf:LNV8;

    invoke-interface {v0}, LNV8;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, LpU8;->r(LNV8;)LNV8;

    move-result-object v0

    iput-object v0, p0, LNo8;->zzf:LNV8;

    :cond_0
    iget-object p0, p0, LNo8;->zzf:LNV8;

    invoke-static {p1, p0}, LQJ8;->b(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic S(LNo8;)V
    .locals 1

    invoke-static {}, LpU8;->q()LNV8;

    move-result-object v0

    iput-object v0, p0, LNo8;->zzf:LNV8;

    return-void
.end method

.method public static synthetic T(LNo8;Ljava/lang/Iterable;)V
    .locals 2

    iget-object v0, p0, LNo8;->zzg:LNV8;

    invoke-interface {v0}, LNV8;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, LpU8;->r(LNV8;)LNV8;

    move-result-object v0

    iput-object v0, p0, LNo8;->zzg:LNV8;

    :cond_0
    iget-object p0, p0, LNo8;->zzg:LNV8;

    invoke-static {p1, p0}, LQJ8;->b(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic U(LNo8;)V
    .locals 1

    invoke-static {}, LpU8;->q()LNV8;

    move-result-object v0

    iput-object v0, p0, LNo8;->zzg:LNV8;

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
    sget-object p1, LNo8;->zza:LNo8;

    return-object p1

    :cond_1
    new-instance p1, LBo8;

    invoke-direct {p1, p2}, LBo8;-><init>(LXh8;)V

    return-object p1

    :cond_2
    new-instance p1, LNo8;

    invoke-direct {p1}, LNo8;-><init>()V

    return-object p1

    :cond_3
    const/4 p1, 0x6

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zzd"

    aput-object v4, p1, v3

    const-string v3, "zze"

    aput-object v3, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, v2

    const-class p2, LQj8;

    aput-object p2, p1, v1

    const-string p2, "zzg"

    aput-object p2, p1, v0

    const-class p2, Lmp8;

    aput-object p2, p1, p3

    sget-object p2, LNo8;->zza:LNo8;

    const-string p3, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b"

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

    iget-object v0, p0, LNo8;->zzf:LNV8;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final C()I
    .locals 1

    iget-object v0, p0, LNo8;->zze:LCV8;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final D()I
    .locals 1

    iget-object v0, p0, LNo8;->zzg:LNV8;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final E()I
    .locals 1

    iget-object v0, p0, LNo8;->zzd:LCV8;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final I()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LNo8;->zzf:LNV8;

    return-object v0
.end method

.method public final J()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LNo8;->zze:LCV8;

    return-object v0
.end method

.method public final K()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LNo8;->zzg:LNV8;

    return-object v0
.end method

.method public final M()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LNo8;->zzd:LCV8;

    return-object v0
.end method
