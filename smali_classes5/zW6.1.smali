.class public final LzW6;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:LzW6;


# instance fields
.field private zbd:Lnb7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LzW6;

    invoke-direct {v0}, LzW6;-><init>()V

    sput-object v0, LzW6;->zbb:LzW6;

    const-class v1, LzW6;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    invoke-static {}, Lfb7;->B()Lnb7;

    move-result-object v0

    iput-object v0, p0, LzW6;->zbd:Lnb7;

    return-void
.end method

.method public static synthetic E()LzW6;
    .locals 1

    sget-object v0, LzW6;->zbb:LzW6;

    return-object v0
.end method


# virtual methods
.method public final p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

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
    sget-object p1, LzW6;->zbb:LzW6;

    return-object p1

    :cond_1
    new-instance p1, LyW6;

    invoke-direct {p1, p3}, LyW6;-><init>(LxW6;)V

    return-object p1

    :cond_2
    new-instance p1, LzW6;

    invoke-direct {p1}, LzW6;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p2, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string p3, "zbd"

    aput-object p3, p1, p2

    sget-object p2, LzW6;->zbb:LzW6;

    const-string p3, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
