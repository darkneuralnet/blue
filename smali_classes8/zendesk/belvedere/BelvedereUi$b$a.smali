.class public Lzendesk/belvedere/BelvedereUi$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzendesk/belvedere/j$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/belvedere/BelvedereUi$b;->f(Landroidx/appcompat/app/AppCompatActivity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lzendesk/belvedere/b;

.field public final synthetic b:Lzendesk/belvedere/BelvedereUi$b;


# direct methods
.method public constructor <init>(Lzendesk/belvedere/BelvedereUi$b;Lzendesk/belvedere/b;)V
    .locals 0

    iput-object p1, p0, Lzendesk/belvedere/BelvedereUi$b$a;->b:Lzendesk/belvedere/BelvedereUi$b;

    iput-object p2, p0, Lzendesk/belvedere/BelvedereUi$b$a;->a:Lzendesk/belvedere/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lzendesk/belvedere/MediaIntent;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/belvedere/BelvedereUi$b$a;->a:Lzendesk/belvedere/b;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    new-instance v2, Lzendesk/belvedere/BelvedereUi$b$a$a;

    invoke-direct {v2, p0, p1, v0, v1}, Lzendesk/belvedere/BelvedereUi$b$a$a;-><init>(Lzendesk/belvedere/BelvedereUi$b$a;Ljava/util/List;Landroid/app/Activity;Landroid/view/ViewGroup;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public b()V
    .locals 8

    iget-object v0, p0, Lzendesk/belvedere/BelvedereUi$b$a;->a:Lzendesk/belvedere/b;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Landroid/view/ViewGroup;

    sget v1, Lkl4;->belvedere_permissions_rationale:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-wide/16 v4, 0x1388

    sget v1, Lkl4;->belvedere_navigate_to_settings:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lzendesk/belvedere/BelvedereUi$b$a$b;

    invoke-direct {v7, p0, v0}, Lzendesk/belvedere/BelvedereUi$b$a$b;-><init>(Lzendesk/belvedere/BelvedereUi$b$a;Landroid/app/Activity;)V

    invoke-static/range {v2 .. v7}, LEi6;->e(Landroid/view/View;Ljava/lang/String;JLjava/lang/CharSequence;Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method
