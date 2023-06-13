.class public final LHi7;
.super Lub9;
.source "SourceFile"

# interfaces
.implements Lwg9;


# static fields
.field private static final zzb:LHi7;


# instance fields
.field private zze:I

.field private zzf:I

.field private zzg:Ldc9;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LHi7;

    invoke-direct {v0}, LHi7;-><init>()V

    sput-object v0, LHi7;->zzb:LHi7;

    const-class v1, LHi7;

    invoke-static {v1, v0}, Lub9;->k(Ljava/lang/Class;Lub9;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lub9;-><init>()V

    invoke-static {}, Lub9;->e()Ldc9;

    move-result-object v0

    iput-object v0, p0, LHi7;->zzg:Ldc9;

    return-void
.end method

.method public static synthetic u()LHi7;
    .locals 1

    sget-object v0, LHi7;->zzb:LHi7;

    return-object v0
.end method

.method public static v()LHi7;
    .locals 1

    sget-object v0, LHi7;->zzb:LHi7;

    return-object v0
.end method


# virtual methods
.method public final n(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    sget-object p1, LHi7;->zzb:LHi7;

    return-object p1

    :cond_1
    new-instance p1, Low9;

    invoke-direct {p1, p2}, Low9;-><init>(Lrl9;)V

    return-object p1

    :cond_2
    new-instance p1, LHi7;

    invoke-direct {p1}, LHi7;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v3, "zze"

    aput-object v3, p1, p3

    const-string p3, "zzf"

    aput-object p3, p1, p2

    sget-object p2, Lwg7;->a:LWb9;

    aput-object p2, p1, v2

    const-string p2, "zzg"

    aput-object p2, p1, v1

    const-class p2, Lpy9;

    aput-object p2, p1, v0

    sget-object p2, LHi7;->zzb:LHi7;

    const-string p3, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u001b"

    invoke-static {p2, p3, p1}, Lub9;->j(Lpg9;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final w()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LHi7;->zzg:Ldc9;

    return-object v0
.end method

.method public final x()I
    .locals 1

    iget v0, p0, LHi7;->zzf:I

    invoke-static {v0}, Luh7;->a(I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method
