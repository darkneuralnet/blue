.class public final LO67;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:LO67;


# instance fields
.field private zbd:I

.field private zbe:Ljava/lang/Object;

.field private zbf:Lob7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LO67;

    invoke-direct {v0}, LO67;-><init>()V

    sput-object v0, LO67;->zbb:LO67;

    const-class v1, LO67;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LO67;->zbd:I

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, LO67;->zbf:Lob7;

    return-void
.end method

.method public static synthetic E()LO67;
    .locals 1

    sget-object v0, LO67;->zbb:LO67;

    return-object v0
.end method


# virtual methods
.method public final p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

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
    sget-object p1, LO67;->zbb:LO67;

    return-object p1

    :cond_1
    new-instance p1, LN67;

    invoke-direct {p1, p2}, LN67;-><init>(LM67;)V

    return-object p1

    :cond_2
    new-instance p1, LO67;

    invoke-direct {p1}, LO67;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v3, "zbe"

    aput-object v3, p1, p3

    const-string p3, "zbd"

    aput-object p3, p1, p2

    const-class p2, LS67;

    aput-object p2, p1, v2

    const-string p2, "zbf"

    aput-object p2, p1, v1

    const-class p2, LO67;

    aput-object p2, p1, v0

    sget-object p2, LO67;->zbb:LO67;

    const-string p3, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001;\u0000\u00023\u0000\u0003<\u0000\u0004\u001b"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
