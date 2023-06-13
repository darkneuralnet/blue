.class public final synthetic LRs2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LUs2;

.field public final synthetic c:LUs2$a;

.field public final synthetic d:LUs2$a;


# direct methods
.method public synthetic constructor <init>(LUs2;LUs2$a;LUs2$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRs2;->b:LUs2;

    iput-object p2, p0, LRs2;->c:LUs2$a;

    iput-object p3, p0, LRs2;->d:LUs2$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LRs2;->b:LUs2;

    iget-object v1, p0, LRs2;->c:LUs2$a;

    iget-object v2, p0, LRs2;->d:LUs2$a;

    invoke-static {v0, v1, v2}, LUs2;->e(LUs2;LUs2$a;LUs2$a;)V

    return-void
.end method
