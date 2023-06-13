.class public final LK97;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:LK97;


# instance fields
.field private zbA:I

.field private zbB:F

.field private zbC:I

.field private zbD:F

.field private zbE:I

.field private zbF:B

.field private zbd:I

.field private zbe:Lob7;

.field private zbf:LH87;

.field private zbg:LH87;

.field private zbh:Ljava/lang/String;

.field private zbi:F

.field private zbj:Lob7;

.field private zbk:Lob7;

.field private zbl:Z

.field private zbm:Ljava/lang/String;

.field private zbn:Z

.field private zbo:Lob7;

.field private zbp:Z

.field private zbq:Z

.field private zbr:Z

.field private zbs:I

.field private zbt:I

.field private zbu:I

.field private zbv:I

.field private zbw:I

.field private zbx:I

.field private zby:Ljava/lang/String;

.field private zbz:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LK97;

    invoke-direct {v0}, LK97;-><init>()V

    sput-object v0, LK97;->zbb:LK97;

    const-class v1, LK97;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lfb7;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, LK97;->zbF:B

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, LK97;->zbe:Lob7;

    const-string v0, ""

    iput-object v0, p0, LK97;->zbh:Ljava/lang/String;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v1

    iput-object v1, p0, LK97;->zbj:Lob7;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v1

    iput-object v1, p0, LK97;->zbk:Lob7;

    iput-object v0, p0, LK97;->zbm:Ljava/lang/String;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v1

    iput-object v1, p0, LK97;->zbo:Lob7;

    const/4 v1, 0x1

    iput-boolean v1, p0, LK97;->zbp:Z

    iput-object v0, p0, LK97;->zby:Ljava/lang/String;

    iput v1, p0, LK97;->zbC:I

    return-void
.end method

.method public static synthetic E()LK97;
    .locals 1

    sget-object v0, LK97;->zbb:LK97;

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
    iput-byte p3, p0, LK97;->zbF:B

    return-object v3

    :cond_1
    sget-object p1, LK97;->zbb:LK97;

    return-object p1

    :cond_2
    new-instance p1, LJ97;

    invoke-direct {p1, v3}, LJ97;-><init>(LF87;)V

    return-object p1

    :cond_3
    new-instance p1, LK97;

    invoke-direct {p1}, LK97;-><init>()V

    return-object p1

    :cond_4
    const/16 p1, 0x22

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zbd"

    aput-object p2, p1, v0

    const-string p2, "zbe"

    aput-object p2, p1, p3

    const-class p2, Lw97;

    aput-object p2, p1, v4

    const-string p2, "zbf"

    aput-object p2, p1, v3

    const-string p2, "zbg"

    aput-object p2, p1, v2

    const-string p2, "zbh"

    aput-object p2, p1, v1

    const/4 p2, 0x6

    const-string p3, "zbi"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zbk"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-class p3, LM87;

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zbl"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zbm"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zbj"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-class p3, LO87;

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zbn"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zbo"

    aput-object p3, p1, p2

    const/16 p2, 0xf

    const-class p3, Lu97;

    aput-object p3, p1, p2

    const/16 p2, 0x10

    const-string p3, "zbp"

    aput-object p3, p1, p2

    const/16 p2, 0x11

    const-string p3, "zbq"

    aput-object p3, p1, p2

    const/16 p2, 0x12

    const-string p3, "zbr"

    aput-object p3, p1, p2

    const/16 p2, 0x13

    const-string p3, "zbt"

    aput-object p3, p1, p2

    const/16 p2, 0x14

    const-string p3, "zbu"

    aput-object p3, p1, p2

    const/16 p2, 0x15

    const-string p3, "zbv"

    aput-object p3, p1, p2

    const/16 p2, 0x16

    const-string p3, "zbw"

    aput-object p3, p1, p2

    const/16 p2, 0x17

    const-string p3, "zbx"

    aput-object p3, p1, p2

    const/16 p2, 0x18

    const-string p3, "zby"

    aput-object p3, p1, p2

    const/16 p2, 0x19

    const-string p3, "zbz"

    aput-object p3, p1, p2

    const/16 p2, 0x1a

    const-string p3, "zbA"

    aput-object p3, p1, p2

    const/16 p2, 0x1b

    invoke-static {}, LyR6;->a()Ljb7;

    move-result-object p3

    aput-object p3, p1, p2

    const/16 p2, 0x1c

    const-string p3, "zbC"

    aput-object p3, p1, p2

    const/16 p2, 0x1d

    sget-object p3, Lf97;->a:Ljb7;

    aput-object p3, p1, p2

    const/16 p2, 0x1e

    const-string p3, "zbB"

    aput-object p3, p1, p2

    const/16 p2, 0x1f

    const-string p3, "zbD"

    aput-object p3, p1, p2

    const/16 p2, 0x20

    const-string p3, "zbE"

    aput-object p3, p1, p2

    const/16 p2, 0x21

    const-string p3, "zbs"

    aput-object p3, p1, p2

    sget-object p2, LK97;->zbb:LK97;

    const-string p3, "\u0001\u001b\u0000\u0001\u0001\u001b\u001b\u0000\u0004\u0004\u0001\u041b\u0002\u1509\u0000\u0003\u1409\u0001\u0004\u1008\u0002\u0005\u1001\u0003\u0006\u001b\u0007\u1007\u0004\u0008\u1008\u0005\t\u041b\n\u1007\u0006\u000b\u001b\u000c\u1007\u0007\r\u1007\u0008\u000e\u1007\t\u000f\u1004\u000b\u0010\u1004\u000c\u0011\u1004\r\u0012\u1004\u000e\u0013\u1004\u000f\u0014\u1008\u0010\u0015\u1001\u0011\u0016\u100c\u0012\u0017\u100c\u0014\u0018\u1001\u0013\u0019\u1001\u0015\u001a\u1004\u0016\u001b\u1004\n"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LK97;->zbF:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
