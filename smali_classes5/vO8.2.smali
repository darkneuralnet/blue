.class public final LvO8;
.super LQ58;
.source "SourceFile"


# static fields
.field private static final zzd:LvO8;


# instance fields
.field private zze:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LvO8;

    invoke-direct {v0}, LvO8;-><init>()V

    sput-object v0, LvO8;->zzd:LvO8;

    const-class v1, LvO8;

    invoke-static {v1, v0}, LV78;->w(Ljava/lang/Class;LV78;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, LQ58;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, LvO8;->zze:B

    return-void
.end method

.method public static synthetic I()LvO8;
    .locals 1

    sget-object v0, LvO8;->zzd:LvO8;

    return-object v0
.end method

.method public static J()LvO8;
    .locals 1

    sget-object v0, LvO8;->zzd:LvO8;

    return-object v0
.end method


# virtual methods
.method public final G(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    iput-byte p1, p0, LvO8;->zze:B

    return-object v0

    :cond_1
    sget-object p1, LvO8;->zzd:LvO8;

    return-object p1

    :cond_2
    new-instance p1, LjO8;

    invoke-direct {p1, v0}, LjO8;-><init>(LXN8;)V

    return-object p1

    :cond_3
    new-instance p1, LvO8;

    invoke-direct {p1}, LvO8;-><init>()V

    return-object p1

    :cond_4
    sget-object p1, LvO8;->zzd:LvO8;

    const-string p2, "\u0003\u0000"

    invoke-static {p1, p2, v0}, LV78;->t(Ldj8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LvO8;->zze:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
