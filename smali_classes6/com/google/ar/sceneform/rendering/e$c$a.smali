.class public final Lcom/google/ar/sceneform/rendering/e$c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/ar/sceneform/rendering/e$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public b:Lcom/google/android/filament/MaterialInstance;

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/google/ar/sceneform/rendering/e$c$a;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/google/ar/sceneform/rendering/e$c$a;->a:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic b(Lcom/google/ar/sceneform/rendering/e$c$a;)Lcom/google/android/filament/MaterialInstance;
    .locals 0

    iget-object p0, p0, Lcom/google/ar/sceneform/rendering/e$c$a;->b:Lcom/google/android/filament/MaterialInstance;

    return-object p0
.end method

.method public static synthetic c(Lcom/google/ar/sceneform/rendering/e$c$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/ar/sceneform/rendering/e$c$a;->c:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public d()Lcom/google/ar/sceneform/rendering/e$c;
    .locals 2

    new-instance v0, Lcom/google/ar/sceneform/rendering/e$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/ar/sceneform/rendering/e$c;-><init>(Lcom/google/ar/sceneform/rendering/e$c$a;Lcom/google/ar/sceneform/rendering/e$a;)V

    return-object v0
.end method

.method public e(Lcom/google/android/filament/MaterialInstance;)Lcom/google/ar/sceneform/rendering/e$c$a;
    .locals 0

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/e$c$a;->b:Lcom/google/android/filament/MaterialInstance;

    return-object p0
.end method

.method public f(Ljava/util/List;)Lcom/google/ar/sceneform/rendering/e$c$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lcom/google/ar/sceneform/rendering/e$c$a;"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/e$c$a;->a:Ljava/util/List;

    return-object p0
.end method
