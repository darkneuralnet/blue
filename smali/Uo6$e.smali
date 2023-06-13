.class public final LUo6$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUo6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field public static final a:Ltp6;

.field public static final b:LYo6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYo6<",
            "*>;"
        }
    .end annotation
.end field

.field public static final c:LxA1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LxA1<",
            "Ldp6;",
            "Lhp6;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, LWo6;

    invoke-direct {v0}, LWo6;-><init>()V

    sput-object v0, LUo6$e;->a:Ltp6;

    invoke-static {}, LUo6$e;->b()LxA1;

    move-result-object v1

    sput-object v1, LUo6$e;->c:LxA1;

    new-instance v2, Landroid/util/Range;

    const/16 v3, 0x1e

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v2, v3, v3}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    sput-object v2, LUo6$e;->d:Landroid/util/Range;

    new-instance v2, LUo6$d;

    invoke-direct {v2, v0}, LUo6$d;-><init>(Ltp6;)V

    const/4 v0, 0x5

    invoke-virtual {v2, v0}, LUo6$d;->i(I)LUo6$d;

    move-result-object v0

    invoke-virtual {v0, v1}, LUo6$d;->n(LxA1;)LUo6$d;

    move-result-object v0

    invoke-virtual {v0}, LUo6$d;->h()LYo6;

    move-result-object v0

    sput-object v0, LUo6$e;->b:LYo6;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ldp6;)Lhp6;
    .locals 0

    invoke-static {p0}, LUo6$e;->d(Ldp6;)Lhp6;

    move-result-object p0

    return-object p0
.end method

.method public static b()LxA1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LxA1<",
            "Ldp6;",
            "Lhp6;",
            ">;"
        }
    .end annotation

    new-instance v0, LXo6;

    invoke-direct {v0}, LXo6;-><init>()V

    return-object v0
.end method

.method public static synthetic d(Ldp6;)Lhp6;
    .locals 2

    :try_start_0
    invoke-static {p0}, Lip6;->j(Ldp6;)Lip6;

    move-result-object p0
    :try_end_0
    .catch Landroidx/camera/video/internal/encoder/InvalidConfigException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-string v0, "VideoCapture"

    const-string v1, "Unable to find VideoEncoderInfo"

    invoke-static {v0, v1, p0}, LJx2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public c()LYo6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYo6<",
            "*>;"
        }
    .end annotation

    sget-object v0, LUo6$e;->b:LYo6;

    return-object v0
.end method
