.class public Lp80;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lsd3;

.field public b:Ljava/lang/Number;


# direct methods
.method public constructor <init>(Lsd3;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lp80;->b:Ljava/lang/Number;

    iput-object p1, p0, Lp80;->a:Lsd3;

    return-void
.end method

.method public static a()Lp80;
    .locals 2

    new-instance v0, Lp80;

    invoke-static {}, Lt80;->c()Lsd3;

    move-result-object v1

    invoke-direct {v0, v1}, Lp80;-><init>(Lsd3;)V

    return-object v0
.end method

.method public static c(Ljava/lang/Number;)Lp80;
    .locals 1

    invoke-static {}, Lp80;->a()Lp80;

    move-result-object v0

    invoke-virtual {v0, p0}, Lp80;->b(Ljava/lang/Number;)Lp80;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b(Ljava/lang/Number;)Lp80;
    .locals 1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lp80;->a:Lsd3;

    invoke-interface {v0, p1}, Lsd3;->d(Ljava/lang/Number;)Ljava/lang/Number;

    move-result-object p1

    iput-object p1, p0, Lp80;->b:Ljava/lang/Number;

    return-object p0
.end method

.method public d()Ljava/lang/Number;
    .locals 2

    iget-object v0, p0, Lp80;->a:Lsd3;

    iget-object v1, p0, Lp80;->b:Ljava/lang/Number;

    invoke-interface {v0, v1}, Lsd3;->d(Ljava/lang/Number;)Ljava/lang/Number;

    move-result-object v0

    return-object v0
.end method

.method public e(I)Lp80;
    .locals 2

    iget-object v0, p0, Lp80;->a:Lsd3;

    iget-object v1, p0, Lp80;->b:Ljava/lang/Number;

    invoke-interface {v0, v1, p1}, Lsd3;->k(Ljava/lang/Number;I)Ljava/lang/Number;

    move-result-object p1

    iput-object p1, p0, Lp80;->b:Ljava/lang/Number;

    return-object p0
.end method

.method public f()Lp80;
    .locals 2

    iget-object v0, p0, Lp80;->a:Lsd3;

    iget-object v1, p0, Lp80;->b:Ljava/lang/Number;

    invoke-interface {v0, v1}, Lsd3;->f(Ljava/lang/Number;)Ljava/lang/Number;

    move-result-object v0

    iput-object v0, p0, Lp80;->b:Ljava/lang/Number;

    return-object p0
.end method
