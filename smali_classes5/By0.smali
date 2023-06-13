.class public final LBy0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LBy0$b;
    }
.end annotation


# instance fields
.field public a:Landroid/net/NetworkInfo$State;

.field public b:Landroid/net/NetworkInfo$DetailedState;

.field public c:I

.field public d:I

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LBy0;->a()LBy0$b;

    move-result-object v0

    invoke-direct {p0, v0}, LBy0;-><init>(LBy0$b;)V

    return-void
.end method

.method public constructor <init>(LBy0$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LBy0$b;->a(LBy0$b;)Landroid/net/NetworkInfo$State;

    move-result-object v0

    iput-object v0, p0, LBy0;->a:Landroid/net/NetworkInfo$State;

    invoke-static {p1}, LBy0$b;->b(LBy0$b;)Landroid/net/NetworkInfo$DetailedState;

    move-result-object v0

    iput-object v0, p0, LBy0;->b:Landroid/net/NetworkInfo$DetailedState;

    invoke-static {p1}, LBy0$b;->d(LBy0$b;)I

    move-result v0

    iput v0, p0, LBy0;->c:I

    invoke-static {p1}, LBy0$b;->e(LBy0$b;)I

    move-result v0

    iput v0, p0, LBy0;->d:I

    invoke-static {p1}, LBy0$b;->f(LBy0$b;)Z

    move-result v0

    iput-boolean v0, p0, LBy0;->e:Z

    invoke-static {p1}, LBy0$b;->g(LBy0$b;)Z

    move-result v0

    iput-boolean v0, p0, LBy0;->f:Z

    invoke-static {p1}, LBy0$b;->h(LBy0$b;)Z

    move-result v0

    iput-boolean v0, p0, LBy0;->g:Z

    invoke-static {p1}, LBy0$b;->i(LBy0$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LBy0;->h:Ljava/lang/String;

    invoke-static {p1}, LBy0$b;->j(LBy0$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LBy0;->i:Ljava/lang/String;

    invoke-static {p1}, LBy0$b;->k(LBy0$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LBy0;->j:Ljava/lang/String;

    invoke-static {p1}, LBy0$b;->c(LBy0$b;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LBy0;->k:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(LBy0$b;LBy0$a;)V
    .locals 0

    invoke-direct {p0, p1}, LBy0;-><init>(LBy0$b;)V

    return-void
.end method

.method public static a()LBy0$b;
    .locals 1

    new-instance v0, LBy0$b;

    invoke-direct {v0}, LBy0$b;-><init>()V

    return-object v0
.end method

.method public static b()LBy0;
    .locals 1

    invoke-static {}, LBy0;->a()LBy0$b;

    move-result-object v0

    invoke-virtual {v0}, LBy0$b;->m()LBy0;

    move-result-object v0

    return-object v0
.end method

.method public static c(Landroid/content/Context;)LBy0;
    .locals 1

    const-string v0, "context == null"

    invoke-static {p0, v0}, LBZ3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LBy0;->g(Landroid/content/Context;)Landroid/net/ConnectivityManager;

    move-result-object v0

    invoke-static {p0, v0}, LBy0;->d(Landroid/content/Context;Landroid/net/ConnectivityManager;)LBy0;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/content/Context;Landroid/net/ConnectivityManager;)LBy0;
    .locals 1

    const-string v0, "context == null"

    invoke-static {p0, v0}, LBZ3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    invoke-static {}, LBy0;->b()LBy0;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object p0

    if-nez p0, :cond_1

    invoke-static {}, LBy0;->b()LBy0;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-static {p0}, LBy0;->e(Landroid/net/NetworkInfo;)LBy0;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static e(Landroid/net/NetworkInfo;)LBy0;
    .locals 2

    new-instance v0, LBy0$b;

    invoke-direct {v0}, LBy0$b;-><init>()V

    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    move-result-object v1

    invoke-virtual {v0, v1}, LBy0$b;->s(Landroid/net/NetworkInfo$State;)LBy0$b;

    move-result-object v0

    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getDetailedState()Landroid/net/NetworkInfo$DetailedState;

    move-result-object v1

    invoke-virtual {v0, v1}, LBy0$b;->n(Landroid/net/NetworkInfo$DetailedState;)LBy0$b;

    move-result-object v0

    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getType()I

    move-result v1

    invoke-virtual {v0, v1}, LBy0$b;->v(I)LBy0$b;

    move-result-object v0

    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getSubtype()I

    move-result v1

    invoke-virtual {v0, v1}, LBy0$b;->t(I)LBy0$b;

    move-result-object v0

    invoke-virtual {p0}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v1

    invoke-virtual {v0, v1}, LBy0$b;->l(Z)LBy0$b;

    move-result-object v0

    invoke-virtual {p0}, Landroid/net/NetworkInfo;->isFailover()Z

    move-result v1

    invoke-virtual {v0, v1}, LBy0$b;->p(Z)LBy0$b;

    move-result-object v0

    invoke-virtual {p0}, Landroid/net/NetworkInfo;->isRoaming()Z

    move-result v1

    invoke-virtual {v0, v1}, LBy0$b;->r(Z)LBy0$b;

    move-result-object v0

    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LBy0$b;->w(Ljava/lang/String;)LBy0$b;

    move-result-object v0

    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getSubtypeName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LBy0$b;->u(Ljava/lang/String;)LBy0$b;

    move-result-object v0

    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getReason()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LBy0$b;->q(Ljava/lang/String;)LBy0$b;

    move-result-object v0

    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, LBy0$b;->o(Ljava/lang/String;)LBy0$b;

    move-result-object p0

    invoke-virtual {p0}, LBy0$b;->m()LBy0;

    move-result-object p0

    return-object p0
.end method

.method public static g(Landroid/content/Context;)Landroid/net/ConnectivityManager;
    .locals 1

    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/net/ConnectivityManager;

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_10

    const-class v2, LBy0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_3

    :cond_1
    check-cast p1, LBy0;

    iget v2, p0, LBy0;->c:I

    iget v3, p1, LBy0;->c:I

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget v2, p0, LBy0;->d:I

    iget v3, p1, LBy0;->d:I

    if-eq v2, v3, :cond_3

    return v1

    :cond_3
    iget-boolean v2, p0, LBy0;->e:Z

    iget-boolean v3, p1, LBy0;->e:Z

    if-eq v2, v3, :cond_4

    return v1

    :cond_4
    iget-boolean v2, p0, LBy0;->f:Z

    iget-boolean v3, p1, LBy0;->f:Z

    if-eq v2, v3, :cond_5

    return v1

    :cond_5
    iget-boolean v2, p0, LBy0;->g:Z

    iget-boolean v3, p1, LBy0;->g:Z

    if-eq v2, v3, :cond_6

    return v1

    :cond_6
    iget-object v2, p0, LBy0;->a:Landroid/net/NetworkInfo$State;

    iget-object v3, p1, LBy0;->a:Landroid/net/NetworkInfo$State;

    if-eq v2, v3, :cond_7

    return v1

    :cond_7
    iget-object v2, p0, LBy0;->b:Landroid/net/NetworkInfo$DetailedState;

    iget-object v3, p1, LBy0;->b:Landroid/net/NetworkInfo$DetailedState;

    if-eq v2, v3, :cond_8

    return v1

    :cond_8
    iget-object v2, p0, LBy0;->h:Ljava/lang/String;

    iget-object v3, p1, LBy0;->h:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    return v1

    :cond_9
    iget-object v2, p0, LBy0;->i:Ljava/lang/String;

    if-eqz v2, :cond_a

    iget-object v3, p1, LBy0;->i:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    goto :goto_0

    :cond_a
    iget-object v2, p1, LBy0;->i:Ljava/lang/String;

    if-eqz v2, :cond_b

    :goto_0
    return v1

    :cond_b
    iget-object v2, p0, LBy0;->j:Ljava/lang/String;

    if-eqz v2, :cond_c

    iget-object v3, p1, LBy0;->j:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    goto :goto_1

    :cond_c
    iget-object v2, p1, LBy0;->j:Ljava/lang/String;

    if-eqz v2, :cond_d

    :goto_1
    return v1

    :cond_d
    iget-object v2, p0, LBy0;->k:Ljava/lang/String;

    iget-object p1, p1, LBy0;->k:Ljava/lang/String;

    if-eqz v2, :cond_e

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_2

    :cond_e
    if-nez p1, :cond_f

    goto :goto_2

    :cond_f
    move v0, v1

    :goto_2
    return v0

    :cond_10
    :goto_3
    return v1
.end method

.method public f()Landroid/net/NetworkInfo$DetailedState;
    .locals 1

    iget-object v0, p0, LBy0;->b:Landroid/net/NetworkInfo$DetailedState;

    return-object v0
.end method

.method public h()Landroid/net/NetworkInfo$State;
    .locals 1

    iget-object v0, p0, LBy0;->a:Landroid/net/NetworkInfo$State;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LBy0;->a:Landroid/net/NetworkInfo$State;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LBy0;->b:Landroid/net/NetworkInfo$DetailedState;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LBy0;->c:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LBy0;->d:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, LBy0;->e:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, LBy0;->f:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, LBy0;->g:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LBy0;->h:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LBy0;->i:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LBy0;->j:Ljava/lang/String;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LBy0;->k:Ljava/lang/String;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :cond_3
    add-int/2addr v0, v2

    return v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LBy0;->i:Ljava/lang/String;

    return-object v0
.end method

.method public j()I
    .locals 1

    iget v0, p0, LBy0;->c:I

    return v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LBy0;->h:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Connectivity{state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LBy0;->a:Landroid/net/NetworkInfo$State;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", detailedState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LBy0;->b:Landroid/net/NetworkInfo$DetailedState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LBy0;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", subType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LBy0;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", available="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LBy0;->e:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", failover="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LBy0;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", roaming="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LBy0;->g:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", typeName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LBy0;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", subTypeName=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LBy0;->i:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", reason=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LBy0;->j:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", extraInfo=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LBy0;->k:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
