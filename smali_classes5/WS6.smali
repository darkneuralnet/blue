.class public final LWS6;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:LWS6;


# instance fields
.field private zbd:I

.field private zbe:Ljava/lang/String;

.field private zbf:Lkb7;

.field private zbg:Lkb7;

.field private zbh:Lob7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LWS6;

    invoke-direct {v0}, LWS6;-><init>()V

    sput-object v0, LWS6;->zbb:LWS6;

    const-class v1, LWS6;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LWS6;->zbe:Ljava/lang/String;

    invoke-static {}, Lfb7;->z()Lkb7;

    move-result-object v0

    iput-object v0, p0, LWS6;->zbf:Lkb7;

    invoke-static {}, Lfb7;->z()Lkb7;

    move-result-object v0

    iput-object v0, p0, LWS6;->zbg:Lkb7;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, LWS6;->zbh:Lob7;

    return-void
.end method

.method public static synthetic E()LWS6;
    .locals 1

    sget-object v0, LWS6;->zbb:LWS6;

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
    sget-object p1, LWS6;->zbb:LWS6;

    return-object p1

    :cond_1
    new-instance p1, LVS6;

    invoke-direct {p1, p2}, LVS6;-><init>(LPS6;)V

    return-object p1

    :cond_2
    new-instance p1, LWS6;

    invoke-direct {p1}, LWS6;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v3, "zbd"

    aput-object v3, p1, p3

    const-string p3, "zbe"

    aput-object p3, p1, p2

    const-string p2, "zbf"

    aput-object p2, p1, v2

    const-string p2, "zbg"

    aput-object p2, p1, v1

    const-string p2, "zbh"

    aput-object p2, p1, v0

    sget-object p2, LWS6;->zbb:LWS6;

    const-string p3, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u1008\u0000\u0002$\u0003$\u0004\u001a"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
