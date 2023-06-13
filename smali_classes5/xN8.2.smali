.class public final synthetic LxN8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LnZ8;

.field public final synthetic c:Lod9;


# direct methods
.method public synthetic constructor <init>(LnZ8;Lod9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LxN8;->b:LnZ8;

    iput-object p2, p0, LxN8;->c:Lod9;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LxN8;->b:LnZ8;

    iget-object v1, p0, LxN8;->c:Lod9;

    iget v1, v1, Lod9;->a:I

    invoke-virtual {v0, v1}, LnZ8;->e(I)V

    return-void
.end method
