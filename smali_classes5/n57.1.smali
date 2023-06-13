.class public final Ln57;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:Ln57;


# instance fields
.field private zbd:I

.field private zbe:J

.field private zbf:F

.field private zbg:F

.field private zbh:F

.field private zbi:F

.field private zbj:I

.field private zbk:F

.field private zbl:F

.field private zbm:I

.field private zbn:F

.field private zbo:F

.field private zbp:F

.field private zbq:LHV6;

.field private zbr:F

.field private zbs:F

.field private zbt:F

.field private zbu:F

.field private zbv:F

.field private zbw:I

.field private zbx:I

.field private zby:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln57;

    invoke-direct {v0}, Ln57;-><init>()V

    sput-object v0, Ln57;->zbb:Ln57;

    const-class v1, Ln57;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lfb7;-><init>()V

    const-wide/32 v0, 0x3b9aca00

    iput-wide v0, p0, Ln57;->zbe:J

    const v0, 0x3e4ccccd    # 0.2f

    iput v0, p0, Ln57;->zbf:F

    const v0, 0x3f19999a    # 0.6f

    iput v0, p0, Ln57;->zbg:F

    iput v0, p0, Ln57;->zbh:F

    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Ln57;->zbi:F

    const/4 v1, 0x3

    iput v1, p0, Ln57;->zbj:I

    const/high16 v1, -0x41000000    # -0.5f

    iput v1, p0, Ln57;->zbk:F

    iput v1, p0, Ln57;->zbl:F

    const v1, 0xf4240

    iput v1, p0, Ln57;->zbm:I

    const/high16 v1, 0x41200000    # 10.0f

    iput v1, p0, Ln57;->zbn:F

    const v1, 0x3f4ccccd    # 0.8f

    iput v1, p0, Ln57;->zbo:F

    const/high16 v1, 0x3fc00000    # 1.5f

    iput v1, p0, Ln57;->zbp:F

    const v1, 0x3e19999a    # 0.15f

    iput v1, p0, Ln57;->zbr:F

    iput v0, p0, Ln57;->zbs:F

    const v1, 0x3e99999a    # 0.3f

    iput v1, p0, Ln57;->zbt:F

    const/high16 v1, 0x40400000    # 3.0f

    iput v1, p0, Ln57;->zbu:F

    iput v1, p0, Ln57;->zbv:F

    const/4 v1, 0x5

    iput v1, p0, Ln57;->zbw:I

    iput v1, p0, Ln57;->zbx:I

    iput v0, p0, Ln57;->zby:F

    return-void
.end method

.method public static synthetic E()Ln57;
    .locals 1

    sget-object v0, Ln57;->zbb:Ln57;

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
    sget-object p1, Ln57;->zbb:Ln57;

    return-object p1

    :cond_1
    new-instance p1, Lm57;

    invoke-direct {p1, p2}, Lm57;-><init>(Ll57;)V

    return-object p1

    :cond_2
    new-instance p1, Ln57;

    invoke-direct {p1}, Ln57;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0x16

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

    const-string p3, "zbn"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zbo"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zbq"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zbp"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zbr"

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

    const/16 p2, 0x14

    const-string p3, "zbx"

    aput-object p3, p1, p2

    const/16 p2, 0x15

    const-string p3, "zby"

    aput-object p3, p1, p2

    sget-object p2, Ln57;->zbb:Ln57;

    const-string p3, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1001\u0001\u0003\u1001\u0002\u0004\u1001\u0003\u0005\u1001\u0004\u0006\u1004\u0005\u0007\u1001\u0006\u0008\u1001\u0007\t\u1004\u0008\n\u1001\t\u000b\u1001\n\u000c\u1009\u000c\r\u1001\u000b\u000e\u1001\r\u000f\u1001\u000e\u0010\u1001\u000f\u0011\u1001\u0010\u0012\u1001\u0011\u0013\u1004\u0012\u0014\u1004\u0013\u0015\u1001\u0014"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
