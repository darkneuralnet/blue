.class public Landroidx/constraintlayout/motion/widget/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/motion/widget/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/motion/widget/a$b$a;
    }
.end annotation


# instance fields
.field public a:I

.field public b:Z

.field public c:I

.field public d:I

.field public e:I

.field public f:Ljava/lang/String;

.field public g:I

.field public h:I

.field public i:F

.field public final j:Landroidx/constraintlayout/motion/widget/a;

.field public k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lnk2;",
            ">;"
        }
    .end annotation
.end field

.field public l:Landroidx/constraintlayout/motion/widget/b;

.field public m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/constraintlayout/motion/widget/a$b$a;",
            ">;"
        }
    .end annotation
.end field

.field public n:I

.field public o:Z

.field public p:I

.field public q:I

.field public r:I


# direct methods
.method public constructor <init>(ILandroidx/constraintlayout/motion/widget/a;II)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Landroidx/constraintlayout/motion/widget/a$b;->a:I

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/a$b;->b:Z

    iput v0, p0, Landroidx/constraintlayout/motion/widget/a$b;->c:I

    iput v0, p0, Landroidx/constraintlayout/motion/widget/a$b;->d:I

    iput v1, p0, Landroidx/constraintlayout/motion/widget/a$b;->e:I

    const/4 v2, 0x0

    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/a$b;->f:Ljava/lang/String;

    iput v0, p0, Landroidx/constraintlayout/motion/widget/a$b;->g:I

    const/16 v3, 0x190

    iput v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->h:I

    const/4 v3, 0x0

    iput v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->i:F

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->k:Ljava/util/ArrayList;

    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/a$b;->l:Landroidx/constraintlayout/motion/widget/b;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/a$b;->m:Ljava/util/ArrayList;

    iput v1, p0, Landroidx/constraintlayout/motion/widget/a$b;->n:I

    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/a$b;->o:Z

    iput v0, p0, Landroidx/constraintlayout/motion/widget/a$b;->p:I

    iput v1, p0, Landroidx/constraintlayout/motion/widget/a$b;->q:I

    iput v1, p0, Landroidx/constraintlayout/motion/widget/a$b;->r:I

    iput p1, p0, Landroidx/constraintlayout/motion/widget/a$b;->a:I

    iput-object p2, p0, Landroidx/constraintlayout/motion/widget/a$b;->j:Landroidx/constraintlayout/motion/widget/a;

    iput p3, p0, Landroidx/constraintlayout/motion/widget/a$b;->d:I

    iput p4, p0, Landroidx/constraintlayout/motion/widget/a$b;->c:I

    invoke-static {p2}, Landroidx/constraintlayout/motion/widget/a;->e(Landroidx/constraintlayout/motion/widget/a;)I

    move-result p1

    iput p1, p0, Landroidx/constraintlayout/motion/widget/a$b;->h:I

    invoke-static {p2}, Landroidx/constraintlayout/motion/widget/a;->a(Landroidx/constraintlayout/motion/widget/a;)I

    move-result p1

    iput p1, p0, Landroidx/constraintlayout/motion/widget/a$b;->q:I

    return-void
.end method

.method public constructor <init>(Landroidx/constraintlayout/motion/widget/a;Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Landroidx/constraintlayout/motion/widget/a$b;->a:I

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/a$b;->b:Z

    iput v0, p0, Landroidx/constraintlayout/motion/widget/a$b;->c:I

    iput v0, p0, Landroidx/constraintlayout/motion/widget/a$b;->d:I

    iput v1, p0, Landroidx/constraintlayout/motion/widget/a$b;->e:I

    const/4 v2, 0x0

    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/a$b;->f:Ljava/lang/String;

    iput v0, p0, Landroidx/constraintlayout/motion/widget/a$b;->g:I

    const/16 v3, 0x190

    iput v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->h:I

    const/4 v3, 0x0

    iput v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->i:F

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->k:Ljava/util/ArrayList;

    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/a$b;->l:Landroidx/constraintlayout/motion/widget/b;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/a$b;->m:Ljava/util/ArrayList;

    iput v1, p0, Landroidx/constraintlayout/motion/widget/a$b;->n:I

    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/a$b;->o:Z

    iput v0, p0, Landroidx/constraintlayout/motion/widget/a$b;->p:I

    iput v1, p0, Landroidx/constraintlayout/motion/widget/a$b;->q:I

    iput v1, p0, Landroidx/constraintlayout/motion/widget/a$b;->r:I

    invoke-static {p1}, Landroidx/constraintlayout/motion/widget/a;->e(Landroidx/constraintlayout/motion/widget/a;)I

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/motion/widget/a$b;->h:I

    invoke-static {p1}, Landroidx/constraintlayout/motion/widget/a;->a(Landroidx/constraintlayout/motion/widget/a;)I

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/motion/widget/a$b;->q:I

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/a$b;->j:Landroidx/constraintlayout/motion/widget/a;

    invoke-static {p3}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Landroidx/constraintlayout/motion/widget/a$b;->w(Landroidx/constraintlayout/motion/widget/a;Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroidx/constraintlayout/motion/widget/a;Landroidx/constraintlayout/motion/widget/a$b;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Landroidx/constraintlayout/motion/widget/a$b;->a:I

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/a$b;->b:Z

    iput v0, p0, Landroidx/constraintlayout/motion/widget/a$b;->c:I

    iput v0, p0, Landroidx/constraintlayout/motion/widget/a$b;->d:I

    iput v1, p0, Landroidx/constraintlayout/motion/widget/a$b;->e:I

    const/4 v2, 0x0

    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/a$b;->f:Ljava/lang/String;

    iput v0, p0, Landroidx/constraintlayout/motion/widget/a$b;->g:I

    const/16 v3, 0x190

    iput v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->h:I

    const/4 v3, 0x0

    iput v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->i:F

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->k:Ljava/util/ArrayList;

    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/a$b;->l:Landroidx/constraintlayout/motion/widget/b;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/a$b;->m:Ljava/util/ArrayList;

    iput v1, p0, Landroidx/constraintlayout/motion/widget/a$b;->n:I

    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/a$b;->o:Z

    iput v0, p0, Landroidx/constraintlayout/motion/widget/a$b;->p:I

    iput v1, p0, Landroidx/constraintlayout/motion/widget/a$b;->q:I

    iput v1, p0, Landroidx/constraintlayout/motion/widget/a$b;->r:I

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/a$b;->j:Landroidx/constraintlayout/motion/widget/a;

    invoke-static {p1}, Landroidx/constraintlayout/motion/widget/a;->e(Landroidx/constraintlayout/motion/widget/a;)I

    move-result p1

    iput p1, p0, Landroidx/constraintlayout/motion/widget/a$b;->h:I

    if-eqz p2, :cond_0

    iget p1, p2, Landroidx/constraintlayout/motion/widget/a$b;->p:I

    iput p1, p0, Landroidx/constraintlayout/motion/widget/a$b;->p:I

    iget p1, p2, Landroidx/constraintlayout/motion/widget/a$b;->e:I

    iput p1, p0, Landroidx/constraintlayout/motion/widget/a$b;->e:I

    iget-object p1, p2, Landroidx/constraintlayout/motion/widget/a$b;->f:Ljava/lang/String;

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/a$b;->f:Ljava/lang/String;

    iget p1, p2, Landroidx/constraintlayout/motion/widget/a$b;->g:I

    iput p1, p0, Landroidx/constraintlayout/motion/widget/a$b;->g:I

    iget p1, p2, Landroidx/constraintlayout/motion/widget/a$b;->h:I

    iput p1, p0, Landroidx/constraintlayout/motion/widget/a$b;->h:I

    iget-object p1, p2, Landroidx/constraintlayout/motion/widget/a$b;->k:Ljava/util/ArrayList;

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/a$b;->k:Ljava/util/ArrayList;

    iget p1, p2, Landroidx/constraintlayout/motion/widget/a$b;->i:F

    iput p1, p0, Landroidx/constraintlayout/motion/widget/a$b;->i:F

    iget p1, p2, Landroidx/constraintlayout/motion/widget/a$b;->q:I

    iput p1, p0, Landroidx/constraintlayout/motion/widget/a$b;->q:I

    :cond_0
    return-void
.end method

.method public static synthetic a(Landroidx/constraintlayout/motion/widget/a$b;)I
    .locals 0

    iget p0, p0, Landroidx/constraintlayout/motion/widget/a$b;->c:I

    return p0
.end method

.method public static synthetic b(Landroidx/constraintlayout/motion/widget/a$b;I)I
    .locals 0

    iput p1, p0, Landroidx/constraintlayout/motion/widget/a$b;->c:I

    return p1
.end method

.method public static synthetic c(Landroidx/constraintlayout/motion/widget/a$b;)I
    .locals 0

    iget p0, p0, Landroidx/constraintlayout/motion/widget/a$b;->d:I

    return p0
.end method

.method public static synthetic d(Landroidx/constraintlayout/motion/widget/a$b;I)I
    .locals 0

    iput p1, p0, Landroidx/constraintlayout/motion/widget/a$b;->d:I

    return p1
.end method

.method public static synthetic e(Landroidx/constraintlayout/motion/widget/a$b;)Z
    .locals 0

    iget-boolean p0, p0, Landroidx/constraintlayout/motion/widget/a$b;->b:Z

    return p0
.end method

.method public static synthetic f(Landroidx/constraintlayout/motion/widget/a$b;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/a$b;->k:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic g(Landroidx/constraintlayout/motion/widget/a$b;)I
    .locals 0

    iget p0, p0, Landroidx/constraintlayout/motion/widget/a$b;->e:I

    return p0
.end method

.method public static synthetic h(Landroidx/constraintlayout/motion/widget/a$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/a$b;->f:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic i(Landroidx/constraintlayout/motion/widget/a$b;)I
    .locals 0

    iget p0, p0, Landroidx/constraintlayout/motion/widget/a$b;->g:I

    return p0
.end method

.method public static synthetic j(Landroidx/constraintlayout/motion/widget/a$b;)I
    .locals 0

    iget p0, p0, Landroidx/constraintlayout/motion/widget/a$b;->h:I

    return p0
.end method

.method public static synthetic k(Landroidx/constraintlayout/motion/widget/a$b;)I
    .locals 0

    iget p0, p0, Landroidx/constraintlayout/motion/widget/a$b;->p:I

    return p0
.end method

.method public static synthetic l(Landroidx/constraintlayout/motion/widget/a$b;)Landroidx/constraintlayout/motion/widget/b;
    .locals 0

    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/a$b;->l:Landroidx/constraintlayout/motion/widget/b;

    return-object p0
.end method

.method public static synthetic m(Landroidx/constraintlayout/motion/widget/a$b;)F
    .locals 0

    iget p0, p0, Landroidx/constraintlayout/motion/widget/a$b;->i:F

    return p0
.end method

.method public static synthetic n(Landroidx/constraintlayout/motion/widget/a$b;Landroidx/constraintlayout/motion/widget/b;)Landroidx/constraintlayout/motion/widget/b;
    .locals 0

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/a$b;->l:Landroidx/constraintlayout/motion/widget/b;

    return-object p1
.end method

.method public static synthetic o(Landroidx/constraintlayout/motion/widget/a$b;)I
    .locals 0

    iget p0, p0, Landroidx/constraintlayout/motion/widget/a$b;->a:I

    return p0
.end method

.method public static synthetic p(Landroidx/constraintlayout/motion/widget/a$b;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/a$b;->m:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic q(Landroidx/constraintlayout/motion/widget/a$b;)Z
    .locals 0

    iget-boolean p0, p0, Landroidx/constraintlayout/motion/widget/a$b;->o:Z

    return p0
.end method

.method public static synthetic r(Landroidx/constraintlayout/motion/widget/a$b;)I
    .locals 0

    iget p0, p0, Landroidx/constraintlayout/motion/widget/a$b;->n:I

    return p0
.end method

.method public static synthetic s(Landroidx/constraintlayout/motion/widget/a$b;)Landroidx/constraintlayout/motion/widget/a;
    .locals 0

    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/a$b;->j:Landroidx/constraintlayout/motion/widget/a;

    return-object p0
.end method


# virtual methods
.method public A()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/motion/widget/a$b;->d:I

    return v0
.end method

.method public B()Landroidx/constraintlayout/motion/widget/b;
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/a$b;->l:Landroidx/constraintlayout/motion/widget/b;

    return-object v0
.end method

.method public C()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/constraintlayout/motion/widget/a$b;->o:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public D(I)Z
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/motion/widget/a$b;->r:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public E(I)V
    .locals 1

    const/16 v0, 0x8

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Landroidx/constraintlayout/motion/widget/a$b;->h:I

    return-void
.end method

.method public F(ILjava/lang/String;I)V
    .locals 0

    iput p1, p0, Landroidx/constraintlayout/motion/widget/a$b;->e:I

    iput-object p2, p0, Landroidx/constraintlayout/motion/widget/a$b;->f:Ljava/lang/String;

    iput p3, p0, Landroidx/constraintlayout/motion/widget/a$b;->g:I

    return-void
.end method

.method public G(I)V
    .locals 1

    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/a$b;->B()Landroidx/constraintlayout/motion/widget/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/constraintlayout/motion/widget/b;->y(I)V

    :cond_0
    return-void
.end method

.method public H(I)V
    .locals 0

    iput p1, p0, Landroidx/constraintlayout/motion/widget/a$b;->p:I

    return-void
.end method

.method public t(Lnk2;)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/a$b;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public u(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 2

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/a$b;->m:Ljava/util/ArrayList;

    new-instance v1, Landroidx/constraintlayout/motion/widget/a$b$a;

    invoke-direct {v1, p1, p0, p2}, Landroidx/constraintlayout/motion/widget/a$b$a;-><init>(Landroid/content/Context;Landroidx/constraintlayout/motion/widget/a$b;Lorg/xmlpull/v1/XmlPullParser;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final v(Landroidx/constraintlayout/motion/widget/a;Landroid/content/Context;Landroid/content/res/TypedArray;)V
    .locals 9

    invoke-virtual {p3}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x1

    const/4 v4, -0x1

    if-ge v2, v0, :cond_10

    invoke-virtual {p3, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v5

    sget v6, Lcm4;->Transition_constraintSetEnd:I

    const-string v7, "xml"

    const-string v8, "layout"

    if-ne v5, v6, :cond_1

    invoke-virtual {p3, v5, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->c:I

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    iget v4, p0, Landroidx/constraintlayout/motion/widget/a$b;->c:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    new-instance v3, Landroidx/constraintlayout/widget/b;

    invoke-direct {v3}, Landroidx/constraintlayout/widget/b;-><init>()V

    iget v4, p0, Landroidx/constraintlayout/motion/widget/a$b;->c:I

    invoke-virtual {v3, p2, v4}, Landroidx/constraintlayout/widget/b;->E(Landroid/content/Context;I)V

    invoke-static {p1}, Landroidx/constraintlayout/motion/widget/a;->b(Landroidx/constraintlayout/motion/widget/a;)Landroid/util/SparseArray;

    move-result-object v4

    iget v5, p0, Landroidx/constraintlayout/motion/widget/a$b;->c:I

    invoke-virtual {v4, v5, v3}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    iget v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->c:I

    invoke-static {p1, p2, v3}, Landroidx/constraintlayout/motion/widget/a;->c(Landroidx/constraintlayout/motion/widget/a;Landroid/content/Context;I)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->c:I

    goto/16 :goto_1

    :cond_1
    sget v6, Lcm4;->Transition_constraintSetStart:I

    if-ne v5, v6, :cond_3

    iget v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->d:I

    invoke-virtual {p3, v5, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->d:I

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    iget v4, p0, Landroidx/constraintlayout/motion/widget/a$b;->d:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    new-instance v3, Landroidx/constraintlayout/widget/b;

    invoke-direct {v3}, Landroidx/constraintlayout/widget/b;-><init>()V

    iget v4, p0, Landroidx/constraintlayout/motion/widget/a$b;->d:I

    invoke-virtual {v3, p2, v4}, Landroidx/constraintlayout/widget/b;->E(Landroid/content/Context;I)V

    invoke-static {p1}, Landroidx/constraintlayout/motion/widget/a;->b(Landroidx/constraintlayout/motion/widget/a;)Landroid/util/SparseArray;

    move-result-object v4

    iget v5, p0, Landroidx/constraintlayout/motion/widget/a$b;->d:I

    invoke-virtual {v4, v5, v3}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_2
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    iget v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->d:I

    invoke-static {p1, p2, v3}, Landroidx/constraintlayout/motion/widget/a;->c(Landroidx/constraintlayout/motion/widget/a;Landroid/content/Context;I)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->d:I

    goto/16 :goto_1

    :cond_3
    sget v6, Lcm4;->Transition_motionInterpolator:I

    if-ne v5, v6, :cond_7

    invoke-virtual {p3, v5}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v6

    iget v6, v6, Landroid/util/TypedValue;->type:I

    const/4 v7, -0x2

    if-ne v6, v3, :cond_4

    invoke-virtual {p3, v5, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->g:I

    if-eq v3, v4, :cond_f

    iput v7, p0, Landroidx/constraintlayout/motion/widget/a$b;->e:I

    goto/16 :goto_1

    :cond_4
    const/4 v3, 0x3

    if-ne v6, v3, :cond_6

    invoke-virtual {p3, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->f:Ljava/lang/String;

    if-eqz v3, :cond_f

    const-string v6, "/"

    invoke-virtual {v3, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    if-lez v3, :cond_5

    invoke-virtual {p3, v5, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->g:I

    iput v7, p0, Landroidx/constraintlayout/motion/widget/a$b;->e:I

    goto/16 :goto_1

    :cond_5
    iput v4, p0, Landroidx/constraintlayout/motion/widget/a$b;->e:I

    goto/16 :goto_1

    :cond_6
    iget v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->e:I

    invoke-virtual {p3, v5, v3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->e:I

    goto/16 :goto_1

    :cond_7
    sget v3, Lcm4;->Transition_duration:I

    if-ne v5, v3, :cond_8

    iget v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->h:I

    invoke-virtual {p3, v5, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->h:I

    const/16 v4, 0x8

    if-ge v3, v4, :cond_f

    iput v4, p0, Landroidx/constraintlayout/motion/widget/a$b;->h:I

    goto :goto_1

    :cond_8
    sget v3, Lcm4;->Transition_staggered:I

    if-ne v5, v3, :cond_9

    iget v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->i:F

    invoke-virtual {p3, v5, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->i:F

    goto :goto_1

    :cond_9
    sget v3, Lcm4;->Transition_autoTransition:I

    if-ne v5, v3, :cond_a

    iget v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->n:I

    invoke-virtual {p3, v5, v3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->n:I

    goto :goto_1

    :cond_a
    sget v3, Lcm4;->Transition_android_id:I

    if-ne v5, v3, :cond_b

    iget v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->a:I

    invoke-virtual {p3, v5, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->a:I

    goto :goto_1

    :cond_b
    sget v3, Lcm4;->Transition_transitionDisable:I

    if-ne v5, v3, :cond_c

    iget-boolean v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->o:Z

    invoke-virtual {p3, v5, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->o:Z

    goto :goto_1

    :cond_c
    sget v3, Lcm4;->Transition_pathMotionArc:I

    if-ne v5, v3, :cond_d

    invoke-virtual {p3, v5, v4}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->p:I

    goto :goto_1

    :cond_d
    sget v3, Lcm4;->Transition_layoutDuringTransition:I

    if-ne v5, v3, :cond_e

    invoke-virtual {p3, v5, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->q:I

    goto :goto_1

    :cond_e
    sget v3, Lcm4;->Transition_transitionFlags:I

    if-ne v5, v3, :cond_f

    invoke-virtual {p3, v5, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->r:I

    :cond_f
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_10
    iget p1, p0, Landroidx/constraintlayout/motion/widget/a$b;->d:I

    if-ne p1, v4, :cond_11

    iput-boolean v3, p0, Landroidx/constraintlayout/motion/widget/a$b;->b:Z

    :cond_11
    return-void
.end method

.method public final w(Landroidx/constraintlayout/motion/widget/a;Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    sget-object v0, Lcm4;->Transition:[I

    invoke-virtual {p2, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Landroidx/constraintlayout/motion/widget/a$b;->v(Landroidx/constraintlayout/motion/widget/a;Landroid/content/Context;Landroid/content/res/TypedArray;)V

    invoke-virtual {p3}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public x()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/motion/widget/a$b;->n:I

    return v0
.end method

.method public y()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/motion/widget/a$b;->c:I

    return v0
.end method

.method public z()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/motion/widget/a$b;->q:I

    return v0
.end method
