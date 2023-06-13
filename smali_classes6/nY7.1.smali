.class public final LnY7;
.super Leu7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# static fields
.field private static final zzb:LnY7;


# instance fields
.field private zze:Lnu7;

.field private zzf:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LnY7;

    invoke-direct {v0}, LnY7;-><init>()V

    sput-object v0, LnY7;->zzb:LnY7;

    const-class v1, LnY7;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Leu7;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, LnY7;->zzf:B

    invoke-static {}, Leu7;->s()Lnu7;

    move-result-object v0

    iput-object v0, p0, LnY7;->zze:Lnu7;

    return-void
.end method

.method public static synthetic E()LnY7;
    .locals 1

    sget-object v0, LnY7;->zzb:LnY7;

    return-object v0
.end method

.method public static F()LnY7;
    .locals 1

    sget-object v0, LnY7;->zzb:LnY7;

    return-object v0
.end method

.method public static G([BLzt7;)LnY7;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;
        }
    .end annotation

    sget-object v0, LnY7;->zzb:LnY7;

    invoke-static {v0, p0, p1}, Leu7;->m(Leu7;[BLzt7;)Leu7;

    move-result-object p0

    check-cast p0, LnY7;

    return-object p0
.end method

.method public static synthetic I(LnY7;Ljava/lang/Iterable;)V
    .locals 2

    iget-object v0, p0, LnY7;->zze:Lnu7;

    invoke-interface {v0}, Lnu7;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Leu7;->t(Lnu7;)Lnu7;

    move-result-object v0

    iput-object v0, p0, LnY7;->zze:Lnu7;

    :cond_0
    iget-object p0, p0, LnY7;->zze:Lnu7;

    invoke-static {p1, p0}, Lys7;->c(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_5

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x2

    if-eq p1, v1, :cond_4

    const/4 v1, 0x3

    if-eq p1, v1, :cond_3

    const/4 v1, 0x4

    const/4 v2, 0x0

    if-eq p1, v1, :cond_2

    const/4 v1, 0x5

    if-eq p1, v1, :cond_1

    if-nez p2, :cond_0

    move p3, v0

    :cond_0
    iput-byte p3, p0, LnY7;->zzf:B

    return-object v2

    :cond_1
    sget-object p1, LnY7;->zzb:LnY7;

    return-object p1

    :cond_2
    new-instance p1, LfQ7;

    invoke-direct {p1, v2}, LfQ7;-><init>(LsC7;)V

    return-object p1

    :cond_3
    new-instance p1, LnY7;

    invoke-direct {p1}, LnY7;-><init>()V

    return-object p1

    :cond_4
    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "zze"

    aput-object p2, p1, v0

    const-class p2, Lzz7;

    aput-object p2, p1, p3

    sget-object p2, LnY7;->zzb:LnY7;

    const-string p3, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b"

    invoke-static {p2, p3, p1}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LnY7;->zzf:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final D()I
    .locals 1

    iget-object v0, p0, LnY7;->zze:Lnu7;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final H()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LnY7;->zze:Lnu7;

    return-object v0
.end method
