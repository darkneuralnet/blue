.class public final LIQ6;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:LIQ6;


# instance fields
.field private zbd:I

.field private zbe:I

.field private zbf:Lee7;

.field private zbg:LJd7;

.field private zbh:Lhd7;

.field private zbi:LUd7;

.field private zbj:LAd7;

.field private zbk:Lmd7;

.field private zbl:LLQ6;

.field private zbm:Lpd7;

.field private zbn:LPd7;

.field private zbo:LSd7;

.field private zbp:LSd7;

.field private zbq:LSd7;

.field private zbr:Z

.field private zbs:LDd7;

.field private zbt:I

.field private zbu:Z

.field private zbv:LEQ6;

.field private zbw:Ljd7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LIQ6;

    invoke-direct {v0}, LIQ6;-><init>()V

    sput-object v0, LIQ6;->zbb:LIQ6;

    const-class v1, LIQ6;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LIQ6;->zbt:I

    return-void
.end method

.method public static synthetic E()LIQ6;
    .locals 1

    sget-object v0, LIQ6;->zbb:LIQ6;

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
    sget-object p1, LIQ6;->zbb:LIQ6;

    return-object p1

    :cond_1
    new-instance p1, LHQ6;

    invoke-direct {p1, p2}, LHQ6;-><init>(LUc7;)V

    return-object p1

    :cond_2
    new-instance p1, LIQ6;

    invoke-direct {p1}, LIQ6;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0x15

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zbd"

    aput-object v4, p1, v3

    const-string v3, "zbe"

    aput-object v3, p1, p2

    sget-object p2, Lqd7;->a:Ljb7;

    aput-object p2, p1, v2

    const-string p2, "zbf"

    aput-object p2, p1, v1

    const-string p2, "zbg"

    aput-object p2, p1, v0

    const-string p2, "zbh"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zbi"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zbo"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zbp"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zbq"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zbr"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zbj"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zbs"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zbk"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zbl"

    aput-object p3, p1, p2

    const/16 p2, 0xf

    const-string p3, "zbt"

    aput-object p3, p1, p2

    const/16 p2, 0x10

    const-string p3, "zbm"

    aput-object p3, p1, p2

    const/16 p2, 0x11

    const-string p3, "zbu"

    aput-object p3, p1, p2

    const/16 p2, 0x12

    const-string p3, "zbv"

    aput-object p3, p1, p2

    const/16 p2, 0x13

    const-string p3, "zbn"

    aput-object p3, p1, p2

    const/16 p2, 0x14

    const-string p3, "zbw"

    aput-object p3, p1, p2

    sget-object p2, LIQ6;->zbb:LIQ6;

    const-string p3, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1009\u0003\u0005\u1009\u0004\u0006\u1009\n\u0007\u1009\u000b\u0008\u1009\u000c\t\u1007\r\n\u1009\u0005\u000b\u1009\u000e\u000c\u1009\u0006\r\u1009\u0007\u000e\u1004\u000f\u000f\u1009\u0008\u0010\u1007\u0010\u0011\u1009\u0011\u0012\u1009\t\u0013\u1009\u0012"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
