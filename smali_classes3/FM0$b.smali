.class public final LFM0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpa3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LFM0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:LFM0$b;

.field public c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LAa3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbd3;LlG2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LFM0$b;->b:LFM0$b;

    iput-object p2, p0, LFM0$b;->a:LlG2;

    invoke-virtual {p0, p1, p2}, LFM0$b;->g(Lbd3;LlG2;)V

    return-void
.end method

.method public synthetic constructor <init>(Lbd3;LlG2;LGM0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LFM0$b;-><init>(Lbd3;LlG2;)V

    return-void
.end method

.method public static bridge synthetic e(LFM0$b;)LY94;
    .locals 0

    iget-object p0, p0, LFM0$b;->c:LY94;

    return-object p0
.end method

.method public static bridge synthetic f(LFM0$b;)LlG2;
    .locals 0

    iget-object p0, p0, LFM0$b;->a:LlG2;

    return-object p0
.end method


# virtual methods
.method public a(Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, LFM0$b;->h(Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;)Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;

    return-void
.end method

.method public b()LAa3;
    .locals 1

    iget-object v0, p0, LFM0$b;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LAa3;

    return-object v0
.end method

.method public c(Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, LFM0$b;->i(Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;)Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;

    return-void
.end method

.method public d()Lza3$a;
    .locals 3

    new-instance v0, LFM0$c;

    iget-object v1, p0, LFM0$b;->b:LFM0$b;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LFM0$c;-><init>(LFM0$b;LHM0;)V

    return-object v0
.end method

.method public final g(Lbd3;LlG2;)V
    .locals 0

    invoke-static {p1}, Lcd3;->a(Lbd3;)Lcd3;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, LFM0$b;->c:LY94;

    return-void
.end method

.method public final h(Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;)Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;
    .locals 1

    iget-object v0, p0, LFM0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, LFM0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, LFM0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    iget-object v0, p0, LFM0$b;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LAa3;

    invoke-static {p1, v0}, Lla3;->a(Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;LAa3;)V

    return-object p1
.end method

.method public final i(Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;)Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;
    .locals 1

    iget-object v0, p0, LFM0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LKy;->b(Lco/bird/android/core/mrp/BaseActivityLite;Le13;)V

    iget-object v0, p0, LFM0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LKy;->c(Lco/bird/android/core/mrp/BaseActivityLite;Lgl;)V

    iget-object v0, p0, LFM0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LKy;->d(Lco/bird/android/core/mrp/BaseActivityLite;LTq4;)V

    invoke-virtual {p0}, LFM0$b;->j()LKc3;

    move-result-object v0

    invoke-static {p1, v0}, LEc3;->b(Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;LKc3;)V

    return-object p1
.end method

.method public final j()LKc3;
    .locals 4

    new-instance v0, LKc3;

    iget-object v1, p0, LFM0$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->O0()LDa3;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LDa3;

    iget-object v2, p0, LFM0$b;->a:LlG2;

    invoke-interface {v2}, LlG2;->d0()LEa;

    move-result-object v2

    invoke-static {v2}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LEa;

    iget-object v3, p0, LFM0$b;->a:LlG2;

    invoke-interface {v3}, LlG2;->m3()LNV0;

    move-result-object v3

    invoke-static {v3}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LNV0;

    invoke-direct {v0, v1, v2, v3}, LKc3;-><init>(LDa3;LEa;LNV0;)V

    return-object v0
.end method
