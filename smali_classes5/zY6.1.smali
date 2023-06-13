.class public final LzY6;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:LzY6;


# instance fields
.field private zbA:Z

.field private zbB:LxY6;

.field private zbd:I

.field private zbe:Ljava/lang/String;

.field private zbf:Ljava/lang/String;

.field private zbg:Z

.field private zbh:Lr87;

.field private zbi:Z

.field private zbj:I

.field private zbk:Z

.field private zbl:Z

.field private zbm:F

.field private zbn:F

.field private zbo:Z

.field private zbp:Z

.field private zbq:Z

.field private zbr:Z

.field private zbs:Z

.field private zbt:I

.field private zbu:Z

.field private zbv:F

.field private zbw:Z

.field private zbx:LC87;

.field private zby:Z

.field private zbz:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LzY6;

    invoke-direct {v0}, LzY6;-><init>()V

    sput-object v0, LzY6;->zbb:LzY6;

    const-class v1, LzY6;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LzY6;->zbe:Ljava/lang/String;

    iput-object v0, p0, LzY6;->zbf:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, LzY6;->zbq:Z

    iput-boolean v0, p0, LzY6;->zbr:Z

    const/high16 v0, 0x3f400000    # 0.75f

    iput v0, p0, LzY6;->zbv:F

    return-void
.end method

.method public static E()LtY6;
    .locals 1

    sget-object v0, LzY6;->zbb:LzY6;

    invoke-virtual {v0}, Lfb7;->u()Lab7;

    move-result-object v0

    check-cast v0, LtY6;

    return-object v0
.end method

.method public static synthetic F()LzY6;
    .locals 1

    sget-object v0, LzY6;->zbb:LzY6;

    return-object v0
.end method

.method public static synthetic G(LzY6;Ljava/lang/String;)V
    .locals 1

    iget v0, p0, LzY6;->zbd:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, LzY6;->zbd:I

    iput-object p1, p0, LzY6;->zbe:Ljava/lang/String;

    return-void
.end method

.method public static synthetic H(LzY6;Ljava/lang/String;)V
    .locals 1

    iget v0, p0, LzY6;->zbd:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, LzY6;->zbd:I

    iput-object p1, p0, LzY6;->zbf:Ljava/lang/String;

    return-void
.end method

.method public static synthetic I(LzY6;Z)V
    .locals 0

    iget p1, p0, LzY6;->zbd:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, LzY6;->zbd:I

    const/4 p1, 0x1

    iput-boolean p1, p0, LzY6;->zbg:Z

    return-void
.end method

.method public static synthetic J(LzY6;Lr87;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LzY6;->zbh:Lr87;

    iget p1, p0, LzY6;->zbd:I

    or-int/lit8 p1, p1, 0x8

    iput p1, p0, LzY6;->zbd:I

    return-void
.end method

.method public static synthetic K(LzY6;Z)V
    .locals 0

    iget p1, p0, LzY6;->zbd:I

    or-int/lit8 p1, p1, 0x10

    iput p1, p0, LzY6;->zbd:I

    const/4 p1, 0x1

    iput-boolean p1, p0, LzY6;->zbi:Z

    return-void
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
    sget-object p1, LzY6;->zbb:LzY6;

    return-object p1

    :cond_1
    new-instance p1, LtY6;

    invoke-direct {p1, p2}, LtY6;-><init>(LrY6;)V

    return-object p1

    :cond_2
    new-instance p1, LzY6;

    invoke-direct {p1}, LzY6;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0x19

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zbd"

    aput-object v4, p1, v3

    const-string v3, "zbe"

    aput-object v3, p1, p2

    const-string p2, "zbf"

    aput-object p2, p1, v2

    const-string p2, "zbm"

    aput-object p2, p1, v1

    const-string p2, "zbk"

    aput-object p2, p1, v0

    const-string p2, "zbn"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zbl"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zbz"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zbj"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zbo"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zbp"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zbq"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zbr"

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

    const-string p3, "zbg"

    aput-object p3, p1, p2

    const/16 p2, 0x14

    const-string p3, "zbB"

    aput-object p3, p1, p2

    const/16 p2, 0x15

    const-string p3, "zbA"

    aput-object p3, p1, p2

    const/16 p2, 0x16

    const-string p3, "zbh"

    aput-object p3, p1, p2

    const/16 p2, 0x17

    const-string p3, "zbi"

    aput-object p3, p1, p2

    const/16 p2, 0x18

    const-string p3, "zby"

    aput-object p3, p1, p2

    sget-object p2, LzY6;->zbb:LzY6;

    const-string p3, "\u0001\u0018\u0000\u0001\u0001\u0019\u0018\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1001\u0008\u0004\u1007\u0006\u0005\u1001\t\u0006\u1007\u0007\u0008\u1004\u0015\t\u1004\u0005\n\u1007\n\u000b\u1007\u000b\u000c\u1007\u000c\r\u1007\r\u000e\u1007\u000e\u000f\u1004\u000f\u0010\u1007\u0010\u0011\u1001\u0011\u0012\u1007\u0012\u0013\u1009\u0013\u0014\u1007\u0002\u0015\u1009\u0017\u0016\u1007\u0016\u0017\u1009\u0003\u0018\u1007\u0004\u0019\u1007\u0014"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
