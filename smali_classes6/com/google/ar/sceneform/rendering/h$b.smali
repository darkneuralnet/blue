.class public final Lcom/google/ar/sceneform/rendering/h$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/ar/sceneform/rendering/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LQj6;

.field public b:LQj6;

.field public c:Lqm0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LQj6;->x()LQj6;

    move-result-object v0

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/h$b;->a:LQj6;

    return-void
.end method

.method public static synthetic a(Lcom/google/ar/sceneform/rendering/h$b;)LQj6;
    .locals 0

    iget-object p0, p0, Lcom/google/ar/sceneform/rendering/h$b;->a:LQj6;

    return-object p0
.end method

.method public static synthetic b(Lcom/google/ar/sceneform/rendering/h$b;)LQj6;
    .locals 0

    iget-object p0, p0, Lcom/google/ar/sceneform/rendering/h$b;->b:LQj6;

    return-object p0
.end method

.method public static synthetic c(Lcom/google/ar/sceneform/rendering/h$b;)Lcom/google/ar/sceneform/rendering/h$c;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic d(Lcom/google/ar/sceneform/rendering/h$b;)Lqm0;
    .locals 0

    iget-object p0, p0, Lcom/google/ar/sceneform/rendering/h$b;->c:Lqm0;

    return-object p0
.end method


# virtual methods
.method public e()Lcom/google/ar/sceneform/rendering/h;
    .locals 2

    new-instance v0, Lcom/google/ar/sceneform/rendering/h;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/ar/sceneform/rendering/h;-><init>(Lcom/google/ar/sceneform/rendering/h$b;Lcom/google/ar/sceneform/rendering/h$a;)V

    return-object v0
.end method

.method public f(LQj6;)Lcom/google/ar/sceneform/rendering/h$b;
    .locals 0

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/h$b;->b:LQj6;

    return-object p0
.end method

.method public g(LQj6;)Lcom/google/ar/sceneform/rendering/h$b;
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/h$b;->a:LQj6;

    invoke-virtual {v0, p1}, LQj6;->o(LQj6;)V

    return-object p0
.end method
