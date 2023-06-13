.class public final LX67;
.super Lcb7;
.source "SourceFile"


# static fields
.field private static final zbd:LX67;


# instance fields
.field private zbe:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LX67;

    invoke-direct {v0}, LX67;-><init>()V

    sput-object v0, LX67;->zbd:LX67;

    const-class v1, LX67;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcb7;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, LX67;->zbe:B

    return-void
.end method

.method public static synthetic F()LX67;
    .locals 1

    sget-object v0, LX67;->zbd:LX67;

    return-object v0
.end method


# virtual methods
.method public final p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_5

    const/4 p3, 0x2

    const/4 v0, 0x0

    if-eq p1, p3, :cond_4

    const/4 p3, 0x3

    if-eq p1, p3, :cond_3

    const/4 p3, 0x4

    if-eq p1, p3, :cond_2

    const/4 p3, 0x5

    if-eq p1, p3, :cond_1

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    iput-byte p1, p0, LX67;->zbe:B

    return-object v0

    :cond_1
    sget-object p1, LX67;->zbd:LX67;

    return-object p1

    :cond_2
    new-instance p1, LW67;

    invoke-direct {p1, v0}, LW67;-><init>(LT67;)V

    return-object p1

    :cond_3
    new-instance p1, LX67;

    invoke-direct {p1}, LX67;-><init>()V

    return-object p1

    :cond_4
    sget-object p1, LX67;->zbd:LX67;

    const-string p2, "\u0001\u0000"

    invoke-static {p1, p2, v0}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LX67;->zbe:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
