.class public LEW0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHl0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LEW0$g;,
        LEW0$k;,
        LEW0$e;,
        LEW0$i;,
        LEW0$f;,
        LEW0$h;,
        LEW0$j;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "LEl0;",
        ">",
        "Ljava/lang/Object;",
        "LHl0<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final ANIMATION_INTERP:Landroid/animation/TimeInterpolator;

.field private static final BUCKETS:[I

.field private static final SHOULD_ANIMATE:Z


# instance fields
.field private clusterColor:I

.field private mAnimate:Z

.field private mClickListener:LGl0$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGl0$b<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final mClusterManager:LGl0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGl0<",
            "TT;>;"
        }
    .end annotation
.end field

.field private mClusterToMarker:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "LDl0<",
            "TT;>;",
            "LfM2;",
            ">;"
        }
    .end annotation
.end field

.field private mClusters:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "+",
            "LDl0<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field private mColoredCircleBackground:Landroid/graphics/drawable/ShapeDrawable;

.field private final mDensity:F

.field private final mIconGenerator:LAP1;

.field private mIcons:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "LPT;",
            ">;"
        }
    .end annotation
.end field

.field private mInfoWindowClickListener:LGl0$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGl0$c<",
            "TT;>;"
        }
    .end annotation
.end field

.field private mItemClickListener:LGl0$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGl0$d<",
            "TT;>;"
        }
    .end annotation
.end field

.field private mItemInfoWindowClickListener:LGl0$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGl0$e<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final mMap:LcD1;

.field private mMarkerCache:LEW0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEW0$g<",
            "TT;>;"
        }
    .end annotation
.end field

.field private mMarkerToCluster:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "LfM2;",
            "LDl0<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field private mMarkers:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "LEW0$i;",
            ">;"
        }
    .end annotation
.end field

.field private mMinClusterSize:I

.field private final mViewModifier:LEW0$k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEW0<",
            "TT;>.k;"
        }
    .end annotation
.end field

.field private mZoom:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, LEW0;->SHOULD_ANIMATE:Z

    const/4 v0, 0x7

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, LEW0;->BUCKETS:[I

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    sput-object v0, LEW0;->ANIMATION_INTERP:Landroid/animation/TimeInterpolator;

    return-void

    nop

    :array_0
    .array-data 4
        0xa
        0x14
        0x32
        0x64
        0xc8
        0x1f4
        0x3e8
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;LcD1;LGl0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "LcD1;",
            "LGl0<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, LEW0;->mMarkers:Ljava/util/Set;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, LEW0;->mIcons:Landroid/util/SparseArray;

    new-instance v0, LEW0$g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LEW0$g;-><init>(LGW0;)V

    iput-object v0, p0, LEW0;->mMarkerCache:LEW0$g;

    const/4 v0, 0x4

    iput v0, p0, LEW0;->mMinClusterSize:I

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LEW0;->mMarkerToCluster:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LEW0;->mClusterToMarker:Ljava/util/Map;

    new-instance v0, LEW0$k;

    invoke-direct {v0, p0, v1}, LEW0$k;-><init>(LEW0;LKW0;)V

    iput-object v0, p0, LEW0;->mViewModifier:LEW0$k;

    iput-object p2, p0, LEW0;->mMap:LcD1;

    const/4 p2, 0x1

    iput-boolean p2, p0, LEW0;->mAnimate:Z

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    iput p2, p0, LEW0;->mDensity:F

    new-instance p2, LAP1;

    invoke-direct {p2, p1}, LAP1;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, LEW0;->mIconGenerator:LAP1;

    invoke-direct {p0, p1}, LEW0;->makeSquareTextView(Landroid/content/Context;)Lcom/google/maps/android/ui/SquareTextView;

    move-result-object v0

    invoke-virtual {p2, v0}, LAP1;->g(Landroid/view/View;)V

    sget v0, Lvl4;->amu_ClusterIcon_TextAppearance:I

    invoke-virtual {p2, v0}, LAP1;->i(I)V

    invoke-direct {p0}, LEW0;->makeClusterBackground()Landroid/graphics/drawable/LayerDrawable;

    move-result-object v0

    invoke-virtual {p2, v0}, LAP1;->e(Landroid/graphics/drawable/Drawable;)V

    iput-object p3, p0, LEW0;->mClusterManager:LGl0;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, LDf4;->brandAccent:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, LEW0;->clusterColor:I

    return-void
.end method

.method public static bridge synthetic a(LEW0;)Z
    .locals 0

    iget-boolean p0, p0, LEW0;->mAnimate:Z

    return p0
.end method

.method public static bridge synthetic b(LEW0;)LGl0$b;
    .locals 0

    iget-object p0, p0, LEW0;->mClickListener:LGl0$b;

    return-object p0
.end method

.method public static bridge synthetic c(LEW0;)LGl0;
    .locals 0

    iget-object p0, p0, LEW0;->mClusterManager:LGl0;

    return-object p0
.end method

.method public static bridge synthetic d(LEW0;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, LEW0;->mClusterToMarker:Ljava/util/Map;

    return-object p0
.end method

.method private static distanceSquared(LGW3;LGW3;)D
    .locals 6

    iget-wide v0, p0, LGW3;->a:D

    iget-wide v2, p1, LGW3;->a:D

    sub-double v4, v0, v2

    sub-double/2addr v0, v2

    mul-double/2addr v4, v0

    iget-wide v0, p0, LGW3;->b:D

    iget-wide p0, p1, LGW3;->b:D

    sub-double v2, v0, p0

    sub-double/2addr v0, p0

    mul-double/2addr v2, v0

    add-double/2addr v4, v2

    return-wide v4
.end method

.method public static bridge synthetic e(LEW0;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, LEW0;->mClusters:Ljava/util/Set;

    return-object p0
.end method

.method public static bridge synthetic f(LEW0;)LGl0$c;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method private static findClosestCluster(Ljava/util/List;LGW3;)LGW3;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LGW3;",
            ">;",
            "LGW3;",
            ")",
            "LGW3;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const-wide v1, 0x40c3880000000000L    # 10000.0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LGW3;

    invoke-static {v3, p1}, LEW0;->distanceSquared(LGW3;LGW3;)D

    move-result-wide v4

    cmpg-double v6, v4, v1

    if-gez v6, :cond_1

    move-object v0, v3

    move-wide v1, v4

    goto :goto_0

    :cond_2
    :goto_1
    return-object v0
.end method

.method public static bridge synthetic g(LEW0;)LGl0$d;
    .locals 0

    iget-object p0, p0, LEW0;->mItemClickListener:LGl0$d;

    return-object p0
.end method

.method public static bridge synthetic h(LEW0;)LGl0$e;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method public static bridge synthetic i(LEW0;)LcD1;
    .locals 0

    iget-object p0, p0, LEW0;->mMap:LcD1;

    return-object p0
.end method

.method public static bridge synthetic j(LEW0;)LEW0$g;
    .locals 0

    iget-object p0, p0, LEW0;->mMarkerCache:LEW0$g;

    return-object p0
.end method

.method public static bridge synthetic k(LEW0;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, LEW0;->mMarkerToCluster:Ljava/util/Map;

    return-object p0
.end method

.method public static bridge synthetic l(LEW0;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, LEW0;->mMarkers:Ljava/util/Set;

    return-object p0
.end method

.method public static bridge synthetic m(LEW0;)F
    .locals 0

    iget p0, p0, LEW0;->mZoom:F

    return p0
.end method

.method private makeClusterBackground()Landroid/graphics/drawable/LayerDrawable;
    .locals 9

    new-instance v0, Landroid/graphics/drawable/ShapeDrawable;

    new-instance v1, Landroid/graphics/drawable/shapes/OvalShape;

    invoke-direct {v1}, Landroid/graphics/drawable/shapes/OvalShape;-><init>()V

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    iput-object v0, p0, LEW0;->mColoredCircleBackground:Landroid/graphics/drawable/ShapeDrawable;

    new-instance v0, Landroid/graphics/drawable/ShapeDrawable;

    new-instance v1, Landroid/graphics/drawable/shapes/OvalShape;

    invoke-direct {v1}, Landroid/graphics/drawable/shapes/OvalShape;-><init>()V

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v1

    const v2, -0x7f000001

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    new-instance v1, Landroid/graphics/drawable/LayerDrawable;

    const/4 v2, 0x2

    new-array v2, v2, [Landroid/graphics/drawable/Drawable;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    iget-object v3, p0, LEW0;->mColoredCircleBackground:Landroid/graphics/drawable/ShapeDrawable;

    aput-object v3, v2, v0

    invoke-direct {v1, v2}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iget v0, p0, LEW0;->mDensity:F

    const/high16 v2, 0x40400000    # 3.0f

    mul-float/2addr v0, v2

    float-to-int v8, v0

    const/4 v4, 0x1

    move-object v3, v1

    move v5, v8

    move v6, v8

    move v7, v8

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/drawable/LayerDrawable;->setLayerInset(IIIII)V

    return-object v1
.end method

.method private makeSquareTextView(Landroid/content/Context;)Lcom/google/maps/android/ui/SquareTextView;
    .locals 2

    new-instance v0, Lcom/google/maps/android/ui/SquareTextView;

    invoke-direct {v0, p1}, Lcom/google/maps/android/ui/SquareTextView;-><init>(Landroid/content/Context;)V

    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {p1, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget p1, LKi4;->amu_text:I

    invoke-virtual {v0, p1}, Landroid/view/View;->setId(I)V

    const/high16 p1, 0x41400000    # 12.0f

    iget v1, p0, LEW0;->mDensity:F

    mul-float/2addr v1, p1

    float-to-int p1, v1

    invoke-virtual {v0, p1, p1, p1, p1}, Landroid/view/View;->setPadding(IIII)V

    return-object v0
.end method

.method public static bridge synthetic n(LEW0;Ljava/util/Set;)V
    .locals 0

    iput-object p1, p0, LEW0;->mClusters:Ljava/util/Set;

    return-void
.end method

.method public static bridge synthetic o(LEW0;Ljava/util/Set;)V
    .locals 0

    iput-object p1, p0, LEW0;->mMarkers:Ljava/util/Set;

    return-void
.end method

.method public static bridge synthetic p(LEW0;F)V
    .locals 0

    iput p1, p0, LEW0;->mZoom:F

    return-void
.end method

.method public static bridge synthetic q()Landroid/animation/TimeInterpolator;
    .locals 1

    sget-object v0, LEW0;->ANIMATION_INTERP:Landroid/animation/TimeInterpolator;

    return-object v0
.end method

.method public static bridge synthetic r()Z
    .locals 1

    sget-boolean v0, LEW0;->SHOULD_ANIMATE:Z

    return v0
.end method

.method public static bridge synthetic s(Ljava/util/List;LGW3;)LGW3;
    .locals 0

    invoke-static {p0, p1}, LEW0;->findClosestCluster(Ljava/util/List;LGW3;)LGW3;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public deselectItem(LEl0;LfM2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "LfM2;",
            ")V"
        }
    .end annotation

    return-void
.end method

.method public getBucket(LDl0;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDl0<",
            "TT;>;)I"
        }
    .end annotation

    invoke-interface {p1}, LDl0;->a()I

    move-result p1

    sget-object v0, LEW0;->BUCKETS:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    if-gt p1, v0, :cond_0

    return p1

    :cond_0
    :goto_0
    sget-object v0, LEW0;->BUCKETS:[I

    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_2

    add-int/lit8 v2, v1, 0x1

    aget v3, v0, v2

    if-ge p1, v3, :cond_1

    aget p1, v0, v1

    return p1

    :cond_1
    move v1, v2

    goto :goto_0

    :cond_2
    array-length p1, v0

    add-int/lit8 p1, p1, -0x1

    aget p1, v0, p1

    return p1
.end method

.method public getCluster(LfM2;)LDl0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LfM2;",
            ")",
            "LDl0<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, LEW0;->mMarkerToCluster:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LDl0;

    return-object p1
.end method

.method public getClusterItem(LfM2;)LEl0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LfM2;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, LEW0;->mMarkerCache:LEW0$g;

    invoke-virtual {v0, p1}, LEW0$g;->b(LfM2;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LEl0;

    return-object p1
.end method

.method public getClusterText(I)Ljava/lang/String;
    .locals 2

    sget-object v0, LEW0;->BUCKETS:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    if-ge p1, v0, :cond_0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "+"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getColor(I)I
    .locals 0

    iget p1, p0, LEW0;->clusterColor:I

    return p1
.end method

.method public getMarker(LDl0;)LfM2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDl0<",
            "TT;>;)",
            "LfM2;"
        }
    .end annotation

    iget-object v0, p0, LEW0;->mClusterToMarker:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LfM2;

    return-object p1
.end method

.method public getMarker(LEl0;)LfM2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "LfM2;"
        }
    .end annotation

    iget-object v0, p0, LEW0;->mMarkerCache:LEW0$g;

    invoke-virtual {v0, p1}, LEW0$g;->a(Ljava/lang/Object;)LfM2;

    move-result-object p1

    return-object p1
.end method

.method public getMinClusterSize()I
    .locals 1

    iget v0, p0, LEW0;->mMinClusterSize:I

    return v0
.end method

.method public onAdd()V
    .locals 2

    iget-object v0, p0, LEW0;->mClusterManager:LGl0;

    invoke-virtual {v0}, LGl0;->m()LlM2$a;

    move-result-object v0

    new-instance v1, LEW0$a;

    invoke-direct {v1, p0}, LEW0$a;-><init>(LEW0;)V

    invoke-virtual {v0, v1}, LlM2$a;->i(LcD1$l;)V

    iget-object v0, p0, LEW0;->mClusterManager:LGl0;

    invoke-virtual {v0}, LGl0;->m()LlM2$a;

    move-result-object v0

    new-instance v1, LEW0$b;

    invoke-direct {v1, p0}, LEW0$b;-><init>(LEW0;)V

    invoke-virtual {v0, v1}, LlM2$a;->h(LcD1$h;)V

    iget-object v0, p0, LEW0;->mClusterManager:LGl0;

    invoke-virtual {v0}, LGl0;->l()LlM2$a;

    move-result-object v0

    new-instance v1, LEW0$c;

    invoke-direct {v1, p0}, LEW0$c;-><init>(LEW0;)V

    invoke-virtual {v0, v1}, LlM2$a;->i(LcD1$l;)V

    iget-object v0, p0, LEW0;->mClusterManager:LGl0;

    invoke-virtual {v0}, LGl0;->l()LlM2$a;

    move-result-object v0

    new-instance v1, LEW0$d;

    invoke-direct {v1, p0}, LEW0$d;-><init>(LEW0;)V

    invoke-virtual {v0, v1}, LlM2$a;->h(LcD1$h;)V

    return-void
.end method

.method public onBeforeClusterItemRendered(LEl0;Lcom/google/android/gms/maps/model/MarkerOptions;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/android/gms/maps/model/MarkerOptions;",
            ")V"
        }
    .end annotation

    return-void
.end method

.method public onBeforeClusterRendered(LDl0;Lcom/google/android/gms/maps/model/MarkerOptions;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDl0<",
            "TT;>;",
            "Lcom/google/android/gms/maps/model/MarkerOptions;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0, p1}, LEW0;->getBucket(LDl0;)I

    move-result p1

    iget-object v0, p0, LEW0;->mIcons:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LPT;

    if-nez v0, :cond_0

    iget-object v0, p0, LEW0;->mColoredCircleBackground:Landroid/graphics/drawable/ShapeDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    invoke-virtual {p0, p1}, LEW0;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, LEW0;->mIconGenerator:LAP1;

    invoke-virtual {p0, p1}, LEW0;->getClusterText(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LAP1;->d(Ljava/lang/CharSequence;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, LQT;->a(Landroid/graphics/Bitmap;)LPT;

    move-result-object v0

    iget-object v1, p0, LEW0;->mIcons:Landroid/util/SparseArray;

    invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_0
    invoke-virtual {p2, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->N0(LPT;)Lcom/google/android/gms/maps/model/MarkerOptions;

    return-void
.end method

.method public onClusterItemRendered(LEl0;LfM2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "LfM2;",
            ")V"
        }
    .end annotation

    return-void
.end method

.method public onClusterRendered(LDl0;LfM2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDl0<",
            "TT;>;",
            "LfM2;",
            ")V"
        }
    .end annotation

    return-void
.end method

.method public onClustersChanged(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "LDl0<",
            "TT;>;>;)V"
        }
    .end annotation

    iget-object v0, p0, LEW0;->mViewModifier:LEW0$k;

    invoke-virtual {v0, p1}, LEW0$k;->a(Ljava/util/Set;)V

    return-void
.end method

.method public onRemove()V
    .locals 2

    iget-object v0, p0, LEW0;->mClusterManager:LGl0;

    invoke-virtual {v0}, LGl0;->m()LlM2$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LlM2$a;->i(LcD1$l;)V

    iget-object v0, p0, LEW0;->mClusterManager:LGl0;

    invoke-virtual {v0}, LGl0;->m()LlM2$a;

    move-result-object v0

    invoke-virtual {v0, v1}, LlM2$a;->h(LcD1$h;)V

    iget-object v0, p0, LEW0;->mClusterManager:LGl0;

    invoke-virtual {v0}, LGl0;->l()LlM2$a;

    move-result-object v0

    invoke-virtual {v0, v1}, LlM2$a;->i(LcD1$l;)V

    iget-object v0, p0, LEW0;->mClusterManager:LGl0;

    invoke-virtual {v0}, LGl0;->l()LlM2$a;

    move-result-object v0

    invoke-virtual {v0, v1}, LlM2$a;->h(LcD1$h;)V

    return-void
.end method

.method public renderMapMarkerState(LEl0;LfM2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "LfM2;",
            ")V"
        }
    .end annotation

    return-void
.end method

.method public selectItem(LEl0;LfM2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "LfM2;",
            ")V"
        }
    .end annotation

    return-void
.end method

.method public setAnimation(Z)V
    .locals 0

    iput-boolean p1, p0, LEW0;->mAnimate:Z

    return-void
.end method

.method public setMinClusterSize(I)V
    .locals 0

    iput p1, p0, LEW0;->mMinClusterSize:I

    return-void
.end method

.method public setOnClusterClickListener(LGl0$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGl0$b<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, LEW0;->mClickListener:LGl0$b;

    return-void
.end method

.method public setOnClusterInfoWindowClickListener(LGl0$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGl0$c<",
            "TT;>;)V"
        }
    .end annotation

    return-void
.end method

.method public setOnClusterItemClickListener(LGl0$d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGl0$d<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, LEW0;->mItemClickListener:LGl0$d;

    return-void
.end method

.method public setOnClusterItemInfoWindowClickListener(LGl0$e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGl0$e<",
            "TT;>;)V"
        }
    .end annotation

    return-void
.end method

.method public shouldRenderAsCluster(LDl0;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDl0<",
            "TT;>;)Z"
        }
    .end annotation

    invoke-interface {p1}, LDl0;->a()I

    move-result p1

    iget v0, p0, LEW0;->mMinClusterSize:I

    if-le p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public startMarkerAnimation()V
    .locals 0

    return-void
.end method
