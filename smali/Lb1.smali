.class public final synthetic LLb1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LOb1;

.field public final synthetic c:LQ22;


# direct methods
.method public synthetic constructor <init>(LOb1;LQ22;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLb1;->b:LOb1;

    iput-object p2, p0, LLb1;->c:LQ22;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LLb1;->b:LOb1;

    iget-object v1, p0, LLb1;->c:LQ22;

    invoke-static {v0, v1}, LOb1;->j(LOb1;LQ22;)V

    return-void
.end method
