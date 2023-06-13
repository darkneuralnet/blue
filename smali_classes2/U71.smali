.class public LU71;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lpe;

.field public final b:Lqe;

.field public final c:Lqe;

.field public final d:Lqe;

.field public final e:Lqe;


# direct methods
.method public constructor <init>(Lpe;Lqe;Lqe;Lqe;Lqe;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU71;->a:Lpe;

    iput-object p2, p0, LU71;->b:Lqe;

    iput-object p3, p0, LU71;->c:Lqe;

    iput-object p4, p0, LU71;->d:Lqe;

    iput-object p5, p0, LU71;->e:Lqe;

    return-void
.end method


# virtual methods
.method public a()Lpe;
    .locals 1

    iget-object v0, p0, LU71;->a:Lpe;

    return-object v0
.end method

.method public b()Lqe;
    .locals 1

    iget-object v0, p0, LU71;->c:Lqe;

    return-object v0
.end method

.method public c()Lqe;
    .locals 1

    iget-object v0, p0, LU71;->d:Lqe;

    return-object v0
.end method

.method public d()Lqe;
    .locals 1

    iget-object v0, p0, LU71;->b:Lqe;

    return-object v0
.end method

.method public e()Lqe;
    .locals 1

    iget-object v0, p0, LU71;->e:Lqe;

    return-object v0
.end method
