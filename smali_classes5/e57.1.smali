.class public final Le57;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:Le57;


# instance fields
.field private zbd:I

.field private zbe:Lkb7;

.field private zbf:LCa7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Le57;

    invoke-direct {v0}, Le57;-><init>()V

    sput-object v0, Le57;->zbb:Le57;

    const-class v1, Le57;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    invoke-static {}, Lfb7;->z()Lkb7;

    move-result-object v0

    iput-object v0, p0, Le57;->zbe:Lkb7;

    sget-object v0, LCa7;->c:LCa7;

    iput-object v0, p0, Le57;->zbf:LCa7;

    return-void
.end method

.method public static synthetic E()Le57;
    .locals 1

    sget-object v0, Le57;->zbb:Le57;

    return-object v0
.end method


# virtual methods
.method public final p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    if-eq p1, p3, :cond_2

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, Le57;->zbb:Le57;

    return-object p1

    :cond_1
    new-instance p1, Ld57;

    invoke-direct {p1, p3}, Ld57;-><init>(Lc57;)V

    return-object p1

    :cond_2
    new-instance p1, Le57;

    invoke-direct {p1}, Le57;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v1, "zbd"

    aput-object v1, p1, p3

    const-string p3, "zbe"

    aput-object p3, p1, p2

    const-string p2, "zbf"

    aput-object p2, p1, v0

    sget-object p2, Le57;->zbb:Le57;

    const-string p3, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001$\u0002\u100a\u0000"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
