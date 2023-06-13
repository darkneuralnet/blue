.class public final synthetic Lct6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/google/ar/sceneform/rendering/i;


# direct methods
.method public synthetic constructor <init>(Lcom/google/ar/sceneform/rendering/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lct6;->b:Lcom/google/ar/sceneform/rendering/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lct6;->b:Lcom/google/ar/sceneform/rendering/i;

    invoke-static {v0}, Lcom/google/ar/sceneform/rendering/i;->u(Lcom/google/ar/sceneform/rendering/i;)V

    return-void
.end method
