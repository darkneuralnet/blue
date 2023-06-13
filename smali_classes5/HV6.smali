.class public final LHV6;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:LHV6;


# instance fields
.field private zbd:I

.field private zbe:LFV6;

.field private zbf:F

.field private zbg:F

.field private zbh:F

.field private zbi:F

.field private zbj:F

.field private zbk:F

.field private zbl:F

.field private zbm:F

.field private zbn:F

.field private zbo:F

.field private zbp:I

.field private zbq:F

.field private zbr:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LHV6;

    invoke-direct {v0}, LHV6;-><init>()V

    sput-object v0, LHV6;->zbb:LHV6;

    const-class v1, LHV6;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lfb7;-><init>()V

    const v0, 0x3f19999a    # 0.6f

    iput v0, p0, LHV6;->zbf:F

    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, LHV6;->zbg:F

    const v0, 0x3c23d70a    # 0.01f

    iput v0, p0, LHV6;->zbh:F

    const v0, 0x3e4ccccd    # 0.2f

    iput v0, p0, LHV6;->zbi:F

    const/high16 v1, 0x40400000    # 3.0f

    iput v1, p0, LHV6;->zbj:F

    const/high16 v1, 0x3f400000    # 0.75f

    iput v1, p0, LHV6;->zbk:F

    iput v1, p0, LHV6;->zbl:F

    const/high16 v1, 0x3e800000    # 0.25f

    iput v1, p0, LHV6;->zbm:F

    iput v0, p0, LHV6;->zbn:F

    const v0, 0x3ecccccd    # 0.4f

    iput v0, p0, LHV6;->zbo:F

    const/16 v0, 0xa

    iput v0, p0, LHV6;->zbp:I

    const v0, 0x3d4ccccd    # 0.05f

    iput v0, p0, LHV6;->zbq:F

    const/4 v0, 0x3

    iput v0, p0, LHV6;->zbr:I

    return-void
.end method

.method public static synthetic E()LHV6;
    .locals 1

    sget-object v0, LHV6;->zbb:LHV6;

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
    sget-object p1, LHV6;->zbb:LHV6;

    return-object p1

    :cond_1
    new-instance p1, LGV6;

    invoke-direct {p1, p2}, LGV6;-><init>(LDV6;)V

    return-object p1

    :cond_2
    new-instance p1, LHV6;

    invoke-direct {p1}, LHV6;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0xf

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

    const-string p3, "zbp"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zbq"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zbr"

    aput-object p3, p1, p2

    sget-object p2, LHV6;->zbb:LHV6;

    const-string p3, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1001\u0001\u0003\u1001\u0002\u0004\u1001\u0003\u0005\u1001\u0004\u0006\u1001\u0005\u0008\u1001\u0006\t\u1001\u0007\n\u1001\u0008\u000b\u1001\t\u000c\u1001\n\r\u1004\u000b\u000e\u1001\u000c\u000f\u1004\r"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
