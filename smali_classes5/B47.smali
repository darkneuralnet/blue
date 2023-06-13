.class public final LB47;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:LB47;


# instance fields
.field private zbd:I

.field private zbe:Ljava/lang/String;

.field private zbf:Lz47;

.field private zbg:LZ37;

.field private zbh:LpX6;

.field private zbi:Ljava/lang/String;

.field private zbj:I

.field private zbk:LWc7;

.field private zbl:I

.field private zbm:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LB47;

    invoke-direct {v0}, LB47;-><init>()V

    sput-object v0, LB47;->zbb:LB47;

    const-class v1, LB47;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lfb7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LB47;->zbe:Ljava/lang/String;

    const-string v1, "en"

    iput-object v1, p0, LB47;->zbi:Ljava/lang/String;

    const/4 v1, 0x1

    iput v1, p0, LB47;->zbj:I

    const/4 v1, -0x1

    iput v1, p0, LB47;->zbl:I

    iput-object v0, p0, LB47;->zbm:Ljava/lang/String;

    return-void
.end method

.method public static synthetic E()LB47;
    .locals 1

    sget-object v0, LB47;->zbb:LB47;

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
    sget-object p1, LB47;->zbb:LB47;

    return-object p1

    :cond_1
    new-instance p1, Lx47;

    invoke-direct {p1, p2}, Lx47;-><init>(Lw47;)V

    return-object p1

    :cond_2
    new-instance p1, LB47;

    invoke-direct {p1}, LB47;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0xb

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zbd"

    aput-object v4, p1, v3

    const-string v3, "zbe"

    aput-object v3, p1, p2

    const-string p2, "zbf"

    aput-object p2, p1, v2

    const-string p2, "zbj"

    aput-object p2, p1, v1

    sget-object p2, LA47;->a:Ljb7;

    aput-object p2, p1, v0

    const-string p2, "zbk"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zbg"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zbi"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zbl"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zbh"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zbm"

    aput-object p3, p1, p2

    sget-object p2, LB47;->zbb:LB47;

    const-string p3, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u100c\u0005\u0004\u1009\u0006\u0005\u1009\u0002\u0006\u1008\u0004\u0007\u1004\u0007\u0008\u1009\u0003\t\u1008\u0008"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
