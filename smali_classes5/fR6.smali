.class public final LfR6;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:LfR6;


# instance fields
.field private zbd:I

.field private zbe:Lob7;

.field private zbf:Lm87;

.field private zbg:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LfR6;

    invoke-direct {v0}, LfR6;-><init>()V

    sput-object v0, LfR6;->zbb:LfR6;

    const-class v1, LfR6;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, LfR6;->zbg:B

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, LfR6;->zbe:Lob7;

    return-void
.end method

.method public static synthetic F()LfR6;
    .locals 1

    sget-object v0, LfR6;->zbb:LfR6;

    return-object v0
.end method

.method public static G()LfR6;
    .locals 1

    sget-object v0, LfR6;->zbb:LfR6;

    return-object v0
.end method


# virtual methods
.method public final E()Lm87;
    .locals 1

    iget-object v0, p0, LfR6;->zbf:Lm87;

    if-nez v0, :cond_0

    invoke-static {}, Lm87;->K()Lm87;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_5

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x4

    const/4 v2, 0x3

    const/4 v3, 0x2

    if-eq p1, v3, :cond_4

    if-eq p1, v2, :cond_3

    const/4 v2, 0x0

    if-eq p1, v1, :cond_2

    const/4 v1, 0x5

    if-eq p1, v1, :cond_1

    if-nez p2, :cond_0

    move p3, v0

    :cond_0
    iput-byte p3, p0, LfR6;->zbg:B

    return-object v2

    :cond_1
    sget-object p1, LfR6;->zbb:LfR6;

    return-object p1

    :cond_2
    new-instance p1, LeR6;

    invoke-direct {p1, v2}, LeR6;-><init>(LXQ6;)V

    return-object p1

    :cond_3
    new-instance p1, LfR6;

    invoke-direct {p1}, LfR6;-><init>()V

    return-object p1

    :cond_4
    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "zbd"

    aput-object p2, p1, v0

    const-string p2, "zbe"

    aput-object p2, p1, p3

    const-class p2, LaR6;

    aput-object p2, p1, v3

    const-string p2, "zbf"

    aput-object p2, p1, v2

    sget-object p2, LfR6;->zbb:LfR6;

    const-string p3, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001\u041b\u0002\u1409\u0000"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LfR6;->zbg:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
