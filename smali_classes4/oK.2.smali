.class public final synthetic LoK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Z

.field public final synthetic c:LbE5;

.field public final synthetic d:LKY;

.field public final synthetic e:LLK;

.field public final synthetic f:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(ZLbE5;LKY;LLK;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LoK;->b:Z

    iput-object p2, p0, LoK;->c:LbE5;

    iput-object p3, p0, LoK;->d:LKY;

    iput-object p4, p0, LoK;->e:LLK;

    iput-object p5, p0, LoK;->f:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-boolean v0, p0, LoK;->b:Z

    iget-object v1, p0, LoK;->c:LbE5;

    iget-object v2, p0, LoK;->d:LKY;

    iget-object v3, p0, LoK;->e:LLK;

    iget-object v4, p0, LoK;->f:Ljava/lang/Integer;

    invoke-static {v0, v1, v2, v3, v4}, LLK;->z(ZLbE5;LKY;LLK;Ljava/lang/Integer;)V

    return-void
.end method
