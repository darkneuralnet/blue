.class public final Lew8;
.super LPb8;
.source "SourceFile"

# interfaces
.implements LYj8;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LPb8<",
        "Lew8;",
        "LQv8;",
        ">;",
        "LYj8;"
    }
.end annotation


# static fields
.field private static final zzb:Lew8;


# instance fields
.field private zzd:LQc8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LQc8<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lew8;

    invoke-direct {v0}, Lew8;-><init>()V

    sput-object v0, Lew8;->zzb:Lew8;

    const-class v1, Lew8;

    invoke-static {v1, v0}, LPb8;->g(Ljava/lang/Class;LPb8;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, LPb8;-><init>()V

    invoke-static {}, LPb8;->d()LQc8;

    move-result-object v0

    iput-object v0, p0, Lew8;->zzd:LQc8;

    return-void
.end method

.method public static synthetic i()Lew8;
    .locals 1

    sget-object v0, Lew8;->zzb:Lew8;

    return-object v0
.end method

.method public static j([B)Lew8;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/auth/zzew;
        }
    .end annotation

    sget-object v0, Lew8;->zzb:Lew8;

    invoke-static {v0, p0}, LPb8;->b(LPb8;[B)LPb8;

    move-result-object p0

    check-cast p0, Lew8;

    return-object p0
.end method


# virtual methods
.method public final h(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    sget-object p1, Lew8;->zzb:Lew8;

    return-object p1

    :cond_1
    new-instance p1, LQv8;

    invoke-direct {p1, p3}, LQv8;-><init>(LCv8;)V

    return-object p1

    :cond_2
    new-instance p1, Lew8;

    invoke-direct {p1}, Lew8;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p2, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string p3, "zzd"

    aput-object p3, p1, p2

    sget-object p2, Lew8;->zzb:Lew8;

    const-string p3, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a"

    invoke-static {p2, p3, p1}, LPb8;->f(LKj8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lew8;->zzd:LQc8;

    return-object v0
.end method
