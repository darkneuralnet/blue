.class public final Lf47;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:Lf47;


# instance fields
.field private zbd:I

.field private zbe:I

.field private zbf:Ljava/lang/Object;

.field private zbg:Z

.field private zbh:Lob7;

.field private zbi:J

.field private zbj:Lkb7;

.field private zbk:F

.field private zbl:F

.field private zbm:F

.field private zbn:F

.field private zbo:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf47;

    invoke-direct {v0}, Lf47;-><init>()V

    sput-object v0, Lf47;->zbb:Lf47;

    const-class v1, Lf47;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lf47;->zbe:I

    const/4 v0, 0x2

    iput-byte v0, p0, Lf47;->zbo:B

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, Lf47;->zbh:Lob7;

    invoke-static {}, Lfb7;->z()Lkb7;

    move-result-object v0

    iput-object v0, p0, Lf47;->zbj:Lkb7;

    const v0, 0x3e19999a    # 0.15f

    iput v0, p0, Lf47;->zbk:F

    return-void
.end method

.method public static synthetic E()Lf47;
    .locals 1

    sget-object v0, Lf47;->zbb:Lf47;

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
    iput-byte p3, p0, Lf47;->zbo:B

    return-object v3

    :cond_1
    sget-object p1, Lf47;->zbb:Lf47;

    return-object p1

    :cond_2
    new-instance p1, Le47;

    invoke-direct {p1, v3}, Le47;-><init>(Ld47;)V

    return-object p1

    :cond_3
    new-instance p1, Lf47;

    invoke-direct {p1}, Lf47;-><init>()V

    return-object p1

    :cond_4
    const/16 p1, 0xd

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zbf"

    aput-object p2, p1, v0

    const-string p2, "zbe"

    aput-object p2, p1, p3

    const-string p2, "zbd"

    aput-object p2, p1, v4

    const-class p2, LE47;

    aput-object p2, p1, v3

    const-string p2, "zbg"

    aput-object p2, p1, v2

    const-string p2, "zbh"

    aput-object p2, p1, v1

    const/4 p2, 0x6

    const-class p3, LW37;

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zbj"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zbk"

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

    const-string p3, "zbi"

    aput-object p3, p1, p2

    sget-object p2, Lf47;->zbb:Lf47;

    const-string p3, "\u0001\t\u0001\u0001\u0002\u000c\t\u0000\u0002\u0001\u0002\u043c\u0000\u0003\u1007\u0000\u0004\u001b\u0005\u0013\u0006\u1001\u0002\u0007\u1001\u0003\u0008\u1001\u0004\u000b\u1001\u0005\u000c\u1002\u0001"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, Lf47;->zbo:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
