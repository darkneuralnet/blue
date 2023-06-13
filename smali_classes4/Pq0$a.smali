.class public LPq0$a;
.super Lcf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPq0;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcf1<",
        "Lco/bird/android/model/persistence/ComplaintResolutionForm;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:LPq0;


# direct methods
.method public constructor <init>(LPq0;LEb5;)V
    .locals 0

    iput-object p1, p0, LPq0$a;->d:LPq0;

    invoke-direct {p0, p2}, Lcf1;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `complaint_resolution_form` (`action_taken_required_fields`,`no_action_taken_required_fields`,`issue_options`,`action_taken_options`) VALUES (?,?,?,?)"

    return-object v0
.end method

.method public bridge synthetic i(LqV5;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lco/bird/android/model/persistence/ComplaintResolutionForm;

    invoke-virtual {p0, p1, p2}, LPq0$a;->p(LqV5;Lco/bird/android/model/persistence/ComplaintResolutionForm;)V

    return-void
.end method

.method public p(LqV5;Lco/bird/android/model/persistence/ComplaintResolutionForm;)V
    .locals 2

    sget-object v0, LLq0;->a:LLq0;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/ComplaintResolutionForm;->getActionTakenRequiredFields()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LLq0;->e(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/ComplaintResolutionForm;->getNoActionTakenRequiredFields()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LLq0;->e(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, Lco/bird/android/model/persistence/ComplaintResolutionForm;->getIssueOptions()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LLq0;->f(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_2

    :cond_2
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, Lco/bird/android/model/persistence/ComplaintResolutionForm;->getActionTakenOptions()Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, LLq0;->f(Ljava/util/List;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x4

    if-nez p2, :cond_3

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_3

    :cond_3
    invoke-interface {p1, v0, p2}, LoV5;->G0(ILjava/lang/String;)V

    :goto_3
    return-void
.end method
