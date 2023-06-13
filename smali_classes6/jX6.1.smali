.class public final LjX6;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:LjX6;


# instance fields
.field private zbd:I

.field private zbe:I

.field private zbf:Ljava/lang/Object;

.field private zbg:Z

.field private zbh:LP47;

.field private zbi:Z

.field private zbj:LT37;

.field private zbk:F

.field private zbl:Z

.field private zbm:Z

.field private zbn:I

.field private zbo:Z

.field private zbp:F

.field private zbq:I

.field private zbr:LXY6;

.field private zbs:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LjX6;

    invoke-direct {v0}, LjX6;-><init>()V

    sput-object v0, LjX6;->zbb:LjX6;

    const-class v1, LjX6;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LjX6;->zbe:I

    const/4 v0, 0x2

    iput-byte v0, p0, LjX6;->zbs:B

    const/4 v0, -0x1

    iput v0, p0, LjX6;->zbn:I

    return-void
.end method

.method public static synthetic E()LjX6;
    .locals 1

    sget-object v0, LjX6;->zbb:LjX6;

    return-object v0
.end method


# virtual methods
.method public final p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_5

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x5

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    if-eq p1, v4, :cond_4

    if-eq p1, v3, :cond_3

    const/4 v3, 0x0

    if-eq p1, v2, :cond_2

    if-eq p1, v1, :cond_1

    if-nez p2, :cond_0

    move p3, v0

    :cond_0
    iput-byte p3, p0, LjX6;->zbs:B

    return-object v3

    :cond_1
    sget-object p1, LjX6;->zbb:LjX6;

    return-object p1

    :cond_2
    new-instance p1, LGW6;

    invoke-direct {p1, v3}, LGW6;-><init>(LdW6;)V

    return-object p1

    :cond_3
    new-instance p1, LjX6;

    invoke-direct {p1}, LjX6;-><init>()V

    return-object p1

    :cond_4
    const/16 p1, 0x11

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zbf"

    aput-object p2, p1, v0

    const-string p2, "zbe"

    aput-object p2, p1, p3

    const-string p2, "zbd"

    aput-object p2, p1, v4

    const-class p2, LYT6;

    aput-object p2, p1, v3

    const-string p2, "zbh"

    aput-object p2, p1, v2

    const-string p2, "zbj"

    aput-object p2, p1, v1

    const/4 p2, 0x6

    const-string p3, "zbm"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zbn"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zbo"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zbg"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zbp"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zbq"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zbi"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zbr"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zbk"

    aput-object p3, p1, p2

    const/16 p2, 0xf

    const-string p3, "zbl"

    aput-object p3, p1, p2

    const/16 p2, 0x10

    const-class p3, Lt07;

    aput-object p3, p1, p2

    sget-object p2, LjX6;->zbb:LjX6;

    const-string p3, "\u0001\u000e\u0001\u0001\u0001\u000e\u000e\u0000\u0000\u0001\u0001\u043c\u0000\u0002\u1009\u0001\u0003\u1009\u0003\u0004\u1007\u0006\u0005\u1004\u0007\u0006\u1007\u0008\u0007\u1007\u0000\u0008\u1001\t\t\u1004\n\n\u1007\u0002\u000b\u1009\u000b\u000c\u1001\u0004\r\u1007\u0005\u000e<\u0000"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LjX6;->zbs:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
