.class public final synthetic LKu1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/fragment/app/FragmentManager$n;


# instance fields
.field public final synthetic a:LLu1;

.field public final synthetic b:Lio/reactivex/y;


# direct methods
.method public synthetic constructor <init>(LLu1;Lio/reactivex/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKu1;->a:LLu1;

    iput-object p2, p0, LKu1;->b:Lio/reactivex/y;

    return-void
.end method


# virtual methods
.method public final onBackStackChanged()V
    .locals 2

    iget-object v0, p0, LKu1;->a:LLu1;

    iget-object v1, p0, LKu1;->b:Lio/reactivex/y;

    invoke-static {v0, v1}, LLu1$a;->a(LLu1;Lio/reactivex/y;)V

    return-void
.end method
