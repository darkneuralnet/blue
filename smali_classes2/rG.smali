.class public final synthetic LrG;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LpG;


# direct methods
.method public synthetic constructor <init>(LpG;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LrG;->b:LpG;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LrG;->b:LpG;

    invoke-static {v0}, LpG$b;->a(LpG;)V

    return-void
.end method
