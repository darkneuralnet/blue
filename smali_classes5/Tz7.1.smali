.class public final LTz7;
.super Lbu7;
.source "SourceFile"


# static fields
.field private static final zze:LTz7;


# instance fields
.field private zzf:I

.field private zzg:Lnu7;

.field private zzh:Z

.field private zzi:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LTz7;

    invoke-direct {v0}, LTz7;-><init>()V

    sput-object v0, LTz7;->zze:LTz7;

    const-class v1, LTz7;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lbu7;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, LTz7;->zzi:B

    invoke-static {}, Leu7;->s()Lnu7;

    move-result-object v0

    iput-object v0, p0, LTz7;->zzg:Lnu7;

    return-void
.end method

.method public static synthetic E()LTz7;
    .locals 1

    sget-object v0, LTz7;->zze:LTz7;

    return-object v0
.end method


# virtual methods
.method public final B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_5

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x4

    const/4 v2, 0x3

    const/4 v3, 0x2

    if-eq p1, v3, :cond_4

    if-eq p1, v2, :cond_3

    const/4 v2, 0x0

    if-eq p1, v1, :cond_2

    const/4 v1, 0x5

    if-eq p1, v1, :cond_1

    if-nez p2, :cond_0

    move p3, v0

    :cond_0
    iput-byte p3, p0, LTz7;->zzi:B

    return-object v2

    :cond_1
    sget-object p1, LTz7;->zze:LTz7;

    return-object p1

    :cond_2
    new-instance p1, LQz7;

    invoke-direct {p1, v2}, LQz7;-><init>(LMy7;)V

    return-object p1

    :cond_3
    new-instance p1, LTz7;

    invoke-direct {p1}, LTz7;-><init>()V

    return-object p1

    :cond_4
    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "zzf"

    aput-object p2, p1, v0

    const-string p2, "zzg"

    aput-object p2, p1, p3

    const-class p2, LSz7;

    aput-object p2, p1, v3

    const-string p2, "zzh"

    aput-object p2, p1, v2

    sget-object p2, LTz7;->zze:LTz7;

    const-string p3, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1007\u0000"

    invoke-static {p2, p3, p1}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LTz7;->zzi:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
