.class public final Lc77;
.super Lcb7;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final zbd:Lc77;


# instance fields
.field private zbe:I

.field private zbf:Z

.field private zbg:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lc77;

    invoke-direct {v0}, Lc77;-><init>()V

    sput-object v0, Lc77;->zbd:Lc77;

    const-class v1, Lc77;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcb7;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lc77;->zbg:B

    const/4 v0, 0x1

    iput-boolean v0, p0, Lc77;->zbf:Z

    return-void
.end method

.method public static synthetic F()Lc77;
    .locals 1

    sget-object v0, Lc77;->zbd:Lc77;

    return-object v0
.end method


# virtual methods
.method public final p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_5

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x2

    if-eq p1, v1, :cond_4

    const/4 v1, 0x3

    if-eq p1, v1, :cond_3

    const/4 v1, 0x4

    const/4 v2, 0x0

    if-eq p1, v1, :cond_2

    const/4 v1, 0x5

    if-eq p1, v1, :cond_1

    if-nez p2, :cond_0

    move p3, v0

    :cond_0
    iput-byte p3, p0, Lc77;->zbg:B

    return-object v2

    :cond_1
    sget-object p1, Lc77;->zbd:Lc77;

    return-object p1

    :cond_2
    new-instance p1, Lb77;

    invoke-direct {p1, v2}, Lb77;-><init>(LY67;)V

    return-object p1

    :cond_3
    new-instance p1, Lc77;

    invoke-direct {p1}, Lc77;-><init>()V

    return-object p1

    :cond_4
    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "zbe"

    aput-object p2, p1, v0

    const-string p2, "zbf"

    aput-object p2, p1, p3

    sget-object p2, Lc77;->zbd:Lc77;

    const-string p3, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, Lc77;->zbg:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
