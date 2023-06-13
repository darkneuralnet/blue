.class public final Lgy5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lco/bird/android/lib/shaketoreport/shakedetector/ShakeToReportDetector;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LLifecycleOwner;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Llh6;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/app/Application;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "LLifecycleOwner;",
            ">;",
            "LY94<",
            "Llh6;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgy5;->a:LY94;

    iput-object p2, p0, Lgy5;->b:LY94;

    iput-object p3, p0, Lgy5;->c:LY94;

    iput-object p4, p0, Lgy5;->d:LY94;

    iput-object p5, p0, Lgy5;->e:LY94;

    iput-object p6, p0, Lgy5;->f:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;)Lgy5;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/app/Application;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "LLifecycleOwner;",
            ">;",
            "LY94<",
            "Llh6;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;)",
            "Lgy5;"
        }
    .end annotation

    new-instance v7, Lgy5;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lgy5;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v7
.end method

.method public static c(Landroid/app/Application;Le13;LLifecycleOwner;Llh6;LTq4;Lgl;)Lco/bird/android/lib/shaketoreport/shakedetector/ShakeToReportDetector;
    .locals 8

    new-instance v7, Lco/bird/android/lib/shaketoreport/shakedetector/ShakeToReportDetector;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lco/bird/android/lib/shaketoreport/shakedetector/ShakeToReportDetector;-><init>(Landroid/app/Application;Le13;LLifecycleOwner;Llh6;LTq4;Lgl;)V

    return-object v7
.end method


# virtual methods
.method public b()Lco/bird/android/lib/shaketoreport/shakedetector/ShakeToReportDetector;
    .locals 7

    iget-object v0, p0, Lgy5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/app/Application;

    iget-object v0, p0, Lgy5;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Le13;

    iget-object v0, p0, Lgy5;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LLifecycleOwner;

    iget-object v0, p0, Lgy5;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Llh6;

    iget-object v0, p0, Lgy5;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LTq4;

    iget-object v0, p0, Lgy5;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lgl;

    invoke-static/range {v1 .. v6}, Lgy5;->c(Landroid/app/Application;Le13;LLifecycleOwner;Llh6;LTq4;Lgl;)Lco/bird/android/lib/shaketoreport/shakedetector/ShakeToReportDetector;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lgy5;->b()Lco/bird/android/lib/shaketoreport/shakedetector/ShakeToReportDetector;

    move-result-object v0

    return-object v0
.end method
