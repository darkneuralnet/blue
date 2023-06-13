.class public final synthetic LSm9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Len9;

.field public final synthetic c:LO59;

.field public final synthetic d:Lzt8;


# direct methods
.method public synthetic constructor <init>(Len9;LO59;Lzt8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSm9;->b:Len9;

    iput-object p2, p0, LSm9;->c:LO59;

    iput-object p3, p0, LSm9;->d:Lzt8;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LSm9;->b:Len9;

    iget-object v1, p0, LSm9;->c:LO59;

    iget-object v2, p0, LSm9;->d:Lzt8;

    invoke-virtual {v0, v1, v2}, Len9;->g(LO59;Lzt8;)V

    return-void
.end method
