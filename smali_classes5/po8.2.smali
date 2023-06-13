.class public final Lpo8;
.super LpU8;
.source "SourceFile"

# interfaces
.implements LA19;


# static fields
.field private static final zza:Lpo8;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:LNV8;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpo8;

    invoke-direct {v0}, Lpo8;-><init>()V

    sput-object v0, Lpo8;->zza:Lpo8;

    const-class v1, Lpo8;

    invoke-static {v1, v0}, LpU8;->w(Ljava/lang/Class;LpU8;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, LpU8;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lpo8;->zze:I

    invoke-static {}, LpU8;->q()LNV8;

    move-result-object v0

    iput-object v0, p0, Lpo8;->zzf:LNV8;

    return-void
.end method

.method public static B()LQn8;
    .locals 1

    sget-object v0, Lpo8;->zza:Lpo8;

    invoke-virtual {v0}, LpU8;->i()LUS8;

    move-result-object v0

    check-cast v0, LQn8;

    return-object v0
.end method

.method public static synthetic C()Lpo8;
    .locals 1

    sget-object v0, Lpo8;->zza:Lpo8;

    return-object v0
.end method

.method public static synthetic D(Lpo8;LPk8;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lpo8;->zzf:LNV8;

    invoke-interface {v0}, LNV8;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, LpU8;->r(LNV8;)LNV8;

    move-result-object v0

    iput-object v0, p0, Lpo8;->zzf:LNV8;

    :cond_0
    iget-object p0, p0, Lpo8;->zzf:LNV8;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

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
    sget-object p1, Lpo8;->zza:Lpo8;

    return-object p1

    :cond_1
    new-instance p1, LQn8;

    invoke-direct {p1, p2}, LQn8;-><init>(LXh8;)V

    return-object p1

    :cond_2
    new-instance p1, Lpo8;

    invoke-direct {p1}, Lpo8;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v3, "zzd"

    aput-object v3, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    sget-object p2, Ldo8;->a:LgV8;

    aput-object p2, p1, v2

    const-string p2, "zzf"

    aput-object p2, p1, v1

    const-class p2, LPk8;

    aput-object p2, p1, v0

    sget-object p2, Lpo8;->zza:Lpo8;

    const-string p3, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u001b"

    invoke-static {p2, p3, p1}, LpU8;->t(Lr19;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
