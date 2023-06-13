.class public final LgH0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LyZ$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LgH0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lio/reactivex/subjects/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/g<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Landroid/app/Activity;

.field public final c:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final d:Landroid/content/DialogInterface;

.field public final e:Lcom/uber/autodispose/ScopeProvider;

.field public final f:LgH0$a;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/uber/autodispose/ScopeProvider;Lio/reactivex/subjects/g;Landroid/content/DialogInterface;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Landroidx/constraintlayout/widget/ConstraintLayout;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Lio/reactivex/subjects/g<",
            "Lco/bird/android/model/DialogResponse;",
            ">;",
            "Landroid/content/DialogInterface;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LgH0$a;->f:LgH0$a;

    iput-object p4, p0, LgH0$a;->a:Lio/reactivex/subjects/g;

    iput-object p1, p0, LgH0$a;->b:Landroid/app/Activity;

    iput-object p2, p0, LgH0$a;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p5, p0, LgH0$a;->d:Landroid/content/DialogInterface;

    iput-object p3, p0, LgH0$a;->e:Lcom/uber/autodispose/ScopeProvider;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Activity;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/uber/autodispose/ScopeProvider;Lio/reactivex/subjects/g;Landroid/content/DialogInterface;LfH0;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, LgH0$a;-><init>(Landroid/app/Activity;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/uber/autodispose/ScopeProvider;Lio/reactivex/subjects/g;Landroid/content/DialogInterface;)V

    return-void
.end method


# virtual methods
.method public a(LyZ;)V
    .locals 0

    invoke-virtual {p0, p1}, LgH0$a;->d(LyZ;)LyZ;

    return-void
.end method

.method public final b()LEZ;
    .locals 4

    new-instance v0, LEZ;

    iget-object v1, p0, LgH0$a;->a:Lio/reactivex/subjects/g;

    invoke-virtual {p0}, LgH0$a;->c()LFZ;

    move-result-object v2

    iget-object v3, p0, LgH0$a;->e:Lcom/uber/autodispose/ScopeProvider;

    invoke-direct {v0, v1, v2, v3}, LEZ;-><init>(Lio/reactivex/subjects/g;LFZ;Lcom/uber/autodispose/ScopeProvider;)V

    return-object v0
.end method

.method public final c()LFZ;
    .locals 4

    new-instance v0, LFZ;

    iget-object v1, p0, LgH0$a;->b:Landroid/app/Activity;

    iget-object v2, p0, LgH0$a;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    iget-object v3, p0, LgH0$a;->d:Landroid/content/DialogInterface;

    invoke-direct {v0, v1, v2, v3}, LFZ;-><init>(Landroid/app/Activity;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/content/DialogInterface;)V

    return-object v0
.end method

.method public final d(LyZ;)LyZ;
    .locals 1

    invoke-virtual {p0}, LgH0$a;->b()LEZ;

    move-result-object v0

    invoke-static {p1, v0}, LzZ;->b(LyZ;LEZ;)V

    return-object p1
.end method
