.class public final Lco/bird/android/feature/transferorder/operator/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/transferorder/operator/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/transferorder/operator/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Lco/bird/android/core/mrp/BaseActivityLite$a;

.field public final c:Lco/bird/android/feature/transferorder/operator/a$b;

.field public d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroidx/fragment/app/FragmentManager;",
            ">;"
        }
    .end annotation
.end field

.field public e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LGp3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mrp/BaseActivityLite$a;Landroidx/fragment/app/FragmentManager;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lco/bird/android/feature/transferorder/operator/a$b;->c:Lco/bird/android/feature/transferorder/operator/a$b;

    iput-object p1, p0, Lco/bird/android/feature/transferorder/operator/a$b;->a:LlG2;

    iput-object p2, p0, Lco/bird/android/feature/transferorder/operator/a$b;->b:Lco/bird/android/core/mrp/BaseActivityLite$a;

    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/android/feature/transferorder/operator/a$b;->f(LlG2;Lco/bird/android/core/mrp/BaseActivityLite$a;Landroidx/fragment/app/FragmentManager;Ljava/lang/Integer;)V

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mrp/BaseActivityLite$a;Landroidx/fragment/app/FragmentManager;Ljava/lang/Integer;LRM0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/android/feature/transferorder/operator/a$b;-><init>(LlG2;Lco/bird/android/core/mrp/BaseActivityLite$a;Landroidx/fragment/app/FragmentManager;Ljava/lang/Integer;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/transferorder/operator/OperatorOrderActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/transferorder/operator/a$b;->h(Lco/bird/android/feature/transferorder/operator/OperatorOrderActivity;)Lco/bird/android/feature/transferorder/operator/OperatorOrderActivity;

    return-void
.end method

.method public b(Lrp3;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/transferorder/operator/a$b;->j(Lrp3;)Lrp3;

    return-void
.end method

.method public c(La7;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/transferorder/operator/a$b;->g(La7;)La7;

    return-void
.end method

.method public d(LIo3;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/transferorder/operator/a$b;->i(LIo3;)LIo3;

    return-void
.end method

.method public final e()Lj7;
    .locals 4

    new-instance v0, Lj7;

    iget-object v1, p0, Lco/bird/android/feature/transferorder/operator/a$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->p()LO86;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO86;

    iget-object v2, p0, Lco/bird/android/feature/transferorder/operator/a$b;->a:LlG2;

    invoke-interface {v2}, LlG2;->B1()LTq4;

    move-result-object v2

    invoke-static {v2}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LTq4;

    iget-object v3, p0, Lco/bird/android/feature/transferorder/operator/a$b;->a:LlG2;

    invoke-interface {v3}, LlG2;->w2()Le13;

    move-result-object v3

    invoke-static {v3}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le13;

    invoke-direct {v0, v1, v2, v3}, Lj7;-><init>(LO86;LTq4;Le13;)V

    return-object v0
.end method

.method public final f(LlG2;Lco/bird/android/core/mrp/BaseActivityLite$a;Landroidx/fragment/app/FragmentManager;Ljava/lang/Integer;)V
    .locals 0

    invoke-static {p3}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/feature/transferorder/operator/a$b;->d:LY94;

    invoke-static {p4}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/feature/transferorder/operator/a$b;->e:LY94;

    iget-object p2, p0, Lco/bird/android/feature/transferorder/operator/a$b;->d:LY94;

    invoke-static {p2, p1}, LHp3;->a(LY94;LY94;)LHp3;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/feature/transferorder/operator/a$b;->f:LY94;

    return-void
.end method

.method public final g(La7;)La7;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/transferorder/operator/a$b;->e()Lj7;

    move-result-object v0

    invoke-static {p1, v0}, Lb7;->b(La7;Lj7;)V

    return-object p1
.end method

.method public final h(Lco/bird/android/feature/transferorder/operator/OperatorOrderActivity;)Lco/bird/android/feature/transferorder/operator/OperatorOrderActivity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/transferorder/operator/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, Lco/bird/android/feature/transferorder/operator/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, Lco/bird/android/feature/transferorder/operator/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, Lco/bird/android/feature/transferorder/operator/a$b;->n()LMp3;

    move-result-object v0

    invoke-static {p1, v0}, Lyo3;->c(Lco/bird/android/feature/transferorder/operator/OperatorOrderActivity;LMp3;)V

    iget-object v0, p0, Lco/bird/android/feature/transferorder/operator/a$b;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LGp3;

    invoke-static {p1, v0}, Lyo3;->b(Lco/bird/android/feature/transferorder/operator/OperatorOrderActivity;LGp3;)V

    return-object p1
.end method

.method public final i(LIo3;)LIo3;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/transferorder/operator/a$b;->l()Lhp3;

    move-result-object v0

    invoke-static {p1, v0}, LKo3;->c(LIo3;Lhp3;)V

    invoke-virtual {p0}, Lco/bird/android/feature/transferorder/operator/a$b;->k()LGo3;

    move-result-object v0

    invoke-static {p1, v0}, LKo3;->a(LIo3;LGo3;)V

    return-object p1
.end method

.method public final j(Lrp3;)Lrp3;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/transferorder/operator/a$b;->m()LCp3;

    move-result-object v0

    invoke-static {p1, v0}, Lsp3;->b(Lrp3;LCp3;)V

    return-object p1
.end method

.method public final k()LGo3;
    .locals 2

    new-instance v0, LGo3;

    iget-object v1, p0, Lco/bird/android/feature/transferorder/operator/a$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->R1()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, LGo3;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final l()Lhp3;
    .locals 4

    new-instance v0, Lhp3;

    iget-object v1, p0, Lco/bird/android/feature/transferorder/operator/a$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->p()LO86;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO86;

    iget-object v2, p0, Lco/bird/android/feature/transferorder/operator/a$b;->b:Lco/bird/android/core/mrp/BaseActivityLite$a;

    invoke-interface {v2}, Lco/bird/android/core/mrp/BaseActivityLite$a;->a()LDQ3;

    move-result-object v2

    invoke-static {v2}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LDQ3;

    iget-object v3, p0, Lco/bird/android/feature/transferorder/operator/a$b;->a:LlG2;

    invoke-interface {v3}, LlG2;->w2()Le13;

    move-result-object v3

    invoke-static {v3}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le13;

    invoke-direct {v0, v1, v2, v3}, Lhp3;-><init>(LO86;LDQ3;Le13;)V

    return-object v0
.end method

.method public final m()LCp3;
    .locals 3

    new-instance v0, LCp3;

    iget-object v1, p0, Lco/bird/android/feature/transferorder/operator/a$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->p()LO86;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO86;

    iget-object v2, p0, Lco/bird/android/feature/transferorder/operator/a$b;->f:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LGp3;

    invoke-direct {v0, v1, v2}, LCp3;-><init>(LO86;LGp3;)V

    return-object v0
.end method

.method public final n()LMp3;
    .locals 3

    new-instance v0, LMp3;

    iget-object v1, p0, Lco/bird/android/feature/transferorder/operator/a$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->p()LO86;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO86;

    iget-object v2, p0, Lco/bird/android/feature/transferorder/operator/a$b;->f:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LGp3;

    invoke-direct {v0, v1, v2}, LMp3;-><init>(LO86;LGp3;)V

    return-object v0
.end method
