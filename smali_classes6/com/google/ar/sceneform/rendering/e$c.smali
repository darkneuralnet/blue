.class public Lcom/google/ar/sceneform/rendering/e$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/ar/sceneform/rendering/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/ar/sceneform/rendering/e$c$a;
    }
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
.method public constructor <init>(Lcom/google/ar/sceneform/rendering/e$c$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/ar/sceneform/rendering/e$c$a;->a(Lcom/google/ar/sceneform/rendering/e$c$a;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LDZ3;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/e$c;->a:Ljava/util/List;

    invoke-static {p1}, Lcom/google/ar/sceneform/rendering/e$c$a;->b(Lcom/google/ar/sceneform/rendering/e$c$a;)Lcom/google/android/filament/MaterialInstance;

    move-result-object v0

    invoke-static {v0}, LDZ3;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/filament/MaterialInstance;

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/e$c;->b:Lcom/google/android/filament/MaterialInstance;

    invoke-static {p1}, Lcom/google/ar/sceneform/rendering/e$c$a;->c(Lcom/google/ar/sceneform/rendering/e$c$a;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/e$c;->c:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/ar/sceneform/rendering/e$c$a;Lcom/google/ar/sceneform/rendering/e$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/ar/sceneform/rendering/e$c;-><init>(Lcom/google/ar/sceneform/rendering/e$c$a;)V

    return-void
.end method

.method public static a()Lcom/google/ar/sceneform/rendering/e$c$a;
    .locals 1

    new-instance v0, Lcom/google/ar/sceneform/rendering/e$c$a;

    invoke-direct {v0}, Lcom/google/ar/sceneform/rendering/e$c$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/google/android/filament/MaterialInstance;
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/e$c;->b:Lcom/google/android/filament/MaterialInstance;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/e$c;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/e$c;->a:Ljava/util/List;

    return-object v0
.end method

.method public e(Lcom/google/android/filament/MaterialInstance;)V
    .locals 0

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/e$c;->b:Lcom/google/android/filament/MaterialInstance;

    return-void
.end method
