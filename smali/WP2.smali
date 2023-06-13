.class public final synthetic LWP2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/i;


# instance fields
.field public final synthetic b:LYP2;

.field public final synthetic c:LvQ2;


# direct methods
.method public synthetic constructor <init>(LYP2;LvQ2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWP2;->b:LYP2;

    iput-object p2, p0, LWP2;->c:LvQ2;

    return-void
.end method


# virtual methods
.method public final onStateChanged(LLifecycleOwner;Landroidx/lifecycle/f$a;)V
    .locals 2

    iget-object v0, p0, LWP2;->b:LYP2;

    iget-object v1, p0, LWP2;->c:LvQ2;

    invoke-static {v0, v1, p1, p2}, LYP2;->b(LYP2;LvQ2;LLifecycleOwner;Landroidx/lifecycle/f$a;)V

    return-void
.end method
