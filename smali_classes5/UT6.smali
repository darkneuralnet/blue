.class public final LUT6;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:LUT6;


# instance fields
.field private zbd:I

.field private zbe:Ljava/lang/String;

.field private zbf:LCa7;

.field private zbg:LWT6;

.field private zbh:Ljava/lang/String;

.field private zbi:LCa7;

.field private zbj:LWT6;

.field private zbk:Ljava/lang/String;

.field private zbl:LCa7;

.field private zbm:LWT6;

.field private zbn:Ljava/lang/String;

.field private zbo:Ljava/lang/String;

.field private zbp:LWT6;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LUT6;

    invoke-direct {v0}, LUT6;-><init>()V

    sput-object v0, LUT6;->zbb:LUT6;

    const-class v1, LUT6;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lfb7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LUT6;->zbe:Ljava/lang/String;

    sget-object v1, LCa7;->c:LCa7;

    iput-object v1, p0, LUT6;->zbf:LCa7;

    iput-object v0, p0, LUT6;->zbh:Ljava/lang/String;

    iput-object v1, p0, LUT6;->zbi:LCa7;

    iput-object v0, p0, LUT6;->zbk:Ljava/lang/String;

    iput-object v1, p0, LUT6;->zbl:LCa7;

    iput-object v0, p0, LUT6;->zbn:Ljava/lang/String;

    iput-object v0, p0, LUT6;->zbo:Ljava/lang/String;

    return-void
.end method

.method public static synthetic E()LUT6;
    .locals 1

    sget-object v0, LUT6;->zbb:LUT6;

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
    sget-object p1, LUT6;->zbb:LUT6;

    return-object p1

    :cond_1
    new-instance p1, LTT6;

    invoke-direct {p1, p2}, LTT6;-><init>(LOT6;)V

    return-object p1

    :cond_2
    new-instance p1, LUT6;

    invoke-direct {p1}, LUT6;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0xd

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zbd"

    aput-object v4, p1, v3

    const-string v3, "zbe"

    aput-object v3, p1, p2

    const-string p2, "zbf"

    aput-object p2, p1, v2

    const-string p2, "zbi"

    aput-object p2, p1, v1

    const-string p2, "zbh"

    aput-object p2, p1, v0

    const-string p2, "zbk"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zbl"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zbn"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zbo"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zbg"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zbj"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zbm"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zbp"

    aput-object p3, p1, p2

    sget-object p2, LUT6;->zbb:LUT6;

    const-string p3, "\u0001\u000c\u0000\u0001\u0001\u000c\u000c\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100a\u0001\u0003\u100a\u0004\u0004\u1008\u0003\u0005\u1008\u0006\u0006\u100a\u0007\u0007\u1008\t\u0008\u1008\n\t\u1009\u0002\n\u1009\u0005\u000b\u1009\u0008\u000c\u1009\u000b"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
