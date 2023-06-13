.class public final LV67;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:LV67;


# instance fields
.field private zbd:I

.field private zbe:Ljava/lang/String;

.field private zbf:Ljava/lang/String;

.field private zbg:Ljava/lang/String;

.field private zbh:LX67;

.field private zbi:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LV67;

    invoke-direct {v0}, LV67;-><init>()V

    sput-object v0, LV67;->zbb:LV67;

    const-class v1, LV67;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, LV67;->zbi:B

    const-string v0, ""

    iput-object v0, p0, LV67;->zbe:Ljava/lang/String;

    iput-object v0, p0, LV67;->zbf:Ljava/lang/String;

    iput-object v0, p0, LV67;->zbg:Ljava/lang/String;

    return-void
.end method

.method public static synthetic E()LV67;
    .locals 1

    sget-object v0, LV67;->zbb:LV67;

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
    iput-byte p3, p0, LV67;->zbi:B

    return-object v3

    :cond_1
    sget-object p1, LV67;->zbb:LV67;

    return-object p1

    :cond_2
    new-instance p1, LU67;

    invoke-direct {p1, v3}, LU67;-><init>(LT67;)V

    return-object p1

    :cond_3
    new-instance p1, LV67;

    invoke-direct {p1}, LV67;-><init>()V

    return-object p1

    :cond_4
    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "zbd"

    aput-object p2, p1, v0

    const-string p2, "zbe"

    aput-object p2, p1, p3

    const-string p2, "zbf"

    aput-object p2, p1, v4

    const-string p2, "zbh"

    aput-object p2, p1, v3

    const-string p2, "zbg"

    aput-object p2, p1, v2

    sget-object p2, LV67;->zbb:LV67;

    const-string p3, "\u0001\u0004\u0000\u0001\u0001\u03ea\u0004\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1409\u0003\u03ea\u1008\u0002"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LV67;->zbi:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
