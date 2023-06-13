.class public final synthetic LJ55;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LB55;

.field public final synthetic c:LB55$k;


# direct methods
.method public synthetic constructor <init>(LB55;LB55$k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ55;->b:LB55;

    iput-object p2, p0, LJ55;->c:LB55$k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LJ55;->b:LB55;

    iget-object v1, p0, LJ55;->c:LB55$k;

    invoke-static {v0, v1}, LB55$k$a;->a(LB55;LB55$k;)V

    return-void
.end method
