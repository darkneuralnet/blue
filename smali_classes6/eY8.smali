.class public final enum LeY8;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LKX8;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LeY8;",
        ">;",
        "LKX8;"
    }
.end annotation


# static fields
.field public static final enum b:LeY8;

.field public static final enum c:LeY8;

.field public static final d:Lsun/misc/Unsafe;

.field public static final e:I

.field public static final synthetic f:[LeY8;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, LeY8;

    const-string v1, "UNSAFE_LITTLE_ENDIAN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LeY8;-><init>(Ljava/lang/String;I)V

    sput-object v0, LeY8;->b:LeY8;

    new-instance v1, LeY8;

    const-string v3, "UNSAFE_BIG_ENDIAN"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, LeY8;-><init>(Ljava/lang/String;I)V

    sput-object v1, LeY8;->c:LeY8;

    const/4 v3, 0x2

    new-array v3, v3, [LeY8;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, LeY8;->f:[LeY8;

    invoke-static {}, LeY8;->d()Lsun/misc/Unsafe;

    move-result-object v0

    sput-object v0, LeY8;->d:Lsun/misc/Unsafe;

    const-class v1, [B

    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I

    move-result v2

    sput v2, LeY8;->e:I

    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->arrayIndexScale(Ljava/lang/Class;)I

    move-result v0

    if-ne v0, v4, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static final b([BI)J
    .locals 5

    sget-object v0, LeY8;->d:Lsun/misc/Unsafe;

    int-to-long v1, p1

    sget p1, LeY8;->e:I

    int-to-long v3, p1

    add-long/2addr v1, v3

    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final c([BI)J
    .locals 5

    sget-object v0, LeY8;->d:Lsun/misc/Unsafe;

    int-to-long v1, p1

    sget p1, LeY8;->e:I

    int-to-long v3, p1

    add-long/2addr v1, v3

    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->reverseBytes(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static d()Lsun/misc/Unsafe;
    .locals 3

    :try_start_0
    invoke-static {}, Lsun/misc/Unsafe;->getUnsafe()Lsun/misc/Unsafe;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    :try_start_1
    new-instance v0, LUX8;

    invoke-direct {v0}, LUX8;-><init>()V

    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsun/misc/Unsafe;
    :try_end_1
    .catch Ljava/security/PrivilegedActionException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    :catch_1
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Could not initialize intrinsics"

    invoke-virtual {v0}, Ljava/security/PrivilegedActionException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static values()[LeY8;
    .locals 1

    sget-object v0, LeY8;->f:[LeY8;

    invoke-virtual {v0}, [LeY8;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LeY8;

    return-object v0
.end method


# virtual methods
.method public final synthetic a([BI)J
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-static {p1, p2}, LeY8;->c([BI)J

    move-result-wide p1

    return-wide p1

    :cond_0
    const/4 p1, 0x0

    throw p1

    :cond_1
    invoke-static {p1, p2}, LeY8;->b([BI)J

    move-result-wide p1

    return-wide p1
.end method
