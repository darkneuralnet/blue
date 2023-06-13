.class public final LmY7;
.super LTe7;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lx68;


# direct methods
.method public constructor <init>(Lx68;)V
    .locals 0

    iput-object p1, p0, LmY7;->b:Lx68;

    invoke-direct {p0}, LTe7;-><init>()V

    return-void
.end method


# virtual methods
.method public final onActivityPostResumed(Landroid/app/Activity;)V
    .locals 0

    iget-object p1, p0, LmY7;->b:Lx68;

    iget-object p1, p1, Lx68;->b:LDe8;

    invoke-virtual {p1}, LDe8;->c()V

    return-void
.end method

.method public final onActivityPostStarted(Landroid/app/Activity;)V
    .locals 0

    iget-object p1, p0, LmY7;->b:Lx68;

    iget-object p1, p1, Lx68;->b:LDe8;

    invoke-virtual {p1}, LDe8;->d()V

    return-void
.end method
