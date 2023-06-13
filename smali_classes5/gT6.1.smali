.class public final LgT6;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field public static final zbb:Leb7;

.field private static final zbd:LgT6;


# instance fields
.field private zbe:I

.field private zbf:Lob7;

.field private zbg:LfT6;

.field private zbh:F

.field private zbi:I

.field private zbj:Z

.field private zbk:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v2, LgT6;

    invoke-direct {v2}, LgT6;-><init>()V

    sput-object v2, LgT6;->zbd:LgT6;

    const-class v0, LgT6;

    invoke-static {v0, v2}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    invoke-static {}, LbT6;->G()LbT6;

    move-result-object v0

    const/4 v3, 0x0

    const v4, 0x1ea8e13

    sget-object v5, LRc7;->n:LRc7;

    const-class v6, LgT6;

    move-object v1, v2

    invoke-static/range {v0 .. v6}, Lfb7;->v(LTb7;Ljava/lang/Object;LTb7;Lib7;ILRc7;Ljava/lang/Class;)Leb7;

    move-result-object v0

    sput-object v0, LgT6;->zbb:Leb7;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, LgT6;->zbf:Lob7;

    return-void
.end method

.method public static synthetic E()LgT6;
    .locals 1

    sget-object v0, LgT6;->zbd:LgT6;

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
    sget-object p1, LgT6;->zbd:LgT6;

    return-object p1

    :cond_1
    new-instance p1, LcT6;

    invoke-direct {p1, p2}, LcT6;-><init>(LPS6;)V

    return-object p1

    :cond_2
    new-instance p1, LgT6;

    invoke-direct {p1}, LgT6;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0x9

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zbe"

    aput-object v4, p1, v3

    const-string v3, "zbf"

    aput-object v3, p1, p2

    const-class p2, LfT6;

    aput-object p2, p1, v2

    const-string p2, "zbj"

    aput-object p2, p1, v1

    const-string p2, "zbg"

    aput-object p2, p1, v0

    const-string p2, "zbh"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zbk"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zbi"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    sget-object p3, LdT6;->a:Ljb7;

    aput-object p3, p1, p2

    sget-object p2, LgT6;->zbd:LgT6;

    const-string p3, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002\u1007\u0003\u0003\u1009\u0000\u0004\u1001\u0001\u0005\u1007\u0004\u0006\u100c\u0002"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
