.class public final Lg27;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# static fields
.field private static final zbb:Lg27;


# instance fields
.field private zbd:I

.field private zbe:I

.field private zbf:Ljava/lang/String;

.field private zbg:Lob7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lg27;

    invoke-direct {v0}, Lg27;-><init>()V

    sput-object v0, Lg27;->zbb:Lg27;

    const-class v1, Lg27;

    invoke-static {v1, v0}, Lfb7;->l(Ljava/lang/Class;Lfb7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lg27;->zbf:Ljava/lang/String;

    invoke-static {}, Lfb7;->C()Lob7;

    move-result-object v0

    iput-object v0, p0, Lg27;->zbg:Lob7;

    return-void
.end method

.method public static synthetic F()Lg27;
    .locals 1

    sget-object v0, Lg27;->zbb:Lg27;

    return-object v0
.end method

.method public static G([BLOa7;)Lg27;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuw;
        }
    .end annotation

    sget-object v0, Lg27;->zbb:Lg27;

    invoke-static {v0, p0, p1}, Lfb7;->y(Lfb7;[BLOa7;)Lfb7;

    move-result-object p0

    check-cast p0, Lg27;

    return-object p0
.end method


# virtual methods
.method public final E()I
    .locals 1

    iget v0, p0, Lg27;->zbe:I

    return v0
.end method

.method public final H()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg27;->zbf:Ljava/lang/String;

    return-object v0
.end method

.method public final I()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lg27;->zbg:Lob7;

    return-object v0
.end method

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
    sget-object p1, Lg27;->zbb:Lg27;

    return-object p1

    :cond_1
    new-instance p1, Le27;

    invoke-direct {p1, p2}, Le27;-><init>(Lc27;)V

    return-object p1

    :cond_2
    new-instance p1, Lg27;

    invoke-direct {p1}, Lg27;-><init>()V

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

    const-class p2, LiS6;

    aput-object p2, p1, v0

    sget-object p2, Lg27;->zbb:Lg27;

    const-string p3, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u001b"

    invoke-static {p2, p3, p1}, Lfb7;->c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method