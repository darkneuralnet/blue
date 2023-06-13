.class public final Lka7;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:Lka7;


# instance fields
.field private zbd:Ljava/lang/String;

.field private zbe:LCa7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lka7;

    invoke-direct {v0}, Lka7;-><init>()V

    sput-object v0, Lka7;->zbb:Lka7;

    const-class v1, Lka7;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lka7;->zbd:Ljava/lang/String;

    sget-object v0, LCa7;->c:LCa7;

    iput-object v0, p0, Lka7;->zbe:LCa7;

    return-void
.end method

.method public static synthetic E()Lka7;
    .locals 1

    sget-object v0, Lka7;->zbb:Lka7;

    return-object v0
.end method


# virtual methods
.method public final p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x2

    if-eq p1, p3, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, Lka7;->zbb:Lka7;

    return-object p1

    :cond_1
    new-instance p1, Lja7;

    invoke-direct {p1, p3}, Lja7;-><init>(Lia7;)V

    return-object p1

    :cond_2
    new-instance p1, Lka7;

    invoke-direct {p1}, Lka7;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "zbd"

    aput-object v0, p1, p3

    const-string p3, "zbe"

    aput-object p3, p1, p2

    sget-object p2, Lka7;->zbb:Lka7;

    new-instance p3, Lhc7;

    const-string v0, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\n"

    invoke-direct {p3, p2, v0, p1}, Lhc7;-><init>(LTb7;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p3

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
