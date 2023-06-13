.class public final synthetic LQ84;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;


# instance fields
.field public final synthetic b:Lio/reactivex/y;


# direct methods
.method public synthetic constructor <init>(Lio/reactivex/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ84;->b:Lio/reactivex/y;

    return-void
.end method


# virtual methods
.method public final onRefresh()V
    .locals 1

    iget-object v0, p0, LQ84;->b:Lio/reactivex/y;

    invoke-static {v0}, LP84$c;->a(Lio/reactivex/y;)V

    return-void
.end method
