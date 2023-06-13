.class public final synthetic Lmx4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:Lcom/google/ar/sceneform/rendering/d$a;


# direct methods
.method public synthetic constructor <init>(Lcom/google/ar/sceneform/rendering/d$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmx4;->a:Lcom/google/ar/sceneform/rendering/d$a;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lmx4;->a:Lcom/google/ar/sceneform/rendering/d$a;

    check-cast p1, Lcom/google/ar/sceneform/rendering/d;

    invoke-static {v0, p1}, Lcom/google/ar/sceneform/rendering/d$a;->a(Lcom/google/ar/sceneform/rendering/d$a;Lcom/google/ar/sceneform/rendering/d;)Lcom/google/ar/sceneform/rendering/d;

    move-result-object p1

    return-object p1
.end method
