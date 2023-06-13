.class public LRU2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final h:Landroid/util/FloatProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/FloatProperty<",
            "LRU2;",
            ">;"
        }
    .end annotation
.end field

.field public static final i:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "LRU2;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final j:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "LRU2;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Lue;

.field public b:I

.field public c:Ljava/lang/String;

.field public d:F

.field public e:I

.field public f:F

.field public g:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LRU2$a;

    const-string v1, "timePosition"

    invoke-direct {v0, v1}, LRU2$a;-><init>(Ljava/lang/String;)V

    sput-object v0, LRU2;->h:Landroid/util/FloatProperty;

    new-instance v0, LRU2$b;

    const-string v1, "framePosition"

    invoke-direct {v0, v1}, LRU2$b;-><init>(Ljava/lang/String;)V

    sput-object v0, LRU2;->i:Landroid/util/Property;

    new-instance v0, LRU2$c;

    const-string v1, "fractionPosition"

    invoke-direct {v0, v1}, LRU2$c;-><init>(Ljava/lang/String;)V

    sput-object v0, LRU2;->j:Landroid/util/Property;

    return-void
.end method

.method public constructor <init>(Lue;Ljava/lang/String;IFI)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LRU2;->f:F

    const/4 v0, 0x0

    iput-boolean v0, p0, LRU2;->g:Z

    iput-object p1, p0, LRU2;->a:Lue;

    iput p3, p0, LRU2;->b:I

    iput-object p2, p0, LRU2;->c:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LRU2;->c:Ljava/lang/String;

    :cond_0
    iput p5, p0, LRU2;->e:I

    iput p4, p0, LRU2;->d:F

    return-void
.end method

.method public static a(FF)F
    .locals 0

    mul-float/2addr p0, p1

    return p0
.end method

.method public static b(II)F
    .locals 0

    int-to-float p0, p0

    int-to-float p1, p1

    div-float/2addr p0, p1

    return p0
.end method

.method public static q(FF)F
    .locals 0

    div-float/2addr p0, p1

    return p0
.end method

.method public static r(FI)I
    .locals 0

    int-to-float p1, p1

    mul-float/2addr p0, p1

    float-to-int p0, p0

    return p0
.end method


# virtual methods
.method public c()F
    .locals 1

    iget v0, p0, LRU2;->d:F

    return v0
.end method

.method public d(F)F
    .locals 1

    invoke-virtual {p0}, LRU2;->c()F

    move-result v0

    invoke-static {p1, v0}, LRU2;->q(FF)F

    move-result p1

    return p1
.end method

.method public e()F
    .locals 1

    invoke-virtual {p0}, LRU2;->k()F

    move-result v0

    invoke-virtual {p0, v0}, LRU2;->d(F)F

    move-result v0

    return v0
.end method

.method public f(F)I
    .locals 1

    invoke-virtual {p0}, LRU2;->h()I

    move-result v0

    invoke-static {p1, v0}, LRU2;->r(FI)I

    move-result p1

    return p1
.end method

.method public g()I
    .locals 1

    invoke-virtual {p0}, LRU2;->k()F

    move-result v0

    invoke-virtual {p0, v0}, LRU2;->f(F)I

    move-result v0

    return v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, LRU2;->e:I

    return v0
.end method

.method public i(F)F
    .locals 1

    invoke-virtual {p0}, LRU2;->c()F

    move-result v0

    invoke-static {p1, v0}, LRU2;->a(FF)F

    move-result p1

    return p1
.end method

.method public j(I)F
    .locals 1

    invoke-virtual {p0}, LRU2;->h()I

    move-result v0

    invoke-static {p1, v0}, LRU2;->b(II)F

    move-result p1

    return p1
.end method

.method public k()F
    .locals 1

    iget v0, p0, LRU2;->f:F

    return v0
.end method

.method public l()Z
    .locals 1

    iget-boolean v0, p0, LRU2;->g:Z

    return v0
.end method

.method public m(Z)V
    .locals 0

    iput-boolean p1, p0, LRU2;->g:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, LRU2;->a:Lue;

    invoke-interface {p1, p0}, Lue;->a(LRU2;)V

    :cond_0
    return-void
.end method

.method public n(F)V
    .locals 0

    invoke-virtual {p0, p1}, LRU2;->i(F)F

    move-result p1

    invoke-virtual {p0, p1}, LRU2;->p(F)V

    return-void
.end method

.method public o(I)V
    .locals 0

    invoke-virtual {p0, p1}, LRU2;->j(I)F

    move-result p1

    invoke-virtual {p0, p1}, LRU2;->p(F)V

    return-void
.end method

.method public p(F)V
    .locals 0

    iput p1, p0, LRU2;->f:F

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, LRU2;->m(Z)V

    return-void
.end method
