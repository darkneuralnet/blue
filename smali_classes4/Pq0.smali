.class public final LPq0;
.super LOq0;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/ComplaintResolutionForm;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, LOq0;-><init>()V

    iput-object p1, p0, LPq0;->a:LEb5;

    new-instance v0, LPq0$a;

    invoke-direct {v0, p0, p1}, LPq0$a;-><init>(LPq0;LEb5;)V

    iput-object v0, p0, LPq0;->b:Lcf1;

    new-instance v0, LPq0$b;

    invoke-direct {v0, p0, p1}, LPq0$b;-><init>(LPq0;LEb5;)V

    iput-object v0, p0, LPq0;->c:Lgz5;

    return-void
.end method

.method public static bridge synthetic d(LPq0;)LEb5;
    .locals 0

    iget-object p0, p0, LPq0;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic e(LPq0;)Lcf1;
    .locals 0

    iget-object p0, p0, LPq0;->b:Lcf1;

    return-object p0
.end method

.method public static bridge synthetic f(LPq0;)Lgz5;
    .locals 0

    iget-object p0, p0, LPq0;->c:Lgz5;

    return-object p0
.end method

.method public static g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Lio/reactivex/c;
    .locals 1

    new-instance v0, LPq0$d;

    invoke-direct {v0, p0}, LPq0$d;-><init>(LPq0;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public b()Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/persistence/ComplaintResolutionForm;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT `complaint_resolution_form`.`action_taken_required_fields` AS `action_taken_required_fields`, `complaint_resolution_form`.`no_action_taken_required_fields` AS `no_action_taken_required_fields`, `complaint_resolution_form`.`issue_options` AS `issue_options`, `complaint_resolution_form`.`action_taken_options` AS `action_taken_options` FROM complaint_resolution_form LIMIT 1"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    new-instance v1, LPq0$e;

    invoke-direct {v1, p0, v0}, LPq0$e;-><init>(LPq0;LHb5;)V

    invoke-static {v1}, LZe5;->e(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public c(Lco/bird/android/model/persistence/ComplaintResolutionForm;)Lio/reactivex/c;
    .locals 1

    new-instance v0, LPq0$c;

    invoke-direct {v0, p0, p1}, LPq0$c;-><init>(LPq0;Lco/bird/android/model/persistence/ComplaintResolutionForm;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method
