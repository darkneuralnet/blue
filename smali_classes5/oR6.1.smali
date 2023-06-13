.class public final LoR6;
.super Lcb7;
.source "SourceFile"


# static fields
.field private static final zbd:LoR6;


# instance fields
.field private zbe:I

.field private zbf:I

.field private zbg:Ljava/lang/Object;

.field private zbh:Ljava/lang/String;

.field private zbi:I

.field private zbj:I

.field private zbk:I

.field private zbl:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LoR6;

    invoke-direct {v0}, LoR6;-><init>()V

    sput-object v0, LoR6;->zbd:LoR6;

    const-class v1, LoR6;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcb7;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LoR6;->zbf:I

    const/4 v0, 0x2

    iput-byte v0, p0, LoR6;->zbl:B

    const-string v0, ""

    iput-object v0, p0, LoR6;->zbh:Ljava/lang/String;

    return-void
.end method

.method public static synthetic F()LoR6;
    .locals 1

    sget-object v0, LoR6;->zbd:LoR6;

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
    iput-byte p3, p0, LoR6;->zbl:B

    return-object v3

    :cond_1
    sget-object p1, LoR6;->zbd:LoR6;

    return-object p1

    :cond_2
    new-instance p1, LnR6;

    invoke-direct {p1, v3}, LnR6;-><init>(LXQ6;)V

    return-object p1

    :cond_3
    new-instance p1, LoR6;

    invoke-direct {p1}, LoR6;-><init>()V

    return-object p1

    :cond_4
    const/4 p1, 0x7

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zbg"

    aput-object p2, p1, v0

    const-string p2, "zbf"

    aput-object p2, p1, p3

    const-string p2, "zbe"

    aput-object p2, p1, v4

    const-string p2, "zbh"

    aput-object p2, p1, v3

    const-string p2, "zbi"

    aput-object p2, p1, v2

    const-string p2, "zbj"

    aput-object p2, p1, v1

    const/4 p2, 0x6

    const-string p3, "zbk"

    aput-object p3, p1, p2

    sget-object p2, LoR6;->zbd:LoR6;

    const-string p3, "\u0001\u0007\u0001\u0001\u0001\u0008\u0007\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1004\u0003\u0006=\u0000\u0007=\u0000\u00086\u0000"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LoR6;->zbl:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
