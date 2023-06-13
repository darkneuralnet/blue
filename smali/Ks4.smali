.class public final synthetic LKs4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LHs4$i;

.field public final synthetic c:Lvp6;


# direct methods
.method public synthetic constructor <init>(LHs4$i;Lvp6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKs4;->b:LHs4$i;

    iput-object p2, p0, LKs4;->c:Lvp6;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LKs4;->b:LHs4$i;

    iget-object v1, p0, LKs4;->c:Lvp6;

    invoke-static {v0, v1}, LHs4$i;->a(LHs4$i;Lvp6;)V

    return-void
.end method
