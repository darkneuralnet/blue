.class public final LQt7;
.super LFa9;
.source "SourceFile"

# interfaces
.implements Lwg9;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LGu7;->v()LGu7;

    move-result-object v0

    invoke-direct {p0, v0}, LFa9;-><init>(Lub9;)V

    return-void
.end method

.method public synthetic constructor <init>(Lrl9;)V
    .locals 0

    invoke-static {}, LGu7;->v()LGu7;

    move-result-object p1

    invoke-direct {p0, p1}, LFa9;-><init>(Lub9;)V

    return-void
.end method


# virtual methods
.method public final p(Ljava/lang/String;)LQt7;
    .locals 1

    iget-boolean v0, p0, LFa9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LFa9;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LFa9;->d:Z

    :cond_0
    iget-object v0, p0, LFa9;->c:Lub9;

    check-cast v0, LGu7;

    invoke-static {v0, p1}, LGu7;->x(LGu7;Ljava/lang/String;)V

    return-object p0
.end method

.method public final t(Ljava/lang/String;)LQt7;
    .locals 1

    iget-boolean v0, p0, LFa9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LFa9;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LFa9;->d:Z

    :cond_0
    iget-object v0, p0, LFa9;->c:Lub9;

    check-cast v0, LGu7;

    invoke-static {v0, p1}, LGu7;->w(LGu7;Ljava/lang/String;)V

    return-object p0
.end method
