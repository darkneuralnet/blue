.class public final LJR6;
.super Lcb7;
.source "SourceFile"


# static fields
.field private static final zbd:LJR6;


# instance fields
.field private zbe:I

.field private zbf:I

.field private zbg:I

.field private zbh:LoR6;

.field private zbi:Ljava/lang/String;

.field private zbj:I

.field private zbk:I

.field private zbl:Lob7;

.field private zbm:LsR6;

.field private zbn:Ljava/lang/String;

.field private zbo:Lob7;

.field private zbp:J

.field private zbq:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LJR6;

    invoke-direct {v0}, LJR6;-><init>()V

    sput-object v0, LJR6;->zbd:LJR6;

    const-class v1, LJR6;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcb7;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, LJR6;->zbq:B

    const-string v0, ""

    iput-object v0, p0, LJR6;->zbi:Ljava/lang/String;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v1

    iput-object v1, p0, LJR6;->zbl:Lob7;

    iput-object v0, p0, LJR6;->zbn:Ljava/lang/String;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, LJR6;->zbo:Lob7;

    return-void
.end method

.method public static synthetic F()LJR6;
    .locals 1

    sget-object v0, LJR6;->zbd:LJR6;

    return-object v0
.end method

.method public static G()LJR6;
    .locals 1

    sget-object v0, LJR6;->zbd:LJR6;

    return-object v0
.end method


# virtual methods
.method public final H()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LJR6;->zbl:Lob7;

    return-object v0
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
    iput-byte p3, p0, LJR6;->zbq:B

    return-object v3

    :cond_1
    sget-object p1, LJR6;->zbd:LJR6;

    return-object p1

    :cond_2
    new-instance p1, LIR6;

    invoke-direct {p1, v3}, LIR6;-><init>(LXQ6;)V

    return-object p1

    :cond_3
    new-instance p1, LJR6;

    invoke-direct {p1}, LJR6;-><init>()V

    return-object p1

    :cond_4
    const/16 p1, 0xd

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zbe"

    aput-object p2, p1, v0

    const-string p2, "zbf"

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

    const-string p3, "zbk"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zbl"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-class p3, LHR6;

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

    sget-object p2, LJR6;->zbd:LJR6;

    const-string p3, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\u0003\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1409\u0002\u0004\u1008\u0003\u0005\u1004\u0004\u0006\u1004\u0005\u0007\u041b\u0008\u1409\u0006\t\u1008\u0007\n\u001a\u000b\u1002\u0008"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LJR6;->zbq:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
