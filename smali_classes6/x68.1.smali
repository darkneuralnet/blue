.class public final Lx68;
.super LTe7;
.source "SourceFile"


# instance fields
.field public final synthetic b:LDe8;


# direct methods
.method public constructor <init>(LDe8;)V
    .locals 0

    iput-object p1, p0, Lx68;->b:LDe8;

    invoke-direct {p0}, LTe7;-><init>()V

    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    if-ge p2, v0, :cond_0

    sget p2, LZG8;->c:I

    invoke-virtual {p1}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    const-string p2, "com.google.android.libraries.intelligence.acceleration.process.report_fragment_tag"

    invoke-virtual {p1, p2}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object p1

    check-cast p1, LZG8;

    iget-object p2, p0, Lx68;->b:LDe8;

    iget-object p2, p2, LDe8;->i:LeQ7;

    invoke-virtual {p1, p2}, LZG8;->b(LeQ7;)V

    :cond_0
    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    iget-object p1, p0, Lx68;->b:LDe8;

    invoke-virtual {p1}, LDe8;->b()V

    return-void
.end method

.method public final onActivityPreCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    new-instance p2, LmY7;

    invoke-direct {p2, p0}, LmY7;-><init>(Lx68;)V

    invoke-static {p1, p2}, LN64;->a(Landroid/app/Activity;Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    iget-object p1, p0, Lx68;->b:LDe8;

    invoke-virtual {p1}, LDe8;->e()V

    return-void
.end method
