.class public final LaV6;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:LaV6;


# instance fields
.field private zbd:I

.field private zbe:Ljava/lang/Object;

.field private zbf:LQU6;

.field private zbg:Ljava/lang/String;

.field private zbh:Ljava/lang/String;

.field private zbi:Ljava/lang/String;

.field private zbj:Lob7;

.field private zbk:Lob7;

.field private zbl:LNb7;

.field private zbm:Lob7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LaV6;

    invoke-direct {v0}, LaV6;-><init>()V

    sput-object v0, LaV6;->zbb:LaV6;

    const-class v1, LaV6;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LaV6;->zbd:I

    invoke-static {}, LNb7;->d()LNb7;

    move-result-object v0

    iput-object v0, p0, LaV6;->zbl:LNb7;

    const-string v0, ""

    iput-object v0, p0, LaV6;->zbg:Ljava/lang/String;

    iput-object v0, p0, LaV6;->zbh:Ljava/lang/String;

    iput-object v0, p0, LaV6;->zbi:Ljava/lang/String;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, LaV6;->zbj:Lob7;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, LaV6;->zbk:Lob7;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, LaV6;->zbm:Lob7;

    return-void
.end method

.method public static synthetic E()LaV6;
    .locals 1

    sget-object v0, LaV6;->zbb:LaV6;

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
    sget-object p1, LaV6;->zbb:LaV6;

    return-object p1

    :cond_1
    new-instance p1, LSU6;

    invoke-direct {p1, p2}, LSU6;-><init>(LIU6;)V

    return-object p1

    :cond_2
    new-instance p1, LaV6;

    invoke-direct {p1}, LaV6;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0xf

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zbe"

    aput-object v4, p1, v3

    const-string v3, "zbd"

    aput-object v3, p1, p2

    const-string p2, "zbf"

    aput-object p2, p1, v2

    const-string p2, "zbg"

    aput-object p2, p1, v1

    const-string p2, "zbj"

    aput-object p2, p1, v0

    const-class p2, LUU6;

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zbk"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-class p3, LZU6;

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-class p3, LOU6;

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zbl"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    sget-object p3, LRU6;->a:LMb7;

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zbm"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-class p3, Lka7;

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zbh"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zbi"

    aput-object p3, p1, p2

    sget-object p2, LaV6;->zbb:LaV6;

    const-string p3, "\u0000\t\u0001\u0000\u0001\u000b\t\u0001\u0003\u0000\u0001\t\u0002\u0208\u0003\u001b\u0004\u001b\u0005<\u0000\u00082\t\u001b\n\u0208\u000b\u0208"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
