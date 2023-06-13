.class public final LN17;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:LN17;


# instance fields
.field private zbd:I

.field private zbe:I

.field private zbf:F

.field private zbg:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LN17;

    invoke-direct {v0}, LN17;-><init>()V

    sput-object v0, LN17;->zbb:LN17;

    const-class v1, LN17;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, LN17;->zbe:I

    const v0, 0x47c35000    # 100000.0f

    iput v0, p0, LN17;->zbf:F

    return-void
.end method

.method public static synthetic E()LN17;
    .locals 1

    sget-object v0, LN17;->zbb:LN17;

    return-object v0
.end method


# virtual methods
.method public final p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

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
    sget-object p1, LN17;->zbb:LN17;

    return-object p1

    :cond_1
    new-instance p1, LL17;

    invoke-direct {p1, p2}, LL17;-><init>(LH17;)V

    return-object p1

    :cond_2
    new-instance p1, LN17;

    invoke-direct {p1}, LN17;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v3, "zbd"

    aput-object v3, p1, p3

    const-string p3, "zbe"

    aput-object p3, p1, p2

    sget-object p2, LJ17;->a:Ljb7;

    aput-object p2, p1, v2

    const-string p2, "zbf"

    aput-object p2, p1, v1

    const-string p2, "zbg"

    aput-object p2, p1, v0

    sget-object p2, LN17;->zbb:LN17;

    const-string p3, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1001\u0001\u0003\u1001\u0002"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
