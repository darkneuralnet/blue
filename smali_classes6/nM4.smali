.class public LnM4;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static f:LnM4;


# instance fields
.field public final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "LjM4;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LrM4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LrM4<",
            "Lcom/google/ar/sceneform/rendering/Texture;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LrM4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LrM4<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LrM4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LrM4<",
            "Lcom/google/ar/sceneform/rendering/b;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LrM4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LrM4<",
            "Lcom/google/ar/sceneform/rendering/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LnM4;->a:Ljava/util/ArrayList;

    new-instance v0, LrM4;

    invoke-direct {v0}, LrM4;-><init>()V

    iput-object v0, p0, LnM4;->b:LrM4;

    new-instance v1, LrM4;

    invoke-direct {v1}, LrM4;-><init>()V

    iput-object v1, p0, LnM4;->c:LrM4;

    new-instance v2, LrM4;

    invoke-direct {v2}, LrM4;-><init>()V

    iput-object v2, p0, LnM4;->d:LrM4;

    new-instance v3, LrM4;

    invoke-direct {v3}, LrM4;-><init>()V

    iput-object v3, p0, LnM4;->e:LrM4;

    invoke-virtual {p0, v0}, LnM4;->a(LjM4;)V

    invoke-virtual {p0, v1}, LnM4;->a(LjM4;)V

    invoke-virtual {p0, v2}, LnM4;->a(LjM4;)V

    invoke-virtual {p0}, LnM4;->b()V

    return-void
.end method

.method public static d()LnM4;
    .locals 1

    sget-object v0, LnM4;->f:LnM4;

    if-nez v0, :cond_0

    new-instance v0, LnM4;

    invoke-direct {v0}, LnM4;-><init>()V

    sput-object v0, LnM4;->f:LnM4;

    :cond_0
    sget-object v0, LnM4;->f:LnM4;

    return-object v0
.end method


# virtual methods
.method public a(LjM4;)V
    .locals 1

    iget-object v0, p0, LnM4;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, LnM4;->e:LrM4;

    invoke-virtual {p0, v0}, LnM4;->a(LjM4;)V

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, LnM4;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LjM4;

    invoke-interface {v1}, LjM4;->a()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public e()LrM4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LrM4<",
            "Lcom/google/ar/sceneform/rendering/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LnM4;->d:LrM4;

    return-object v0
.end method
