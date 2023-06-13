.class public LLk0$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLk0$b;->subscribe(Lio/reactivex/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:LYi1;

.field public final synthetic c:LLk0$b;


# direct methods
.method public constructor <init>(LLk0$b;LYi1;)V
    .locals 0

    iput-object p1, p0, LLk0$b$a;->c:LLk0$b;

    iput-object p2, p0, LLk0$b$a;->b:LYi1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, LLk0$b$a;->c:LLk0$b;

    iget-object v0, v0, LLk0$b;->c:LLk0;

    iget-object v0, v0, LLk0;->b:Ldi3;

    iget-object v1, p0, LLk0$b$a;->b:LYi1;

    invoke-virtual {v0, v1}, Ldi3;->c(LYi1;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LLk0$b$a;->c:LLk0$b;

    iget-object v0, v0, LLk0$b;->b:LYh3;

    invoke-static {v0}, LOx2;->p(LYh3;)V

    :cond_0
    return-void
.end method
