.class public final Lco/bird/android/feature/tutorial/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/tutorial/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/tutorial/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/tutorial/a$b$b;,
        Lco/bird/android/feature/tutorial/a$b$c;,
        Lco/bird/android/feature/tutorial/a$b$a;
    }
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Lco/bird/android/feature/tutorial/a$b;

.field public c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field

.field public d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LNa6;",
            ">;"
        }
    .end annotation
.end field

.field public f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LFa6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LHa6;LlG2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lco/bird/android/feature/tutorial/a$b;->b:Lco/bird/android/feature/tutorial/a$b;

    iput-object p2, p0, Lco/bird/android/feature/tutorial/a$b;->a:LlG2;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/feature/tutorial/a$b;->b(LHa6;LlG2;)V

    return-void
.end method

.method public synthetic constructor <init>(LHa6;LlG2;LkR0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lco/bird/android/feature/tutorial/a$b;-><init>(LHa6;LlG2;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/tutorial/TutorialActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/tutorial/a$b;->c(Lco/bird/android/feature/tutorial/TutorialActivity;)Lco/bird/android/feature/tutorial/TutorialActivity;

    return-void
.end method

.method public final b(LHa6;LlG2;)V
    .locals 2

    new-instance v0, Lco/bird/android/feature/tutorial/a$b$b;

    invoke-direct {v0, p2}, Lco/bird/android/feature/tutorial/a$b$b;-><init>(LlG2;)V

    iput-object v0, p0, Lco/bird/android/feature/tutorial/a$b;->c:LY94;

    new-instance v0, Lco/bird/android/feature/tutorial/a$b$c;

    invoke-direct {v0, p2}, Lco/bird/android/feature/tutorial/a$b$c;-><init>(LlG2;)V

    iput-object v0, p0, Lco/bird/android/feature/tutorial/a$b;->d:LY94;

    iget-object v1, p0, Lco/bird/android/feature/tutorial/a$b;->c:LY94;

    invoke-static {p1, v1, v0}, LIa6;->a(LHa6;LY94;LY94;)LIa6;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/feature/tutorial/a$b;->e:LY94;

    new-instance p1, Lco/bird/android/feature/tutorial/a$b$a;

    invoke-direct {p1, p2}, Lco/bird/android/feature/tutorial/a$b$a;-><init>(LlG2;)V

    iput-object p1, p0, Lco/bird/android/feature/tutorial/a$b;->f:LY94;

    invoke-static {p1}, LGa6;->a(LY94;)LGa6;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/feature/tutorial/a$b;->g:LY94;

    return-void
.end method

.method public final c(Lco/bird/android/feature/tutorial/TutorialActivity;)Lco/bird/android/feature/tutorial/TutorialActivity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/tutorial/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, Lco/bird/android/feature/tutorial/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, Lco/bird/android/feature/tutorial/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    iget-object v0, p0, Lco/bird/android/feature/tutorial/a$b;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LNa6;

    invoke-static {p1, v0}, LCa6;->c(Lco/bird/android/feature/tutorial/TutorialActivity;LNa6;)V

    iget-object v0, p0, Lco/bird/android/feature/tutorial/a$b;->g:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFa6;

    invoke-static {p1, v0}, LCa6;->a(Lco/bird/android/feature/tutorial/TutorialActivity;LFa6;)V

    return-object p1
.end method
