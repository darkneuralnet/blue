.class public LPE2;
.super LRd3$a;
.source "SourceFile"


# static fields
.field public static e:LRd3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LRd3<",
            "LPE2;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LPE2;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public c:F

.field public d:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LPE2;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, LPE2;-><init>(FF)V

    const/16 v1, 0x20

    invoke-static {v1, v0}, LRd3;->a(ILRd3$a;)LRd3;

    move-result-object v0

    sput-object v0, LPE2;->e:LRd3;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, LRd3;->g(F)V

    new-instance v0, LPE2$a;

    invoke-direct {v0}, LPE2$a;-><init>()V

    sput-object v0, LPE2;->f:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LRd3$a;-><init>()V

    return-void
.end method

.method public constructor <init>(FF)V
    .locals 0

    invoke-direct {p0}, LRd3$a;-><init>()V

    iput p1, p0, LPE2;->c:F

    iput p2, p0, LPE2;->d:F

    return-void
.end method

.method public static b()LPE2;
    .locals 1

    sget-object v0, LPE2;->e:LRd3;

    invoke-virtual {v0}, LRd3;->b()LRd3$a;

    move-result-object v0

    check-cast v0, LPE2;

    return-object v0
.end method

.method public static c(FF)LPE2;
    .locals 1

    sget-object v0, LPE2;->e:LRd3;

    invoke-virtual {v0}, LRd3;->b()LRd3$a;

    move-result-object v0

    check-cast v0, LPE2;

    iput p0, v0, LPE2;->c:F

    iput p1, v0, LPE2;->d:F

    return-object v0
.end method

.method public static d(LPE2;)LPE2;
    .locals 2

    sget-object v0, LPE2;->e:LRd3;

    invoke-virtual {v0}, LRd3;->b()LRd3$a;

    move-result-object v0

    check-cast v0, LPE2;

    iget v1, p0, LPE2;->c:F

    iput v1, v0, LPE2;->c:F

    iget p0, p0, LPE2;->d:F

    iput p0, v0, LPE2;->d:F

    return-object v0
.end method

.method public static f(LPE2;)V
    .locals 1

    sget-object v0, LPE2;->e:LRd3;

    invoke-virtual {v0, p0}, LRd3;->c(LRd3$a;)V

    return-void
.end method


# virtual methods
.method public a()LRd3$a;
    .locals 2

    new-instance v0, LPE2;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, LPE2;-><init>(FF)V

    return-object v0
.end method

.method public e(Landroid/os/Parcel;)V
    .locals 1

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, LPE2;->c:F

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result p1

    iput p1, p0, LPE2;->d:F

    return-void
.end method
