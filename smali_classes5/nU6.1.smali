.class public final LnU6;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:LnU6;


# instance fields
.field private zbd:I

.field private zbe:I

.field private zbf:Ljava/lang/Object;

.field private zbg:Ljava/lang/String;

.field private zbh:Ljava/lang/String;

.field private zbi:LCa7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LnU6;

    invoke-direct {v0}, LnU6;-><init>()V

    sput-object v0, LnU6;->zbb:LnU6;

    const-class v1, LnU6;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LnU6;->zbe:I

    const-string v0, ""

    iput-object v0, p0, LnU6;->zbg:Ljava/lang/String;

    iput-object v0, p0, LnU6;->zbh:Ljava/lang/String;

    sget-object v0, LCa7;->c:LCa7;

    iput-object v0, p0, LnU6;->zbi:LCa7;

    return-void
.end method

.method public static synthetic E()LnU6;
    .locals 1

    sget-object v0, LnU6;->zbb:LnU6;

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
    sget-object p1, LnU6;->zbb:LnU6;

    return-object p1

    :cond_1
    new-instance p1, LmU6;

    invoke-direct {p1, p2}, LmU6;-><init>(LlU6;)V

    return-object p1

    :cond_2
    new-instance p1, LnU6;

    invoke-direct {p1}, LnU6;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0x8

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zbf"

    aput-object v4, p1, v3

    const-string v3, "zbe"

    aput-object v3, p1, p2

    const-string p2, "zbd"

    aput-object p2, p1, v2

    const-string p2, "zbg"

    aput-object p2, p1, v1

    const-string p2, "zbh"

    aput-object p2, p1, v0

    const-class p2, LhU6;

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-class p3, LEU6;

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zbi"

    aput-object p3, p1, p2

    sget-object p2, LnU6;->zbb:LnU6;

    const-string p3, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003<\u0000\u0004<\u0000\u0005\u100a\u0002"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
