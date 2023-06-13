.class public final La77;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final zbb:La77;


# instance fields
.field private zbd:I

.field private zbe:Ljava/lang/String;

.field private zbf:Lob7;

.field private zbg:Lob7;

.field private zbh:Lob7;

.field private zbi:Lob7;

.field private zbj:Lc77;

.field private zbk:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, La77;

    invoke-direct {v0}, La77;-><init>()V

    sput-object v0, La77;->zbb:La77;

    const-class v1, La77;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, La77;->zbk:B

    const-string v0, ""

    iput-object v0, p0, La77;->zbe:Ljava/lang/String;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, La77;->zbf:Lob7;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, La77;->zbg:Lob7;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, La77;->zbh:Lob7;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, La77;->zbi:Lob7;

    return-void
.end method

.method public static synthetic E()La77;
    .locals 1

    sget-object v0, La77;->zbb:La77;

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
    iput-byte p3, p0, La77;->zbk:B

    return-object v3

    :cond_1
    sget-object p1, La77;->zbb:La77;

    return-object p1

    :cond_2
    new-instance p1, LZ67;

    invoke-direct {p1, v3}, LZ67;-><init>(LY67;)V

    return-object p1

    :cond_3
    new-instance p1, La77;

    invoke-direct {p1}, La77;-><init>()V

    return-object p1

    :cond_4
    const/4 p1, 0x7

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zbd"

    aput-object p2, p1, v0

    const-string p2, "zbe"

    aput-object p2, p1, p3

    const-string p2, "zbf"

    aput-object p2, p1, v4

    const-string p2, "zbh"

    aput-object p2, p1, v3

    const-string p2, "zbj"

    aput-object p2, p1, v2

    const-string p2, "zbg"

    aput-object p2, p1, v1

    const/4 p2, 0x6

    const-string p3, "zbi"

    aput-object p3, p1, p2

    sget-object p2, La77;->zbb:La77;

    const-string p3, "\u0001\u0006\u0000\u0001\u0001\u03eb\u0006\u0000\u0004\u0001\u0001\u1008\u0000\u0002\u001a\u0003\u001a\u0004\u1409\u0001\u03ea\u001a\u03eb\u001a"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, La77;->zbk:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
