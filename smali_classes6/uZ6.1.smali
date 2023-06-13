.class public final LuZ6;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:LuZ6;


# instance fields
.field private zbd:I

.field private zbe:I

.field private zbf:Ljava/lang/Object;

.field private zbg:LW07;

.field private zbh:Z

.field private zbi:Lh37;

.field private zbj:LF27;

.field private zbk:Lu07;

.field private zbl:I

.field private zbm:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LuZ6;

    invoke-direct {v0}, LuZ6;-><init>()V

    sput-object v0, LuZ6;->zbb:LuZ6;

    const-class v1, LuZ6;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LuZ6;->zbe:I

    const/4 v0, 0x2

    iput-byte v0, p0, LuZ6;->zbm:B

    return-void
.end method

.method public static F()LoZ6;
    .locals 1

    sget-object v0, LuZ6;->zbb:LuZ6;

    invoke-virtual {v0}, Lfb7;->u()Lab7;

    move-result-object v0

    check-cast v0, LoZ6;

    return-object v0
.end method

.method public static synthetic G()LuZ6;
    .locals 1

    sget-object v0, LuZ6;->zbb:LuZ6;

    return-object v0
.end method

.method public static synthetic H(LuZ6;LF27;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LuZ6;->zbj:LF27;

    iget p1, p0, LuZ6;->zbd:I

    or-int/lit8 p1, p1, 0x8

    iput p1, p0, LuZ6;->zbd:I

    return-void
.end method

.method public static synthetic I(LuZ6;LW07;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LuZ6;->zbg:LW07;

    iget p1, p0, LuZ6;->zbd:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, LuZ6;->zbd:I

    return-void
.end method


# virtual methods
.method public final E()I
    .locals 1

    iget v0, p0, LuZ6;->zbl:I

    return v0
.end method

.method public final J()Z
    .locals 2

    iget v0, p0, LuZ6;->zbe:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LuZ6;->zbf:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final K()Z
    .locals 2

    iget v0, p0, LuZ6;->zbe:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LuZ6;->zbf:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final L()Z
    .locals 1

    iget v0, p0, LuZ6;->zbd:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

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
    iput-byte p3, p0, LuZ6;->zbm:B

    return-object v3

    :cond_1
    sget-object p1, LuZ6;->zbb:LuZ6;

    return-object p1

    :cond_2
    new-instance p1, LoZ6;

    invoke-direct {p1, v3}, LoZ6;-><init>(LmZ6;)V

    return-object p1

    :cond_3
    new-instance p1, LuZ6;

    invoke-direct {p1}, LuZ6;-><init>()V

    return-object p1

    :cond_4
    const/16 p1, 0x9

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zbf"

    aput-object p2, p1, v0

    const-string p2, "zbe"

    aput-object p2, p1, p3

    const-string p2, "zbd"

    aput-object p2, p1, v4

    const-string p2, "zbg"

    aput-object p2, p1, v3

    const-string p2, "zbh"

    aput-object p2, p1, v2

    const-string p2, "zbj"

    aput-object p2, p1, v1

    const/4 p2, 0x6

    const-string p3, "zbi"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zbk"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zbl"

    aput-object p3, p1, p2

    sget-object p2, LuZ6;->zbb:LuZ6;

    const-string p3, "\u0001\u0008\u0001\u0001\u0001\u0008\u0008\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1007\u0001\u0003\u1009\u0003\u0004\u1009\u0002\u0005:\u0000\u0006:\u0000\u0007\u1009\u0004\u0008\u1004\u0005"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LuZ6;->zbm:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
