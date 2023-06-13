.class public final LGQ6;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:LGQ6;


# instance fields
.field private zbd:I

.field private zbe:Ljava/lang/String;

.field private zbf:I

.field private zbg:Ljava/lang/String;

.field private zbh:Z

.field private zbi:Ljava/lang/String;

.field private zbj:Lob7;

.field private zbk:Lob7;

.field private zbl:Lob7;

.field private zbm:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LGQ6;

    invoke-direct {v0}, LGQ6;-><init>()V

    sput-object v0, LGQ6;->zbb:LGQ6;

    const-class v1, LGQ6;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LGQ6;->zbe:Ljava/lang/String;

    iput-object v0, p0, LGQ6;->zbg:Ljava/lang/String;

    iput-object v0, p0, LGQ6;->zbi:Ljava/lang/String;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, LGQ6;->zbj:Lob7;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, LGQ6;->zbk:Lob7;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, LGQ6;->zbl:Lob7;

    return-void
.end method

.method public static synthetic E()LGQ6;
    .locals 1

    sget-object v0, LGQ6;->zbb:LGQ6;

    return-object v0
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
    sget-object p1, LGQ6;->zbb:LGQ6;

    return-object p1

    :cond_1
    new-instance p1, LFQ6;

    invoke-direct {p1, p2}, LFQ6;-><init>(LUc7;)V

    return-object p1

    :cond_2
    new-instance p1, LGQ6;

    invoke-direct {p1}, LGQ6;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0xb

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zbd"

    aput-object v4, p1, v3

    const-string v3, "zbe"

    aput-object v3, p1, p2

    const-string p2, "zbf"

    aput-object p2, p1, v2

    const-string p2, "zbj"

    aput-object p2, p1, v1

    const-string p2, "zbk"

    aput-object p2, p1, v0

    const-class p2, Lge7;

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zbg"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zbh"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zbi"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zbl"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zbm"

    aput-object p3, p1, p2

    sget-object p2, LGQ6;->zbb:LGQ6;

    const-string p3, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0003\u0000\u0001\u1008\u0000\u0002\u1004\u0001\u0003\u001a\u0004\u001b\u0006\u1008\u0002\u0007\u1007\u0003\u0008\u1008\u0004\t\u001a\n\u1004\u0005"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
