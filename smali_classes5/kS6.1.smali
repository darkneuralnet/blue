.class public final LkS6;
.super Lcb7;
.source "SourceFile"


# static fields
.field private static final zbd:LkS6;


# instance fields
.field private zbe:I

.field private zbf:LZR6;

.field private zbg:Lob7;

.field private zbh:F

.field private zbi:F

.field private zbj:F

.field private zbk:F

.field private zbl:F

.field private zbm:Lob7;

.field private zbn:Lob7;

.field private zbo:J

.field private zbp:J

.field private zbq:J

.field private zbr:F

.field private zbs:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LkS6;

    invoke-direct {v0}, LkS6;-><init>()V

    sput-object v0, LkS6;->zbd:LkS6;

    const-class v1, LkS6;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcb7;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, LkS6;->zbs:B

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, LkS6;->zbg:Lob7;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, LkS6;->zbm:Lob7;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, LkS6;->zbn:Lob7;

    return-void
.end method

.method public static synthetic F()LkS6;
    .locals 1

    sget-object v0, LkS6;->zbd:LkS6;

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
    iput-byte p3, p0, LkS6;->zbs:B

    return-object v3

    :cond_1
    sget-object p1, LkS6;->zbd:LkS6;

    return-object p1

    :cond_2
    new-instance p1, LaS6;

    invoke-direct {p1, v3}, LaS6;-><init>(LUR6;)V

    return-object p1

    :cond_3
    new-instance p1, LkS6;

    invoke-direct {p1}, LkS6;-><init>()V

    return-object p1

    :cond_4
    const/16 p1, 0x11

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zbe"

    aput-object p2, p1, v0

    const-string p2, "zbf"

    aput-object p2, p1, p3

    const-string p2, "zbg"

    aput-object p2, p1, v4

    const-class p2, LgS6;

    aput-object p2, p1, v3

    const-string p2, "zbh"

    aput-object p2, p1, v2

    const-string p2, "zbi"

    aput-object p2, p1, v1

    const/4 p2, 0x6

    const-string p3, "zbj"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zbk"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zbm"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-class p3, LcS6;

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zbn"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-class p3, LXR6;

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zbp"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zbr"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zbq"

    aput-object p3, p1, p2

    const/16 p2, 0xf

    const-string p3, "zbo"

    aput-object p3, p1, p2

    const/16 p2, 0x10

    const-string p3, "zbl"

    aput-object p3, p1, p2

    sget-object p2, LkS6;->zbd:LkS6;

    const-string p3, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0003\u0000\u0001\u1009\u0000\u0002\u001b\u0003\u1001\u0001\u0004\u1001\u0002\u0005\u1001\u0003\u0006\u1001\u0004\u0007\u001b\u0008\u001b\t\u1003\u0007\n\u1001\t\u000b\u1003\u0008\u000c\u1003\u0006\r\u1001\u0005"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LkS6;->zbs:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
