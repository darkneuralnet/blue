.class public final LHK8;
.super Leu7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# static fields
.field private static final zzb:LHK8;


# instance fields
.field private zze:Lnu7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LHK8;

    invoke-direct {v0}, LHK8;-><init>()V

    sput-object v0, LHK8;->zzb:LHK8;

    const-class v1, LHK8;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Leu7;-><init>()V

    invoke-static {}, Leu7;->s()Lnu7;

    move-result-object v0

    iput-object v0, p0, LHK8;->zze:Lnu7;

    return-void
.end method

.method public static synthetic F()LHK8;
    .locals 1

    sget-object v0, LHK8;->zzb:LHK8;

    return-object v0
.end method

.method public static G()LHK8;
    .locals 1

    sget-object v0, LHK8;->zzb:LHK8;

    return-object v0
.end method


# virtual methods
.method public final B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x2

    if-eq p1, p3, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, LHK8;->zzb:LHK8;

    return-object p1

    :cond_1
    new-instance p1, LvK8;

    invoke-direct {p1, p3}, LvK8;-><init>(LkK8;)V

    return-object p1

    :cond_2
    new-instance p1, LHK8;

    invoke-direct {p1}, LHK8;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "zze"

    aput-object v0, p1, p3

    const-class p3, LYJ8;

    aput-object p3, p1, p2

    sget-object p2, LHK8;->zzb:LHK8;

    const-string p3, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b"

    invoke-static {p2, p3, p1}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final D()I
    .locals 1

    iget-object v0, p0, LHK8;->zze:Lnu7;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final E(I)LYJ8;
    .locals 1

    iget-object v0, p0, LHK8;->zze:Lnu7;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYJ8;

    return-object p1
.end method
