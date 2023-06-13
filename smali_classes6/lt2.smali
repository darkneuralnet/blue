.class public final synthetic Llt2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:Lnt2;


# direct methods
.method public synthetic constructor <init>(Lnt2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llt2;->a:Lnt2;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Llt2;->a:Lnt2;

    check-cast p1, [B

    invoke-static {v0, p1}, Lnt2;->c(Lnt2;[B)Lcom/google/ar/sceneform/rendering/d;

    move-result-object p1

    return-object p1
.end method
