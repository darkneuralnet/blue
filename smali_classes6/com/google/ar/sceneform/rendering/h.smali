.class public Lcom/google/ar/sceneform/rendering/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/ar/sceneform/rendering/h$b;,
        Lcom/google/ar/sceneform/rendering/h$c;
    }
.end annotation


# instance fields
.field public final a:LQj6;

.field public b:LQj6;

.field public c:Lqm0;


# direct methods
.method public constructor <init>(Lcom/google/ar/sceneform/rendering/h$b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LQj6;->x()LQj6;

    move-result-object v0

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/h;->a:LQj6;

    invoke-static {p1}, Lcom/google/ar/sceneform/rendering/h$b;->a(Lcom/google/ar/sceneform/rendering/h$b;)LQj6;

    move-result-object v1

    invoke-virtual {v0, v1}, LQj6;->o(LQj6;)V

    invoke-static {p1}, Lcom/google/ar/sceneform/rendering/h$b;->b(Lcom/google/ar/sceneform/rendering/h$b;)LQj6;

    move-result-object v0

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/h;->b:LQj6;

    invoke-static {p1}, Lcom/google/ar/sceneform/rendering/h$b;->c(Lcom/google/ar/sceneform/rendering/h$b;)Lcom/google/ar/sceneform/rendering/h$c;

    invoke-static {p1}, Lcom/google/ar/sceneform/rendering/h$b;->d(Lcom/google/ar/sceneform/rendering/h$b;)Lqm0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/h;->c:Lqm0;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/ar/sceneform/rendering/h$b;Lcom/google/ar/sceneform/rendering/h$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/ar/sceneform/rendering/h;-><init>(Lcom/google/ar/sceneform/rendering/h$b;)V

    return-void
.end method

.method public static a()Lcom/google/ar/sceneform/rendering/h$b;
    .locals 1

    new-instance v0, Lcom/google/ar/sceneform/rendering/h$b;

    invoke-direct {v0}, Lcom/google/ar/sceneform/rendering/h$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lqm0;
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/h;->c:Lqm0;

    return-object v0
.end method

.method public c()LQj6;
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/h;->b:LQj6;

    return-object v0
.end method

.method public d()LQj6;
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/h;->a:LQj6;

    return-object v0
.end method

.method public e()Lcom/google/ar/sceneform/rendering/h$c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
