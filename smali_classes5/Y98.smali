.class public final LY98;
.super LpU8;
.source "SourceFile"

# interfaces
.implements LA19;


# static fields
.field private static final zza:LY98;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:Ljava/lang/String;

.field private zzg:LNV8;

.field private zzh:Z

.field private zzi:LVb8;

.field private zzj:Z

.field private zzk:Z

.field private zzl:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LY98;

    invoke-direct {v0}, LY98;-><init>()V

    sput-object v0, LY98;->zza:LY98;

    const-class v1, LY98;

    invoke-static {v1, v0}, LpU8;->w(Ljava/lang/Class;LpU8;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, LpU8;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LY98;->zzf:Ljava/lang/String;

    invoke-static {}, LpU8;->q()LNV8;

    move-result-object v0

    iput-object v0, p0, LY98;->zzg:LNV8;

    return-void
.end method

.method public static D()LI98;
    .locals 1

    sget-object v0, LY98;->zza:LY98;

    invoke-virtual {v0}, LpU8;->i()LUS8;

    move-result-object v0

    check-cast v0, LI98;

    return-object v0
.end method

.method public static synthetic E()LY98;
    .locals 1

    sget-object v0, LY98;->zza:LY98;

    return-object v0
.end method

.method public static synthetic J(LY98;Ljava/lang/String;)V
    .locals 1

    iget v0, p0, LY98;->zzd:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, LY98;->zzd:I

    iput-object p1, p0, LY98;->zzf:Ljava/lang/String;

    return-void
.end method

.method public static synthetic K(LY98;ILDa8;)V
    .locals 2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, LY98;->zzg:LNV8;

    invoke-interface {v0}, LNV8;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, LpU8;->r(LNV8;)LNV8;

    move-result-object v0

    iput-object v0, p0, LY98;->zzg:LNV8;

    :cond_0
    iget-object p0, p0, LY98;->zzg:LNV8;

    invoke-interface {p0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

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
    sget-object p1, LY98;->zza:LY98;

    return-object p1

    :cond_1
    new-instance p1, LI98;

    invoke-direct {p1, p2}, LI98;-><init>(LO88;)V

    return-object p1

    :cond_2
    new-instance p1, LY98;

    invoke-direct {p1}, LY98;-><init>()V

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

    const-class p2, LDa8;

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

    sget-object p2, LY98;->zza:LY98;

    const-string p3, "\u0001\u0008\u0000\u0001\u0001\u0008\u0008\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u001b\u0004\u1007\u0002\u0005\u1009\u0003\u0006\u1007\u0004\u0007\u1007\u0005\u0008\u1007\u0006"

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

    iget-object v0, p0, LY98;->zzg:LNV8;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final C()I
    .locals 1

    iget v0, p0, LY98;->zze:I

    return v0
.end method

.method public final F(I)LDa8;
    .locals 1

    iget-object v0, p0, LY98;->zzg:LNV8;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LDa8;

    return-object p1
.end method

.method public final G()LVb8;
    .locals 1

    iget-object v0, p0, LY98;->zzi:LVb8;

    if-nez v0, :cond_0

    invoke-static {}, LVb8;->C()LVb8;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final H()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LY98;->zzf:Ljava/lang/String;

    return-object v0
.end method

.method public final I()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LY98;->zzg:LNV8;

    return-object v0
.end method

.method public final M()Z
    .locals 1

    iget-boolean v0, p0, LY98;->zzj:Z

    return v0
.end method

.method public final N()Z
    .locals 1

    iget-boolean v0, p0, LY98;->zzk:Z

    return v0
.end method

.method public final O()Z
    .locals 1

    iget-boolean v0, p0, LY98;->zzl:Z

    return v0
.end method

.method public final P()Z
    .locals 1

    iget v0, p0, LY98;->zzd:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final Q()Z
    .locals 2

    iget v0, p0, LY98;->zzd:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final R()Z
    .locals 1

    iget v0, p0, LY98;->zzd:I

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
