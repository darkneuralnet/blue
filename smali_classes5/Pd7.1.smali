.class public final LPd7;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:LPd7;


# instance fields
.field private zbd:I

.field private zbe:I

.field private zbf:Z

.field private zbg:I

.field private zbh:LCa7;

.field private zbi:Ljava/lang/String;

.field private zbj:Z

.field private zbk:Z

.field private zbl:Z

.field private zbm:I

.field private zbn:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LPd7;

    invoke-direct {v0}, LPd7;-><init>()V

    sput-object v0, LPd7;->zbb:LPd7;

    const-class v1, LPd7;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LPd7;->zbe:I

    sget-object v0, LCa7;->c:LCa7;

    iput-object v0, p0, LPd7;->zbh:LCa7;

    const-string v0, ""

    iput-object v0, p0, LPd7;->zbi:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, LPd7;->zbk:Z

    iput-boolean v0, p0, LPd7;->zbl:Z

    return-void
.end method

.method public static synthetic E()LPd7;
    .locals 1

    sget-object v0, LPd7;->zbb:LPd7;

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
    sget-object p1, LPd7;->zbb:LPd7;

    return-object p1

    :cond_1
    new-instance p1, LMd7;

    invoke-direct {p1, p2}, LMd7;-><init>(LUc7;)V

    return-object p1

    :cond_2
    new-instance p1, LPd7;

    invoke-direct {p1}, LPd7;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0xe

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

    sget-object p2, LNd7;->a:Ljb7;

    aput-object p2, p1, v0

    const-string p2, "zbh"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zbi"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zbj"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zbk"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zbl"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zbm"

    aput-object p3, p1, p2

    sget-object p2, LOd7;->a:Ljb7;

    const/16 p3, 0xb

    aput-object p2, p1, p3

    const/16 p3, 0xc

    const-string v0, "zbn"

    aput-object v0, p1, p3

    const/16 p3, 0xd

    aput-object p2, p1, p3

    sget-object p2, LPd7;->zbb:LPd7;

    const-string p3, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1007\u0001\u0003\u100c\u0002\u0004\u100a\u0003\u0005\u1008\u0004\u0006\u1007\u0005\u0007\u1007\u0006\u0008\u1007\u0007\t\u100c\u0008\n\u100c\t"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
