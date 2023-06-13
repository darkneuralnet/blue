.class public final synthetic LKN8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgm9;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:LV39;


# direct methods
.method public synthetic constructor <init>(ZLV39;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LKN8;->a:Z

    iput-object p2, p0, LKN8;->b:LV39;

    return-void
.end method


# virtual methods
.method public final zza()Lxk9;
    .locals 3

    iget-boolean v0, p0, LKN8;->a:Z

    iget-object v1, p0, LKN8;->b:LV39;

    new-instance v2, Lm49;

    invoke-direct {v2}, Lm49;-><init>()V

    if-eqz v0, :cond_0

    sget-object v0, LM39;->e:LM39;

    goto :goto_0

    :cond_0
    sget-object v0, LM39;->d:LM39;

    :goto_0
    invoke-virtual {v2, v0}, Lm49;->e(LM39;)Lm49;

    new-instance v0, LTd9;

    invoke-direct {v0}, LTd9;-><init>()V

    invoke-virtual {v0, v1}, LTd9;->b(LV39;)LTd9;

    invoke-virtual {v0}, LTd9;->c()Lje9;

    move-result-object v0

    invoke-virtual {v2, v0}, Lm49;->g(Lje9;)Lm49;

    invoke-static {v2}, LDm9;->d(Lm49;)Lxk9;

    move-result-object v0

    return-object v0
.end method
