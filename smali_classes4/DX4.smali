.class public final LDX4;
.super LCX4;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/RidePassView;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lgz5;

.field public final d:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, LCX4;-><init>()V

    iput-object p1, p0, LDX4;->a:LEb5;

    new-instance v0, LDX4$b;

    invoke-direct {v0, p0, p1}, LDX4$b;-><init>(LDX4;LEb5;)V

    iput-object v0, p0, LDX4;->b:Lcf1;

    new-instance v0, LDX4$c;

    invoke-direct {v0, p0, p1}, LDX4$c;-><init>(LDX4;LEb5;)V

    iput-object v0, p0, LDX4;->c:Lgz5;

    new-instance v0, LDX4$d;

    invoke-direct {v0, p0, p1}, LDX4$d;-><init>(LDX4;LEb5;)V

    iput-object v0, p0, LDX4;->d:Lgz5;

    return-void
.end method

.method public static bridge synthetic f(LDX4;)LEb5;
    .locals 0

    iget-object p0, p0, LDX4;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic g(LDX4;)Lcf1;
    .locals 0

    iget-object p0, p0, LDX4;->b:Lcf1;

    return-object p0
.end method

.method public static bridge synthetic h(LDX4;)Lgz5;
    .locals 0

    iget-object p0, p0, LDX4;->d:Lgz5;

    return-object p0
.end method

.method public static i()Ljava/util/List;
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

    new-instance v0, LDX4$g;

    invoke-direct {v0, p0}, LDX4$g;-><init>(LDX4;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public b()Lio/reactivex/c;
    .locals 1

    new-instance v0, LDX4$f;

    invoke-direct {v0, p0}, LDX4$f;-><init>(LDX4;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public c()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/RidePassView;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT `ride_pass_view`.`id` AS `id`, `ride_pass_view`.`link_code` AS `link_code`, `ride_pass_view`.`user_ride_pass_id` AS `user_ride_pass_id`, `ride_pass_view`.`price` AS `price`, `ride_pass_view`.`price_tax` AS `price_tax`, `ride_pass_view`.`previous_price` AS `previous_price`, `ride_pass_view`.`currency` AS `currency`, `ride_pass_view`.`banner_image_url` AS `banner_image_url`, `ride_pass_view`.`banner_action` AS `banner_action`, `ride_pass_view`.`title` AS `title`, `ride_pass_view`.`zendesk_article_id` AS `zendesk_article_id`, `ride_pass_view`.`confirmation_toast` AS `confirmation_toast`, `ride_pass_view`.`label` AS `label`, `ride_pass_view`.`status` AS `status`, `ride_pass_view`.`ineligible_reason` AS `ineligible_reason`, `ride_pass_view`.`remaining_device_transfer_count` AS `remaining_device_transfer_count`, `ride_pass_view`.`cancel_article_id` AS `cancel_article_id`, `ride_pass_view`.`footer` AS `footer`, `ride_pass_view`.`detail_body` AS `detail_body`, `ride_pass_view`.`detail_image_url` AS `detail_image_url`, `ride_pass_view`.`detail_action` AS `detail_action`, `ride_pass_view`.`detail_body_list` AS `detail_body_list`, `ride_pass_view`.`detail_footer` AS `detail_footer`, `ride_pass_view`.`subscription_plan` AS `subscription_plan`, `ride_pass_view`.`user_subscription` AS `user_subscription`, `ride_pass_view`.`created_at` AS `created_at`, `ride_pass_view`.`expires_at` AS `expires_at` FROM ride_pass_view"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    iget-object v2, p0, LDX4;->a:LEb5;

    const-string v3, "ride_pass_view"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    new-instance v4, LDX4$h;

    invoke-direct {v4, p0, v0}, LDX4$h;-><init>(LDX4;LHb5;)V

    invoke-static {v2, v1, v3, v4}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/util/List;)Lio/reactivex/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/RidePassView;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    new-instance v0, LDX4$e;

    invoke-direct {v0, p0, p1}, LDX4$e;-><init>(LDX4;Ljava/util/List;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/RidePassView;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM ride_pass_view WHERE link_code = ?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, LDX4;->a:LEb5;

    const-string v1, "ride_pass_view"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, LDX4$a;

    invoke-direct {v2, p0, v0}, LDX4$a;-><init>(LDX4;LHb5;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, v1, v2}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
