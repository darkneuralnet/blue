.class public final LsU6;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:LsU6;


# instance fields
.field private zbd:I

.field private zbe:J

.field private zbf:Ljava/lang/String;

.field private zbg:Ljava/lang/String;

.field private zbh:I

.field private zbi:I

.field private zbj:Lob7;

.field private zbk:Ljava/lang/String;

.field private zbl:LkU6;

.field private zbm:LCa7;

.field private zbn:LHU6;

.field private zbo:Ljava/lang/String;

.field private zbp:Lob7;

.field private zbq:Lob7;

.field private zbr:LCa7;

.field private zbs:Ljava/lang/String;

.field private zbt:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LsU6;

    invoke-direct {v0}, LsU6;-><init>()V

    sput-object v0, LsU6;->zbb:LsU6;

    const-class v1, LsU6;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lfb7;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, LsU6;->zbt:B

    const-string v0, ""

    iput-object v0, p0, LsU6;->zbf:Ljava/lang/String;

    iput-object v0, p0, LsU6;->zbg:Ljava/lang/String;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v1

    iput-object v1, p0, LsU6;->zbj:Lob7;

    iput-object v0, p0, LsU6;->zbk:Ljava/lang/String;

    sget-object v1, LCa7;->c:LCa7;

    iput-object v1, p0, LsU6;->zbm:LCa7;

    iput-object v0, p0, LsU6;->zbo:Ljava/lang/String;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v2

    iput-object v2, p0, LsU6;->zbp:Lob7;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v2

    iput-object v2, p0, LsU6;->zbq:Lob7;

    iput-object v1, p0, LsU6;->zbr:LCa7;

    iput-object v0, p0, LsU6;->zbs:Ljava/lang/String;

    return-void
.end method

.method public static synthetic E()LsU6;
    .locals 1

    sget-object v0, LsU6;->zbb:LsU6;

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
    iput-byte p3, p0, LsU6;->zbt:B

    return-object v3

    :cond_1
    sget-object p1, LsU6;->zbb:LsU6;

    return-object p1

    :cond_2
    new-instance p1, LpU6;

    invoke-direct {p1, v3}, LpU6;-><init>(LoU6;)V

    return-object p1

    :cond_3
    new-instance p1, LsU6;

    invoke-direct {p1}, LsU6;-><init>()V

    return-object p1

    :cond_4
    const/16 p1, 0x12

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zbd"

    aput-object p2, p1, v0

    const-string p2, "zbe"

    aput-object p2, p1, p3

    const-string p2, "zbp"

    aput-object p2, p1, v4

    const-class p2, LrU6;

    aput-object p2, p1, v3

    const-string p2, "zbf"

    aput-object p2, p1, v2

    const-string p2, "zbg"

    aput-object p2, p1, v1

    const/4 p2, 0x6

    const-string p3, "zbh"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zbi"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zbj"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zbk"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zbm"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zbn"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zbl"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zbr"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zbo"

    aput-object p3, p1, p2

    const/16 p2, 0xf

    const-string p3, "zbs"

    aput-object p3, p1, p2

    const/16 p2, 0x10

    const-string p3, "zbq"

    aput-object p3, p1, p2

    const/16 p2, 0x11

    const-class p3, LnU6;

    aput-object p3, p1, p2

    sget-object p2, LsU6;->zbb:LsU6;

    const-string p3, "\u0001\u000f\u0000\u0001\u0001\u001c\u000f\u0000\u0003\u0004\u0001\u1502\u0000\u0002\u0431\u0010\u1008\u0001\u0011\u1008\u0002\u0012\u1004\u0003\u0013\u1004\u0004\u0014\u001a\u0015\u1008\u0005\u0016\u100a\u0007\u0017\u1409\u0008\u0018\u1409\u0006\u0019\u100a\n\u001a\u1008\t\u001b\u1008\u000b\u001c\u001b"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LsU6;->zbt:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
