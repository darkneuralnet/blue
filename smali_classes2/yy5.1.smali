.class public Lyy5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LzA0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyy5$b;,
        Lyy5$c;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lqe;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lqe;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lpe;

.field public final e:Lse;

.field public final f:Lqe;

.field public final g:Lyy5$b;

.field public final h:Lyy5$c;

.field public final i:F

.field public final j:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lqe;Ljava/util/List;Lpe;Lse;Lqe;Lyy5$b;Lyy5$c;FZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lqe;",
            "Ljava/util/List<",
            "Lqe;",
            ">;",
            "Lpe;",
            "Lse;",
            "Lqe;",
            "Lyy5$b;",
            "Lyy5$c;",
            "FZ)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyy5;->a:Ljava/lang/String;

    iput-object p2, p0, Lyy5;->b:Lqe;

    iput-object p3, p0, Lyy5;->c:Ljava/util/List;

    iput-object p4, p0, Lyy5;->d:Lpe;

    iput-object p5, p0, Lyy5;->e:Lse;

    iput-object p6, p0, Lyy5;->f:Lqe;

    iput-object p7, p0, Lyy5;->g:Lyy5$b;

    iput-object p8, p0, Lyy5;->h:Lyy5$c;

    iput p9, p0, Lyy5;->i:F

    iput-boolean p10, p0, Lyy5;->j:Z

    return-void
.end method


# virtual methods
.method public a(LRD2;LrD2;LqB;)LVz0;
    .locals 0

    new-instance p2, LMS5;

    invoke-direct {p2, p1, p3, p0}, LMS5;-><init>(LRD2;LqB;Lyy5;)V

    return-object p2
.end method

.method public b()Lyy5$b;
    .locals 1

    iget-object v0, p0, Lyy5;->g:Lyy5$b;

    return-object v0
.end method

.method public c()Lpe;
    .locals 1

    iget-object v0, p0, Lyy5;->d:Lpe;

    return-object v0
.end method

.method public d()Lqe;
    .locals 1

    iget-object v0, p0, Lyy5;->b:Lqe;

    return-object v0
.end method

.method public e()Lyy5$c;
    .locals 1

    iget-object v0, p0, Lyy5;->h:Lyy5$c;

    return-object v0
.end method

.method public f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lqe;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lyy5;->c:Ljava/util/List;

    return-object v0
.end method

.method public g()F
    .locals 1

    iget v0, p0, Lyy5;->i:F

    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lyy5;->a:Ljava/lang/String;

    return-object v0
.end method

.method public i()Lse;
    .locals 1

    iget-object v0, p0, Lyy5;->e:Lse;

    return-object v0
.end method

.method public j()Lqe;
    .locals 1

    iget-object v0, p0, Lyy5;->f:Lqe;

    return-object v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Lyy5;->j:Z

    return v0
.end method
