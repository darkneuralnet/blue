.class public final LAS6;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:LAS6;


# instance fields
.field private zbd:I

.field private zbe:F

.field private zbf:F

.field private zbg:F

.field private zbh:F

.field private zbi:F

.field private zbj:F

.field private zbk:LtS6;

.field private zbl:I

.field private zbm:I

.field private zbn:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LAS6;

    invoke-direct {v0}, LAS6;-><init>()V

    sput-object v0, LAS6;->zbb:LAS6;

    const-class v1, LAS6;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lfb7;-><init>()V

    return-void
.end method

.method public static synthetic E()LAS6;
    .locals 1

    sget-object v0, LAS6;->zbb:LAS6;

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
    sget-object p1, LAS6;->zbb:LAS6;

    return-object p1

    :cond_1
    new-instance p1, LxS6;

    invoke-direct {p1, p2}, LxS6;-><init>(LoS6;)V

    return-object p1

    :cond_2
    new-instance p1, LAS6;

    invoke-direct {p1}, LAS6;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0xd

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

    const-string p2, "zbl"

    aput-object p2, p1, v0

    sget-object p2, LyS6;->a:Ljb7;

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zbm"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    sget-object p3, LzS6;->a:Ljb7;

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zbn"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zbk"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zbh"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zbi"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zbj"

    aput-object p3, p1, p2

    sget-object p2, LAS6;->zbb:LAS6;

    const-string p3, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u1001\u0002\u0004\u100c\u0007\u0005\u100c\u0008\u0006\u1001\t\u0007\u1009\u0006\t\u1001\u0003\n\u1001\u0004\u000b\u1001\u0005"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
