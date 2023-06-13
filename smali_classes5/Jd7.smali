.class public final LJd7;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:LJd7;


# instance fields
.field private zbd:I

.field private zbe:Z

.field private zbf:I

.field private zbg:Z

.field private zbh:I

.field private zbi:I

.field private zbj:I

.field private zbk:I

.field private zbl:Ljava/lang/String;

.field private zbm:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LJd7;

    invoke-direct {v0}, LJd7;-><init>()V

    sput-object v0, LJd7;->zbb:LJd7;

    const-class v1, LJd7;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LJd7;->zbg:Z

    const-string v0, ""

    iput-object v0, p0, LJd7;->zbl:Ljava/lang/String;

    iput-object v0, p0, LJd7;->zbm:Ljava/lang/String;

    return-void
.end method

.method public static synthetic E()LJd7;
    .locals 1

    sget-object v0, LJd7;->zbb:LJd7;

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
    sget-object p1, LJd7;->zbb:LJd7;

    return-object p1

    :cond_1
    new-instance p1, LId7;

    invoke-direct {p1, p2}, LId7;-><init>(LUc7;)V

    return-object p1

    :cond_2
    new-instance p1, LJd7;

    invoke-direct {p1}, LJd7;-><init>()V

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

    sget-object p2, LLd7;->a:Ljb7;

    aput-object p2, p1, v1

    const-string p2, "zbg"

    aput-object p2, p1, v0

    const-string p2, "zbh"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    sget-object p3, LHd7;->a:Ljb7;

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zbi"

    aput-object p3, p1, p2

    sget-object p2, LKd7;->a:Ljb7;

    const/16 p3, 0x8

    aput-object p2, p1, p3

    const/16 p3, 0x9

    const-string v0, "zbj"

    aput-object v0, p1, p3

    const/16 p3, 0xa

    aput-object p2, p1, p3

    const/16 p3, 0xb

    const-string v0, "zbk"

    aput-object v0, p1, p3

    const/16 p3, 0xc

    aput-object p2, p1, p3

    const/16 p2, 0xd

    const-string p3, "zbl"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zbm"

    aput-object p3, p1, p2

    sget-object p2, LJd7;->zbb:LJd7;

    const-string p3, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u100c\u0001\u0003\u1007\u0002\u0004\u100c\u0003\u0005\u100c\u0004\u0006\u100c\u0005\u0007\u100c\u0006\u0008\u1008\u0007\t\u1008\u0008"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
