.class public final synthetic LFA;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LHA;

.field public final synthetic c:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public synthetic constructor <init>(LHA;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFA;->b:LHA;

    iput-object p2, p0, LFA;->c:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LFA;->b:LHA;

    iget-object v1, p0, LFA;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0, v1}, LHA;->Rl(LHA;Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method
