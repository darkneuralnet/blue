.class public final Lco/bird/android/feature/complaintresolution/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/complaintresolution/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/complaintresolution/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lco/bird/android/feature/complaintresolution/b$a;


# direct methods
.method public constructor <init>(LlG2;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlG2;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lco/bird/android/feature/complaintresolution/b$a;->c:Lco/bird/android/feature/complaintresolution/b$a;

    iput-object p1, p0, Lco/bird/android/feature/complaintresolution/b$a;->a:LlG2;

    iput-object p2, p0, Lco/bird/android/feature/complaintresolution/b$a;->b:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Ljava/util/List;LcI0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lco/bird/android/feature/complaintresolution/b$a;-><init>(LlG2;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/complaintresolution/b$a;->d(Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;)Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;

    return-void
.end method

.method public final b()LIq0;
    .locals 3

    new-instance v0, LIq0;

    iget-object v1, p0, Lco/bird/android/feature/complaintresolution/b$a;->a:LlG2;

    invoke-interface {v1}, LlG2;->R1()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, Lco/bird/android/feature/complaintresolution/b$a;->a:LlG2;

    invoke-interface {v2}, LlG2;->F0()Lom3;

    move-result-object v2

    invoke-static {v2}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lom3;

    invoke-direct {v0, v1, v2}, LIq0;-><init>(Landroid/content/Context;Lom3;)V

    return-object v0
.end method

.method public final c()Lzr0;
    .locals 5

    new-instance v0, Lzr0;

    iget-object v1, p0, Lco/bird/android/feature/complaintresolution/b$a;->b:Ljava/util/List;

    iget-object v2, p0, Lco/bird/android/feature/complaintresolution/b$a;->a:LlG2;

    invoke-interface {v2}, LlG2;->F0()Lom3;

    move-result-object v2

    invoke-static {v2}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lom3;

    invoke-virtual {p0}, Lco/bird/android/feature/complaintresolution/b$a;->b()LIq0;

    move-result-object v3

    iget-object v4, p0, Lco/bird/android/feature/complaintresolution/b$a;->a:LlG2;

    invoke-interface {v4}, LlG2;->w2()Le13;

    move-result-object v4

    invoke-static {v4}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le13;

    invoke-direct {v0, v1, v2, v3, v4}, Lzr0;-><init>(Ljava/util/List;Lom3;LIq0;Le13;)V

    return-object v0
.end method

.method public final d(Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;)Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/b$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/b$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, Lco/bird/android/feature/complaintresolution/b$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, Lco/bird/android/feature/complaintresolution/b$a;->c()Lzr0;

    move-result-object v0

    invoke-static {p1, v0}, Lwq0;->b(Lco/bird/android/feature/complaintresolution/ComplaintResolutionActivity;Lzr0;)V

    return-object p1
.end method
