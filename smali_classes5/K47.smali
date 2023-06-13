.class public final LK47;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:LK47;


# instance fields
.field private zbd:I

.field private zbe:Lob7;

.field private zbf:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LK47;

    invoke-direct {v0}, LK47;-><init>()V

    sput-object v0, LK47;->zbb:LK47;

    const-class v1, LK47;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, LK47;->zbe:Lob7;

    return-void
.end method

.method public static synthetic E()LK47;
    .locals 1

    sget-object v0, LK47;->zbb:LK47;

    return-object v0
.end method


# virtual methods
.method public final p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x4

    const/4 v0, 0x3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_3

    if-eq p1, v0, :cond_2

    const/4 p2, 0x0

    if-eq p1, p3, :cond_1

    const/4 p3, 0x5

    if-eq p1, p3, :cond_0

    return-object p2

    :cond_0
    sget-object p1, LK47;->zbb:LK47;

    return-object p1

    :cond_1
    new-instance p1, LJ47;

    invoke-direct {p1, p2}, LJ47;-><init>(LI47;)V

    return-object p1

    :cond_2
    new-instance p1, LK47;

    invoke-direct {p1}, LK47;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v2, "zbd"

    aput-object v2, p1, p3

    const-string p3, "zbe"

    aput-object p3, p1, p2

    const-class p2, LN37;

    aput-object p2, p1, v1

    const-string p2, "zbf"

    aput-object p2, p1, v0

    sget-object p2, LK47;->zbb:LK47;

    const-string p3, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1004\u0000"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
