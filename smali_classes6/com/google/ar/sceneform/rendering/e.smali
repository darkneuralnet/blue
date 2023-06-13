.class public Lcom/google/ar/sceneform/rendering/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/ar/sceneform/rendering/e$b;,
        Lcom/google/ar/sceneform/rendering/e$c;
    }
.end annotation


# static fields
.field public static final c:LjN2;


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/ar/sceneform/rendering/h;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/ar/sceneform/rendering/e$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LjN2;

    invoke-direct {v0}, LjN2;-><init>()V

    sput-object v0, Lcom/google/ar/sceneform/rendering/e;->c:LjN2;

    return-void
.end method

.method public constructor <init>(Lcom/google/ar/sceneform/rendering/e$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/ar/sceneform/rendering/e$b;->a(Lcom/google/ar/sceneform/rendering/e$b;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LDZ3;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/e;->a:Ljava/util/List;

    invoke-static {p1}, Lcom/google/ar/sceneform/rendering/e$b;->b(Lcom/google/ar/sceneform/rendering/e$b;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LDZ3;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/e;->b:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/ar/sceneform/rendering/e$b;Lcom/google/ar/sceneform/rendering/e$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/ar/sceneform/rendering/e;-><init>(Lcom/google/ar/sceneform/rendering/e$b;)V

    return-void
.end method

.method public static a(Lqm0;Ljava/nio/FloatBuffer;)V
    .locals 1

    iget v0, p0, Lqm0;->a:F

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget v0, p0, Lqm0;->b:F

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget v0, p0, Lqm0;->c:F

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget p0, p0, Lqm0;->d:F

    invoke-virtual {p1, p0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    return-void
.end method

.method public static b(LVc4;Ljava/nio/FloatBuffer;)V
    .locals 1

    iget v0, p0, LVc4;->a:F

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget v0, p0, LVc4;->b:F

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget v0, p0, LVc4;->c:F

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget p0, p0, LVc4;->d:F

    invoke-virtual {p1, p0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    return-void
.end method

.method public static c(LQj6;Ljava/nio/FloatBuffer;)V
    .locals 1

    iget v0, p0, LQj6;->a:F

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget v0, p0, LQj6;->b:F

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget p0, p0, LQj6;->c:F

    invoke-virtual {p1, p0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    return-void
.end method

.method public static g()Lcom/google/ar/sceneform/rendering/e$b;
    .locals 1

    new-instance v0, Lcom/google/ar/sceneform/rendering/e$b;

    invoke-direct {v0}, Lcom/google/ar/sceneform/rendering/e$b;-><init>()V

    return-object v0
.end method

.method public static h(ILjava/util/EnumSet;)Lcom/google/android/filament/VertexBuffer;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/EnumSet<",
            "Lcom/google/android/filament/VertexBuffer$VertexAttribute;",
            ">;)",
            "Lcom/google/android/filament/VertexBuffer;"
        }
    .end annotation

    new-instance v6, Lcom/google/android/filament/VertexBuffer$Builder;

    invoke-direct {v6}, Lcom/google/android/filament/VertexBuffer$Builder;-><init>()V

    invoke-virtual {v6, p0}, Lcom/google/android/filament/VertexBuffer$Builder;->vertexCount(I)Lcom/google/android/filament/VertexBuffer$Builder;

    move-result-object p0

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/filament/VertexBuffer$Builder;->bufferCount(I)Lcom/google/android/filament/VertexBuffer$Builder;

    sget-object v1, Lcom/google/android/filament/VertexBuffer$VertexAttribute;->POSITION:Lcom/google/android/filament/VertexBuffer$VertexAttribute;

    sget-object v3, Lcom/google/android/filament/VertexBuffer$AttributeType;->FLOAT3:Lcom/google/android/filament/VertexBuffer$AttributeType;

    const/4 v4, 0x0

    const/16 v5, 0xc

    const/4 v2, 0x0

    move-object v0, v6

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/filament/VertexBuffer$Builder;->attribute(Lcom/google/android/filament/VertexBuffer$VertexAttribute;ILcom/google/android/filament/VertexBuffer$AttributeType;II)Lcom/google/android/filament/VertexBuffer$Builder;

    sget-object v1, Lcom/google/android/filament/VertexBuffer$VertexAttribute;->TANGENTS:Lcom/google/android/filament/VertexBuffer$VertexAttribute;

    invoke-virtual {p1, v1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    sget-object v3, Lcom/google/android/filament/VertexBuffer$AttributeType;->FLOAT4:Lcom/google/android/filament/VertexBuffer$AttributeType;

    const/4 v4, 0x0

    const/16 v5, 0x10

    move-object v0, v6

    move v2, p0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/filament/VertexBuffer$Builder;->attribute(Lcom/google/android/filament/VertexBuffer$VertexAttribute;ILcom/google/android/filament/VertexBuffer$AttributeType;II)Lcom/google/android/filament/VertexBuffer$Builder;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    sget-object v1, Lcom/google/android/filament/VertexBuffer$VertexAttribute;->UV0:Lcom/google/android/filament/VertexBuffer$VertexAttribute;

    invoke-virtual {p1, v1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    add-int/lit8 p0, p0, 0x1

    sget-object v3, Lcom/google/android/filament/VertexBuffer$AttributeType;->FLOAT2:Lcom/google/android/filament/VertexBuffer$AttributeType;

    const/4 v4, 0x0

    const/16 v5, 0x8

    move-object v0, v6

    move v2, p0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/filament/VertexBuffer$Builder;->attribute(Lcom/google/android/filament/VertexBuffer$VertexAttribute;ILcom/google/android/filament/VertexBuffer$AttributeType;II)Lcom/google/android/filament/VertexBuffer$Builder;

    :cond_1
    sget-object v1, Lcom/google/android/filament/VertexBuffer$VertexAttribute;->COLOR:Lcom/google/android/filament/VertexBuffer$VertexAttribute;

    invoke-virtual {p1, v1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    add-int/lit8 v2, p0, 0x1

    sget-object v3, Lcom/google/android/filament/VertexBuffer$AttributeType;->FLOAT4:Lcom/google/android/filament/VertexBuffer$AttributeType;

    const/4 v4, 0x0

    const/16 v5, 0x10

    move-object v0, v6

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/filament/VertexBuffer$Builder;->attribute(Lcom/google/android/filament/VertexBuffer$VertexAttribute;ILcom/google/android/filament/VertexBuffer$AttributeType;II)Lcom/google/android/filament/VertexBuffer$Builder;

    :cond_2
    invoke-static {v6}, LHo6;->a(Lcom/google/android/filament/VertexBuffer$Builder;)Lcom/google/android/filament/VertexBuffer;

    move-result-object p0

    return-object p0
.end method

.method public static j(LQj6;)LVc4;
    .locals 7

    invoke-static {}, LQj6;->w()LQj6;

    move-result-object v0

    invoke-static {v0, p0}, LQj6;->c(LQj6;LQj6;)LQj6;

    move-result-object v0

    invoke-static {v0, v0}, LQj6;->d(LQj6;LQj6;)F

    move-result v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, LXM2;->a(FF)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, LQj6;->l()LQj6;

    move-result-object v0

    invoke-static {p0, v0}, LQj6;->c(LQj6;LQj6;)LQj6;

    move-result-object v0

    invoke-virtual {v0}, LQj6;->j()LQj6;

    move-result-object v0

    invoke-static {v0, p0}, LQj6;->c(LQj6;LQj6;)LQj6;

    move-result-object v1

    invoke-virtual {v1}, LQj6;->j()LQj6;

    move-result-object v1

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LQj6;->j()LQj6;

    move-result-object v1

    invoke-virtual {v0, v1}, LQj6;->o(LQj6;)V

    invoke-static {p0, v0}, LQj6;->c(LQj6;LQj6;)LQj6;

    move-result-object v1

    invoke-virtual {v1}, LQj6;->j()LQj6;

    move-result-object v1

    :goto_0
    sget-object v2, Lcom/google/ar/sceneform/rendering/e;->c:LjN2;

    iget-object v3, v2, LjN2;->a:[F

    iget v4, v0, LQj6;->a:F

    const/4 v5, 0x0

    aput v4, v3, v5

    const/4 v4, 0x1

    iget v5, v0, LQj6;->b:F

    aput v5, v3, v4

    const/4 v4, 0x2

    iget v0, v0, LQj6;->c:F

    aput v0, v3, v4

    iget v0, v1, LQj6;->a:F

    const/4 v4, 0x4

    aput v0, v3, v4

    const/4 v0, 0x5

    iget v4, v1, LQj6;->b:F

    aput v4, v3, v0

    const/4 v0, 0x6

    iget v1, v1, LQj6;->c:F

    aput v1, v3, v0

    iget v0, p0, LQj6;->a:F

    const/16 v1, 0x8

    aput v0, v3, v1

    const/16 v0, 0x9

    iget v1, p0, LQj6;->b:F

    aput v1, v3, v0

    const/16 v0, 0xa

    iget p0, p0, LQj6;->c:F

    aput p0, v3, v0

    new-instance p0, LVc4;

    invoke-direct {p0}, LVc4;-><init>()V

    invoke-virtual {v2, p0}, LjN2;->a(LVc4;)V

    return-object p0
.end method


# virtual methods
.method public d(Lcom/google/ar/sceneform/rendering/a;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/ar/sceneform/rendering/a;",
            "Ljava/util/ArrayList<",
            "Lcom/google/android/filament/MaterialInstance;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lzd;->c()V

    invoke-virtual {p0, p1}, Lcom/google/ar/sceneform/rendering/e;->e(Lcom/google/ar/sceneform/rendering/a;)V

    invoke-virtual {p0, p1}, Lcom/google/ar/sceneform/rendering/e;->f(Lcom/google/ar/sceneform/rendering/a;)V

    invoke-virtual {p2}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {p3}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lcom/google/ar/sceneform/rendering/e;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_2

    iget-object v2, p0, Lcom/google/ar/sceneform/rendering/e;->b:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/ar/sceneform/rendering/e$c;

    invoke-interface {p1}, Lcom/google/ar/sceneform/rendering/a;->j()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v0, v3, :cond_0

    invoke-interface {p1}, Lcom/google/ar/sceneform/rendering/a;->j()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/ar/sceneform/rendering/f$a;

    goto :goto_1

    :cond_0
    new-instance v3, Lcom/google/ar/sceneform/rendering/f$a;

    invoke-direct {v3}, Lcom/google/ar/sceneform/rendering/f$a;-><init>()V

    invoke-interface {p1}, Lcom/google/ar/sceneform/rendering/a;->j()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    iput v1, v3, Lcom/google/ar/sceneform/rendering/f$a;->a:I

    invoke-virtual {v2}, Lcom/google/ar/sceneform/rendering/e$c;->d()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    add-int/2addr v1, v4

    iput v1, v3, Lcom/google/ar/sceneform/rendering/f$a;->b:I

    invoke-virtual {v2}, Lcom/google/ar/sceneform/rendering/e$c;->b()Lcom/google/android/filament/MaterialInstance;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Lcom/google/ar/sceneform/rendering/e$c;->c()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    goto :goto_2

    :cond_1
    const-string v2, ""

    :goto_2
    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_3
    invoke-interface {p1}, Lcom/google/ar/sceneform/rendering/a;->j()Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    iget-object p3, p0, Lcom/google/ar/sceneform/rendering/e;->b:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    if-le p2, p3, :cond_3

    invoke-interface {p1}, Lcom/google/ar/sceneform/rendering/a;->j()Ljava/util/ArrayList;

    move-result-object p2

    invoke-interface {p1}, Lcom/google/ar/sceneform/rendering/a;->j()Ljava/util/ArrayList;

    move-result-object p3

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p3

    add-int/lit8 p3, p3, -0x1

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_3

    :cond_3
    return-void
.end method

.method public final e(Lcom/google/ar/sceneform/rendering/a;)V
    .locals 7

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    iget-object v3, p0, Lcom/google/ar/sceneform/rendering/e;->b:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_0

    iget-object v3, p0, Lcom/google/ar/sceneform/rendering/e;->b:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/ar/sceneform/rendering/e$c;

    invoke-virtual {v3}, Lcom/google/ar/sceneform/rendering/e$c;->d()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lcom/google/ar/sceneform/rendering/a;->v()Ljava/nio/IntBuffer;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    move-result v3

    if-ge v3, v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/nio/IntBuffer;->rewind()Ljava/nio/Buffer;

    goto :goto_2

    :cond_2
    :goto_1
    invoke-static {v2}, Ljava/nio/IntBuffer;->allocate(I)Ljava/nio/IntBuffer;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/google/ar/sceneform/rendering/a;->s(Ljava/nio/IntBuffer;)V

    :goto_2
    move v3, v0

    :goto_3
    iget-object v4, p0, Lcom/google/ar/sceneform/rendering/e;->b:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_4

    iget-object v4, p0, Lcom/google/ar/sceneform/rendering/e;->b:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/ar/sceneform/rendering/e$c;

    invoke-virtual {v4}, Lcom/google/ar/sceneform/rendering/e$c;->d()Ljava/util/List;

    move-result-object v4

    move v5, v0

    :goto_4
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_3

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-virtual {v1, v6}, Ljava/nio/IntBuffer;->put(I)Ljava/nio/IntBuffer;

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_4
    invoke-virtual {v1}, Ljava/nio/IntBuffer;->rewind()Ljava/nio/Buffer;

    invoke-interface {p1}, Lcom/google/ar/sceneform/rendering/a;->d()Lcom/google/android/filament/IndexBuffer;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lcom/google/android/filament/IndexBuffer;->getIndexCount()I

    move-result v4

    if-ge v4, v2, :cond_7

    :cond_5
    if-eqz v3, :cond_6

    invoke-static {v3}, Lu12;->b(Lcom/google/android/filament/IndexBuffer;)V

    :cond_6
    new-instance v3, Lcom/google/android/filament/IndexBuffer$Builder;

    invoke-direct {v3}, Lcom/google/android/filament/IndexBuffer$Builder;-><init>()V

    invoke-virtual {v3, v2}, Lcom/google/android/filament/IndexBuffer$Builder;->indexCount(I)Lcom/google/android/filament/IndexBuffer$Builder;

    move-result-object v3

    sget-object v4, Lcom/google/android/filament/IndexBuffer$Builder$IndexType;->UINT:Lcom/google/android/filament/IndexBuffer$Builder$IndexType;

    invoke-virtual {v3, v4}, Lcom/google/android/filament/IndexBuffer$Builder;->bufferType(Lcom/google/android/filament/IndexBuffer$Builder$IndexType;)Lcom/google/android/filament/IndexBuffer$Builder;

    move-result-object v3

    invoke-static {v3}, Lu12;->a(Lcom/google/android/filament/IndexBuffer$Builder;)Lcom/google/android/filament/IndexBuffer;

    move-result-object v3

    invoke-interface {p1, v3}, Lcom/google/ar/sceneform/rendering/a;->c(Lcom/google/android/filament/IndexBuffer;)V

    :cond_7
    invoke-static {v3, v1, v0, v2}, Lu12;->d(Lcom/google/android/filament/IndexBuffer;Ljava/nio/Buffer;II)V

    return-void
.end method

.method public final f(Lcom/google/ar/sceneform/rendering/a;)V
    .locals 14

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/e;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1f

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/e;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/google/ar/sceneform/rendering/e;->a:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/ar/sceneform/rendering/h;

    sget-object v3, Lcom/google/android/filament/VertexBuffer$VertexAttribute;->POSITION:Lcom/google/android/filament/VertexBuffer$VertexAttribute;

    invoke-static {v3}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v4

    invoke-virtual {v1}, Lcom/google/ar/sceneform/rendering/h;->c()LQj6;

    move-result-object v5

    if-eqz v5, :cond_0

    sget-object v5, Lcom/google/android/filament/VertexBuffer$VertexAttribute;->TANGENTS:Lcom/google/android/filament/VertexBuffer$VertexAttribute;

    invoke-virtual {v4, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {v1}, Lcom/google/ar/sceneform/rendering/h;->e()Lcom/google/ar/sceneform/rendering/h$c;

    invoke-virtual {v1}, Lcom/google/ar/sceneform/rendering/h;->b()Lqm0;

    move-result-object v5

    if-eqz v5, :cond_1

    sget-object v5, Lcom/google/android/filament/VertexBuffer$VertexAttribute;->COLOR:Lcom/google/android/filament/VertexBuffer$VertexAttribute;

    invoke-virtual {v4, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-interface {p1}, Lcom/google/ar/sceneform/rendering/a;->e()Lcom/google/android/filament/VertexBuffer;

    move-result-object v5

    const/4 v6, 0x1

    if-eqz v5, :cond_7

    invoke-static {v3}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v3

    invoke-interface {p1}, Lcom/google/ar/sceneform/rendering/a;->q()Ljava/nio/FloatBuffer;

    move-result-object v7

    if-eqz v7, :cond_2

    sget-object v7, Lcom/google/android/filament/VertexBuffer$VertexAttribute;->TANGENTS:Lcom/google/android/filament/VertexBuffer$VertexAttribute;

    invoke-virtual {v3, v7}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-interface {p1}, Lcom/google/ar/sceneform/rendering/a;->r()Ljava/nio/FloatBuffer;

    move-result-object v7

    if-eqz v7, :cond_3

    sget-object v7, Lcom/google/android/filament/VertexBuffer$VertexAttribute;->UV0:Lcom/google/android/filament/VertexBuffer$VertexAttribute;

    invoke-virtual {v3, v7}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-interface {p1}, Lcom/google/ar/sceneform/rendering/a;->u()Ljava/nio/FloatBuffer;

    move-result-object v7

    if-eqz v7, :cond_4

    sget-object v7, Lcom/google/android/filament/VertexBuffer$VertexAttribute;->COLOR:Lcom/google/android/filament/VertexBuffer$VertexAttribute;

    invoke-virtual {v3, v7}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_4
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {v5}, Lcom/google/android/filament/VertexBuffer;->getVertexCount()I

    move-result v3

    if-ge v3, v0, :cond_5

    goto :goto_0

    :cond_5
    move v3, v2

    goto :goto_1

    :cond_6
    :goto_0
    move v3, v6

    :goto_1
    if-eqz v3, :cond_8

    invoke-static {v5}, LHo6;->b(Lcom/google/android/filament/VertexBuffer;)V

    goto :goto_2

    :cond_7
    move v3, v6

    :cond_8
    :goto_2
    if-eqz v3, :cond_9

    invoke-static {v0, v4}, Lcom/google/ar/sceneform/rendering/e;->h(ILjava/util/EnumSet;)Lcom/google/android/filament/VertexBuffer;

    move-result-object v5

    invoke-interface {p1, v5}, Lcom/google/ar/sceneform/rendering/a;->n(Lcom/google/android/filament/VertexBuffer;)V

    :cond_9
    invoke-interface {p1}, Lcom/google/ar/sceneform/rendering/a;->f()Ljava/nio/FloatBuffer;

    move-result-object v3

    if-eqz v3, :cond_b

    invoke-virtual {v3}, Ljava/nio/Buffer;->capacity()I

    move-result v7

    mul-int/lit8 v8, v0, 0x3

    if-ge v7, v8, :cond_a

    goto :goto_3

    :cond_a
    invoke-virtual {v3}, Ljava/nio/FloatBuffer;->rewind()Ljava/nio/Buffer;

    goto :goto_4

    :cond_b
    :goto_3
    mul-int/lit8 v3, v0, 0x3

    invoke-static {v3}, Ljava/nio/FloatBuffer;->allocate(I)Ljava/nio/FloatBuffer;

    move-result-object v3

    invoke-interface {p1, v3}, Lcom/google/ar/sceneform/rendering/a;->t(Ljava/nio/FloatBuffer;)V

    :goto_4
    invoke-interface {p1}, Lcom/google/ar/sceneform/rendering/a;->q()Ljava/nio/FloatBuffer;

    move-result-object v7

    sget-object v8, Lcom/google/android/filament/VertexBuffer$VertexAttribute;->TANGENTS:Lcom/google/android/filament/VertexBuffer$VertexAttribute;

    invoke-virtual {v4, v8}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_d

    if-eqz v7, :cond_c

    invoke-virtual {v7}, Ljava/nio/Buffer;->capacity()I

    move-result v8

    mul-int/lit8 v9, v0, 0x4

    if-ge v8, v9, :cond_d

    :cond_c
    mul-int/lit8 v7, v0, 0x4

    invoke-static {v7}, Ljava/nio/FloatBuffer;->allocate(I)Ljava/nio/FloatBuffer;

    move-result-object v7

    invoke-interface {p1, v7}, Lcom/google/ar/sceneform/rendering/a;->g(Ljava/nio/FloatBuffer;)V

    goto :goto_5

    :cond_d
    if-eqz v7, :cond_e

    invoke-virtual {v7}, Ljava/nio/FloatBuffer;->rewind()Ljava/nio/Buffer;

    :cond_e
    :goto_5
    invoke-interface {p1}, Lcom/google/ar/sceneform/rendering/a;->r()Ljava/nio/FloatBuffer;

    move-result-object v8

    sget-object v9, Lcom/google/android/filament/VertexBuffer$VertexAttribute;->UV0:Lcom/google/android/filament/VertexBuffer$VertexAttribute;

    invoke-virtual {v4, v9}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_10

    if-eqz v8, :cond_f

    invoke-virtual {v8}, Ljava/nio/Buffer;->capacity()I

    move-result v9

    mul-int/lit8 v10, v0, 0x2

    if-ge v9, v10, :cond_10

    :cond_f
    mul-int/lit8 v8, v0, 0x2

    invoke-static {v8}, Ljava/nio/FloatBuffer;->allocate(I)Ljava/nio/FloatBuffer;

    move-result-object v8

    invoke-interface {p1, v8}, Lcom/google/ar/sceneform/rendering/a;->o(Ljava/nio/FloatBuffer;)V

    goto :goto_6

    :cond_10
    if-eqz v8, :cond_11

    invoke-virtual {v8}, Ljava/nio/FloatBuffer;->rewind()Ljava/nio/Buffer;

    :cond_11
    :goto_6
    invoke-interface {p1}, Lcom/google/ar/sceneform/rendering/a;->u()Ljava/nio/FloatBuffer;

    move-result-object v9

    sget-object v10, Lcom/google/android/filament/VertexBuffer$VertexAttribute;->COLOR:Lcom/google/android/filament/VertexBuffer$VertexAttribute;

    invoke-virtual {v4, v10}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_13

    if-eqz v9, :cond_12

    invoke-virtual {v9}, Ljava/nio/Buffer;->capacity()I

    move-result v4

    mul-int/lit8 v10, v0, 0x4

    if-ge v4, v10, :cond_13

    :cond_12
    mul-int/lit8 v4, v0, 0x4

    invoke-static {v4}, Ljava/nio/FloatBuffer;->allocate(I)Ljava/nio/FloatBuffer;

    move-result-object v9

    invoke-interface {p1, v9}, Lcom/google/ar/sceneform/rendering/a;->b(Ljava/nio/FloatBuffer;)V

    goto :goto_7

    :cond_13
    if-eqz v9, :cond_14

    invoke-virtual {v9}, Ljava/nio/FloatBuffer;->rewind()Ljava/nio/Buffer;

    :cond_14
    :goto_7
    new-instance v4, LQj6;

    invoke-direct {v4}, LQj6;-><init>()V

    new-instance v10, LQj6;

    invoke-direct {v10}, LQj6;-><init>()V

    invoke-virtual {v1}, Lcom/google/ar/sceneform/rendering/h;->d()LQj6;

    move-result-object v1

    invoke-virtual {v4, v1}, LQj6;->o(LQj6;)V

    invoke-virtual {v10, v1}, LQj6;->o(LQj6;)V

    move v1, v2

    :goto_8
    iget-object v11, p0, Lcom/google/ar/sceneform/rendering/e;->a:Ljava/util/List;

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v11

    if-ge v1, v11, :cond_1a

    iget-object v11, p0, Lcom/google/ar/sceneform/rendering/e;->a:Ljava/util/List;

    invoke-interface {v11, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/google/ar/sceneform/rendering/h;

    invoke-virtual {v11}, Lcom/google/ar/sceneform/rendering/h;->d()LQj6;

    move-result-object v12

    invoke-static {v4, v12}, LQj6;->i(LQj6;LQj6;)LQj6;

    move-result-object v13

    invoke-virtual {v4, v13}, LQj6;->o(LQj6;)V

    invoke-static {v10, v12}, LQj6;->h(LQj6;LQj6;)LQj6;

    move-result-object v13

    invoke-virtual {v10, v13}, LQj6;->o(LQj6;)V

    invoke-static {v12, v3}, Lcom/google/ar/sceneform/rendering/e;->c(LQj6;Ljava/nio/FloatBuffer;)V

    if-eqz v7, :cond_16

    invoke-virtual {v11}, Lcom/google/ar/sceneform/rendering/h;->c()LQj6;

    move-result-object v12

    if-eqz v12, :cond_15

    invoke-static {v12}, Lcom/google/ar/sceneform/rendering/e;->j(LQj6;)LVc4;

    move-result-object v12

    invoke-static {v12, v7}, Lcom/google/ar/sceneform/rendering/e;->b(LVc4;Ljava/nio/FloatBuffer;)V

    goto :goto_9

    :cond_15
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Missing normal: If any Vertex in a RenderableDescription has a normal, all vertices must have one."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_16
    :goto_9
    if-nez v8, :cond_19

    if-eqz v9, :cond_18

    invoke-virtual {v11}, Lcom/google/ar/sceneform/rendering/h;->b()Lqm0;

    move-result-object v11

    if-eqz v11, :cond_17

    invoke-static {v11, v9}, Lcom/google/ar/sceneform/rendering/e;->a(Lqm0;Ljava/nio/FloatBuffer;)V

    goto :goto_a

    :cond_17
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Missing Color: If any Vertex in a RenderableDescription has a Color, all vertices must have one."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_18
    :goto_a
    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :cond_19
    invoke-virtual {v11}, Lcom/google/ar/sceneform/rendering/h;->e()Lcom/google/ar/sceneform/rendering/h$c;

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Missing UV Coordinate: If any Vertex in a RenderableDescription has a UV Coordinate, all vertices must have one."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1a
    invoke-static {v10, v4}, LQj6;->v(LQj6;LQj6;)LQj6;

    move-result-object v1

    const/high16 v10, 0x3f000000    # 0.5f

    invoke-virtual {v1, v10}, LQj6;->m(F)LQj6;

    move-result-object v1

    invoke-static {v4, v1}, LQj6;->a(LQj6;LQj6;)LQj6;

    move-result-object v4

    invoke-interface {p1, v1}, Lcom/google/ar/sceneform/rendering/a;->h(LQj6;)V

    invoke-interface {p1, v4}, Lcom/google/ar/sceneform/rendering/a;->a(LQj6;)V

    if-eqz v5, :cond_1e

    invoke-virtual {v3}, Ljava/nio/FloatBuffer;->rewind()Ljava/nio/Buffer;

    mul-int/lit8 p1, v0, 0x3

    invoke-static {v5, v2, v3, v2, p1}, LHo6;->d(Lcom/google/android/filament/VertexBuffer;ILjava/nio/Buffer;II)V

    if-eqz v7, :cond_1b

    invoke-virtual {v7}, Ljava/nio/FloatBuffer;->rewind()Ljava/nio/Buffer;

    mul-int/lit8 p1, v0, 0x4

    invoke-static {v5, v6, v7, v2, p1}, LHo6;->d(Lcom/google/android/filament/VertexBuffer;ILjava/nio/Buffer;II)V

    move p1, v6

    goto :goto_b

    :cond_1b
    move p1, v2

    :goto_b
    if-eqz v8, :cond_1c

    invoke-virtual {v8}, Ljava/nio/FloatBuffer;->rewind()Ljava/nio/Buffer;

    add-int/lit8 p1, p1, 0x1

    mul-int/lit8 v1, v0, 0x2

    invoke-static {v5, p1, v8, v2, v1}, LHo6;->d(Lcom/google/android/filament/VertexBuffer;ILjava/nio/Buffer;II)V

    :cond_1c
    if-eqz v9, :cond_1d

    invoke-virtual {v9}, Ljava/nio/FloatBuffer;->rewind()Ljava/nio/Buffer;

    add-int/2addr p1, v6

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v5, p1, v9, v2, v0}, LHo6;->d(Lcom/google/android/filament/VertexBuffer;ILjava/nio/Buffer;II)V

    :cond_1d
    return-void

    :cond_1e
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "VertexBuffer is null."

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1f
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "RenderableDescription must have at least one vertex."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public i()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/ar/sceneform/rendering/e$c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/e;->b:Ljava/util/List;

    return-object v0
.end method
