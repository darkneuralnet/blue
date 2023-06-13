.class public final LnA7;
.super Lbu7;
.source "SourceFile"


# static fields
.field private static final zze:LnA7;


# instance fields
.field private zzf:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LnA7;

    invoke-direct {v0}, LnA7;-><init>()V

    sput-object v0, LnA7;->zze:LnA7;

    const-class v1, LnA7;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lbu7;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, LnA7;->zzf:B

    return-void
.end method

.method public static synthetic E()LnA7;
    .locals 1

    sget-object v0, LnA7;->zze:LnA7;

    return-object v0
.end method


# virtual methods
.method public final B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_5

    const/4 p3, 0x2

    const/4 v0, 0x0

    if-eq p1, p3, :cond_4

    const/4 p3, 0x3

    if-eq p1, p3, :cond_3

    const/4 p3, 0x4

    if-eq p1, p3, :cond_2

    const/4 p3, 0x5

    if-eq p1, p3, :cond_1

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    iput-byte p1, p0, LnA7;->zzf:B

    return-object v0

    :cond_1
    sget-object p1, LnA7;->zze:LnA7;

    return-object p1

    :cond_2
    new-instance p1, Lwz7;

    invoke-direct {p1, v0}, Lwz7;-><init>(LIy7;)V

    return-object p1

    :cond_3
    new-instance p1, LnA7;

    invoke-direct {p1}, LnA7;-><init>()V

    return-object p1

    :cond_4
    sget-object p1, LnA7;->zze:LnA7;

    const-string p2, "\u0001\u0000"

    invoke-static {p1, p2, v0}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LnA7;->zzf:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
