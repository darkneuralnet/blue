.class public final LgH0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LyZ$a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LgH0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LhH0;)V
    .locals 0

    invoke-direct {p0}, LgH0$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/uber/autodispose/ScopeProvider;Lio/reactivex/subjects/g;Landroid/content/DialogInterface;)LyZ$a;
    .locals 8
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
            ")",
            "LyZ$a;"
        }
    .end annotation

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p5}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, LgH0$a;

    const/4 v6, 0x0

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, LgH0$a;-><init>(Landroid/app/Activity;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/uber/autodispose/ScopeProvider;Lio/reactivex/subjects/g;Landroid/content/DialogInterface;LfH0;)V

    return-object v7
.end method
