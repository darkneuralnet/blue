.class public LG10;
.super LT20;
.source "SourceFile"


# instance fields
.field public A:LPd6;

.field public B:LX9;

.field public C:Landroid/content/Context;

.field public d:LK10;

.field public e:LJ10;

.field public f:Lcom/google/android/gms/common/api/GoogleApiClient;

.field public g:LSD0;

.field public h:Lcom/braintreepayments/api/models/Authorization;

.field public i:Lex0;

.field public final j:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lgd4;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/braintreepayments/api/models/PaymentMethodNonce;",
            ">;"
        }
    .end annotation
.end field

.field public l:Z

.field public m:Z

.field public n:I

.field public o:Ljava/lang/String;

.field public p:Ljava/lang/String;

.field public q:Ljava/lang/String;

.field public r:Lfa;

.field public s:LCx0;

.field public t:LN10;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LN10<",
            "Ljava/lang/Exception;",
            ">;"
        }
    .end annotation
.end field

.field public u:LE10;

.field public v:LPN3;

.field public w:LMN3;

.field public x:LNN3;

.field public y:LF10;

.field public z:LM10;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LT20;-><init>()V

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, LG10;->j:Ljava/util/Queue;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LG10;->k:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, LG10;->l:Z

    iput v0, p0, LG10;->n:I

    return-void
.end method

.method public static synthetic A9(LG10;)LCx0;
    .locals 0

    iget-object p0, p0, LG10;->s:LCx0;

    return-object p0
.end method

.method public static synthetic B9(LG10;)LN10;
    .locals 0

    iget-object p0, p0, LG10;->t:LN10;

    return-object p0
.end method

.method public static synthetic D9(LG10;)LE10;
    .locals 0

    iget-object p0, p0, LG10;->u:LE10;

    return-object p0
.end method

.method public static synthetic E9(LG10;)LMN3;
    .locals 0

    iget-object p0, p0, LG10;->w:LMN3;

    return-object p0
.end method

.method public static synthetic G9(LG10;)LF10;
    .locals 0

    iget-object p0, p0, LG10;->y:LF10;

    return-object p0
.end method

.method public static oa(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)LG10;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/braintreepayments/api/exceptions/InvalidArgumentException;
        }
    .end annotation

    if-eqz p0, :cond_3

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BraintreeFragment."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-static {v1}, Ljava/util/UUID;->nameUUIDFromBytes([B)Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/FragmentManager;->m0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/FragmentManager;->m0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p0

    check-cast p0, LG10;

    return-object p0

    :cond_0
    new-instance v1, LG10;

    invoke-direct {v1}, LG10;-><init>()V

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    :try_start_0
    invoke-static {p2}, Lcom/braintreepayments/api/models/Authorization;->a(Ljava/lang/String;)Lcom/braintreepayments/api/models/Authorization;

    move-result-object p2

    const-string v3, "com.braintreepayments.api.EXTRA_AUTHORIZATION_TOKEN"

    invoke-virtual {v2, v3, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
    :try_end_0
    .catch Lcom/braintreepayments/api/exceptions/InvalidArgumentException; {:try_start_0 .. :try_end_0} :catch_3

    const-string p2, "com.braintreepayments.api.EXTRA_SESSION_ID"

    invoke-static {}, Lqd6;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, p2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "com.braintreepayments.api.EXTRA_INTEGRATION_TYPE"

    invoke-static {p0}, LR52;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, p2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    :try_start_1
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->q()Landroidx/fragment/app/m;

    move-result-object p2

    invoke-virtual {p2, v1, v0}, Landroidx/fragment/app/m;->e(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/m;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/fragment/app/m;->k()V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    :try_start_2
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->q()Landroidx/fragment/app/m;

    move-result-object p2

    invoke-virtual {p2, v1, v0}, Landroidx/fragment/app/m;->e(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/m;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/fragment/app/m;->i()I
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2

    :try_start_3
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->h0()Z
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    :goto_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    iput-object p0, v1, LG10;->C:Landroid/content/Context;

    return-object v1

    :catch_2
    move-exception p0

    new-instance p1, Lcom/braintreepayments/api/exceptions/InvalidArgumentException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/braintreepayments/api/exceptions/InvalidArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_3
    new-instance p0, Lcom/braintreepayments/api/exceptions/InvalidArgumentException;

    const-string p1, "Tokenization Key or client token was invalid."

    invoke-direct {p0, p1}, Lcom/braintreepayments/api/exceptions/InvalidArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Lcom/braintreepayments/api/exceptions/InvalidArgumentException;

    const-string p1, "Tokenization Key or Client Token is null."

    invoke-direct {p0, p1}, Lcom/braintreepayments/api/exceptions/InvalidArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Lcom/braintreepayments/api/exceptions/InvalidArgumentException;

    const-string p1, "FragmentManager is null"

    invoke-direct {p0, p1}, Lcom/braintreepayments/api/exceptions/InvalidArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Lcom/braintreepayments/api/exceptions/InvalidArgumentException;

    const-string p1, "Context is null"

    invoke-direct {p0, p1}, Lcom/braintreepayments/api/exceptions/InvalidArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static sa(Landroidx/appcompat/app/AppCompatActivity;Ljava/lang/String;)LG10;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/braintreepayments/api/exceptions/InvalidArgumentException;
        }
    .end annotation

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-static {p0, v0, p1}, LG10;->oa(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)LG10;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lcom/braintreepayments/api/exceptions/InvalidArgumentException;

    const-string p1, "Activity is null"

    invoke-direct {p0, p1}, Lcom/braintreepayments/api/exceptions/InvalidArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic t8(LG10;)Lfa;
    .locals 0

    iget-object p0, p0, LG10;->r:Lfa;

    return-object p0
.end method


# virtual methods
.method public Aa(I)V
    .locals 1

    new-instance v0, LG10$g;

    invoke-direct {v0, p0, p1}, LG10$g;-><init>(LG10;I)V

    invoke-virtual {p0, v0}, LG10;->Ca(Lgd4;)V

    return-void
.end method

.method public Ba()V
    .locals 1

    new-instance v0, LG10$f;

    invoke-direct {v0, p0}, LG10$f;-><init>(LG10;)V

    invoke-virtual {p0, v0}, LG10;->Ca(Lgd4;)V

    return-void
.end method

.method public Ca(Lgd4;)V
    .locals 2

    invoke-interface {p1}, Lgd4;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LG10;->j:Ljava/util/Queue;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LG10;->j:Ljava/util/Queue;

    invoke-interface {v1, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    invoke-interface {p1}, Lgd4;->run()V

    :goto_0
    return-void
.end method

.method public Da(LL10;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "LL10;",
            ">(TT;)V"
        }
    .end annotation

    instance-of v0, p1, LCx0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-object v1, p0, LG10;->s:LCx0;

    :cond_0
    instance-of v0, p1, LE10;

    if-eqz v0, :cond_1

    iput-object v1, p0, LG10;->u:LE10;

    :cond_1
    instance-of v0, p1, LPN3;

    if-eqz v0, :cond_2

    iput-object v1, p0, LG10;->v:LPN3;

    :cond_2
    instance-of v0, p1, LMN3;

    if-eqz v0, :cond_3

    iput-object v1, p0, LG10;->w:LMN3;

    :cond_3
    instance-of v0, p1, LNN3;

    if-eqz v0, :cond_4

    iput-object v1, p0, LG10;->x:LNN3;

    :cond_4
    instance-of v0, p1, LM10;

    if-eqz v0, :cond_5

    iput-object v1, p0, LG10;->z:LM10;

    :cond_5
    instance-of v0, p1, LF10;

    if-eqz v0, :cond_6

    iput-object v1, p0, LG10;->y:LF10;

    :cond_6
    instance-of v0, p1, LPd6;

    if-eqz v0, :cond_7

    iput-object v1, p0, LG10;->A:LPd6;

    :cond_7
    instance-of p1, p1, LX9;

    if-eqz p1, :cond_8

    iput-object v1, p0, LG10;->B:LX9;

    :cond_8
    return-void
.end method

.method public Ea(Ljava/lang/String;)V
    .locals 4

    new-instance v0, Lja;

    iget-object v1, p0, LG10;->C:Landroid/content/Context;

    invoke-virtual {p0}, LG10;->la()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, LG10;->o:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p1}, Lja;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, LG10$e;

    invoke-direct {p1, p0, v0}, LG10$e;-><init>(LG10;Lja;)V

    invoke-virtual {p0, p1}, LG10;->Ja(LCx0;)V

    return-void
.end method

.method public Ga(Lex0;)V
    .locals 2

    iput-object p1, p0, LG10;->i:Lex0;

    invoke-virtual {p0}, LG10;->ha()LK10;

    move-result-object v0

    invoke-virtual {p1}, Lex0;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LyN1;->i(Ljava/lang/String;)LyN1;

    invoke-virtual {p1}, Lex0;->d()LTD1;

    move-result-object v0

    invoke-virtual {v0}, LTD1;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LJ10;

    invoke-virtual {p1}, Lex0;->d()LTD1;

    move-result-object p1

    invoke-virtual {p1}, LTD1;->b()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, LG10;->h:Lcom/braintreepayments/api/models/Authorization;

    invoke-virtual {v1}, Lcom/braintreepayments/api/models/Authorization;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1}, LJ10;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, LG10;->e:LJ10;

    :cond_0
    return-void
.end method

.method public I9(LL10;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "LL10;",
            ">(TT;)V"
        }
    .end annotation

    instance-of v0, p1, LCx0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LCx0;

    iput-object v0, p0, LG10;->s:LCx0;

    :cond_0
    instance-of v0, p1, LE10;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, LE10;

    iput-object v0, p0, LG10;->u:LE10;

    :cond_1
    instance-of v0, p1, LPN3;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, LPN3;

    iput-object v0, p0, LG10;->v:LPN3;

    :cond_2
    instance-of v0, p1, LMN3;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, LMN3;

    iput-object v0, p0, LG10;->w:LMN3;

    :cond_3
    instance-of v0, p1, LNN3;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, LNN3;

    iput-object v0, p0, LG10;->x:LNN3;

    :cond_4
    instance-of v0, p1, LM10;

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, LM10;

    iput-object v0, p0, LG10;->z:LM10;

    :cond_5
    instance-of v0, p1, LF10;

    if-eqz v0, :cond_6

    move-object v0, p1

    check-cast v0, LF10;

    iput-object v0, p0, LG10;->y:LF10;

    :cond_6
    instance-of v0, p1, LPd6;

    if-eqz v0, :cond_7

    move-object v0, p1

    check-cast v0, LPd6;

    iput-object v0, p0, LG10;->A:LPd6;

    :cond_7
    instance-of v0, p1, LX9;

    if-eqz v0, :cond_8

    check-cast p1, LX9;

    iput-object p1, p0, LG10;->B:LX9;

    :cond_8
    invoke-virtual {p0}, LG10;->S9()V

    return-void
.end method

.method public J9()V
    .locals 2

    invoke-virtual {p0}, LG10;->ea()Lex0;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-static {}, LDx0;->e()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LG10;->h:Lcom/braintreepayments/api/models/Authorization;

    if-eqz v0, :cond_2

    iget-object v0, p0, LG10;->d:LK10;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, LG10;->n:I

    const/4 v1, 0x3

    if-lt v0, v1, :cond_1

    new-instance v0, Lcom/braintreepayments/api/exceptions/ConfigurationException;

    const-string v1, "Configuration retry limit has been exceeded. Create a new BraintreeFragment and try again."

    invoke-direct {v0, v1}, Lcom/braintreepayments/api/exceptions/ConfigurationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LG10;->ya(Ljava/lang/Exception;)V

    return-void

    :cond_1
    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LG10;->n:I

    new-instance v0, LG10$b;

    invoke-direct {v0, p0}, LG10$b;-><init>(LG10;)V

    new-instance v1, LG10$c;

    invoke-direct {v1, p0}, LG10$c;-><init>(LG10;)V

    invoke-static {p0, v0, v1}, LDx0;->d(LG10;LCx0;LN10;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public Ja(LCx0;)V
    .locals 1

    invoke-virtual {p0}, LG10;->J9()V

    new-instance v0, LG10$d;

    invoke-direct {v0, p0, p1}, LG10$d;-><init>(LG10;LCx0;)V

    invoke-virtual {p0, v0}, LG10;->Ca(Lgd4;)V

    return-void
.end method

.method public N6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LG10;->q:Ljava/lang/String;

    return-object v0
.end method

.method public final P9()V
    .locals 5

    invoke-virtual {p0}, LG10;->ea()Lex0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LG10;->ea()Lex0;

    move-result-object v0

    invoke-virtual {v0}, Lex0;->h()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LG10;->ea()Lex0;

    move-result-object v0

    invoke-virtual {v0}, Lex0;->b()Laa;

    move-result-object v0

    invoke-virtual {v0}, Laa;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, LG10;->C:Landroid/content/Context;

    const-class v2, Lcom/braintreepayments/api/internal/AnalyticsIntentService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0}, LG10;->da()Lcom/braintreepayments/api/models/Authorization;

    move-result-object v1

    invoke-virtual {v1}, Lcom/braintreepayments/api/models/Authorization;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.braintreepayments.api.internal.AnalyticsIntentService.EXTRA_AUTHORIZATION"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0}, LG10;->ea()Lex0;

    move-result-object v1

    invoke-virtual {v1}, Lex0;->h()Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.braintreepayments.api.internal.AnalyticsIntentService.EXTRA_CONFIGURATION"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    :try_start_0
    invoke-virtual {p0}, LG10;->T9()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {p0}, LG10;->T9()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, LG10;->h:Lcom/braintreepayments/api/models/Authorization;

    invoke-virtual {p0}, LG10;->ha()LK10;

    move-result-object v2

    invoke-virtual {p0}, LG10;->ea()Lex0;

    move-result-object v3

    invoke-virtual {v3}, Lex0;->b()Laa;

    move-result-object v3

    invoke-virtual {v3}, Laa;->b()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, LVa;->d(Landroid/content/Context;Lcom/braintreepayments/api/models/Authorization;LK10;Ljava/lang/String;Z)V

    :cond_0
    :goto_0
    return-void
.end method

.method public S9()V
    .locals 4

    iget-object v0, p0, LG10;->j:Ljava/util/Queue;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/ArrayDeque;

    iget-object v2, p0, LG10;->j:Ljava/util/Queue;

    invoke-direct {v1, v2}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lgd4;

    invoke-interface {v2}, Lgd4;->a()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Lgd4;->run()V

    iget-object v3, p0, LG10;->j:Ljava/util/Queue;

    invoke-interface {v3, v2}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public T9()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, LG10;->C:Landroid/content/Context;

    return-object v0
.end method

.method public d4(ILZ20;Landroid/net/Uri;)V
    .locals 5

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "com.braintreepayments.api.WAS_BROWSER_SWITCH_RESULT"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v0

    const/16 v1, 0x34af

    if-eq p1, v1, :cond_2

    const/16 v1, 0x3517

    if-eq p1, v1, :cond_1

    const/16 v1, 0x351c

    if-eq p1, v1, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    const-string v1, "local-payment"

    goto :goto_0

    :cond_1
    const-string v1, "paypal"

    goto :goto_0

    :cond_2
    const-string v1, "three-d-secure"

    :goto_0
    invoke-virtual {p2}, LZ20;->b()I

    move-result v3

    if-ne v3, v2, :cond_3

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".browser-switch.succeeded"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, LG10;->Ea(Ljava/lang/String;)V

    const/4 v2, -0x1

    goto :goto_1

    :cond_3
    invoke-virtual {p2}, LZ20;->b()I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_4

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".browser-switch.canceled"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, LG10;->Ea(Ljava/lang/String;)V

    const/4 v2, 0x0

    goto :goto_1

    :cond_4
    invoke-virtual {p2}, LZ20;->b()I

    move-result v3

    const/4 v4, 0x3

    if-ne v3, v4, :cond_6

    invoke-virtual {p2}, LZ20;->a()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_5

    const-string v3, "No installed activities"

    invoke-virtual {p2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_5

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".browser-switch.failed.no-browser-installed"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, LG10;->Ea(Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".browser-switch.failed.not-setup"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, LG10;->Ea(Ljava/lang/String;)V

    :cond_6
    :goto_1
    invoke-virtual {v0, p3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object p2

    invoke-virtual {p0, p1, v2, p2}, LG10;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method

.method public da()Lcom/braintreepayments/api/models/Authorization;
    .locals 1

    iget-object v0, p0, LG10;->h:Lcom/braintreepayments/api/models/Authorization;

    return-object v0
.end method

.method public ea()Lex0;
    .locals 1

    iget-object v0, p0, LG10;->i:Lex0;

    return-object v0
.end method

.method public fa()LJ10;
    .locals 1

    iget-object v0, p0, LG10;->e:LJ10;

    return-object v0
.end method

.method public ha()LK10;
    .locals 1

    iget-object v0, p0, LG10;->d:LK10;

    return-object v0
.end method

.method public ia()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LG10;->o:Ljava/lang/String;

    return-object v0
.end method

.method public la()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LG10;->p:Ljava/lang/String;

    return-object v0
.end method

.method public ma()Z
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result v0

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    const/16 v0, 0x34af

    if-eq p1, v0, :cond_3

    const/16 v0, 0x34b0

    if-eq p1, v0, :cond_2

    const/16 v0, 0x351c

    if-eq p1, v0, :cond_1

    const/16 v0, 0x351d

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-static {p0, p2, p3}, LyD1;->a(LG10;ILandroid/content/Intent;)V

    goto :goto_0

    :pswitch_1
    invoke-static {p0, p2, p3}, LBu6;->a(LG10;ILandroid/content/Intent;)V

    goto :goto_0

    :pswitch_2
    invoke-static {p0, p2, p3}, LfL3;->m(LG10;ILandroid/content/Intent;)V

    goto :goto_0

    :cond_0
    invoke-static {p0, p2, p3}, LsL3;->a(LG10;ILandroid/content/Intent;)V

    goto :goto_0

    :cond_1
    invoke-static {p0, p2, p3}, Ljv2;->b(LG10;ILandroid/content/Intent;)V

    goto :goto_0

    :cond_2
    invoke-static {p0, p2, p3}, Lxo6;->c(LG10;ILandroid/content/Intent;)V

    goto :goto_0

    :cond_3
    invoke-static {p0, p2, p3}, LP36;->d(LG10;ILandroid/content/Intent;)V

    :goto_0
    if-nez p2, :cond_4

    invoke-virtual {p0, p1}, LG10;->Aa(I)V

    :cond_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3517
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onAttach(Landroid/app/Activity;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, LG10;->m:Z

    iget-object v0, p0, LG10;->C:Landroid/content/Context;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LG10;->C:Landroid/content/Context;

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, LG10;->C:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "_"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".braintree"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LG10;->q:Ljava/lang/String;

    return-void
.end method

.method public onAttach(Landroid/content/Context;)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    invoke-super {p0, p1}, LT20;->onAttach(Landroid/content/Context;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p0, p1}, LG10;->onAttach(Landroid/app/Activity;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, LT20;->onCreate(Landroid/os/Bundle;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->setRetainInstance(Z)V

    const/4 v0, 0x0

    iput-boolean v0, p0, LG10;->m:Z

    invoke-static {p0}, LSD0;->a(LG10;)LSD0;

    move-result-object v0

    iput-object v0, p0, LG10;->g:LSD0;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "com.braintreepayments.api.EXTRA_SESSION_ID"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LG10;->p:Ljava/lang/String;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "com.braintreepayments.api.EXTRA_INTEGRATION_TYPE"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LG10;->o:Ljava/lang/String;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "com.braintreepayments.api.EXTRA_AUTHORIZATION_TOKEN"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/braintreepayments/api/models/Authorization;

    iput-object v0, p0, LG10;->h:Lcom/braintreepayments/api/models/Authorization;

    invoke-virtual {p0}, LG10;->T9()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lfa;->b(Landroid/content/Context;)Lfa;

    move-result-object v0

    iput-object v0, p0, LG10;->r:Lfa;

    iget-object v0, p0, LG10;->d:LK10;

    if-nez v0, :cond_0

    new-instance v0, LK10;

    iget-object v1, p0, LG10;->h:Lcom/braintreepayments/api/models/Authorization;

    invoke-direct {v0, v1}, LK10;-><init>(Lcom/braintreepayments/api/models/Authorization;)V

    iput-object v0, p0, LG10;->d:LK10;

    :cond_0
    if-eqz p1, :cond_2

    const-string v0, "com.braintreepayments.api.EXTRA_CACHED_PAYMENT_METHOD_NONCES"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, LG10;->k:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    const-string v0, "com.braintreepayments.api.EXTRA_FETCHED_PAYMENT_METHOD_NONCES"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, LG10;->l:Z

    :try_start_0
    const-string v0, "com.braintreepayments.api.EXTRA_CONFIGURATION"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lex0;->a(Ljava/lang/String;)Lex0;

    move-result-object p1

    invoke-virtual {p0, p1}, LG10;->Ga(Lex0;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    iget-object p1, p0, LG10;->h:Lcom/braintreepayments/api/models/Authorization;

    instance-of p1, p1, Lcom/braintreepayments/api/models/TokenizationKey;

    if-eqz p1, :cond_3

    const-string p1, "started.client-key"

    invoke-virtual {p0, p1}, LG10;->Ea(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    const-string p1, "started.client-token"

    invoke-virtual {p0, p1}, LG10;->Ea(Ljava/lang/String;)V

    :catch_0
    :goto_0
    invoke-virtual {p0}, LG10;->J9()V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    iget-object v0, p0, LG10;->g:LSD0;

    invoke-virtual {v0}, LSD0;->b()V

    return-void
.end method

.method public onDetach()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDetach()V

    iget-object v0, p0, LG10;->f:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    const/4 v0, 0x0

    iput-object v0, p0, LG10;->f:Lcom/google/android/gms/common/api/GoogleApiClient;

    :cond_0
    return-void
.end method

.method public onPause()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    instance-of v0, v0, LL10;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    check-cast v0, LL10;

    invoke-virtual {p0, v0}, LG10;->Da(LL10;)V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, LT20;->onResume()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    instance-of v0, v0, LL10;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    check-cast v0, LL10;

    invoke-virtual {p0, v0}, LG10;->I9(LL10;)V

    iget-boolean v0, p0, LG10;->m:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LG10;->ea()Lex0;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, LG10;->m:Z

    invoke-virtual {p0}, LG10;->Ba()V

    :cond_0
    invoke-virtual {p0}, LG10;->S9()V

    iget-object v0, p0, LG10;->f:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LG10;->f:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnecting()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LG10;->f:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    :cond_1
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    iget-object v0, p0, LG10;->k:Ljava/util/List;

    check-cast v0, Ljava/util/ArrayList;

    const-string v1, "com.braintreepayments.api.EXTRA_CACHED_PAYMENT_METHOD_NONCES"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    const-string v0, "com.braintreepayments.api.EXTRA_FETCHED_PAYMENT_METHOD_NONCES"

    iget-boolean v1, p0, LG10;->l:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v0, p0, LG10;->i:Lex0;

    if-eqz v0, :cond_0

    const-string v1, "com.braintreepayments.api.EXTRA_CONFIGURATION"

    invoke-virtual {v0}, Lex0;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onStop()V

    iget-object v0, p0, LG10;->f:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    :cond_0
    invoke-virtual {p0}, LG10;->P9()V

    return-void
.end method

.method public startActivityForResult(Landroid/content/Intent;I)V
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Lcom/braintreepayments/api/exceptions/BraintreeException;

    const-string p2, "BraintreeFragment is not attached to an Activity. Please ensure it is attached and try again."

    invoke-direct {p1, p2}, Lcom/braintreepayments/api/exceptions/BraintreeException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LG10;->ya(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    :goto_0
    return-void
.end method

.method public va(Lcom/braintreepayments/api/models/PaymentMethodNonce;)V
    .locals 2

    iget-object v0, p0, LG10;->k:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    new-instance v0, LG10$h;

    invoke-direct {v0, p0, p1}, LG10$h;-><init>(LG10;Lcom/braintreepayments/api/models/PaymentMethodNonce;)V

    invoke-virtual {p0, v0}, LG10;->Ca(Lgd4;)V

    return-void
.end method

.method public ya(Ljava/lang/Exception;)V
    .locals 1

    new-instance v0, LG10$a;

    invoke-direct {v0, p0, p1}, LG10$a;-><init>(LG10;Ljava/lang/Exception;)V

    invoke-virtual {p0, v0}, LG10;->Ca(Lgd4;)V

    return-void
.end method
