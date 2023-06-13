.class public final Lrm8;
.super Leu7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# static fields
.field private static final zzb:Lrm8;


# instance fields
.field private zze:I

.field private zzf:Z

.field private zzg:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrm8;

    invoke-direct {v0}, Lrm8;-><init>()V

    sput-object v0, Lrm8;->zzb:Lrm8;

    const-class v1, Lrm8;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Leu7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lrm8;->zzg:Ljava/lang/String;

    return-void
.end method

.method public static D()LEe8;
    .locals 1

    sget-object v0, Lrm8;->zzb:Lrm8;

    invoke-virtual {v0}, Leu7;->f()LZt7;

    move-result-object v0

    check-cast v0, LEe8;

    return-object v0
.end method

.method public static synthetic E()Lrm8;
    .locals 1

    sget-object v0, Lrm8;->zzb:Lrm8;

    return-object v0
.end method

.method public static synthetic F(Lrm8;Z)V
    .locals 1

    iget p1, p0, Lrm8;->zze:I

    const/4 v0, 0x1

    or-int/2addr p1, v0

    iput p1, p0, Lrm8;->zze:I

    iput-boolean v0, p0, Lrm8;->zzf:Z

    return-void
.end method

.method public static synthetic G(Lrm8;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lrm8;->zze:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lrm8;->zze:I

    iput-object p1, p0, Lrm8;->zzg:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    sget-object p1, Lrm8;->zzb:Lrm8;

    return-object p1

    :cond_1
    new-instance p1, LEe8;

    invoke-direct {p1, p3}, LEe8;-><init>(Ly68;)V

    return-object p1

    :cond_2
    new-instance p1, Lrm8;

    invoke-direct {p1}, Lrm8;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v1, "zze"

    aput-object v1, p1, p3

    const-string p3, "zzf"

    aput-object p3, p1, p2

    const-string p2, "zzg"

    aput-object p2, p1, v0

    sget-object p2, Lrm8;->zzb:Lrm8;

    const-string p3, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1008\u0001"

    invoke-static {p2, p3, p1}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
