.class public final LN97;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:LN97;


# instance fields
.field private zbd:I

.field private zbe:Ljava/lang/String;

.field private zbf:D

.field private zbg:Lob7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LN97;

    invoke-direct {v0}, LN97;-><init>()V

    sput-object v0, LN97;->zbb:LN97;

    const-class v1, LN97;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lfb7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LN97;->zbe:Ljava/lang/String;

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    iput-wide v0, p0, LN97;->zbf:D

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, LN97;->zbg:Lob7;

    return-void
.end method

.method public static synthetic E()LN97;
    .locals 1

    sget-object v0, LN97;->zbb:LN97;

    return-object v0
.end method


# virtual methods
.method public final p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x4

    const/4 v0, 0x3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_3

    if-eq p1, v0, :cond_2

    const/4 p2, 0x0

    if-eq p1, p3, :cond_1

    const/4 p3, 0x5

    if-eq p1, p3, :cond_0

    return-object p2

    :cond_0
    sget-object p1, LN97;->zbb:LN97;

    return-object p1

    :cond_1
    new-instance p1, LM97;

    invoke-direct {p1, p2}, LM97;-><init>(LL97;)V

    return-object p1

    :cond_2
    new-instance p1, LN97;

    invoke-direct {p1}, LN97;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v2, "zbd"

    aput-object v2, p1, p3

    const-string p3, "zbe"

    aput-object p3, p1, p2

    const-string p2, "zbf"

    aput-object p2, p1, v1

    const-string p2, "zbg"

    aput-object p2, p1, v0

    sget-object p2, LN97;->zbb:LN97;

    const-string p3, "\u0001\u0003\u0000\u0001\u0001\u000f\u0003\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1000\u0001\u000f\u001a"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
