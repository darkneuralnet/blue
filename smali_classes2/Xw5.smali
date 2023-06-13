.class public final synthetic LXw5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LVw5;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LVw5;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXw5;->b:LVw5;

    iput-object p2, p0, LXw5;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LXw5;->b:LVw5;

    iget-object v1, p0, LXw5;->c:Ljava/lang/String;

    invoke-static {v0, v1}, LVw5$E;->a(LVw5;Ljava/lang/String;)V

    return-void
.end method
