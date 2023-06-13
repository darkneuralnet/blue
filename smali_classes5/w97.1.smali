.class public final Lw97;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:Lw97;


# instance fields
.field private zbd:I

.field private zbe:I

.field private zbf:Llb7;

.field private zbg:LH87;

.field private zbh:LH87;

.field private zbi:Ljava/lang/String;

.field private zbj:F

.field private zbk:Lob7;

.field private zbl:LH87;

.field private zbm:LH87;

.field private zbn:La97;

.field private zbo:Z

.field private zbp:LA97;

.field private zbq:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw97;

    invoke-direct {v0}, Lw97;-><init>()V

    sput-object v0, Lw97;->zbb:Lw97;

    const-class v1, Lw97;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lw97;->zbq:B

    invoke-static {}, Lfb7;->A()Llb7;

    move-result-object v0

    iput-object v0, p0, Lw97;->zbf:Llb7;

    const-string v0, ""

    iput-object v0, p0, Lw97;->zbi:Ljava/lang/String;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, Lw97;->zbk:Lob7;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lw97;->zbo:Z

    return-void
.end method

.method public static synthetic E()Lw97;
    .locals 1

    sget-object v0, Lw97;->zbb:Lw97;

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
    iput-byte p3, p0, Lw97;->zbq:B

    return-object v3

    :cond_1
    sget-object p1, Lw97;->zbb:Lw97;

    return-object p1

    :cond_2
    new-instance p1, Lv97;

    invoke-direct {p1, v3}, Lv97;-><init>(LF87;)V

    return-object p1

    :cond_3
    new-instance p1, Lw97;

    invoke-direct {p1}, Lw97;-><init>()V

    return-object p1

    :cond_4
    const/16 p1, 0xe

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zbd"

    aput-object p2, p1, v0

    const-string p2, "zbe"

    aput-object p2, p1, p3

    const-string p2, "zbg"

    aput-object p2, p1, v4

    const-string p2, "zbh"

    aput-object p2, p1, v3

    const-string p2, "zbi"

    aput-object p2, p1, v2

    const-string p2, "zbj"

    aput-object p2, p1, v1

    const/4 p2, 0x6

    const-string p3, "zbl"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zbm"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zbn"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zbo"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zbp"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zbk"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-class p3, LO87;

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zbf"

    aput-object p3, p1, p2

    sget-object p2, Lw97;->zbb:Lw97;

    const-string p3, "\u0001\u000c\u0000\u0001\u0001\u000c\u000c\u0000\u0002\u0008\u0001\u1504\u0000\u0002\u1509\u0001\u0003\u1409\u0002\u0004\u1008\u0003\u0005\u1001\u0004\u0006\u1409\u0005\u0007\u1409\u0006\u0008\u1409\u0007\t\u1007\u0008\n\u1409\t\u000b\u041b\u000c\u0016"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, Lw97;->zbq:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
