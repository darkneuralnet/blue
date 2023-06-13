.class public final LHR6;
.super Lcb7;
.source "SourceFile"


# static fields
.field private static final zbd:LHR6;


# instance fields
.field private zbA:Lob7;

.field private zbB:Lkb7;

.field private zbC:I

.field private zbD:LmR6;

.field private zbE:LWQ6;

.field private zbF:B

.field private zbe:I

.field private zbf:I

.field private zbg:Llb7;

.field private zbh:LgR6;

.field private zbi:LoR6;

.field private zbj:I

.field private zbk:I

.field private zbl:Lk87;

.field private zbm:F

.field private zbn:F

.field private zbo:F

.field private zbp:F

.field private zbq:Ljava/lang/String;

.field private zbr:LsR6;

.field private zbs:Ljava/lang/String;

.field private zbt:LjR6;

.field private zbu:LvR6;

.field private zbv:LDR6;

.field private zbw:I

.field private zbx:J

.field private zby:Lka7;

.field private zbz:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LHR6;

    invoke-direct {v0}, LHR6;-><init>()V

    sput-object v0, LHR6;->zbd:LHR6;

    const-class v1, LHR6;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcb7;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, LHR6;->zbF:B

    const/4 v1, -0x1

    iput v1, p0, LHR6;->zbf:I

    invoke-static {}, Lfb7;->A()Llb7;

    move-result-object v1

    iput-object v1, p0, LHR6;->zbg:Llb7;

    iput v0, p0, LHR6;->zbj:I

    const-string v0, ""

    iput-object v0, p0, LHR6;->zbq:Ljava/lang/String;

    iput-object v0, p0, LHR6;->zbs:Ljava/lang/String;

    iput-object v0, p0, LHR6;->zbz:Ljava/lang/String;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, LHR6;->zbA:Lob7;

    invoke-static {}, Lfb7;->z()Lkb7;

    move-result-object v0

    iput-object v0, p0, LHR6;->zbB:Lkb7;

    return-void
.end method

.method public static synthetic L()LHR6;
    .locals 1

    sget-object v0, LHR6;->zbd:LHR6;

    return-object v0
.end method


# virtual methods
.method public final F()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LHR6;->zbs:Ljava/lang/String;

    return-object v0
.end method

.method public final G()I
    .locals 1

    iget v0, p0, LHR6;->zbj:I

    invoke-static {v0}, LBR6;->a(I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x3

    :cond_0
    return v0
.end method

.method public final H()F
    .locals 1

    iget v0, p0, LHR6;->zbp:F

    return v0
.end method

.method public final I()I
    .locals 1

    iget v0, p0, LHR6;->zbf:I

    return v0
.end method

.method public final J()LgR6;
    .locals 1

    iget-object v0, p0, LHR6;->zbh:LgR6;

    if-nez v0, :cond_0

    invoke-static {}, LgR6;->J()LgR6;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final K()LsR6;
    .locals 1

    iget-object v0, p0, LHR6;->zbr:LsR6;

    if-nez v0, :cond_0

    invoke-static {}, LsR6;->F()LsR6;

    move-result-object v0

    :cond_0
    return-object v0
.end method

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
    iput-byte p3, p0, LHR6;->zbF:B

    return-object v3

    :cond_1
    sget-object p1, LHR6;->zbd:LHR6;

    return-object p1

    :cond_2
    new-instance p1, LtR6;

    invoke-direct {p1, v3}, LtR6;-><init>(LXQ6;)V

    return-object p1

    :cond_3
    new-instance p1, LHR6;

    invoke-direct {p1}, LHR6;-><init>()V

    return-object p1

    :cond_4
    const/16 p1, 0x1d

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zbe"

    aput-object p2, p1, v0

    const-string p2, "zbf"

    aput-object p2, p1, p3

    const-string p2, "zbh"

    aput-object p2, p1, v4

    const-string p2, "zbi"

    aput-object p2, p1, v3

    const-string p2, "zbj"

    aput-object p2, p1, v2

    sget-object p2, LAR6;->a:Ljb7;

    aput-object p2, p1, v1

    const/4 p2, 0x6

    const-string p3, "zbk"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    sget-object p3, LxR6;->a:Ljb7;

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zbl"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zbp"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zbq"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zbr"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zbm"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zbs"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zbt"

    aput-object p3, p1, p2

    const/16 p2, 0xf

    const-string p3, "zbu"

    aput-object p3, p1, p2

    const/16 p2, 0x10

    const-string p3, "zbv"

    aput-object p3, p1, p2

    const/16 p2, 0x11

    const-string p3, "zbw"

    aput-object p3, p1, p2

    const/16 p2, 0x12

    const-string p3, "zbx"

    aput-object p3, p1, p2

    const/16 p2, 0x13

    const-string p3, "zby"

    aput-object p3, p1, p2

    const/16 p2, 0x14

    const-string p3, "zbo"

    aput-object p3, p1, p2

    const/16 p2, 0x15

    const-string p3, "zbz"

    aput-object p3, p1, p2

    const/16 p2, 0x16

    const-string p3, "zbA"

    aput-object p3, p1, p2

    const/16 p2, 0x17

    const-string p3, "zbB"

    aput-object p3, p1, p2

    const/16 p2, 0x18

    const-string p3, "zbC"

    aput-object p3, p1, p2

    const/16 p2, 0x19

    const-string p3, "zbn"

    aput-object p3, p1, p2

    const/16 p2, 0x1a

    const-string p3, "zbD"

    aput-object p3, p1, p2

    const/16 p2, 0x1b

    const-string p3, "zbg"

    aput-object p3, p1, p2

    const/16 p2, 0x1c

    const-string p3, "zbE"

    aput-object p3, p1, p2

    sget-object p2, LHR6;->zbd:LHR6;

    const-string p3, "\u0001\u001a\u0000\u0001\u0001\u001e\u001a\u0000\u0003\u0005\u0001\u1004\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u100c\u0003\u0005\u100c\u0004\u0006\u1009\u0005\u0007\u1001\t\u0008\u1008\n\r\u1409\u000b\u000e\u1001\u0006\u000f\u1008\u000c\u0010\u1409\r\u0011\u1009\u000e\u0012\u1009\u000f\u0013\u1004\u0010\u0014\u1002\u0011\u0015\u1009\u0012\u0016\u1001\u0008\u0017\u1008\u0013\u0018\u001a\u0019\u0013\u001a\u1004\u0014\u001b\u1001\u0007\u001c\u1009\u0015\u001d\'\u001e\u1409\u0016"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LHR6;->zbF:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
