.class public final Lee7;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:Lee7;


# instance fields
.field private zbd:I

.field private zbe:Ljava/lang/String;

.field private zbf:Ljava/lang/String;

.field private zbg:Ljava/lang/String;

.field private zbh:I

.field private zbi:I

.field private zbj:LDd7;

.field private zbk:Z

.field private zbl:I

.field private zbm:Z

.field private zbn:Z

.field private zbo:Z

.field private zbp:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lee7;

    invoke-direct {v0}, Lee7;-><init>()V

    sput-object v0, Lee7;->zbb:Lee7;

    const-class v1, Lee7;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lee7;->zbe:Ljava/lang/String;

    iput-object v0, p0, Lee7;->zbf:Ljava/lang/String;

    iput-object v0, p0, Lee7;->zbg:Ljava/lang/String;

    return-void
.end method

.method public static synthetic E()Lee7;
    .locals 1

    sget-object v0, Lee7;->zbb:Lee7;

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
    sget-object p1, Lee7;->zbb:Lee7;

    return-object p1

    :cond_1
    new-instance p1, Lde7;

    invoke-direct {p1, p2}, Lde7;-><init>(LUc7;)V

    return-object p1

    :cond_2
    new-instance p1, Lee7;

    invoke-direct {p1}, Lee7;-><init>()V

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

    sget-object p2, LBQ6;->a:Ljb7;

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

    sget-object p3, LCQ6;->a:Ljb7;

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zbm"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zbn"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zbo"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zbp"

    aput-object p3, p1, p2

    sget-object p2, Lee7;->zbb:Lee7;

    const-string p3, "\u0001\u000c\u0000\u0001\u0001\u000c\u000c\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u100c\u0003\u0005\u1004\u0004\u0006\u1009\u0005\u0007\u1007\u0006\u0008\u100c\u0007\t\u1007\u0008\n\u1007\t\u000b\u1007\n\u000c\u1002\u000b"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
