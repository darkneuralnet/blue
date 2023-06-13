.class public final LS97;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:LS97;


# instance fields
.field private zbd:I

.field private zbe:I

.field private zbf:Ljava/lang/String;

.field private zbg:Lkb7;

.field private zbh:I

.field private zbi:I

.field private zbj:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LS97;

    invoke-direct {v0}, LS97;-><init>()V

    sput-object v0, LS97;->zbb:LS97;

    const-class v1, LS97;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LS97;->zbf:Ljava/lang/String;

    invoke-static {}, Lfb7;->z()Lkb7;

    move-result-object v0

    iput-object v0, p0, LS97;->zbg:Lkb7;

    return-void
.end method

.method public static synthetic E()LS97;
    .locals 1

    sget-object v0, LS97;->zbb:LS97;

    return-object v0
.end method


# virtual methods
.method public final p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    sget-object p1, LS97;->zbb:LS97;

    return-object p1

    :cond_1
    new-instance p1, LO97;

    invoke-direct {p1, p2}, LO97;-><init>(LL97;)V

    return-object p1

    :cond_2
    new-instance p1, LS97;

    invoke-direct {p1}, LS97;-><init>()V

    return-object p1

    :cond_3
    const/4 p1, 0x7

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zbd"

    aput-object v4, p1, v3

    const-string v3, "zbe"

    aput-object v3, p1, p2

    const-string p2, "zbf"

    aput-object p2, p1, v2

    const-string p2, "zbg"

    aput-object p2, p1, v1

    const-string p2, "zbh"

    aput-object p2, p1, v0

    const-string p2, "zbi"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zbj"

    aput-object p3, p1, p2

    sget-object p2, LS97;->zbb:LS97;

    const-string p3, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u0013\u0004\u1004\u0002\u0005\u1004\u0003\u0006\u1001\u0004"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
