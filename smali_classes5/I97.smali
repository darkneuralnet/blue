.class public final LI97;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:LI97;


# instance fields
.field private zbd:I

.field private zbe:I

.field private zbf:I

.field private zbg:F

.field private zbh:F

.field private zbi:I

.field private zbj:I

.field private zbk:I

.field private zbl:I

.field private zbm:I

.field private zbn:Ljava/lang/String;

.field private zbo:F

.field private zbp:Ljava/lang/String;

.field private zbq:F

.field private zbr:Lob7;

.field private zbs:Lkb7;

.field private zbt:Lkb7;

.field private zbu:Lob7;

.field private zbv:Lkb7;

.field private zbw:Lkb7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LI97;

    invoke-direct {v0}, LI97;-><init>()V

    sput-object v0, LI97;->zbb:LI97;

    const-class v1, LI97;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LI97;->zbn:Ljava/lang/String;

    iput-object v0, p0, LI97;->zbp:Ljava/lang/String;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, LI97;->zbr:Lob7;

    invoke-static {}, Lfb7;->z()Lkb7;

    move-result-object v0

    iput-object v0, p0, LI97;->zbs:Lkb7;

    invoke-static {}, Lfb7;->z()Lkb7;

    move-result-object v0

    iput-object v0, p0, LI97;->zbt:Lkb7;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, LI97;->zbu:Lob7;

    invoke-static {}, Lfb7;->z()Lkb7;

    move-result-object v0

    iput-object v0, p0, LI97;->zbv:Lkb7;

    invoke-static {}, Lfb7;->z()Lkb7;

    move-result-object v0

    iput-object v0, p0, LI97;->zbw:Lkb7;

    return-void
.end method

.method public static synthetic E()LI97;
    .locals 1

    sget-object v0, LI97;->zbb:LI97;

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
    sget-object p1, LI97;->zbb:LI97;

    return-object p1

    :cond_1
    new-instance p1, LH97;

    invoke-direct {p1, p2}, LH97;-><init>(LF87;)V

    return-object p1

    :cond_2
    new-instance p1, LI97;

    invoke-direct {p1}, LI97;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0x14

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

    const/4 p2, 0x7

    const-string p3, "zbk"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zbl"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zbm"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zbp"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zbr"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zbn"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zbo"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zbq"

    aput-object p3, p1, p2

    const/16 p2, 0xf

    const-string p3, "zbs"

    aput-object p3, p1, p2

    const/16 p2, 0x10

    const-string p3, "zbt"

    aput-object p3, p1, p2

    const/16 p2, 0x11

    const-string p3, "zbu"

    aput-object p3, p1, p2

    const/16 p2, 0x12

    const-string p3, "zbv"

    aput-object p3, p1, p2

    const/16 p2, 0x13

    const-string p3, "zbw"

    aput-object p3, p1, p2

    sget-object p2, LI97;->zbb:LI97;

    const-string p3, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0006\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1001\u0002\u0004\u1001\u0003\u0005\u1004\u0004\u0006\u1004\u0005\u0007\u1004\u0006\u0008\u1004\u0007\t\u1004\u0008\n\u1008\u000b\u000b\u001a\u000c\u1008\t\r\u1001\n\u000e\u1001\u000c\u000f$\u0010$\u0011\u001a\u0012$\u0013$"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
