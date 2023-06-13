.class public final LyU6;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:LyU6;


# instance fields
.field private zbd:I

.field private zbe:F

.field private zbf:F

.field private zbg:F

.field private zbh:F

.field private zbi:LBU6;

.field private zbj:F

.field private zbk:LhU6;

.field private zbl:F

.field private zbm:LCa7;

.field private zbn:LCa7;

.field private zbo:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LyU6;

    invoke-direct {v0}, LyU6;-><init>()V

    sput-object v0, LyU6;->zbb:LyU6;

    const-class v1, LyU6;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, LyU6;->zbo:B

    sget-object v0, LCa7;->c:LCa7;

    iput-object v0, p0, LyU6;->zbm:LCa7;

    iput-object v0, p0, LyU6;->zbn:LCa7;

    return-void
.end method

.method public static synthetic E()LyU6;
    .locals 1

    sget-object v0, LyU6;->zbb:LyU6;

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
    iput-byte p3, p0, LyU6;->zbo:B

    return-object v3

    :cond_1
    sget-object p1, LyU6;->zbb:LyU6;

    return-object p1

    :cond_2
    new-instance p1, LxU6;

    invoke-direct {p1, v3}, LxU6;-><init>(LwU6;)V

    return-object p1

    :cond_3
    new-instance p1, LyU6;

    invoke-direct {p1}, LyU6;-><init>()V

    return-object p1

    :cond_4
    const/16 p1, 0xb

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zbd"

    aput-object p2, p1, v0

    const-string p2, "zbe"

    aput-object p2, p1, p3

    const-string p2, "zbf"

    aput-object p2, p1, v4

    const-string p2, "zbg"

    aput-object p2, p1, v3

    const-string p2, "zbh"

    aput-object p2, p1, v2

    const-string p2, "zbl"

    aput-object p2, p1, v1

    const/4 p2, 0x6

    const-string p3, "zbm"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zbj"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zbk"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zbi"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zbn"

    aput-object p3, p1, p2

    sget-object p2, LyU6;->zbb:LyU6;

    const-string p3, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0004\u0001\u1501\u0000\u0002\u1501\u0001\u0003\u1501\u0002\u0004\u1001\u0003\u0005\u1001\u0007\u0006\u100a\u0008\u0007\u1001\u0005\u0008\u1009\u0006\t\u1409\u0004\n\u100a\t"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LyU6;->zbo:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
