.class public final LdK7;
.super Leu7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# static fields
.field private static final zzb:LdK7;


# instance fields
.field private zze:I

.field private zzf:LCw8;

.field private zzg:LNw7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LdK7;

    invoke-direct {v0}, LdK7;-><init>()V

    sput-object v0, LdK7;->zzb:LdK7;

    const-class v1, LdK7;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Leu7;-><init>()V

    return-void
.end method

.method public static synthetic D()LdK7;
    .locals 1

    sget-object v0, LdK7;->zzb:LdK7;

    return-object v0
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
    sget-object p1, LdK7;->zzb:LdK7;

    return-object p1

    :cond_1
    new-instance p1, LcK7;

    invoke-direct {p1, p3}, LcK7;-><init>(LbK7;)V

    return-object p1

    :cond_2
    new-instance p1, LdK7;

    invoke-direct {p1}, LdK7;-><init>()V

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

    sget-object p2, LdK7;->zzb:LdK7;

    const-string p3, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001"

    invoke-static {p2, p3, p1}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
