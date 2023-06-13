.class public final LF27;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:LF27;


# instance fields
.field private zbd:I

.field private zbe:I

.field private zbf:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LF27;

    invoke-direct {v0}, LF27;-><init>()V

    sput-object v0, LF27;->zbb:LF27;

    const-class v1, LF27;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, LF27;->zbe:I

    return-void
.end method

.method public static E()LA27;
    .locals 1

    sget-object v0, LF27;->zbb:LF27;

    invoke-virtual {v0}, Lfb7;->u()Lab7;

    move-result-object v0

    check-cast v0, LA27;

    return-object v0
.end method

.method public static synthetic F()LF27;
    .locals 1

    sget-object v0, LF27;->zbb:LF27;

    return-object v0
.end method

.method public static synthetic G(LF27;I)V
    .locals 1

    const/4 p1, 0x1

    iput p1, p0, LF27;->zbe:I

    iget v0, p0, LF27;->zbd:I

    or-int/2addr p1, v0

    iput p1, p0, LF27;->zbd:I

    return-void
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
    sget-object p1, LF27;->zbb:LF27;

    return-object p1

    :cond_1
    new-instance p1, LA27;

    invoke-direct {p1, p2}, LA27;-><init>(Ly27;)V

    return-object p1

    :cond_2
    new-instance p1, LF27;

    invoke-direct {p1}, LF27;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v2, "zbd"

    aput-object v2, p1, p3

    const-string p3, "zbe"

    aput-object p3, p1, p2

    sget-object p2, Lv57;->a:Ljb7;

    aput-object p2, p1, v1

    const-string p2, "zbf"

    aput-object p2, p1, v0

    sget-object p2, LF27;->zbb:LF27;

    const-string p3, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1007\u0001"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
