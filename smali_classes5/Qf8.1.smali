.class public final LQf8;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQf8$a;,
        LQf8$b;,
        LQf8$c;,
        LQf8$d;
    }
.end annotation


# static fields
.field public static final a:Ljava/util/logging/Logger;

.field public static final b:Lsun/misc/Unsafe;

.field public static final c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static final d:Z

.field public static final e:Z

.field public static final f:LQf8$d;

.field public static final g:Z

.field public static final h:Z

.field public static final i:J

.field public static final j:J

.field public static final k:J

.field public static final l:J

.field public static final m:J

.field public static final n:J

.field public static final o:J

.field public static final p:J

.field public static final q:J

.field public static final r:J

.field public static final s:J

.field public static final t:J

.field public static final u:J

.field public static final v:J

.field public static final w:J

.field public static final x:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const-class v0, LQf8;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, LQf8;->a:Ljava/util/logging/Logger;

    invoke-static {}, LQf8;->z()Lsun/misc/Unsafe;

    move-result-object v0

    sput-object v0, LQf8;->b:Lsun/misc/Unsafe;

    invoke-static {}, LAy7;->c()Ljava/lang/Class;

    move-result-object v1

    sput-object v1, LQf8;->c:Ljava/lang/Class;

    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, LQf8;->G(Ljava/lang/Class;)Z

    move-result v1

    sput-boolean v1, LQf8;->d:Z

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v2}, LQf8;->G(Ljava/lang/Class;)Z

    move-result v2

    sput-boolean v2, LQf8;->e:Z

    const/4 v3, 0x0

    if-nez v0, :cond_1

    :cond_0
    move-object v1, v3

    goto :goto_0

    :cond_1
    invoke-static {}, LAy7;->b()Z

    move-result v4

    if-eqz v4, :cond_3

    if-eqz v1, :cond_2

    new-instance v1, LQf8$b;

    invoke-direct {v1, v0}, LQf8$b;-><init>(Lsun/misc/Unsafe;)V

    goto :goto_0

    :cond_2
    if-eqz v2, :cond_0

    new-instance v1, LQf8$a;

    invoke-direct {v1, v0}, LQf8$a;-><init>(Lsun/misc/Unsafe;)V

    goto :goto_0

    :cond_3
    new-instance v1, LQf8$c;

    invoke-direct {v1, v0}, LQf8$c;-><init>(Lsun/misc/Unsafe;)V

    :goto_0
    sput-object v1, LQf8;->f:LQf8$d;

    invoke-static {}, LQf8;->B()Z

    move-result v0

    sput-boolean v0, LQf8;->g:Z

    invoke-static {}, LQf8;->A()Z

    move-result v0

    sput-boolean v0, LQf8;->h:Z

    const-class v0, [B

    invoke-static {v0}, LQf8;->E(Ljava/lang/Class;)I

    move-result v0

    int-to-long v0, v0

    sput-wide v0, LQf8;->i:J

    const-class v0, [Z

    invoke-static {v0}, LQf8;->E(Ljava/lang/Class;)I

    move-result v1

    int-to-long v1, v1

    sput-wide v1, LQf8;->j:J

    invoke-static {v0}, LQf8;->F(Ljava/lang/Class;)I

    move-result v0

    int-to-long v0, v0

    sput-wide v0, LQf8;->k:J

    const-class v0, [I

    invoke-static {v0}, LQf8;->E(Ljava/lang/Class;)I

    move-result v1

    int-to-long v1, v1

    sput-wide v1, LQf8;->l:J

    invoke-static {v0}, LQf8;->F(Ljava/lang/Class;)I

    move-result v0

    int-to-long v0, v0

    sput-wide v0, LQf8;->m:J

    const-class v0, [J

    invoke-static {v0}, LQf8;->E(Ljava/lang/Class;)I

    move-result v1

    int-to-long v1, v1

    sput-wide v1, LQf8;->n:J

    invoke-static {v0}, LQf8;->F(Ljava/lang/Class;)I

    move-result v0

    int-to-long v0, v0

    sput-wide v0, LQf8;->o:J

    const-class v0, [F

    invoke-static {v0}, LQf8;->E(Ljava/lang/Class;)I

    move-result v1

    int-to-long v1, v1

    sput-wide v1, LQf8;->p:J

    invoke-static {v0}, LQf8;->F(Ljava/lang/Class;)I

    move-result v0

    int-to-long v0, v0

    sput-wide v0, LQf8;->q:J

    const-class v0, [D

    invoke-static {v0}, LQf8;->E(Ljava/lang/Class;)I

    move-result v1

    int-to-long v1, v1

    sput-wide v1, LQf8;->r:J

    invoke-static {v0}, LQf8;->F(Ljava/lang/Class;)I

    move-result v0

    int-to-long v0, v0

    sput-wide v0, LQf8;->s:J

    const-class v0, [Ljava/lang/Object;

    invoke-static {v0}, LQf8;->E(Ljava/lang/Class;)I

    move-result v1

    int-to-long v1, v1

    sput-wide v1, LQf8;->t:J

    invoke-static {v0}, LQf8;->F(Ljava/lang/Class;)I

    move-result v0

    int-to-long v0, v0

    sput-wide v0, LQf8;->u:J

    invoke-static {}, LQf8;->C()Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-static {v0}, LQf8;->n(Ljava/lang/reflect/Field;)J

    move-result-wide v0

    sput-wide v0, LQf8;->v:J

    const-class v0, Ljava/lang/String;

    const-string v1, "value"

    invoke-static {v0, v1}, LQf8;->p(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v1

    const-class v2, [C

    if-ne v1, v2, :cond_4

    move-object v3, v0

    :cond_4
    invoke-static {v3}, LQf8;->n(Ljava/lang/reflect/Field;)J

    move-result-wide v0

    sput-wide v0, LQf8;->w:J

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    if-ne v0, v1, :cond_5

    const/4 v0, 0x1

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    :goto_1
    sput-boolean v0, LQf8;->x:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static A()Z
    .locals 10

    const-class v0, Ljava/lang/Class;

    const-class v1, Ljava/lang/Object;

    sget-object v2, LQf8;->b:Lsun/misc/Unsafe;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return v3

    :cond_0
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v4, "objectFieldOffset"

    const/4 v5, 0x1

    new-array v6, v5, [Ljava/lang/Class;

    const-class v7, Ljava/lang/reflect/Field;

    aput-object v7, v6, v3

    invoke-virtual {v2, v4, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v4, "arrayBaseOffset"

    new-array v6, v5, [Ljava/lang/Class;

    aput-object v0, v6, v3

    invoke-virtual {v2, v4, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v4, "arrayIndexScale"

    new-array v6, v5, [Ljava/lang/Class;

    aput-object v0, v6, v3

    invoke-virtual {v2, v4, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v0, "getInt"

    const/4 v4, 0x2

    new-array v6, v4, [Ljava/lang/Class;

    aput-object v1, v6, v3

    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v7, v6, v5

    invoke-virtual {v2, v0, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v0, "putInt"

    const/4 v6, 0x3

    new-array v8, v6, [Ljava/lang/Class;

    aput-object v1, v8, v3

    aput-object v7, v8, v5

    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v9, v8, v4

    invoke-virtual {v2, v0, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v0, "getLong"

    new-array v8, v4, [Ljava/lang/Class;

    aput-object v1, v8, v3

    aput-object v7, v8, v5

    invoke-virtual {v2, v0, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v0, "putLong"

    new-array v8, v6, [Ljava/lang/Class;

    aput-object v1, v8, v3

    aput-object v7, v8, v5

    aput-object v7, v8, v4

    invoke-virtual {v2, v0, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v0, "getObject"

    new-array v8, v4, [Ljava/lang/Class;

    aput-object v1, v8, v3

    aput-object v7, v8, v5

    invoke-virtual {v2, v0, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v0, "putObject"

    new-array v8, v6, [Ljava/lang/Class;

    aput-object v1, v8, v3

    aput-object v7, v8, v5

    aput-object v1, v8, v4

    invoke-virtual {v2, v0, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    invoke-static {}, LAy7;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    return v5

    :cond_1
    const-string v0, "getByte"

    new-array v8, v4, [Ljava/lang/Class;

    aput-object v1, v8, v3

    aput-object v7, v8, v5

    invoke-virtual {v2, v0, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v0, "putByte"

    new-array v8, v6, [Ljava/lang/Class;

    aput-object v1, v8, v3

    aput-object v7, v8, v5

    sget-object v9, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    aput-object v9, v8, v4

    invoke-virtual {v2, v0, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v0, "getBoolean"

    new-array v8, v4, [Ljava/lang/Class;

    aput-object v1, v8, v3

    aput-object v7, v8, v5

    invoke-virtual {v2, v0, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v0, "putBoolean"

    new-array v8, v6, [Ljava/lang/Class;

    aput-object v1, v8, v3

    aput-object v7, v8, v5

    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v9, v8, v4

    invoke-virtual {v2, v0, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v0, "getFloat"

    new-array v8, v4, [Ljava/lang/Class;

    aput-object v1, v8, v3

    aput-object v7, v8, v5

    invoke-virtual {v2, v0, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v0, "putFloat"

    new-array v8, v6, [Ljava/lang/Class;

    aput-object v1, v8, v3

    aput-object v7, v8, v5

    sget-object v9, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    aput-object v9, v8, v4

    invoke-virtual {v2, v0, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v0, "getDouble"

    new-array v8, v4, [Ljava/lang/Class;

    aput-object v1, v8, v3

    aput-object v7, v8, v5

    invoke-virtual {v2, v0, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v0, "putDouble"

    new-array v6, v6, [Ljava/lang/Class;

    aput-object v1, v6, v3

    aput-object v7, v6, v5

    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    aput-object v1, v6, v4

    invoke-virtual {v2, v0, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v5

    :catchall_0
    move-exception v0

    sget-object v1, LQf8;->a:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x47

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "platform method missing - proto runtime falling back to safer methods: "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v4, "com.google.protobuf.UnsafeUtil"

    const-string v5, "supportsUnsafeArrayOperations"

    invoke-virtual {v1, v2, v4, v5, v0}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v3
.end method

.method public static B()Z
    .locals 11

    const-string v0, "copyMemory"

    const-string v1, "getLong"

    const-class v2, Ljava/lang/Object;

    sget-object v3, LQf8;->b:Lsun/misc/Unsafe;

    const/4 v4, 0x0

    if-nez v3, :cond_0

    return v4

    :cond_0
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-string v5, "objectFieldOffset"

    const/4 v6, 0x1

    new-array v7, v6, [Ljava/lang/Class;

    const-class v8, Ljava/lang/reflect/Field;

    aput-object v8, v7, v4

    invoke-virtual {v3, v5, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const/4 v5, 0x2

    new-array v7, v5, [Ljava/lang/Class;

    aput-object v2, v7, v4

    sget-object v8, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v8, v7, v6

    invoke-virtual {v3, v1, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    invoke-static {}, LQf8;->C()Ljava/lang/reflect/Field;

    move-result-object v7

    if-nez v7, :cond_1

    return v4

    :cond_1
    invoke-static {}, LAy7;->b()Z

    move-result v7

    if-eqz v7, :cond_2

    return v6

    :cond_2
    const-string v7, "getByte"

    new-array v9, v6, [Ljava/lang/Class;

    aput-object v8, v9, v4

    invoke-virtual {v3, v7, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v7, "putByte"

    new-array v9, v5, [Ljava/lang/Class;

    aput-object v8, v9, v4

    sget-object v10, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    aput-object v10, v9, v6

    invoke-virtual {v3, v7, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v7, "getInt"

    new-array v9, v6, [Ljava/lang/Class;

    aput-object v8, v9, v4

    invoke-virtual {v3, v7, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v7, "putInt"

    new-array v9, v5, [Ljava/lang/Class;

    aput-object v8, v9, v4

    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v10, v9, v6

    invoke-virtual {v3, v7, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    new-array v7, v6, [Ljava/lang/Class;

    aput-object v8, v7, v4

    invoke-virtual {v3, v1, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v1, "putLong"

    new-array v7, v5, [Ljava/lang/Class;

    aput-object v8, v7, v4

    aput-object v8, v7, v6

    invoke-virtual {v3, v1, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const/4 v1, 0x3

    new-array v7, v1, [Ljava/lang/Class;

    aput-object v8, v7, v4

    aput-object v8, v7, v6

    aput-object v8, v7, v5

    invoke-virtual {v3, v0, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const/4 v7, 0x5

    new-array v7, v7, [Ljava/lang/Class;

    aput-object v2, v7, v4

    aput-object v8, v7, v6

    aput-object v2, v7, v5

    aput-object v8, v7, v1

    const/4 v1, 0x4

    aput-object v8, v7, v1

    invoke-virtual {v3, v0, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v6

    :catchall_0
    move-exception v0

    sget-object v1, LQf8;->a:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x47

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "platform method missing - proto runtime falling back to safer methods: "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "com.google.protobuf.UnsafeUtil"

    const-string v5, "supportsUnsafeByteBufferOperations"

    invoke-virtual {v1, v2, v3, v5, v0}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v4
.end method

.method public static C()Ljava/lang/reflect/Field;
    .locals 3

    invoke-static {}, LAy7;->b()Z

    move-result v0

    const-class v1, Ljava/nio/Buffer;

    if-eqz v0, :cond_0

    const-string v0, "effectiveDirectAddress"

    invoke-static {v1, v0}, LQf8;->p(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "address"

    invoke-static {v1, v0}, LQf8;->p(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v1, v2, :cond_1

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static synthetic D()J
    .locals 2

    sget-wide v0, LQf8;->i:J

    return-wide v0
.end method

.method public static E(Ljava/lang/Class;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)I"
        }
    .end annotation

    sget-boolean v0, LQf8;->h:Z

    if-eqz v0, :cond_0

    sget-object v0, LQf8;->f:LQf8$d;

    iget-object v0, v0, LQf8$d;->a:Lsun/misc/Unsafe;

    invoke-virtual {v0, p0}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I

    move-result p0

    return p0

    :cond_0
    const/4 p0, -0x1

    return p0
.end method

.method public static F(Ljava/lang/Class;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)I"
        }
    .end annotation

    sget-boolean v0, LQf8;->h:Z

    if-eqz v0, :cond_0

    sget-object v0, LQf8;->f:LQf8$d;

    iget-object v0, v0, LQf8$d;->a:Lsun/misc/Unsafe;

    invoke-virtual {v0, p0}, Lsun/misc/Unsafe;->arrayIndexScale(Ljava/lang/Class;)I

    move-result p0

    return p0

    :cond_0
    const/4 p0, -0x1

    return p0
.end method

.method public static G(Ljava/lang/Class;)Z
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    const-class v0, [B

    invoke-static {}, LAy7;->b()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    :try_start_0
    sget-object v1, LQf8;->c:Ljava/lang/Class;

    const-string v3, "peekLong"

    const/4 v4, 0x2

    new-array v5, v4, [Ljava/lang/Class;

    aput-object p0, v5, v2

    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v7, 0x1

    aput-object v6, v5, v7

    invoke-virtual {v1, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "pokeLong"

    const/4 v5, 0x3

    new-array v8, v5, [Ljava/lang/Class;

    aput-object p0, v8, v2

    sget-object v9, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v9, v8, v7

    aput-object v6, v8, v4

    invoke-virtual {v1, v3, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "pokeInt"

    new-array v8, v5, [Ljava/lang/Class;

    aput-object p0, v8, v2

    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v9, v8, v7

    aput-object v6, v8, v4

    invoke-virtual {v1, v3, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "peekInt"

    new-array v8, v4, [Ljava/lang/Class;

    aput-object p0, v8, v2

    aput-object v6, v8, v7

    invoke-virtual {v1, v3, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "pokeByte"

    new-array v6, v4, [Ljava/lang/Class;

    aput-object p0, v6, v2

    sget-object v8, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    aput-object v8, v6, v7

    invoke-virtual {v1, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "peekByte"

    new-array v6, v7, [Ljava/lang/Class;

    aput-object p0, v6, v2

    invoke-virtual {v1, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "pokeByteArray"

    const/4 v6, 0x4

    new-array v8, v6, [Ljava/lang/Class;

    aput-object p0, v8, v2

    aput-object v0, v8, v7

    aput-object v9, v8, v4

    aput-object v9, v8, v5

    invoke-virtual {v1, v3, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "peekByteArray"

    new-array v6, v6, [Ljava/lang/Class;

    aput-object p0, v6, v2

    aput-object v0, v6, v7

    aput-object v9, v6, v4

    aput-object v9, v6, v5

    invoke-virtual {v1, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v7

    :catchall_0
    return v2
.end method

.method public static H(Ljava/lang/Object;J)I
    .locals 1

    sget-object v0, LQf8;->f:LQf8$d;

    invoke-virtual {v0, p0, p1, p2}, LQf8$d;->j(Ljava/lang/Object;J)I

    move-result p0

    return p0
.end method

.method public static I(Ljava/lang/Object;J)J
    .locals 1

    sget-object v0, LQf8;->f:LQf8$d;

    invoke-virtual {v0, p0, p1, p2}, LQf8$d;->k(Ljava/lang/Object;J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static J(Ljava/lang/Object;J)Z
    .locals 1

    sget-object v0, LQf8;->f:LQf8$d;

    invoke-virtual {v0, p0, p1, p2}, LQf8$d;->l(Ljava/lang/Object;J)Z

    move-result p0

    return p0
.end method

.method public static K(Ljava/lang/Object;J)F
    .locals 1

    sget-object v0, LQf8;->f:LQf8$d;

    invoke-virtual {v0, p0, p1, p2}, LQf8$d;->m(Ljava/lang/Object;J)F

    move-result p0

    return p0
.end method

.method public static L(Ljava/lang/Object;J)D
    .locals 1

    sget-object v0, LQf8;->f:LQf8$d;

    invoke-virtual {v0, p0, p1, p2}, LQf8$d;->n(Ljava/lang/Object;J)D

    move-result-wide p0

    return-wide p0
.end method

.method public static M(Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 1

    sget-object v0, LQf8;->f:LQf8$d;

    iget-object v0, v0, LQf8$d;->a:Lsun/misc/Unsafe;

    invoke-virtual {v0, p0, p1, p2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static N(Ljava/lang/Object;J)B
    .locals 2

    const-wide/16 v0, -0x4

    and-long/2addr v0, p1

    invoke-static {p0, v0, v1}, LQf8;->H(Ljava/lang/Object;J)I

    move-result p0

    not-long p1, p1

    const-wide/16 v0, 0x3

    and-long/2addr p1, v0

    const/4 v0, 0x3

    shl-long/2addr p1, v0

    long-to-int p1, p1

    ushr-int/2addr p0, p1

    int-to-byte p0, p0

    return p0
.end method

.method public static O(Ljava/lang/Object;J)B
    .locals 2

    const-wide/16 v0, -0x4

    and-long/2addr v0, p1

    invoke-static {p0, v0, v1}, LQf8;->H(Ljava/lang/Object;J)I

    move-result p0

    const-wide/16 v0, 0x3

    and-long/2addr p1, v0

    const/4 v0, 0x3

    shl-long/2addr p1, v0

    long-to-int p1, p1

    ushr-int/2addr p0, p1

    int-to-byte p0, p0

    return p0
.end method

.method public static P(Ljava/lang/Object;J)Z
    .locals 0

    invoke-static {p0, p1, p2}, LQf8;->N(Ljava/lang/Object;J)B

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static Q(Ljava/lang/Object;J)Z
    .locals 0

    invoke-static {p0, p1, p2}, LQf8;->O(Ljava/lang/Object;J)B

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic R(Ljava/lang/Object;J)B
    .locals 0

    invoke-static {p0, p1, p2}, LQf8;->N(Ljava/lang/Object;J)B

    move-result p0

    return p0
.end method

.method public static synthetic S(Ljava/lang/Object;J)B
    .locals 0

    invoke-static {p0, p1, p2}, LQf8;->O(Ljava/lang/Object;J)B

    move-result p0

    return p0
.end method

.method public static synthetic T(Ljava/lang/Object;J)Z
    .locals 0

    invoke-static {p0, p1, p2}, LQf8;->P(Ljava/lang/Object;J)Z

    move-result p0

    return p0
.end method

.method public static synthetic U(Ljava/lang/Object;J)Z
    .locals 0

    invoke-static {p0, p1, p2}, LQf8;->Q(Ljava/lang/Object;J)Z

    move-result p0

    return p0
.end method

.method public static a([BJ)B
    .locals 3

    sget-object v0, LQf8;->f:LQf8$d;

    sget-wide v1, LQf8;->i:J

    add-long/2addr v1, p1

    invoke-virtual {v0, p0, v1, v2}, LQf8$d;->o(Ljava/lang/Object;J)B

    move-result p0

    return p0
.end method

.method public static b(Ljava/lang/reflect/Field;)J
    .locals 2

    sget-object v0, LQf8;->f:LQf8$d;

    invoke-virtual {v0, p0}, LQf8$d;->a(Ljava/lang/reflect/Field;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static c(JB)V
    .locals 1

    sget-object v0, LQf8;->f:LQf8$d;

    invoke-virtual {v0, p0, p1, p2}, LQf8$d;->b(JB)V

    return-void
.end method

.method public static d(Ljava/lang/Object;JB)V
    .locals 4

    const-wide/16 v0, -0x4

    and-long/2addr v0, p1

    invoke-static {p0, v0, v1}, LQf8;->H(Ljava/lang/Object;J)I

    move-result v2

    long-to-int p1, p1

    not-int p1, p1

    and-int/lit8 p1, p1, 0x3

    shl-int/lit8 p1, p1, 0x3

    const/16 p2, 0xff

    shl-int v3, p2, p1

    not-int v3, v3

    and-int/2addr v2, v3

    and-int/2addr p2, p3

    shl-int p1, p2, p1

    or-int/2addr p1, v2

    invoke-static {p0, v0, v1, p1}, LQf8;->g(Ljava/lang/Object;JI)V

    return-void
.end method

.method public static e(Ljava/lang/Object;JD)V
    .locals 6

    sget-object v0, LQf8;->f:LQf8$d;

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    invoke-virtual/range {v0 .. v5}, LQf8$d;->c(Ljava/lang/Object;JD)V

    return-void
.end method

.method public static f(Ljava/lang/Object;JF)V
    .locals 1

    sget-object v0, LQf8;->f:LQf8$d;

    invoke-virtual {v0, p0, p1, p2, p3}, LQf8$d;->d(Ljava/lang/Object;JF)V

    return-void
.end method

.method public static g(Ljava/lang/Object;JI)V
    .locals 1

    sget-object v0, LQf8;->f:LQf8$d;

    invoke-virtual {v0, p0, p1, p2, p3}, LQf8$d;->e(Ljava/lang/Object;JI)V

    return-void
.end method

.method public static h(Ljava/lang/Object;JJ)V
    .locals 6

    sget-object v0, LQf8;->f:LQf8$d;

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    invoke-virtual/range {v0 .. v5}, LQf8$d;->f(Ljava/lang/Object;JJ)V

    return-void
.end method

.method public static i(Ljava/lang/Object;JLjava/lang/Object;)V
    .locals 1

    sget-object v0, LQf8;->f:LQf8$d;

    iget-object v0, v0, LQf8$d;->a:Lsun/misc/Unsafe;

    invoke-virtual {v0, p0, p1, p2, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method

.method public static j(Ljava/lang/Object;JZ)V
    .locals 1

    sget-object v0, LQf8;->f:LQf8$d;

    invoke-virtual {v0, p0, p1, p2, p3}, LQf8$d;->g(Ljava/lang/Object;JZ)V

    return-void
.end method

.method public static k([BJB)V
    .locals 3

    sget-object v0, LQf8;->f:LQf8$d;

    sget-wide v1, LQf8;->i:J

    add-long/2addr v1, p1

    invoke-virtual {v0, p0, v1, v2, p3}, LQf8$d;->i(Ljava/lang/Object;JB)V

    return-void
.end method

.method public static l([BJJJ)V
    .locals 8

    sget-object v0, LQf8;->f:LQf8$d;

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    move-wide v6, p5

    invoke-virtual/range {v0 .. v7}, LQf8$d;->h([BJJJ)V

    return-void
.end method

.method public static synthetic m()Z
    .locals 1

    sget-boolean v0, LQf8;->x:Z

    return v0
.end method

.method public static n(Ljava/lang/reflect/Field;)J
    .locals 2

    if-eqz p0, :cond_1

    sget-object v0, LQf8;->f:LQf8$d;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p0}, LQf8$d;->a(Ljava/lang/reflect/Field;)J

    move-result-wide v0

    return-wide v0

    :cond_1
    :goto_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public static o(Ljava/nio/ByteBuffer;)J
    .locals 3

    sget-object v0, LQf8;->f:LQf8$d;

    sget-wide v1, LQf8;->v:J

    invoke-virtual {v0, p0, v1, v2}, LQf8$d;->k(Ljava/lang/Object;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static p(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/reflect/Field;"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static q(Ljava/lang/Object;JB)V
    .locals 4

    const-wide/16 v0, -0x4

    and-long/2addr v0, p1

    invoke-static {p0, v0, v1}, LQf8;->H(Ljava/lang/Object;J)I

    move-result v2

    long-to-int p1, p1

    and-int/lit8 p1, p1, 0x3

    shl-int/lit8 p1, p1, 0x3

    const/16 p2, 0xff

    shl-int v3, p2, p1

    not-int v3, v3

    and-int/2addr v2, v3

    and-int/2addr p2, p3

    shl-int p1, p2, p1

    or-int/2addr p1, v2

    invoke-static {p0, v0, v1, p1}, LQf8;->g(Ljava/lang/Object;JI)V

    return-void
.end method

.method public static r(Ljava/lang/Object;JZ)V
    .locals 0

    int-to-byte p3, p3

    invoke-static {p0, p1, p2, p3}, LQf8;->d(Ljava/lang/Object;JB)V

    return-void
.end method

.method public static synthetic s(Ljava/lang/Object;JB)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LQf8;->d(Ljava/lang/Object;JB)V

    return-void
.end method

.method public static t(Ljava/lang/Object;JZ)V
    .locals 0

    int-to-byte p3, p3

    invoke-static {p0, p1, p2, p3}, LQf8;->q(Ljava/lang/Object;JB)V

    return-void
.end method

.method public static synthetic u(Ljava/lang/Object;JB)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LQf8;->q(Ljava/lang/Object;JB)V

    return-void
.end method

.method public static synthetic v(Ljava/lang/Object;JZ)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LQf8;->r(Ljava/lang/Object;JZ)V

    return-void
.end method

.method public static synthetic w(Ljava/lang/Object;JZ)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LQf8;->t(Ljava/lang/Object;JZ)V

    return-void
.end method

.method public static x()Z
    .locals 1

    sget-boolean v0, LQf8;->h:Z

    return v0
.end method

.method public static y()Z
    .locals 1

    sget-boolean v0, LQf8;->g:Z

    return v0
.end method

.method public static z()Lsun/misc/Unsafe;
    .locals 1

    :try_start_0
    new-instance v0, Llg8;

    invoke-direct {v0}, Llg8;-><init>()V

    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsun/misc/Unsafe;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
