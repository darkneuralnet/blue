.class public final synthetic LCd5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Z

.field public final synthetic c:LbE5;

.field public final synthetic d:LKY;

.field public final synthetic e:LYd5;

.field public final synthetic f:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(ZLbE5;LKY;LYd5;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LCd5;->b:Z

    iput-object p2, p0, LCd5;->c:LbE5;

    iput-object p3, p0, LCd5;->d:LKY;

    iput-object p4, p0, LCd5;->e:LYd5;

    iput-object p5, p0, LCd5;->f:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-boolean v0, p0, LCd5;->b:Z

    iget-object v1, p0, LCd5;->c:LbE5;

    iget-object v2, p0, LCd5;->d:LKY;

    iget-object v3, p0, LCd5;->e:LYd5;

    iget-object v4, p0, LCd5;->f:Ljava/lang/Integer;

    invoke-static {v0, v1, v2, v3, v4}, LYd5;->b0(ZLbE5;LKY;LYd5;Ljava/lang/Integer;)V

    return-void
.end method
