.class public final Ll97;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:Ll97;


# instance fields
.field private zbd:I

.field private zbe:Z

.field private zbf:Z

.field private zbg:Z

.field private zbh:Z

.field private zbi:Z

.field private zbj:Z

.field private zbk:Z

.field private zbl:F

.field private zbm:Z

.field private zbn:Z

.field private zbo:Z

.field private zbp:Z

.field private zbq:I

.field private zbr:Z

.field private zbs:Lc97;

.field private zbt:Ls97;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll97;

    invoke-direct {v0}, Ll97;-><init>()V

    sput-object v0, Ll97;->zbb:Ll97;

    const-class v1, Ll97;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ll97;->zbh:Z

    return-void
.end method

.method public static synthetic E()Ll97;
    .locals 1

    sget-object v0, Ll97;->zbb:Ll97;

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
    sget-object p1, Ll97;->zbb:Ll97;

    return-object p1

    :cond_1
    new-instance p1, Lk97;

    invoke-direct {p1, p2}, Lk97;-><init>(LF87;)V

    return-object p1

    :cond_2
    new-instance p1, Ll97;

    invoke-direct {p1}, Ll97;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0x11

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

    const-string p2, "zbj"

    aput-object p2, p1, v0

    const-string p2, "zbk"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zbg"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zbh"

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

    const-string p3, "zbo"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zbp"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zbq"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zbr"

    aput-object p3, p1, p2

    const/16 p2, 0xf

    const-string p3, "zbs"

    aput-object p3, p1, p2

    const/16 p2, 0x10

    const-string p3, "zbt"

    aput-object p3, p1, p2

    sget-object p2, Ll97;->zbb:Ll97;

    const-string p3, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1007\u0004\u0004\u1007\u0005\u0005\u1007\u0006\u0006\u1007\u0002\u0007\u1007\u0003\u0008\u1001\u0007\t\u1007\u0008\n\u1007\t\u000b\u1007\n\u000c\u1007\u000b\r\u1004\u000c\u000e\u1007\r\u000f\u1009\u000e\u0010\u1009\u000f"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
