.class public final Lco/bird/android/core/mrp/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/core/mrp/BaseActivityLite$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/core/mrp/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/core/mrp/a$a$b;,
        Lco/bird/android/core/mrp/a$a$a;
    }
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Lco/bird/android/core/mrp/a$a;

.field public c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field public d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field

.field public e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field

.field public f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LDQ3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LlG2;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lco/bird/android/core/mrp/a$a;->b:Lco/bird/android/core/mrp/a$a;

    iput-object p1, p0, Lco/bird/android/core/mrp/a$a;->a:LlG2;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/core/mrp/a$a;->c(LlG2;Landroid/app/Activity;)V

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Landroid/app/Activity;LMG0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lco/bird/android/core/mrp/a$a;-><init>(LlG2;Landroid/app/Activity;)V

    return-void
.end method


# virtual methods
.method public a()LDQ3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/core/mrp/a$a;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDQ3;

    return-object v0
.end method

.method public b(Lco/bird/android/core/mrp/BaseActivityLite;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/core/mrp/a$a;->d(Lco/bird/android/core/mrp/BaseActivityLite;)Lco/bird/android/core/mrp/BaseActivityLite;

    return-void
.end method

.method public final c(LlG2;Landroid/app/Activity;)V
    .locals 1

    invoke-static {p2}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p2

    iput-object p2, p0, Lco/bird/android/core/mrp/a$a;->c:LY94;

    new-instance p2, Lco/bird/android/core/mrp/a$a$b;

    invoke-direct {p2, p1}, Lco/bird/android/core/mrp/a$a$b;-><init>(LlG2;)V

    iput-object p2, p0, Lco/bird/android/core/mrp/a$a;->d:LY94;

    new-instance p2, Lco/bird/android/core/mrp/a$a$a;

    invoke-direct {p2, p1}, Lco/bird/android/core/mrp/a$a$a;-><init>(LlG2;)V

    iput-object p2, p0, Lco/bird/android/core/mrp/a$a;->e:LY94;

    iget-object p1, p0, Lco/bird/android/core/mrp/a$a;->c:LY94;

    iget-object v0, p0, Lco/bird/android/core/mrp/a$a;->d:LY94;

    invoke-static {p1, v0, p2}, LEQ3;->a(LY94;LY94;LY94;)LEQ3;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/core/mrp/a$a;->f:LY94;

    return-void
.end method

.method public final d(Lco/bird/android/core/mrp/BaseActivityLite;)Lco/bird/android/core/mrp/BaseActivityLite;
    .locals 1

    iget-object v0, p0, Lco/bird/android/core/mrp/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, Lco/bird/android/core/mrp/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, Lco/bird/android/core/mrp/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    return-object p1
.end method
