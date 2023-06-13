.class public final Lx67;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:Lx67;


# instance fields
.field private zbd:Ljava/lang/String;

.field private zbe:Ljava/lang/String;

.field private zbf:Lob7;

.field private zbg:Lob7;

.field private zbh:Lob7;

.field private zbi:Lob7;

.field private zbj:Lt67;

.field private zbk:Lob7;

.field private zbl:I

.field private zbm:I

.field private zbn:Lm77;

.field private zbo:Lo77;

.field private zbp:Lob7;

.field private zbq:Ljava/lang/String;

.field private zbr:LI67;

.field private zbs:I

.field private zbt:Lob7;

.field private zbu:Lob7;

.field private zbv:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx67;

    invoke-direct {v0}, Lx67;-><init>()V

    sput-object v0, Lx67;->zbb:Lx67;

    const-class v1, Lx67;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lfb7;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lx67;->zbv:B

    const-string v0, ""

    iput-object v0, p0, Lx67;->zbd:Ljava/lang/String;

    iput-object v0, p0, Lx67;->zbe:Ljava/lang/String;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v1

    iput-object v1, p0, Lx67;->zbf:Lob7;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v1

    iput-object v1, p0, Lx67;->zbg:Lob7;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v1

    iput-object v1, p0, Lx67;->zbh:Lob7;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v1

    iput-object v1, p0, Lx67;->zbi:Lob7;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v1

    iput-object v1, p0, Lx67;->zbk:Lob7;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v1

    iput-object v1, p0, Lx67;->zbp:Lob7;

    iput-object v0, p0, Lx67;->zbq:Ljava/lang/String;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, Lx67;->zbt:Lob7;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, Lx67;->zbu:Lob7;

    return-void
.end method

.method public static synthetic E()Lx67;
    .locals 1

    sget-object v0, Lx67;->zbb:Lx67;

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
    iput-byte p3, p0, Lx67;->zbv:B

    return-object v3

    :cond_1
    sget-object p1, Lx67;->zbb:Lx67;

    return-object p1

    :cond_2
    new-instance p1, Lw67;

    invoke-direct {p1, v3}, Lw67;-><init>(Lu67;)V

    return-object p1

    :cond_3
    new-instance p1, Lx67;

    invoke-direct {p1}, Lx67;-><init>()V

    return-object p1

    :cond_4
    const/16 p1, 0x14

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zbd"

    aput-object p2, p1, v0

    const-string p2, "zbe"

    aput-object p2, p1, p3

    const-string p2, "zbf"

    aput-object p2, p1, v4

    const-string p2, "zbg"

    aput-object p2, p1, v3

    const-string p2, "zbh"

    aput-object p2, p1, v2

    const-string p2, "zbi"

    aput-object p2, p1, v1

    const/4 p2, 0x6

    const-string p3, "zbj"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zbk"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-class p3, Lka7;

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zbl"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zbm"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zbn"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zbo"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zbp"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-class p3, LG67;

    aput-object p3, p1, p2

    const/16 p2, 0xf

    const-string p3, "zbq"

    aput-object p3, p1, p2

    const/16 p2, 0x10

    const-string p3, "zbr"

    aput-object p3, p1, p2

    const/16 p2, 0x11

    const-string p3, "zbs"

    aput-object p3, p1, p2

    const/16 p2, 0x12

    const-string p3, "zbt"

    aput-object p3, p1, p2

    const/16 p2, 0x13

    const-string p3, "zbu"

    aput-object p3, p1, p2

    sget-object p2, Lx67;->zbb:Lx67;

    const-string p3, "\u0000\u0012\u0000\u0000\u0001\u03ed\u0012\u0000\u0008\u0003\u0001\u0208\u0002\u0208\u0003\u021a\u0004\u021a\u0005\u021a\u0006\u021a\u0007\u0409\u0008\u001b\t\u0004\n\u0004\u000b\u0409\u000c\u0409\r\u001b\u000e\u0208\u000f\t\u0010\u0004\u0011\u021a\u03ed\u021a"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, Lx67;->zbv:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
