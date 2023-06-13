.class public final LrI7;
.super Leu7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# static fields
.field private static final zzb:LrI7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LrI7;

    invoke-direct {v0}, LrI7;-><init>()V

    sput-object v0, LrI7;->zzb:LrI7;

    const-class v1, LrI7;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Leu7;-><init>()V

    return-void
.end method

.method public static synthetic D()LrI7;
    .locals 1

    sget-object v0, LrI7;->zzb:LrI7;

    return-object v0
.end method


# virtual methods
.method public final B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_4

    const/4 p2, 0x2

    const/4 p3, 0x0

    if-eq p1, p2, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    const/4 p2, 0x4

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, LrI7;->zzb:LrI7;

    return-object p1

    :cond_1
    new-instance p1, LqI7;

    invoke-direct {p1, p3}, LqI7;-><init>(LpI7;)V

    return-object p1

    :cond_2
    new-instance p1, LrI7;

    invoke-direct {p1}, LrI7;-><init>()V

    return-object p1

    :cond_3
    sget-object p1, LrI7;->zzb:LrI7;

    const-string p2, "\u0000\u0000"

    invoke-static {p1, p2, p3}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
