.class public final Lv87;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:Lv87;


# instance fields
.field private zbd:LNb7;

.field private zbe:Ljava/lang/String;

.field private zbf:Ljava/lang/String;

.field private zbg:Ljava/lang/String;

.field private zbh:Z

.field private zbi:Z

.field private zbj:Ljava/lang/String;

.field private zbk:Ljava/lang/String;

.field private zbl:Ljava/lang/String;

.field private zbm:Lob7;

.field private zbn:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv87;

    invoke-direct {v0}, Lv87;-><init>()V

    sput-object v0, Lv87;->zbb:Lv87;

    const-class v1, Lv87;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    invoke-static {}, LNb7;->d()LNb7;

    move-result-object v0

    iput-object v0, p0, Lv87;->zbd:LNb7;

    const-string v0, ""

    iput-object v0, p0, Lv87;->zbe:Ljava/lang/String;

    iput-object v0, p0, Lv87;->zbf:Ljava/lang/String;

    iput-object v0, p0, Lv87;->zbg:Ljava/lang/String;

    iput-object v0, p0, Lv87;->zbj:Ljava/lang/String;

    iput-object v0, p0, Lv87;->zbk:Ljava/lang/String;

    iput-object v0, p0, Lv87;->zbl:Ljava/lang/String;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, Lv87;->zbm:Lob7;

    return-void
.end method

.method public static E()Lt87;
    .locals 1

    sget-object v0, Lv87;->zbb:Lv87;

    invoke-virtual {v0}, Lfb7;->u()Lab7;

    move-result-object v0

    check-cast v0, Lt87;

    return-object v0
.end method

.method public static synthetic F()Lv87;
    .locals 1

    sget-object v0, Lv87;->zbb:Lv87;

    return-object v0
.end method

.method public static synthetic G(Lv87;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lv87;->zbe:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

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
    sget-object p1, Lv87;->zbb:Lv87;

    return-object p1

    :cond_1
    new-instance p1, Lt87;

    invoke-direct {p1, p2}, Lt87;-><init>(Ls87;)V

    return-object p1

    :cond_2
    new-instance p1, Lv87;

    invoke-direct {p1}, Lv87;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0xc

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zbd"

    aput-object v4, p1, v3

    sget-object v3, Lu87;->a:LMb7;

    aput-object v3, p1, p2

    const-string p2, "zbi"

    aput-object p2, p1, v2

    const-string p2, "zbe"

    aput-object p2, p1, v1

    const-string p2, "zbf"

    aput-object p2, p1, v0

    const-string p2, "zbj"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zbh"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zbk"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zbl"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zbm"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zbn"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zbg"

    aput-object p3, p1, p2

    sget-object p2, Lv87;->zbb:Lv87;

    const-string p3, "\u0000\u000b\u0000\u0000\u0001\r\u000b\u0001\u0001\u0000\u00012\u0004\u0007\u0005\u0208\u0006\u0208\u0007\u0208\u0008\u0007\t\u0208\n\u0208\u000b\u021a\u000c\u0007\r\u0208"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
