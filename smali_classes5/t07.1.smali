.class public final Lt07;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:Lt07;


# instance fields
.field private zbd:I

.field private zbe:LpX6;

.field private zbf:LZ37;

.field private zbg:Ljava/lang/String;

.field private zbh:I

.field private zbi:F

.field private zbj:Lob7;

.field private zbk:Lob7;

.field private zbl:I

.field private zbm:LWc7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt07;

    invoke-direct {v0}, Lt07;-><init>()V

    sput-object v0, Lt07;->zbb:Lt07;

    const-class v1, Lt07;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lfb7;-><init>()V

    const-string v0, "en"

    iput-object v0, p0, Lt07;->zbg:Ljava/lang/String;

    const/4 v0, -0x1

    iput v0, p0, Lt07;->zbh:I

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v1

    iput-object v1, p0, Lt07;->zbj:Lob7;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v1

    iput-object v1, p0, Lt07;->zbk:Lob7;

    iput v0, p0, Lt07;->zbl:I

    return-void
.end method

.method public static synthetic E()Lt07;
    .locals 1

    sget-object v0, Lt07;->zbb:Lt07;

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
    sget-object p1, Lt07;->zbb:Lt07;

    return-object p1

    :cond_1
    new-instance p1, Lr07;

    invoke-direct {p1, p2}, Lr07;-><init>(Lp07;)V

    return-object p1

    :cond_2
    new-instance p1, Lt07;

    invoke-direct {p1}, Lt07;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0xa

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zbd"

    aput-object v4, p1, v3

    const-string v3, "zbf"

    aput-object v3, p1, p2

    const-string p2, "zbg"

    aput-object p2, p1, v2

    const-string p2, "zbh"

    aput-object p2, p1, v1

    const-string p2, "zbi"

    aput-object p2, p1, v0

    const-string p2, "zbj"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zbk"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zbl"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zbm"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zbe"

    aput-object p3, p1, p2

    sget-object p2, Lt07;->zbb:Lt07;

    const-string p3, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001\u1009\u0001\u0002\u1008\u0002\u0003\u1004\u0003\u0004\u1001\u0004\u0005\u001a\u0006\u001a\u0007\u1004\u0005\u0008\u1009\u0006\t\u1009\u0000"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
