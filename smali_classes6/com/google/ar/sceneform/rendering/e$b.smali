.class public final Lcom/google/ar/sceneform/rendering/e$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/ar/sceneform/rendering/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


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
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/e$b;->b:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Lcom/google/ar/sceneform/rendering/e$b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/google/ar/sceneform/rendering/e$b;->a:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic b(Lcom/google/ar/sceneform/rendering/e$b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/google/ar/sceneform/rendering/e$b;->b:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public c()Lcom/google/ar/sceneform/rendering/e;
    .locals 2

    new-instance v0, Lcom/google/ar/sceneform/rendering/e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/ar/sceneform/rendering/e;-><init>(Lcom/google/ar/sceneform/rendering/e$b;Lcom/google/ar/sceneform/rendering/e$a;)V

    return-object v0
.end method

.method public d(Ljava/util/List;)Lcom/google/ar/sceneform/rendering/e$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/ar/sceneform/rendering/h;",
            ">;)",
            "Lcom/google/ar/sceneform/rendering/e$b;"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/e$b;->a:Ljava/util/List;

    return-object p0
.end method
