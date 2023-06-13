.class public final Lx87;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:Lx87;


# instance fields
.field private zbd:Lka7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx87;

    invoke-direct {v0}, Lx87;-><init>()V

    sput-object v0, Lx87;->zbb:Lx87;

    const-class v1, Lx87;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lfb7;-><init>()V

    return-void
.end method

.method public static synthetic E()Lx87;
    .locals 1

    sget-object v0, Lx87;->zbb:Lx87;

    return-object v0
.end method

.method public static F()Lx87;
    .locals 1

    sget-object v0, Lx87;->zbb:Lx87;

    return-object v0
.end method


# virtual methods
.method public final p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x2

    if-eq p1, p3, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, Lx87;->zbb:Lx87;

    return-object p1

    :cond_1
    new-instance p1, Lw87;

    invoke-direct {p1, p3}, Lw87;-><init>(Ls87;)V

    return-object p1

    :cond_2
    new-instance p1, Lx87;

    invoke-direct {p1}, Lx87;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p2, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string p3, "zbd"

    aput-object p3, p1, p2

    sget-object p2, Lx87;->zbb:Lx87;

    const-string p3, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
