.class public final LOS6;
.super Lcb7;
.source "SourceFile"


# static fields
.field private static final zbd:LOS6;


# instance fields
.field private zbe:I

.field private zbf:I

.field private zbg:Ljava/lang/Object;

.field private zbh:I

.field private zbi:Ljava/lang/Object;

.field private zbj:Ljava/lang/String;

.field private zbk:Ljava/lang/String;

.field private zbl:LCa7;

.field private zbm:LWc7;

.field private zbn:I

.field private zbo:Z

.field private zbp:I

.field private zbq:LCa7;

.field private zbr:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LOS6;

    invoke-direct {v0}, LOS6;-><init>()V

    sput-object v0, LOS6;->zbd:LOS6;

    const-class v1, LOS6;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcb7;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LOS6;->zbf:I

    iput v0, p0, LOS6;->zbh:I

    const/4 v0, 0x2

    iput-byte v0, p0, LOS6;->zbr:B

    const-string v0, "FaceAttributesClientBrainEmbedder"

    iput-object v0, p0, LOS6;->zbj:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, LOS6;->zbk:Ljava/lang/String;

    sget-object v0, LCa7;->c:LCa7;

    iput-object v0, p0, LOS6;->zbl:LCa7;

    const/4 v1, 0x1

    iput-boolean v1, p0, LOS6;->zbo:Z

    iput v1, p0, LOS6;->zbp:I

    iput-object v0, p0, LOS6;->zbq:LCa7;

    return-void
.end method

.method public static synthetic F()LOS6;
    .locals 1

    sget-object v0, LOS6;->zbd:LOS6;

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
    iput-byte p3, p0, LOS6;->zbr:B

    return-object v3

    :cond_1
    sget-object p1, LOS6;->zbd:LOS6;

    return-object p1

    :cond_2
    new-instance p1, LNS6;

    invoke-direct {p1, v3}, LNS6;-><init>(LIS6;)V

    return-object p1

    :cond_3
    new-instance p1, LOS6;

    invoke-direct {p1}, LOS6;-><init>()V

    return-object p1

    :cond_4
    const/16 p1, 0x10

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zbg"

    aput-object p2, p1, v0

    const-string p2, "zbf"

    aput-object p2, p1, p3

    const-string p2, "zbi"

    aput-object p2, p1, v4

    const-string p2, "zbh"

    aput-object p2, p1, v3

    const-string p2, "zbe"

    aput-object p2, p1, v2

    const-class p2, LNR6;

    aput-object p2, p1, v1

    const/4 p2, 0x6

    const-string p3, "zbo"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zbp"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    sget-object p3, LJS6;->a:Ljb7;

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-class p3, LbT6;

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zbj"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zbk"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zbn"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zbm"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zbq"

    aput-object p3, p1, p2

    const/16 p2, 0xf

    const-string p3, "zbl"

    aput-object p3, p1, p2

    sget-object p2, LOS6;->zbd:LOS6;

    const-string p3, "\u0001\u000c\u0002\u0001\u0002\u000f\u000c\u0000\u0000\u0001\u0002<\u0000\u0003;\u0000\u0004\u1007\u0005\u0005\u100c\u0006\u0007\u043c\u0001\u0008;\u0001\t\u1008\u0000\n\u1008\u0001\u000c\u1004\u0004\r\u1009\u0003\u000e\u100a\u0007\u000f\u100a\u0002"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LOS6;->zbr:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
