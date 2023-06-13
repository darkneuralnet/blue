.class public final LYo6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/s;
.implements Landroidx/camera/core/impl/k;
.implements Lu36;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Ltp6;",
        ">",
        "Ljava/lang/Object;",
        "Landroidx/camera/core/impl/s<",
        "LUo6<",
        "TT;>;>;",
        "Landroidx/camera/core/impl/k;",
        "Lu36;"
    }
.end annotation


# static fields
.field public static final F:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Ltp6;",
            ">;"
        }
    .end annotation
.end field

.field public static final G:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "LxA1<",
            "Ldp6;",
            "Lhp6;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Landroidx/camera/core/impl/n;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "camerax.video.VideoCapture.videoOutput"

    const-class v1, Ltp6;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v0

    sput-object v0, LYo6;->F:Landroidx/camera/core/impl/f$a;

    const-string v0, "camerax.video.VideoCapture.videoEncoderInfoFinder"

    const-class v1, LxA1;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v0

    sput-object v0, LYo6;->G:Landroidx/camera/core/impl/f$a;

    return-void
.end method

.method public constructor <init>(Landroidx/camera/core/impl/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYo6;->E:Landroidx/camera/core/impl/n;

    return-void
.end method


# virtual methods
.method public B()Landroidx/camera/core/impl/f;
    .locals 1

    iget-object v0, p0, LYo6;->E:Landroidx/camera/core/impl/n;

    return-object v0
.end method

.method public R()LxA1;
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

    sget-object v0, LYo6;->G:Landroidx/camera/core/impl/f$a;

    invoke-interface {p0, v0}, Landroidx/camera/core/impl/p;->a(Landroidx/camera/core/impl/f$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LxA1;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, LxA1;

    return-object v0
.end method

.method public S()Ltp6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    sget-object v0, LYo6;->F:Landroidx/camera/core/impl/f$a;

    invoke-interface {p0, v0}, Landroidx/camera/core/impl/p;->a(Landroidx/camera/core/impl/f$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltp6;

    return-object v0
.end method

.method public l()I
    .locals 1

    const/16 v0, 0x22

    return v0
.end method
