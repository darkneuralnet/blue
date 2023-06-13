.class public final LW87;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:LW87;


# instance fields
.field private zbA:Lkb7;

.field private zbB:Llb7;

.field private zbC:F

.field private zbD:I

.field private zbE:I

.field private zbF:B

.field private zbd:I

.field private zbe:LH87;

.field private zbf:F

.field private zbg:LCa7;

.field private zbh:LCa7;

.field private zbi:LH87;

.field private zbj:I

.field private zbk:Lob7;

.field private zbl:Z

.field private zbm:Z

.field private zbn:Lob7;

.field private zbo:Ljava/lang/String;

.field private zbp:Ljava/lang/String;

.field private zbq:Lob7;

.field private zbr:Lob7;

.field private zbs:I

.field private zbt:I

.field private zbu:F

.field private zbv:F

.field private zbw:F

.field private zbx:I

.field private zby:Lq97;

.field private zbz:Lob7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LW87;

    invoke-direct {v0}, LW87;-><init>()V

    sput-object v0, LW87;->zbb:LW87;

    const-class v1, LW87;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, LW87;->zbF:B

    sget-object v0, LCa7;->c:LCa7;

    iput-object v0, p0, LW87;->zbg:LCa7;

    iput-object v0, p0, LW87;->zbh:LCa7;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, LW87;->zbk:Lob7;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, LW87;->zbn:Lob7;

    const-string v0, ""

    iput-object v0, p0, LW87;->zbo:Ljava/lang/String;

    iput-object v0, p0, LW87;->zbp:Ljava/lang/String;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, LW87;->zbq:Lob7;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, LW87;->zbr:Lob7;

    const/4 v0, 0x1

    iput v0, p0, LW87;->zbt:I

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, LW87;->zbz:Lob7;

    invoke-static {}, Lfb7;->z()Lkb7;

    move-result-object v0

    iput-object v0, p0, LW87;->zbA:Lkb7;

    invoke-static {}, Lfb7;->A()Llb7;

    move-result-object v0

    iput-object v0, p0, LW87;->zbB:Llb7;

    return-void
.end method

.method public static synthetic E()LW87;
    .locals 1

    sget-object v0, LW87;->zbb:LW87;

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
    iput-byte p3, p0, LW87;->zbF:B

    return-object v3

    :cond_1
    sget-object p1, LW87;->zbb:LW87;

    return-object p1

    :cond_2
    new-instance p1, LV87;

    invoke-direct {p1, v3}, LV87;-><init>(LF87;)V

    return-object p1

    :cond_3
    new-instance p1, LW87;

    invoke-direct {p1}, LW87;-><init>()V

    return-object p1

    :cond_4
    const/16 p1, 0x22

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zbd"

    aput-object p2, p1, v0

    const-string p2, "zbe"

    aput-object p2, p1, p3

    const-string p2, "zbf"

    aput-object p2, p1, v4

    const-string p2, "zbg"

    aput-object p2, p1, v3

    const-string p2, "zbh"

    aput-object p2, p1, v2

    const-string p2, "zbj"

    aput-object p2, p1, v1

    const/4 p2, 0x6

    const-string p3, "zbi"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zbk"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-class p3, LY87;

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zbl"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zbm"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zbn"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-class p3, LZ97;

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zbo"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zbq"

    aput-object p3, p1, p2

    const/16 p2, 0xf

    const-class p3, LH87;

    aput-object p3, p1, p2

    const/16 p2, 0x10

    const-string v0, "zbr"

    aput-object v0, p1, p2

    const/16 p2, 0x11

    const-class v0, LO87;

    aput-object v0, p1, p2

    const/16 p2, 0x12

    const-string v0, "zbs"

    aput-object v0, p1, p2

    const/16 p2, 0x13

    const-string v0, "zbt"

    aput-object v0, p1, p2

    const/16 p2, 0x14

    sget-object v0, Lf97;->a:Ljb7;

    aput-object v0, p1, p2

    const/16 p2, 0x15

    const-string v0, "zbw"

    aput-object v0, p1, p2

    const/16 p2, 0x16

    const-string v0, "zbp"

    aput-object v0, p1, p2

    const/16 p2, 0x17

    const-string v0, "zbx"

    aput-object v0, p1, p2

    const/16 p2, 0x18

    const-string v0, "zby"

    aput-object v0, p1, p2

    const/16 p2, 0x19

    const-string v0, "zbz"

    aput-object v0, p1, p2

    const/16 p2, 0x1a

    aput-object p3, p1, p2

    const/16 p2, 0x1b

    const-string p3, "zbA"

    aput-object p3, p1, p2

    const/16 p2, 0x1c

    const-string p3, "zbB"

    aput-object p3, p1, p2

    const/16 p2, 0x1d

    const-string p3, "zbu"

    aput-object p3, p1, p2

    const/16 p2, 0x1e

    const-string p3, "zbv"

    aput-object p3, p1, p2

    const/16 p2, 0x1f

    const-string p3, "zbC"

    aput-object p3, p1, p2

    const/16 p2, 0x20

    const-string p3, "zbD"

    aput-object p3, p1, p2

    const/16 p2, 0x21

    const-string p3, "zbE"

    aput-object p3, p1, p2

    sget-object p2, LW87;->zbb:LW87;

    const-string p3, "\u0001\u001b\u0000\u0001\u0001d\u001b\u0000\u0007\u0007\u0001\u1509\u0000\u0002\u1001\u0001\u0003\u100a\u0002\u0004\u100a\u0003\u0005\u1004\u0005\u0006\u1409\u0004\u0007\u041b\u0008\u1007\u0006\t\u1007\u0007\n\u041b\u000b\u1008\u0008\u000c\u041b\r\u041b\u000e\u1004\n\u000f\u100c\u000b\u0010\u1001\u000e\u0011\u1008\t\u0012\u1004\u000f\u0013\u1009\u0010\u0014\u041b\u0015\u0013\u0016\u0016\u0017\u1001\u000c\u0018\u1001\r\u0019\u1001\u0011\u001a\u1004\u0012d\u1004\u0013"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LW87;->zbF:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
